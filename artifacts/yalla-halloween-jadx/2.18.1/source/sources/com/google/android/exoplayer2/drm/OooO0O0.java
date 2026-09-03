package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import p301o0O0Oooo.o000OOo0;
import p301o0O0Oooo.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f13725OooO00o = new OooO00o();

    public class OooO00o implements OooO0O0 {
        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final /* synthetic */ void OooO00o() {
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        @Nullable
        public final DrmSession OooO0O0(Looper looper, @Nullable com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o, Format format) {
            if (format.f13134OoooOoo == null) {
                return null;
            }
            return new OooO0o(new DrmSession.DrmSessionException(new UnsupportedDrmException()));
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        @Nullable
        public final Class<o00oOoo> OooO0OO(Format format) {
            if (format.f13134OoooOoo != null) {
                return o00oOoo.class;
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final /* synthetic */ void release() {
        }
    }

    void OooO00o();

    @Nullable
    DrmSession OooO0O0(Looper looper, @Nullable com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o, Format format);

    @Nullable
    Class<? extends o000OOo0> OooO0OO(Format format);

    void release();
}
