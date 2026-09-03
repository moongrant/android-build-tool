package p502o0o00oOO;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.v0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00O0o extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final v0 f49537OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        v0 v0VarOooO00o = v0.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(v0VarOooO00o, "bind(view)");
        this.f49537OooO0OO = v0VarOooO00o;
    }
}
