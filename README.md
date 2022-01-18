# domain-driven-design
Repositório para estudo do Domain Drive Design - cujo foco, durante o desenvolvimento do software, é no domínio (negócio) da aplicação.</br>

Este projeto é continuidade do projeto do clean architecture, pois seus conceitos estão relacionados.

<p>
Durante o desenvolvimento, geralmente, o foco é sobre as tecnologias e não no domínio.</br>
Dessa forma, quando um dev inicia em um projeto ele consegue identificar, com facilidade, quais são as tecnologias utilizadas. Porém, possui mais dificuldade em identificar qual o negócio do sistema.
</p>

* Ubíquo: que é onipresente; que pode ser encontrado em todos os lugares.
* Linguagem Ubíqua: consiste em ter uma linguagem onipresente entre a equipe de desenvolvimento e a equipe de negócios. É utilizar a linguagem de negócio, do domínio da aplicação, tanto em reuniões com os analistas de negócios como no código. Dessa forma, fica fácil identificar as funcionalidades no sistema, entender a aplicação em menos tempo, etc.
* Conceitos do DDD abordados neste projeto:
	* Aggreate: classe que contém coleção de outros objetos
	* Invariante: uma regra de negócio que deve sempre ser verdadeira para o objeto ser considerado válido
	* Evento: permite que o código fique desacoplado, favorecendo a sua manutenção e extensão