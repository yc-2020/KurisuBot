package xyz.yuchao.kurisubot.controller.dict;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yuchao.kurisubot.request.SearchWordRequest;
import xyz.yuchao.kurisubot.response.SearchWordResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yc
 * @since 2023-03-13
 */
@RestController
@RequestMapping("/dictEc")
public class DictEcController {

    @PostMapping("")
    public SearchWordResponse searchWord(SearchWordRequest request){
        SearchWordResponse searchWordResponse=new SearchWordResponse();
        return searchWordResponse;
    }
}
