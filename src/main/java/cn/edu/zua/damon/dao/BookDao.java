package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.Book;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * BookDao
 *
 * @author ascend
 * @date 2018/5/22 14:18.
 */
@Repository
public interface BookDao extends Serializable {
    /**
     * 放回相应的数据集合
     *
     * @param map Map
     * @return List
     */
    List<Book> findBooks(Map<String, Object> map);

    /**
     * 书籍数目
     *
     * @param map Map
     * @return Long
     */
    Long getTotalBooks(Map<String, Object> map);

    /**
     * 添加书籍
     *
     * @param book Book
     * @return int 受影响的行
     */
    int insertBook(Book book);

    /**
     * 根据id查找书籍
     *
     * @param id BigInteger
     * @return Book
     */
    Book getBookById(Long id);
}
