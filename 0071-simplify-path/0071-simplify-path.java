class Solution {
    public String simplifyPath(String path) {
        String[] words = path.split("/");
        Stack<String> s = new Stack<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String ch = words[i];
            if (ch.equals(".") || ch.equals("")) {
                continue;
            } else if (!ch.equals("..")) {
                s.push(ch);
            } else if (!s.isEmpty()) {
                s.pop();
            }
        }

        if(s.isEmpty()) return "/";

        for (String dir : s) {
            result.append("/").append(dir);
        }
        return result.toString();
    }
}