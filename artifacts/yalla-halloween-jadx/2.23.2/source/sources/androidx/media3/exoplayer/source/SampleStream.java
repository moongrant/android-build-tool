package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o000O00O.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface SampleStream {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadDataResult {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadFlags {
    }

    void OooO00o() throws IOException;

    int OooO0O0(o00O0000 o00o0001, DecoderInputBuffer decoderInputBuffer, int i);

    int OooO0OO(long j);

    boolean OooO0Oo();
}
