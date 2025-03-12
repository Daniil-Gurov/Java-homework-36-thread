package dz_patterns.Chain_of_Responsibility;

abstract class Handler { // Абстрактный класс обработчика
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}

class HandlerA extends Handler { // Обработчик A
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handler A обработал запрос: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class HandlerB extends Handler { // Обработчик B
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B обработал запрос: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class HandlerC extends Handler { // Обработчик C
    @Override
    public void handleRequest(String request) {
        if (request.equals("C")) {
            System.out.println("Handler C обработал запрос: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

public class ChainOfResponsibility {
    public static void main(String[] args) {
        // Создание обработчиков
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        // Установка цепочки обязанностей
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        // Отправка запросов
        handlerA.handleRequest("A"); // Обработает обработчик A
        handlerA.handleRequest("B"); // Обработает обработчик B
        handlerA.handleRequest("C"); // Обработает обработчик C
        handlerA.handleRequest("D"); // Не будет обработан никем
    }
}
