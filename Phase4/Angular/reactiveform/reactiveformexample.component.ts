import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup,Validators} from '@angular/forms';
@Component({
  selector: 'app-reactiveformexample',
  templateUrl: './reactiveformexample.component.html',
  styleUrls: ['./reactiveformexample.component.css']
})
export class ReactiveformexampleComponent implements OnInit {
ngOnInit(): void {
  this.registrationForm=this.formBuilder.group({
    firstName:['',Validators.required],
    lastName:['',Validators.required],
    email:['',[Validators.required,Validators.email]],
    password: ['',[Validators.required,Validators.minLength(6)]]

  });
}
get f(){return this.registrationForm.controls;}
constructor(private formBuilder: FormBuilder){}
onSubmit(){
  this.submitted=true;
  if(this.registrationForm.invalid)
    return;
  alert("Your request has been submitted for approval");
}

submitted=false;
registrationForm: FormGroup=new FormGroup({});
}
