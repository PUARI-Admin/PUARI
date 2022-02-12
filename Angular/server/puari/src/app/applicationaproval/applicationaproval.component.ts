import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { APPLICATION_LIST } from '../applicationlist/models/applicationDammy';

@Component({
  selector: 'app-applicationaproval',
  templateUrl: './applicationaproval.component.html',
  styleUrls: ['./applicationaproval.component.scss']
})
export class ApplicationaprovalComponent implements OnInit {
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
