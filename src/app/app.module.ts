import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddChefComponent } from './Components/add-chef/add-chef.component';
import { AdditemComponent } from './Components/additem/additem.component';
import { AdminDashComponent } from './Components/admin-dash/admin-dash.component';
import { AdminloginComponent } from './Components/adminlogin/adminlogin.component';
import { ChefDashComponent } from './Components/chef-dash/chef-dash.component';
import { ChefloginComponent } from './Components/cheflogin/cheflogin.component';
import { HomeComponent } from './Components/home/home.component';
import { IteamlistComponent } from './Components/iteamlist/iteamlist.component';
import { ListOfChefComponent } from './Components/list-of-chef/list-of-chef.component';
import { LoginComponent } from './Components/login/login.component';
import { VeiwItemsComponent } from './Components/veiw-items/veiw-items.component';
import { VeiwOdersComponent } from './Components/veiw-oders/veiw-oders.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    AddChefComponent,
    AdditemComponent,
    AdminDashComponent,
    AdminloginComponent,
    ChefDashComponent,
    ChefloginComponent,
    HomeComponent,
    IteamlistComponent,
    ListOfChefComponent,
    LoginComponent,
    VeiwItemsComponent,
    VeiwOdersComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
