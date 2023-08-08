import {Component, OnInit} from '@angular/core';
import { CepService } from 'src/app/services/cep.service';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Cep } from 'src/app/models/cepDTO.model';


@Component({
  selector: 'app-cadastro-form',
  templateUrl: './cadastro-form.component.html',
  styleUrls: ['./cadastro-form.component.scss'],

})


export class CadastroFormComponent implements OnInit {
  title = "cadastro-form";
  currentAddress?: Cep
  addressForm?: FormGroup | any;
  constructor(private cepService: CepService){
  }

  createForm() {
    this.addressForm = new FormGroup({
    cep: new FormControl(""),
    logradouro: new FormControl(""),
    bairro: new FormControl(""),
    cidade: new FormControl(""),
    uf: new FormControl(""),
  })
}


  ngOnInit(): void {
    this.createForm();
  }
  
  completarEndereco(evento: any): any {
    const cep = evento.target.value;
    this.cepService.getAddress(cep).subscribe(
      (showingAddress: Cep) => {
        this.currentAddress = showingAddress;
        this.addressForm?.patchValue({
          cep: showingAddress.cep,
          logradouro: showingAddress.logradouro,
          bairro: showingAddress.bairro,
          cidade: showingAddress.localidade,
          uf: showingAddress.uf,
        });
  })
}
  teste() {
    alert(this.currentAddress?.bairro)
  }
}


