package app.labs.admin.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.labs.admin.dao.AdminRepository;
import app.labs.register.model.Member;
import lombok.extern.slf4j.Slf4j;
import app.labs.board.model.Board;
import app.labs.admin.model.Events;

@Slf4j
@Service
public class BasicAdminService implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    // 관리자 로그인
    @Override
    public Map<String, Object> findById(String id) {
        return adminRepository.findById(id);
    }

    @Override
    public List<Member> getMemberList(String memberId, String memberName) {
        return adminRepository.getMemberList(memberId, memberName);
    }

    @Override
    public Map<String, Object> getMemberStatsByYear() {
        Map<String, Object> result = new HashMap<>();
        result.put("yearlyStats", adminRepository.getMemberStatsByYear());
        return result;
    }

    @Override
    public Map<String, Object> getMemberStatsByMonth() {
        Map<String, Object> result = new HashMap<>();
        result.put("monthlyStats", adminRepository.getMemberStatsByMonth());
        return result;
    }

    @Override
    public Map<String, Object> getMemberStatsByDay() {
        Map<String, Object> result = new HashMap<>();
        result.put("dailyStats", adminRepository.getMemberStatsByDay());
        return result;
    }

    @Override
    @Transactional
    public void updateMemberStatusList(List<String> memberIdList, List<String> memberStatusList) {
        if (memberIdList.size() != memberStatusList.size()) {
            throw new IllegalArgumentException("Member ID list and status list must have the same size");
        }

        for (int i = 0; i < memberIdList.size(); i++) {
            adminRepository.updateMemberStatus(memberIdList.get(i), memberStatusList.get(i));
        }
    }

    @Override
    public Map<String, Object> getMissionStatus() {
        Map<String, Object> result = new HashMap<>();
        result.put("completionStats", adminRepository.getMissionCompletionStats());
        result.put("participationStats", adminRepository.getMissionParticipationStats());
        return result;
    }

    @Override
    public List<Board> getBoardList() {
        return adminRepository.getBoardList();
    }

    @Override
    public Board getBoardDetail(int boardId) {
        return adminRepository.getBoardDetail(boardId);
    }

    @Override
    @Transactional
    public int updateBoardList(List<String> boardIdList, List<String> boardOffensiveList,
            List<Integer> boardReportList) {
        // 리스트 크기 검증
        if (boardIdList.size() != boardOffensiveList.size() || boardIdList.size() != boardReportList.size()) {
            throw new IllegalArgumentException(
                    "Board ID list, offensive list, and report list must have the same size");
        }

        int updatedCount = 0;
        for (int i = 0; i < boardIdList.size(); i++) {
            try {
                Map<String, Object> paramMap = new HashMap<>();
                paramMap.put("boardId", boardIdList.get(i));
                paramMap.put("boardOffensive", boardOffensiveList.get(i));
                paramMap.put("boardReport", boardReportList.get(i));
                adminRepository.updateBoardStatus(paramMap);
                updatedCount++;
            } catch (Exception e) {
                // 개별 업데이트 실패 시 로그 기록하고 계속 진행
                log.error("Failed to update board status for boardId: " + boardIdList.get(i), e);
            }
        }
        return updatedCount;
    }

    @Override
    public List<Map<String, Object>> getDailyEmoDiary() {
        return adminRepository.getDailyEmoDiary();
    }

    @Override
    public List<Map<String, Object>> getTotalEmoDiary() {
        return adminRepository.getTotalEmoDiary();
    }

    @Override
    public List<Map<String, Object>> getDailyEmoBoard() {
        return adminRepository.getDailyEmoBoard();
    }

    @Override
    public List<Map<String, Object>> getTotalEmoBoard() {
        return adminRepository.getTotalEmoBoard();
    }

    @Override
    public List<Events> getEvents() {
        return adminRepository.getEvents();
    }

    @Override
    public void insertEvent(Events event) {
        adminRepository.insertEvent(event);
    }

    @Override
    public void updateEvent(Map<String, Object> requestData) {
        try {
            Events event = new Events();
            event.setEventId(Integer.parseInt(requestData.get("eventId").toString()));
            event.setEventName((String) requestData.get("eventName"));
            event.setEventDescription((String) requestData.get("eventDescription"));
            adminRepository.updateEvent(event);
        } catch (Exception e) {
            log.error("Error updating event: ", e);
            throw e;
        }
    }

    @Override
    public void deleteEvent(int eventId) {
        adminRepository.deleteEvent(eventId);
    }

    @Override
    public List<Map<String, Object>> getPastEventStats(int eventId, String startDate, String endDate,
            String periodUnit) {
        return adminRepository.getPastEventStats(eventId, startDate, endDate, periodUnit);
    }

    @Override
    public List<Map<String, Object>> getTodayEventStats(int eventId) {
        return adminRepository.getTodayEventStats(eventId);
    }

    @Override
    public List<Map<String, Object>> getTotalEventStats() {
        return adminRepository.getTotalEventStats();
    }

    @Override
    public List<Map<String, Object>> getSignUpStats(String startDate, String endDate, String periodUnit) {
        return adminRepository.getSignUpStats(startDate, endDate, periodUnit);
    }

    @Override
    public List<Map<String, Object>> getDropOutStats(String startDate, String endDate, String periodUnit) {
        return adminRepository.getDropOutStats(startDate, endDate, periodUnit);
    }

    @Override
    public int getVisitorCount() {
        return adminRepository.getVisitorCount();
    }

    @Override
    public List<Map<String, Object>> getTodayEventsStats() {
        return adminRepository.getTodayEventsStats();
    }
}
