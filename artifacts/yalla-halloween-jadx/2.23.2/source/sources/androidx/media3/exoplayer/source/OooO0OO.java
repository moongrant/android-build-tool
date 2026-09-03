package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnknownNull;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import o000O0.o0oOO;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class OooO0OO<T> extends androidx.media3.exoplayer.source.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Handler f7889OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<T, OooO0O0<T>> f7890OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o000O0O.OooOo f7891OooOO0;

    public final class OooO00o implements OooOo00, androidx.media3.exoplayer.drm.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @UnknownNull
        public final T f7892OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public androidx.media3.exoplayer.drm.OooO0O0.OooO00o f7893OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOo00.OooO00o f7894OooO0o0;

        public OooO00o(T t) {
            this.f7894OooO0o0 = new OooOo00.OooO00o(OooO0OO.this.f7874OooO0OO.f7959OooO0OO, 0, null);
            this.f7893OooO0o = new androidx.media3.exoplayer.drm.OooO0O0.OooO00o(OooO0OO.this.f7875OooO0Oo.f7641OooO0OO, 0, null);
            this.f7892OooO0Oo = t;
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOO0O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.Oooo000 oooo000) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7894OooO0o0.OooO00o(Oooo0O0(oooo000));
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final /* synthetic */ void OooOOO0() {
        }

        public final boolean OooOOoo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            OooOOOO.OooO0O0 oooO0O0OooOo00;
            T t = this.f7892OooO0Oo;
            OooO0OO oooO0OO = OooO0OO.this;
            if (oooO0O0 != null) {
                oooO0O0OooOo00 = oooO0OO.OooOo00(t, oooO0O0);
                if (oooO0O0OooOo00 == null) {
                    return false;
                }
            } else {
                oooO0O0OooOo00 = null;
            }
            int iOooOo0O = oooO0OO.OooOo0O(i, t);
            OooOo00.OooO00o oooO00o = this.f7894OooO0o0;
            if (oooO00o.f7957OooO00o != iOooOo0O || !o00.OooO00o(oooO00o.f7958OooO0O0, oooO0O0OooOo00)) {
                this.f7894OooO0o0 = new OooOo00.OooO00o(oooO0OO.f7874OooO0OO.f7959OooO0OO, iOooOo0O, oooO0O0OooOo00);
            }
            androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o2 = this.f7893OooO0o;
            if (oooO00o2.f7639OooO00o == iOooOo0O && o00.OooO00o(oooO00o2.f7640OooO0O0, oooO0O0OooOo00)) {
                return true;
            }
            this.f7893OooO0o = new androidx.media3.exoplayer.drm.OooO0O0.OooO00o(oooO0OO.f7875OooO0Oo.f7641OooO0OO, iOooOo0O, oooO0O0OooOo00);
            return true;
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7894OooO0o0.OooO0OO(oooOo, Oooo0O0(oooo000));
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOo0o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7893OooO0o.OooO00o();
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOoO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, int i2) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7893OooO0o.OooO0Oo(i2);
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOoOO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7893OooO0o.OooO0O0();
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOoo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Exception exc) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7893OooO0o.OooO0o0(exc);
            }
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOooO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7894OooO0o0.OooO0o(oooOo, Oooo0O0(oooo000));
            }
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOooo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000, IOException iOException, boolean z) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7894OooO0o0.OooO0o0(oooOo, Oooo0O0(oooo000), iOException, z);
            }
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void Oooo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7894OooO0o0.OooO0O0(oooOo, Oooo0O0(oooo000));
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void Oooo000(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7893OooO0o.OooO0OO();
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void Oooo00O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooOOoo(i, oooO0O0)) {
                this.f7893OooO0o.OooO0o();
            }
        }

        public final o000O.Oooo000 Oooo0O0(o000O.Oooo000 oooo000) {
            long j = oooo000.f33852OooO0o;
            OooO0OO oooO0OO = OooO0OO.this;
            T t = this.f7892OooO0Oo;
            long jOooOo0 = oooO0OO.OooOo0(j, t);
            long j2 = oooo000.f33854OooO0oO;
            long jOooOo1 = oooO0OO.OooOo0(j2, t);
            return (jOooOo0 == oooo000.f33852OooO0o && jOooOo1 == j2) ? oooo000 : new o000O.Oooo000(oooo000.f33848OooO00o, oooo000.f33849OooO0O0, oooo000.f33850OooO0OO, oooo000.f33851OooO0Oo, oooo000.f33853OooO0o0, jOooOo0, jOooOo1);
        }
    }

    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOOO f7896OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOOO.OooO0OO f7897OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO<T>.OooO00o f7898OooO0OO;

        public OooO0O0(OooOOOO oooOOOO, o000O.OooO0O0 oooO0O0, OooO00o oooO00o) {
            this.f7896OooO00o = oooOOOO;
            this.f7897OooO0O0 = oooO0O0;
            this.f7898OooO0OO = oooO00o;
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    @CallSuper
    public void OooOO0o() throws IOException {
        Iterator<OooO0O0<T>> it = this.f7890OooO0oo.values().iterator();
        while (it.hasNext()) {
            it.next().f7896OooO00o.OooOO0o();
        }
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    @CallSuper
    public final void OooOOOO() {
        for (OooO0O0<T> oooO0O0 : this.f7890OooO0oo.values()) {
            oooO0O0.f7896OooO00o.OooOO0O(oooO0O0.f7897OooO0O0);
        }
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    @CallSuper
    public final void OooOOOo() {
        for (OooO0O0<T> oooO0O0 : this.f7890OooO0oo.values()) {
            oooO0O0.f7896OooO00o.OooO(oooO0O0.f7897OooO0O0);
        }
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    @CallSuper
    public void OooOOoo() {
        HashMap<T, OooO0O0<T>> map = this.f7890OooO0oo;
        for (OooO0O0<T> oooO0O0 : map.values()) {
            oooO0O0.f7896OooO00o.OooOO0(oooO0O0.f7897OooO0O0);
            OooOOOO oooOOOO = oooO0O0.f7896OooO00o;
            OooO0OO<T>.OooO00o oooO00o = oooO0O0.f7898OooO0OO;
            oooOOOO.OooO0O0(oooO00o);
            oooOOOO.OooO0o(oooO00o);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.OooOOOO$OooO0OO, o000O.OooO0O0] */
    public final void OooOo(@UnknownNull final T t, OooOOOO oooOOOO) {
        HashMap<T, OooO0O0<T>> map = this.f7890OooO0oo;
        p080o000OoO.o00Oo0.OooO00o(!map.containsKey(t));
        ?? r1 = new OooOOOO.OooO0OO() { // from class: o000O.OooO0O0
            @Override // androidx.media3.exoplayer.source.OooOOOO.OooO0OO
            public final void OooO00o(androidx.media3.exoplayer.source.OooOOOO oooOOOO2, androidx.media3.common.Oooo0 oooo0) {
                this.f33832OooO00o.OooOo0o(t, oooOOOO2, oooo0);
            }
        };
        OooO00o oooO00o = new OooO00o(t);
        map.put(t, new OooO0O0<>(oooOOOO, r1, oooO00o));
        Handler handler = this.f7889OooO;
        handler.getClass();
        oooOOOO.OooO00o(handler, oooO00o);
        Handler handler2 = this.f7889OooO;
        handler2.getClass();
        oooOOOO.OooO0o0(handler2, oooO00o);
        o000O0O.OooOo oooOo = this.f7891OooOO0;
        o0oOO o0ooo2 = this.f7878OooO0oO;
        p080o000OoO.o00Oo0.OooO0o(o0ooo2);
        oooOOOO.OooO0oo(r1, oooOo, o0ooo2);
        if (!this.f7873OooO0O0.isEmpty()) {
            return;
        }
        oooOOOO.OooOO0O(r1);
    }

    public long OooOo0(long j, @UnknownNull Object obj) {
        return j;
    }

    @Nullable
    public abstract OooOOOO.OooO0O0 OooOo00(@UnknownNull T t, OooOOOO.OooO0O0 oooO0O0);

    public int OooOo0O(int i, @UnknownNull Object obj) {
        return i;
    }

    public abstract void OooOo0o(@UnknownNull T t, OooOOOO oooOOOO, androidx.media3.common.Oooo0 oooo0);
}
