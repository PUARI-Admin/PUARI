import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ApplicationaprovalComponent } from './applicationaproval/applicationaproval.component';

import { ApplicationlistComponent } from './applicationlist/applicationlist.component';
import { FinishComponent } from './finish/finish.component';

const routes: Routes = [
  {path: 'applist', component: ApplicationlistComponent},
  {path: 'details/:id', component: ApplicationaprovalComponent},
  {path: 'reject', component: FinishComponent},
  {path: 'approve', component: FinishComponent},
]
  ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
