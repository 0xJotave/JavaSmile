<p align="center">
  <img src="javaSmile.png" alt="Java Smile" width="400">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java Badge">
  <img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA Badge">
</p>

<h1>Sobre Java Smile</h1>

<p>Java Smile é um sistema de gerenciamento clínico odontológico. Acreditamos ser uma ótima opção para facilitar o gerenciamento 
  e atendimento aos pacientes, suprindo as necessidades de:</p>
<ul>
  <li>Listagem de Pacientes, Consultas e Procedimentos.</li>
  <li>Persistência de dados (Local) em arquivo Json.</li>
  <li>Criação, edição e remoção dos mesmos.</li>
  <li>Cadastro via informações do usuário.</li>
  <li>Login via Usuário e senha ou via Google.</li>
</ul>

<div align="center">
  <p>Diagrama de Classes</p>
</div>
<p align="center">
  <img src="Diagrama.png" alt="Diagrama" width="400">
</p>

<h2>Dependências e versões necessárias</h2>
<ul>
    <li>MigLayout 4.0</li>
    <li>TimmingFramework 0.55</li>
</ul>

<h2>Instrução de uso:</h2>
<h3>1. Executar Arquivo .jar:</h3>
<ol>
    <li>Execute o arquivo jar.</li>
    <li>Faça cadastro de usuário ou entre com Google.</li>
    <li>Faça login(Caso seja feito cadastro no passo 2).</li>
    <li>Utilize o sistema.</li>
</ol>

<h3>Executar o Código:</h3>
<ol>
    <li>Abra o Intellij</li>
    <li>Adicione as Bibliotecas:</li>
    <ol>
    <li>Vá em <b>Project Structures</b> > <b>Libraries</b></li>
    <li>Clique no botão de adicionar e adicione os arquivos .jar presentes na pasta <b>Libraries</b> do Projeto</li>
    <li>É provável que as vezes a library seja adiciona automaticamente nos Módulos, mas se não for o caso, siga os próximos passos:</li>
    <ol>
    <li>Ainda em <b>Project Structures</b>, vá em <b>Modules</b> > <b>Dependencies</b> > Botão de adicionar > Library, 
    e selecione a que você acabou de criar (Provavelmente se chamará "miglayout-4.0")</li>
    <li>Por fim, clique em <b>Apply</b></li>
</ol>
</ol>
<li>Marque as pastas <b>source</b>:</li>
<ol>
<li>Vá em <b>Project Structures</b> > <b>Modules</b> > Aba <b>Sources</b></li>
<li>Navegue até a pasta <b>src</b> da Pasta <b>Dashboard</b> e marque ela como uma <b>Source Past</b></li>
<li>Faça o mesmo na pasta <b>src</b> de <b>LoginAndRegister</b></li>
<li>Por fim, clique em <b>Apply</b></li>
</ol>
<li>Habilite as <b>Annotations:</b></li>
    <ol>
    <li>Vá em <b>Settings</b></li>
    <li>Pesquise por "<i>annotation</i>"</li>
    <li>Habilite a função <b>Enable Annotation Processing</b></li>
</ol>
<li>Por fim, rode a classe <b>Main</b></li>
</ol>

<h1>Interfaces</h1>

<p align="center">
  <img src="LoginAndRegister.png" alt="Login and Register" width="400">
</p>
<div align="center">
  <p>Login e Registro</p>
</div>

<p align="center">
  <img src="dashboard.png" alt="Dashboard" width="400">
</p>
<div align="center">
  <p>Dashboard</p>
</div>

<p align="center">
  <img src="listagemPacientes.png" alt="Listagem Pacientes" width="400">
</p>
<div align="center">
  <p>Listagem de Pacientes</p>
</div>
<p align="center">
  <img src="listagemProcedimentos.png" alt="Listagem Procedimentos" width="400">
</p>
<div align="center">
  <p>Listagem de Procedimentos</p>
</div>
<p align="center">
  <img src="listagemConsultas.png" alt="Listagem Consultas" width="400">
</p>
<div align="center">
  <p>Listagem de Consultas</p>
</div>

<h2>Licença</h2>
Este projeto usa a [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0) com a [Commons Clause](https://commonsclause.com/) para restringir o uso comercial. Veja o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.
