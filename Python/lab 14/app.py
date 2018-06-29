from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_marshmallow import Marshmallow

app = Flask(__name__)#основний обєкт в фласку
ma = Marshmallow(app) #Створюємо об'єкт маршмелов і додаєм в нього наш фласк

app.config.from_pyfile('config.py') #Налаштовуємо конфігурацію для фласк сервера(передаємо назву файлу у якому є дані конфігуряції)

db = SQLAlchemy(app)

from views import *#*ІМПОРТ ВСЬОГО
import sys#імпорт системи пайтона

sys.path.insert(0, 'views')


if __name__ == '__main__':
    app.run()
