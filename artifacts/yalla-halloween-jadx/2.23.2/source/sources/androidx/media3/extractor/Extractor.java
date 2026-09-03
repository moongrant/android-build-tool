package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface Extractor {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException;

    void OooO0O0(long j, long j2);

    void OooO0OO(Oooo0 oooo0);

    boolean OooO0o(Oooo000 oooo000) throws IOException;

    void release();
}
