// КВБО-05-22 Симонов Вариант 27

// Создание блоков function…endfunction для вычисления каждой из функций
function y = f1(x)
y = -((x/3)-1)^3
endfunction

function y = f2(x)
y = 2*(abs(x-5)^(0.5))+2
endfunction

function y = f3(x)
y = 2*(x+2)
endfunction

xdata1 = linspace(-8,-4,10)
ydata1 = f1(xdata1)

xdata2 = linspace(-4,1,10)
ydata2 = f2(xdata2)

xdata3 = linspace(1,15,10)
ydata3 = f3(xdata3)

// Функции в разных графических окнах
scf(1)
plot(xdata1,ydata1)
xtitle('Функция 1','x','y')

scf(2)
plot(xdata2,ydata2)
xtitle('Функция 2','x','y')

scf(3)
plot(xdata3,ydata3)
xtitle('Функция 3','x','y')

// Графики функций и график всей функции каждый на своём интервале в своём подокне (функция subplot)
scf(4)
subplot(221)
plot(xdata1,ydata1)
plot(xdata2,ydata2)
plot(xdata3,ydata3)
subplot(222)
plot(xdata1,ydata1)
subplot(223)
plot(xdata2,ydata2)
subplot(224)
plot(xdata3,ydata3)


// Персональное задание в Приложении 2
scf(5)
function y = f4(x)
y = x^3 - sin(x) - 2.5
endfunction

x = linspace(-3,3,1000)
y = f4(x)
plot(x,y)
xgrid()

nol = fsolve([-1,1,1000],f4)
disp('Ноль функции')
disp(nol)

function [y1, p1, ind] = f5(x, ind)
y1 = x^3 - sin(x) - 2.5
p1 = 3*x^2 - cos(x)
endfunction

function [y1, p1, ind] = f6(x, ind)
y1 = (-x)^3 - sin((-x)) - 2.5
p1 = 3*(-x)^2 - cos((-x))
endfunction

x1= (-0.5354);

[ymin,xmin] = optim(f5, x1)
disp('Минимум функции')
disp(ymin)

x2=0.5354;
[ymax,xmax] = optim(f6,x2)
disp('Максимум функции')
disp(ymax)


























