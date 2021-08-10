import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarentregaComponent } from './listarentrega.component';

describe('ListarentregaComponent', () => {
  let component: ListarentregaComponent;
  let fixture: ComponentFixture<ListarentregaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarentregaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarentregaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
