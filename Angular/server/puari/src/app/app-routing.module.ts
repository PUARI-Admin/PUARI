import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ApplicationlistComponent } from './applicationlist/applicationlist.component';
const routes: Routes = [
  // {path: '', component: }
  {path: 'applist', component: ApplicationlistComponent},]
  ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
