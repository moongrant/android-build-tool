package p634o0ooO0oO;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oOO extends oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f57339OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ByteString f57340OooO0O0;

    public o0oOO(o00OOO0 o00ooo1, ByteString byteString) {
        this.f57339OooO00o = o00ooo1;
        this.f57340OooO0O0 = byteString;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final long contentLength() {
        return this.f57340OooO0O0.OooO0o0();
    }

    @Override // p634o0ooO0oO.oo00oO
    @Nullable
    public final o00OOO0 contentType() {
        return this.f57339OooO00o;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final void writeTo(@NotNull o0000Ooo sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.o0000O00(this.f57340OooO0O0);
    }
}
