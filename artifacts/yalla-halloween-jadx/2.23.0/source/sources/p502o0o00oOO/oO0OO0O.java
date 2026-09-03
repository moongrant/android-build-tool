package p502o0o00oOO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0OO0O extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final NetImageView f49586OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TextView f49587OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f49588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextView f49589OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f49590OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f49591OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final TextView f49592OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f49593OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO0O(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tvRoomNameA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvRoomNameA)");
        this.f49587OooO0OO = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.tvRoomNameB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tvRoomNameB)");
        this.f49588OooO0Oo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.nivGiftA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.nivGiftA)");
        this.f49590OooO0o0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.nivGiftB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.nivGiftB)");
        this.f49589OooO0o = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(oO00O0oO.tvGiftNumA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tvGiftNumA)");
        this.f49591OooO0oO = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(oO00O0oO.tvGiftNumB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.tvGiftNumB)");
        this.f49592OooO0oo = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(oO00O0oO.tvRoomWinA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.tvRoomWinA)");
        this.f49586OooO = (NetImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(oO00O0oO.tvRoomWinB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.tvRoomWinB)");
        this.f49593OooOO0 = (NetImageView) viewFindViewById8;
    }
}
