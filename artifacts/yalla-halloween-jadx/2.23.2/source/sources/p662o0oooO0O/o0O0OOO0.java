package p662o0oooO0O;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0OOO0 implements oO00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0o0 f59759OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO00000 f59760OooO0o0;

    public o0O0OOO0(o oVar, o0OO0O0 o0oo0o1) {
        this.f59759OooO0Oo = oVar;
        this.f59760OooO0o0 = o0oo0o1;
    }

    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        oO00000 oo00000 = this.f59760OooO0o0;
        o0O0O0o0 o0o0o0o0 = this.f59759OooO0Oo;
        o0o0o0o0.OooO();
        try {
            try {
                long jOooOO0O = oo00000.OooOO0O(sink, j);
                if (o0o0o0o0.OooOO0()) {
                    throw o0o0o0o0.OooOO0O(null);
                }
                return jOooOO0O;
            } catch (IOException e) {
                if (o0o0o0o0.OooOO0()) {
                    throw o0o0o0o0.OooOO0O(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            o0o0o0o0.OooOO0();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        oO00000 oo00000 = this.f59760OooO0o0;
        o0O0O0o0 o0o0o0o0 = this.f59759OooO0Oo;
        o0o0o0o0.OooO();
        try {
            try {
                oo00000.close();
                Unit unit = Unit.INSTANCE;
                if (o0o0o0o0.OooOO0()) {
                    throw o0o0o0o0.OooOO0O(null);
                }
            } catch (IOException e) {
                if (!o0o0o0o0.OooOO0()) {
                    throw e;
                }
                throw o0o0o0o0.OooOO0O(e);
            }
        } catch (Throwable th) {
            o0o0o0o0.OooOO0();
            throw th;
        }
    }

    @Override // p662o0oooO0O.oO00000
    public final oO00000o timeout() {
        return this.f59759OooO0Oo;
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.source(" + this.f59760OooO0o0 + ')';
    }
}
