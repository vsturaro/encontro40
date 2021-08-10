import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IncluirentregaComponent } from './incluirentrega.component';

describe('IncluirentregaComponent', () => {
  let component: IncluirentregaComponent;
  let fixture: ComponentFixture<IncluirentregaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IncluirentregaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IncluirentregaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
