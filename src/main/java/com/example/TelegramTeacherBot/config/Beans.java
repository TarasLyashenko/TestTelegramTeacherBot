package com.example.TelegramTeacherBot.config;

import com.example.TelegramTeacherBot.bot.TestBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans
{
    @Bean
    public TestBot createTestBot()
    {
        return new TestBot("6386064861:AAGhz4pzU-CH7-rmxoYYPLSs-d5gc265wkM");
    }
}
