package pl.woelke.spring.app.service;

import pl.woelke.spring.app.web.AccessoriesController;

import java.util.logging.Logger;

public class AccessoriesService {
    private static final Logger LOGGER = Logger.getLogger(AccessoriesService.class.getName());

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
