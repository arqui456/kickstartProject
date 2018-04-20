# Kickstarter Project

> O kickstarter é um dos maiores sites do mundo quando o assunto 
> se trata de investimento coletivo, ele tem como objetivo apoiar
> projetos inovadores, que por meio de sua interface alcançam 
> os olhos de milhares de pessoas que poderão contribuir com qualquer
> quantia de dinheiro para que o projeto alcançe seu objetivo. 

***

### Funcionalidades do sistema

| Função | Descrição |
| ------ | ------ |
| Cadastrar Usuário | Deve ser possível fazer o cadastro de um usuário que terão como atributos básicos: nome, email e senha |
| Editar Perfil | Um usuário pode alterar seus dados de cadastro e também pode adicionar uma foto de perfil, biografia e localização| 
| Deletar Usuário | Um usuário com acesso de administrador deve poder excluir um usuário do sistema, todos seus projetos são excluidos também |
| Lançar Kickstart | Um usuário pode lançar seu projeto como kickstart o projeto deve possuir uma categoria, uma descrição, o usuário deve ser de um país elegível, ter no mínimo 18 anos, ter uma conta bancária no país de origem e um cartão de débito/crédito |
| Fundar Kickstart | Um usuário deve poder investir em qualquer projeto de seu interesse |
| Editar kickstart | O dono de um projeto deve ser capaz de editar seu kickstart, adicionando conteúdo a sua descrição, como recompensas,imagens |
| Deletar Kickstart| O dono do projeto ou um usuário adminstrador podem deletar um projeto |
| Listar projetos kickstart | Lista todos os projetos atuais, separados por categoria |
 
***
### Requisitos detalhados

#### Kickstarter
Um kickstarter pode possuir:

	* Um título
	* descrição
	* categoria
	* objetivo financeiro
	* duração(até 60 dias)
	* colaboradores
	* a imagem do projeto
	* Localização
	* Recompensas 
	* video do projeto
	* galeria 

Um usuário pode possuir:

	* Foto de perfil
	* Nome 
	* Biografia
	* Localização
	* email
	* Conta bancária

Uma conta bancária possui:

	* Id
	* Localização
	* Saldo