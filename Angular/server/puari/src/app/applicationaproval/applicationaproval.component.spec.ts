import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplicationaprovalComponent } from './applicationaproval.component';

describe('ApplicationaprovalComponent', () => {
  let component: ApplicationaprovalComponent;
  let fixture: ComponentFixture<ApplicationaprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApplicationaprovalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ApplicationaprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
