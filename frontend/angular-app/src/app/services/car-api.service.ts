import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CarApiService {
  private postData: {};

  constructor(private httpClient: HttpClient) {
  }

  public getCars(): Observable<RootObject> {
    return this.httpClient.get<RootObject>("http://localhost:8080/cars")
  }

  public createPostData(value: number, value2: string, value3: string, value4: string, value5: number) {
    this.postData = {
      carId: value,
      brand: value2,
      model: value3,
      color: value4,
      productionDate: value5
    };
    console.log(this.postData);
  }

  public addCar() {
    this.httpClient.post("http://localhost:8080/cars", this.postData).toPromise().then(data => {
    });
  }
  public getCarsByDate(value: number, value2: number){
   return this.httpClient.get<RootObject>("http://localhost:8080/cars/byDate"+"?date1="+value+"&date2="+value2);
  }
}



export interface RootObject {
  carId: number;
  brand: string;
  model: string;
  color: string;
  productionDate: number;
}

