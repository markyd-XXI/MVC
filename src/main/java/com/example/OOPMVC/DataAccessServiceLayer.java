package com.example.OOPMVC;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.List;

/**
 * The DataAccessServiceLayer separates the controller from how the data is accessed. The DataAccessServiceLayer can
 * be considered "Part" of the model since it is concerned with accessing data. Here the getTeamRosters() and getTeamRecords() methods do the dirty work
 * of knowing about and accessing the files that contain the data of interest. The methods return Lists of the data parsed into
 * Java POJOs that the controller expects. If the data changed from flat JSON files to an RDBMS, these methods would be
 * the only ones that would have to change. And as long as these methods maintain the same return types, the controller and
 * view are none the wiser.
 */
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
