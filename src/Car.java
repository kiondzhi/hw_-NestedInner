public class Car {
    String carBrand;
    int speed;
    int weight;
    private boolean isActive;

    public void start() {
        isActive = true;
        System.out.println("Двигатель запущен" );
        Engine engine = new Engine();
        Engine.Piston piston = engine.new Piston();
        piston.pistonActivity();
        engine.isRunning();
    }

    public void stop() {
        isActive = false;
        System.out.println("Двигатель остановлен" );
    }

    private class Engine {

        public void isRunning() {
            if (isActive) {
                System.out.println("Двигатель работает корректно" );
            } else {
                System.out.println("Двигатель работает некорректно" );
            }
        }

        public class Piston {

            public void pistonActivity() {
                if (isActive) {
                    System.out.println("\n" +
                            "1. Впуск: В цилиндр поступает смесь воздуха и топлива.\n" +
                            "2. Сжатие: Поршень движется вверх, сжимая эту смесь, что увеличивает давление и температуру.\n" +
                            "3. Сгорание: В конце сжатия свеча зажигания (в бензиновых двигателях) или высокая температура (в дизельных) воспламеняет смесь, вызывая взрыв.\n" +
                            "4. Рабочий ход: Взрыв создаёт мощное давление, которое толкает поршень вниз, преобразуя тепловую энергию в механическую.\n" +
                            "5. Выпуск: После рабочего хода поршень снова поднимается, выталкивая отработанные газы из цилиндра.\n" );
                } else {
                    System.out.println("Поршни неактивны" );
                }
            }
        }
    }
}
