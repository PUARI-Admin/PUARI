import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserregisterRoutingModule } from './userregister-routing.module';
import { UserregisterComponent } from './userregister/userregister.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatListModule } from '@angular/material/list';
import { MatButtonModule } from '@angular/material/button';

@NgModule({
  declarations: [
    UserregisterComponent
  ],
  imports: [
    CommonModule,
    UserregisterRoutingModule,
    MatFormFieldModule,
    MatInputModule,
    MatListModule,
    MatButtonModule,
  ]
})
export class UserregisterModule { }
