package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.PictureDO;
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
    PictureDO getPictureById(Long id);

    /**
     * 条件查询相应的数据集合,limit
     * key:
     * targetUrl        like查询
     * pictureType      =
     * grade            =
     * <p>
     * limit:
     * start,size
     * 或者
     * number
     *
     * @param map Map
     * @return List
     */
    List<PictureDO> listPictures(Map<String, Object> map);

    /**
     * 条件查询总数
     * key:
     * targetUrl        like查询
     * pictureType      =
     * grade            =
     *
     * @param map Map
     * @return Long
     */
    Long countTotalPictures(Map<String, Object> map);

    /**
     * 添加图片，创建时间和修改时间可以不填写，应用服务器应该和数据库服务器保持同步
     *
     * @param picture PictureDO
     * @return 受影响的行数
     */
    int insertPicture(PictureDO picture);

    /**
     * 修改图片
     *
     * @param picture PictureDO
     * @return 受影响的行数
     */
    int updatePicture(PictureDO picture);

    /**
     * 删除
     *
     * @param id Long
     * @return 受影响的行数
     */
    int deletePicture(Long id);


}
