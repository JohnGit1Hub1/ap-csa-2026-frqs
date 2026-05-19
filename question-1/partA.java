public Account(String requestedName) {
    String name = requestedName;
    int i = 0;
    while (!isAvailable(name)) {
        name = name + i;
        i++;
    }
    username = name;
}
