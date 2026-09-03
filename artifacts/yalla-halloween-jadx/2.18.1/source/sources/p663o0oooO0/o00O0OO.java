package p663o0oooO0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00O0O0;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.oo0o0O0;
import p661o0ooo0oo.o000OO00;
import p666o0oooO0o.oO00o000;
import p666o0oooO0o.oO0OO00o;
import p666o0oooO0o.oOOoOOO0;
import p666o0oooO0o.oOo00o0o;
import p667o0oooOO.s;
import p674o0oooo0.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO implements o0O0ooO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final AtomicBoolean f51726Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00OO0OO f51727Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final oo0o0O0 f51728Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO0OO f51729Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f51730OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public oo0o0O0 f51731OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Object f51732OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public o00OO00O f51733OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public o00O0OO0 f51734OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f51735OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f51736OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public volatile boolean f51737OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public volatile o00O0OO0 f51738OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public volatile o00OO00O f51739OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final o00OO f51740Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f51741Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final boolean f51742OooooO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f51743o000oOoO;

    public final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public volatile AtomicInteger f51744Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final o00oOoo f51745Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O0OO f51746Oooo0oo;

        public OooO00o(@NotNull o00O0OO o00o0oo2, o00oOoo responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f51746Oooo0oo = o00o0oo2;
            this.f51745Oooo0oO = responseCallback;
            this.f51744Oooo0o = new AtomicInteger(0);
        }

        @NotNull
        public final String OooO00o() {
            return this.f51746Oooo0oo.f51741Ooooo0o.f51425OooO0O0.f51387OooO0o0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            o00OO o00oo2;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("OkHttp ");
            sbOooO0o0.append(this.f51746Oooo0oo.f51741Ooooo0o.f51425OooO0O0.OooOO0O());
            String string = sbOooO0o0.toString();
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(string);
            try {
                try {
                    this.f51746Oooo0oo.f51729Oooo0oo.OooO();
                    try {
                        z = true;
                        try {
                            this.f51745Oooo0oO.onResponse(this.f51746Oooo0oo, this.f51746Oooo0oo.OooO0oO());
                            o00oo2 = this.f51746Oooo0oo.f51740Ooooo00;
                        } catch (IOException e) {
                            e = e;
                            if (z) {
                                s.OooO00o oooO00o = s.f51921OooO0OO;
                                s.f51919OooO00o.OooO("Callback failure for " + o00O0OO.OooO0OO(this.f51746Oooo0oo), 4, e);
                            } else {
                                this.f51745Oooo0oO.onFailure(this.f51746Oooo0oo, e);
                            }
                            o00oo2 = this.f51746Oooo0oo.f51740Ooooo00;
                        } catch (Throwable th) {
                            th = th;
                            this.f51746Oooo0oo.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.f51745Oooo0oO.onFailure(this.f51746Oooo0oo, iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        z = false;
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                    }
                    o00oo2.f51320Oooo0o.OooO0O0(this);
                    currentThread.setName(name);
                } catch (Throwable th3) {
                    this.f51746Oooo0oo.f51740Ooooo00.f51320Oooo0o.OooO0O0(this);
                    throw th3;
                }
            } catch (Throwable th4) {
                currentThread.setName(name);
                throw th4;
            }
        }
    }

    public static final class OooO0O0 extends WeakReference<o00O0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Object f51747OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o00O0OO referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f51747OooO00o = obj;
        }
    }

    public static final class OooO0OO extends o0o0Oo {
        public OooO0OO() {
        }

        @Override // p674o0oooo0.o0o0Oo
        public final void OooOO0o() {
            o00O0OO.this.cancel();
        }
    }

    public o00O0OO(@NotNull o00OO client, @NotNull o00OOO00 originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f51740Ooooo00 = client;
        this.f51741Ooooo0o = originalRequest;
        this.f51742OooooO0 = z;
        this.f51727Oooo0o = client.f51321Oooo0oO.f51480OooO00o;
        this.f51728Oooo0oO = client.f51325OoooO00.OooO00o(this);
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0oO(client.f51341Ooooooo, TimeUnit.MILLISECONDS);
        Unit unit = Unit.INSTANCE;
        this.f51729Oooo0oo = oooO0OO;
        this.f51726Oooo = new AtomicBoolean();
        this.f51736OoooOOo = true;
    }

    public static final String OooO0OO(o00O0OO o00o0oo2) {
        StringBuilder sb = new StringBuilder();
        sb.append(o00o0oo2.f51737OoooOo0 ? "canceled " : "");
        sb.append(o00o0oo2.f51742OooooO0 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(o00o0oo2.f51741Ooooo0o.f51425OooO0O0.OooOO0O());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:34:0x0043, B:14:0x001d), top: B:54:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:34:0x0043, B:14:0x001d), top: B:54:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033  */
    public final <E extends IOException> E OooO(@NotNull o00O0OO0 exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.areEqual(exchange, this.f51738OoooOoO)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.f51743o000oOoO) {
                        if (z) {
                            this.f51743o000oOoO = false;
                        }
                        if (z2) {
                            this.f51735OoooOOO = false;
                        }
                        z5 = this.f51743o000oOoO;
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
                    } else if (z2 || !this.f51735OoooOOO) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.f51743o000oOoO = false;
                        }
                        if (z2) {
                            this.f51735OoooOOO = false;
                        }
                        z5 = this.f51743o000oOoO;
                        if (z5 || this.f51735OoooOOO) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.f51735OoooOOO && !this.f51736OoooOOo) {
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
            this.f51738OoooOoO = null;
            o00OO00O o00oo00o = this.f51733OoooO0O;
            if (o00oo00o != null) {
                synchronized (o00oo00o) {
                    o00oo00o.f51789OooOO0o++;
                }
            }
        }
        return z4 ? (E) OooO0o0(e) : e;
    }

    @Override // p660o0ooo0o0.o0O0ooO
    @NotNull
    public final o00OOO00 OooO00o() {
        return this.f51741Ooooo0o;
    }

    @Override // p660o0ooo0o0.o0O0ooO
    @NotNull
    public final o00OOOO0 OooO0O0() {
        if (!this.f51726Oooo.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f51729Oooo0oo.OooO();
        s.OooO00o oooO00o = s.f51921OooO0OO;
        this.f51732OoooO00 = s.f51919OooO00o.OooO0oO();
        this.f51728Oooo0oO.callStart(this);
        try {
            o00O0O0 o00o0o0 = this.f51740Ooooo00.f51320Oooo0o;
            synchronized (o00o0o0) {
                Intrinsics.checkNotNullParameter(this, "call");
                o00o0o0.f51307OooO0Oo.add(this);
            }
            o00OOOO0 o00oooo0OooO0oO = OooO0oO();
            o00O0O0 o00o0o1 = this.f51740Ooooo00.f51320Oooo0o;
            Objects.requireNonNull(o00o0o1);
            Intrinsics.checkNotNullParameter(this, "call");
            o00o0o1.OooO00o(o00o0o1.f51307OooO0Oo, this);
            return o00oooo0OooO0oO;
        } catch (Throwable th) {
            o00O0O0 o00o0o2 = this.f51740Ooooo00.f51320Oooo0o;
            Objects.requireNonNull(o00o0o2);
            Intrinsics.checkNotNullParameter(this, "call");
            o00o0o2.OooO00o(o00o0o2.f51307OooO0Oo, this);
            throw th;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0Oo(@NotNull o00OO00O connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = p659o0ooo0o.o00OOO00.f51183OooO00o;
        if (!(this.f51733OoooO0O == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f51733OoooO0O = connection;
        connection.f51792OooOOOO.add(new OooO0O0(this, this.f51732OoooO00));
    }

    public final void OooO0o(boolean z) {
        o00O0OO0 o00o0oo1;
        synchronized (this) {
            if (!this.f51736OoooOOo) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (o00o0oo1 = this.f51738OoooOoO) != null) {
            o00o0oo1.f51753OooO0o.cancel();
            o00o0oo1.f51751OooO0OO.OooO(o00o0oo1, true, true, null);
        }
        this.f51734OoooOO0 = null;
    }

    public final <E extends IOException> E OooO0o0(E e) {
        E interruptedIOException;
        Socket socketOooOO0O;
        byte[] bArr = p659o0ooo0o.o00OOO00.f51183OooO00o;
        o00OO00O o00oo00o = this.f51733OoooO0O;
        if (o00oo00o != null) {
            synchronized (o00oo00o) {
                socketOooOO0O = OooOO0O();
            }
            if (this.f51733OoooO0O == null) {
                if (socketOooOO0O != null) {
                    p659o0ooo0o.o00OOO00.OooO0o0(socketOooOO0O);
                }
                this.f51728Oooo0oO.connectionReleased(this, o00oo00o);
            } else {
                if (!(socketOooOO0O == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f51730OoooO && this.f51729Oooo0oo.OooOO0()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e != null) {
            oo0o0O0 oo0o0o0 = this.f51728Oooo0oO;
            Intrinsics.checkNotNull(interruptedIOException);
            oo0o0o0.callFailed(this, interruptedIOException);
        } else {
            this.f51728Oooo0oO.callEnd(this);
        }
        return interruptedIOException;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    @NotNull
    public final o00OOOO0 OooO0oO() throws Throwable {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.f51740Ooooo00.f51322Oooo0oo);
        arrayList.add(new oO0OO00o(this.f51740Ooooo00));
        arrayList.add(new oOOoOOO0(this.f51740Ooooo00.f51342o000oOoO));
        arrayList.add(new o000OO00(this.f51740Ooooo00.f51328OoooOOO));
        arrayList.add(o00O0O0.f51721OooO00o);
        if (!this.f51742OooooO0) {
            CollectionsKt.addAll(arrayList, this.f51740Ooooo00.f51319Oooo);
        }
        arrayList.add(new oO00o000(this.f51742OooooO0));
        o00OOO00 o00ooo01 = this.f51741Ooooo0o;
        o00OO o00oo2 = this.f51740Ooooo00;
        oOo00o0o ooo00o0o = new oOo00o0o(this, arrayList, 0, null, o00ooo01, o00oo2.f51347o0OoOo0, o00oo2.f51348ooOO, o00oo2.f51343o00O0O);
        boolean z = false;
        try {
            o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(this.f51741Ooooo0o);
            if (this.f51737OoooOo0) {
                p659o0ooo0o.o00OOO00.OooO0Oo(o00oooo0OooO0O0);
                throw new IOException("Canceled");
            }
            OooOO0(null);
            return o00oooo0OooO0O0;
        } catch (IOException e) {
            try {
                IOException iOExceptionOooOO0 = OooOO0(e);
                if (iOExceptionOooOO0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionOooOO0;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    OooOO0(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
                OooOO0(null);
            }
            throw th;
        }
    }

    @Override // p660o0ooo0o0.o0O0ooO
    public final boolean OooO0oo() {
        return this.f51737OoooOo0;
    }

    @Nullable
    public final IOException OooOO0(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f51736OoooOOo) {
                this.f51736OoooOOo = false;
                if (!this.f51743o000oOoO && !this.f51735OoooOOO) {
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z ? OooO0o0(iOException) : iOException;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.ref.Reference<o0oooO0.o00O0OO>>] */
    @Nullable
    public final Socket OooOO0O() {
        o00OO00O connection = this.f51733OoooO0O;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = p659o0ooo0o.o00OOO00.f51183OooO00o;
        ?? r1 = connection.f51792OooOOOO;
        Iterator it = r1.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual((o00O0OO) ((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        r1.remove(i);
        this.f51733OoooO0O = null;
        if (r1.isEmpty()) {
            connection.f51793OooOOOo = System.nanoTime();
            o00OO0OO o00oo0oo = this.f51727Oooo0o;
            Objects.requireNonNull(o00oo0oo);
            Intrinsics.checkNotNullParameter(connection, "connection");
            byte[] bArr2 = p659o0ooo0o.o00OOO00.f51183OooO00o;
            if (connection.f51779OooO || o00oo0oo.f51800OooO0o0 == 0) {
                connection.f51779OooO = true;
                o00oo0oo.f51799OooO0Oo.remove(connection);
                if (o00oo0oo.f51799OooO0Oo.isEmpty()) {
                    o00oo0oo.f51797OooO0O0.OooO00o();
                }
                z = true;
            } else {
                o00oo0oo.f51797OooO0O0.OooO0OO(o00oo0oo.f51798OooO0OO, 0L);
            }
            if (z) {
                Socket socket = connection.f51781OooO0OO;
                Intrinsics.checkNotNull(socket);
                return socket;
            }
        }
        return null;
    }

    public final void OooOO0o() {
        if (!(!this.f51730OoooO)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f51730OoooO = true;
        this.f51729Oooo0oo.OooOO0();
    }

    @Override // p660o0ooo0o0.o0O0ooO
    public final void OoooO0O(@NotNull o00oOoo responseCallback) {
        OooO00o other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f51726Oooo.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        s.OooO00o oooO00o = s.f51921OooO0OO;
        this.f51732OoooO00 = s.f51919OooO00o.OooO0oO();
        this.f51728Oooo0oO.callStart(this);
        o00O0O0 o00o0o0 = this.f51740Ooooo00.f51320Oooo0o;
        OooO00o call = new OooO00o(this, responseCallback);
        Objects.requireNonNull(o00o0o0);
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (o00o0o0) {
            o00o0o0.f51305OooO0O0.add(call);
            if (!call.f51746Oooo0oo.f51742OooooO0) {
                String strOooO00o = call.OooO00o();
                Iterator<OooO00o> it = o00o0o0.f51306OooO0OO.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<OooO00o> it2 = o00o0o0.f51305OooO0O0.iterator();
                        do {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            }
                            other = it2.next();
                        } while (!Intrinsics.areEqual(other.OooO00o(), strOooO00o));
                    } else {
                        other = it.next();
                    }
                } while (!Intrinsics.areEqual(other.OooO00o(), strOooO00o));
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f51744Oooo0o = other.f51744Oooo0o;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        o00o0o0.OooO0OO();
    }

    @Override // p660o0ooo0o0.o0O0ooO
    public final void cancel() {
        Socket socket;
        if (this.f51737OoooOo0) {
            return;
        }
        this.f51737OoooOo0 = true;
        o00O0OO0 o00o0oo1 = this.f51738OoooOoO;
        if (o00o0oo1 != null) {
            o00o0oo1.f51753OooO0o.cancel();
        }
        o00OO00O o00oo00o = this.f51739OoooOoo;
        if (o00oo00o != null && (socket = o00oo00o.f51780OooO0O0) != null) {
            p659o0ooo0o.o00OOO00.OooO0o0(socket);
        }
        this.f51728Oooo0oO.canceled(this);
    }

    public final Object clone() {
        return new o00O0OO(this.f51740Ooooo00, this.f51741Ooooo0o, this.f51742OooooO0);
    }
}
