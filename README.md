📦 Logger Plugin for Minecraft (Paper)
A simple plugin for logging specific player commands to a Telegram group using your own bot.

🌍 English
🔧 How to Use the Plugin
Install the plugin on your server and start the server to enable it.

Navigate to the configuration file:
plugins/Logger/config.yml

⚙️ Configuration: config.yml
bot-token: ""     # Insert your Telegram bot token
bot-id: "@username"  # Insert your bot’s public username
chat-id: ""       # Insert the Telegram group ID where logs will be sent
log-commands:
  - "/command1"
  - "/command2"
  - "/command3"
🧾 Instructions
🔹 bot-token
Create a bot using the official @BotFather.

Use the command /newbot and follow the instructions.

Copy the generated token and paste it into bot-token.

🔹 bot-id
Use the format @your_bot_username.

🔹 chat-id
Create a private group in Telegram.

Add the bot @my_id_bot to the group.

The bot will send the group ID to the chat.

Copy and paste this ID into chat-id.

Then add your own bot (created earlier) to the group.

🔹 log-commands
List the commands you want to monitor.

Example:
log-commands:
  - "/ban"
  - "/kick"
  - "/op"
📤 Log Format
When a listed command is used, the bot sends a message like:
Player [PlayerName] ran command: [/ban Player cheat] at world [world_name] [(X, Y, Z)]

🇷🇺 Русский
🔧 Как использовать плагин
Установите плагин на сервер и запустите сервер, чтобы он активировался.

Перейдите в файл настроек:
plugins/Logger/config.yml

⚙️ Конфигурация: config.yml
bot-token: ""     # Вставьте токен Телеграм-бота
bot-id: "@username"  # Вставьте публичный username бота
chat-id: ""       # Вставьте ID группы в Телеграм
log-commands:
  - "/command1"
  - "/command2"
  - "/command3"
🧾 Инструкция
🔹 bot-token
Создайте бота через официального @BotFather.

Введите команду /newbot и следуйте инструкциям.

Скопируйте полученный токен и вставьте в bot-token.

🔹 bot-id
Формат: @имя_бота (username).

🔹 chat-id
Создайте частную группу в Телеграм.

Добавьте туда бота @my_id_bot.

Бот отправит ID группы в чат.

Вставьте этот ID в chat-id.

Добавьте своего бота в группу, чтобы он мог отправлять логи.

🔹 log-commands
Укажите команды, которые необходимо логировать.

Пример:
log-commands:
  - "/ban"
  - "/kick"
  - "/op"

📤 Формат сообщения
Когда указанные команды используются, бот отправляет сообщение в чат:
Player [Ник] ran command: [/ban Player cheat] at world [название_мира] [(X, Y, Z)]


✅ Supports Minecraft Paper Core
📬 Send logs directly to Telegram
🛠️ Customizable command list
