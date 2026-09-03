package p497o0o00Oo;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.BarInfoModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.view.room.RoomBroadcastView;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewAll;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewVip6;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p407o0Oo0OOO.v0;
import p496o0o00OOo.o000Oo0;
import p565o0oOo000.o0Oo0oo;
import p574o0oOoO0o.o00O00o0;
import p596o0oo000O.OooO0o;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 extends o000Oo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HorizontalScrollView f49657OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f49658OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f49659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public RoomBroadcastView f49660OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f49661OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<OooO0o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0o invoke() {
            OooO0o oooO0o = new OooO0o();
            OooOO0O oooOO0O = new OooOO0O(OooOOO0.this);
            TranslateAnimation translateAnimation = oooO0o.f49653OooO00o;
            if (translateAnimation == null) {
                if (translateAnimation == null) {
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 1.0f, 1, -1.0f, 2, 0.0f, 2, 0.0f);
                    oooO0o.f49653OooO00o = translateAnimation2;
                    Intrinsics.checkNotNull(translateAnimation2);
                    translateAnimation2.setInterpolator(new LinearInterpolator());
                    TranslateAnimation translateAnimation3 = oooO0o.f49653OooO00o;
                    Intrinsics.checkNotNull(translateAnimation3);
                    translateAnimation3.setDuration(8000L);
                }
                oooO0o.f49653OooO00o = oooO0o.f49653OooO00o;
            }
            TranslateAnimation translateAnimation4 = oooO0o.f49654OooO0O0;
            if (translateAnimation4 == null) {
                if (translateAnimation4 == null) {
                    TranslateAnimation translateAnimation5 = new TranslateAnimation(1, -1.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
                    oooO0o.f49654OooO0O0 = translateAnimation5;
                    Intrinsics.checkNotNull(translateAnimation5);
                    translateAnimation5.setInterpolator(new LinearInterpolator());
                    TranslateAnimation translateAnimation6 = oooO0o.f49654OooO0O0;
                    Intrinsics.checkNotNull(translateAnimation6);
                    translateAnimation6.setDuration(8000L);
                }
                oooO0o.f49654OooO0O0 = oooO0o.f49654OooO0O0;
            }
            TranslateAnimation translateAnimation7 = oooO0o.f49653OooO00o;
            Intrinsics.checkNotNull(translateAnimation7);
            translateAnimation7.setAnimationListener(oooOO0O);
            TranslateAnimation translateAnimation8 = oooO0o.f49654OooO0O0;
            Intrinsics.checkNotNull(translateAnimation8);
            translateAnimation8.setAnimationListener(oooOO0O);
            return oooO0o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) roomActivity.findViewById(o0Oo0oo.roomBroadcastScroll);
        this.f49657OooO0O0 = horizontalScrollView;
        this.f49658OooO0OO = new ArrayList();
        this.f49661OooO0o0 = LazyKt.lazy(new OooO00o());
        horizontalScrollView.setOnTouchListener(new OooO());
    }

    public static final void OooO0OO(OooOOO0 oooOOO0) {
        HorizontalScrollView horizontalScrollView = oooOOO0.f49657OooO0O0;
        if (horizontalScrollView != null) {
            horizontalScrollView.removeAllViews();
            horizontalScrollView.setVisibility(8);
        }
        oooOOO0.f49659OooO0Oo = false;
        ArrayList<RoomBroadcastModel> arrayList = oooOOO0.f49658OooO0OO;
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MixedRoomDataSource.OooO0o0().getClass();
            if (com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.OooO0o0() != 0) {
                for (RoomBroadcastModel roomBroadcastModel : arrayList) {
                    long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.OooO0o0();
                    Intrinsics.checkNotNull(roomBroadcastModel);
                    if (jOooO0o0 == roomBroadcastModel.getBarid()) {
                        switch (roomBroadcastModel.getType()) {
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 16:
                                arrayList3.add(roomBroadcastModel);
                                break;
                            case 11:
                            case 13:
                            default:
                                arrayList2.add(roomBroadcastModel);
                                break;
                        }
                    } else {
                        arrayList2.add(roomBroadcastModel);
                    }
                }
                arrayList.clear();
                if (arrayList3.size() > 0) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
            }
            oooOOO0.OooO0o();
        }
    }

    @Override // p496o0o00OOo.o000Oo0
    public final void OooO00o() {
    }

    @Override // p496o0o00OOo.o000Oo0
    public final void OooO0O0() {
    }

    public final void OooO0Oo(RoomBroadcastModel roomBroadcastModel) {
        BarInfoModel.RoomInfoOld roominfo = roomBroadcastModel.getRoominfo();
        ArrayList arrayList = this.f49658OooO0OO;
        if (roominfo != null) {
            BarInfoModel.RoomInfoOld roominfo2 = roomBroadcastModel.getRoominfo();
            Intrinsics.checkNotNull(roominfo2);
            long id = roominfo2.getId();
            Long value = OooO0O0.f24541OoooOOO.OooO00o().f24547OooO0Oo.getValue();
            if (value != null && id == value.longValue()) {
                arrayList.add(0, roomBroadcastModel);
                return;
            }
        }
        arrayList.add(roomBroadcastModel);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x0160  */
    /* JADX WARN: Code duplicated, block: B:73:0x01de  */
    public final void OooO0o() {
        Object objM4215constructorimpl;
        Unit unit;
        boolean z;
        if (this.f49659OooO0Oo) {
            return;
        }
        ArrayList arrayList = this.f49658OooO0OO;
        RoomBroadcastModel roomBroadcastModel = (RoomBroadcastModel) arrayList.get(0);
        if (roomBroadcastModel != null) {
            boolean z2 = true;
            this.f49659OooO0Oo = true;
            HorizontalScrollView horizontalScrollView = this.f49657OooO0O0;
            horizontalScrollView.setVisibility(0);
            arrayList.remove(roomBroadcastModel);
            if (this.f49660OooO0o == null) {
                RoomBroadcastView roomBroadcastView = new RoomBroadcastView(this.f49652OooO00o);
                this.f49660OooO0o = roomBroadcastView;
                Intrinsics.checkNotNull(roomBroadcastView);
                roomBroadcastView.setRoomBroadcastNewAnimation((OooO0o) this.f49661OooO0o0.getValue());
            }
            RoomBroadcastView roomBroadcastView2 = this.f49660OooO0o;
            Intrinsics.checkNotNull(roomBroadcastView2);
            roomBroadcastView2.f30752OooO0o0 = roomBroadcastModel;
            OooOOOO.OooO0O0("RoomBroadcastView\ndata.type = " + Integer.valueOf(roomBroadcastModel.getType()) + "\ndata = " + OooO.OooO00o(roomBroadcastModel));
            v0 v0Var = roomBroadcastView2.f30750OooO0Oo;
            RoomBroadcastViewVip6 layoutVip6 = v0Var.f45587OooO0OO;
            Intrinsics.checkNotNullExpressionValue(layoutVip6, "layoutVip6");
            o000O.OooO0O0(layoutVip6);
            RoomBroadcastViewAll layoutAll = v0Var.f45586OooO0O0;
            Intrinsics.checkNotNullExpressionValue(layoutAll, "layoutAll");
            o000O.OooO0O0(layoutAll);
            if (roomBroadcastModel.getType() != 19) {
                RoomUserInfoDTO from = roomBroadcastModel.getFrom();
                boolean z3 = from != null && from.getVipState() == VipState.Vip.getValue() && from.getVipLevel() >= VipLevel.Vip6.getValue() && from.getShowVIP();
                Boolean boolValueOf = Boolean.valueOf(o00O00o0.OooO0O0(roomBroadcastModel));
                Boolean boolValueOf2 = Boolean.valueOf(roomBroadcastModel.getShoweffectflag() == 1);
                Boolean boolValueOf3 = Boolean.valueOf(o00O00o0.OooO0OO(roomBroadcastModel));
                OooOOOO.OooO0O0("RoomBroadcastView Vip6 \nisFromUserVip6 = " + z3 + "\nisGiftEffectFlag = " + boolValueOf2 + "\nisGiftTotalType = " + boolValueOf + "\nisGiftTotal1799 = " + boolValueOf3);
                if (z3) {
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.areEqual(boolValueOf, bool) || Intrinsics.areEqual(boolValueOf2, bool) || Intrinsics.areEqual(boolValueOf3, bool)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    RoomBroadcastViewVip6 layoutVip7 = v0Var.f45587OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(layoutVip7, "layoutVip6");
                    o000O.OooOOOO(layoutVip7);
                    layoutVip7.setData(roomBroadcastModel);
                } else {
                    Intrinsics.checkNotNullExpressionValue(layoutAll, "layoutAll");
                    o000O.OooOOOO(layoutAll);
                    layoutAll.setData(roomBroadcastModel);
                }
                int type = roomBroadcastModel.getType();
                LinearLayout linearLayout = v0Var.f45585OooO00o;
                if (type == 21 || type == 22) {
                    linearLayout.setEnabled(true);
                } else if (type != 91) {
                    switch (type) {
                        case 9:
                            linearLayout.setEnabled(false);
                            break;
                        case 10:
                            linearLayout.setEnabled(true);
                            break;
                        case 11:
                            linearLayout.setEnabled(false);
                            break;
                        case 12:
                            linearLayout.setEnabled(true);
                            break;
                        case 13:
                            linearLayout.setEnabled(true);
                            break;
                        case 14:
                            linearLayout.setEnabled(true);
                            break;
                        case 15:
                            linearLayout.setEnabled(true);
                            break;
                        case 16:
                            linearLayout.setEnabled(true);
                            break;
                        case 17:
                            linearLayout.setEnabled(true);
                            break;
                        case 18:
                            linearLayout.setEnabled(true);
                            break;
                        default:
                            linearLayout.setEnabled(true);
                            z2 = false;
                            break;
                    }
                } else {
                    linearLayout.setEnabled(false);
                }
            } else {
                z2 = false;
            }
            if (z2) {
                horizontalScrollView.removeAllViews();
                RoomBroadcastView roomBroadcastView3 = this.f49660OooO0o;
                Intrinsics.checkNotNull(roomBroadcastView3);
                horizontalScrollView.addView(roomBroadcastView3.getRootView());
                RoomBroadcastView roomBroadcastView4 = this.f49660OooO0o;
                Intrinsics.checkNotNull(roomBroadcastView4);
                OooOO0 onFailureCallBack = new OooOO0(this);
                v0 v0Var2 = roomBroadcastView4.f30750OooO0Oo;
                Intrinsics.checkNotNullParameter(onFailureCallBack, "onFailureCallBack");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    roomBroadcastView4.getRootView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
                    int measuredWidth = v0Var2.f45585OooO00o.getMeasuredWidth();
                    OooO0o oooO0o = roomBroadcastView4.f30753OooO0oO;
                    if (oooO0o == null) {
                        unit = null;
                    } else {
                        TranslateAnimation translateAnimation = OooO0o.OooO0o0() ? oooO0o.f49654OooO0O0 : oooO0o.f49653OooO00o;
                        if (translateAnimation != null) {
                            Resources system = Resources.getSystem();
                            Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
                            int i = (int) ((measuredWidth / system.getDisplayMetrics().density) + 0.5f);
                            int i2 = roomBroadcastView4.f30751OooO0o;
                            translateAnimation.setDuration(i2 + ((i * i2) / 360));
                            v0Var2.f45585OooO00o.startAnimation(translateAnimation);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                    }
                    objM4215constructorimpl = Result.m4215constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM4218exceptionOrNullimpl = Result.m4218exceptionOrNullimpl(objM4215constructorimpl);
                if (thM4218exceptionOrNullimpl != null) {
                    OooOOOO.OooO0O0("startInAnimation  onFailure    " + thM4218exceptionOrNullimpl);
                    onFailureCallBack.invoke();
                }
            }
        }
    }

    public final void OooO0o0(@NotNull RoomBroadcastModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        OooOOOO.OooO0O0("收到广播 data.getType = " + data.getType() + ", broadcast = " + OooO.OooO00o(data));
        if (data.getType() != 11) {
            OooO0Oo(data);
            if (data.getType() == 12 || data.getType() == 13 || data.getType() == 14 || data.getType() == 22) {
                OooO0Oo(data);
            }
            OooO0o();
            return;
        }
        if (Intrinsics.areEqual(OooO0o.OooO0O0(), data.getLang())) {
            OooO0Oo(data);
            OooO0o();
        } else if (Intrinsics.areEqual(data.getLang(), "id") && OooO0o.OooO0OO() == 3) {
            OooO0Oo(data);
            OooO0o();
        }
    }
}
