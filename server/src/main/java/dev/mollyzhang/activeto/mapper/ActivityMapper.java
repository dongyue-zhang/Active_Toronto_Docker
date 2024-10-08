package dev.mollyzhang.activeto.mapper;

import dev.mollyzhang.activeto.business.domain.ActivityDTO;
import dev.mollyzhang.activeto.business.domain.enums.LanguageFilterEnum;
import dev.mollyzhang.activeto.data.entity.main.Availability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivityMapper {
    @Autowired
    private FacilityMapper facilityMapper;

    public ActivityDTO toDTO(Availability availability, LanguageFilterEnum language, Double latitude, Double longitude){
        return ActivityDTO.builder()
                .id(availability.getId())
                .title(availability.getActivity().getTitleTranslation().getTranslations().get(language.getValue()))
                .type(availability.getActivity().getType().getTitleTranslation().getTranslations().get(language.getValue()))
                .category(availability.getActivity().getType().getCategory().getTitleTranslation().getTranslations().get(language.getValue()))
                .facility(facilityMapper.toDTO(availability.getFacility(), language, latitude, longitude))
                .isAvailable(availability.getIsAvailable())
                .startTime(availability.getStartTime())
                .endTime(availability.getEndTime())
                .minAge(availability.getMinAge())
                .maxAge(availability.getMaxAge())
                .reservationURL("www.url.com")
                .lastUpdated(availability.getLastUpdated())
                .build();
    }

//    public Page<ActivityDTO> toDTOPage(Page<Availability> page, LanguageFilterEnum language, Double latitude, Double longitude){
//        return new PageImpl<>(
//                page.getContent().stream().map(availability -> toDTO(availability, language, latitude, longitude)).collect(Collectors.toList()),
//                page.getPageable(),
//                page.getTotalElements()
//        );
//    }
}
