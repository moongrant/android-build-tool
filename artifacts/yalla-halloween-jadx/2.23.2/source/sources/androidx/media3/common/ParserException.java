package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ParserException extends IOException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f6690OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6691OooO0o0;

    public ParserException(@Nullable String str, @Nullable Exception exc, boolean z, int i) {
        super(str, exc);
        this.f6690OooO0Oo = z;
        this.f6691OooO0o0 = i;
    }

    public static ParserException OooO00o(@Nullable String str, @Nullable Exception exc) {
        return new ParserException(str, exc, true, 1);
    }

    public static ParserException OooO0O0(@Nullable String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f6690OooO0Oo);
        sb.append(", dataType=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f6691OooO0o0, "}");
    }
}
