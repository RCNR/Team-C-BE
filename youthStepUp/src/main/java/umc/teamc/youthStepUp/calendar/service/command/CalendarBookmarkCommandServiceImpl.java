package umc.teamc.youthStepUp.calendar.service.command;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.teamc.youthStepUp.calendar.entity.Bookmark;
import umc.teamc.youthStepUp.calendar.exception.BookmarkErrorCode;
import umc.teamc.youthStepUp.calendar.exception.BookmarkException;
import umc.teamc.youthStepUp.calendar.repository.BookmarkRepository;

@Transactional
@Service
@RequiredArgsConstructor
public class CalendarBookmarkCommandServiceImpl implements CalendarBookmarkCommandService {
    private BookmarkRepository bookmarkRepository;

    @Override
    public Bookmark updateIsCompleted(Long bookmarkId, boolean isCompleted) {
        Bookmark bookmark = bookmarkRepository.findById(bookmarkId).orElseThrow(() ->
                new BookmarkException(BookmarkErrorCode.NOT_FOUND));
        bookmark.updateIsCompleted(isCompleted);
        return bookmark;
    }
}