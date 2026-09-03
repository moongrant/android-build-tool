package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f7629OooO0Oo;

        public DrmSessionException(int i, Throwable th) {
            super(th);
            this.f7629OooO0Oo = i;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    UUID OooO00o();

    boolean OooO0O0();

    @Nullable
    o000O00.OooO0O0 OooO0OO();

    void OooO0Oo(@Nullable OooO0O0.OooO00o oooO00o);

    boolean OooO0o(String str);

    void OooO0o0(@Nullable OooO0O0.OooO00o oooO00o);

    @Nullable
    DrmSessionException getError();

    int getState();
}
