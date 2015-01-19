package com.keemono.service.pages;

import com.keemono.common.bean.entities.htmlpage.HtmlPageVO;
import com.keemono.common.utils.dozer.DozerI;
import com.keemono.dao.entities.htmlpage.HtmlPage;
import com.keemono.dao.repositories.htmlpages.HtmlPageRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by edu on 15/01/2015.
 */
@Service
public class PagesServiceImpl implements PagesServiceI{

    @Autowired
    HtmlPageRepository htmlPageRepository;

    @Autowired
    DozerI<?> dozerI;

    @Override
    public void save(final HtmlPageVO htmlPageVO) {
        final HtmlPage htmlPage = dozerI.map(htmlPageVO,HtmlPage.class);
        htmlPageRepository.save(htmlPage);
    }

    @Override
    public List<HtmlPageVO> findAll() {
        final List<HtmlPage> list = htmlPageRepository.findAll();
        return dozerI.map(new DozerBeanMapper(), list, HtmlPageVO.class);
    }
}
