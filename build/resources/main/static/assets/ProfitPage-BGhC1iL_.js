import{U as x,r as l,g as c,j as e}from"./index-BKtiLFc2.js";import{P as d}from"./PageComponent-Dh9dI06q.js";const f={dtoList:[],pageNumList:[],pageRequestDTO:null,prev:!1,next:!1,totalCount:0,prevPage:0,nextPage:0,totalPage:0,current:0};function u(){const{page:s,size:a,refresh:o,moveToList:n,moveToRead:i}=x(),[r,m]=l.useState(f);return l.useEffect(()=>{c({page:s,size:a}).then(t=>{console.log(t),m(t)})},[s,a,o]),e.jsxs("div",{className:"border-2 border-blue-100 mt-10 mr-2 ml-2",children:[e.jsx("div",{className:"flex flex-wrap mx-auto justify-center p-6",children:r.dtoList.map(t=>e.jsx("div",{className:"w-full min-w-[400px] p-2 m-2 rounded shadow-md",onClick:()=>i(t.tno),children:e.jsxs("div",{className:"flex ",children:[e.jsxs("div",{className:"font-extrabold text-2xl p-2 w-1/12",children:[" ",t.tno," "]}),e.jsx("div",{className:"text-1xl m-1 p-2 w-8/12 font-extrabold",children:t.title}),e.jsxs("div",{className:"text-1xl m-1 p-2 w-2/10 font-medium",children:[" ",t.dueDate," "]})]})},t.tno))}),e.jsx(d,{serverData:r,movePage:n})]})}function g(){return e.jsxs("div",{className:"p-4 w-full bg-white  ",children:[e.jsx("div",{className:"text-3xl font-extrabold",children:"Todo ProfitPage"}),e.jsx(u,{})]})}export{g as default};
