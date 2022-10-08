package pl.woelke.spring.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;
@Controller
@RequestMapping(value = "/accessories")
public class AccessoriesController {

    private static final Logger LOGGER = Logger.getLogger(AccessoriesController.class.getName());

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
