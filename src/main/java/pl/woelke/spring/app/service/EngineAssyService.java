package pl.woelke.spring.app.service;

import org.springframework.stereotype.Service;
import pl.woelke.spring.app.repository.EngineAssyRepository;
import pl.woelke.spring.app.repository.entity.EngineAssyEntity;
import pl.woelke.spring.app.service.mappers.EngineAssyMapper;
import pl.woelke.spring.app.web.model.EngineAssyModel;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class EngineAssyService {
    private static final Logger LOGGER = Logger.getLogger(EngineAssyService.class.getName());

    private EngineAssyRepository engineAssyRepository;
    private EngineAssyMapper engineAssyMapper;

    public EngineAssyService(EngineAssyRepository engineAssyRepository, EngineAssyMapper engineAssyMapper) {
        this.engineAssyRepository = engineAssyRepository;
        this.engineAssyMapper = engineAssyMapper;
    }

    public List<EngineAssyModel> list() {
        LOGGER.info("list()");
        List<EngineAssyEntity> engineAssyEntityList = engineAssyRepository.findAll();
        List<EngineAssyModel> engineAssyModelList = engineAssyMapper.listEngineModels(engineAssyEntityList);
        LOGGER.info("listModels("+engineAssyModelList+")");
        return engineAssyModelList;
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
