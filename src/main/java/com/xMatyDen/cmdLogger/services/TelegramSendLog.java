package com.xMatyDen.cmdLogger.services;

import com.xMatyDen.cmdLogger.CmdLogger;
import com.xMatyDen.cmdLogger.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class TelegramSendLog extends TelegramLongPollingBot {
    private ConfigServices configServices;
    private final String botToken;
    private final String botID;
    private final String chatID;
    private CmdLogger plugin;


    @Override
    public void onUpdateReceived(Update update) {}
    @Override
    public String getBotUsername() {return botID;}
    @Override
    public String getBotToken() {return botToken;}

    public TelegramSendLog(ConfigServices configServices, CmdLogger plugin) {
        this.configServices = configServices;
        this.botToken = configServices.getBotToken();
        this.botID = configServices.getBotID();
        this.chatID = configServices.getChatID();
        this.plugin = plugin;

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(this);
        } catch (Exception e) {
            plugin.getLogger().warning("Error while initializing Telegram Bot " + e.getMessage());
        }
    }

    public void sendLog(String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatID);
        sendMessage.setText(message);

        try {
            this.execute(sendMessage);
        } catch (Exception e) {
            this.plugin.getLogger().warning("Ошибка при отправке сообщения в Telegram: " + e.getMessage());
        }
    }
}
