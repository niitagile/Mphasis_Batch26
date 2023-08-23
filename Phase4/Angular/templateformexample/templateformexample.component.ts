import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-templateformexample',
  templateUrl: './templateformexample.component.html',
  styleUrls: ['./templateformexample.component.css']
})
export class TemplateformexampleComponent implements OnInit {
constructor(){}
ngOnInit(): void {
  
}
//Array of Objects of country class
countryList:country[]=[
  new country("1","India"),
  new country("2","USA"),
  new country("3","England")
];
onSubmit(contactForm: any){
  console.log(contactForm.value);
}
}
export class country{
  id: string;
  name: string;
  constructor(id:string, name:string){
    this.id=id;
    this.name=name;
  }
  
}
