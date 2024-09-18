package com.stax.main.singleton;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

//Паттерн Singleton
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Statistics {

    private final AtomicInteger successCount = new AtomicInteger();
    private final List<Exception> exceptions= new CopyOnWriteArrayList<>();

    private static volatile Statistics instance;

    public static Statistics getInstance() {
        if (instance == null) {
            synchronized (Statistics.class) {
                if (instance == null) {
                    instance = new Statistics();
                }
            }
        }

        return instance;
    }

    public void incrementSuccess() {
        successCount.incrementAndGet();
    }

    public void addException(Exception e) {
        exceptions.add(e);
    }

    public Integer getSuccessCount() {
        return successCount.get();
    }

    public Integer getFailedCount() {
        return exceptions.size();
    }

    public List<Exception> getExceptions(int startIndex, int count) {
        return exceptions.subList(startIndex, startIndex+count);
    }
}
