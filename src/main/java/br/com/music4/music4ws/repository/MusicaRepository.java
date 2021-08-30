package br.com.music4.music4ws.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.music4.music4ws.model.Musica;

public interface MusicaRepository extends MongoRepository<Musica,String> {

    
}
