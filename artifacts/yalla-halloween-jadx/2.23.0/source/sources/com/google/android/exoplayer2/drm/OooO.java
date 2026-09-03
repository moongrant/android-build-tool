package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import java.util.UUID;
import p206o00o0oOO.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO implements DrmSession {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DrmSession.DrmSessionException f11765OooO00o;

    public OooO(DrmSession.DrmSessionException drmSessionException) {
        this.f11765OooO00o = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO00o(@Nullable OooO0O0.OooO00o oooO00o) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO0O0(@Nullable OooO0O0.OooO00o oooO00o) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID OooO0OO() {
        return C.f10896OooO00o;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean OooO0o(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final o00Oo00 OooO0o0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        return this.f11765OooO00o;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }
}
