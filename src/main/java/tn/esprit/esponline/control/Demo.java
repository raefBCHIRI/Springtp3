package tn.esprit.esponline.control;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.esprit.esponline.config.BeansConfiguration;
public class Demo {
	private static final Logger logger = Logger.getLogger(Demo.class);
	private ApplicationContext context;
	
	public void verifyBeans () {

		logger.info("In verifyBeans() : ");

		// Chargement du Conteneur Spring IoC :
		//context = new ClassPathXmlApplicationContext("tp1-beans.xml");
		context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		logger.debug("Contains userControlImpl " + context.containsBeanDefinition("userControl"));
		logger.debug("Contains userServiceImpl " + context.containsBeanDefinition("userService"));
		logger.debug("Contains userDAOImpl " + context.containsBeanDefinition("userDAO"));

		logger.info("Out of verifyBeans().");
		}
}
