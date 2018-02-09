import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WangCongJun
 * @date 2018/2/9
 * Created by WangCongJun on 2018/2/9.
 */
public interface Sink {

    String s="";

    @RequestMapping(s)
    void tyest();

}
