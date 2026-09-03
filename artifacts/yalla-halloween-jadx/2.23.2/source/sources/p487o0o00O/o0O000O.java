package p487o0o00O;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
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
import p107o000ooO0.OooOOOO;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOOO00Oo;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48842OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48843OooO0o0;

    public /* synthetic */ o0O000O(Object obj, int i) {
        this.f48842OooO0Oo = i;
        this.f48843OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        int i = this.f48842OooO0Oo;
        Object obj2 = this.f48843OooO0o0;
        switch (i) {
            case 0:
                TopActivity this$0 = (TopActivity) obj2;
                TopRankData topRankData = (TopRankData) obj;
                int i2 = TopActivity.f25114OooOooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (topRankData != null) {
                    if (!StringsKt.isBlank(topRankData.getName())) {
                        ConstraintLayout clBottom = this$0.OooOo().f44984OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(clBottom, "clBottom");
                        o000O.OooOOOO(clBottom);
                        View shape = this$0.OooOo().f44988OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(shape, "shape");
                        o000O.OooOOOO(shape);
                        NetImageView userPhoto = this$0.OooOo().f44995OooOOOo;
                        Intrinsics.checkNotNullExpressionValue(userPhoto, "userPhoto");
                        o000O.OooOOOO(userPhoto);
                        String str = this$0.f25117OooOo0;
                        TopVM.INSTANCE.getClass();
                        if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$0);
                            oooO00o.OooO00o(d1.OooO0o());
                            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(topRankData.getImageUrl());
                            oooO00o.f43124OooO00o = 0;
                            oooO00o.OooO0Oo(this$0.OooOo().f44995OooOOOo);
                        } else {
                            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this$0);
                            oooO00o2.OooO00o(d1.OooO00o());
                            oooO00o2.f43126OooO0OO = OooO0OO.OooO0Oo(topRankData.getImageUrl());
                            oooO00o2.f43124OooO00o = 0;
                            oooO00o2.OooO0Oo(this$0.OooOo().f44995OooOOOo);
                        }
                        if (!Intrinsics.areEqual(topRankData.getHeadFrameUrl(), this$0.f25124OooOoo)) {
                            oOOO00Oo oooo00oo = this$0.f25125OooOoo0;
                            if (oooo00oo == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameLoad");
                                oooo00oo = null;
                            }
                            oooo00oo.OooO00o(topRankData.getHeadFrameUrl());
                            this$0.f25124OooOoo = topRankData.getHeadFrameUrl();
                        }
                        if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT) && StringsKt.isBlank(topRankData.getId())) {
                            ConstraintLayout clBottom2 = this$0.OooOo().f44984OooO0Oo;
                            Intrinsics.checkNotNullExpressionValue(clBottom2, "clBottom");
                            o000O.OooO0O0(clBottom2);
                            View shape2 = this$0.OooOo().f44988OooO0oo;
                            Intrinsics.checkNotNullExpressionValue(shape2, "shape");
                            o000O.OooO0O0(shape2);
                        } else {
                            if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                                this$0.OooOo().f44996OooOOo0.setSex(2);
                                this$0.OooOo().f44996OooOOo0.OooO0oo(0, false);
                            } else {
                                UserTagView userTagView = this$0.OooOo().f44996OooOOo0;
                                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                                Integer num = (Integer) o0O00oO0.OooOOO().getValue();
                                if (num == null) {
                                    num = 2;
                                }
                                userTagView.setSex(num.intValue());
                                T value = o0O00oO0.OooOO0o().getValue();
                                Intrinsics.checkNotNull(value);
                                Pair pair = (Pair) value;
                                this$0.OooOo().f44996OooOOo0.OooO0oo(((Number) pair.getSecond()).intValue(), ((Boolean) pair.getFirst()).booleanValue());
                            }
                            this$0.OooOo().f44989OooOO0.setText(topRankData.getNum() != 0 ? String.valueOf(topRankData.getNum()) : "-");
                            this$0.OooOo().f44996OooOOo0.setName(topRankData.getName());
                            UserTagView userTagView2 = this$0.OooOo().f44996OooOOo0;
                            VipLevel vipLevel = VipLevel.Vip0;
                            userTagView2.OooO0Oo(vipLevel.getValue(), false, this$0);
                            UserTagView userTagView3 = this$0.OooOo().f44996OooOOo0;
                            Intrinsics.checkNotNullExpressionValue(userTagView3, "userTagView");
                            UserTagView.OooOO0o(userTagView3, this$0, null, null, 12);
                            if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                                this$0.OooOo().f44996OooOOo0.setNameFlash(false);
                            } else {
                                UserTagView userTagView4 = this$0.OooOo().f44996OooOOo0;
                                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                                Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
                                if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) {
                                    Pair pair3 = (Pair) o0O00oO0.OooOO0().getValue();
                                    if ((pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0) >= VipLevel.Vip4.getValue()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                userTagView4.setNameFlash(z);
                                UserTagView userTagView5 = this$0.OooOo().f44996OooOOo0;
                                Pair pair4 = (Pair) o0O00oO0.OooOO0().getValue();
                                int iIntValue = pair4 != null ? ((Number) pair4.getSecond()).intValue() : vipLevel.getValue();
                                Pair pair5 = (Pair) o0O00oO0.OooOO0().getValue();
                                userTagView5.OooO0Oo(iIntValue, (pair5 != null ? ((Number) pair5.getFirst()).intValue() : 0) == VipState.Vip.getValue(), this$0);
                                if (Intrinsics.areEqual(o0O00oO0.OooOo().getValue(), Boolean.TRUE)) {
                                    UserTagView userTagView6 = this$0.OooOo().f44996OooOOo0;
                                    Intrinsics.checkNotNullExpressionValue(userTagView6, "userTagView");
                                    int i3 = (Integer) o0O00oO0.OooO0oO().getValue();
                                    if (i3 == null) {
                                        i3 = 0;
                                    }
                                    String str2 = (String) o0O00oO0.OooO0o0().getValue();
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    UserTagView.OooOO0o(userTagView6, this$0, i3, str2, 8);
                                }
                            }
                            this$0.OooOo().f44980OooO.setText(o0O0O0Oo.OooO0Oo(topRankData.getNumber()));
                        }
                    }
                }
                String str3 = this$0.f25117OooOo0;
                TopVM.INSTANCE.getClass();
                if (!Intrinsics.areEqual(str3, TopVM.TYPE_ROOM_GIFT)) {
                    NetImageView userPhoto2 = this$0.OooOo().f44995OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(userPhoto2, "userPhoto");
                    o000O.OooO0OO(userPhoto2);
                    this$0.OooOo().f44989OooOO0.setText("-");
                    this$0.OooOo().f44980OooO.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                } else {
                    ConstraintLayout clBottom3 = this$0.OooOo().f44984OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(clBottom3, "clBottom");
                    o000O.OooO0O0(clBottom3);
                    View shape3 = this$0.OooOo().f44988OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(shape3, "shape");
                    o000O.OooO0O0(shape3);
                }
                break;
            default:
                OooOOOO lazyPagingItems = (OooOOOO) obj2;
                ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
                lazyPagingItems.OooO0Oo();
                break;
        }
    }
}
