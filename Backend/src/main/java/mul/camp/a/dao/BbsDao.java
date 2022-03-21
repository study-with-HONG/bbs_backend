package mul.camp.a.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import mul.camp.a.dto.BbsDto;

@Mapper
@Repository
public interface BbsDao {
	public List<BbsDto> getBbsList();
}