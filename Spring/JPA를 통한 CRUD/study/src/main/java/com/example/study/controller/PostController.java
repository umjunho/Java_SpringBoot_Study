package com.example.study.controller;


import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //클래스는 주소 겹쳐도 실행가능, 메소드는 오류
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain



//    아래와 동작은 같음
//    @RequestMapping(method = RequestMethod.POST, path="postMethod")
    @PostMapping(value="/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){

        return searchParam;
    }

    @PutMapping("putMethod")
    public void put(){

    }
    @PatchMapping("patchMethod")
    public void patch(){

    }
}
