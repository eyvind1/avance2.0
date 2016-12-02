package com.example.repositorio.jpa;

import com.example.dominio.Album;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAlbumRepositorio extends  JpaBaseRepository<Album,Integer>{
    @Override
    public Collection<Song> findSongsByAlbumId(Integer albumId) {
        String jpaQuery = "Select s from song s join album_songs on s.id = album_songs.songs where album_songs.album = :albumtId";
        TypedQuery<Song> query = entityManager.createQuery(jpaQuery, Song.class);
        query.setParameter("albumId", albumId);
        return query.getResultList();
    }	//select a from artist a join artist_album on a.id = artist_album.artist where artist_album.album = 1;
    @Override
    public Collection<Artist> findArtistByAlbumId(Integer albumId) {
        String jpaQuery = "select a from artist a join artist_album on a.id = artist_album.artist where artist_album.album = :albumtId";
        TypedQuery<Artist> query = entityManager.createQuery(jpaQuery, Artist.class);
        query.setParameter("albumId", albumId);
        return query.getResultList();
    }
    @Override
    public boolean save(Album album) {
        // TODO Auto-generated method stub
        return false;
    }
}
