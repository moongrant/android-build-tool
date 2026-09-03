package p143o00OOooo;

import android.os.Looper;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.ApiServiceUpdateModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.TopicFollowChange;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.fragment.MainMomentsTopicAddMoreFragment;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p177o00Ooooo.oO0O000o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p254o00ooO0O.oOO00O;
import p524o0o0O0oO.o0O0o0;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0oOO0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32043OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32044OooO0O0;

    public /* synthetic */ oo0oOO0(Object obj, int i) {
        this.f32043OooO00o = i;
        this.f32044OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = 0;
        boolean z = true;
        switch (this.f32043OooO00o) {
            case 0:
                RoomInfoMomentFragment.m68initObserver$lambda4((RoomInfoMomentFragment) this.f32044OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                oO0O000o oo0o000o = (oO0O000o) this.f32044OooO0O0;
                int i2 = oO0O000o.f32895Ooooo00;
                Objects.requireNonNull(oo0o000o);
                if (((Boolean) obj).booleanValue()) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Success);
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
                }
                oo0o000o.OooO0o0(0);
                break;
            case 2:
                wa bindingDrawer = (wa) this.f32044OooO0O0;
                Pair<Boolean, Integer> vipAndVipLevel = (Pair) obj;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                UserPremiumView userPremiumView = bindingDrawer.f50881OooOO0o;
                Intrinsics.checkNotNullExpressionValue(vipAndVipLevel, "vipAndVipLevel");
                userPremiumView.setPremium(vipAndVipLevel);
                bindingDrawer.f50875OooO0o.f50950OooOOo.setPremium(vipAndVipLevel);
                if (vipAndVipLevel.getSecond().intValue() <= 0) {
                    TextView textView = bindingDrawer.f50875OooO0o.f50953OooOo;
                    Intrinsics.checkNotNullExpressionValue(textView, "bindingDrawer.list.tvPremium");
                    oOO00O.OooO(textView);
                } else {
                    TextView textView2 = bindingDrawer.f50875OooO0o.f50953OooOo;
                    Intrinsics.checkNotNullExpressionValue(textView2, "bindingDrawer.list.tvPremium");
                    oOO00O.OooO00o(textView2);
                }
                break;
            case 3:
                MainActivity this$0 = (MainActivity) this.f32044OooO0O0;
                Response response = (Response) obj;
                MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess()) {
                    ApiServiceUpdateModel apiServiceUpdateModel = (ApiServiceUpdateModel) response.getData();
                    if (apiServiceUpdateModel != null && apiServiceUpdateModel.isServiceUp()) {
                        i = 1;
                    }
                    if (i != 0) {
                        ((o0O0o0) this$0.f21951Oooooo0.getValue()).OooO0OO();
                    }
                }
                break;
            case 4:
                Function1 tmp0 = (Function1) this.f32044OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke((Boolean) obj);
                break;
            case 5:
                FollowerActivity followerActivity = (FollowerActivity) this.f32044OooO0O0;
                Long l = (Long) obj;
                while (true) {
                    if (i < followerActivity.f23321Ooooo0o.getData().size()) {
                        if (l.longValue() != followerActivity.f23321Ooooo0o.getData().get(i).getUserId()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i > 0 && i < followerActivity.f23321Ooooo0o.getData().size()) {
                    followerActivity.f23321Ooooo0o.remove(i);
                    break;
                }
                break;
            case 6:
                RoomGameBoxDialog this$1 = (RoomGameBoxDialog) this.f32044OooO0O0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOOOO(true, RoomGameBoxDialog.GameType.GameMora);
                break;
            case 7:
                MainMomentsTopicAddMoreFragment.m344initObserver$lambda1((MainMomentsTopicAddMoreFragment) this.f32044OooO0O0, (TopicFollowChange) obj);
                break;
            case 8:
                TopicPostLatestFragment.m402initObserve$lambda1((TopicPostLatestFragment) this.f32044OooO0O0, (Long) obj);
                break;
            default:
                MainRoomMineJoinedFragment.m473onLazyInit$lambda0((MainRoomMineJoinedFragment) this.f32044OooO0O0, (Boolean) obj);
                break;
        }
    }
}
