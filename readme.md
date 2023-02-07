# Пример работы с logback

##### Чтобы добавить LOGBACK в свой проект, необходимо подключить библиотеки slf4j-api, logback-classic, logback-core в зависимости pom.xml.
##### Для более детализированного вывода сообщений логов можно создать файл logback.xml, поместив его в папку resources в корне проекта. В данном файле можно прописать: уровень показа логов; аппендеры("appender")-направление потока (консольный вывод, файловый вывод); лэйауты ("layout")-формат визуализации логов.
##### Чтобы разделить приоритетность уровней разных пакетов в программе: в файле logback.xml перед нодой root обязательно проставляем ноду logger, в которой указываем имя папки и нужный level.