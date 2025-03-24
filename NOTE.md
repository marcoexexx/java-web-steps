### Summary of Terminology Differences Across Frameworks:
| Concept           | Servlet                   | Spring Boot          | Express            | FastAPI           | Axum              |
|-------------------|---------------------------|----------------------|--------------------|-------------------|-------------------|
| Path Parameter    | `request.getParameter()`   | `@PathVariable`      | `req.params`       | `user_id: int`    | `Path`            |
| Query Parameter   | `request.getParameter()`   | `@RequestParam`      | `req.query`        | `Query`           | `Query`           |
| Body              | `request.getInputStream()` | `@RequestBody`       | `req.body`         | `Body`            | `Json` / `Form`   |
| Headers           | `request.getHeader()`      | `@RequestHeader`     | `req.headers`      | `Header`          | `headers::Header` |
