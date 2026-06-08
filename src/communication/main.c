#include <stdio.h>
#include <time.h>
#include <stdlib.h>

// ********************************************************************************
// RTS SumSem 2024
// Exercise: Execution Times
// ********************************************************************************


// calculate execution time
struct timespec diff_time(struct timespec *t_Start, struct timespec *t_Compl) {

    struct timespec dt;

    // subtract seconds
    dt.tv_sec = t_Compl->tv_sec - t_Start->tv_sec;

    // subtract nanoseconds
    if (t_Compl->tv_nsec < t_Start->tv_nsec) {
        dt.tv_sec--;
        dt.tv_nsec = 1000000000 + t_Compl->tv_nsec - t_Start->tv_nsec;
    } else {
        dt.tv_nsec = t_Compl->tv_nsec - t_Start->tv_nsec;
    }

    return dt;
}


// Do not change the function myfunc1 !
int myfunc1 (int in){
    int i, j = in;

    for(i = 0; i <= 888; i++)
        j = j + i;

    return j;
}


// Do not change the function myfunc2 !
int myfunc2 (int in){

    int val1, i;
    float val2, val3;

    for (i = 0; i < 4800; i++) {

        val1 = in * in * i;
        val2 = (in + i) * (in + i) * (in + i);
        val3 = val2 / val1;
    }

    return val3;
}


// Main program
int main (int argc, char **argv){

    int i, randomValue;

    // probability for myfunc1
    int probability;

    // timestamps
    struct timespec t_Start, t_Compl;

    // execution time
    struct timespec dt_exec;


    // check command line argument
    if (argc != 2) {
        printf("Usage: %s <probability>\n", argv[0]);
        return 1;
    }

    probability = atoi(argv[1]);

    printf("myfunc1 probability: %d\n", probability);
    printf("myfunc2 probability: %d\n", 100 - probability);


    // random seed
    srand(time(NULL));


    // start timestamp
    clock_gettime(CLOCK_REALTIME, &t_Start);


    // 500000 iterations
    for (i = 0; i < 500000; i++) {

        randomValue = rand() % 100;

        if (randomValue < probability)
            myfunc1(randomValue);
        else
            myfunc2(randomValue - 1234);
    }


    // completion timestamp
    clock_gettime(CLOCK_REALTIME, &t_Compl);


    // calculate execution time
    dt_exec = diff_time(&t_Start, &t_Compl);


    // print results
    printf("Start-time      : %11ld s %9ld ns\n",
           t_Start.tv_sec, t_Start.tv_nsec);

    printf("Completion-time : %11ld s %9ld ns\n",
           t_Compl.tv_sec, t_Compl.tv_nsec);

    printf("Execution-time  : %11ld s %9ld ns\n",
           dt_exec.tv_sec, dt_exec.tv_nsec);

    return 0;
}