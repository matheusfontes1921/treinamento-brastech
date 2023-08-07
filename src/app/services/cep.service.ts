import { Injectable } from '@angular/core';
import { Cep } from '../models/cepDTO.model';
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http"
import { FormBuilder, FormGroup } from '@angular/forms';
@Injectable({
  /*pode ser visto por toda aplicação*/
  providedIn: 'root'
})
export class CepService {
  addressForm: FormGroup;
  enderecoCompleto: any;
  constructor(private formBuilder: FormBuilder, private http: HttpClient) {
    this.addressForm = this.formBuilder.group({
      cep: [''],
      logradouro: [''],
      bairro: [''],
      cidade: [''],
      uf: [''],
    })
  }
    async getAddress(cep: string) {
      
    this.enderecoCompleto = await this.http.get(`https://viacep.com.br/ws/${cep}/json/`).toPromise();

    this.addressForm.patchValue({
      logradouro: this.enderecoCompleto.logradouro,
      bairro: this.enderecoCompleto.bairro,
      cidade: this.enderecoCompleto.localidade,
      uf: this.enderecoCompleto.uf,
    });
    console.log(this.addressForm.value);
    
  }
}
