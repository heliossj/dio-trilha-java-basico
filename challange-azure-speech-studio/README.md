# 🧠 Azure Speech Studio & Language Studio – Guia Rápido

Este repositório descreve brevemente os serviços **Azure Speech Studio** e **Azure Language Studio**, com instruções básicas para começar a usá-los em aplicações de voz e linguagem natural com IA da Microsoft.

---

## 🎯 O que são?

### 🔊 Azure Speech Studio

Plataforma para criar, testar e implementar soluções de voz usando os serviços de fala do Azure. Permite:

- **Conversão de texto em fala (Text-to-Speech - TTS)**
- **Reconhecimento de fala (Speech-to-Text - STT)**
- **Tradução de fala**
- **Reconhecimento de intenção com fala**

Acesse: [https://speech.microsoft.com](https://speech.microsoft.com)

---

### 🗣️ Azure Language Studio

Ambiente visual para explorar e testar os serviços de linguagem do Azure. Com ele, você pode:

- **Analisar sentimentos e opiniões**
- **Extrair entidades e frases-chave**
- **Detectar idioma**
- **Treinar modelos de classificação e extração personalizada**

Acesse: [https://language.azure.com](https://language.azure.com)

---

## 🚀 Como usar – Passo a Passo

### 🟩 Pré-requisitos

- Conta Microsoft e login no [Azure Portal](https://portal.azure.com)
- Subscrição ativa no Azure
- Criar um recurso:
  - Para Speech: `Serviço de Fala (Speech)`
  - Para Language: `Serviço de Linguagem (Cognitive Services)`

---

## 🗣️ Speech Studio – Text-to-Speech

1. Acesse [https://speech.microsoft.com](https://speech.microsoft.com)
2. Vá em **Text-to-Speech** (Texto para fala)
3. Escolha um **idioma e voz** (ex: `pt-BR - Francisca`)
4. Digite o texto no painel da esquerda
5. Clique em **Play** para ouvir
6. Para personalizar entonações, use **SSML (Speech Synthesis Markup Language)**

> 💡 Você pode baixar o áudio gerado e integrá-lo a bots, apps e vídeos.

---

## 🧾 Language Studio – Análise de Texto

1. Acesse [https://language.azure.com](https://language.azure.com)
2. Clique em **"Análise de Texto"**
3. Escolha o tipo de análise:
   - Detecção de Sentimento
   - Entidades Nomeadas
   - Frases-chave
4. Insira seu texto
5. Clique em **Executar** e veja os resultados no painel direito

### 📦 Para treinar modelos personalizados

1. Vá em **Projetos Personalizados**
2. Crie um projeto de:
   - Classificação de texto
   - Extração de entidades
3. Carregue seus dados de exemplo
4. Treine e publique o modelo
5. Use o endpoint REST para integração

---

## 📌 Dicas

- Use o **Azure Key Vault** para proteger suas chaves de API
- Acompanhe uso e performance via **Azure Monitor**
- Verifique **custos e limites gratuitos** no painel da sua assinatura

---

## 📚 Links úteis

- [Documentação Speech Studio](https://learn.microsoft.com/pt-br/azure/cognitive-services/speech-service/)
- [Documentação Language Studio](https://learn.microsoft.com/pt-br/azure/ai-services/language-service/)
- [Exemplos com SDK (C#, JS, Python)](https://github.com/Azure-Samples)

---

> ⚠️ **Observação**: Tanto o Speech quanto o Language Studio podem gerar custos após o uso do tier gratuito. Monitore a conta e defina alertas de orçamento se necessário.

