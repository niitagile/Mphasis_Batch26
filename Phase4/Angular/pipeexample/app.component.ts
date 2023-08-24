import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pipeproject';
  name:string='samreen';
  toDate: Date=new Date();
  numDate=1590319189931;
  strDate="Sun May 24 2020 19:16:23";
  obj={"item" : "Tea","price" : 45}

  celcius : number=0;
  fahrenheit: number=0;
}
