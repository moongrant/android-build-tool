package p538o0o0OOoo;

import android.view.View;
import com.app.base.mixedroom.model.RoomPKResultModel;
import com.app.base.model.RoomModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import p256o00ooO0o.oo0oOO0;
import p532o0o0OOO.o00OO0O0;
import p560o0oOOoo.o0oOOo;
import p581o0oOoOOo.p1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43789Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43790OoooO00;

    public /* synthetic */ e(Object obj, int i) {
        this.f43789Oooo = i;
        this.f43790OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43789Oooo) {
            case 0:
                FriendRequestMessageActivity this$0 = (FriendRequestMessageActivity) this.f43790OoooO00;
                FriendRequestMessageActivity.OooO00o oooO00o = FriendRequestMessageActivity.f22176Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOo0(R.string.message_clear_friend_request);
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOo0o(new j(this$0));
                oo0ooo0.OooOOO0();
                break;
            case 1:
                o0oOOo this$1 = (o0oOOo) this.f43790OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o00OO0O0.OooO00o oooO00o2 = o00OO0O0.f43338OooooOo;
                RoomPKResultModel value = oooO00o2.OooO00o().f43389OoooOo0.getValue();
                if (value != null) {
                    long room_b_barid = value.getRoom_b_barid();
                    Long value2 = oooO00o2.OooO00o().f43344OooO0Oo.getValue();
                    if (value2 == null || room_b_barid != value2.longValue()) {
                        RoomModel roomModel = new RoomModel();
                        roomModel.setId(value.getRoom_b_barid());
                        roomModel.setName(value.getRoom_b_name());
                        this$1.f44372OooO00o.OooOooO(roomModel);
                        break;
                    }
                }
                break;
            default:
                p1 this$2 = (p1) this.f43790OoooO00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (this$2.f46266OooO0oo) {
                    this$2.OooO0Oo();
                }
                break;
        }
    }
}
