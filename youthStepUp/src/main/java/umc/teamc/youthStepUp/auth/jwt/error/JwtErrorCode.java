package umc.teamc.youthStepUp.auth.jwt.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import umc.teamc.youthStepUp.global.error.BaseErrorCode;

@AllArgsConstructor
@Getter
public enum JwtErrorCode implements BaseErrorCode {
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "TOKEN4001", "토큰이 만료되었습니다."),
    TOKEN_INVALID(HttpStatus.UNAUTHORIZED, "TOKEN4002", "유효한 토큰 형식이 아닙니다."),
    HEADER_NO_TOKEN(HttpStatus.BAD_REQUEST, "TOKEN4003", "쿠키가 비어있습니다."),
    TOKEN_NO_AUTH(HttpStatus.UNAUTHORIZED, "TOKEN4004", "인증자격이 없습니다."),
    REFRESH_TOKEN_MISSING(HttpStatus.BAD_REQUEST, "TOKEN4005", "쿠키에 리프레쉬 토큰이 존재하지 않습니다.");
    private final HttpStatus status;
    private final String code;
    private final String message;
}

