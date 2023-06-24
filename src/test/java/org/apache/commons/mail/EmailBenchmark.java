package org.apache.commons.mail;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class EmailBenchmark extends HtmlEmailTest {

    @Setup(Level.Iteration)
    public void setUp() {
        // inizializza lo stato della classe di benchmark qui
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void setMyProperty(EmailBenchmark state) throws Exception {
        // imposta la proprietà usando il setter
        state.testEmbedFile();
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void ok(EmailBenchmark state) throws Exception {
        // imposta la proprietà usando il setter
        state.testEmbedUrl();
    }

}