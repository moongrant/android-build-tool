package p634o0ooO0oO;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000Oo0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00Oo00 extends oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f57324OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ File f57325OooO0O0;

    public o00Oo00(File file, o00OOO0 o00ooo1) {
        this.f57324OooO00o = o00ooo1;
        this.f57325OooO0O0 = file;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final long contentLength() {
        return this.f57325OooO0O0.length();
    }

    @Override // p634o0ooO0oO.oo00oO
    @Nullable
    public final o00OOO0 contentType() {
        return this.f57324OooO00o;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final void writeTo(@NotNull o0000Ooo sink) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o000Oo0 o000oo0OooO0oO = o000O0Oo.OooO0oO(this.f57325OooO0O0);
        try {
            sink.Oooo000(o000oo0OooO0oO);
            CloseableKt.closeFinally(o000oo0OooO0oO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o000oo0OooO0oO, th);
                throw th2;
            }
        }
    }
}
