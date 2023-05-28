package com.sinemturkcu.onlineshoppingsite.General;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class BaseEntityService <E extends BaseEntity, R extends JpaRepository<E,Long>> {

    private final R repository;

    public List<E> getAll(){
        return repository.findAll();
    }

    public E save(E entity){
        BaseAdditionalFields baseAdditionalFields = entity.getBaseAdditionalFields();

        if(baseAdditionalFields == null){
            baseAdditionalFields = new BaseAdditionalFields();
        }

        if(entity.getId() == null){
            baseAdditionalFields.setCreatedDate(LocalDateTime.now());
        }

        baseAdditionalFields.setUpdatedDate(LocalDateTime.now());
        entity.setBaseAdditionalFields(baseAdditionalFields);
        return repository.save(entity);
    }

    public E getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void delete(E e){
        repository.delete(e);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

    public E update(Long id){
        E e = repository.findById(id).orElseThrow();
        return  repository.save(e);
    }
    public boolean isPresent(Long id){
        return repository.existsById(id);
    }


}
