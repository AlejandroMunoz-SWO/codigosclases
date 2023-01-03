import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SavebandComponent } from './saveband.component';

describe('SavebandComponent', () => {
  let component: SavebandComponent;
  let fixture: ComponentFixture<SavebandComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SavebandComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SavebandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
