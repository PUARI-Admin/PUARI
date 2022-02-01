import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';

import { ApplicationlistComponent } from './applicationlist/applicationlist.component';

const routes: Routes = [
  // {path: '', component: }
  // {path: '/', component: AppComponent},
  {path: 'applist', component: ApplicationlistComponent},]
  ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
