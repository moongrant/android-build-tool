package p483o0o000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import p252o00ooO0.o000000O;
import p519o0o0O0O.o000000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends o000000O {
    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        try {
            Result.Companion companion = Result.INSTANCE;
            o000000.OooO00o();
            Result.m502constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // p252o00ooO0.o000000O
    public final boolean OooO0Oo() {
        return true;
    }
}
