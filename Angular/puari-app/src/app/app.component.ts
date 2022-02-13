import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'puari-app';
  buttonName:string = '';

  constructor(){

  }

  ngOnInit():void {
    // TODO:ログイン状態でボタン名をログインかログアウトか決定したい。
  }
}
