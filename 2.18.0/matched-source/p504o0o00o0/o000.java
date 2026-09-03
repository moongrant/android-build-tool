package p504o0o00o0;

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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41556Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f41557OoooO00;

    public /* synthetic */ o000(Object obj, int i) {
        this.f41556Oooo = i;
        this.f41557OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41556Oooo) {
            case 0:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f41557OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
            case 1:
                MainRoomPopularTopView this$1 = (MainRoomPopularTopView) this.f41557OoooO00;
                int i = MainRoomPopularTopView.f24860Ooooo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopActivity.OooO00o oooO00o = TopActivity.f22111o00Ooo;
                Context context = this$1.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Objects.requireNonNull(TopVM.INSTANCE);
                oooO00o.OooO00o(context, TopVM.TYPE_GIFT_RECEIVE);
                break;
            default:
                Function0 function0 = (Function0) this.f41557OoooO00;
                int i2 = ThemeLayout.f25234OoooO00;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
