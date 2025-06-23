# Product MCP Demo

A minimal Spring AI **Model‑Context Protocol (MCP)** server that exposes five
`ProductController` tools (CRUD‑like) over **SSE + JSON‑RPC**.

This README is tailored for **IntelliJ IDEA (Community or Ultimate)** users and
shows how to:

1. Open & run the backend directly from IntelliJ.
2. Expose it to the internet with **ngrok**.
3. Connect the running server to Claude, ChatGPT Actions or Gemini.

---

## 1  Prerequisites

| Tool | Version | Notes |
|------|---------|-------|
| **IntelliJ IDEA** | 2023.3 or newer | Community Edition is fine |
| Java SDK | 17 | Configure in IntelliJ → *File ▸ Project Structure ▸ SDKs* |
| Maven | Bundled wrapper (`./mvnw`) | IntelliJ detects it automatically |
| ngrok | 3.x | Free plan is enough |
| Spring Boot | **3.5.0** | Already set in *pom.xml* |
| Spring AI MCP | **1.0.0 GA** | Managed by the BOM |

---

## 2  Import & run in IntelliJ IDEA

1. **Open the project**

   * `File ▸ Open…` and select the project root (folder that contains
     `pom.xml`).
   * Choose **Open as Project**.

2. **Wait for indexing & Maven sync**  
   IntelliJ downloads dependencies; watch the status bar until it is finished.

3. **Create a run configuration**

   *Open the `WorkingWithProductApplication` class*  
   (`src/main/java/.../WorkingWithProductApplication.java`).

   * Click the green **▶** gutter icon next to `main` and choose  
     **Run 'WorkingWithProductApplication.main()'**.  
     IntelliJ automatically creates a “Spring Boot” run configuration.

4. **Run**

   The console should end with:

   ```
   Tomcat started on port(s): 8080 (http)
   Mapped "{[/sse],GET}"         // SSE endpoint
   Mapped "{[/mcp/message],POST}"// JSON‑RPC endpoint
   ```

   Local URLs:

   * `http://localhost:8080/sse`
   * `http://localhost:8080/mcp/message`

---

## 3  Verify locally (optional)

```bash
curl -N http://localhost:8080/sse
# outputs:
# event: root
# event: endpoint
# data: /mcp/message?sessionId=...
```

Leave the server running in IntelliJ.

---

## 4  Expose the server with ngrok

```bash
ngrok http 8080
```

Copy the **HTTPS** forwarding URL, e.g.

```
https://10f2-2603-7000...ngrok-free.app
```

Public MCP endpoints:

```
https://10f2-...ngrok-free.app/sse
https://10f2-...ngrok-free.app/mcp/message
```

Keep the ngrok terminal open.

---

## 5  Connect an LLM

### 5.1  Claude.ai

1. **Settings ▸ Integrations ▸ Add integration**  
2. **Integration name** – *Products Demo* (any text)  
3. **Integration URL** – paste `https://...ngrok-free.app/sse`  
4. **Add** → Claude shows the tools in the sidebar.

In chat:

```
/tool listProducts
```

---

### 5.2  ChatGPT (Custom GPT + Actions)

> Requires “Actions” beta enabled on your OpenAI account.

1. Create/Configure a GPT ▸ **Actions ▸ Add new action**.  
2. **Action schema URL** – `https://...ngrok-free.app/sse`  
3. Save & Deploy → Ask the GPT:

```
Use getProductById with id 1
```

---

### 5.3  Gemini (Google AI Studio Actions)

1. **Deployments ▸ Actions ▸ New Action**  
2. **Endpoint URL** – `https://...ngrok-free.app/sse`  
3. Create → In chat:

```
Invoke listProducts
```

---

## 6  Troubleshooting

| Problem | Tip |
|---------|-----|
| `404 /sse` | Make sure the app *is* running and `spring.ai.mcp.server.transport=WEBMVC` is set (already true by default). |
| `400 Session ID missing` | Clients must include `?sessionId=`; the listed LLMs do this automatically. |
| Claude says “offline” | The ngrok tunnel stopped or you pasted a plain HTTP URL. |
| IntelliJ shows port in use | Stop any previous run configuration or change `server.port` in *application.properties*. |

---

## 7  Cleanup

* Stop the IntelliJ run configuration.
* Press `Ctrl‑C` in the ngrok terminal to close the tunnel.

---

## 8  Docs

* https://docs.spring.io/spring-ai/reference/api/mcp/mcp-server-boot-starter-docs.html

---

### Happy testing 🎉
