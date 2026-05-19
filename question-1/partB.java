public String getShortenedName() {
    String name = username;
    while (username.indexOf("-") != -1) {
        int start = username.indexOf("-") - 1;
        int end = start + 2;
        
        name = name.substring(0, start) + name.substring(start, end);
    }   
    return name;
}
