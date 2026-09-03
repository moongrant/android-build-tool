package p502o0o00oOO;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO00O0 extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final RecyclerView f49645OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ImageView f49646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f49647OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ImageView f49648OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.rvTreasureBox);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.rvTreasureBox)");
        this.f49645OooO0OO = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.ivTreasureBox);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.ivTreasureBox)");
        this.f49646OooO0Oo = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.ivTreasureBoxMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.ivTreasureBoxMore)");
        this.f49648OooO0o0 = (ImageView) viewFindViewById3;
    }
}
