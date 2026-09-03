package p117o00O0OOo;

import coil.annotation.ExperimentalCoilApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o00O0OO0.OooO;
import o00O0OO0.OooOOO0;
import o00O0OO0.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalCoilApi
public final class OooO0o implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0o f30606OooO00o = new OooO0o();

    @Override // p117o00O0OOo.OooO
    @Nullable
    public final Object OooO00o(@NotNull OooOO0 oooOO1, @NotNull OooOOO0 oooOOO0, @NotNull Continuation<? super Unit> continuation) {
        if (oooOOO0 instanceof OooOo00) {
            oooOO1.OooO00o(((OooOo00) oooOOO0).f30592OooO00o);
        } else if (oooOOO0 instanceof OooO) {
            oooOOO0.OooO00o();
            oooOO1.onError();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final String toString() {
        return "coil.transition.NoneTransition";
    }
}
