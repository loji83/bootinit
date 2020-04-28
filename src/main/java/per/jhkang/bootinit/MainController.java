package per.jhkang.bootinit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    //@Autowired
    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping(value="/")
    //@ResponseBody/
    public String hello(){
        return "Hello Spring world!";
    }

    @GetMapping(value="/name")
    // @ResponseBody
    public String hello2(){
        return mainService.nameHello("Kang");
    }

    @GetMapping(value="/name/{name}")
    // @ResponseBody
    public String hello2(@PathVariable("name") String name){
        return mainService.nameHello(name);
    }

    @GetMapping(value="/info/{name}")
    // @ResponseBody
    public String info(@PathVariable("name") String name){
        return mainService.nameHello(name);
    }

    @GetMapping(value="/info")
    //@ResponseBody
    public String info2(){
        return mainService.getInfo();
    }

    @GetMapping(value = "map")
    public Map<String, Object> getMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("hello", 3);

        return map;
    }

}
