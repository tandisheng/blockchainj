package xyz.huanxicloud.blockchainj.core.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: huanxi
 * @date: 2019/1/4 18:51
 * 应用启动配置
 */
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperty {
   private String publicKey;
   private String privateKey;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
