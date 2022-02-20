import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplicationconfirmComponent } from './applicationconfirm.component';

describe('ApplicationcomfirmComponent', () => {
  let component: ApplicationconfirmComponent;
  let fixture: ComponentFixture<ApplicationconfirmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApplicationconfirmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ApplicationconfirmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
