package br.com.music4.music4ws.service;

import java.util.List;
import java.util.Optional;

import br.com.music4.music4ws.shared.MusicaDto;


public interface MusicaService {
    List<MusicaDto>listarMusicas();
    MusicaDto criarMusica(MusicaDto musica);
    Optional<MusicaDto>atualizarMusica(String id, MusicaDto musica);
    void excluirMusicaPorId(String id);
}
