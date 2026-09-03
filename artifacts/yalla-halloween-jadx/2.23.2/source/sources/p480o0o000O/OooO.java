package p480o0o000O;

import com.common.support.crypto.AESKt;
import com.yalla.yalla.model.ImResult;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.Nullable;
import p415o0Oo0oO0.o00Ooo;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<ImResult> f48388OooO00o;

    public OooO(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f48388OooO00o = cancellableContinuationImpl;
    }

    @Override // p480o0o000O.OooOOO
    public final void OooO00o() {
        Result.Companion companion = Result.INSTANCE;
        this.f48388OooO00o.resumeWith(Result.m4215constructorimpl(new ImResult(null, -2, 1, null)));
    }

    @Override // p480o0o000O.OooOOO
    public final void OooO0O0(int i, @Nullable o0O00o00 o0o00o01) {
        o0O00oO0 o0o00oo1;
        byte[] bArrAesDecrypt$default = (o0o00o01 == null || (o0o00oo1 = o0o00o01.f57852OooOO0) == null) ? null : AESKt.aesDecrypt$default(o0o00oo1.OooO00o(), (byte[]) o00Ooo.OooO0o().f46392OooO0O0.getValue(), (byte[]) o00Ooo.OooO0o().f46393OooO0OO.getValue(), (String) null, 4, (Object) null);
        Result.Companion companion = Result.INSTANCE;
        this.f48388OooO00o.resumeWith(Result.m4215constructorimpl(new ImResult(bArrAesDecrypt$default, i)));
    }

    @Override // p480o0o000O.OooOOO
    public final void OooO0OO(@Nullable o0O00o00 o0o00o01) {
        o0O00oO0 o0o00oo1 = o0o00o01.f57852OooOO0;
        byte[] bArrAesDecrypt$default = o0o00oo1 != null ? AESKt.aesDecrypt$default(o0o00oo1.OooO00o(), (byte[]) o00Ooo.OooO0o().f46392OooO0O0.getValue(), (byte[]) o00Ooo.OooO0o().f46393OooO0OO.getValue(), (String) null, 4, (Object) null) : null;
        Result.Companion companion = Result.INSTANCE;
        this.f48388OooO00o.resumeWith(Result.m4215constructorimpl(new ImResult(bArrAesDecrypt$default, 0, 2, null)));
    }
}
