# 🧪 Avaliação de Teste em Java – LoginService

Este repositório contém um **projeto Java** com estrutura Maven, destinado à **avaliação prática** de testes automatizados utilizando **JUnit 5** e análise de cobertura com **JaCoCo**.

---

## 🎯 Objetivo

Você deverá **escrever testes automatizados** para validar o comportamento de um sistema simples de autenticação (`LoginService`). A execução dos testes e a verificação da cobertura de código são feitas automaticamente pelo **GitHub Actions**.

---

## 📄 Estrutura do Projeto

login-avaliacao-java/

├── src/

│ ├── main/java/auth/LoginService.java # Classe a ser testada

│ └── test/java/auth/LoginServiceTest.java # Classe de teste (parcial)

├── pom.xml # Configuração do Maven

└── .github/workflows/test.yml # Pipeline de testes automática


## 📌 Regras e Instruções

1. **Clone ou faça um fork deste repositório** para seu próprio GitHub.
2. Complete a classe de teste `LoginServiceTest.java` com os seguintes casos:
   - ✅ Login correto (já implementado)
   - ❌ Login com usuário incorreto
   - ❌ Login com senha incorreta
   - ❌ Login com usuário `null`
   - ❌ Login com senha `null`
3. Faça **commit e push** das suas alterações.
4. Acesse a aba **"Actions"** do seu repositório para verificar:
   - Se os testes foram executados com sucesso ✅
   - Se a cobertura de código está adequada 📊

---

## 🛠️ Ferramentas utilizadas

| Ferramenta     | Finalidade                           |
|----------------|--------------------------------------|
| JUnit 5        | Testes automatizados                 |
| JaCoCo         | Análise de cobertura de código       |
| Maven          | Gerenciamento do projeto Java        |
| GitHub Actions | Execução automática dos testes       |

---

## 📊 Acesso ao Relatório de Cobertura (JaCoCo)

Após rodar os testes com Maven, o JaCoCo cria um relatório em target/site/jacoco/index.html
com acesso em:

[Aqui](https://rodolfooliveira-professor.github.io/pratica-java-jacoco/)
---

### 💡 Dica

Se quiser gerar novamente o relatório localmente no Codespaces:

mvn clean test jacoco:report

---
## 🧾 Critérios de Avaliação

| Critério                          | Pontuação |
|-----------------------------------|-----------|
| Implementou todos os testes       | 4.0       |
| Testes executam corretamente      | 2.0       |
| Cobertura de código ≥ 90% (JaCoCo)| 2.0       |
| Organização e clareza do código   | 2.0       |
| **Total**                         | **10,0**  |	
