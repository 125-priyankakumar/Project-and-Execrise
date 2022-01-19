import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

  class GradeCalculator extends React.Component
  {
    constructor()
    {
      super();
      this.handler = this.handler.bind(this);
      this.state={
        x:"",
        y:"",
        z:"",
        grade:"",
      }
    }
    handler()
    {
      var grade;
      var x= document.getElementById("x").value;
      var y=document.getElementById("y").value;
      var z=document.getElementById("z").value;
      x=parseInt(x);
      y=parseInt(y);
      z=parseInt(z);
      var result=((x+y+z)/3);
     if(result>=90 && result<=100)
     {
       grade="A";
     }else if(result>=80 && result<90)
     {
       grade = "B";
     }else if(result>=70 && result<80)
     {
       grade="c"
     }else{
       grade="Fail"
     }
     this.setState(({
        x:x,
        y:y,
        grade:grade,
     }));
     console.log(grade);
     console.log(result);
    }  
  
    render()
    {
      return(
      <>
     <table>
       <tr>
     <h1>Grade is the {this.state.grade} </h1>
     </tr>
     <tr>Enter Mark 1 = <input  id="x" type="text" defaultValue={this.state.x}/></tr>
     <tr>Enter Mark 2 = <input  id="y" type="text" defaultValue={this.state.y}/></tr>
     <tr>Enter Mark 3 = <input  id="z" type="text" defaultValue={this.state.z}/></tr>
     </table>
     <button id="Calculate" onClick={this.handler}>Check the Grade</button>
      </>
      );
    }
  }
  
  ReactDOM.render(
    <GradeCalculator />,
    document.getElementById("root")
  );