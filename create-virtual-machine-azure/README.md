# 🖥️ Criação de uma Máquina Virtual (VM) no Microsoft Azure

Este guia descreve passo a passo como criar uma máquina virtual (VM) no Microsoft Azure usando o portal web. Ao final, você terá uma VM funcional rodando em poucos minutos.

---

## ✅ Pré-requisitos

Antes de começar, verifique se você tem:

- Uma conta Microsoft com acesso ao [Azure Portal](https://portal.azure.com/)
- Uma **assinatura ativa** no Azure
- Permissão para criar recursos (caso esteja em uma conta organizacional)

---

## 🚀 Passo a passo

### 1. Acesse o portal Azure
Acesse: [https://portal.azure.com](https://portal.azure.com)

### 2. Crie um novo recurso
- Clique em **"Criar um recurso"**
- Na barra de busca, digite **"Máquina Virtual"**
- Clique em **"Máquina Virtual" > Criar**

### 3. Configure as opções básicas da VM
- **Assinatura**: selecione sua assinatura ativa
- **Grupo de Recursos**: escolha um existente ou clique em "Criar novo"
- **Nome da máquina virtual**: ex: `minha-vm-linux`
- **Região**: selecione a região mais próxima de você
- **Imagem (Sistema Operacional)**: escolha entre Ubuntu, Windows Server, etc.
- **Tamanho da VM**: selecione o tamanho conforme a necessidade (ex: `Standard_B1s` para testes)
- **Nome de usuário e autenticação**:
  - Tipo de autenticação: `Senha` ou `Chave pública SSH`
  - Defina nome de usuário e senha/chave

### 4. Disco da VM
- Escolha o tipo de disco do SO (SSD ou HDD)
- Você pode adicionar discos de dados posteriormente se necessário

### 5. Rede
- Uma rede virtual e um grupo de segurança serão criados automaticamente
- Se necessário, configure portas de entrada (ex: HTTP, SSH, RDP)

### 6. Revisar + Criar
- Clique em **"Revisar + criar"**
- Verifique se todas as configurações estão corretas
- Clique em **"Criar"**

---

## ⏳ Aguardando a implantação

- Aguarde a conclusão do processo de criação (alguns minutos)
- Clique em **"Ir para o recurso"** após a criação

---

## 🔗 Conectar à VM

### Para VMs Linux:
- Conecte via SSH:
```bash
ssh nome_usuario@<IP_Público>
