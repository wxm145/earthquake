package com.earthquake.map.dao.earthquakeData;

import com.earthquake.map.common.BaseDao;
import com.earthquake.map.entity.EarthquakeEntity;
import com.earthquake.map.entity.Lnglat;
import com.earthquake.map.entity.TbUser;
import com.earthquake.map.vo.DepthAndMagnitude;
import com.earthquake.map.vo.EarthquakeVo;
import com.earthquake.map.vo.MarkVo;

import java.util.List;


public interface EarthquakeDataDao extends BaseDao<EarthquakeEntity> {
    int insertBatch(List<EarthquakeEntity> list);
    List<MarkVo> getMark(EarthquakeVo earthquake);
    List<String> getNation();
    List<Lnglat> getLnglat();
    int deleteData();
    DepthAndMagnitude getDepthAndMagnitude();
}
