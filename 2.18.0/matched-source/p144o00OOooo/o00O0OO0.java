package p144o00OOooo;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.app.base.model.InOutRoomModel;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.facebook.login.LoginManager;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o000O0O0;
import p436o0OoOO0o.o0O0O0o0;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OO0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32026OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32027OooO0O0;

    public /* synthetic */ o00O0OO0(Object obj, int i) {
        this.f32026OooO00o = i;
        this.f32027OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [o0OoOO0o.o0O000Oo, o0OoOO0o.o0O00o00<o0OoOO0o.o0O0OO0>] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        RoomUserInfoModel user;
        int i = 0;
        switch (this.f32026OooO00o) {
            case 0:
                RoomInfoMemberListFragment.m51initObserve$lambda15((RoomInfoMemberListFragment) this.f32027OooO0O0, obj);
                break;
            case 1:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f32027OooO0O0;
                Integer num = (Integer) obj;
                int i2 = RoomMoraGameListDialog.f12175Ooooo00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView textView = this$0.f12177OoooOOO;
                StringBuilder sb = new StringBuilder();
                sb.append(o000O0O0.OooO0OO(R.string.mora));
                sb.append(": ");
                sb.append(num != null ? num.intValue() : 0);
                textView.setText(sb.toString());
                break;
            case 2:
                va bindingDrawer = (va) this.f32027OooO0O0;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                bindingDrawer.f50812OooO0o.f50893OooOo0O.setText("Lv." + ((Integer) obj));
                break;
            case 3:
                UntieAccountBindActivity this$1 = (UntieAccountBindActivity) this.f32027OooO0O0;
                int i3 = UntieAccountBindActivity.f21906Oooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO();
                if (((Response) obj).getIsSuccess()) {
                    int i4 = this$1.f21910Oooooo0;
                    if (i4 == 4) {
                        LoginManager.INSTANCE.getInstance().logOut();
                    } else if (i4 == 9) {
                        o0O0O0o0.OooO0OO().f39969OooO00o.OooO00o();
                    }
                    this$1.setResult(-1);
                    this$1.finish();
                }
                break;
            case 4:
                RoomMemberConveneListDialog this$2 = (RoomMemberConveneListDialog) this.f32027OooO0O0;
                InOutRoomModel inOutRoomModel = (InOutRoomModel) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (this$2.f24188Oooooo && (user = inOutRoomModel.getUser()) != null) {
                    if (inOutRoomModel.getKind() == 0) {
                        user.setInRoom(1L);
                        this$2.f24187OooooOo.put(Long.valueOf(user.getUserId()), user);
                    } else {
                        user.setInRoom(0L);
                        this$2.f24187OooooOo.remove(Long.valueOf(user.getUserId()));
                    }
                    this$2.OooOo00(0);
                    for (Object obj2 : this$2.f24185OooooO0) {
                        int i5 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj2;
                        if (roomUserInfoModel.getUserId() == user.getUserId()) {
                            roomUserInfoModel.setInRoom(user.getInRoom());
                        }
                        this$2.OooOOO0().notifyItemChanged(i);
                        i = i5;
                    }
                    break;
                }
                break;
            default:
                MainRoomMineFollowingFragment.m456followAllRoom$lambda6((MainRoomMineFollowingFragment) this.f32027OooO0O0, (Response) obj);
                break;
        }
    }
}
