package p502o0o00o0;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.view.MainRoomPopularTopView;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p142o00OOooO.o0000OO0;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41586Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41587Oooo0oO;

    public /* synthetic */ o000O0o(Object obj, int i) {
        this.f41586Oooo0o = i;
        this.f41587Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41586Oooo0o) {
            case 0:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f41587Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Room_Canceljoining");
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value != null) {
                    this$0.OooOO0o().unJoinRoom(String.valueOf(value.longValue())).observe(this$0.f20878OoooO, new o0000OO0(this$0, 2));
                }
                Objects.requireNonNull(this$0);
                break;
            default:
                MainRoomPopularTopView this$1 = (MainRoomPopularTopView) this.f41587Oooo0oO;
                int i = MainRoomPopularTopView.f24841OoooOo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopActivity.OooO00o oooO00o = TopActivity.f22092ooOO;
                Context context = this$1.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Objects.requireNonNull(TopVM.INSTANCE);
                oooO00o.OooO00o(context, TopVM.TYPE_ROOM_GIFT);
                break;
        }
    }
}
