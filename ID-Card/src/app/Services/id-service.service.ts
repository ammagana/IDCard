import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Building } from '../Models/Building';
import { Department } from '../Models/Department';

@Injectable({
  providedIn: 'root'
})
export class IDServiceService {

  private url = "localhost:8080";
  constructor(private http:HttpClient) { }

  getBuildings():Observable<Building>{
    const url = `${this.url}/all`;
    return this.http.get<Building>(url);
  }

  getBuildingID(Id:number):Observable<Building>{
    const url = `${this.url}/${Id}`;
    return this.http.get<Building>(url);
  }

  getBuildingName(name:string):Observable<Building>{
    const url = `${this.url}/name/${name}`;
    return this.http.get<Building>(url);
  }

  getDepartment():Observable<Department>{
    const url = `${this.url}/all`;
    return this.http.get<Department>(url);
  }

  getDepartmentID(Id:number):Observable<Department>{
    const url = `${this.url}/${Id}`;
    return this.http.get<Department>(url);
  }
}
