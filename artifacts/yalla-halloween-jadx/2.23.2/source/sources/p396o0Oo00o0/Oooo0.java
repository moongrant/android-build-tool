package p396o0Oo00o0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import p191o00o0O0.o00Oo0;
import p417o0Oo0oo0.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0 extends o00Oo0 {
    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0OO() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        try {
            Result.Companion companion = Result.INSTANCE;
            o000OOo.OooO00o();
            Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
    }
}
