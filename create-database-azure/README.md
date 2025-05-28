# 🗄️ Criação de um Banco de Dados SQL na Microsoft Azure

Este guia fornece um passo a passo para criar um banco de dados SQL (Azure SQL Database) no portal da Azure, ideal para aplicações web, mobile ou sistemas corporativos.

---

## ✅ Pré-requisitos

Antes de começar, você deve ter:

- Conta na Microsoft com acesso ao [Azure Portal](https://portal.azure.com)
- Assinatura ativa do Azure
- Permissão para criar recursos

---

## 🚀 Passo a passo

### 1. Acesse o portal da Azure

Abra: [https://portal.azure.com](https://portal.azure.com)

### 2. Criar um novo recurso

- Clique em **"Criar um recurso"**
- Pesquise por **"Banco de Dados SQL"**
- Clique em **"Banco de Dados SQL" > Criar**

---

## ⚙️ Configurar as opções básicas

### Aba "Informações básicas"

- **Assinatura**: selecione sua assinatura
- **Grupo de Recursos**: selecione um existente ou clique em “Criar novo”
- **Nome do banco de dados**: ex: `meu-banco-sql`
- **Servidor**: clique em "Criar novo" se necessário
  - Nome do servidor (único globalmente)
  - Localização (mesma região do app que usará o banco)
  - Nome de usuário do administrador (ex: `adminsql`)
  - Senha e confirmação

---

### Aba "Computação + Armazenamento"

- **Camada de serviço**:
  - `Uso geral`, `Hiperescala` ou `Crítico para a empresa`
- **Modelo de compra**:
  - vCore (mais controle e escalabilidade) ou DTU (mais simples)
- **Tamanho de armazenamento**:
  - Ajuste conforme a necessidade (ex: 5 GB, 32 GB, etc.)

> 💡 Para testes, use a camada **Desenvolvimento** ou `Uso geral – Servidorless`.

---

### Aba "Configurações adicionais"

- **Fonte de dados**:
  - `Banco de dados em branco`
  - `Backup existente` ou `Exemplo` (ex: AdventureWorks)
- **Colação**: padrão geralmente é suficiente (`SQL_Latin1_General_CP1_CI_AS`)

---

### Aba "Rede"

- Permitir acesso público? (para acesso via IP)
  - **Sim**, e adicione o IP atual se quiser testar via SSMS ou client local
  - Para mais segurança, use acesso privado ou firewalls

---

### Aba "Tags" (opcional)

- Adicione tags para organização e gerenciamento de custos

---

### Aba "Revisar + Criar"

- Revise todas as configurações
- Clique em **"Criar"**

---

## ⏳ Aguardando a implantação

- A criação pode levar alguns minutos
- Após a criação, clique em **"Ir para o recurso"**

---

## 🔗 Conectar ao banco de dados

Você pode usar:

### ✅ **SQL Server Management Studio (SSMS)**:
- Host: `nomedoservidor.database.windows.net`
- Login: conforme definido na criação
- Banco: `meu-banco-sql`
- Porta padrão: `1433`

### ✅ **Azure Data Studio**
- Forneça os mesmos dados acima

---

## 🛡️ Dicas de segurança e boas práticas

- Use **Azure Active Directory** para autenticação centralizada
- Configure **firewalls e regras de IP**
- Habilite **backup automático** (já vem por padrão)
- Habilite **auditoria** e **monitoramento** via Azure Monitor

---

## 📚 Recursos oficiais

- [Documentação Azure SQL Database](https://learn.microsoft.com/pt-br/azure/azure-sql/)
- [Tutorial de Conexão via SSMS](https://learn.microsoft.com/pt-br/azure/azure-sql/database/connect-query-ssms)

---

> ⚠️ **Importante:** Bancos de dados ativos geram custos com base na performance e armazenamento. Para evitar cobranças indesejadas, exclua ou pause instâncias que não estiver utilizando.

