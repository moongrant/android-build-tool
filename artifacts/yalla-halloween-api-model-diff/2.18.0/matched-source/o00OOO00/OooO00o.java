package o00OOO00;

import android.os.Looper;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.app.base.base.activity.BaseFragmentActivity;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.app.base.protobuf.room.Room;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p255o00ooO0O.oOO00O;
import p393o0OOooOo.o0O00000;
import p500o0o00Oo0.OooOOO;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31686OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31687OooO0O0;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f31686OooO00o = i;
        this.f31687OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f31686OooO00o) {
            case 0:
                BaseFragmentActivity this$0 = (BaseFragmentActivity) this.f31687OooO0O0;
                int i = BaseFragmentActivity.f11475OoooOoo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.f11478OoooO0O) {
                    this$0.f11484o000oOoO = true;
                } else {
                    this$0.OooOOo0();
                }
                break;
            case 1:
                RoomInfoMemberListFragment.m54initObserve$lambda18((RoomInfoMemberListFragment) this.f31687OooO0O0, (Long) obj);
                break;
            case 2:
                RoomMoraGameListDialog this$1 = (RoomMoraGameListDialog) this.f31687OooO0O0;
                List list = (List) obj;
                int i2 = RoomMoraGameListDialog.f12175Ooooo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (list != null && (!list.isEmpty())) {
                    this$1.f12178OoooOOo.notifyDataSetChanged();
                    break;
                }
                break;
            case 3:
                va bindingDrawer = (va) this.f31687OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!it.booleanValue()) {
                    LinearLayout linearLayout = bindingDrawer.f50812OooO0o.f50879OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "bindingDrawer.list.llUnprotected");
                    oOO00O.OooO(linearLayout);
                } else {
                    LinearLayout linearLayout2 = bindingDrawer.f50812OooO0o.f50879OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "bindingDrawer.list.llUnprotected");
                    oOO00O.OooO00o(linearLayout2);
                }
                break;
            default:
                VoteGameCreateActivity this$2 = (VoteGameCreateActivity) this.f31687OooO0O0;
                VoteGameCreateActivity.OooO00o oooO00o = VoteGameCreateActivity.f23092OoooooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.InitiateVoteReply");
                long createUserId = ((Room.InitiateVoteReply) obj).getCreateUserId();
                Long value = OooOOO.f41235OooO00o.OooOo().getValue();
                if (value != null && createUserId == value.longValue()) {
                    o0O00000.OooO0OO("InRoom_poll_create_success");
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Success);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$2.finish();
                }
                break;
        }
    }
}
