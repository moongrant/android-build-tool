package p542o0o0o00O;

import com.common.support.crypto.AESKt;
import com.yalla.yalla.model.ImResult;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<ImResult> f55780OooO00o;

    public Oooo0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f55780OooO00o = cancellableContinuationImpl;
    }

    @Override // p542o0o0o00O.o00Oo0
    public final void OooO00o() {
        Result.Companion companion = Result.INSTANCE;
        this.f55780OooO00o.resumeWith(Result.m4213constructorimpl(new ImResult(null, -2, 1, null)));
    }

    @Override // p542o0o0o00O.o00Oo0
    public final void OooO0O0(int i, @Nullable o0oOOo o0oooo) {
        o0O0o o0o0o;
        byte[] bArrAesDecrypt$default = (o0oooo == null || (o0o0o = o0oooo.f57347OooOO0) == null) ? null : AESKt.aesDecrypt$default(o0o0o.OooO00o(), (byte[]) o00Oo0.OooO0o().f45213OooO0O0.getValue(), (byte[]) o00Oo0.OooO0o().f45214OooO0OO.getValue(), (String) null, 4, (Object) null);
        Result.Companion companion = Result.INSTANCE;
        this.f55780OooO00o.resumeWith(Result.m4213constructorimpl(new ImResult(bArrAesDecrypt$default, i)));
    }

    @Override // p542o0o0o00O.o00Oo0
    public final void OooO0OO(@Nullable o0oOOo o0oooo) {
        o0O0o o0o0o = o0oooo.f57347OooOO0;
        byte[] bArrAesDecrypt$default = o0o0o != null ? AESKt.aesDecrypt$default(o0o0o.OooO00o(), (byte[]) o00Oo0.OooO0o().f45213OooO0O0.getValue(), (byte[]) o00Oo0.OooO0o().f45214OooO0OO.getValue(), (String) null, 4, (Object) null) : null;
        Result.Companion companion = Result.INSTANCE;
        this.f55780OooO00o.resumeWith(Result.m4213constructorimpl(new ImResult(bArrAesDecrypt$default, 0, 2, null)));
    }
}
