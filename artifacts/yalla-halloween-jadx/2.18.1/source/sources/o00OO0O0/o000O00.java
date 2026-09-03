package o00OO0O0;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p649o0ooOOoo.i7;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000O00 extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final i7 f31465OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        i7 i7VarOooO00o = i7.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(i7VarOooO00o, "bind(view)");
        this.f31465OooO0OO = i7VarOooO00o;
    }
}
