package io.opentelemetry.sdk.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class CompletableResultCode {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final CompletableResultCode f32659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final CompletableResultCode f32660OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Boolean f32661OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f32662OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f32663OooO0OO = new Object();

    static {
        CompletableResultCode completableResultCode = new CompletableResultCode();
        completableResultCode.OooO0o0();
        f32659OooO0Oo = completableResultCode;
        CompletableResultCode completableResultCode2 = new CompletableResultCode();
        completableResultCode2.OooO00o();
        f32660OooO0o0 = completableResultCode2;
    }

    public static CompletableResultCode OooO0Oo(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f32659OooO0Oo;
        }
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final CompletableResultCode completableResultCode2 = (CompletableResultCode) it.next();
            completableResultCode2.OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.common.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    CompletableResultCode completableResultCode3 = CompletableResultCode.f32659OooO0Oo;
                    boolean zOooO0O0 = this.f32664OooO0Oo.OooO0O0();
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if (!zOooO0O0) {
                        atomicBoolean2.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        boolean z = atomicBoolean2.get();
                        CompletableResultCode completableResultCode4 = completableResultCode;
                        if (z) {
                            completableResultCode4.OooO00o();
                        } else {
                            completableResultCode4.OooO0o0();
                        }
                    }
                }
            });
        }
        return completableResultCode;
    }

    public final void OooO00o() {
        synchronized (this.f32663OooO0OO) {
            if (this.f32661OooO00o == null) {
                this.f32661OooO00o = Boolean.FALSE;
                Iterator it = this.f32662OooO0O0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    public final boolean OooO0O0() {
        boolean z;
        synchronized (this.f32663OooO0OO) {
            Boolean bool = this.f32661OooO00o;
            z = bool != null && bool.booleanValue();
        }
        return z;
    }

    public final void OooO0OO(long j, TimeUnit timeUnit) {
        boolean z;
        synchronized (this.f32663OooO0OO) {
            z = this.f32661OooO00o != null;
        }
        if (z) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.common.OooO0OO
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void OooO0o(Runnable runnable) {
        synchronized (this.f32663OooO0OO) {
            if (this.f32661OooO00o != null) {
                runnable.run();
            } else {
                this.f32662OooO0O0.add(runnable);
            }
        }
    }

    public final void OooO0o0() {
        synchronized (this.f32663OooO0OO) {
            if (this.f32661OooO00o == null) {
                this.f32661OooO00o = Boolean.TRUE;
                Iterator it = this.f32662OooO0O0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }
}
