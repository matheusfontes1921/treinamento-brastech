# TestTest

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 16.1.5.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

#01 Formulário de Cadastro O objetivo deste projeto é criar um formulário de cadastro que permita que o usuário insira informações pessoais, como nome, CPF, data de nascimento, e-mail e endereço. Além disso, ao inserir o CEP, o endereço será preenchido automaticamente utilizando a API ViaCEP. Por fim, quando o usuário preencher todas as informações corretamente e clicar no botão "Salvar Cadastro", uma mensagem de pop-up deve aparecer confirmando o cadastro “Cadastro realizado com sucesso“ e um botão que abre um modal com os dados que o usuário digitou. Para este projeto, será utilizado Angular, scss, TypeScript e a API ViaCEP.
	#2 O desafio consiste em implementar as funções de salvar, editar e excluir os dados dos usuários, além de incluir a validação do CPF no momento do cadastro. Além disso, será necessário implementar um botão de pesquisa que permita buscar um usuário específico por nome ou CPF. Na função de salvar, será necessário validar o CPF inserido pelo usuário, verificando se é um número válido. Caso contrário, a aplicação deverá exibir uma mensagem de erro informando que o CPF é inválido. Para a função de editar, a aplicação deverá permitir que o usuário selecione um usuário já cadastrado e possa alterar seus dados pessoais, exceto o CPF que deverá ser apenas leitura. A validação do CEP deverá ser realizada novamente para garantir que o novo valor seja válido. Já para a função de excluir, a aplicação deverá permitir que o usuário selecione um usuário cadastrado e o exclua do sistema. Por fim, a aplicação deverá implementar um botão de pesquisa que permita ao usuário buscar por um usuário específico pelo nome ou CPF. Essa pesquisa deverá ser realizada em tempo real, atualizando os resultados à medida que o usuário digita o nome ou CPF. Ao clicar no botão o usuário será redirecionado para outra página do site onde estará os recursos de pesquisa. A princípio utilize o localstorage ou dados fictícios para sumular o backend e o data base.
	 #3 O desafio consiste em criar um backend utilizando Spring Java para realizar as operações de salvar, editar e deletar os dados dos usuários, utilizando o banco de dados MySQL como fonte de armazenamento. Para isso, será necessário desenvolver uma aplicação que permita a conexão com o banco de dados, a criação das tabelas necessárias para armazenar as informações dos usuários e a implementação das operações CRUD (Create, Read, Update e Delete) para gerenciar esses dados. Utilizar padrão de arquitetura em camadas ou arquitetura MVC (Model-View-Controller) e usar classes JPA.

https://www.youtube.com/watch?v=nQJdSD0SSj0&ab_channel=PogCast

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
