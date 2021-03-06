package cn.partytime.repository.manager;

import cn.partytime.model.DanmuClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by liuwei on 16/6/15.
 */

@EnableMongoRepositories(mongoTemplateRef = "managerMongoTemplate")
public interface DanmuClientRepository extends MongoRepository<DanmuClient,String> {

    public DanmuClient findById(String id);

    public DanmuClient findByRegistCode(String registCode);

    public DanmuClient findByDanmuClientCode(String danmuClientCode);
}
