package p388o0OOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import p145o00Oo0O.o000oOoO;
import p411o0Oo0oO0.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000000 extends o000oOoO {
    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0OO() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        try {
            Result.Companion companion = Result.INSTANCE;
            o000000O.OooO00o();
            Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
    }
}
