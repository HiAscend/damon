package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.BookDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BookDaoTest
 *
 * @author ascend
 * @date 2018/5/23 9:35.
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BookDaoTest extends AbstractTestNGSpringContextTests{
    private BookDao bookDao;

    public BookDaoTest() {
    }

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Test
    public void testFindBooks() {
        Map<String, Object> parameterMap = new HashMap<>();
        parameterMap.put("author", "%新%");
        // parameterMap.put("title", "材料成型概论");
        // parameterMap.put("isbn", "9787302290728");
        List<BookDO> bookDOList = bookDao.listBooks(parameterMap);
        System.out.println("bookDOList = " + bookDOList);
    }

    @Test
    public void testGetTotalBooks() {
        Map<String, Object> parameterMap = new HashMap<>();
        parameterMap.put("author", "%新%");
        // parameterMap.put("title", "材料成型概论");
        // parameterMap.put("isbn", "9787302290728");
        Long totalBooks = bookDao.countTotalBooks(parameterMap);
        System.out.println("totalBooks = " + totalBooks);
    }

    @Test
    public void testGetBookById() {
        BookDO bookDO = bookDao.getBookById(1L);
        System.out.println("bookDO = " + bookDO);
    }

}
