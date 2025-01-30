package website.server.Domain.HealingProgram.HealingService.HealingMusicSharing.Service;

import jakarta.servlet.http.HttpServletRequest;
import website.server.Domain.HealingProgram.HealingService.HealingMusicSharing.DTO.Request.PostCommentRequest;
import website.server.Domain.HealingProgram.HealingService.HealingMusicSharing.DTO.Request.PostRequest;
import website.server.Domain.HealingProgram.HealingService.HealingMusicSharing.DTO.Response.HealingMusicCommentResponse;
import website.server.Domain.HealingProgram.HealingService.HealingMusicSharing.DTO.Response.HealingMusicListResponse;
import website.server.Domain.HealingProgram.HealingService.HealingMusicSharing.DTO.Response.HealingMusicResponse;

import java.util.List;

public interface HealingMusicSharingService {

    /**
     * 힐링 뮤직 쉐어링 메서드
     * @param request 사용자 요청
     * @param postRequest 포스트 요청 데이터
     */
    void postHealingMusic(HttpServletRequest request, PostRequest postRequest);

    /**
     * 게시판에서 힐링 뮤직 리스트 조회 메서드
     * @return
     */
    List<HealingMusicListResponse> getHealingMusicList();

    /**
     * 게시판에서 힐링 뮤직 상세 조회 메서드
     * @param musicId
     * @return
     */
    HealingMusicResponse getHealingMusic(String musicId);

    /**
     * 힐링 뮤직 좋아요 누르기 메서드
     * @param request
     * @param musicId
     * @return
     */
    Integer likeHealingMusic(HttpServletRequest request, Long musicId);

    /**
     * 힐링 뮤직 댓글 달기 메서드
     * @param request
     * @param postCommentRequest
     * @return 댓글 내용 반환
     */
    String postComment(HttpServletRequest request, PostCommentRequest postCommentRequest);

    /**
     * 힐링 뮤직 댓글 조회 메서드
     * @param request
     * @param musicId
     * @return
     */
    List<HealingMusicCommentResponse> getComment(HttpServletRequest request,Long musicId);

    /**
     * 힐링 뮤직 댓글 삭제 메서드
     * @param request
     * @param commentId
     */
    void deleteComment(HttpServletRequest request, Long commentId);


    /* 내가 올린 힐링 뮤직 리스트 조회 메서드 */


    /* 내가 올린 힐링 뮤직 상세 조회 메서드 */


    /* 내가 좋아요 누른 힐링 뮤직 리스트 조회 메서드 */


    /* 내가 좋아요 누른 힐링 뮤직 상세 조회 메서드 */





}
