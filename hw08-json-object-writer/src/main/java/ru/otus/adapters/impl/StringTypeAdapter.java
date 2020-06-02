package ru.otus.adapters.impl;

import ru.otus.adapters.TypeAdapter;

import javax.json.Json;
import javax.json.JsonValue;
import java.util.Objects;

public class StringTypeAdapter implements TypeAdapter {

	private final String string;

	public StringTypeAdapter(final String string) {
		this.string = Objects.requireNonNull(string);
	}

	@Override
	public JsonValue getJsonValue() {
		return Json.createValue(string);
	}
}
