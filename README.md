1. Foi necessário alterar alguma linha de código dentro do pacote sagsa.core?
Não. O pacote "sagsa.core" nao precisou ser alterado, pois ele depende apenas da interface "RepositoryContrato" e não de uma implementação específica. Isso caracteriza um baixo acoplamento, permitindo trocar a fonte dos dados sem modificar as regras de negócio.

2. Quais seriam as consequências se os dados estivessem programados diretamente na View?
Se os dados estivessem na camada de visualização, qualquer mudança no banco de dados exigiria alterações na interface do sistema. Isso aumentaria o acoplamento, dificultaria a manutenção e poderia gerar erros em outras partes do programa. Além disso, o cronograma do projeto seria prejudicado, pois mudanças simples exigiriam modificações em várias classes.
