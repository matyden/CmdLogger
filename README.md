English / Русский

HOW TO USE PLUGIN?
Install the plugin on your server and start the server to enable the plugin.
Then, go to the config.yml file in the plugins/Logger folder.

config.yml:
    bot-token: "" – Insert the Telegram bot token inside the quotes.
        - Create a bot using the official Telegram Bot @BotFather.
        - Enter the command /newbot and follow the instructions from BotFather.
        - At the end, copy and paste the generated token into the config.yml file (bot-token: "").
    bot-id: "@username" - Inert the public bot's username.
    chat-id: "" – Insert the group ID inside the quotes where the bot will send logs.
        - Create a private group in Telegram.
        - Add the bot "What's my Telegram ID?" (@my_id_bot) to the group.
        - As soon as you add the bot, it will send the group ID in the chat.
        - Copy and paste the ID into the configuration file (chat-id: "").
        - After that, you can add the previously created bot to your private group to send logs.
    log-commands: – Specify all necessary commands to log in the following format:
        - "/command1"
        - "/command2"
        - "/command3"
The specified commands will be sent to the chat via the bot in the following format:
Player [nick] ran command: [/ban Player cheat (like an example)] at world [world's name] [(coordinates)]

Как использовать плагин?
Установите плагин на свой сервер и запустите сервер, чтобы плагин включился.
После зайдите в файл config.yml в папке plugins/Logger.

config.yml:
    bot-token: "" - внесите в скобки токен Телеграм бота.
        - Создайте бота в официальном Боте Телеграм @BotFather.
        - Введите команду /newbot и следуйте дальнейшим инструкциям от BotFather.
        - В конце скопируйте и вставьте полученный токен в файл config.yml (bot-token: "").
    chat-id: "" - вставьте ID группы в скобки, куда бот будет отправлять логи.
        - Создайте частную группу в Телеграм.
        - Добавьте в эту группу бота "What's my Telegram ID?" (@my_id_bot).
        - Сразу после добавления бота в группу, он пришлет в чат ID группы.
        - Скопируйте и вставьте ID в настройки конфигурации (chat-id: "").
        - После можете добавить ранее созданного Вами бота для отправки логов в вашу приватную группу.
    bot-id: "@username" - Вставьте публичный username бота в скобки.
    log-commands: - укажите все необходимые команды для логирования в формате:
        - "/command1"
        - "/command2"
        - "/command3"
Указанные команды будут отправляться в чат через бота в формате:
Player [ник игрока] ran command: [/ban Player cheat (как пример)] at world [название мира] [(координаты)]
