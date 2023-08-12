package com.example.TelegramTeacherBot.service;

import com.example.TelegramTeacherBot.entity.Lesson;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface LessonService
{
    public void saveLesson(Lesson lesson);

    void addLesson(Update update);
}
