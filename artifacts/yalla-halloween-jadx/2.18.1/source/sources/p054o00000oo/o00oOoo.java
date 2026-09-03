package p054o00000oo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f27225OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public char[] f27226OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27227OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f27228OooO0Oo;

    public o00oOoo(@NotNull char[] initBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
        this.f27225OooO00o = initBuffer.length;
        this.f27226OooO0O0 = initBuffer;
        this.f27227OooO0OO = i;
        this.f27228OooO0Oo = i2;
    }

    public final int OooO00o() {
        return this.f27225OooO00o - (this.f27228OooO0Oo - this.f27227OooO0OO);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply { append(this) }.toString()");
        return string;
    }
}
