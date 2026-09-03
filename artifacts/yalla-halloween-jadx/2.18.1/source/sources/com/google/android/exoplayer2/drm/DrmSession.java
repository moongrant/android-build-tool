package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p301o0O0Oooo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    void OooO00o(@Nullable OooO00o.C0097OooO00o c0097OooO00o);

    void OooO0O0(@Nullable OooO00o.C0097OooO00o c0097OooO00o);

    boolean OooO0OO();

    @Nullable
    o000OOo0 OooO0Oo();

    @Nullable
    DrmSessionException OooO0o0();

    int getState();
}
