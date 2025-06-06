package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message = "제목은 필수항목입니다.")
    @Size(max = 100)
    private String subject;
    @NotEmpty(message = "내용은 필수항목입니다.")
    private String content;

    private String tags; // 태그 입력 필드 (콤마로 구분)
}
