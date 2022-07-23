import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Headchef } from '../models/headchef';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

 
  constructor(private _http:HttpClient) { }

  listOfChefs():Observable<any>{
    return this._http.get<any>("http://localhost:8080/getlistofchefs")

  }
  addchef(chef :Headchef):Observable<any>{
    return this._http.post<any>("http://localhost:8080/addchef",chef)

  }
  getAllChefs(){
    return this._http.get<any>("http://localhost:8081/getlistofchefs")

  }
}
