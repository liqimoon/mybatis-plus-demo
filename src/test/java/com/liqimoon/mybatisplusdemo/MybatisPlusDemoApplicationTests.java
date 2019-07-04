package com.liqimoon.mybatisplusdemo;

import com.liqimoon.mybatisplusdemo.mapper.SysUserMapper;
import com.liqimoon.mybatisplusdemo.model.database.SysUser;
import com.liqimoon.mybatisplusdemo.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

	@Resource
	private SysUserMapper sysUserMapper;

	@Test
	public void contextLoads() {
		System.out.println(("----- selectAll method test ------"));
		List<SysUser> userList = sysUserMapper.selectList(null);
		Assert.assertEquals(7, userList.size());
		userList.forEach(o -> System.out.println(JsonUtils.deserializer(o)));

        System.out.println(("----- getByUsername method test ------"));
        SysUser sysUser = sysUserMapper.getByUsername("liqi");
        System.out.println(JsonUtils.deserializer(sysUser));
	}
}
