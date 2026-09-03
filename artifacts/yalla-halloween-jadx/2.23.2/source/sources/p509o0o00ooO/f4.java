package p509o0o00ooO;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class f4 extends q1 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final NetImageView f50674OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TextView f50675OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f50676OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextView f50677OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f50678OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f50679OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final TextView f50680OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f50681OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tvRoomNameA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50675OooO0OO = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.tvRoomNameB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50676OooO0Oo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.nivGiftA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50678OooO0o0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.nivGiftB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50677OooO0o = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(o0OO00O.tvGiftNumA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f50679OooO0oO = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(o0OO00O.tvGiftNumB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f50680OooO0oo = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(o0OO00O.tvRoomWinA);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f50674OooO = (NetImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(o0OO00O.tvRoomWinB);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f50681OooOO0 = (NetImageView) viewFindViewById8;
    }
}
