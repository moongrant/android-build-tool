package p502o0o00o0;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.view.MainRoomPopularTopView;
import com.yalla.yalla.ui.view.ThemeLayout;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41537Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41538Oooo0oO;

    public /* synthetic */ o000(Object obj, int i) {
        this.f41537Oooo0o = i;
        this.f41538Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41537Oooo0o) {
            case 0:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f41538Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
            case 1:
                MainRoomPopularTopView this$1 = (MainRoomPopularTopView) this.f41538Oooo0oO;
                int i = MainRoomPopularTopView.f24841OoooOo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopActivity.OooO00o oooO00o = TopActivity.f22092ooOO;
                Context context = this$1.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Objects.requireNonNull(TopVM.INSTANCE);
                oooO00o.OooO00o(context, TopVM.TYPE_GIFT_RECEIVE);
                break;
            default:
                Function0 function0 = (Function0) this.f41538Oooo0oO;
                int i2 = ThemeLayout.f25215Oooo0oO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
