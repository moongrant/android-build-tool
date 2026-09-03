package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.UnstableApi;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOO0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f7929OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0O0 f7930OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0o f7931OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO00o f7932OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public OooOO0O f7933OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f7934OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f7935OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f7936OooOOoo;

    public static final class OooO00o extends o000O.OooOo00 {

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final Object f7937OooOO0o = new Object();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final Object f7938OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final Object f7939OooOO0O;

        public OooO00o(androidx.media3.common.Oooo0 oooo0, @Nullable Object obj, @Nullable Object obj2) {
            super(oooo0);
            this.f7938OooOO0 = obj;
            this.f7939OooOO0O = obj2;
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final int OooO0o0(Object obj) {
            Object obj2;
            if (f7937OooOO0o.equals(obj) && (obj2 = this.f7939OooOO0O) != null) {
                obj = obj2;
            }
            return this.f33844OooO.OooO0o0(obj);
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0O0 OooOO0(int i, androidx.media3.common.Oooo0.OooO0O0 oooO0O0, boolean z) {
            this.f33844OooO.OooOO0(i, oooO0O0, z);
            if (o00.OooO00o(oooO0O0.f6643OooO0o0, this.f7939OooOO0O) && z) {
                oooO0O0.f6643OooO0o0 = f7937OooOO0o;
            }
            return oooO0O0;
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final Object OooOOOo(int i) {
            Object objOooOOOo = this.f33844OooO.OooOOOo(i);
            return o00.OooO00o(objOooOOOo, this.f7939OooOO0O) ? f7937OooOO0o : objOooOOOo;
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0o OooOOo(int i, androidx.media3.common.Oooo0.OooO0o oooO0o, long j) {
            this.f33844OooO.OooOOo(i, oooO0o, j);
            if (o00.OooO00o(oooO0o.f6669OooO0Oo, this.f7938OooOO0)) {
                oooO0o.f6669OooO0Oo = androidx.media3.common.Oooo0.OooO0o.f6652OooOo0;
            }
            return oooO0o;
        }
    }

    @VisibleForTesting
    public static final class OooO0O0 extends androidx.media3.common.Oooo0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final androidx.media3.common.OooOOO0 f7940OooO;

        public OooO0O0(androidx.media3.common.OooOOO0 oooOOO0) {
            this.f7940OooO = oooOOO0;
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooO0o0(Object obj) {
            return obj == OooO00o.f7937OooOO0o ? 0 : -1;
        }

        @Override // androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0O0 OooOO0(int i, androidx.media3.common.Oooo0.OooO0O0 oooO0O0, boolean z) {
            oooO0O0.OooOOO0(z ? 0 : null, z ? OooO00o.f7937OooOO0o : null, 0, -9223372036854775807L, 0L, AdPlaybackState.f6176OooOO0, true);
            return oooO0O0;
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOO0o() {
            return 1;
        }

        @Override // androidx.media3.common.Oooo0
        public final Object OooOOOo(int i) {
            return OooO00o.f7937OooOO0o;
        }

        @Override // androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0o OooOOo(int i, androidx.media3.common.Oooo0.OooO0o oooO0o, long j) {
            oooO0o.OooO0o0(androidx.media3.common.Oooo0.OooO0o.f6652OooOo0, this.f7940OooO, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            oooO0o.f6679OooOOOO = true;
            return oooO0o;
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOOoo() {
            return 1;
        }
    }

    public OooOOO0(OooOOOO oooOOOO, boolean z) {
        super(oooOOOO);
        this.f7929OooOO0o = z && oooOOOO.OooOOO0();
        this.f7931OooOOO0 = new androidx.media3.common.Oooo0.OooO0o();
        this.f7930OooOOO = new androidx.media3.common.Oooo0.OooO0O0();
        androidx.media3.common.Oooo0 oooo0OooOOO = oooOOOO.OooOOO();
        if (oooo0OooOOO == null) {
            this.f7932OooOOOO = new OooO00o(new OooO0O0(oooOOOO.OooO0Oo()), androidx.media3.common.Oooo0.OooO0o.f6652OooOo0, OooO00o.f7937OooOO0o);
        } else {
            this.f7932OooOOOO = new OooO00o(oooo0OooOOO, null, null);
            this.f7936OooOOoo = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0oO(OooOOO oooOOO) {
        ((OooOO0O) oooOOO).OooOOO();
        if (oooOOO == this.f7933OooOOOo) {
            this.f7933OooOOOo = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO, androidx.media3.exoplayer.source.OooOOOO
    public final void OooOO0o() {
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO, androidx.media3.exoplayer.source.OooO00o
    public final void OooOOoo() {
        this.f7934OooOOo = false;
        this.f7935OooOOo0 = false;
        super.OooOOoo();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.o0ooOOo
    public final void OooOoO(androidx.media3.common.Oooo0 oooo0) {
        long j;
        OooO00o oooO00o;
        OooOOOO.OooO0O0 OooO0O1;
        OooO00o oooO00o2;
        if (this.f7934OooOOo) {
            OooO00o oooO00o3 = this.f7932OooOOOO;
            this.f7932OooOOOO = new OooO00o(oooo0, oooO00o3.f7938OooOO0, oooO00o3.f7939OooOO0O);
            OooOO0O oooOO0O = this.f7933OooOOOo;
            if (oooOO0O != null) {
                OooOoo(oooOO0O.f7928OooOO0);
            }
        } else {
            if (!oooo0.OooOo00()) {
                androidx.media3.common.Oooo0.OooO0o oooO0o = this.f7931OooOOO0;
                oooo0.OooOOo0(0, oooO0o);
                long j2 = oooO0o.f6680OooOOOo;
                Object obj = oooO0o.f6669OooO0Oo;
                OooOO0O oooOO0O2 = this.f7933OooOOOo;
                if (oooOO0O2 != null) {
                    OooO00o oooO00o4 = this.f7932OooOOOO;
                    Object obj2 = oooOO0O2.f7923OooO0Oo.f33816OooO00o;
                    androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f7930OooOOO;
                    oooO00o4.OooOO0O(obj2, oooO0O0);
                    long j3 = oooO0O0.f6645OooO0oo + oooOO0O2.f7925OooO0o0;
                    if (j3 != this.f7932OooOOOO.OooOOo0(0, oooO0o).f6680OooOOOo) {
                        j = j3;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair<Object, Long> pairOooOOO0 = oooo0.OooOOO0(this.f7931OooOOO0, this.f7930OooOOO, 0, j);
                Object obj3 = pairOooOOO0.first;
                long jLongValue = ((Long) pairOooOOO0.second).longValue();
                if (this.f7936OooOOoo) {
                    OooO00o oooO00o5 = this.f7932OooOOOO;
                    oooO00o = new OooO00o(oooo0, oooO00o5.f7938OooOO0, oooO00o5.f7939OooOO0O);
                } else {
                    oooO00o = new OooO00o(oooo0, obj, obj3);
                }
                this.f7932OooOOOO = oooO00o;
                OooOO0O oooOO0O3 = this.f7933OooOOOo;
                if (oooOO0O3 != null) {
                    OooOoo(jLongValue);
                    OooOOOO.OooO0O0 oooO0O1 = oooOO0O3.f7923OooO0Oo;
                    Object obj4 = oooO0O1.f33816OooO00o;
                    if (this.f7932OooOOOO.f7939OooOO0O != null && obj4.equals(OooO00o.f7937OooOO0o)) {
                        obj4 = this.f7932OooOOOO.f7939OooOO0O;
                    }
                    OooO0O1 = oooO0O1.OooO0O0(obj4);
                }
                this.f7936OooOOoo = true;
                this.f7934OooOOo = true;
                OooOOo(this.f7932OooOOOO);
                if (OooO0O1 != null) {
                    OooOO0O oooOO0O4 = this.f7933OooOOOo;
                    oooOO0O4.getClass();
                    oooOO0O4.OooOO0O(OooO0O1);
                }
            }
            if (this.f7936OooOOoo) {
                OooO00o oooO00o6 = this.f7932OooOOOO;
                oooO00o2 = new OooO00o(oooo0, oooO00o6.f7938OooOO0, oooO00o6.f7939OooOO0O);
            } else {
                oooO00o2 = new OooO00o(oooo0, androidx.media3.common.Oooo0.OooO0o.f6652OooOo0, OooO00o.f7937OooOO0o);
            }
            this.f7932OooOOOO = oooO00o2;
        }
        OooO0O1 = null;
        this.f7936OooOOoo = true;
        this.f7934OooOOo = true;
        OooOOo(this.f7932OooOOOO);
        if (OooO0O1 != null) {
            OooOO0O oooOO0O5 = this.f7933OooOOOo;
            oooOO0O5.getClass();
            oooOO0O5.OooOO0O(OooO0O1);
        }
    }

    @Override // androidx.media3.exoplayer.source.o0ooOOo
    @Nullable
    public final OooOOOO.OooO0O0 OooOoO0(OooOOOO.OooO0O0 oooO0O0) {
        Object obj = oooO0O0.f33816OooO00o;
        Object obj2 = this.f7932OooOOOO.f7939OooOO0O;
        if (obj2 != null && obj2.equals(obj)) {
            obj = OooO00o.f7937OooOO0o;
        }
        return oooO0O0.OooO0O0(obj);
    }

    @Override // androidx.media3.exoplayer.source.o0ooOOo
    public final void OooOoOO() {
        if (this.f7929OooOO0o) {
            return;
        }
        this.f7935OooOOo0 = true;
        OooOo(null, this.f8099OooOO0O);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void OooOoo(long j) {
        OooOO0O oooOO0O = this.f7933OooOOOo;
        int iOooO0o0 = this.f7932OooOOOO.OooO0o0(oooOO0O.f7923OooO0Oo.f33816OooO00o);
        if (iOooO0o0 == -1) {
            return;
        }
        OooO00o oooO00o = this.f7932OooOOOO;
        androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f7930OooOOO;
        oooO00o.OooOO0(iOooO0o0, oooO0O0, false);
        long j2 = oooO0O0.f6644OooO0oO;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        oooOO0O.f7928OooOO0 = j;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    /* JADX INFO: renamed from: OooOoo0, reason: merged with bridge method [inline-methods] */
    public final OooOO0O OooO0OO(OooOOOO.OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j) {
        OooOO0O oooOO0O = new OooOO0O(oooO0O0, o00oo1, j);
        p080o000OoO.o00Oo0.OooO0Oo(oooOO0O.f7926OooO0oO == null);
        OooOOOO oooOOOO = this.f8099OooOO0O;
        oooOO0O.f7926OooO0oO = oooOOOO;
        if (this.f7934OooOOo) {
            Object obj = this.f7932OooOOOO.f7939OooOO0O;
            Object obj2 = oooO0O0.f33816OooO00o;
            if (obj != null && obj2.equals(OooO00o.f7937OooOO0o)) {
                obj2 = this.f7932OooOOOO.f7939OooOO0O;
            }
            oooOO0O.OooOO0O(oooO0O0.OooO0O0(obj2));
        } else {
            this.f7933OooOOOo = oooOO0O;
            if (!this.f7935OooOOo0) {
                this.f7935OooOOo0 = true;
                OooOo(null, oooOOOO);
            }
        }
        return oooOO0O;
    }
}
