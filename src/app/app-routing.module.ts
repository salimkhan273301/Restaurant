import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddChefComponent } from './Components/add-chef/add-chef.component';
import { AdditemComponent } from './Components/additem/additem.component';
import { AdminDashComponent } from './Components/admin-dash/admin-dash.component';
import { AdminloginComponent } from './Components/adminlogin/adminlogin.component';
import { ChefDashComponent } from './Components/chef-dash/chef-dash.component';
import { ChefloginComponent } from './Components/cheflogin/cheflogin.component';
import { HomeComponent } from './Components/home/home.component';
import { ListOfChefComponent } from './Components/list-of-chef/list-of-chef.component';
import { LoginComponent } from './Components/login/login.component';

import { VeiwItemsComponent } from './Components/veiw-items/veiw-items.component';
import { VeiwOdersComponent } from './Components/veiw-oders/veiw-oders.component';


const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:"add-chef",component:AddChefComponent},
  {path:"admin-dash",component:AdminDashComponent},
  {path:"list-of-chef",component:ListOfChefComponent},
  {path:"home",component:HomeComponent},
  {path:"login",component:LoginComponent},
  {path:"chef-dash",component:ChefDashComponent},
  {path:"adminlogin",component:AdminloginComponent},
  {path:"cheflogin",component:ChefloginComponent},
  {path:"viewItems",component:VeiwItemsComponent},
  {path:"viewOrders",component:VeiwOdersComponent},
  {path:"additem",component:AdditemComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
