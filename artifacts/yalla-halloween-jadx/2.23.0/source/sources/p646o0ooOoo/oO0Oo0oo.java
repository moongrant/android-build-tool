package p646o0ooOoo;

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
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p634o0ooO0oO.oo0oOO0;
import p635o0ooO0oo.o0O000o0;
import p638o0ooOO0O.o00O0OO;
import p647o0ooOooo.hc;
import p647o0ooOooo.ic;
import p647o0ooOooo.nc;
import p647o0ooOooo.pc;
import p652o0ooo00o.o000O0O0;
import p659o0oooO00.o000000;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0Oo0oo implements o00O00o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59652OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f59653OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f59654OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f59655OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final oO000o00 f59656OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59657OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f59658OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Object f59659OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public oO0OoOO0 f59660OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f59661OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public oO000OOo f59662OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public oO0o0o f59663OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f59664OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f59665OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f59666OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile boolean f59667OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public volatile oO000OOo f59668OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public volatile oO0o0o f59669OooOo00;

    public final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final oo00o f59670OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f59671OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public volatile AtomicInteger f59672OooO0o0;

        public OooO00o(@NotNull oO0Oo0oo this$0, oo00o responseCallback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f59671OooO0o = this$0;
            this.f59670OooO0Oo = responseCallback;
            this.f59672OooO0o0 = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00OOOO0 o00oooo1;
            String strStringPlus = Intrinsics.stringPlus("OkHttp ", this.f59671OooO0o.f59655OooO0o0.f57313OooO00o.OooO());
            oO0Oo0oo oo0oo0oo = this.f59671OooO0o;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strStringPlus);
            try {
                oo0oo0oo.f59652OooO.OooO();
                boolean z = false;
                try {
                    try {
                        try {
                            this.f59670OooO0Oo.onResponse(oo0oo0oo, oo0oo0oo.OooO0oO());
                            o00oooo1 = oo0oo0oo.f59653OooO0Oo;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
                                o000O0O0 o000o0o2 = o000O0O0.f60031OooO00o;
                                String strStringPlus2 = Intrinsics.stringPlus("Callback failure for ", oO0Oo0oo.OooO0O0(oo0oo0oo));
                                o000o0o2.getClass();
                                o000O0O0.OooO(e, 4, strStringPlus2);
                            } else {
                                this.f59670OooO0Oo.onFailure(oo0oo0oo, e);
                            }
                            o00oooo1 = oo0oo0oo.f59653OooO0Oo;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            oo0oo0oo.cancel();
                            if (!z) {
                                IOException iOException = new IOException(Intrinsics.stringPlus("canceled due to ", th));
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.f59670OooO0Oo.onFailure(oo0oo0oo, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        oo0oo0oo.f59653OooO0Oo.f57256OooO0Oo.OooO0O0(this);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                o00oooo1.f57256OooO0Oo.OooO0O0(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    public static final class OooO0O0 extends WeakReference<oO0Oo0oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Object f59673OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull oO0Oo0oo referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f59673OooO00o = obj;
        }
    }

    public static final class OooO0OO extends o000000 {
        public OooO0OO() {
        }

        @Override // p659o0oooO00.o000000
        public final void OooOO0o() {
            oO0Oo0oo.this.cancel();
        }
    }

    public oO0Oo0oo(@NotNull o00OOOO0 client, @NotNull o00OOOOo originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f59653OooO0Oo = client;
        this.f59655OooO0o0 = originalRequest;
        this.f59654OooO0o = z;
        this.f59656OooO0oO = client.f57258OooO0o0.f57199OooO00o;
        this.f59657OooO0oo = client.f57260OooO0oo.create(this);
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0oO(client.f57276OooOoO, TimeUnit.MILLISECONDS);
        this.f59652OooO = oooO0OO;
        this.f59658OooOO0 = new AtomicBoolean();
        this.f59665OooOOo = true;
    }

    public static final String OooO0O0(oO0Oo0oo oo0oo0oo) {
        StringBuilder sb = new StringBuilder();
        sb.append(oo0oo0oo.f59667OooOOoo ? "canceled " : "");
        sb.append(oo0oo0oo.f59654OooO0o ? "web socket" : "call");
        sb.append(" to ");
        sb.append(oo0oo0oo.f59655OooO0o0.f57313OooO00o.OooO());
        return sb.toString();
    }

    @Nullable
    public final IOException OooO(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f59665OooOOo) {
                this.f59665OooOOo = false;
                if (!this.f59664OooOOOo && !this.f59666OooOOo0) {
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z ? OooO0o0(iOException) : iOException;
    }

    @Override // p634o0ooO0oO.o00O00o0
    @NotNull
    public final o00OOOOo OooO00o() {
        return this.f59655OooO0o0;
    }

    @Override // p634o0ooO0oO.o00O00o0
    @NotNull
    public final o0oOOo OooO0OO() {
        if (!this.f59658OooOO0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f59652OooO.OooO();
        o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
        this.f59659OooOO0O = o000O0O0.f60031OooO00o.OooO0oO();
        this.f59657OooO0oo.callStart(this);
        try {
            oo0oOO0 oo0ooo0 = this.f59653OooO0Oo.f57256OooO0Oo;
            synchronized (oo0ooo0) {
                Intrinsics.checkNotNullParameter(this, "call");
                oo0ooo0.f57384OooO0Oo.add(this);
            }
            o0oOOo o0ooooOooO0oO = OooO0oO();
            this.f59653OooO0Oo.f57256OooO0Oo.OooO0OO(this);
            return o0ooooOooO0oO;
        } catch (Throwable th) {
            this.f59653OooO0Oo.f57256OooO0Oo.OooO0OO(this);
            throw th;
        }
    }

    public final void OooO0Oo(@NotNull oO000OOo connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = o0O000o0.f57386OooO00o;
        if (!(this.f59662OooOOO0 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f59662OooOOO0 = connection;
        connection.f59630OooOOOo.add(new OooO0O0(this, this.f59659OooOO0O));
    }

    public final void OooO0o(boolean z) {
        oO0o0o oo0o0o;
        synchronized (this) {
            if (!this.f59665OooOOo) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (oo0o0o = this.f59669OooOo00) != null) {
            oo0o0o.f59692OooO0Oo.cancel();
            oo0o0o.f59689OooO00o.OooO0oo(oo0o0o, true, true, null);
        }
        this.f59663OooOOOO = null;
    }

    public final <E extends IOException> E OooO0o0(E e) {
        E interruptedIOException;
        Socket socketOooOO0;
        byte[] bArr = o0O000o0.f57386OooO00o;
        oO000OOo oo000ooo = this.f59662OooOOO0;
        if (oo000ooo != null) {
            synchronized (oo000ooo) {
                socketOooOO0 = OooOO0();
            }
            if (this.f59662OooOOO0 == null) {
                if (socketOooOO0 != null) {
                    o0O000o0.OooO0Oo(socketOooOO0);
                }
                this.f59657OooO0oo.connectionReleased(this, oo000ooo);
            } else {
                if (!(socketOooOO0 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f59661OooOOO && this.f59652OooO.OooOO0()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e != null) {
            o00OO00O o00oo00o = this.f59657OooO0oo;
            Intrinsics.checkNotNull(interruptedIOException);
            o00oo00o.callFailed(this, interruptedIOException);
        } else {
            this.f59657OooO0oo.callEnd(this);
        }
        return interruptedIOException;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    @NotNull
    public final o0oOOo OooO0oO() throws Throwable {
        boolean z;
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f59653OooO0Oo.f57257OooO0o);
        arrayList.add(new pc(this.f59653OooO0Oo));
        arrayList.add(new hc(this.f59653OooO0Oo.f57265OooOOO0));
        this.f59653OooO0Oo.getClass();
        arrayList.add(new o00O0OO());
        arrayList.add(oO000O0O.f59615OooO00o);
        if (!this.f59654OooO0o) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f59653OooO0Oo.f57259OooO0oO);
        }
        arrayList.add(new ic(this.f59654OooO0o));
        o00OOOOo o00ooooo2 = this.f59655OooO0o0;
        o00OOOO0 o00oooo1 = this.f59653OooO0Oo;
        try {
            o0oOOo o0ooooOooO0O0 = new nc(this, arrayList, 0, null, o00ooooo2, o00oooo1.f57278OooOoOO, o00oooo1.f57280OooOoo0, o00oooo1.f57279OooOoo).OooO0O0(this.f59655OooO0o0);
            if (this.f59667OooOOoo) {
                o0O000o0.OooO0OO(o0ooooOooO0O0);
                throw new IOException("Canceled");
            }
            OooO(null);
            return o0ooooOooO0O0;
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
    public final <E extends IOException> E OooO0oo(@NotNull oO0o0o exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.areEqual(exchange, this.f59669OooOo00)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.f59664OooOOOo) {
                        if (z) {
                            this.f59664OooOOOo = false;
                        }
                        if (z2) {
                            this.f59666OooOOo0 = false;
                        }
                        z5 = this.f59664OooOOOo;
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
                    } else if (z2 || !this.f59666OooOOo0) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.f59664OooOOOo = false;
                        }
                        if (z2) {
                            this.f59666OooOOo0 = false;
                        }
                        z5 = this.f59664OooOOOo;
                        if (z5 || this.f59666OooOOo0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.f59666OooOOo0 && !this.f59665OooOOo) {
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
            this.f59669OooOo00 = null;
            oO000OOo oo000ooo = this.f59662OooOOO0;
            if (oo000ooo != null) {
                oo000ooo.OooO0oo();
            }
        }
        return z4 ? (E) OooO0o0(e) : e;
    }

    @Nullable
    public final Socket OooOO0() {
        oO000OOo connection = this.f59662OooOOO0;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = o0O000o0.f57386OooO00o;
        ArrayList arrayList = connection.f59630OooOOOo;
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
        this.f59662OooOOO0 = null;
        if (arrayList.isEmpty()) {
            connection.f59631OooOOo0 = System.nanoTime();
            oO000o00 oo000o00 = this.f59656OooO0oO;
            oo000o00.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            byte[] bArr2 = o0O000o0.f57386OooO00o;
            boolean z2 = connection.f59624OooOO0;
            p639o0ooOO0o.o00OO00O o00oo00o = oo000o00.f59637OooO0OO;
            if (z2 || oo000o00.f59635OooO00o == 0) {
                connection.f59624OooOO0 = true;
                ConcurrentLinkedQueue<oO000OOo> concurrentLinkedQueue = oo000o00.f59639OooO0o0;
                concurrentLinkedQueue.remove(connection);
                if (concurrentLinkedQueue.isEmpty()) {
                    o00oo00o.OooO00o();
                }
                z = true;
            } else {
                o00oo00o.OooO0OO(oo000o00.f59638OooO0Oo, 0L);
            }
            if (z) {
                Socket socket = connection.f59619OooO0Oo;
                Intrinsics.checkNotNull(socket);
                return socket;
            }
        }
        return null;
    }

    @Override // p634o0ooO0oO.o00O00o0
    public final void OooOOo0(@NotNull oo00o responseCallback) {
        OooO00o other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f59658OooOO0.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
        this.f59659OooOO0O = o000O0O0.f60031OooO00o.OooO0oO();
        this.f59657OooO0oo.callStart(this);
        oo0oOO0 oo0ooo0 = this.f59653OooO0Oo.f57256OooO0Oo;
        OooO00o call = new OooO00o(this, responseCallback);
        oo0ooo0.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (oo0ooo0) {
            oo0ooo0.f57382OooO0O0.add(call);
            oO0Oo0oo oo0oo0oo = call.f59671OooO0o;
            if (!oo0oo0oo.f59654OooO0o) {
                String str = oo0oo0oo.f59655OooO0o0.f57313OooO00o.f57206OooO0Oo;
                Iterator<OooO00o> it = oo0ooo0.f57383OooO0OO.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<OooO00o> it2 = oo0ooo0.f57382OooO0O0.iterator();
                        do {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            }
                            other = it2.next();
                        } while (!Intrinsics.areEqual(other.f59671OooO0o.f59655OooO0o0.f57313OooO00o.f57206OooO0Oo, str));
                    } else {
                        other = it.next();
                    }
                } while (!Intrinsics.areEqual(other.f59671OooO0o.f59655OooO0o0.f57313OooO00o.f57206OooO0Oo, str));
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f59672OooO0o0 = other.f59672OooO0o0;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        oo0ooo0.OooO0oO();
    }

    @Override // p634o0ooO0oO.o00O00o0
    public final void cancel() {
        Socket socket;
        if (this.f59667OooOOoo) {
            return;
        }
        this.f59667OooOOoo = true;
        oO0o0o oo0o0o = this.f59669OooOo00;
        if (oo0o0o != null) {
            oo0o0o.f59692OooO0Oo.cancel();
        }
        oO000OOo oo000ooo = this.f59668OooOo0;
        if (oo000ooo != null && (socket = oo000ooo.f59618OooO0OO) != null) {
            o0O000o0.OooO0Oo(socket);
        }
        this.f59657OooO0oo.canceled(this);
    }

    public final Object clone() {
        return new oO0Oo0oo(this.f59653OooO0Oo, this.f59655OooO0o0, this.f59654OooO0o);
    }

    @Override // p634o0ooO0oO.o00O00o0
    public final boolean isCanceled() {
        return this.f59667OooOOoo;
    }
}
