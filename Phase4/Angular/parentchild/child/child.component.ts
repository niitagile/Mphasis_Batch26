import { Component, OnInit,Input,Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit{
ngOnInit(): void {
  
}

@Input() product:Array<any>=[];
//count change on @Output

public clickCount:number=0;
@Output() onChanged=new EventEmitter<number>();

countChange(count: number){
  count++;
  this.clickCount=count;
  this.onChanged.emit(this.clickCount);
}
}
