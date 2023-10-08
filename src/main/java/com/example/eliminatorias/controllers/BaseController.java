package com.example.eliminatorias.controllers;

import com.example.eliminatorias.entities.Base;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable>{
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable @NotNull ID id);
    public ResponseEntity<?> save(@Valid @RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable @NotNull ID id, @Valid @RequestBody  E entity);
    public ResponseEntity<?> delete(@PathVariable @NotNull ID id);

}
