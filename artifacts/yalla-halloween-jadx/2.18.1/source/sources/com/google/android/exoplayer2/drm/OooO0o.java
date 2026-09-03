package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import p301o0O0Oooo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements DrmSession {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DrmSession.DrmSessionException f13726OooO00o;

    public OooO0o(DrmSession.DrmSessionException drmSessionException) {
        this.f13726OooO00o = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO00o(@Nullable OooO00o.C0097OooO00o c0097OooO00o) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO0O0(@Nullable OooO00o.C0097OooO00o c0097OooO00o) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean OooO0OO() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final o000OOo0 OooO0Oo() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException OooO0o0() {
        return this.f13726OooO00o;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }
}
