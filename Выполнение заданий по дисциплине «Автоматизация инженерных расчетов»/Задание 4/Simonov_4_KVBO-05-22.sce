//Симонов Вадим КВБО-05-22 Вариант 1 (29)

// Ввод
x = input("Введите x от -1 до 1: ");
if x > 1 | x < -1 then
    disp("!!! x должен быть от -1 до 1 !!!")
    quit
end
n = input("Введите N (целое число от 5 до 10): ");
if n < 5 | n > 10 then
    disp("!!! N должно быть от 5 до 10 !!!")
    quit
end

// Вычисление с использованием цикла for
arctg = 0;
L = (-1)^0;
P = x^(2*0+1);
C = (2*0+1);
T = L * P / C;
arctg = arctg + T;
for k = 1:n
    L = L*(-1);
    P = P * P^2;
    C = C + 2;
    T = L * P / C;
    arctg = arctg + T;
    k = k + 1
end
disp("Сумма ряда (цикл for): " + string(arctg));

// Ввод e
e = input("Введите e от 10^-5 до 10^-3): ");

if e <= 1e-5 | e >= 1e-3 then
    disp("!!! e должно быть от 10^-5 до 10^-3 !!!")
    quit
end

// Вычисление с использованием цикла while
arctg = 0;
L = (-1)^0;
P = x^(2*0+1);
C = (2*0+1);
T = L * P / C;
arctg = arctg + T;
while abs(T) > e
    L = L * (-1)
    P = P * P ^ 2;
    C = C + 2;
    T = L * P / C;
    arctg = arctg + T;
end

// Вычисление точного значения суммы с помощью стандартной математической функции atanh
result = atan(x);

disp("Точное значение суммы: " + string(result));
disp("Вычисленное значение суммы (с точностью e): " + string(arctg));
