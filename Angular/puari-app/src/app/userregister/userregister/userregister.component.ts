import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.scss']
})
export class UserregisterComponent implements OnInit {

  name_sei:string = "";
  name_mei:string = "";
  mail:string = "";
  shainNo:string = "";
  companyName:string = "";
  bushoName:string = "";
  accountId:string = "";

  constructor() { }

  ngOnInit(): void {
  }

  comfirm(): void {
  }

}