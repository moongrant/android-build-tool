package p402o0Oo0OOO;

import java.io.File;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import oo0o0O0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo<D> implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<String> f44519OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f44520OooO0o0;

    public o00oOoo(CancellableContinuationImpl cancellableContinuationImpl, String str) {
        this.f44519OooO0Oo = cancellableContinuationImpl;
        this.f44520OooO0o0 = str;
    }

    @Override // oo0o0O0.OooO0OO
    public final void result(boolean z, Object obj) {
        CancellableContinuation<String> cancellableContinuation = this.f44519OooO0Oo;
        if (!z) {
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(null));
        } else {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(new File(o00O000.f44470OooO00o, this.f44520OooO0o0).getAbsolutePath()));
        }
    }
}
