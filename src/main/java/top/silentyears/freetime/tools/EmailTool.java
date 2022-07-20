package top.silentyears.freetime.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * 邮件工具类
 * @author : WuChaojie
 * @date : 2022/6/20 16:15
 */
public class EmailTool {

    @Value("${spring.mail.from}")
    private String from;

    /**
     * Spring Boot 提供了一个发送邮件的简单抽象，使用的是下面这个接口，这里直接注入即可使用
     */
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String mailAddress, String title, String msg) {
        try {
            //创建SimpleMailMessage对象
            SimpleMailMessage message = new SimpleMailMessage();
            //邮件发送人
            message.setFrom(from);
            //邮件接收人
            message.setTo(mailAddress);
            //邮件主题
            message.setSubject(title);
            //邮件内容
            message.setText(msg);
            //发送邮件
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
