package com.example.dominio;

public interface BaseEntity<K> {
	K getId();
	void setId(K id);
}