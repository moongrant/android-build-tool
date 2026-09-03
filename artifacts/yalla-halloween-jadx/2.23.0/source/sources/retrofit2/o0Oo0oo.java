package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import kotlin.jvm.internal.Intrinsics;
import p634o0ooO0oO.o0;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO0O0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO0O;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p646o0ooOoo.oO0Oo0oo;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o0Oo0oo<T> implements retrofit2.OooO0O0<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public o00O00o0 f61166OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000O0 f61167OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O00o0.OooO00o f61168OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object[] f61169OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOOO<o0O0o, T> f61170OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f61171OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public Throwable f61172OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f61173OooOO0O;

    public class OooO00o implements oo00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f61174OooO0Oo;

        public OooO00o(OooO0o oooO0o) {
            this.f61174OooO0Oo = oooO0o;
        }

        @Override // p634o0ooO0oO.oo00o
        public final void onFailure(o00O00o0 o00o00o1, IOException iOException) {
            try {
                this.f61174OooO0Oo.OooO00o(iOException);
            } catch (Throwable th) {
                o0000OO0.OooOOO(th);
                th.printStackTrace();
            }
        }

        @Override // p634o0ooO0oO.oo00o
        public final void onResponse(o00O00o0 o00o00o1, o0oOOo o0oooo) {
            OooO0o oooO0o = this.f61174OooO0Oo;
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            try {
                try {
                    oooO0o.OooO0O0(o0oo0oo2, o0oo0oo2.OooO0o0(o0oooo));
                } catch (Throwable th) {
                    o0000OO0.OooOOO(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                o0000OO0.OooOOO(th2);
                try {
                    oooO0o.OooO00o(th2);
                } catch (Throwable th3) {
                    o0000OO0.OooOOO(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    public static final class OooO0O0 extends o0O0o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o00O0000 f61176OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0O0o f61177OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public IOException f61178OooO0oO;

        public class OooO00o extends p659o0oooO00.o0000OO0 {
            public OooO00o(p659o0oooO00.o0000 o0000Var) {
                super(o0000Var);
            }

            @Override // p659o0oooO00.o0000OO0, p659o0oooO00.o00O00
            public final long o0000OO0(p659o0oooO00.o00000O o00000o, long j) throws IOException {
                try {
                    return super.o0000OO0(o00000o, j);
                } catch (IOException e) {
                    OooO0O0.this.f61178OooO0oO = e;
                    throw e;
                }
            }
        }

        public OooO0O0(o0O0o o0o0o) {
            this.f61177OooO0o0 = o0o0o;
            this.f61176OooO0o = o000O0Oo.OooO0O0(new OooO00o(o0o0o.OooOOo0()));
        }

        @Override // p634o0ooO0oO.o0O0o
        public final long OooO0OO() {
            return this.f61177OooO0o0.OooO0OO();
        }

        @Override // p634o0ooO0oO.o0O0o
        public final o00OOO0 OooO0oO() {
            return this.f61177OooO0o0.OooO0oO();
        }

        @Override // p634o0ooO0oO.o0O0o
        public final p659o0oooO00.o0000 OooOOo0() {
            return this.f61176OooO0o;
        }

        @Override // p634o0ooO0oO.o0O0o, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f61177OooO0o0.close();
        }
    }

    public static final class OooO0OO extends o0O0o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f61180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final o00OOO0 f61181OooO0o0;

        public OooO0OO(@Nullable o00OOO0 o00ooo1, long j) {
            this.f61181OooO0o0 = o00ooo1;
            this.f61180OooO0o = j;
        }

        @Override // p634o0ooO0oO.o0O0o
        public final long OooO0OO() {
            return this.f61180OooO0o;
        }

        @Override // p634o0ooO0oO.o0O0o
        public final o00OOO0 OooO0oO() {
            return this.f61181OooO0o0;
        }

        @Override // p634o0ooO0oO.o0O0o
        public final p659o0oooO00.o0000 OooOOo0() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public o0Oo0oo(o0000O0 o0000o1, Object[] objArr, o00O00o0.OooO00o oooO00o, OooOOOO<o0O0o, T> oooOOOO) {
        this.f61167OooO0Oo = o0000o1;
        this.f61169OooO0o0 = objArr;
        this.f61168OooO0o = oooO00o;
        this.f61170OooO0oO = oooOOOO;
    }

    @Override // retrofit2.OooO0O0
    public final synchronized o00OOOOo OooO00o() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return OooO0Oo().OooO00o();
    }

    public final o00O00o0 OooO0O0() throws IOException {
        o00OO url;
        o0000O0 o0000o1 = this.f61167OooO0Oo;
        o0000o1.getClass();
        Object[] objArr = this.f61169OooO0o0;
        int length = objArr.length;
        o000000O<?>[] o000000oArr = o0000o1.f61077OooOO0;
        if (length != o000000oArr.length) {
            throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO0O0(androidx.appcompat.widget.o0000O0.OooO00o("Argument count (", length, ") doesn't match expected count ("), o000000oArr.length, ")"));
        }
        o0000oo o0000ooVar = new o0000oo(o0000o1.f61071OooO0OO, o0000o1.f61070OooO0O0, o0000o1.f61072OooO0Oo, o0000o1.f61074OooO0o0, o0000o1.f61073OooO0o, o0000o1.f61075OooO0oO, o0000o1.f61076OooO0oo, o0000o1.f61068OooO);
        if (o0000o1.f61078OooOO0O) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            o000000oArr[i].OooO00o(o0000ooVar, objArr[i]);
        }
        o00OO.OooO00o oooO00o = o0000ooVar.f61124OooO0Oo;
        if (oooO00o != null) {
            url = oooO00o.OooO0OO();
        } else {
            String str = o0000ooVar.f61123OooO0OO;
            o00OO o00oo2 = o0000ooVar.f61122OooO0O0;
            url = o00oo2.OooOO0(str);
            if (url == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + o00oo2 + ", Relative: " + o0000ooVar.f61123OooO0OO);
            }
        }
        oo00oO oooO00o2 = o0000ooVar.f61130OooOO0O;
        if (oooO00o2 == null) {
            o00OO0O0.OooO00o oooO00o3 = o0000ooVar.f61129OooOO0;
            if (oooO00o3 != null) {
                oooO00o2 = new o00OO0O0(oooO00o3.f57225OooO0O0, oooO00o3.f57226OooO0OO);
            } else {
                o00OOO0O.OooO00o oooO00o4 = o0000ooVar.f61120OooO;
                if (oooO00o4 != null) {
                    oooO00o2 = oooO00o4.OooO0O0();
                } else if (o0000ooVar.f61128OooO0oo) {
                    oooO00o2 = oo00oO.create((o00OOO0) null, new byte[0]);
                }
            }
        }
        o00OOO0 o00ooo1 = o0000ooVar.f61127OooO0oO;
        oo0O.OooO00o oooO00o5 = o0000ooVar.f61125OooO0o;
        if (o00ooo1 != null) {
            if (oooO00o2 != null) {
                oooO00o2 = new o0000oo.OooO00o(oooO00o2, o00ooo1);
            } else {
                oooO00o5.OooO00o("Content-Type", o00ooo1.f57235OooO00o);
            }
        }
        o00OOOOo.OooO00o oooO00o6 = o0000ooVar.f61126OooO0o0;
        oooO00o6.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o6.f57319OooO00o = url;
        oooO00o6.OooO0o0(oooO00o5.OooO0OO());
        oooO00o6.OooO0o(o0000ooVar.f61121OooO00o, oooO00o2);
        oooO00o6.OooO(o0OoOo0.class, new o0OoOo0(o0000o1.f61069OooO00o, arrayList));
        oO0Oo0oo oo0oo0ooOooO0O0 = this.f61168OooO0o.OooO0O0(oooO00o6.OooO0O0());
        if (oo0oo0ooOooO0O0 != null) {
            return oo0oo0ooOooO0O0;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.OooO0O0
    public final o0000O0O<T> OooO0OO() throws IOException {
        o00O00o0 o00o00o0OooO0Oo;
        synchronized (this) {
            if (this.f61173OooOO0O) {
                throw new IllegalStateException("Already executed.");
            }
            this.f61173OooOO0O = true;
            o00o00o0OooO0Oo = OooO0Oo();
        }
        if (this.f61171OooO0oo) {
            o00o00o0OooO0Oo.cancel();
        }
        return OooO0o0(FirebasePerfOkHttpClient.execute(o00o00o0OooO0Oo));
    }

    @GuardedBy("this")
    public final o00O00o0 OooO0Oo() throws IOException {
        o00O00o0 o00o00o1 = this.f61166OooO;
        if (o00o00o1 != null) {
            return o00o00o1;
        }
        Throwable th = this.f61172OooOO0;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            o00O00o0 o00o00o0OooO0O0 = OooO0O0();
            this.f61166OooO = o00o00o0OooO0O0;
            return o00o00o0OooO0O0;
        } catch (IOException | Error | RuntimeException e) {
            o0000OO0.OooOOO(e);
            this.f61172OooOO0 = e;
            throw e;
        }
    }

    public final o0000O0O<T> OooO0o0(o0oOOo o0oooo) throws IOException {
        o0O0o o0o0o = o0oooo.f57347OooOO0;
        o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o(o0oooo);
        oooO00o.f57362OooO0oO = new OooO0OO(o0o0o.OooO0oO(), o0o0o.OooO0OO());
        o0oOOo o0ooooOooO00o = oooO00o.OooO00o();
        int i = o0ooooOooO00o.f57345OooO0oO;
        if (i < 200 || i >= 300) {
            try {
                o0 o0VarOooO00o = o0000OO0.OooO00o(o0o0o);
                if (o0ooooOooO00o.OooO0oO()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                o0000O0O<T> o0000o0o2 = new o0000O0O<>(o0ooooOooO00o, null, o0VarOooO00o);
                o0o0o.close();
                return o0000o0o2;
            } catch (Throwable th) {
                o0o0o.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            o0o0o.close();
            if (o0ooooOooO00o.OooO0oO()) {
                return new o0000O0O<>(o0ooooOooO00o, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        OooO0O0 oooO0O0 = new OooO0O0(o0o0o);
        try {
            T tConvert = this.f61170OooO0oO.convert(oooO0O0);
            if (o0ooooOooO00o.OooO0oO()) {
                return new o0000O0O<>(o0ooooOooO00o, tConvert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = oooO0O0.f61178OooO0oO;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.OooO0O0
    public final void OooOooO(OooO0o<T> oooO0o) {
        o00O00o0 o00o00o1;
        Throwable th;
        Objects.requireNonNull(oooO0o, "callback == null");
        synchronized (this) {
            if (this.f61173OooOO0O) {
                throw new IllegalStateException("Already executed.");
            }
            this.f61173OooOO0O = true;
            o00o00o1 = this.f61166OooO;
            th = this.f61172OooOO0;
            if (o00o00o1 == null && th == null) {
                try {
                    o00O00o0 o00o00o0OooO0O0 = OooO0O0();
                    this.f61166OooO = o00o00o0OooO0O0;
                    o00o00o1 = o00o00o0OooO0O0;
                } catch (Throwable th2) {
                    th = th2;
                    o0000OO0.OooOOO(th);
                    this.f61172OooOO0 = th;
                }
            }
        }
        if (th != null) {
            oooO0o.OooO00o(th);
            return;
        }
        if (this.f61171OooO0oo) {
            o00o00o1.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(o00o00o1, new OooO00o(oooO0o));
    }

    @Override // retrofit2.OooO0O0
    public final void cancel() {
        o00O00o0 o00o00o1;
        this.f61171OooO0oo = true;
        synchronized (this) {
            o00o00o1 = this.f61166OooO;
        }
        if (o00o00o1 != null) {
            o00o00o1.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o0Oo0oo(this.f61167OooO0Oo, this.f61169OooO0o0, this.f61168OooO0o, this.f61170OooO0oO);
    }

    @Override // retrofit2.OooO0O0
    public final boolean isCanceled() {
        boolean z = true;
        if (this.f61171OooO0oo) {
            return true;
        }
        synchronized (this) {
            o00O00o0 o00o00o1 = this.f61166OooO;
            if (o00o00o1 == null || !o00o00o1.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.OooO0O0
    public final retrofit2.OooO0O0 clone() {
        return new o0Oo0oo(this.f61167OooO0Oo, this.f61169OooO0o0, this.f61168OooO0o, this.f61170OooO0oO);
    }
}
