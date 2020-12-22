# Отчёт о создании приложения "Получи рубль за каждые 100!".
## Краткое описание
1. **Дата создания** - 22.12.2020
1. Было создано приложение на основе следующего кода:

```ppublic class Main {
    public static void main(String[] args) {
        int amount = 100;
        int addition = 15000;
        int cost = 100;
        int bonus = addition / cost;
        int limit = 1000;
        int total;
        if (addition > limit) {
            total = amount + addition + bonus;
        } else {
              total = amount + addition;}
    System.out.println(total);
}
}
```
где 
* amount - текущая сумма на счете
* addition - сумма сумма пополнения счета
* cost - стоимость одного подарочного рубля
* bonus - количество подарочных рублей 
* limit - минимальная сумма пополнения, необходимая для начисления подарочных рублей
* total - итоговая сумма на счете

3. Было проведено тестирование приложения по подсчету и начислению подарочных рублей.

**В качестве тестовых данных использовались данные:**
* [Домашнее задание к занятию «2.1. Примитивные типы данных, условные операторы, выход за границы типов и погрешность вычислений](https://github.com/netology-code/javaqa-homeworks/tree/master/data)

**Разработка и тестирование производилось в следующем окружении:**
* OC Windows 10 Pro
* 64-bit Operation System, x64-based processor
* Java version "11.0.9.1" 2020-11-04
