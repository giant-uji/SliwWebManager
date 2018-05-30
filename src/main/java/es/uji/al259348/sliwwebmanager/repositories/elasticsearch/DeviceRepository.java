package es.uji.al259348.sliwwebmanager.repositories.elasticsearch;

import es.uji.al259348.sliwwebmanager.model.Device;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

public interface DeviceRepository extends ElasticsearchCrudRepository<Device, String>, DeviceRepositoryCustom {

    @Query("{ \"filtered\" : { \"filter\" : { \"term\" : { \"mac\" : \"?0\" } } } }")
    Device findOneByMac(String mac);

}
