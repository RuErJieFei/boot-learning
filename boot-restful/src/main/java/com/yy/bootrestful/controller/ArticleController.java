package com.yy.bootrestful.controller;

import com.yy.bootrestful.common.AjaxResponse;
import com.yy.bootrestful.model.Article;
import com.yy.bootrestful.model.Reader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ArticleController {

    /**
     * 获取一篇Article，使用GET方法,根据id查询一篇文章
     *
     * @param id id
     * @return AjaxResponse
     */
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        List<Reader> readers = List.of(Reader.builder().name("aaa").build(),
                Reader.builder().name("bbb").build());
        Article article = Article.builder()
                .id(id)
                .author("yy")
                .content("SpringBoot 从青铜到王者")
                .title("SpringBoot")
                .createTime(new Date())
                .updateTime(new Date())
                .readers(readers)
                .build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    /**
     * 增加一篇Article ，使用POST方法(RequestBody方式接收参数)
     *
     * @param article article
     * @param aaa     aaa
     * @return AjaxResponse
     */
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article, @RequestHeader("aaa") String aaa) {
        log.info("saveArticle:" + article);
        log.info("请求头aaa:" + aaa);
        return AjaxResponse.success(article);
    }

    /**
     * 增加一篇Article ，使用POST方法(RequestParam方式接收参数
     *
     * @param author     author
     * @param title      title
     * @param content    content
     * @param createTime createTime
     * @return AjaxResponse
     */
//    @PostMapping("/articles")
//    public AjaxResponse saveArticle(@RequestParam String author, @RequestParam String title, @RequestParam String content, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date createTime) {
//        log.info("saveArticle:" + author);
//        log.info("saveArticle:" + title);
//        log.info("saveArticle:" + content);
//        log.info("saveArticle:" + createTime);
//        return AjaxResponse.success();
//    }

    /**
     * 更新一篇Article，使用PUT方法，以id为主键进行更新
     *
     * @param article article
     * @return AjaxResponse
     */
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (article.getId() == null) {
            log.error("没有id");
            //article.id是必传参数，因为通常根据id去修改数据
        }
        log.info("updateArticle:" + article);
        return AjaxResponse.success();
    }

    /**
     * 删除一篇Article，使用DELETE方法，参数是id
     *
     * @param id id
     * @return AjaxResponse
     */
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }
}
