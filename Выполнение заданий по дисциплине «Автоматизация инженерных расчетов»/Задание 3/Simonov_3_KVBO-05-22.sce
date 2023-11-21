// Симонов Вадим КВБО-05-22 Вариант 29

n = 130; // Размер массивов X и Y

// Нормальный закон распределения
Xnor = grand(1, n, "nor", 5, 1)
Ynor = grand(1, n, "nor", 5, 1)
Znor = grand(5, 5, "nor", 5, 1)
scf(1)
histplot(10, Xnor)
scf(2)
histplot(10, Ynor)

// Хи-квадратный закон распределения
Xchi = grand(1, n, "chi", 3)
Ychi = grand(1, n, "chi", 3)
Zchi = grand(5, 5, "chi", 3)
scf(3)
histplot(10, Xchi)
scf(4)
histplot(10, Ychi)

// Непрерывный равномерный закон распределения
Xunf = grand(1, n, "unf", 5, 11)
Yunf = grand(1, n, "unf", 5, 11)
Zunf = grand(5, 5, "unf", 5, 11)
scf(5)
histplot(10, Xunf)
scf(6)
histplot(10, Yunf)

// Закон распределения Пуассона
Xpoi = grand(1, n, "poi", 8)
Ypoi = grand(1, n, "poi", 8)
Zpoi = grand(5, 5, "poi", 8)
scf(7)
histplot(10, Xpoi)
scf(8)
histplot(10, Ypoi)

// Экспоненциальный закон распределения
Xexp = grand(1, n, "exp", 20)
Yexp = grand(1, n, "exp", 20)
Zexp = grand(5, 5, "exp", 20)
scf(9)
histplot(10, Xexp)
scf(10)
histplot(10, Yexp)

// Закон распределения Фишера
Xf = grand(1, n, "f", 3, 5)
Yf = grand(1, n, "f", 3, 5)
Zf = grand(5, 5, "f", 3, 5)
scf(11)
histplot(10, Xf)
scf(12)
histplot(10, Yf)

//---------------------------------------------------------------------------

// Математическое ожидание для вектора
mX=mean(Xnor)
disp("mX")
disp(mX)
mY=mean(Ynor)
disp("mY")
disp(mY)

// Среднеквадратическое отклонение для вектора
stdX=stdev(Xchi)
disp("stdX")
disp(stdX)
stdY=stdev(Ychi)
disp("stdY")
disp(stdY)

// Дисперсия для вектора
varX=variance(Xunf)
disp("varX")
disp(varX)
varY=variance(Yunf)
disp("varY")
disp(varY)

// Ковариация для вектора
fre=ones(n, n)
covX=covar(Xpoi, Ypoi, fre)
disp("covX")
disp(covX)

// Корреляция для вектора
corX=correl(Xexp,Yexp)
disp("corX")
disp(corX)

//------------------------------------------------------------------------

// Математическое ожидание для матрицы
mzR=mean(Znor, 'r') // по столбам
mzC=mean(Znor, 'c') // по строкам
disp("mzR")
disp(mzR)
disp("mzC")
disp(mzC)

// Среднеквадратическое отклонение для матрицы
stdR=stdev(Zchi,'r') // по столбам
stdC=stdev(Zchi,'c') // по строкам
disp("stdR")
disp(stdR)
disp("stdC")
disp(stdC)

// Дисперсия для матрицы
varR=variance(Zunf,'r') // по столбам
varC=variance(Zunf,'c') // по строкам
disp("varR")
disp(varR)
disp("varC")
disp(varC)

// Ковариация для матрицы
covZ=cov(Zpoi) // ковариационная матрица
disp("covZ")
disp(covZ)
