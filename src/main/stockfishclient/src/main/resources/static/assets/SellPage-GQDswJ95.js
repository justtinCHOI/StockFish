import{P as m,r as i,U as x,s as u,j as e,n as p}from"./index-DR66x2TL.js";const n={tno:0,title:"",writer:"",dueDate:"",complete:!1};function a({tno:t}){const[s,r]=i.useState(n),{moveToList:d,moveToModify:c}=x();return i.useEffect(()=>{u(t).then(l=>{r(l)}).catch(l=>{console.error("Failed to fetch myPage article:",l),r(n)})},[t]),e.jsxs("div",{className:"border-2 border-sky-200 mt-10 m-2 p-4",children:[o("Tno",s.tno),o("Writer",s.writer),o("Title",s.title),o("Status",s.complete?"Completed":"Not Yet"),e.jsx("div",{className:"flex justify-end p-4",children:e.jsx("button",{type:"button",className:"rounded p-4 m-2 text-xl w-32 text-white bg-blue-500",onClick:()=>d(),children:"List"})}),e.jsx("div",{className:"flex justify-end p-4",children:e.jsx("button",{type:"button",className:"rounded p-4 m-2 text-xl w-32 text-white bg-blue-500",onClick:()=>c(s.tno),children:"Modify"})})]})}const o=(t,s)=>e.jsx("div",{className:"flex justify-center",children:e.jsxs("div",{className:"relative mb-4 flex w-full flex-wrap items-stretch",children:[e.jsx("div",{className:"w-1/5 p-6 text-right font-bold",children:t}),e.jsx("div",{className:"w-4/5 p-6 rounded-r border border-solid shadow-md",children:s})]})});a.propTypes={tno:m.number.isRequired};function h(){const{tno:t}=p();return e.jsxs("div",{className:"p-4 w-full bg-white  ",children:[e.jsxs("div",{className:"text-3xl font-extrabold",children:["Todo SellPage ",t]}),e.jsx(a,{tno:t,t:!0})]})}export{h as default};
