package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ParserException extends IOException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f11333OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f11334OooO0o0;

    public ParserException(@Nullable String str, @Nullable Exception exc, boolean z, int i) {
        super(str, exc);
        this.f11333OooO0Oo = z;
        this.f11334OooO0o0 = i;
    }

    public static ParserException OooO00o(@Nullable String str, @Nullable Exception exc) {
        return new ParserException(str, exc, true, 1);
    }

    public static ParserException OooO0O0(@Nullable String str, @Nullable Exception exc) {
        return new ParserException(str, exc, true, 4);
    }

    public static ParserException OooO0OO(@Nullable String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f11333OooO0Oo);
        sb.append(", dataType=");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f11334OooO0o0, "}");
    }
}
