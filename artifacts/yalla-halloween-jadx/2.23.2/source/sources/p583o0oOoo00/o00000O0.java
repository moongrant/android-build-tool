package p583o0oOoo00;

import java.io.File;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p675oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0<D> implements o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<String> f56656OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f56657OooO0O0;

    public o00000O0(CancellableContinuationImpl cancellableContinuationImpl, String str) {
        this.f56656OooO00o = cancellableContinuationImpl;
        this.f56657OooO0O0 = str;
    }

    @Override // p675oOooo0o.o0000O00
    public final void result(boolean z, Object obj) {
        CancellableContinuation<String> cancellableContinuation = this.f56656OooO00o;
        if (!z) {
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(null));
        } else {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(new File(o00000O.f56650OooO00o, this.f56657OooO0O0).getAbsolutePath()));
        }
    }
}
