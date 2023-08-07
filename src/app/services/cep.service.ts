import { Injectable } from '@angular/core';
import { Cep } from '../models/cepDTO.model';
import { Observable } from 'rxjs';

@Injectable({
  /*pode ser visto por toda aplicação*/
  providedIn: 'root'
})
export class CepService {

  constructor() {}

  private getAddress(): /*Observable<any>*/any {
    return;
  }
}
