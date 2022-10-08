package pl.woelke.spring.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.woelke.spring.app.service.EngineAssyService;
import pl.woelke.spring.app.web.model.EngineAssyModel;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/engine")
public class EngineAssyController {

    private static final Logger LOGGER = Logger.getLogger(EngineAssyController.class.getName());

    private EngineAssyService engineAssyService;

    public EngineAssyController(EngineAssyService engineAssyService) {
        this.engineAssyService = engineAssyService;
    }

    @GetMapping
    public String listView(ModelMap modelMap) {
        LOGGER.info("listView()");
        List<EngineAssyModel> engineAssyModelList = engineAssyService.list();
        modelMap.addAttribute("engine", engineAssyModelList);
        return "engineassy-list";
    }

    public void create() {
        LOGGER.info("create()");
    }

    public void read() {
        LOGGER.info("read()");
    }

    public void update() {
        LOGGER.info("update()");
    }

    public void delete() {
        LOGGER.info("delete()");
    }
}
