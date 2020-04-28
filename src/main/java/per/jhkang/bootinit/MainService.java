package per.jhkang.bootinit;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    //@Autowired
    private InfoRepository infoRepository;

    public MainService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public String nameHello(String name){
        return name + " hello!!";
    }

    public String getInfo(){
        System.out.println(""+ infoRepository.findAll());
        return ""+infoRepository.findAll();
    }

}
