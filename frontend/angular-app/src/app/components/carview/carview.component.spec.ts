import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarviewComponent } from './carview.component';

describe('CarviewComponent', () => {
  let component: CarviewComponent;
  let fixture: ComponentFixture<CarviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
