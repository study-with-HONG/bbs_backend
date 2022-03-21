package mul.camp.a;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class DatabaseConfig {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		System.out.println("DatabaseConfig sqlSessionFactory()");
		
		SqlSessionFactoryBean sqlsfb = new SqlSessionFactoryBean();
		sqlsfb.setDataSource(dataSource);
		
		Resource arrResource[] = new PathMatchingResourcePatternResolver().getResources("classpath:sqls/*.xml");
		sqlsfb.setMapperLocations(arrResource);
		sqlsfb.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
		
		return (SqlSessionFactory)sqlsfb.getObject();		
	}
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}