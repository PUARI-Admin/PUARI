import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApplicationdetailComponent } from './applicationdetail/applicationdetail.component';
import { ApplicationlistComponent } from './applicationlist/applicationlist.component';
import { HomeComponent } from './home.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    children: [
      {
        path: 'applicationlist',
        component: ApplicationlistComponent
      },
      {
        path: 'applicationlist/details/:id',
        component: ApplicationdetailComponent
      }
    ]
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
