import { Injectable } from '@angular/core';
import { Cep } from '../models/cepDTO.model';
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http"
@Injectable({
  /*pode ser visto por toda aplicação*/
  providedIn: 'root'
})
export class CepService {

  constructor(private http: HttpClient) {
    
  }

   getAddress(cep: string): any {
    const enderecoCompleto = this.http.get(`https://viacep.com.br/ws/${cep}/json/`);
    console.log(`https://viacep.com.br/ws/${cep}/json/`);
    
  }
}
