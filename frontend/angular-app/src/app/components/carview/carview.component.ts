// @ts-ignore
import { Component, OnInit } from '@angular/core';
import {CarApiService, RootObject} from "../../services/car-api.service";

// @ts-ignore
@Component({
  selector: 'app-carview',
  templateUrl: './carview.component.html',
  styleUrls: ['./carview.component.css']
})
export class CarviewComponent implements OnInit {

  rootObject: RootObject
  rootObject1: RootObject

  constructor(private carApiService : CarApiService) { }

  ngOnInit(): void {
    this.carApiService.getCars().subscribe(value =>{
      this.rootObject = value;
      console.log(this.rootObject);
    });
  }

  addCarButton(value1: number, value2: string, value3: string, value4: string, value5: number) {

    this.carApiService.createPostData(value1, value2, value3, value4, value5);
    console.log(value1);
    this.carApiService.addCar();
    window.location.reload();
  }


  showByDate(carDate1: number, carDate2: number) {
    const x = document.getElementById("myDIV");
    if (x.style.display === "none") {
      x.style.display = "block";
    } else {
      x.style.display = "none";
    }
    this.carApiService.getCarsByDate(carDate1,carDate2).subscribe(value => {
      this.rootObject1 = value;
    });

  }
}
