package ru.job4j.loop;



public class Counter {
    int start;
    int finish;



        public int add (int start, int finish) {
            this.start = start;
            this.finish = finish;
            int result = 0;


            for (start = 2; start <= finish; start++) {
                if (start % 2 == 0) {
                    result = result + start;
                }
            }
            return result;
        }
    }



