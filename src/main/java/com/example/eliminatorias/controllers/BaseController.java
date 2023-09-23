package com.example.eliminatorias.controllers;

import com.example.eliminatorias.entities.Base;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable>{
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable @Min(1) ID id);
    public ResponseEntity<?> save(@RequestBody @Valid E entity);
    public ResponseEntity<?> update(@PathVariable @Min(1) ID id, @RequestBody @Valid E entity);
    public ResponseEntity<?> delete(@PathVariable @Min(1) ID id);

}
