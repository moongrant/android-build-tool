package o00OO0O0;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.g7;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final g7 f31458OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f31459OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f31460OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        g7 g7VarOooO00o = g7.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(g7VarOooO00o, "bind(view)");
        this.f31458OooO0OO = g7VarOooO00o;
    }
}
