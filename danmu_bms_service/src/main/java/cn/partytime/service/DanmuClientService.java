package cn.partytime.service;

import cn.partytime.model.DanmuClient;
import cn.partytime.repository.manager.DanmuClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuwei on 16/6/15.
 */

@Service
@Slf4j
public class DanmuClientService {

    @Autowired
    private DanmuClientRepository danmuClientRepository;


    public DanmuClient save(DanmuClient danmuClient){
        return danmuClientRepository.save(danmuClient);
    }

    public void deleteById(String id){
        danmuClientRepository.delete(id);
    }

    public DanmuClient findById(String id){
        return danmuClientRepository.findById(id);
    }


}
