import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { ModalLoginComponent } from './modal-login/modal-login.component';
import { AppRoutingModule } from './/app-routing.module';
import { RegisterComponent } from './register/register.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProfileComponent } from './profile/profile.component';
import { CarouselComponent } from './carousel/carousel.component';
import {NgbCarouselConfig} from '@ng-bootstrap/ng-bootstrap';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    ModalLoginComponent,
    RegisterComponent,
    NavbarComponent,
    ProfileComponent,
    CarouselComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    NgbModule.forRoot(),
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    NgbCarouselConfig,
    HttpClient,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
