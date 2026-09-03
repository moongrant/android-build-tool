package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import p200o00o0o.o0O0OOO0;
import p207o00o0oOo.o0OoO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f11774OooO00o = new OooO00o();

    public class OooO00o implements OooO0OO {
        @Override // com.google.android.exoplayer2.drm.OooO0OO
        public final int OooO00o(OooOo oooOo) {
            return oooOo.f11213OooOOo != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.OooO0OO
        @Nullable
        public final DrmSession OooO0O0(@Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, OooOo oooOo) {
            if (oooOo.f11213OooOOo == null) {
                return null;
            }
            return new OooO(new DrmSession.DrmSessionException(6001, new UnsupportedDrmException()));
        }

        @Override // com.google.android.exoplayer2.drm.OooO0OO
        public final /* synthetic */ void OooO0OO() {
        }

        @Override // com.google.android.exoplayer2.drm.OooO0OO
        public final /* synthetic */ OooO0O0 OooO0Oo(com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, OooOo oooOo) {
            return OooO0O0.f11775OooO00o;
        }

        @Override // com.google.android.exoplayer2.drm.OooO0OO
        public final void OooO0o0(Looper looper, o0O0OOO0 o0o0ooo0) {
        }

        @Override // com.google.android.exoplayer2.drm.OooO0OO
        public final /* synthetic */ void release() {
        }
    }

    public interface OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0OoO00O f11775OooO00o = new o0OoO00O();

        void release();
    }

    int OooO00o(OooOo oooOo);

    @Nullable
    DrmSession OooO0O0(@Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, OooOo oooOo);

    void OooO0OO();

    OooO0O0 OooO0Oo(@Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, OooOo oooOo);

    void OooO0o0(Looper looper, o0O0OOO0 o0o0ooo0);

    void release();
}
