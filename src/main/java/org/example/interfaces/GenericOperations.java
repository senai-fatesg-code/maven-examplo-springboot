package org.example.interfaces;

import java.util.List;

/**
 * CRUD - http
 * create - post
 * read - get -> lista todos
 * read - get(id) -> listar um registro
 * update - put(id,objeto),patch(id,objeto)
 * delete - delete(id)
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">Documentação Generics</a>
 */
public interface    GenericOperations<T, N> {

    T create(T entity);

    List<T> read();

    T read(N id);

    T update(N id, T entity);

    void delete(N id);

}
