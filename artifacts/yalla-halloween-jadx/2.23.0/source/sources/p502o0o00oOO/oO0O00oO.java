package p502o0o00oOO;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.b1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O00oO extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final b1 f49575OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        b1 b1VarOooO00o = b1.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(b1VarOooO00o, "bind(view)");
        this.f49575OooO0OO = b1VarOooO00o;
    }
}
