package com.sallefy.service.mapper;

import com.sallefy.domain.*;
import com.sallefy.service.dto.TrackDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Track} and its DTO {@link TrackDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TrackMapper extends EntityMapper<TrackDTO, Track> {


    @Mapping(target = "images", ignore = true)
    @Mapping(target = "removeImages", ignore = true)
    @Mapping(target = "playlists", ignore = true)
    @Mapping(target = "removePlaylist", ignore = true)
    @Mapping(target = "albums", ignore = true)
    @Mapping(target = "removeAlbum", ignore = true)
    Track toEntity(TrackDTO trackDTO);

    default Track fromId(Long id) {
        if (id == null) {
            return null;
        }
        Track track = new Track();
        track.setId(id);
        return track;
    }
}