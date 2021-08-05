package com.example.board.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO extends CommonDTO {
	
	/** 번호 (PK) */
	private Long n_idx;

	/** 제목 */
	private String n_title;

	/** 내용 */
	private String n_content;

	/** 작성자 */
	private String n_writer;
	
	/** 삭제 여부 */
	private String deleteYn;

	/** 등록일 */
	
	private LocalDateTime reg_dt;
	
	private String ref1;
	
	private String n_file;

	public BoardDTO(Long n_idx, String n_title, String n_content, String n_writer, String deleteYn, LocalDateTime reg_dt, String ref1, String n_file) {
		super();
		this.n_idx = n_idx;
		this.n_title = n_title;
		this.n_content = n_content;
		this.n_writer = n_writer;
		this.deleteYn = deleteYn;
		this.reg_dt = reg_dt;
		this.ref1 = ref1;
		this.n_file = n_file;
	}
	
		
	
}
