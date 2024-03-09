package com.church.holylink.shared.common;

import java.util.List;

public interface EntityToDto<O, E> {

  O toDto(E entity);

  E toEntity(O dto);

  List<O> toDto(List<E> entity);

  List<E> toEntity(List<O> dto);
}