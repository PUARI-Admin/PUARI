import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { SidebarComponent } from './layouts/sidebar/sidebar.component'

import { MaterialExampleModule } from './material/material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatNativeDateModule } from '@angular/material/core';
import { HttpClientModule } from '@angular/common/http';
import { TopbarComponent } from './layouts/topbar/topbar.component';
import { FootbarComponent } from './layouts/footbar/footbar.component';
import { MainComponent } from './layouts/main/main.component';
import { MatList, MatListModule } from '@angular/material/list';
@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    TopbarComponent,
    FootbarComponent,
    MainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MaterialExampleModule,
    FormsModule,
    ReactiveFormsModule,
    MatNativeDateModule,
    HttpClientModule,
    MatListModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
