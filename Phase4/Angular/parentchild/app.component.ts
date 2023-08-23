import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FirstAngularApp';
  productList: Array<any>=[
    {pname: "rice", price:200},
    {pname:"sugar", price:50}
  ];
  public clickCount:number=0;
  onCountChanged(count:number):void{
    this.clickCount=count;
  }
}
