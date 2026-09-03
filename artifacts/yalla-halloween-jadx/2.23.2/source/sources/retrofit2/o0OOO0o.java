package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import kotlin.jvm.internal.Intrinsics;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O000o0;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0O0O0O;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0ooO;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOO0o<T> implements retrofit2.OooO0O0<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public o00OO f60623OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000oo f60624OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OO.OooO00o f60625OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object[] f60626OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOO<o0O00oO0, T> f60627OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f60628OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public Throwable f60629OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f60630OooOO0O;

    public class OooO00o implements o00OOO00 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f60631OooO0Oo;

        public OooO00o(OooO0o oooO0o) {
            this.f60631OooO0Oo = oooO0o;
        }

        @Override // p641o0ooOO0o.o00OOO00
        public final void onFailure(o00OO o00oo2, IOException iOException) {
            try {
                this.f60631OooO0Oo.OooO00o(iOException);
            } catch (Throwable th) {
                o0000O.OooOOO(th);
                th.printStackTrace();
            }
        }

        @Override // p641o0ooOO0o.o00OOO00
        public final void onResponse(o00OO o00oo2, o0O00o00 o0o00o01) {
            OooO0o oooO0o = this.f60631OooO0Oo;
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            try {
                try {
                    oooO0o.OooO0O0(o0ooo0o2, o0ooo0o2.OooO0o0(o0o00o01));
                } catch (Throwable th) {
                    o0000O.OooOOO(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                o0000O.OooOOO(th2);
                try {
                    oooO0o.OooO00o(th2);
                } catch (Throwable th3) {
                    o0000O.OooOOO(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    public static final class OooO0O0 extends o0O00oO0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o0o0000 f60633OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0O00oO0 f60634OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public IOException f60635OooO0oO;

        public class OooO00o extends oo0ooO {
            public OooO00o(o0O0o0 o0o0o0) {
                super(o0o0o0);
            }

            @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
            public final long OooOO0O(oo0OOoo oo0oooo, long j) throws IOException {
                try {
                    return super.OooOO0O(oo0oooo, j);
                } catch (IOException e) {
                    OooO0O0.this.f60635OooO0oO = e;
                    throw e;
                }
            }
        }

        public OooO0O0(o0O00oO0 o0o00oo1) {
            this.f60634OooO0o0 = o0o00oo1;
            this.f60633OooO0o = o0OO.OooO0O0(new OooO00o(o0o00oo1.OooOOo()));
        }

        @Override // p641o0ooOO0o.o0O00oO0
        public final long OooO0OO() {
            return this.f60634OooO0o0.OooO0OO();
        }

        @Override // p641o0ooOO0o.o0O00oO0
        public final o0O000Oo OooO0oO() {
            return this.f60634OooO0o0.OooO0oO();
        }

        @Override // p641o0ooOO0o.o0O00oO0
        public final o0O0o0 OooOOo() {
            return this.f60633OooO0o;
        }

        @Override // p641o0ooOO0o.o0O00oO0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f60634OooO0o0.close();
        }
    }

    public static final class OooO0OO extends o0O00oO0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f60637OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final o0O000Oo f60638OooO0o0;

        public OooO0OO(@Nullable o0O000Oo o0o000oo2, long j) {
            this.f60638OooO0o0 = o0o000oo2;
            this.f60637OooO0o = j;
        }

        @Override // p641o0ooOO0o.o0O00oO0
        public final long OooO0OO() {
            return this.f60637OooO0o;
        }

        @Override // p641o0ooOO0o.o0O00oO0
        public final o0O000Oo OooO0oO() {
            return this.f60638OooO0o0;
        }

        @Override // p641o0ooOO0o.o0O00oO0
        public final o0O0o0 OooOOo() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public o0OOO0o(o0000oo o0000ooVar, Object[] objArr, o00OO.OooO00o oooO00o, OooOOO<o0O00oO0, T> oooOOO) {
        this.f60624OooO0Oo = o0000ooVar;
        this.f60626OooO0o0 = objArr;
        this.f60625OooO0o = oooO00o;
        this.f60627OooO0oO = oooOOO;
    }

    @Override // retrofit2.OooO0O0
    public final synchronized o0O00O0o OooO00o() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return OooO0Oo().OooO00o();
    }

    public final o00OO OooO0O0() throws IOException {
        o0O000O url;
        o0000oo o0000ooVar = this.f60624OooO0Oo;
        o0000ooVar.getClass();
        Object[] objArr = this.f60626OooO0o0;
        int length = objArr.length;
        o000000<?>[] o000000VarArr = o0000ooVar.f60588OooOO0;
        if (length != o000000VarArr.length) {
            throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO00o(androidx.appcompat.widget.o0000O0.OooO0O0("Argument count (", length, ") doesn't match expected count ("), o000000VarArr.length, ")"));
        }
        o0000O00 o0000o00 = new o0000O00(o0000ooVar.f60582OooO0OO, o0000ooVar.f60581OooO0O0, o0000ooVar.f60583OooO0Oo, o0000ooVar.f60585OooO0o0, o0000ooVar.f60584OooO0o, o0000ooVar.f60586OooO0oO, o0000ooVar.f60587OooO0oo, o0000ooVar.f60579OooO);
        if (o0000ooVar.f60589OooOO0O) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            o000000VarArr[i].OooO00o(o0000o00, objArr[i]);
        }
        o0O000O.OooO00o oooO00o = o0000o00.f60555OooO0Oo;
        if (oooO00o != null) {
            url = oooO00o.OooO0OO();
        } else {
            String str = o0000o00.f60554OooO0OO;
            o0O000O o0o000o = o0000o00.f60553OooO0O0;
            url = o0o000o.OooOO0(str);
            if (url == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + o0o000o + ", Relative: " + o0000o00.f60554OooO0OO);
            }
        }
        o0oO0Ooo oooO00o2 = o0000o00.f60561OooOO0O;
        if (oooO00o2 == null) {
            o0O00000.OooO00o oooO00o3 = o0000o00.f60560OooOO0;
            if (oooO00o3 != null) {
                oooO00o2 = new o0O00000(oooO00o3.f57779OooO0O0, oooO00o3.f57780OooO0OO);
            } else {
                o0O000o0.OooO00o oooO00o4 = o0000o00.f60551OooO;
                if (oooO00o4 != null) {
                    oooO00o2 = oooO00o4.OooO0O0();
                } else if (o0000o00.f60559OooO0oo) {
                    oooO00o2 = o0oO0Ooo.create((o0O000Oo) null, new byte[0]);
                }
            }
        }
        o0O000Oo o0o000oo2 = o0000o00.f60558OooO0oO;
        o0O000.OooO00o oooO00o5 = o0000o00.f60556OooO0o;
        if (o0o000oo2 != null) {
            if (oooO00o2 != null) {
                oooO00o2 = new o0000O00.OooO00o(oooO00o2, o0o000oo2);
            } else {
                oooO00o5.OooO00o("Content-Type", o0o000oo2.f57808OooO00o);
            }
        }
        o0O00O0o.OooO00o oooO00o6 = o0000o00.f60557OooO0o0;
        oooO00o6.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o6.f57834OooO00o = url;
        oooO00o6.OooO0o0(oooO00o5.OooO0OO());
        oooO00o6.OooO0o(o0000o00.f60552OooO00o, oooO00o2);
        oooO00o6.OooO(o000oOoO.class, new o000oOoO(o0000ooVar.f60580OooO00o, arrayList));
        p653o0ooo00O.o0000O0 o0000o0OooO0O0 = this.f60625OooO0o.OooO0O0(oooO00o6.OooO0O0());
        if (o0000o0OooO0O0 != null) {
            return o0000o0OooO0O0;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.OooO0O0
    public final o0000O0<T> OooO0OO() throws IOException {
        o00OO o00ooOooO0Oo;
        synchronized (this) {
            if (this.f60630OooOO0O) {
                throw new IllegalStateException("Already executed.");
            }
            this.f60630OooOO0O = true;
            o00ooOooO0Oo = OooO0Oo();
        }
        if (this.f60628OooO0oo) {
            o00ooOooO0Oo.cancel();
        }
        return OooO0o0(FirebasePerfOkHttpClient.execute(o00ooOooO0Oo));
    }

    @GuardedBy("this")
    public final o00OO OooO0Oo() throws IOException {
        o00OO o00oo2 = this.f60623OooO;
        if (o00oo2 != null) {
            return o00oo2;
        }
        Throwable th = this.f60629OooOO0;
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
            o00OO o00ooOooO0O0 = OooO0O0();
            this.f60623OooO = o00ooOooO0O0;
            return o00ooOooO0O0;
        } catch (IOException | Error | RuntimeException e) {
            o0000O.OooOOO(e);
            this.f60629OooOO0 = e;
            throw e;
        }
    }

    public final o0000O0<T> OooO0o0(o0O00o00 o0o00o01) throws IOException {
        o0O00oO0 o0o00oo1 = o0o00o01.f57852OooOO0;
        o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o(o0o00o01);
        oooO00o.f57867OooO0oO = new OooO0OO(o0o00oo1.OooO0oO(), o0o00oo1.OooO0OO());
        o0O00o00 o0o00o00OooO00o = oooO00o.OooO00o();
        int i = o0o00o00OooO00o.f57850OooO0oO;
        if (i < 200 || i >= 300) {
            try {
                o0O0O0O o0o0o0oOooO00o = o0000O.OooO00o(o0o00oo1);
                if (o0o00o00OooO00o.OooO0oO()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                o0000O0<T> o0000o1 = new o0000O0<>(o0o00o00OooO00o, null, o0o0o0oOooO00o);
                o0o00oo1.close();
                return o0000o1;
            } catch (Throwable th) {
                o0o00oo1.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            o0o00oo1.close();
            if (o0o00o00OooO00o.OooO0oO()) {
                return new o0000O0<>(o0o00o00OooO00o, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        OooO0O0 oooO0O0 = new OooO0O0(o0o00oo1);
        try {
            T tConvert = this.f60627OooO0oO.convert(oooO0O0);
            if (o0o00o00OooO00o.OooO0oO()) {
                return new o0000O0<>(o0o00o00OooO00o, tConvert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = oooO0O0.f60635OooO0oO;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.OooO0O0
    public final void OooOooo(OooO0o<T> oooO0o) {
        o00OO o00oo2;
        Throwable th;
        Objects.requireNonNull(oooO0o, "callback == null");
        synchronized (this) {
            if (this.f60630OooOO0O) {
                throw new IllegalStateException("Already executed.");
            }
            this.f60630OooOO0O = true;
            o00oo2 = this.f60623OooO;
            th = this.f60629OooOO0;
            if (o00oo2 == null && th == null) {
                try {
                    o00OO o00ooOooO0O0 = OooO0O0();
                    this.f60623OooO = o00ooOooO0O0;
                    o00oo2 = o00ooOooO0O0;
                } catch (Throwable th2) {
                    th = th2;
                    o0000O.OooOOO(th);
                    this.f60629OooOO0 = th;
                }
            }
        }
        if (th != null) {
            oooO0o.OooO00o(th);
            return;
        }
        if (this.f60628OooO0oo) {
            o00oo2.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(o00oo2, new OooO00o(oooO0o));
    }

    @Override // retrofit2.OooO0O0
    public final void cancel() {
        o00OO o00oo2;
        this.f60628OooO0oo = true;
        synchronized (this) {
            o00oo2 = this.f60623OooO;
        }
        if (o00oo2 != null) {
            o00oo2.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o0OOO0o(this.f60624OooO0Oo, this.f60626OooO0o0, this.f60625OooO0o, this.f60627OooO0oO);
    }

    @Override // retrofit2.OooO0O0
    public final boolean isCanceled() {
        boolean z = true;
        if (this.f60628OooO0oo) {
            return true;
        }
        synchronized (this) {
            o00OO o00oo2 = this.f60623OooO;
            if (o00oo2 == null || !o00oo2.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.OooO0O0
    public final retrofit2.OooO0O0 clone() {
        return new o0OOO0o(this.f60624OooO0Oo, this.f60626OooO0o0, this.f60625OooO0o, this.f60627OooO0oO);
    }
}
