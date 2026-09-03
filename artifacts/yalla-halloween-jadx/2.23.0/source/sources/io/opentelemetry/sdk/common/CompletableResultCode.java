package io.opentelemetry.sdk.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import p037OoooOo0.oOO00O;

/* JADX INFO: loaded from: classes5.dex */
public final class CompletableResultCode {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final CompletableResultCode f33192OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final CompletableResultCode f33193OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Boolean f33194OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f33195OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f33196OooO0OO = new Object();

    static {
        CompletableResultCode completableResultCode = new CompletableResultCode();
        completableResultCode.OooO0o0();
        f33192OooO0Oo = completableResultCode;
        CompletableResultCode completableResultCode2 = new CompletableResultCode();
        completableResultCode2.OooO00o();
        f33193OooO0o0 = completableResultCode2;
    }

    public static CompletableResultCode OooO0Oo(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f33192OooO0Oo;
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
                    CompletableResultCode completableResultCode3 = CompletableResultCode.f33192OooO0Oo;
                    boolean zOooO0O0 = this.f33197OooO0Oo.OooO0O0();
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
        synchronized (this.f33196OooO0OO) {
            if (this.f33194OooO00o == null) {
                this.f33194OooO00o = Boolean.FALSE;
                Iterator it = this.f33195OooO0O0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    public final boolean OooO0O0() {
        boolean z;
        synchronized (this.f33196OooO0OO) {
            Boolean bool = this.f33194OooO00o;
            z = bool != null && bool.booleanValue();
        }
        return z;
    }

    public final void OooO0OO(long j, TimeUnit timeUnit) {
        boolean z;
        synchronized (this.f33196OooO0OO) {
            z = this.f33194OooO00o != null;
        }
        if (z) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        OooO0o(new oOO00O(countDownLatch, 2));
        try {
            countDownLatch.await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void OooO0o(Runnable runnable) {
        synchronized (this.f33196OooO0OO) {
            if (this.f33194OooO00o != null) {
                runnable.run();
            } else {
                this.f33195OooO0O0.add(runnable);
            }
        }
    }

    public final void OooO0o0() {
        synchronized (this.f33196OooO0OO) {
            if (this.f33194OooO00o == null) {
                this.f33194OooO00o = Boolean.TRUE;
                Iterator it = this.f33195OooO0O0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }
}
