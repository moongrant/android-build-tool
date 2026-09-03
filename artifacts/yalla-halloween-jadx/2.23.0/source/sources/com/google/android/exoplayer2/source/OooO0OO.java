package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.util.UnknownNull;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p200o00o0o.o0O0OOO0;
import p226o00oOo00.o0000;
import p226o00oOo00.o0000O00;
import p226o00oOo00.oo0o0Oo;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OooO0OO<T> extends com.google.android.exoplayer2.source.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Handler f12990OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<T, OooO0O0<T>> f12991OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00O0OO0 f12992OooOO0;

    public final class OooO00o implements OooOo00, com.google.android.exoplayer2.drm.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @UnknownNull
        public final T f12993OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.OooO0O0.OooO00o f12994OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOo00.OooO00o f12995OooO0o0;

        public OooO00o(T t) {
            this.f12995OooO0o0 = new OooOo00.OooO00o(OooO0OO.this.f12975OooO0OO.f13060OooO0OO, 0, null);
            this.f12994OooO0o = new com.google.android.exoplayer2.drm.OooO0O0.OooO00o(OooO0OO.this.f12976OooO0Oo.f11771OooO0OO, 0, null);
            this.f12993OooO0Oo = t;
        }

        public final boolean OooO00o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            OooOOOO.OooO0O0 oooO0O0OooOo00;
            T t = this.f12993OooO0Oo;
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
            OooOo00.OooO00o oooO00o = this.f12995OooO0o0;
            if (oooO00o.f13058OooO00o != iOooOo0O || !o0O00.OooO00o(oooO00o.f13059OooO0O0, oooO0O0OooOo00)) {
                this.f12995OooO0o0 = new OooOo00.OooO00o(oooO0OO.f12975OooO0OO.f13060OooO0OO, iOooOo0O, oooO0O0OooOo00);
            }
            com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o2 = this.f12994OooO0o;
            if (oooO00o2.f11769OooO00o == iOooOo0O && o0O00.OooO00o(oooO00o2.f11770OooO0O0, oooO0O0OooOo00)) {
                return true;
            }
            this.f12994OooO0o = new com.google.android.exoplayer2.drm.OooO0O0.OooO00o(oooO0OO.f12976OooO0Oo.f11771OooO0OO, iOooOo0O, oooO0O0OooOo00);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOO0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00, IOException iOException, boolean z) {
            if (OooO00o(i, oooO0O0)) {
                this.f12995OooO0o0.OooO0oo(o0000Var, Oooo0OO(o0000o00), iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final /* synthetic */ void OooOO0O() {
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void OooOo00(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooO00o(i, oooO0O0)) {
                this.f12994OooO0o.OooO0O0();
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOoO0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00) {
            if (OooO00o(i, oooO0O0)) {
                this.f12995OooO0o0.OooO0Oo(o0000Var, Oooo0OO(o0000o00));
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOoOO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00) {
            if (OooO00o(i, oooO0O0)) {
                this.f12995OooO0o0.OooOO0(o0000Var, Oooo0OO(o0000o00));
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void OooOoo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Exception exc) {
            if (OooO00o(i, oooO0O0)) {
                this.f12994OooO0o.OooO0o0(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOoo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000O00 o0000o00) {
            if (OooO00o(i, oooO0O0)) {
                this.f12995OooO0o0.OooOO0O(Oooo0OO(o0000o00));
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOooo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00) {
            if (OooO00o(i, oooO0O0)) {
                this.f12995OooO0o0.OooO0o(o0000Var, Oooo0OO(o0000o00));
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooO00o(i, oooO0O0)) {
                this.f12994OooO0o.OooO0o();
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo000(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooO00o(i, oooO0O0)) {
                this.f12994OooO0o.OooO00o();
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void Oooo00O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000O00 o0000o00) {
            if (OooO00o(i, oooO0O0)) {
                this.f12995OooO0o0.OooO0O0(Oooo0OO(o0000o00));
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo00o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, int i2) {
            if (OooO00o(i, oooO0O0)) {
                this.f12994OooO0o.OooO0Oo(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo0O0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            if (OooO00o(i, oooO0O0)) {
                this.f12994OooO0o.OooO0OO();
            }
        }

        public final o0000O00 Oooo0OO(o0000O00 o0000o00) {
            long j = o0000o00.f39845OooO0o;
            OooO0OO oooO0OO = OooO0OO.this;
            T t = this.f12993OooO0Oo;
            long jOooOo0 = oooO0OO.OooOo0(j, t);
            long j2 = o0000o00.f39847OooO0oO;
            long jOooOo1 = oooO0OO.OooOo0(j2, t);
            return (jOooOo0 == o0000o00.f39845OooO0o && jOooOo1 == j2) ? o0000o00 : new o0000O00(o0000o00.f39841OooO00o, o0000o00.f39842OooO0O0, o0000o00.f39843OooO0OO, o0000o00.f39844OooO0Oo, o0000o00.f39846OooO0o0, jOooOo0, jOooOo1);
        }
    }

    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOOO f12997OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOOO.OooO0OO f12998OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO<T>.OooO00o f12999OooO0OO;

        public OooO0O0(OooOOOO oooOOOO, oo0o0Oo oo0o0oo, OooO00o oooO00o) {
            this.f12997OooO00o = oooOOOO;
            this.f12998OooO0O0 = oo0o0oo;
            this.f12999OooO0OO = oooO00o;
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    @CallSuper
    public void OooOO0o() throws IOException {
        Iterator<OooO0O0<T>> it = this.f12991OooO0oo.values().iterator();
        while (it.hasNext()) {
            it.next().f12997OooO00o.OooOO0o();
        }
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    @CallSuper
    public final void OooOOOO() {
        for (OooO0O0<T> oooO0O0 : this.f12991OooO0oo.values()) {
            oooO0O0.f12997OooO00o.OooO(oooO0O0.f12998OooO0O0);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    @CallSuper
    public final void OooOOOo() {
        for (OooO0O0<T> oooO0O0 : this.f12991OooO0oo.values()) {
            oooO0O0.f12997OooO00o.OooO0oO(oooO0O0.f12998OooO0O0);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    @CallSuper
    public void OooOOoo() {
        HashMap<T, OooO0O0<T>> map = this.f12991OooO0oo;
        for (OooO0O0<T> oooO0O0 : map.values()) {
            oooO0O0.f12997OooO00o.OooO00o(oooO0O0.f12998OooO0O0);
            OooOOOO oooOOOO = oooO0O0.f12997OooO00o;
            OooO0OO<T>.OooO00o oooO00o = oooO0O0.f12999OooO0OO;
            oooOOOO.OooO0OO(oooO00o);
            oooOOOO.OooOO0O(oooO00o);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.exoplayer2.source.OooOOOO$OooO0OO, o00oOo00.oo0o0Oo] */
    public final void OooOo(@UnknownNull final T t, OooOOOO oooOOOO) {
        HashMap<T, OooO0O0<T>> map = this.f12991OooO0oo;
        o00O000o.OooO00o(!map.containsKey(t));
        ?? r1 = new OooOOOO.OooO0OO() { // from class: o00oOo00.oo0o0Oo
            @Override // com.google.android.exoplayer2.source.OooOOOO.OooO0OO
            public final void OooO00o(OooOOOO oooOOOO2, com.google.android.exoplayer2.oo0o0Oo oo0o0oo) {
                this.f39900OooO00o.OooOo0o(t, oooOOOO2, oo0o0oo);
            }
        };
        OooO00o oooO00o = new OooO00o(t);
        map.put(t, new OooO0O0<>(oooOOOO, r1, oooO00o));
        Handler handler = this.f12990OooO;
        handler.getClass();
        oooOOOO.OooO0O0(handler, oooO00o);
        Handler handler2 = this.f12990OooO;
        handler2.getClass();
        oooOOOO.OooOO0(handler2, oooO00o);
        o00O0OO0 o00o0oo1 = this.f12992OooOO0;
        o0O0OOO0 o0o0ooo0 = this.f12979OooO0oO;
        o00O000o.OooO0o0(o0o0ooo0);
        oooOOOO.OooO0o(r1, o00o0oo1, o0o0ooo0);
        if (!this.f12974OooO0O0.isEmpty()) {
            return;
        }
        oooOOOO.OooO(r1);
    }

    public long OooOo0(long j, @UnknownNull Object obj) {
        return j;
    }

    @Nullable
    public abstract OooOOOO.OooO0O0 OooOo00(@UnknownNull T t, OooOOOO.OooO0O0 oooO0O0);

    public int OooOo0O(int i, @UnknownNull Object obj) {
        return i;
    }

    public abstract void OooOo0o(@UnknownNull T t, OooOOOO oooOOOO, com.google.android.exoplayer2.oo0o0Oo oo0o0oo);
}
