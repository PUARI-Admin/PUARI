import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';

import { MaterialExampleModule } from './material/material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatNativeDateModule } from '@angular/material/core';
import { HttpClientModule } from '@angular/common/http';
import { TopbarComponent } from './layouts/topbar/topbar.component';
import { FootbarComponent } from './layouts/footbar/footbar.component';
import { MainComponent } from './layouts/main/main.component';
import { MatList, MatListModule } from '@angular/material/list';
import { ApplicationlistComponent } from './applicationlist/applicationlist.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { LogoutComponent } from './logout/logout.component';
import { ApplicationaprovalComponent } from './applicationaproval/applicationaproval.component';
import { StoreModule } from '@ngrx/store';
import { CategoryPipe } from './category.pipe';
import { FinishComponent } from './finish/finish.component';

@NgModule({
  declarations: [
    AppComponent,
    TopbarComponent,
    FootbarComponent,
    MainComponent,
    ApplicationlistComponent,
    SidenavComponent,
    LogoutComponent,
    ApplicationaprovalComponent,
    CategoryPipe,
    FinishComponent
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
    LayoutModule,
    MatButtonModule,
    MatIconModule,
    StoreModule.forRoot({}, {}),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
