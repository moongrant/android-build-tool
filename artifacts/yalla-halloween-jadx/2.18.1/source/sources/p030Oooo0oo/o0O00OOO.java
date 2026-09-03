package p030Oooo0oo;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOO0O;
import o0O0O00.Oooo0;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00OOO implements o0O00oO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final View f2510Oooo0o;

    public o0O00OOO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f2510Oooo0o = view;
    }

    @Override // p030Oooo0oo.o0O00oO0
    @Nullable
    public final Object OooO00o(@NotNull OooOO0O oooOO0O, @NotNull Oooo000 oooo000, @NotNull Continuation<? super Unit> continuation) {
        OooOO0O oooOO0OOooO0Oo = oooOO0O.OooO0Oo(Oooo0.OooO0o0(oooo000));
        this.f2510Oooo0o.requestRectangleOnScreen(new Rect((int) oooOO0OOooO0Oo.f30404OooO00o, (int) oooOO0OOooO0Oo.f30405OooO0O0, (int) oooOO0OOooO0Oo.f30406OooO0OO, (int) oooOO0OOooO0Oo.f30407OooO0Oo), false);
        return Unit.INSTANCE;
    }
}
