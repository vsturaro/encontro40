import { Component, OnInit } from '@angular/core';
import { Entrega } from 'src/entidades/Entrega';
import { EntregaService } from '../servico/entrega.service';

@Component({
  selector: 'app-listarentrega',
  templateUrl: './listarentrega.component.html',
  styleUrls: ['./listarentrega.component.css']
})
export class ListarentregaComponent implements OnInit {

  entrega : Entrega[] = [];

  constructor(private servico: EntregaService) { }

  ngOnInit(): void {
    this.servico.listarEntregas().subscribe(
      dados => this.entrega = dados,
      error => alert("Erro ao consultar dados")
    )
  }

}
