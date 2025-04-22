package com.ps;

public class Firework {
    private String name;
    private boolean isBanned;

    public Firework() {}

    public Firework(String name) {
        this.name = name;
        this.isBanned = true;
    }

    public Firework(String name, boolean isBanned) {
        this.name = name;
        this.isBanned = isBanned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    @Override
    public String toString() {
        return "Firework{" +
                "name='" + name + '\'' +
                ", isBanned=" + isBanned +
                '}';
    }
}
