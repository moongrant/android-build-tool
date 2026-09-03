package p653o0ooo00O;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.oo00oO;
import p648o0ooOoo.oO000o00;
import p649o0ooOooo.p3;
import p652o0ooo000.o0000;
import p654o0ooo00o.o000O;
import p654o0ooo00o.o000O00;
import p654o0ooo00o.o000O00O;
import p654o0ooo00o.o000OOo0;
import p657o0ooo0o0.o000O0o;
import p662o0oooO0O.o0O0O0o0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0 implements o00OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59304OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OoO00O f59305OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f59306OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f59307OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000O000 f59308OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o0 f59309OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f59310OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Object f59311OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o0000oo f59312OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f59313OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o0000O0O f59314OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public o0000O00 f59315OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f59316OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f59317OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f59318OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile boolean f59319OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public volatile o0000O0O f59320OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public volatile o0000O00 f59321OooOo00;

    public final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o00OOO00 f59322OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f59323OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public volatile AtomicInteger f59324OooO0o0;

        public OooO00o(@NotNull o0000O0 this$0, o00OOO00 responseCallback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f59323OooO0o = this$0;
            this.f59322OooO0Oo = responseCallback;
            this.f59324OooO0o0 = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OoO00O o0ooo00o2;
            String strStringPlus = Intrinsics.stringPlus("OkHttp ", this.f59323OooO0o.f59307OooO0o0.f57828OooO00o.OooO());
            o0000O0 o0000o1 = this.f59323OooO0o;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strStringPlus);
            try {
                o0000o1.f59304OooO.OooO();
                boolean z = false;
                try {
                    try {
                        try {
                            this.f59322OooO0Oo.onResponse(o0000o1, o0000o1.OooO0oO());
                            o0ooo00o2 = o0000o1.f59305OooO0Oo;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                o000O0o o000o0o2 = o000O0o.f59618OooO00o;
                                o000O0o o000o0o3 = o000O0o.f59618OooO00o;
                                String strStringPlus2 = Intrinsics.stringPlus("Callback failure for ", o0000O0.OooO0O0(o0000o1));
                                o000o0o3.getClass();
                                o000O0o.OooO(e, 4, strStringPlus2);
                            } else {
                                this.f59322OooO0Oo.onFailure(o0000o1, e);
                            }
                            o0ooo00o2 = o0000o1.f59305OooO0Oo;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            o0000o1.cancel();
                            if (!z) {
                                IOException iOException = new IOException(Intrinsics.stringPlus("canceled due to ", th));
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.f59322OooO0Oo.onFailure(o0000o1, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        o0000o1.f59305OooO0Oo.f57885OooO0Oo.OooO0O0(this);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                o0ooo00o2.f57885OooO0Oo.OooO0O0(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    public static final class OooO0O0 extends WeakReference<o0000O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Object f59325OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o0000O0 referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f59325OooO00o = obj;
        }
    }

    public static final class OooO0OO extends o0O0O0o0 {
        public OooO0OO() {
        }

        @Override // p662o0oooO0O.o0O0O0o0
        public final void OooOO0o() {
            o0000O0.this.cancel();
        }
    }

    public o0000O0(@NotNull o0OoO00O client, @NotNull o0O00O0o originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f59305OooO0Oo = client;
        this.f59307OooO0o0 = originalRequest;
        this.f59306OooO0o = z;
        this.f59308OooO0oO = client.f57887OooO0o0.f57761OooO00o;
        this.f59309OooO0oo = client.f57889OooO0oo.create(this);
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0oO(client.f57905OooOoO, TimeUnit.MILLISECONDS);
        this.f59304OooO = oooO0OO;
        this.f59310OooOO0 = new AtomicBoolean();
        this.f59317OooOOo = true;
    }

    public static final String OooO0O0(o0000O0 o0000o1) {
        StringBuilder sb = new StringBuilder();
        sb.append(o0000o1.f59319OooOOoo ? "canceled " : "");
        sb.append(o0000o1.f59306OooO0o ? "web socket" : "call");
        sb.append(" to ");
        sb.append(o0000o1.f59307OooO0o0.f57828OooO00o.OooO());
        return sb.toString();
    }

    @Nullable
    public final IOException OooO(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f59317OooOOo) {
                this.f59317OooOOo = false;
                if (!this.f59316OooOOOo && !this.f59318OooOOo0) {
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z ? OooO0o0(iOException) : iOException;
    }

    @Override // p641o0ooOO0o.o00OO
    @NotNull
    public final o0O00O0o OooO00o() {
        return this.f59307OooO0o0;
    }

    @Override // p641o0ooOO0o.o00OO
    @NotNull
    public final o0O00o00 OooO0OO() {
        if (!this.f59310OooOO0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f59304OooO.OooO();
        o000O0o o000o0o2 = o000O0o.f59618OooO00o;
        this.f59311OooOO0O = o000O0o.f59618OooO00o.OooO0oO();
        this.f59309OooO0oo.callStart(this);
        try {
            oo00oO oo00oo = this.f59305OooO0Oo.f57885OooO0Oo;
            synchronized (oo00oo) {
                Intrinsics.checkNotNullParameter(this, "call");
                oo00oo.f57968OooO0Oo.add(this);
            }
            o0O00o00 o0o00o00OooO0oO = OooO0oO();
            this.f59305OooO0Oo.f57885OooO0Oo.OooO0OO(this);
            return o0o00o00OooO0oO;
        } catch (Throwable th) {
            this.f59305OooO0Oo.f57885OooO0Oo.OooO0OO(this);
            throw th;
        }
    }

    public final void OooO0Oo(@NotNull o0000O0O connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = oO000o00.f58124OooO00o;
        if (!(this.f59314OooOOO0 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f59314OooOOO0 = connection;
        connection.f59358OooOOOo.add(new OooO0O0(this, this.f59311OooOO0O));
    }

    public final void OooO0o(boolean z) {
        o0000O00 o0000o00;
        synchronized (this) {
            if (!this.f59317OooOOo) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (o0000o00 = this.f59321OooOo00) != null) {
            o0000o00.f59330OooO0Oo.cancel();
            o0000o00.f59327OooO00o.OooO0oo(o0000o00, true, true, null);
        }
        this.f59315OooOOOO = null;
    }

    public final <E extends IOException> E OooO0o0(E e) {
        E interruptedIOException;
        Socket socketOooOO0;
        byte[] bArr = oO000o00.f58124OooO00o;
        o0000O0O o0000o0o2 = this.f59314OooOOO0;
        if (o0000o0o2 != null) {
            synchronized (o0000o0o2) {
                socketOooOO0 = OooOO0();
            }
            if (this.f59314OooOOO0 == null) {
                if (socketOooOO0 != null) {
                    oO000o00.OooO0Oo(socketOooOO0);
                }
                this.f59309OooO0oo.connectionReleased(this, o0000o0o2);
            } else {
                if (!(socketOooOO0 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f59313OooOOO && this.f59304OooO.OooOO0()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e != null) {
            o0 o0Var = this.f59309OooO0oo;
            Intrinsics.checkNotNull(interruptedIOException);
            o0Var.callFailed(this, interruptedIOException);
        } else {
            this.f59309OooO0oo.callEnd(this);
        }
        return interruptedIOException;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    @NotNull
    public final o0O00o00 OooO0oO() throws Throwable {
        boolean z;
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f59305OooO0Oo.f57886OooO0o);
        arrayList.add(new o000OOo0(this.f59305OooO0Oo));
        arrayList.add(new o000O00(this.f59305OooO0Oo.f57894OooOOO0));
        this.f59305OooO0Oo.getClass();
        arrayList.add(new p3());
        arrayList.add(o0000Ooo.f59362OooO00o);
        if (!this.f59306OooO0o) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f59305OooO0Oo.f57888OooO0oO);
        }
        arrayList.add(new o000O00O(this.f59306OooO0o));
        o0O00O0o o0o00o0o = this.f59307OooO0o0;
        o0OoO00O o0ooo00o2 = this.f59305OooO0Oo;
        try {
            o0O00o00 o0o00o00OooO0OO = new o000O(this, arrayList, 0, null, o0o00o0o, o0ooo00o2.f57907OooOoOO, o0ooo00o2.f57909OooOoo0, o0ooo00o2.f57908OooOoo).OooO0OO(this.f59307OooO0o0);
            if (this.f59319OooOOoo) {
                oO000o00.OooO0OO(o0o00o00OooO0OO);
                throw new IOException("Canceled");
            }
            OooO(null);
            return o0o00o00OooO0OO;
        } catch (IOException e) {
            try {
                IOException iOExceptionOooO = OooO(e);
                if (iOExceptionOooO == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionOooO;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    OooO(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                OooO(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E OooO0oo(@NotNull o0000O00 exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.areEqual(exchange, this.f59321OooOo00)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.f59316OooOOOo) {
                        if (z) {
                            this.f59316OooOOOo = false;
                        }
                        if (z2) {
                            this.f59318OooOOo0 = false;
                        }
                        z5 = this.f59316OooOOOo;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!z5) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    } else if (z2 || !this.f59318OooOOo0) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.f59316OooOOOo = false;
                        }
                        if (z2) {
                            this.f59318OooOOo0 = false;
                        }
                        z5 = this.f59316OooOOOo;
                        if (z5 || this.f59318OooOOo0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.f59318OooOOo0 && !this.f59317OooOOo) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z3) {
            this.f59321OooOo00 = null;
            o0000O0O o0000o0o2 = this.f59314OooOOO0;
            if (o0000o0o2 != null) {
                o0000o0o2.OooO0oo();
            }
        }
        return z4 ? (E) OooO0o0(e) : e;
    }

    @Nullable
    public final Socket OooOO0() {
        o0000O0O connection = this.f59314OooOOO0;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = oO000o00.f58124OooO00o;
        ArrayList arrayList = connection.f59358OooOOOo;
        Iterator it = arrayList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i);
        this.f59314OooOOO0 = null;
        if (arrayList.isEmpty()) {
            connection.f59359OooOOo0 = System.nanoTime();
            o000O000 o000o001 = this.f59308OooO0oO;
            o000o001.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            byte[] bArr2 = oO000o00.f58124OooO00o;
            boolean z2 = connection.f59352OooOO0;
            o0000 o0000Var = o000o001.f59375OooO0OO;
            if (z2 || o000o001.f59373OooO00o == 0) {
                connection.f59352OooOO0 = true;
                ConcurrentLinkedQueue<o0000O0O> concurrentLinkedQueue = o000o001.f59377OooO0o0;
                concurrentLinkedQueue.remove(connection);
                if (concurrentLinkedQueue.isEmpty()) {
                    o0000Var.OooO00o();
                }
                z = true;
            } else {
                o0000Var.OooO0OO(o000o001.f59376OooO0Oo, 0L);
            }
            if (z) {
                Socket socket = connection.f59347OooO0Oo;
                Intrinsics.checkNotNull(socket);
                return socket;
            }
        }
        return null;
    }

    @Override // p641o0ooOO0o.o00OO
    public final void OoooOOO(@NotNull o00OOO00 responseCallback) {
        OooO00o other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f59310OooOO0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        o000O0o o000o0o2 = o000O0o.f59618OooO00o;
        this.f59311OooOO0O = o000O0o.f59618OooO00o.OooO0oO();
        this.f59309OooO0oo.callStart(this);
        oo00oO oo00oo = this.f59305OooO0Oo.f57885OooO0Oo;
        OooO00o call = new OooO00o(this, responseCallback);
        oo00oo.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (oo00oo) {
            oo00oo.f57966OooO0O0.add(call);
            o0000O0 o0000o1 = call.f59323OooO0o;
            if (!o0000o1.f59306OooO0o) {
                String str = o0000o1.f59307OooO0o0.f57828OooO00o.f57792OooO0Oo;
                Iterator<OooO00o> it = oo00oo.f57967OooO0OO.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<OooO00o> it2 = oo00oo.f57966OooO0O0.iterator();
                        do {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            }
                            other = it2.next();
                        } while (!Intrinsics.areEqual(other.f59323OooO0o.f59307OooO0o0.f57828OooO00o.f57792OooO0Oo, str));
                    } else {
                        other = it.next();
                    }
                } while (!Intrinsics.areEqual(other.f59323OooO0o.f59307OooO0o0.f57828OooO00o.f57792OooO0Oo, str));
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f59324OooO0o0 = other.f59324OooO0o0;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        oo00oo.OooO0oO();
    }

    @Override // p641o0ooOO0o.o00OO
    public final void cancel() {
        Socket socket;
        if (this.f59319OooOOoo) {
            return;
        }
        this.f59319OooOOoo = true;
        o0000O00 o0000o00 = this.f59321OooOo00;
        if (o0000o00 != null) {
            o0000o00.f59330OooO0Oo.cancel();
        }
        o0000O0O o0000o0o2 = this.f59320OooOo0;
        if (o0000o0o2 != null && (socket = o0000o0o2.f59346OooO0OO) != null) {
            oO000o00.OooO0Oo(socket);
        }
        this.f59309OooO0oo.canceled(this);
    }

    public final Object clone() {
        return new o0000O0(this.f59305OooO0Oo, this.f59307OooO0o0, this.f59306OooO0o);
    }

    @Override // p641o0ooOO0o.o00OO
    public final boolean isCanceled() {
        return this.f59319OooOOoo;
    }
}
