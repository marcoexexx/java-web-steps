<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<%@ page import="java.util.List" %>
<%@ page import="com.chordstack.todo.model.Todo" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Task Manager</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
  <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>

<body class="bg-[#282828] text-[#ebdbb2] font-sans">

  <div class="flex items-center justify-center h-screen w-full">
    <div class="flex flex-col gap-y-4 p-[120px] bg-[#3c3836] rounded-lg shadow-lg w-80">
      <h1 class="text-4xl font-semibold text-[#d79921]">Task Manager</h1>

      <!-- Create Task Form -->
      <form action="create" method="post" class="flex flex-col gap-y-4">
        <div class="flex items-center gap-x-3">
          <input type="text" name="title" class="p-2 rounded-md text-black bg-[#ebdbb2] focus:outline-none" placeholder="Enter task..." required>
          <button type="submit" class="px-4 py-2 bg-[#83a598] text-white rounded-md hover:bg-[#7a8f7f] transition-colors">
            Create
          </button>
        </div>

        <!-- Task List -->
        <ul class="space-y-3">
          <c:forEach var="todo" items="${todos}">
            <li class="flex items-center justify-between p-3 bg-[#504945] rounded-md shadow-md">
              <div class="flex items-center gap-x-3">
                <input type="checkbox" name="is_completed" ${todo.getIsCompleted() ? 'checked' : ''} class="text-[#d79921]">
                <p class="text-xl text-[#ebdbb2] ${todo.getIsCompleted() ? 'line-through text-[#7c6f64]' : ''}">
                  ${todo.getTitle()}
                </p>
              </div>
              <button type="button" class="text-[#83a598] hover:text-[#7a8f7f] transition-colors">
                Done
              </button>
            </li>
          </c:forEach>
        </ul>
      </form>
    </div>
  </div>

  <script src="${pageContext.request.contextPath}/js/script.js"></script>
</body>

</html>
