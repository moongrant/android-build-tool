package p660o0ooo0o0;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0 extends o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ File f51422OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f51423OooO0O0;

    public o00OOO0(File file, o00OO0O0 o00oo0o1) {
        this.f51422OooO00o = file;
        this.f51423OooO0O0 = o00oo0o1;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final long contentLength() {
        return this.f51422OooO00o.length();
    }

    @Override // p660o0ooo0o0.o0o0Oo
    @Nullable
    public final o00OO0O0 contentType() {
        return this.f51423OooO0O0;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final void writeTo(@NotNull oo00oO sink) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o0O0O0O o0o0o0oOooO0oo = o0O000Oo.OooO0oo(this.f51422OooO00o);
        try {
            sink.o0ooOOo(o0o0o0oOooO0oo);
            CloseableKt.closeFinally(o0o0o0oOooO0oo, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0o0o0oOooO0oo, th);
                throw th2;
            }
        }
    }
}
