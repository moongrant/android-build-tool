package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;
import p206o00o0oOO.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f11759OooO0Oo;

        public DrmSessionException(int i, Throwable th) {
            super(th);
            this.f11759OooO0Oo = i;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    void OooO00o(@Nullable OooO0O0.OooO00o oooO00o);

    void OooO0O0(@Nullable OooO0O0.OooO00o oooO00o);

    UUID OooO0OO();

    boolean OooO0Oo();

    boolean OooO0o(String str);

    @Nullable
    o00Oo00 OooO0o0();

    @Nullable
    DrmSessionException getError();

    int getState();
}
