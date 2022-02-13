import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { APPLICATION_LIST } from './models/applicationDammy';

@Component({
  selector: 'app-applicationlist',
  templateUrl: './applicationlist.component.html',
  styleUrls: ['./applicationlist.component.scss']
})
export class ApplicationlistComponent implements OnInit {
  applicationList = APPLICATION_LIST;
  application: any;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(map => {
      const employeeNum: any = map.get('employeeNum');
      this.application = this.applicationList[employeeNum]
    })
  }
}
