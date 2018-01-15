package com.vm.dao.mapper.custom;

import com.vm.dao.qo.VmMoviesQueryBean;
import com.vm.dao.po.custom.CustomVmMovies;
import com.vm.dao.po.VmMovies;
import com.vm.dao.po.VmTags;
import com.vm.dao.qo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomVmMoviesMapper {

    List<CustomVmMovies> getMovies(@Param("page") PageBean page, @Param("query") VmMoviesQueryBean query);

    Long getMoviesCount(@Param("page") PageBean page, @Param("query") VmMoviesQueryBean query);

    CustomVmMovies getMovie(@Param("movieId") Long movieId);

    List<VmTags> getTagsOfMovie(@Param("movieId") Long movieId);

    List<CustomVmMovies> getAboutTagsMovies(@Param("page") PageBean page, @Param("query") VmMoviesQueryBean query);

    List<CustomVmMovies> getAboutFilmmakersMovies(@Param("page") PageBean page, @Param("query") VmMoviesQueryBean query);
}