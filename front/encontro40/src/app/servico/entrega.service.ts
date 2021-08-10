import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Entrega } from 'src/entidades/Entrega';

@Injectable({
  providedIn: 'root'
})
export class EntregaService {

  constructor( private servico:HttpClient) { }
  
  listarEntregas(): Observable<any>{
    return this.servico.get<Entrega[]>("http://localhost:8080/entregas/listar")
  }

  incluirEntrega(entrega:Entrega): Observable<any>{
    return this.servico.post<Entrega>("http://localhost:8080/entregas/incluir", entrega);
  }
}
