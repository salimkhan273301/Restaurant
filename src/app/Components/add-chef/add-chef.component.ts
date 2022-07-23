import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Headchef } from 'src/app/models/headchef';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-add-chef',
  templateUrl: './add-chef.component.html',
  styleUrls: ['./add-chef.component.css']
})
export class AddChefComponent implements OnInit {

  chef =new Headchef();
  constructor( private route:Router,private service: ServiceService) { }
  public msg="chef Added successfully"

  
  
  ngOnInit(): void {
  }
  returnhome(){
    this.route.navigate(['/home']);

  }
  addchefform(){
    this.service.addchef(this.chef).subscribe(
      data=>
          {
            console.log("data added sucussfully");
            this.route.navigate(['admin-dash']);

          },
      //error=>console.log("error")
      
      
    )
   
    }

     emaile = document.getElementById("email");
     pass = document.getElementById("pass");
     name = document.getElementById("name");
     phone = document.getElementById("phone");
    addnewchef() {
      alert(this.msg)
      this.route.navigate(['/list-of-chef'])
      

  }

}
