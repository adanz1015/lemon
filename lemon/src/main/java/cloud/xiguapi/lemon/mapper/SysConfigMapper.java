package cloud.xiguapi.lemon.mapper;

import cloud.xiguapi.lemon.model.SysConfig;
import cloud.xiguapi.lemon.model.SysConfigExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author 大大大西西瓜皮🍉
 * date 00:50 2020-07-26
 * description:
 */
@Mapper
public interface SysConfigMapper {
	long countByExample(SysConfigExample example);

	int deleteByExample(SysConfigExample example);

	int deleteByPrimaryKey(Long id);

	int insert(SysConfig record);

	int insertSelective(SysConfig record);

	List<SysConfig> selectByExample(SysConfigExample example);

	SysConfig selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

	int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

	int updateByPrimaryKeySelective(SysConfig record);

	int updateByPrimaryKey(SysConfig record);
}