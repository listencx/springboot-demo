package com.cx.springboot;

import java.util.concurrent.Future;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cx.springboot.App;
import com.cx.springboot.domain.Task;
import com.cx.springboot.domain.User;
import com.cx.springboot.domain.UserRepository;
import com.cx.springboot.rabbitmq.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class AppTest {

//	@Autowired
//	private Sender sender;
//	@Autowired
//	private Task task;
//	@Autowired
//	private UserRepository userRepository;
//
//	@Test
//	public void hello() throws Exception {
//		sender.send();
//	}
//
//	@Test
//	public void taskOrder() throws Exception {
//		long start = System.currentTimeMillis();
//		Future<String> task1 = task.doTaskOne();
//		Future<String> task2 = task.doTaskTwo();
//		Future<String> task3 = task.doTaskThree();
//		while (true) {
//			if (task1.isDone() && task2.isDone() && task3.isDone()) {
//				break;
//			}
//			Thread.sleep(1000);
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
//
//	}
//
//	@Test
//	public void test() throws Exception {
//		User u1 = userRepository.findByUsersName("123");
//		System.out.println("第一次查询：" + u1.getUsersPass());
//
//		User u2 = userRepository.findByUsersName("123");
//		System.out.println("第二次查询：" + u2.getUsersPass());
//	}

}
