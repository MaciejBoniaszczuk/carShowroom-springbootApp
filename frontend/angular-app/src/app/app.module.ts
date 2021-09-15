import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { CarviewComponent } from './components/carview/carview.component';
import {AlertModule} from "ngx-bootstrap/alert";
import {RouterModule} from "@angular/router";
import {FormsModule} from "@angular/forms";
@NgModule({
  declarations: [
    AppComponent,
    CarviewComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AlertModule.forRoot(),
    AlertModule,
    RouterModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
