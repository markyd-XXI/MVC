package com.example.OOPMVC;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.List;

public class DataAccessServiceLayer {
    ObjectMapper objectMapper = new ObjectMapper();
    public List<TeamModel> getTeamRosters() throws IOException {
        Resource teamsResource = new ClassPathResource("teamRosters.json");
        return objectMapper.readValue(teamsResource.getInputStream(), new TypeReference<>() {});
    }

    public List<TeamRecordModel> getTeamRecords() throws IOException {
        Resource recordsResource = new ClassPathResource("teamSeasonRecords.json");
        return objectMapper.readValue(recordsResource.getInputStream(), new TypeReference<>() {});
    }
}
