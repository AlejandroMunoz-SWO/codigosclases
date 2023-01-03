import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SavealbumComponent } from './savealbum.component';

describe('SavealbumComponent', () => {
  let component: SavealbumComponent;
  let fixture: ComponentFixture<SavealbumComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SavealbumComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SavealbumComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
