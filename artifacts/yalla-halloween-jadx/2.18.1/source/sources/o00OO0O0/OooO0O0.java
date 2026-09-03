package o00OO0O0;

import android.content.Context;
import android.view.View;
import com.app.base.view.GifFaceView;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.view.MainRoomPopularTopView;
import com.yalla.yalla.ui.view.ThemeLayout;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31379Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f31380Oooo0oO;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f31379Oooo0o = i;
        this.f31380Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31379Oooo0o) {
            case 0:
                OooOO0O this$0 = (OooOO0O) this.f31380Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.f31385OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                GifFaceView.OooO0O0 this$1 = (GifFaceView.OooO0O0) this.f31380Oooo0oO;
                int i = GifFaceView.OooO0O0.f12039OooO0OO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.dismiss();
                break;
            case 2:
                RoomBlackListUnJoinAndUnFollowDialog this$2 = (RoomBlackListUnJoinAndUnFollowDialog) this.f31380Oooo0oO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO0O0();
                break;
            case 3:
                BadgeFragment.m312showPopupWindow$lambda7((BadgeFragment) this.f31380Oooo0oO, view);
                break;
            case 4:
                MainRoomPopularTopView this$3 = (MainRoomPopularTopView) this.f31380Oooo0oO;
                int i2 = MainRoomPopularTopView.f24841OoooOo0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                TopActivity.OooO00o oooO00o = TopActivity.f22092ooOO;
                Context context = this$3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Objects.requireNonNull(TopVM.INSTANCE);
                oooO00o.OooO00o(context, TopVM.TYPE_YALLA_BILLION);
                break;
            default:
                Function0 function1 = (Function0) this.f31380Oooo0oO;
                int i3 = ThemeLayout.f25215Oooo0oO;
                if (function1 != null) {
                    function1.invoke();
                }
                break;
        }
    }
}
