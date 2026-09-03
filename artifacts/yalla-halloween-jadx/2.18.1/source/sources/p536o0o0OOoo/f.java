package p536o0o0OOoo;

import android.view.View;
import com.app.base.mixedroom.model.RoomPKResultModel;
import com.app.base.model.RoomModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0o.oo0oOO0;
import p530o0o0OOO.o00OO00O;
import p558o0oOOoo.o0O0o;
import p579o0oOoOOo.q1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43778Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f43779Oooo0oO;

    public /* synthetic */ f(Object obj, int i) {
        this.f43778Oooo0o = i;
        this.f43779Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43778Oooo0o) {
            case 0:
                FriendRequestMessageActivity this$0 = (FriendRequestMessageActivity) this.f43779Oooo0oO;
                FriendRequestMessageActivity.OooO00o oooO00o = FriendRequestMessageActivity.f22157OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOo0(R.string.message_clear_friend_request);
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOo0o(new k(this$0));
                oo0ooo0.OooOOO0();
                break;
            case 1:
                o0O0o this$1 = (o0O0o) this.f43779Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o00OO00O.OooO00o oooO00o2 = o00OO00O.f43313OooooOo;
                RoomPKResultModel value = oooO00o2.OooO00o().f43364OoooOo0.getValue();
                if (value != null) {
                    long room_b_barid = value.getRoom_b_barid();
                    Long value2 = oooO00o2.OooO00o().f43319OooO0Oo.getValue();
                    if (value2 == null || room_b_barid != value2.longValue()) {
                        RoomModel roomModel = new RoomModel();
                        roomModel.setId(value.getRoom_b_barid());
                        roomModel.setName(value.getRoom_b_name());
                        this$1.f44365OooO00o.OooOooO(roomModel);
                        break;
                    }
                }
                break;
            default:
                q1 this$2 = (q1) this.f43779Oooo0oO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (this$2.f46253OooO0oo) {
                    this$2.OooO0Oo();
                }
                break;
        }
    }
}
