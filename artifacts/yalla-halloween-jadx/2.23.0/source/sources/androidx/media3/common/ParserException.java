package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ParserException extends IOException {
    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        return o0O00o0.OooO0O0(new StringBuilder(), super.getMessage(), "{contentIsMalformed=false, dataType=0}");
    }
}
