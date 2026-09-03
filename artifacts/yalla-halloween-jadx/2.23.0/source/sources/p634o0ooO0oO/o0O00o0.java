package p634o0ooO0oO;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00o0 extends oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f57329OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f57330OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ byte[] f57331OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f57332OooO0Oo;

    public o0O00o0(o00OOO0 o00ooo1, byte[] bArr, int i, int i2) {
        this.f57329OooO00o = o00ooo1;
        this.f57330OooO0O0 = i;
        this.f57331OooO0OO = bArr;
        this.f57332OooO0Oo = i2;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final long contentLength() {
        return this.f57330OooO0O0;
    }

    @Override // p634o0ooO0oO.oo00oO
    @Nullable
    public final o00OOO0 contentType() {
        return this.f57329OooO00o;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final void writeTo(@NotNull o0000Ooo sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.o000OO(this.f57332OooO0Oo, this.f57330OooO0O0, this.f57331OooO0OO);
    }
}
