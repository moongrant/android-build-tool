package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooO0O0 {

    public interface OooO00o {
    }

    void OooO00o(@Nullable OooO00o oooO00o) throws InterruptedException, IOException;

    void cancel();

    void remove();
}
