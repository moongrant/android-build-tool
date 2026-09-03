package p641o0ooOO0o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o00O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00OO extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f57839OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ByteString f57840OooO0O0;

    public o0O00OO(o0O000Oo o0o000oo2, ByteString byteString) {
        this.f57839OooO00o = o0o000oo2;
        this.f57840OooO0O0 = byteString;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final long contentLength() {
        return this.f57840OooO0O0.OooO0o0();
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    @Nullable
    public final o0O000Oo contentType() {
        return this.f57839OooO00o;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final void writeTo(@NotNull o0O0o00O sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.o0000oo(this.f57840OooO0O0);
    }
}
