package umc.teamc.youthStepUp.calendar.dto.response;


import lombok.Builder;

import java.util.List;

@Builder
public record BookmarkResponseByDateListDTO(
        List<BookmarkResponseByDateDTO> bookmarks
) {
}