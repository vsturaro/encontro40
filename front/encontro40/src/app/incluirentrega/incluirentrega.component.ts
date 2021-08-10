import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Entrega } from 'src/entidades/Entrega';
import { EntregaService } from '../servico/entrega.service';

@Component({
  selector: 'app-incluirentrega',
  templateUrl: './incluirentrega.component.html',
  styleUrls: ['./incluirentrega.component.css']
})
export class IncluirentregaComponent implements OnInit {

  entrega : Entrega={codigo: 0, codigoCliente:0, endereco:""};

  constructor(private servico: EntregaService) { }

  ngOnInit(): void {
  }

  incluir(frm:NgForm){
    this.servico.incluirEntrega(this.entrega).subscribe(
      dados => alert("Dados inseridos com sucesso!"),
      error => alert("Erro ao gravar dados!")
    )
  }

}
