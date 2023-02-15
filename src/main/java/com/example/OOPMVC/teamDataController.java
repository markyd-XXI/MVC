package com.example.OOPMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class teamDataController {

    @GetMapping("/teamData")
    public String teamData(Model model) throws IOException {
        List<TeamModel> teams;
        List<TeamRecordModel> records;
        DataAccessServiceLayer dataAccessServiceLayer = new DataAccessServiceLayer();

        teams = dataAccessServiceLayer.getTeamRosters();
        records = dataAccessServiceLayer.getTeamRecords();

        model.addAttribute("teams",teams);
        model.addAttribute("records", records);

        return "teamData";
    }

}
