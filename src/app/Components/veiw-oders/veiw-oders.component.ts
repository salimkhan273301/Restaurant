import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-veiw-oders',
  templateUrl: './veiw-oders.component.html',
  styleUrls: ['./veiw-oders.component.css']
})
export class VeiwOdersComponent implements OnInit {

  constructor(private http:HttpClient) { }
  orders:any;

  ngOnInit(): void {
    let response=this.http.get("http://localhost:8081/getOrders");
    response.subscribe((data)=>this.orders=data)
  }

}
