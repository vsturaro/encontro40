import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IncluirentregaComponent } from './incluirentrega/incluirentrega.component';
import { ListarentregaComponent } from './listarentrega/listarentrega.component';
import { PrincipalComponent } from './principal/principal.component';

const routes: Routes = [
{path: '', component: PrincipalComponent},
{path: 'listarentregas', component: ListarentregaComponent},
{path: 'incluirentrega', component: IncluirentregaComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
