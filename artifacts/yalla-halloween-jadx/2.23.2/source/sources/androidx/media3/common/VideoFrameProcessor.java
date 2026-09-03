package androidx.media3.common;

import android.view.Surface;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoFrameProcessor {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface OooO00o {
        VideoFrameProcessor OooO00o() throws VideoFrameProcessingException;
    }

    void OooO00o();

    void OooO0O0();

    Surface OooO0OO();

    void OooO0Oo();

    void OooO0o();

    int OooO0o0();

    void OooO0oO();

    void flush();

    void release();
}
