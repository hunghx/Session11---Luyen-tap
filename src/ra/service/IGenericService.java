package ra.service;

import java.util.List;

public interface IGenericService<T, E> {
    List<T> findALl();
    T findById(E id);
    void save(T t);
    void delete(E id);
}
