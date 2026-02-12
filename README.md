Sistema de Gerenciamento de Biblioteca

Aplicação desenvolvida em Java com o objetivo de aplicar e consolidar conceitos fundamentais de Programação Orientada a Objetos (POO), por meio da modelagem de um sistema de controle de biblioteca.

O sistema simula o funcionamento básico de uma biblioteca, permitindo o cadastro de usuários e materiais, controle de empréstimos e devoluções, além da verificação de atrasos. A proposta do projeto é exercitar a modelagem de entidades, aplicação de regras de negócio e organização do código de forma estruturada.

O domínio da aplicação é composto pelas seguintes entidades principais: Usuário, que possui ID único, nome e histórico de empréstimos; Material, representado como classe abstrata, contendo ID único, título, status de disponibilidade e prazo de empréstimo definido conforme o tipo específico; e Empréstimo, responsável por associar um usuário a um material, armazenando data de empréstimo, data prevista de devolução, data efetiva de devolução e status do empréstimo.

Entre as funcionalidades implementadas estão o cadastro de usuários, cadastro de materiais, listagem de materiais com seus respectivos status de disponibilidade, realização de empréstimos, registro de devoluções e identificação automática de atrasos.

O sistema segue regras de negócio bem definidas: um material só pode ser emprestado se estiver disponível; IDs de usuários e materiais devem ser únicos; um material não pode possuir dois empréstimos ativos simultaneamente; a devolução encerra o empréstimo e libera o material para novos empréstimos; e atrasos são identificados com base na data prevista de devolução.

Durante o desenvolvimento foram aplicados conceitos centrais de Programação Orientada a Objetos, como abstração, encapsulamento, herança, polimorfismo e separação de responsabilidades, buscando manter o código organizado, coeso e alinhado a boas práticas de modelagem.