package wang.congjun;

import com.netflix.client.config.IClientConfig;
import com.netflix.client.config.IClientConfigKey;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WangCongJun
 * @date 2018/2/7
 * Created by WangCongJun on 2018/2/7.
 */
@Configuration
@ExcludeConfig
public class RibbonConfig {
    @Bean
    public IRule ribbonRule(IClientConfig config){
//        return new RoundRobinRule();
        return new RandomRule();
    }

//    @Bean
    public ServerList<Server> ribbonServerList(IClientConfig config){
        config.set(IClientConfigKey.Keys.ListOfServers,"localhost:8661");
        ConfigurationBasedServerList configurationBasedServerList = new ConfigurationBasedServerList();
        configurationBasedServerList.initWithNiwsConfig(config);
        return configurationBasedServerList;
    }
}
