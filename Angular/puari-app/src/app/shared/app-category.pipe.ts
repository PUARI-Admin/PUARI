import { Pipe, PipeTransform } from '@angular/core';

interface ICategory {
  [key: string]: string;
}

@Pipe({
  name: 'appCategory'
})
export class AppCategoryPipe implements PipeTransform {
  JAPANESE = {
    user_regist: 'ユーザ登録'
  } as ICategory;

  transform(category: string, ...args: any[]): any {
    return this.JAPANESE[category] || category;

  }

}