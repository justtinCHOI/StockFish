package com.stockfish.stockfishserver.member.dto;

import lombok.Data;

@Data
public class MemberModifyDTO {

  private long memberId;

  private String name;

  private String email;

  private String password;

}