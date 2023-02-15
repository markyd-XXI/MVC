package com.example.OOPMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

/**
 * This is the controller for the program. The controller is the only part that the browser will actually make requests
 * to.
 *
 * This controller knows about how to access and retrieve the data models, accessed through the generically-named
 * "DataAccessServiceLayer". But the controller doesn't know or care about the source of the actual data, only that it
 * Receives the proper data models. In this case, the source of the data is json files parsed into objects and added to Lists.
 * If the data source changed, maybe to a database query, it would change in a way that would neither concern the
 * controller nor the view.
 */
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
