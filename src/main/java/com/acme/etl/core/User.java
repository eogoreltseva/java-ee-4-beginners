package com.acme.etl.core;

/**
 *
 * @author vm.andreev
 */
public class User {

	private final int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
	private final String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("<User id: %d, name: %s>", id, name);
	}
}
