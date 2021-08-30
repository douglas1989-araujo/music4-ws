1-) Descreva aqui o comando para criação do banco (utilizado no mongosh ou 
compass), que deverá ser chamado tech4music

use tech4music

2-) Descreva o comando para criar a coleção musicas e já inserir 3 músicas abaixo:


db.tech4music.insertOne({"titulo":"Forever","artista":"kiss","album":"Hot in the Shade","genero":"rock","anoLancamento":1989,"Compositor":"Paul Stanley"})
db.tech4music.insertOne({"titulo":"Algo parecido","artista":"Skank","album":"Os três primeiros","genero":"Pop","anoLancamento":2018,"Compositor":"Samuel Rosa"})
db.tech4music.insertOne({"titulo":"O que me importa","artista":"Marisa Monte","album":"Memórias, crônicas e declarações de amor","genero":"MPB","anoLancamento":2000,"Compositor":"Jose de Ribamar Cury"})