package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import o000O0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f7644OooO00o = new OooO00o();

    public class OooO00o implements OooO0OO {
        @Override // androidx.media3.exoplayer.drm.OooO0OO
        public final void OooO00o(Looper looper, o0oOO o0ooo2) {
        }

        @Override // androidx.media3.exoplayer.drm.OooO0OO
        @Nullable
        public final DrmSession OooO0O0(@Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1) {
            if (oooOO1.f6414OooOOo == null) {
                return null;
            }
            return new OooO(new DrmSession.DrmSessionException(6001, new UnsupportedDrmException()));
        }

        @Override // androidx.media3.exoplayer.drm.OooO0OO
        public final int OooO0OO(androidx.media3.common.OooOO0 oooOO1) {
            return oooOO1.f6414OooOOo != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.OooO0OO
        public final /* synthetic */ OooO0O0 OooO0Oo(androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1) {
            return OooO0O0.f7645OooO00o;
        }

        @Override // androidx.media3.exoplayer.drm.OooO0OO
        public final /* synthetic */ void OooO0o0() {
        }

        @Override // androidx.media3.exoplayer.drm.OooO0OO
        public final /* synthetic */ void release() {
        }
    }

    public interface OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o000OO0O.OooOO0 f7645OooO00o = new o000OO0O.OooOO0();

        void release();
    }

    void OooO00o(Looper looper, o0oOO o0ooo2);

    @Nullable
    DrmSession OooO0O0(@Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1);

    int OooO0OO(androidx.media3.common.OooOO0 oooOO1);

    OooO0O0 OooO0Oo(@Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1);

    void OooO0o0();

    void release();
}
