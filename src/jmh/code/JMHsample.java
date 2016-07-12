package org.openjdk.jmh.samples;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class JMHsample {

    @Benchmark
    public void wellHelloThere() {
        // this method was intentionally left blank. fff
    }

    /*
     * ============================== HOW TO RUN THIS TEST: ====================================
     *
     *
     * a) Via command-line:
     *    $ mvn clean install
     *    $ java -jar target/benchmarks.jar ".*JMHSample_01.*"
     *
     * JMH generates self-contained JARs, bundling JMH together with it.
     * The runtime options for the JMH are available with "-h":
     *    $ java -jar target/benchmarks.jar -h
     *
     * b) Via Java API:
     */

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + JMHsample.class.getSimpleName() + ".*")
                .forks(1)
                .build();

        new Runner(opt).run();
    }

}