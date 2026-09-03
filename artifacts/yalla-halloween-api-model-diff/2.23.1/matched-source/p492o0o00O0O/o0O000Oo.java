package p492o0o00O0O;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.vip.VipShopExchangeModel;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.vm.main.TopVM;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p184o00o00O0.OooO0OO;
import p370o0OOo0Oo.Oooo000;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oOOoOOO0;
import p595o0oo0.OooOo00;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O000Oo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48985OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48986OooO0o0;

    public /* synthetic */ o0O000Oo(Object obj, int i) {
        this.f48985OooO0Oo = i;
        this.f48986OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0207  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        int i = this.f48985OooO0Oo;
        Object obj2 = this.f48986OooO0o0;
        switch (i) {
            case 0:
                TopActivity this$0 = (TopActivity) obj2;
                TopRankData topRankData = (TopRankData) obj;
                int i2 = TopActivity.f25115OooOooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (topRankData != null) {
                    if (!StringsKt.isBlank(topRankData.getName())) {
                        ConstraintLayout clBottom = this$0.OooOo().f44983OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(clBottom, "clBottom");
                        o000O.OooOOOO(clBottom);
                        View shape = this$0.OooOo().f44987OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(shape, "shape");
                        o000O.OooOOOO(shape);
                        NetImageView userPhoto = this$0.OooOo().f44994OooOOOo;
                        Intrinsics.checkNotNullExpressionValue(userPhoto, "userPhoto");
                        o000O.OooOOOO(userPhoto);
                        String str = this$0.f25118OooOo0;
                        TopVM.INSTANCE.getClass();
                        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$0);
                            oooO00o.OooO00o(o0O0O0Oo.OooO0o());
                            oooO00o.f43127OooO0OO = OooO0OO.OooO0Oo(topRankData.getImageUrl());
                            oooO00o.f43125OooO00o = 0;
                            oooO00o.OooO0Oo(this$0.OooOo().f44994OooOOOo);
                        } else {
                            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this$0);
                            oooO00o2.OooO00o(o0O0O0Oo.OooO00o());
                            oooO00o2.f43127OooO0OO = OooO0OO.OooO0Oo(topRankData.getImageUrl());
                            oooO00o2.f43125OooO00o = 0;
                            oooO00o2.OooO0Oo(this$0.OooOo().f44994OooOOOo);
                        }
                        if (!Intrinsics.areEqual(topRankData.getHeadFrameUrl(), this$0.f25125OooOoo)) {
                            oOOoOOO0 ooooooo0 = this$0.f25126OooOoo0;
                            if (ooooooo0 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameLoad");
                                ooooooo0 = null;
                            }
                            ooooooo0.OooO00o(topRankData.getHeadFrameUrl());
                            this$0.f25125OooOoo = topRankData.getHeadFrameUrl();
                        }
                        if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT) && StringsKt.isBlank(topRankData.getId())) {
                            ConstraintLayout clBottom2 = this$0.OooOo().f44983OooO0Oo;
                            Intrinsics.checkNotNullExpressionValue(clBottom2, "clBottom");
                            o000O.OooO0O0(clBottom2);
                            View shape2 = this$0.OooOo().f44987OooO0oo;
                            Intrinsics.checkNotNullExpressionValue(shape2, "shape");
                            o000O.OooO0O0(shape2);
                        } else {
                            if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                                this$0.OooOo().f44995OooOOo0.setSex(2);
                                this$0.OooOo().f44995OooOOo0.OooO0oo(0, false);
                            } else {
                                UserTagView userTagView = this$0.OooOo().f44995OooOOo0;
                                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                                Integer num = (Integer) oo0oO0.OooOOO().getValue();
                                if (num == null) {
                                    num = 2;
                                }
                                userTagView.setSex(num.intValue());
                                T value = oo0oO0.OooOO0o().getValue();
                                Intrinsics.checkNotNull(value);
                                Pair pair = (Pair) value;
                                this$0.OooOo().f44995OooOOo0.OooO0oo(((Number) pair.getSecond()).intValue(), ((Boolean) pair.getFirst()).booleanValue());
                            }
                            this$0.OooOo().f44988OooOO0.setText(topRankData.getNum() != 0 ? String.valueOf(topRankData.getNum()) : "-");
                            this$0.OooOo().f44995OooOOo0.setName(topRankData.getName());
                            UserTagView userTagView2 = this$0.OooOo().f44995OooOOo0;
                            VipLevel vipLevel = VipLevel.Vip0;
                            userTagView2.OooO0Oo(vipLevel.getValue(), false, this$0);
                            UserTagView userTagView3 = this$0.OooOo().f44995OooOOo0;
                            Intrinsics.checkNotNullExpressionValue(userTagView3, "userTagView");
                            UserTagView.OooOO0o(userTagView3, this$0, null, null, 12);
                            if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                                this$0.OooOo().f44995OooOOo0.setNameFlash(false);
                            } else {
                                UserTagView userTagView4 = this$0.OooOo().f44995OooOOo0;
                                oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                                Pair pair2 = (Pair) oo0oO0.OooOO0().getValue();
                                if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) {
                                    Pair pair3 = (Pair) oo0oO0.OooOO0().getValue();
                                    if ((pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0) >= VipLevel.Vip4.getValue()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                userTagView4.setNameFlash(z);
                                UserTagView userTagView5 = this$0.OooOo().f44995OooOOo0;
                                Pair pair4 = (Pair) oo0oO0.OooOO0().getValue();
                                int iIntValue = pair4 != null ? ((Number) pair4.getSecond()).intValue() : vipLevel.getValue();
                                Pair pair5 = (Pair) oo0oO0.OooOO0().getValue();
                                userTagView5.OooO0Oo(iIntValue, (pair5 != null ? ((Number) pair5.getFirst()).intValue() : 0) == VipState.Vip.getValue(), this$0);
                                if (Intrinsics.areEqual(oo0oO0.OooOo().getValue(), Boolean.TRUE)) {
                                    UserTagView userTagView6 = this$0.OooOo().f44995OooOOo0;
                                    Intrinsics.checkNotNullExpressionValue(userTagView6, "userTagView");
                                    int i3 = (Integer) oo0oO0.OooO0oO().getValue();
                                    if (i3 == null) {
                                        i3 = 0;
                                    }
                                    String str2 = (String) oo0oO0.OooO0o0().getValue();
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    UserTagView.OooOO0o(userTagView6, this$0, i3, str2, 8);
                                }
                            }
                            this$0.OooOo().f44979OooO.setText(OooOo00.OooO0Oo(topRankData.getNumber()));
                        }
                    }
                }
                String str3 = this$0.f25118OooOo0;
                TopVM.INSTANCE.getClass();
                if (!Intrinsics.areEqual(str3, TopVM.TYPE_ROOM_GIFT)) {
                    NetImageView userPhoto2 = this$0.OooOo().f44994OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(userPhoto2, "userPhoto");
                    o000O.OooO0OO(userPhoto2);
                    this$0.OooOo().f44988OooOO0.setText("-");
                    this$0.OooOo().f44979OooO.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                } else {
                    ConstraintLayout clBottom3 = this$0.OooOo().f44983OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(clBottom3, "clBottom");
                    o000O.OooO0O0(clBottom3);
                    View shape3 = this$0.OooOo().f44987OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(shape3, "shape");
                    o000O.OooO0O0(shape3);
                }
                break;
            default:
                VipScreen.Content$lambda$4((VipVm) obj2, (VipShopExchangeModel) obj);
                break;
        }
    }
}
