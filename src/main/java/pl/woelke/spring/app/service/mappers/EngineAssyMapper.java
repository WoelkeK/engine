package pl.woelke.spring.app.service.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.woelke.spring.app.repository.entity.EngineAssyEntity;
import pl.woelke.spring.app.web.model.EngineAssyModel;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Component
public class EngineAssyMapper {
    private static final Logger LOGGER = Logger.getLogger(EngineAssyMapper.class.getName());

    public List<EngineAssyModel> listEngineModels(List<EngineAssyEntity> engineAssyEntities) {
        LOGGER.info("listEngineModels(" + engineAssyEntities + ")");
        List<EngineAssyModel> engineAssyModels = engineAssyEntities.stream()
                .map(this::entityToModel)
                .collect(Collectors.toList());
        return engineAssyModels;
    }


    public EngineAssyModel entityToModel(EngineAssyEntity engineAssyEntity) {
        LOGGER.info("entityToModel(" + engineAssyEntity + ")");
        ModelMapper modelMapper = new ModelMapper();
        EngineAssyModel engineAssyModel = modelMapper.map(engineAssyEntity, EngineAssyModel.class);
        return engineAssyModel;
    }
}
