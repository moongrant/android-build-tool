package p310o0O0o0oo;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.UnknownNull;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p709oo0oOOo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000O0O0<T> extends o000O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o000oOoO f36274OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap<T, OooO0O0> f36275OooO0oO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Handler f36276OooO0oo;

    public final class OooO00o implements o00O0O00, com.google.android.exoplayer2.drm.OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @UnknownNull
        public final T f36278Oooo0o = null;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o00O0O00.OooO00o f36279Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o f36280Oooo0oo;

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public OooO00o() {
            this.f36279Oooo0oO = o000O0O0.this.f36270OooO0OO.OooO0oO(0, null);
            this.f36280Oooo0oo = o000O0O0.this.f36271OooO0Oo.OooO0oO(0, null);
        }

        public final boolean OooO00o(int i, @Nullable o00O00O.OooO00o oooO00o) {
            o00O00O.OooO00o oooO00oOooOOoo;
            if (oooO00o != null) {
                oooO00oOooOOoo = o000O0O0.this.OooOOoo(this.f36278Oooo0o, oooO00o);
                if (oooO00oOooOOoo == null) {
                    return false;
                }
            } else {
                oooO00oOooOOoo = null;
            }
            Objects.requireNonNull(o000O0O0.this);
            o00O0O00.OooO00o oooO00o2 = this.f36279Oooo0oO;
            if (oooO00o2.f36343OooO00o != i || !o000OOo0.OooO00o(oooO00o2.f36344OooO0O0, oooO00oOooOOoo)) {
                this.f36279Oooo0oO = o000O0O0.this.f36270OooO0OO.OooO0oO(i, oooO00oOooOOoo);
            }
            com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = this.f36280Oooo0oo;
            if (c0097OooO00o.f13720OooO00o == i && o000OOo0.OooO00o(c0097OooO00o.f13721OooO0O0, oooO00oOooOOoo)) {
                return true;
            }
            this.f36280Oooo0oo = o000O0O0.this.f36271OooO0Oo.OooO0oO(i, oooO00oOooOOoo);
            return true;
        }

        public final o00O000o OooO0O0(o00O000o o00o000o2) {
            o000O0O0 o000o0o1 = o000O0O0.this;
            long j = o00o000o2.f36327OooO0o;
            Objects.requireNonNull(o000o0o1);
            o000O0O0 o000o0o2 = o000O0O0.this;
            long j2 = o00o000o2.f36329OooO0oO;
            Objects.requireNonNull(o000o0o2);
            return (j == o00o000o2.f36327OooO0o && j2 == o00o000o2.f36329OooO0oO) ? o00o000o2 : new o00O000o(o00o000o2.f36323OooO00o, o00o000o2.f36324OooO0O0, o00o000o2.f36325OooO0OO, o00o000o2.f36326OooO0Oo, o00o000o2.f36328OooO0o0, j, j2);
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OooO0oo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f36279Oooo0oO.OooO0o(o00o0001, OooO0O0(o00o000o2));
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOOOo(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f36280Oooo0oo.OooO00o();
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OooOo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f36279Oooo0oO.OooO0Oo(o00o0001, OooO0O0(o00o000o2));
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOo0O(int i, @Nullable o00O00O.OooO00o oooO00o, Exception exc) {
            if (OooO00o(i, oooO00o)) {
                this.f36280Oooo0oo.OooO0o0(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOoO(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f36280Oooo0oo.OooO0OO();
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOoo(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f36280Oooo0oo.OooO0o();
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OooOooo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2, IOException iOException, boolean z) {
            if (OooO00o(i, oooO00o)) {
                this.f36279Oooo0oO.OooO0o0(o00o0001, OooO0O0(o00o000o2), iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void Oooo0(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f36280Oooo0oo.OooO0O0();
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void Oooo00O(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f36280Oooo0oo.OooO0Oo();
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void Oooo0o(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f36279Oooo0oO.OooO0OO(o00o0001, OooO0O0(o00o000o2));
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OoooO0(int i, @Nullable o00O00O.OooO00o oooO00o, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f36279Oooo0oO.OooO0O0(OooO0O0(o00o000o2));
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O00O f36281OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O00O.OooO0O0 f36282OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0O00 f36283OooO0OO;

        public OooO0O0(o00O00O o00o00o2, o00O00O.OooO0O0 oooO0O0, o00O0O00 o00o0o01) {
            this.f36281OooO00o = o00o00o2;
            this.f36282OooO0O0 = oooO0O0;
            this.f36283OooO0OO = o00o0o01;
        }
    }

    @Override // p310o0O0o0oo.o00O00O
    @CallSuper
    public void OooO0oo() throws IOException {
        Iterator<OooO0O0> it = this.f36275OooO0oO.values().iterator();
        while (it.hasNext()) {
            it.next().f36281OooO00o.OooO0oo();
        }
    }

    @Override // p310o0O0o0oo.o000O00O
    @CallSuper
    public final void OooOOO() {
        for (OooO0O0 oooO0O0 : this.f36275OooO0oO.values()) {
            oooO0O0.f36281OooO00o.OooOO0o(oooO0O0.f36282OooO0O0);
        }
    }

    @Override // p310o0O0o0oo.o000O00O
    @CallSuper
    public final void OooOOOO() {
        for (OooO0O0 oooO0O0 : this.f36275OooO0oO.values()) {
            oooO0O0.f36281OooO00o.OooO00o(oooO0O0.f36282OooO0O0);
        }
    }

    @Override // p310o0O0o0oo.o000O00O
    @CallSuper
    public void OooOOOo(@Nullable o000oOoO o000oooo2) {
        this.f36274OooO = o000oooo2;
        int i = o000OOo0.f36740OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        o00000O0.OooO0o(looperMyLooper);
        this.f36276OooO0oo = new Handler(looperMyLooper, null);
    }

    @Override // p310o0O0o0oo.o000O00O
    @CallSuper
    public void OooOOo() {
        for (OooO0O0 oooO0O0 : this.f36275OooO0oO.values()) {
            oooO0O0.f36281OooO00o.OooO0O0(oooO0O0.f36282OooO0O0);
            oooO0O0.f36281OooO00o.OooO0OO(oooO0O0.f36283OooO0OO);
        }
        this.f36275OooO0oO.clear();
    }

    @Nullable
    public o00O00O.OooO00o OooOOoo(@UnknownNull T t, o00O00O.OooO00o oooO00o) {
        return oooO00o;
    }

    public final void OooOo0(o00O00O o00o00o2) {
        o00000O0.OooO00o(!this.f36275OooO0oO.containsKey(null));
        o00O00O.OooO0O0 oooO0O0 = new o00O00O.OooO0O0() { // from class: o0O0o0oo.o000OO0O

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ Object f36295OooO0O0 = null;

            @Override // o0O0o0oo.o00O00O.OooO0O0
            public final void OooO00o(o00O00O o00o00o3, com.google.android.exoplayer2.o000oOoO o000oooo2) {
                this.f36294OooO00o.OooOo00(this.f36295OooO0O0, o000oooo2);
            }
        };
        OooO00o oooO00o = new OooO00o();
        this.f36275OooO0oO.put(null, new OooO0O0(o00o00o2, oooO0O0, oooO00o));
        Handler handler = this.f36276OooO0oo;
        Objects.requireNonNull(handler);
        o00o00o2.OooOO0(handler, oooO00o);
        Handler handler2 = this.f36276OooO0oo;
        Objects.requireNonNull(handler2);
        o00o00o2.OooO0oO(handler2, oooO00o);
        o00o00o2.OooO0o0(oooO0O0, this.f36274OooO);
        if (!this.f36269OooO0O0.isEmpty()) {
            return;
        }
        o00o00o2.OooOO0o(oooO0O0);
    }

    public abstract void OooOo00(@UnknownNull Object obj, com.google.android.exoplayer2.o000oOoO o000oooo2);
}
