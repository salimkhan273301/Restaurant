import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-veiw-items',
  templateUrl: './veiw-items.component.html',
  styleUrls: ['./veiw-items.component.css']
})
export class VeiwItemsComponent implements OnInit {

  constructor(private http:HttpClient,private route:Router) { }
  items:any

  ngOnInit(): void {
    
    let response=this.http.get("http://localhost:8081/getAllItem");
    response.subscribe((data)=>this.items=data)
  }
  additeam(){
    this.route.navigate(['/additem'])
  }

}
