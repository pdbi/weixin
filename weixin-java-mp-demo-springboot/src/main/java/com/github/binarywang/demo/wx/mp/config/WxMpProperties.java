package com.github.binarywang.demo.wx.mp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.github.binarywang.demo.wx.mp.utils.JsonUtils;

import lombok.Data;

/**
 * wechat mp properties
 *
 * @author Binary Wang(https://github.com/binarywang)
 */
@Data
@ConfigurationProperties(prefix = "wx.mp")
public class WxMpProperties {
    private List<MpConfig> configs = new ArrayList<MpConfig>();

    @Data
    public static class MpConfig {
        public String getAppId() {
			return appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getSecret() {
			return secret;
		}

		public void setSecret(String secret) {
			this.secret = secret;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getAesKey() {
			return aesKey;
		}

		public void setAesKey(String aesKey) {
			this.aesKey = aesKey;
		}

		/**
         * 设置微信公众号的appid
         */
        private String appId = "wx692fdcd464c19a60";

        /**
         * 设置微信公众号的app secret
         */
        private String secret = "21509e7daf60c250f882a7ad1425e045";

        /**
         * 设置微信公众号的token
         */
        private String token = "xmfwxt";

        /**
         * 设置微信公众号的EncodingAESKey
         */
        private String aesKey = "ySqCN9hxHh3iTi7BQLUe5CAfWA0HWpxzkutvWxaWZn6";
    }

    @Override
    public String toString() {
        return JsonUtils.toJson(this);
    }
    
    public List<MpConfig> getConfigs() {
    		if(configs == null || configs.size() == 0) configs.add(new MpConfig());
    		return configs;
    }
}
