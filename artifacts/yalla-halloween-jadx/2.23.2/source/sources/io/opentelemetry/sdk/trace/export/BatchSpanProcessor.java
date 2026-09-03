package io.opentelemetry.sdk.trace.export;

import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.internal.DaemonThreadFactory;
import io.opentelemetry.sdk.resources.ResourceAttributes;
import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jctools.queues.MpscArrayQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class BatchSpanProcessor implements SpanProcessor {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f33020OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Worker f33021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f33022OooO0o0 = new AtomicBoolean(false);

    public static final class Worker implements Runnable {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final Logger f33023OooOOOO = Logger.getLogger(Worker.class.getName());

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final Queue<ReadableSpan> f33024OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SpanExporter f33025OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f33026OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f33027OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f33028OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f33029OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final AtomicInteger f33030OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ArrayBlockingQueue f33031OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final AtomicReference<CompletableResultCode> f33032OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final ArrayList<SpanData> f33033OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public volatile boolean f33034OooOOO0;

        public Worker() {
            throw null;
        }

        public Worker(SpanExporter spanExporter, long j, int i, long j2, AbstractQueue abstractQueue) {
            this.f33030OooOO0 = new AtomicInteger(Integer.MAX_VALUE);
            this.f33032OooOO0o = new AtomicReference<>();
            this.f33034OooOOO0 = true;
            this.f33025OooO0Oo = spanExporter;
            this.f33027OooO0o0 = j;
            this.f33026OooO0o = i;
            this.f33028OooO0oO = j2;
            this.f33024OooO = abstractQueue;
            this.f33031OooOO0O = new ArrayBlockingQueue(1);
            this.f33033OooOOO = new ArrayList<>(i);
        }

        public final void OooO00o() {
            Logger logger = f33023OooOOOO;
            ArrayList<SpanData> arrayList = this.f33033OooOOO;
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                try {
                    CompletableResultCode completableResultCodeExport = this.f33025OooO0Oo.export(Collections.unmodifiableList(arrayList));
                    completableResultCodeExport.OooO0OO(this.f33028OooO0oO, TimeUnit.NANOSECONDS);
                    if (!completableResultCodeExport.OooO0O0()) {
                        logger.log(Level.FINE, "Exporter failed");
                    }
                } catch (RuntimeException e) {
                    logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e);
                }
            } finally {
                arrayList.clear();
            }
        }

        public final CompletableResultCode OooO0O0() {
            boolean z;
            CompletableResultCode completableResultCode = new CompletableResultCode();
            AtomicReference<CompletableResultCode> atomicReference = this.f33032OooOO0o;
            while (true) {
                if (atomicReference.compareAndSet(null, completableResultCode)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.f33031OooOO0O.offer(Boolean.TRUE);
            }
            CompletableResultCode completableResultCode2 = atomicReference.get();
            return completableResultCode2 == null ? CompletableResultCode.f32659OooO0Oo : completableResultCode2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33029OooO0oo = System.nanoTime() + this.f33027OooO0o0;
            while (this.f33034OooOOO0) {
                if (this.f33032OooOO0o.get() != null) {
                    Queue<ReadableSpan> queue = this.f33024OooO;
                    int size = queue.size();
                    while (size > 0) {
                        ReadableSpan readableSpanPoll = queue.poll();
                        ArrayList<SpanData> arrayList = this.f33033OooOOO;
                        arrayList.add(readableSpanPoll.OooO0Oo());
                        size--;
                        if (arrayList.size() >= this.f33026OooO0o) {
                            OooO00o();
                        }
                    }
                    OooO00o();
                    AtomicReference<CompletableResultCode> atomicReference = this.f33032OooOO0o;
                    CompletableResultCode completableResultCode = atomicReference.get();
                    if (completableResultCode != null) {
                        completableResultCode.OooO0o0();
                        atomicReference.set(null);
                    }
                }
                while (!this.f33024OooO.isEmpty() && this.f33033OooOOO.size() < this.f33026OooO0o) {
                    this.f33033OooOOO.add(this.f33024OooO.poll().OooO0Oo());
                }
                if (this.f33033OooOOO.size() >= this.f33026OooO0o || System.nanoTime() >= this.f33029OooO0oo) {
                    OooO00o();
                    this.f33029OooO0oo = System.nanoTime() + this.f33027OooO0o0;
                }
                if (this.f33024OooO.isEmpty()) {
                    try {
                        long jNanoTime = this.f33029OooO0oo - System.nanoTime();
                        if (jNanoTime > 0) {
                            this.f33030OooOO0.set(this.f33026OooO0o - this.f33033OooOOO.size());
                            this.f33031OooOO0O.poll(jNanoTime, TimeUnit.NANOSECONDS);
                            this.f33030OooOO0.set(Integer.MAX_VALUE);
                        } else {
                            continue;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }

    static {
        OooO0o.OooO0o0("spanProcessorType");
        OooO0o.OooO00o("dropped");
    }

    public BatchSpanProcessor(SpanExporter spanExporter, long j, int i, int i2, long j2) {
        AbstractQueue arrayBlockingQueue;
        try {
            arrayBlockingQueue = new MpscArrayQueue(i);
        } catch (NoClassDefFoundError unused) {
            arrayBlockingQueue = new ArrayBlockingQueue(i);
        }
        Worker worker = new Worker(spanExporter, j, i2, j2, arrayBlockingQueue);
        this.f33021OooO0Oo = worker;
        new DaemonThreadFactory("BatchSpanProcessor_WorkerThread").newThread(worker).start();
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean OooOOO() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().OooO0OO(10L, TimeUnit.SECONDS);
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean o0000O() {
        return true;
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0000Oo(ReadableSpan readableSpan) {
        if (readableSpan.OooO0O0().OooO00o()) {
            Boolean bool = (Boolean) readableSpan.OooO00o(ResourceAttributes.f32907OooO00o);
            if (bool == null || !bool.booleanValue()) {
                Worker worker = this.f33021OooO0Oo;
                Queue<ReadableSpan> queue = worker.f33024OooO;
                if (queue.offer(readableSpan) && queue.size() >= worker.f33030OooOO0.get()) {
                    worker.f33031OooOO0O.offer(Boolean.TRUE);
                }
            }
        }
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0Oo0oo(Context context, ReadWriteSpan readWriteSpan) {
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final CompletableResultCode shutdown() {
        if (this.f33022OooO0o0.getAndSet(true)) {
            return CompletableResultCode.f32659OooO0Oo;
        }
        Logger logger = Worker.f33023OooOOOO;
        final Worker worker = this.f33021OooO0Oo;
        worker.getClass();
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        final CompletableResultCode completableResultCodeOooO0O0 = worker.OooO0O0();
        completableResultCodeOooO0O0.OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.trace.export.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                BatchSpanProcessor.Worker worker2 = worker;
                final CompletableResultCode completableResultCode2 = completableResultCodeOooO0O0;
                final CompletableResultCode completableResultCode3 = completableResultCode;
                worker2.f33034OooOOO0 = false;
                final CompletableResultCode completableResultCodeShutdown = worker2.f33025OooO0Oo.shutdown();
                completableResultCodeShutdown.OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.trace.export.OooO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Logger logger2 = BatchSpanProcessor.Worker.f33023OooOOOO;
                        boolean zOooO0O0 = completableResultCode2.OooO0O0();
                        CompletableResultCode completableResultCode4 = completableResultCode3;
                        if (zOooO0O0 && completableResultCodeShutdown.OooO0O0()) {
                            completableResultCode4.OooO0o0();
                        } else {
                            completableResultCode4.OooO00o();
                        }
                    }
                });
            }
        });
        return completableResultCode;
    }
}
