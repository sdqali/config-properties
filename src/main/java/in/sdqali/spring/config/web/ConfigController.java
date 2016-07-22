package in.sdqali.spring.config.web;

import in.sdqali.spring.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/configs")
public class ConfigController {
  private final ApplicationConfig applicationConfig;

  @Autowired
  public ConfigController(ApplicationConfig applicationConfig) {
    this.applicationConfig = applicationConfig;
  }

  @RequestMapping(method = GET,
      path = "/map",
      produces = APPLICATION_JSON_VALUE)
  public Map<String, String> map() {
    return applicationConfig.getMap();
  }

  @RequestMapping(method = GET,
      path = "/list",
      produces = APPLICATION_JSON_VALUE)
  public List<String> list() {
    return applicationConfig.getList();
  }

  @RequestMapping(method = GET,
      path = "/listmap",
      produces = APPLICATION_JSON_VALUE)
  public Map<String, List<String>> listmap() {
    return applicationConfig.getListmap();
  }
}
