import { Injectable } from '@angular/core';
import { Cep } from '../models/cepDTO.model';
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http"
@Injectable({
  /*pode ser visto por toda aplicação*/
  providedIn: 'root'
})
export class CepService {
  
  enderecoCompleto: any;
  constructor(private http: HttpClient) {
    
  }
      getAddress(cep: string): Observable<Cep> {
        return this.http.get<Cep>(`https://viacep.com.br/ws/${cep}/json/`);
  }
}
