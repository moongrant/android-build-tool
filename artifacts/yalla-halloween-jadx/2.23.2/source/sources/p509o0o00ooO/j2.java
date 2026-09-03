package p509o0o00ooO;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class j2 extends q1 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TextView f50707OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinearLayout f50708OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextView f50709OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ImageView f50710OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Boolean, Unit> f50711OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tv_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50707OooO0OO = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.ll_room_notification);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50708OooO0Oo = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.room_notification);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50710OooO0o0 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.tv_announcement);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50709OooO0o = (TextView) viewFindViewById4;
    }
}
