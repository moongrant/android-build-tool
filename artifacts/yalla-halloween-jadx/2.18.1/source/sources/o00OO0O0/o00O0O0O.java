package o00OO0O0;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O0O extends OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final NetImageView f31517OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TextView f31518OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f31519OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextView f31520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f31521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f31522OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final TextView f31523OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f31524OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tvRoomNameA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvRoomNameA)");
        this.f31518OooO0OO = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tvRoomNameB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tvRoomNameB)");
        this.f31519OooO0Oo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.nivGiftA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.nivGiftA)");
        this.f31521OooO0o0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.nivGiftB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.nivGiftB)");
        this.f31520OooO0o = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tvGiftNumA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tvGiftNumA)");
        this.f31522OooO0oO = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tvGiftNumB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.tvGiftNumB)");
        this.f31523OooO0oo = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tvRoomWinA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.tvRoomWinA)");
        this.f31517OooO = (NetImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tvRoomWinB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.tvRoomWinB)");
        this.f31524OooOO0 = (NetImageView) viewFindViewById8;
    }
}
