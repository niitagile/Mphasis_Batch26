import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path :'home' , component:HomeComponent },
      {path : 'login', component: LoginComponent},
      {path : 'profile', component: ProfileComponent}
    ]),
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
