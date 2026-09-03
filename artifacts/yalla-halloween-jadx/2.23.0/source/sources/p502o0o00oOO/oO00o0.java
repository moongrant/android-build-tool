package p502o0o00oOO;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.x0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00o0 extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final x0 f49556OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        x0 x0VarOooO00o = x0.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(x0VarOooO00o, "bind(view)");
        this.f49556OooO0OO = x0VarOooO00o;
    }
}
