package p641o0ooOO0o;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00O extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f57826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ File f57827OooO0O0;

    public o0O00O(File file, o0O000Oo o0o000oo2) {
        this.f57826OooO00o = o0o000oo2;
        this.f57827OooO0O0 = file;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final long contentLength() {
        return this.f57827OooO0O0.length();
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    @Nullable
    public final o0O000Oo contentType() {
        return this.f57826OooO00o;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final void writeTo(@NotNull o0O0o00O sink) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o0OO0O0 o0oo0o0OooO0oO = o0OO.OooO0oO(this.f57827OooO0O0);
        try {
            sink.o00Oo0(o0oo0o0OooO0oO);
            CloseableKt.closeFinally(o0oo0o0OooO0oO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0oo0o0OooO0oO, th);
                throw th2;
            }
        }
    }
}
