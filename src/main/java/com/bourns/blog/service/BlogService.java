package com.bourns.blog.service;

import com.bourns.blog.po.Blog;
import com.bourns.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {

//    查询
    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

//    按页面查询
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

//    按页面查询
    Page<Blog> listBlog(Pageable pageable);
    Page<Blog> listBlog(String query, Pageable pageable);
    Page<Blog> listBlog(Long tagId, Pageable pageable);
//    新增
    Blog saveBlog(Blog blog);

//    更新blog
    Blog updateBlog(Long id, Blog blog);

//    删除
    void deleteBlog(Long id);

    List<Blog> listRecommendBlogTop(Integer size);

    Map<String, List<Blog>> archiveBlog();

    Long countBlog();

}
