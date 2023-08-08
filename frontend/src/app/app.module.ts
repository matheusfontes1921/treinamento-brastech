import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatTableModule} from '@angular/material/table';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { AppComponent } from './app.component';
import { CadastroFormComponent } from './components/cadastro-form/cadastro-form.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import { HttpClientModule } from "@angular/common/http";
@NgModule({
    declarations: [
        AppComponent,
        CadastroFormComponent,
    ],
    providers: [],
    bootstrap: [AppComponent],
  imports: [
    BrowserModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    FormsModule,
    MatTableModule,
    BrowserAnimationsModule,
    MatDatepickerModule,
    MatNativeDateModule,
    HttpClientModule,
    ReactiveFormsModule,
  ]
})
export class AppModule {}
