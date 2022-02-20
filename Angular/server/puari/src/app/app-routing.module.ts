import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ApplicationaprovalComponent } from './applicationaproval/applicationaproval.component';
import { ApplicationlistComponent } from './applicationlist/applicationlist.component';
import { FinishComponent } from './finish/finish.component';
import { LoginComponent } from './login/login.component';
import { UserregisterComponent } from './userregister/userregister.component'
import { ApplicationconfirmComponent } from './applicationconfirm/applicationconfirm.component'

const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'applist', component: ApplicationlistComponent },
  { path: 'details/:id', component: ApplicationaprovalComponent },
  { path: 'reject', component: FinishComponent },
  { path: 'approve', component: FinishComponent },
  { path: 'login', component: LoginComponent },
  { path: 'userregister', component: UserregisterComponent },
  { path: 'confirm', component: ApplicationconfirmComponent },  
]
  ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
