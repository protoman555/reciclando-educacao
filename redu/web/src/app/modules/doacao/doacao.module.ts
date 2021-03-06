import { NgModule } from '@angular/core';

import { DoacaoRoutingModule } from './doacao-routing.module';
import { CadastrarDoacaoComponent } from './components/doacao/cadastrar-doacao/cadastrar-doacao.component';
import { DoacaoComponent } from './components/doacao/doacao.component';
import { SharedModule } from '../shared/shared.module';
import { ApresentacaoComponent } from './components/doacao/apresentacao/apresentacao.component';
import { VisualizarDoacaoComponent } from './components/doacao/visualizar-doacao/visualizar-doacao.component';

@NgModule({
    imports: [
        SharedModule,
        DoacaoRoutingModule
    ],
    declarations: [
        CadastrarDoacaoComponent,
        DoacaoComponent,
        ApresentacaoComponent,
        VisualizarDoacaoComponent
    ],
    providers: []
})
export class DoacaoModule { }
