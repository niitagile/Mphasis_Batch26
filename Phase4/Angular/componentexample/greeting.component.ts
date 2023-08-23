import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {
  ngOnInit(): void {
    
  }
  name:string="Mahesh";
  constructor(){}
  greet():void{
    alert("Hello Everyone. I am "+this.name);
  }
productList: Array<any>=[
  {pname: "rice", price:200},
  {pname:"sugar", price:50}
];
show:boolean=true;
}
