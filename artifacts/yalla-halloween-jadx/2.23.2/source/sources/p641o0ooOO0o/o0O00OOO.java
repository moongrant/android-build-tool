package p641o0ooOO0o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o00O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00OOO extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f57841OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f57842OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ byte[] f57843OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f57844OooO0Oo;

    public o0O00OOO(o0O000Oo o0o000oo2, byte[] bArr, int i, int i2) {
        this.f57841OooO00o = o0o000oo2;
        this.f57842OooO0O0 = i;
        this.f57843OooO0OO = bArr;
        this.f57844OooO0Oo = i2;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final long contentLength() {
        return this.f57842OooO0O0;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    @Nullable
    public final o0O000Oo contentType() {
        return this.f57841OooO00o;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final void writeTo(@NotNull o0O0o00O sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.o000OO(this.f57844OooO0Oo, this.f57842OooO0O0, this.f57843OooO0OO);
    }
}
