package p502o0o00oOO;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.a1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O00o0 extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final a1 f49574OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00o0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        a1 a1VarOooO00o = a1.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(a1VarOooO00o, "bind(view)");
        this.f49574OooO0OO = a1VarOooO00o;
    }
}
