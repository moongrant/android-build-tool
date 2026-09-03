package p431o0OoOOOO;

import com.android.billingclient.api.OooOOOO;
import com.android.billingclient.api.OooOo00;
import com.code.android.util.o0000;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O f45875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<o00OOO0O<Boolean>> f45876OooO0O0;

    public o00OO000(o00O o00o2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f45875OooO00o = o00o2;
        this.f45876OooO0O0 = cancellableContinuationImpl;
    }

    @Override // com.android.billingclient.api.OooOOOO
    public final void onBillingServiceDisconnected() {
        o00O o00o2 = this.f45875OooO00o;
        o00o2.f45830OooO0OO = false;
        CancellableContinuation<o00OOO0O<Boolean>> cancellableContinuation = this.f45876OooO0O0;
        if (cancellableContinuation.isActive()) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(Boolean.valueOf(o00o2.f45830OooO0OO), new o00OOO00(-102, o0000.OooO0OO(oO00OOo0.Pay_Connect_Failed)))));
        }
    }

    @Override // com.android.billingclient.api.OooOOOO
    public final void onBillingSetupFinished(@NotNull OooOo00 billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        boolean z = billingResult.f9655OooO00o == 0;
        o00O o00o2 = this.f45875OooO00o;
        o00o2.f45830OooO0OO = z;
        CancellableContinuation<o00OOO0O<Boolean>> cancellableContinuation = this.f45876OooO0O0;
        if (cancellableContinuation.isActive()) {
            boolean z2 = o00o2.f45830OooO0OO;
            if (z2) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(Boolean.valueOf(z2), null)));
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i = billingResult.f9655OooO00o;
            String str = billingResult.f9656OooO0O0;
            Intrinsics.checkNotNullExpressionValue(str, "billingResult.debugMessage");
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(boolValueOf, new o00OOO00(i, str))));
        }
    }
}
