package xyz.yuchao.kurisubot.controller.translate;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yuchao.kurisubot.request.SearchWordRequest;
import xyz.yuchao.kurisubot.response.SearchWordResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/translate")
public class TranslateController {

    @PostMapping("/ec")
    public SearchWordResponse searchWord(@RequestBody @Valid SearchWordRequest request){
        SearchWordResponse searchWordResponse=new SearchWordResponse();
        return searchWordResponse;
    }
}
