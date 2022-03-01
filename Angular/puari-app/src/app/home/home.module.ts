import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';

import { MatSidenavModule } from '@angular/material/sidenav';
import { ApplicationlistComponent } from './applicationlist/applicationlist.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card';
import { MatDividerModule } from '@angular/material/divider';
import { MatButtonModule } from '@angular/material/button';

import { AppCategoryPipe } from '../shared/app-category.pipe';
import { ApplicationdetailComponent } from './applicationdetail/applicationdetail.component';
import { MatListModule } from '@angular/material/list';

@NgModule({
  declarations: [
    HomeComponent,
    ApplicationlistComponent,
    AppCategoryPipe,
    ApplicationdetailComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule,
    MatSidenavModule,
    MatFormFieldModule,
    MatCardModule,
    MatDividerModule,
    MatInputModule,
    MatButtonModule,
    MatListModule,
  ]
})
export class HomeModule { }
