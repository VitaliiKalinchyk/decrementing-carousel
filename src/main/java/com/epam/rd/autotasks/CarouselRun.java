package com.epam.rd.autotasks;

public class CarouselRun {
    private final DecrementingCarousel carousel;
    private int currentPosition=0;

    public CarouselRun(DecrementingCarousel carousel) {
        this.carousel=carousel;
    }

    public int next() {
        if (isFinished())

            return -1;
        if (currentPosition >= carousel.capacity)
            currentPosition = 0;

        while (carousel.values[currentPosition]==0){
            currentPosition++;
            if (currentPosition >= carousel.capacity)
                currentPosition = 0;
        }

        return carousel.values[currentPosition++]--;
    }

    public boolean isFinished() {
        for (int i:carousel.values) {
            if (i>0)
                return false;
        }
        return true;
    }
}
