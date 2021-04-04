package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //Los repositorios proveen todos los recursos para hacer metodos en la base de datos,
    //Este objeto está instanciado en la clase ProductoRepository


    //Query Methods, permiten crear consultas de alguna manera particular.
    //Un sistema flexible.
    //Native method
    //import org.springframework.data.jpa.repository.Query;
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
