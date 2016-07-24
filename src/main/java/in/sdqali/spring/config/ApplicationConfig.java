package in.sdqali.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "property")
@Configuration
public class ApplicationConfig {
  private final Map<String, String> map;
  private final List<String> list;
  private final Map<String, List<String>> listmap;
  private final Map<String, List<Map<String, String>>> maplistmap;

  @SuppressWarnings("unused")
  public ApplicationConfig() {
    this.map = new HashMap<>();
    this.listmap = new HashMap<>();
    this.list = new ArrayList<>();
    this.maplistmap = new HashMap<>();
  }

  public Map<String, String> getMap() {
    return map;
  }

  public List<String> getList() {
    return list;
  }

  public Map<String, List<String>> getListmap() {
    return listmap;
  }

  public Map<String, List<Map<String, String>>> getMaplistmap() {
    return maplistmap;
  }
}
