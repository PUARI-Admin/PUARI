import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { APPLICATION_LIST } from '../applicationlist/models/applicationDammy';

@Component({
  selector: 'app-applicationdetail',
  templateUrl: './applicationdetail.component.html',
  styleUrls: ['./applicationdetail.component.scss']
})
export class ApplicationdetailComponent implements OnInit {
  applicationList = APPLICATION_LIST;
  application: any;
  
  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(map => {
      const id = +map.get('id')!;
      this.application = this.applicationList[id - 1];
    })
  }

}
