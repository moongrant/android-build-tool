package p437o0OoOOo0;

import com.android.billingclient.api.OooOOOO;
import com.android.billingclient.api.OooOo00;
import com.code.android.util.o0000;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f47084OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<o00O0000<Boolean>> f47085OooO0O0;

    public o000O0(o000O00O o000o00o2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f47084OooO00o = o000o00o2;
        this.f47085OooO0O0 = cancellableContinuationImpl;
    }

    @Override // com.android.billingclient.api.OooOOOO
    public final void onBillingServiceDisconnected() {
        o000O00O o000o00o2 = this.f47084OooO00o;
        o000o00o2.f47089OooO0OO = false;
        CancellableContinuation<o00O0000<Boolean>> cancellableContinuation = this.f47085OooO0O0;
        if (cancellableContinuation.isActive()) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(new o00O0000(Boolean.valueOf(o000o00o2.f47089OooO0OO), new o000OOo0(-102, o0000.OooO0OO(o000000.Pay_Connect_Failed)))));
        }
    }

    @Override // com.android.billingclient.api.OooOOOO
    public final void onBillingSetupFinished(@NotNull OooOo00 billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        boolean z = billingResult.f12746OooO00o == 0;
        o000O00O o000o00o2 = this.f47084OooO00o;
        o000o00o2.f47089OooO0OO = z;
        CancellableContinuation<o00O0000<Boolean>> cancellableContinuation = this.f47085OooO0O0;
        if (cancellableContinuation.isActive()) {
            boolean z2 = o000o00o2.f47089OooO0OO;
            if (z2) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4215constructorimpl(new o00O0000(Boolean.valueOf(z2), null)));
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i = billingResult.f12746OooO00o;
            String str = billingResult.f12747OooO0O0;
            Intrinsics.checkNotNullExpressionValue(str, "getDebugMessage(...)");
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(new o00O0000(boolValueOf, new o000OOo0(i, str))));
        }
    }
}
