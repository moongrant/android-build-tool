package io.opentelemetry.sdk.trace.export;

import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.api.metrics.BoundLongCounter;
import io.opentelemetry.api.metrics.GlobalMeterProvider;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.compat.Consumer;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.internal.DaemonThreadFactory;
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
    public static final InternalAttributeKeyImpl f33548OooO0o = OooO0o.OooO0o0("spanProcessorType");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f33549OooO0oO = OooO0o.OooO00o("dropped");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f33550OooO0oo = "BatchSpanProcessor";

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Worker f33551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f33552OooO0o0 = new AtomicBoolean(false);

    public static final class Worker implements Runnable {

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final Logger f33553OooOOo0 = Logger.getLogger(Worker.class.getName());

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f33554OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final BoundLongCounter f33555OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final SpanExporter f33556OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final BoundLongCounter f33557OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f33558OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f33559OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f33560OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final Queue<ReadableSpan> f33561OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final AtomicInteger f33562OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final AtomicReference<CompletableResultCode> f33563OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final ArrayBlockingQueue f33564OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public volatile boolean f33565OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final ArrayList<SpanData> f33566OooOOOo;

        public Worker() {
            throw null;
        }

        public Worker(SpanExporter spanExporter, long j, int i, long j2, final AbstractQueue abstractQueue) {
            this.f33562OooOO0o = new AtomicInteger(Integer.MAX_VALUE);
            this.f33563OooOOO = new AtomicReference<>();
            this.f33565OooOOOO = true;
            this.f33556OooO0o = spanExporter;
            this.f33558OooO0oO = j;
            this.f33559OooO0oo = i;
            this.f33554OooO = j2;
            this.f33561OooOO0O = abstractQueue;
            this.f33564OooOOO0 = new ArrayBlockingQueue(1);
            Meter meterBuild = GlobalMeterProvider.f33054OooO00o.OooO0O0("io.opentelemetry.sdk.trace").build();
            meterBuild.OooO0O0("queueSize").OooO0O0().OooO00o().OooO0Oo("1").OooO0o0(new Consumer() { // from class: io.opentelemetry.sdk.trace.export.OooO0OO
                @Override // io.opentelemetry.compat.Consumer
                public final void OooO00o(ObservableLongMeasurement observableLongMeasurement) {
                    Logger logger = BatchSpanProcessor.Worker.f33553OooOOo0;
                    observableLongMeasurement.OooO00o(abstractQueue.size(), OooO.OooO0OO(BatchSpanProcessor.f33548OooO0o, BatchSpanProcessor.f33550OooO0oo));
                }
            });
            LongCounter longCounterBuild = meterBuild.OooO00o("processedSpans").OooO0OO().OooO00o().build();
            InternalAttributeKeyImpl internalAttributeKeyImpl = BatchSpanProcessor.f33548OooO0o;
            String str = BatchSpanProcessor.f33550OooO0oo;
            InternalAttributeKeyImpl internalAttributeKeyImpl2 = BatchSpanProcessor.f33549OooO0oO;
            this.f33555OooO0Oo = longCounterBuild.OooO00o(OooO.OooO0Oo(internalAttributeKeyImpl, str, internalAttributeKeyImpl2, Boolean.TRUE));
            this.f33557OooO0o0 = longCounterBuild.OooO00o(OooO.OooO0Oo(internalAttributeKeyImpl, str, internalAttributeKeyImpl2, Boolean.FALSE));
            this.f33566OooOOOo = new ArrayList<>(i);
        }

        public final void OooO00o() {
            Logger logger = f33553OooOOo0;
            ArrayList<SpanData> arrayList = this.f33566OooOOOo;
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                try {
                    CompletableResultCode completableResultCodeExport = this.f33556OooO0o.export(Collections.unmodifiableList(arrayList));
                    completableResultCodeExport.OooO0OO(this.f33554OooO, TimeUnit.NANOSECONDS);
                    if (completableResultCodeExport.OooO0O0()) {
                        this.f33557OooO0o0.OooO00o(arrayList.size());
                    } else {
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
            AtomicReference<CompletableResultCode> atomicReference = this.f33563OooOOO;
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
                this.f33564OooOOO0.offer(Boolean.TRUE);
            }
            CompletableResultCode completableResultCode2 = atomicReference.get();
            return completableResultCode2 == null ? CompletableResultCode.f33192OooO0Oo : completableResultCode2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33560OooOO0 = System.nanoTime() + this.f33558OooO0oO;
            while (this.f33565OooOOOO) {
                if (this.f33563OooOOO.get() != null) {
                    Queue<ReadableSpan> queue = this.f33561OooOO0O;
                    int size = queue.size();
                    while (size > 0) {
                        ReadableSpan readableSpanPoll = queue.poll();
                        ArrayList<SpanData> arrayList = this.f33566OooOOOo;
                        arrayList.add(readableSpanPoll.OooO00o());
                        size--;
                        if (arrayList.size() >= this.f33559OooO0oo) {
                            OooO00o();
                        }
                    }
                    OooO00o();
                    AtomicReference<CompletableResultCode> atomicReference = this.f33563OooOOO;
                    CompletableResultCode completableResultCode = atomicReference.get();
                    if (completableResultCode != null) {
                        completableResultCode.OooO0o0();
                        atomicReference.set(null);
                    }
                }
                while (!this.f33561OooOO0O.isEmpty() && this.f33566OooOOOo.size() < this.f33559OooO0oo) {
                    this.f33566OooOOOo.add(this.f33561OooOO0O.poll().OooO00o());
                }
                if (this.f33566OooOOOo.size() >= this.f33559OooO0oo || System.nanoTime() >= this.f33560OooOO0) {
                    OooO00o();
                    this.f33560OooOO0 = System.nanoTime() + this.f33558OooO0oO;
                }
                if (this.f33561OooOO0O.isEmpty()) {
                    try {
                        long jNanoTime = this.f33560OooOO0 - System.nanoTime();
                        if (jNanoTime > 0) {
                            this.f33562OooOO0o.set(this.f33559OooO0oo - this.f33566OooOOOo.size());
                            this.f33564OooOOO0.poll(jNanoTime, TimeUnit.NANOSECONDS);
                            this.f33562OooOO0o.set(Integer.MAX_VALUE);
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

    public BatchSpanProcessor(SpanExporter spanExporter, long j, int i, int i2, long j2) {
        AbstractQueue arrayBlockingQueue;
        try {
            arrayBlockingQueue = new MpscArrayQueue(i);
        } catch (NoClassDefFoundError unused) {
            arrayBlockingQueue = new ArrayBlockingQueue(i);
        }
        Worker worker = new Worker(spanExporter, j, i2, j2, arrayBlockingQueue);
        this.f33551OooO0Oo = worker;
        new DaemonThreadFactory("BatchSpanProcessor_WorkerThread").newThread(worker).start();
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final boolean OooOOO0() {
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
            Worker worker = this.f33551OooO0Oo;
            Queue<ReadableSpan> queue = worker.f33561OooOO0O;
            if (!queue.offer(readableSpan)) {
                worker.f33555OooO0Oo.OooO00o(1L);
            } else if (queue.size() >= worker.f33562OooOO0o.get()) {
                worker.f33564OooOOO0.offer(Boolean.TRUE);
            }
        }
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final void o0ooOO0(Context context, ReadWriteSpan readWriteSpan) {
    }

    @Override // io.opentelemetry.sdk.trace.SpanProcessor
    public final CompletableResultCode shutdown() {
        if (this.f33552OooO0o0.getAndSet(true)) {
            return CompletableResultCode.f33192OooO0Oo;
        }
        Logger logger = Worker.f33553OooOOo0;
        final Worker worker = this.f33551OooO0Oo;
        worker.getClass();
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        final CompletableResultCode completableResultCodeOooO0O0 = worker.OooO0O0();
        completableResultCodeOooO0O0.OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.trace.export.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                BatchSpanProcessor.Worker worker2 = worker;
                final CompletableResultCode completableResultCode2 = completableResultCodeOooO0O0;
                final CompletableResultCode completableResultCode3 = completableResultCode;
                worker2.f33565OooOOOO = false;
                final CompletableResultCode completableResultCodeShutdown = worker2.f33556OooO0o.shutdown();
                completableResultCodeShutdown.OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.trace.export.OooO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Logger logger2 = BatchSpanProcessor.Worker.f33553OooOOo0;
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
