package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface LoadErrorHandlingPolicy {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final IOException f8251OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f8252OooO0O0;

        public OooO00o(IOException iOException, int i) {
            this.f8251OooO00o = iOException;
            this.f8252OooO0O0 = i;
        }
    }

    long OooO00o(OooO00o oooO00o);

    int OooO0O0(int i);

    void OooO0OO();
}
