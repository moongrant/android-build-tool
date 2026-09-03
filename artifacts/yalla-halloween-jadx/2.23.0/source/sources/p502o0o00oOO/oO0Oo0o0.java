package p502o0o00oOO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo0o0 extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TextView f49603OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f49604OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0o0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tvRoomNameA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvRoomNameA)");
        this.f49603OooO0OO = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.tvRoomNameB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tvRoomNameB)");
        this.f49604OooO0Oo = (TextView) viewFindViewById2;
    }
}
