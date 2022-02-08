import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';

import { LoginComponent } from './login/login.component';
import { UserregisterComponent } from './userregister/userregister.component'

const routes: Routes = [
  // {path: '', component: }
//  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component:LoginComponent}, 
  {path: 'userregister', component:UserregisterComponent},  
  ]
  ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
