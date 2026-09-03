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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31397Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31398OoooO00;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f31397Oooo = i;
        this.f31398OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31397Oooo) {
            case 0:
                OooOO0O this$0 = (OooOO0O) this.f31398OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.f31403OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                GifFaceView.OooO0O0 this$1 = (GifFaceView.OooO0O0) this.f31398OoooO00;
                int i = GifFaceView.OooO0O0.f12054OooO0OO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.dismiss();
                break;
            case 2:
                RoomBlackListUnJoinAndUnFollowDialog this$2 = (RoomBlackListUnJoinAndUnFollowDialog) this.f31398OoooO00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO0O0();
                break;
            case 3:
                BadgeFragment.m312showPopupWindow$lambda7((BadgeFragment) this.f31398OoooO00, view);
                break;
            case 4:
                MainRoomPopularTopView this$3 = (MainRoomPopularTopView) this.f31398OoooO00;
                int i2 = MainRoomPopularTopView.f24860Ooooo00;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                TopActivity.OooO00o oooO00o = TopActivity.f22111o00Ooo;
                Context context = this$3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Objects.requireNonNull(TopVM.INSTANCE);
                oooO00o.OooO00o(context, TopVM.TYPE_YALLA_BILLION);
                break;
            default:
                Function0 function1 = (Function0) this.f31398OoooO00;
                int i3 = ThemeLayout.f25234OoooO00;
                if (function1 != null) {
                    function1.invoke();
                }
                break;
        }
    }
}
