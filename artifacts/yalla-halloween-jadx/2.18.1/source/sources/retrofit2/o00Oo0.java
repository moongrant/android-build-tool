package retrofit2;

import androidx.appcompat.widget.o00000O0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import kotlin.jvm.internal.Intrinsics;
import p660o0ooo0o0.o00O0OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OO0OO;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0<T> implements retrofit2.OooO0O0<T> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooOO0<o00OOOOo, T> f53776Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0OO00O f53777Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Object[] f53778Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0O0ooO.OooO00o f53779Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f53780OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public o0O0ooO f53781OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile boolean f53782OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public Throwable f53783OoooO0O;

    public class OooO00o implements o00oOoo {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f53784Oooo0o;

        public OooO00o(OooO0o oooO0o) {
            this.f53784Oooo0o = oooO0o;
        }

        @Override // p660o0ooo0o0.o00oOoo
        public final void onFailure(o0O0ooO o0o0ooo, IOException iOException) {
            try {
                this.f53784Oooo0o.OooO00o(iOException);
            } catch (Throwable th) {
                o000000.OooOOO(th);
                th.printStackTrace();
            }
        }

        @Override // p660o0ooo0o0.o00oOoo
        public final void onResponse(o0O0ooO o0o0ooo, o00OOOO0 o00oooo1) {
            try {
                try {
                    this.f53784Oooo0o.OooO0O0(o00Oo0.this, o00Oo0.this.OooO0o0(o00oooo1));
                } catch (Throwable th) {
                    o000000.OooOOO(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                o000000.OooOOO(th2);
                try {
                    this.f53784Oooo0o.OooO00o(th2);
                } catch (Throwable th3) {
                    o000000.OooOOO(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    public static final class OooO0O0 extends o00OOOOo {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final o0O00OO f53786Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final o00OOOOo f53787Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @Nullable
        public IOException f53788OoooO00;

        public class OooO00o extends o0O00000 {
            public OooO00o(o0O0O0O o0o0o0o) {
                super(o0o0o0o);
            }

            @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
            public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
                try {
                    return super.Oooo0O0(o0ooo2, j);
                } catch (IOException e) {
                    OooO0O0.this.f53788OoooO00 = e;
                    throw e;
                }
            }
        }

        public OooO0O0(o00OOOOo o00ooooo2) {
            this.f53787Oooo0oo = o00ooooo2;
            this.f53786Oooo = (o0O00OO) o0O000Oo.OooO0OO(new OooO00o(o00ooooo2.OooO0oo()));
        }

        @Override // p660o0ooo0o0.o00OOOOo
        public final long OooO0Oo() {
            return this.f53787Oooo0oo.OooO0Oo();
        }

        @Override // p660o0ooo0o0.o00OOOOo
        public final o00OO0O0 OooO0o() {
            return this.f53787Oooo0oo.OooO0o();
        }

        @Override // p660o0ooo0o0.o00OOOOo
        public final o0oOOo OooO0oo() {
            return this.f53786Oooo;
        }

        @Override // p660o0ooo0o0.o00OOOOo, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f53787Oooo0oo.close();
        }
    }

    public static final class OooO0OO extends o00OOOOo {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final long f53790Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public final o00OO0O0 f53791Oooo0oo;

        public OooO0OO(@Nullable o00OO0O0 o00oo0o1, long j) {
            this.f53791Oooo0oo = o00oo0o1;
            this.f53790Oooo = j;
        }

        @Override // p660o0ooo0o0.o00OOOOo
        public final long OooO0Oo() {
            return this.f53790Oooo;
        }

        @Override // p660o0ooo0o0.o00OOOOo
        public final o00OO0O0 OooO0o() {
            return this.f53791Oooo0oo;
        }

        @Override // p660o0ooo0o0.o00OOOOo
        public final o0oOOo OooO0oo() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public o00Oo0(o0OO00O o0oo00o2, Object[] objArr, o0O0ooO.OooO00o oooO00o, OooOO0<o00OOOOo, T> oooOO1) {
        this.f53777Oooo0o = o0oo00o2;
        this.f53778Oooo0oO = objArr;
        this.f53779Oooo0oo = oooO00o;
        this.f53776Oooo = oooOO1;
    }

    @Override // retrofit2.OooO0O0
    public final synchronized o00OOO00 OooO00o() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return OooO0Oo().OooO00o();
    }

    @Override // retrofit2.OooO0O0
    public final oo0o0Oo<T> OooO0O0() throws IOException {
        o0O0ooO o0o0oooOooO0Oo;
        synchronized (this) {
            if (this.f53780OoooO) {
                throw new IllegalStateException("Already executed.");
            }
            this.f53780OoooO = true;
            o0o0oooOooO0Oo = OooO0Oo();
        }
        if (this.f53782OoooO00) {
            o0o0oooOooO0Oo.cancel();
        }
        return OooO0o0(o0o0oooOooO0Oo.OooO0O0());
    }

    public final o0O0ooO OooO0OO() throws IOException {
        o00OO000 url;
        o0O0ooO.OooO00o oooO00o = this.f53779Oooo0oo;
        o0OO00O o0oo00o2 = this.f53777Oooo0o;
        Object[] objArr = this.f53778Oooo0oO;
        o0ooOOo<?>[] o0oooooArr = o0oo00o2.f53819OooOO0;
        int length = objArr.length;
        if (length != o0oooooArr.length) {
            throw new IllegalArgumentException(o0O0O00.o0ooOOo.OooO00o(o00000O0.OooO00o("Argument count (", length, ") doesn't match expected count ("), o0oooooArr.length, ")"));
        }
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(o0oo00o2.f53813OooO0OO, o0oo00o2.f53812OooO0O0, o0oo00o2.f53814OooO0Oo, o0oo00o2.f53816OooO0o0, o0oo00o2.f53815OooO0o, o0oo00o2.f53817OooO0oO, o0oo00o2.f53818OooO0oo, o0oo00o2.f53810OooO);
        if (o0oo00o2.f53820OooOO0O) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            o0oooooArr[i].OooO00o(o0oo0oo2, objArr[i]);
        }
        o00OO000.OooO00o oooO00o2 = o0oo0oo2.f53856OooO0Oo;
        if (oooO00o2 != null) {
            url = oooO00o2.OooO0OO();
        } else {
            o00OO000 o00oo001 = o0oo0oo2.f53854OooO0O0;
            String link = o0oo0oo2.f53855OooO0OO;
            Objects.requireNonNull(o00oo001);
            Intrinsics.checkNotNullParameter(link, "link");
            o00OO000.OooO00o oooO00oOooO0oO = o00oo001.OooO0oO(link);
            url = oooO00oOooO0oO != null ? oooO00oOooO0oO.OooO0OO() : null;
            if (url == null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Malformed URL. Base: ");
                sbOooO0o0.append(o0oo0oo2.f53854OooO0O0);
                sbOooO0o0.append(", Relative: ");
                sbOooO0o0.append(o0oo0oo2.f53855OooO0OO);
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
        }
        o0o0Oo oooO00o3 = o0oo0oo2.f53862OooOO0O;
        if (oooO00o3 == null) {
            o00O0OO.OooO00o oooO00o4 = o0oo0oo2.f53861OooOO0;
            if (oooO00o4 != null) {
                oooO00o3 = oooO00o4.OooO0O0();
            } else {
                o00OO0OO.OooO00o oooO00o5 = o0oo0oo2.f53852OooO;
                if (oooO00o5 != null) {
                    oooO00o3 = oooO00o5.OooO0O0();
                } else if (o0oo0oo2.f53860OooO0oo) {
                    oooO00o3 = o0o0Oo.create((o00OO0O0) null, new byte[0]);
                }
            }
        }
        o00OO0O0 o00oo0o1 = o0oo0oo2.f53859OooO0oO;
        if (o00oo0o1 != null) {
            if (oooO00o3 != null) {
                oooO00o3 = new o0Oo0oo.OooO00o(oooO00o3, o00oo0o1);
            } else {
                o0oo0oo2.f53857OooO0o.OooO00o("Content-Type", o00oo0o1.f51402OooO00o);
            }
        }
        o00OOO00.OooO00o oooO00o6 = o0oo0oo2.f53858OooO0o0;
        Objects.requireNonNull(oooO00o6);
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o6.f51430OooO00o = url;
        oooO00o6.OooO0o(o0oo0oo2.f53857OooO0o.OooO0Oo());
        oooO00o6.OooO0oO(o0oo0oo2.f53853OooO00o, oooO00o3);
        oooO00o6.OooOO0(OooOo.class, new OooOo(o0oo00o2.f53811OooO00o, arrayList));
        o0O0ooO o0o0oooOooO0OO = oooO00o.OooO0OO(oooO00o6.OooO0O0());
        Objects.requireNonNull(o0o0oooOooO0OO, "Call.Factory returned null.");
        return o0o0oooOooO0OO;
    }

    @GuardedBy("this")
    public final o0O0ooO OooO0Oo() throws IOException {
        o0O0ooO o0o0ooo = this.f53781OoooO0;
        if (o0o0ooo != null) {
            return o0o0ooo;
        }
        Throwable th = this.f53783OoooO0O;
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
            o0O0ooO o0o0oooOooO0OO = OooO0OO();
            this.f53781OoooO0 = o0o0oooOooO0OO;
            return o0o0oooOooO0OO;
        } catch (IOException | Error | RuntimeException e) {
            o000000.OooOOO(e);
            this.f53783OoooO0O = e;
            throw e;
        }
    }

    public final oo0o0Oo<T> OooO0o0(o00OOOO0 o00oooo1) throws IOException {
        o00OOOOo o00ooooo2 = o00oooo1.f51441OoooO;
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o(o00oooo1);
        oooO00o.f51458OooO0oO = new OooO0OO(o00ooooo2.OooO0o(), o00ooooo2.OooO0Oo());
        o00OOOO0 o00oooo0OooO00o = oooO00o.OooO00o();
        int i = o00oooo0OooO00o.f51443OoooO00;
        if (i < 200 || i >= 300) {
            try {
                o00OOOOo o00oooooOooO00o = o000000.OooO00o(o00ooooo2);
                if (o00oooo0OooO00o.OooO0Oo()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                oo0o0Oo<T> oo0o0oo = new oo0o0Oo<>(o00oooo0OooO00o, null, o00oooooOooO00o);
                o00ooooo2.close();
                return oo0o0oo;
            } catch (Throwable th) {
                o00ooooo2.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            o00ooooo2.close();
            return oo0o0Oo.OooO0O0(null, o00oooo0OooO00o);
        }
        OooO0O0 oooO0O0 = new OooO0O0(o00ooooo2);
        try {
            return oo0o0Oo.OooO0O0(this.f53776Oooo.OooO00o(oooO0O0), o00oooo0OooO00o);
        } catch (RuntimeException e) {
            IOException iOException = oooO0O0.f53788OoooO00;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.OooO0O0
    public final boolean OooO0oo() {
        boolean z = true;
        if (this.f53782OoooO00) {
            return true;
        }
        synchronized (this) {
            o0O0ooO o0o0ooo = this.f53781OoooO0;
            if (o0o0ooo == null || !o0o0ooo.OooO0oo()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.OooO0O0
    public final void OoooOo0(OooO0o<T> oooO0o) {
        o0O0ooO o0o0ooo;
        Throwable th;
        Objects.requireNonNull(oooO0o, "callback == null");
        synchronized (this) {
            if (this.f53780OoooO) {
                throw new IllegalStateException("Already executed.");
            }
            this.f53780OoooO = true;
            o0o0ooo = this.f53781OoooO0;
            th = this.f53783OoooO0O;
            if (o0o0ooo == null && th == null) {
                try {
                    o0O0ooO o0o0oooOooO0OO = OooO0OO();
                    this.f53781OoooO0 = o0o0oooOooO0OO;
                    o0o0ooo = o0o0oooOooO0OO;
                } catch (Throwable th2) {
                    th = th2;
                    o000000.OooOOO(th);
                    this.f53783OoooO0O = th;
                }
            }
        }
        if (th != null) {
            oooO0o.OooO00o(th);
            return;
        }
        if (this.f53782OoooO00) {
            o0o0ooo.cancel();
        }
        o0o0ooo.OoooO0O(new OooO00o(oooO0o));
    }

    @Override // retrofit2.OooO0O0
    public final void cancel() {
        o0O0ooO o0o0ooo;
        this.f53782OoooO00 = true;
        synchronized (this) {
            o0o0ooo = this.f53781OoooO0;
        }
        if (o0o0ooo != null) {
            o0o0ooo.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o00Oo0(this.f53777Oooo0o, this.f53778Oooo0oO, this.f53779Oooo0oo, this.f53776Oooo);
    }

    @Override // retrofit2.OooO0O0
    /* JADX INFO: renamed from: clone */
    public final retrofit2.OooO0O0 mo2076clone() {
        return new o00Oo0(this.f53777Oooo0o, this.f53778Oooo0oO, this.f53779Oooo0oo, this.f53776Oooo);
    }
}
