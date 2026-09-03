package p502o0o00oOO;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.e1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO00000 extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final e1 f49642OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00000(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        e1 e1VarOooO00o = e1.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(e1VarOooO00o, "bind(view)");
        this.f49642OooO0OO = e1VarOooO00o;
    }
}
