@WebServlet("/server-info")
public class ServerInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Set response type to JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Simulate server data (this should come from an API)
        JSONObject serverData = new JSONObject();
        serverData.put("players", (int) (Math.random() * 20));
        serverData.put("avgSkill", (Math.random() * 100));
        serverData.put("avgPing", (int) (Math.random() * 100));
        serverData.put("map", "de_dust2");
        serverData.put("location", "Germany");
        serverData.put("owner", "Server Owner Name");

        // Write JSON response
        response.getWriter().write(serverData.toString());
    }
}
