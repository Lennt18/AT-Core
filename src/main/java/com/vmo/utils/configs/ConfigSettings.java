package com.vmo.utils.configs;

import java.io.IOException;
import java.util.Properties;

public class ConfigSettings {
	private static final String BROWSER = "browser";
	private static final String DEFAULT_TIMEOUT = "timeout";

	private static final String POWERBUY_URL = "urlPowerBuy";

	private static final String PROPERTIES_FILE_NAME = "settings";

	private Properties configProperties;

	public ConfigSettings(String projectDirLocation) {
		try {
			setConfigProperties(PropertySettingStoreUtil.getSettings(projectDirLocation, PROPERTIES_FILE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setConfigProperties(Properties configProperties) {
		this.configProperties = configProperties;
	}

	public String getBrowser() {
		return this.configProperties.getProperty(BROWSER);
	}

	public String getDefaultTimeout() {
		return this.configProperties.getProperty(DEFAULT_TIMEOUT);
	}

	public String getPowerBuyUrl() {
		return this.configProperties.getProperty(POWERBUY_URL);
	}

	public Properties getConfigProperties() {
		return configProperties;
	}
}
