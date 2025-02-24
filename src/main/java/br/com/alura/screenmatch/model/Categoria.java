package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action"),
    CRIME("Crime"),
    ROMANCE("Romanca"),
    DRAMA("Drama"),
    COMEDIA("Comedy");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) throws IllegalAccessException {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }

        throw new IllegalAccessException("Nenhuma categoria encontrada");
    }
}
