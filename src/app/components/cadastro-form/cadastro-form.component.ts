import {Component} from '@angular/core';
import { CepService } from 'src/app/services/cep.service';

@Component({
  selector: 'app-cadastro-form',
  templateUrl: './cadastro-form.component.html',
  styleUrls: ['./cadastro-form.component.scss'],
  
})

export class CadastroFormComponent {
  constructor(private cepService: CepService){
  }

  title = "cadastro-form";
  completarEndereco(evento: any) {
    const cep = evento.target.value;
    this.cepService.getAddress(cep);
  }
  teste() {
    alert("teste");
  }
}