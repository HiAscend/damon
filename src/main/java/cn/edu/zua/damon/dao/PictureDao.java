package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.Picture;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * PictureDao
 *
 * @author ascend
 * @date 2018/5/30 16:17.
 */
@Repository
public interface PictureDao {
    /**
     * 根据id查找
     *
     * @param id Long
     * @return 查询的对象
     */
    Picture findPictureById(Long id);

    /**
     * 返回相应的数据集合
     *
     * @param map Map
     * @return List
     */
    List<Picture> findPictures(Map<String, Object> map);

    /**
     * 数据数目
     *
     * @param map Map
     * @return Long
     */
    Long getTotalPictures(Map<String, Object> map);

    /**
     * 添加图片
     *
     * @param picture Picture
     * @return 受影响的行数
     */
    int insertPicture(Picture picture);

    /**
     * 修改图片
     *
     * @param picture Picture
     * @return 受影响的行数
     */
    int updatePicture(Picture picture);

    /**
     * 删除
     *
     * @param id Long
     * @return 受影响的行数
     */
    int deletePicture(Long id);


}
