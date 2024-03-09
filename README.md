# EcoCycle ♻

## Estruturação do Projeto

### Telas
* Nossas telas estarão dentro do package "screens".
* Cada tela deve ser um componente em si, para que possa ser invocada na nossa "MainActivity.kt", mantendo o conceito de Single-Page Application.
* Se um componente for exclusivo de uma tela (ex.: Card de tipo de material da home), ele deve ser construído dentro da página "components" daquela tela em específico.

### Componentes
* No package "components", estão os componentes genéricos que poderão ser compartilhados por todas as páginas de nossa aplicação.
* Esses componentes devem ser utilizados na construção das telas, pois já terão o estilo básico que utilizaremos no App.
* A partir dos componentes básicos do nosso App, podemos, se necessário, construir componentes específicos para alguma tela. Esses componentes específicos deverão estar na pasta "components" **interna** do componente de tela.
