package com.stockfish.stockfishserver.star.sevice;

import com.stockfish.stockfishserver.star.dto.StarResponseDto;
import com.stockfish.stockfishserver.star.entity.Star;
import com.stockfish.stockfishserver.star.repository.StarRepository;
import com.stockfish.stockfishserver.stock.service.CompanyService;
import com.stockfish.stockfishserver.member.entity.Member;
import com.stockfish.stockfishserver.stock.mapper.StockMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StarService {
    private final StarRepository starRepository;
    private final CompanyService companyService;
    private final StockMapper stockMapper;

    public StarService(StarRepository starRepository, CompanyService companyService, StockMapper stockMapper) {
        this.starRepository = starRepository;
        this.companyService = companyService;
        this.stockMapper = stockMapper;
    }

    //member + companyId -> 찜 생성, 저장
    public void saveStar(Member member, long companyId) {
        Star star = new Star();

        star.setMember(member);
        star.setCompany(companyService.findCompanyById(companyId));

        starRepository.save(star);
    }
    //member + companyId -> 찜 조회, 삭제
    public void deleteStar(Member member, long companyId) {
        Star star = starRepository.findByMember_MemberIdAndCompanyCompanyId(member.getMemberId(), companyId);

        starRepository.delete(star);
    }
    //회원의 모든 찜 DTO 반환
    public List<StarResponseDto> getStarResponseDtoList(Member member) {
        List<Star> stars = starRepository.findAllByMember_MemberId(member.getMemberId());
        List<StarResponseDto> starResponseDtos =  stockMapper.starsToStarResponseDtos(stars);
        return starResponseDtos;
    }
}
