package p486o0o00O00;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.vm.main.TopVM;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;
import p579o0oOoo.oO00O0oO;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 implements Observer<TopRankData> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopActivity f48344OooO0Oo;

    public o0O000o0(TopActivity topActivity) {
        this.f48344OooO0Oo = topActivity;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01f5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(TopRankData topRankData) {
        boolean z;
        TopRankData topRankData2 = topRankData;
        TopActivity topActivity = this.f48344OooO0Oo;
        if (topRankData2 != null) {
            if (!StringsKt.isBlank(topRankData2.getName())) {
                int i = TopActivity.f25568OooOooO;
                ConstraintLayout constraintLayout = topActivity.OooOo().f59131OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clBottom");
                o000OO00.OooOOOO(constraintLayout);
                View view = topActivity.OooOo().f59135OooO0oo;
                Intrinsics.checkNotNullExpressionValue(view, "binding.shape");
                o000OO00.OooOOOO(view);
                NetImageView netImageView = topActivity.OooOo().f59142OooOOOo;
                Intrinsics.checkNotNullExpressionValue(netImageView, "binding.userPhoto");
                o000OO00.OooOOOO(netImageView);
                String str = topActivity.f25571OooOo0;
                TopVM.INSTANCE.getClass();
                if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                    OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(topActivity);
                    oooO00o.OooO00o(OooO.OooO0o());
                    oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(topRankData2.getImageUrl());
                    oooO00o.f43909OooO00o = 0;
                    oooO00o.OooO0Oo(topActivity.OooOo().f59142OooOOOo);
                } else {
                    OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(topActivity);
                    oooO00o2.OooO00o(OooO.OooO00o());
                    oooO00o2.f43911OooO0OO = OooO0o.OooO0Oo(topRankData2.getImageUrl());
                    oooO00o2.f43909OooO00o = 0;
                    oooO00o2.OooO0Oo(topActivity.OooOo().f59142OooOOOo);
                }
                if (!Intrinsics.areEqual(topRankData2.getHeadFrameUrl(), topActivity.f25578OooOoo)) {
                    oO00O0oO oo00o0oo = topActivity.f25579OooOoo0;
                    if (oo00o0oo == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameLoad");
                        oo00o0oo = null;
                    }
                    oo00o0oo.OooO00o(topRankData2.getHeadFrameUrl());
                    topActivity.f25578OooOoo = topRankData2.getHeadFrameUrl();
                }
                if (Intrinsics.areEqual(topRankData2.getType(), TopVM.TYPE_ROOM_GIFT) && StringsKt.isBlank(topRankData2.getId())) {
                    ConstraintLayout constraintLayout2 = topActivity.OooOo().f59131OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clBottom");
                    o000OO00.OooO0O0(constraintLayout2);
                    View view2 = topActivity.OooOo().f59135OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(view2, "binding.shape");
                    o000OO00.OooO0O0(view2);
                    return;
                }
                if (Intrinsics.areEqual(topRankData2.getType(), TopVM.TYPE_ROOM_GIFT)) {
                    topActivity.OooOo().f59143OooOOo0.setSex(2);
                    topActivity.OooOo().f59143OooOOo0.OooO0oo(0, false);
                } else {
                    UserTagView userTagView = topActivity.OooOo().f59143OooOOo0;
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Integer num = (Integer) o000000O.OooOOO().getValue();
                    if (num == null) {
                        num = 2;
                    }
                    userTagView.setSex(num.intValue());
                    T value = o000000O.OooOO0o().getValue();
                    Intrinsics.checkNotNull(value);
                    Pair pair = (Pair) value;
                    topActivity.OooOo().f59143OooOOo0.OooO0oo(((Number) pair.getSecond()).intValue(), ((Boolean) pair.getFirst()).booleanValue());
                }
                topActivity.OooOo().f59136OooOO0.setText(topRankData2.getNum() != 0 ? String.valueOf(topRankData2.getNum()) : "-");
                topActivity.OooOo().f59143OooOOo0.setName(topRankData2.getName());
                UserTagView userTagView2 = topActivity.OooOo().f59143OooOOo0;
                VipLevel vipLevel = VipLevel.Vip0;
                userTagView2.OooO0Oo(vipLevel.getValue(), false, topActivity);
                UserTagView userTagView3 = topActivity.OooOo().f59143OooOOo0;
                Intrinsics.checkNotNullExpressionValue(userTagView3, "binding.userTagView");
                UserTagView.OooOO0o(userTagView3, topActivity, null, null, 12);
                if (Intrinsics.areEqual(topRankData2.getType(), TopVM.TYPE_ROOM_GIFT)) {
                    topActivity.OooOo().f59143OooOOo0.setNameFlash(false);
                } else {
                    UserTagView userTagView4 = topActivity.OooOo().f59143OooOOo0;
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    Pair pair2 = (Pair) o000000O.OooOO0().getValue();
                    if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) {
                        Pair pair3 = (Pair) o000000O.OooOO0().getValue();
                        if ((pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0) >= VipLevel.Vip4.getValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    userTagView4.setNameFlash(z);
                    UserTagView userTagView5 = topActivity.OooOo().f59143OooOOo0;
                    Pair pair4 = (Pair) o000000O.OooOO0().getValue();
                    int iIntValue = pair4 != null ? ((Number) pair4.getSecond()).intValue() : vipLevel.getValue();
                    Pair pair5 = (Pair) o000000O.OooOO0().getValue();
                    userTagView5.OooO0Oo(iIntValue, (pair5 != null ? ((Number) pair5.getFirst()).intValue() : 0) == VipState.Vip.getValue(), topActivity);
                    if (Intrinsics.areEqual(o000000O.OooOo().getValue(), Boolean.TRUE)) {
                        UserTagView userTagView6 = topActivity.OooOo().f59143OooOOo0;
                        Intrinsics.checkNotNullExpressionValue(userTagView6, "binding.userTagView");
                        int i2 = (Integer) o000000O.OooO0oO().getValue();
                        if (i2 == null) {
                            i2 = 0;
                        }
                        String str2 = (String) o000000O.OooO0o0().getValue();
                        if (str2 == null) {
                            str2 = "";
                        }
                        UserTagView.OooOO0o(userTagView6, topActivity, i2, str2, 8);
                    }
                }
                topActivity.OooOo().f59127OooO.setText(OooOOOO.OooO0Oo(topRankData2.getNumber()));
                return;
            }
        }
        String str3 = topActivity.f25571OooOo0;
        TopVM.INSTANCE.getClass();
        if (!Intrinsics.areEqual(str3, TopVM.TYPE_ROOM_GIFT)) {
            NetImageView netImageView2 = topActivity.OooOo().f59142OooOOOo;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.userPhoto");
            o000OO00.OooO0OO(netImageView2);
            topActivity.OooOo().f59136OooOO0.setText("-");
            topActivity.OooOo().f59127OooO.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            return;
        }
        ConstraintLayout constraintLayout3 = topActivity.OooOo().f59131OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.clBottom");
        o000OO00.OooO0O0(constraintLayout3);
        View view3 = topActivity.OooOo().f59135OooO0oo;
        Intrinsics.checkNotNullExpressionValue(view3, "binding.shape");
        o000OO00.OooO0O0(view3);
    }
}
