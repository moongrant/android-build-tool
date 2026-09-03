package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO implements DrmSession {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DrmSession.DrmSessionException f7635OooO00o;

    public OooO(DrmSession.DrmSessionException drmSessionException) {
        this.f7635OooO00o = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID OooO00o() {
        return C.f6206OooO00o;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean OooO0O0() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final o000O00.OooO0O0 OooO0OO() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void OooO0Oo(@Nullable OooO0O0.OooO00o oooO00o) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean OooO0o(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void OooO0o0(@Nullable OooO0O0.OooO00o oooO00o) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        return this.f7635OooO00o;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }
}
