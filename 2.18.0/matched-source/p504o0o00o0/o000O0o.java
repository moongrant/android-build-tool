package p504o0o00o0;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.view.MainRoomPopularTopView;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p143o00OOooO.o0000OO0;
import p393o0OOooOo.o0O00000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41605Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f41606OoooO00;

    public /* synthetic */ o000O0o(Object obj, int i) {
        this.f41605Oooo = i;
        this.f41606OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41605Oooo) {
            case 0:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f41606OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Room_Canceljoining");
                Long value = o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue();
                if (value != null) {
                    this$0.OooOO0o().unJoinRoom(String.valueOf(value.longValue())).observe(this$0.f20898OoooOOO, new o0000OO0(this$0, 2));
                }
                Objects.requireNonNull(this$0);
                break;
            default:
                MainRoomPopularTopView this$1 = (MainRoomPopularTopView) this.f41606OoooO00;
                int i = MainRoomPopularTopView.f24860Ooooo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopActivity.OooO00o oooO00o = TopActivity.f22111o00Ooo;
                Context context = this$1.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Objects.requireNonNull(TopVM.INSTANCE);
                oooO00o.OooO00o(context, TopVM.TYPE_ROOM_GIFT);
                break;
        }
    }
}
