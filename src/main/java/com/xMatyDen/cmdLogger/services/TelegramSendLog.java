package com.xMatyDen.cmdLogger.services;

import com.xMatyDen.cmdLogger.CmdLogger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class TelegramSendLog extends TelegramLongPollingBot {
    private final ConfigServices configServices;
    private final String botToken;
    private final String botID;
    private final String chatID;

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

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(this);
        } catch (Exception e) {
            plugin.getLogger().warning("Error while initializing Telegram Bot " + e.getMessage());
        }
    }


}
