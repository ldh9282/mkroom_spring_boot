package com.beatphobia.mkroom.common.fileupload;

public class AttachFileDTO {
	
	private String fileName ;   //원본파일이름
	private String uploadPath ; //업로드 경로 : yyyy/MM/dd 형식의 문자열이 저장됨
	private String uuid ;
	private String fileType ;   //파일유형(이미지파일:I, 이미지가 아닌파일:F)
	private String repoPath = "C:/myupload"; //서버 레포지토리 경로
	
	
	
	public AttachFileDTO() {
		super();
	}
	public AttachFileDTO(String fileName, String uploadPath, String uuid, String fileType, String repoPath) {
		super();
		this.fileName = fileName;
		this.uploadPath = uploadPath;
		this.uuid = uuid;
		this.fileType = fileType;
		this.repoPath = repoPath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getRepoPath() {
		return repoPath;
	}
	public void setRepoPath(String repoPath) {
		this.repoPath = repoPath;
	}
	@Override
	public String toString() {
		return "AttachFileDTO [fileName=" + fileName + ", uploadPath=" + uploadPath + ", uuid=" + uuid + ", fileType="
				+ fileType + ", repoPath=" + repoPath + "]";
	}
	
	

}
