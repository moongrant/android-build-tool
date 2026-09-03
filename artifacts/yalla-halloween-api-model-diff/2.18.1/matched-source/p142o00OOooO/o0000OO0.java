package p142o00OOooO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00OOO.OooO00o;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p579o0oOoOOo.m;
import p579o0oOoOOo.p;
import p601o0oo00Oo.o00O0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000OO0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31932OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31933OooO0O0;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f31932OooO00o = i;
        this.f31933OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f31932OooO00o) {
            case 0:
                MomentListFeaturedFragment.m36initObserver$lambda2((MomentListFeaturedFragment) this.f31933OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f31933OooO0O0;
                int i = MixedRoomActivity.f11764o00000oO;
                Objects.requireNonNull(mixedRoomActivity);
                p.OooO00o(false, true, new Function1() { // from class: o00OoOO.o00O0O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        mixedRoomActivity.f11782o00000Oo = (m) obj2;
                        return null;
                    }
                });
                break;
            case 2:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f31933OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((ApiResult) obj).isSuccess()) {
                    LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.member_getOut);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$0.OooO0O0();
                }
                break;
            case 3:
                TopicSearchActivity this$1 = (TopicSearchActivity) this.f31933OooO0O0;
                Response response = (Response) obj;
                TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!this$1.f22659OooooOO) {
                    if (response.getIsSuccess()) {
                        this$1.OooOoo().setNewData((List) response.getData());
                        if (this$1.OooOooo().f50360OooO00o.getParent() != null) {
                            this$1.OooOoo().removeAllHeaderView();
                        }
                    }
                    this$1.OooOoo().setLoadComplete(response.getIsSuccess());
                    break;
                }
                break;
            case 4:
                RoomSettingActivity this$2 = (RoomSettingActivity) this.f31933OooO0O0;
                RoomSettingActivity.OooO00o oooO00o2 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOooo();
                break;
            case 5:
                UserInfoEditActivity this$3 = (UserInfoEditActivity) this.f31933OooO0O0;
                UserInfoEditActivity.OooO00o oooO00o3 = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(this$3);
                oooO00o4.OooO00o(OooO00o.OooO00o());
                oooO00o4.f48429OooO0OO = CloudImageUtilKt.imgFormat((String) obj);
                oooO00o4.f48427OooO00o = 0;
                oooO00o4.OooO0OO(2, o000O0O0.OooO00o(R.color.white));
                oooO00o4.OooO0o(this$3.OooOooo().f50499OooO0oo);
                break;
            default:
                o00O0 this$4 = (o00O0) this.f31933OooO0O0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    this$4.OooO00o();
                }
                break;
        }
    }
}
