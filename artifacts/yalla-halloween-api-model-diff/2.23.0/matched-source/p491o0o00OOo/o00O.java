package p491o0o00OOo;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000OO00;
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
import p140o00OOooo.OooOO0;
import p489o0o00OO0.OooO;
import p557o0oOo.OooOO0O;
import p584o0oOooO0.oO00O0oO;
import p592o0oo00O.OooOOO0;
import p641o0ooOOOO.f9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HorizontalScrollView f48718OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f48719OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f48720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public RoomBroadcastView f48721OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f48722OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<oo0o0O0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo0o0O0 invoke() {
            oo0o0O0 oo0o0o0 = new oo0o0O0();
            oo0oOO0 oo0ooo0 = new oo0oOO0(o00O.this);
            TranslateAnimation translateAnimation = oo0o0o0.f48725OooO00o;
            if (translateAnimation == null) {
                if (translateAnimation == null) {
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 1.0f, 1, -1.0f, 2, 0.0f, 2, 0.0f);
                    oo0o0o0.f48725OooO00o = translateAnimation2;
                    Intrinsics.checkNotNull(translateAnimation2);
                    translateAnimation2.setInterpolator(new LinearInterpolator());
                    TranslateAnimation translateAnimation3 = oo0o0o0.f48725OooO00o;
                    Intrinsics.checkNotNull(translateAnimation3);
                    translateAnimation3.setDuration(8000L);
                }
                oo0o0o0.f48725OooO00o = oo0o0o0.f48725OooO00o;
            }
            TranslateAnimation translateAnimation4 = oo0o0o0.f48726OooO0O0;
            if (translateAnimation4 == null) {
                if (translateAnimation4 == null) {
                    TranslateAnimation translateAnimation5 = new TranslateAnimation(1, -1.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
                    oo0o0o0.f48726OooO0O0 = translateAnimation5;
                    Intrinsics.checkNotNull(translateAnimation5);
                    translateAnimation5.setInterpolator(new LinearInterpolator());
                    TranslateAnimation translateAnimation6 = oo0o0o0.f48726OooO0O0;
                    Intrinsics.checkNotNull(translateAnimation6);
                    translateAnimation6.setDuration(8000L);
                }
                oo0o0o0.f48726OooO0O0 = oo0o0o0.f48726OooO0O0;
            }
            TranslateAnimation translateAnimation7 = oo0o0o0.f48725OooO00o;
            Intrinsics.checkNotNull(translateAnimation7);
            translateAnimation7.setAnimationListener(oo0ooo0);
            TranslateAnimation translateAnimation8 = oo0o0o0.f48726OooO0O0;
            Intrinsics.checkNotNull(translateAnimation8);
            translateAnimation8.setAnimationListener(oo0ooo0);
            return oo0o0o0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) roomActivity.findViewById(oO00O0oO.roomBroadcastScroll);
        this.f48718OooO0O0 = horizontalScrollView;
        this.f48719OooO0OO = new ArrayList();
        this.f48722OooO0o0 = LazyKt.lazy(new OooO00o());
        horizontalScrollView.setOnTouchListener(new o00O0OO());
    }

    public static final void OooO0OO(o00O o00o2) {
        HorizontalScrollView horizontalScrollView = o00o2.f48718OooO0O0;
        if (horizontalScrollView != null) {
            horizontalScrollView.removeAllViews();
            horizontalScrollView.setVisibility(8);
        }
        o00o2.f48720OooO0Oo = false;
        ArrayList<RoomBroadcastModel> arrayList = o00o2.f48719OooO0OO;
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MixedRoomDataSource.OooO0o0().getClass();
            if (com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0() != 0) {
                for (RoomBroadcastModel roomBroadcastModel : arrayList) {
                    long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
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
            o00o2.OooO0o();
        }
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO0O0() {
    }

    public final void OooO0Oo(RoomBroadcastModel roomBroadcastModel) {
        BarInfoModel.RoomInfoOld roominfo = roomBroadcastModel.getRoominfo();
        ArrayList arrayList = this.f48719OooO0OO;
        if (roominfo != null) {
            BarInfoModel.RoomInfoOld roominfo2 = roomBroadcastModel.getRoominfo();
            Intrinsics.checkNotNull(roominfo2);
            long id = roominfo2.getId();
            Long value = OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
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
        Object objM4213constructorimpl;
        Unit unit;
        boolean z;
        if (this.f48720OooO0Oo) {
            return;
        }
        ArrayList arrayList = this.f48719OooO0OO;
        RoomBroadcastModel roomBroadcastModel = (RoomBroadcastModel) arrayList.get(0);
        if (roomBroadcastModel != null) {
            boolean z2 = true;
            this.f48720OooO0Oo = true;
            HorizontalScrollView horizontalScrollView = this.f48718OooO0O0;
            horizontalScrollView.setVisibility(0);
            arrayList.remove(roomBroadcastModel);
            if (this.f48721OooO0o == null) {
                RoomBroadcastView roomBroadcastView = new RoomBroadcastView(this.f48470OooO00o);
                this.f48721OooO0o = roomBroadcastView;
                Intrinsics.checkNotNull(roomBroadcastView);
                roomBroadcastView.setRoomBroadcastNewAnimation((oo0o0O0) this.f48722OooO0o0.getValue());
            }
            RoomBroadcastView roomBroadcastView2 = this.f48721OooO0o;
            Intrinsics.checkNotNull(roomBroadcastView2);
            roomBroadcastView2.f31287OooO0o0 = roomBroadcastModel;
            OooOOO0.OooO0O0("RoomBroadcastView\ndata.type = " + Integer.valueOf(roomBroadcastModel.getType()) + "\ndata = " + OooOO0.OooO00o(roomBroadcastModel));
            f9 f9Var = roomBroadcastView2.f31285OooO0Oo;
            RoomBroadcastViewVip6 roomBroadcastViewVip6 = f9Var.f57939OooO0OO;
            Intrinsics.checkNotNullExpressionValue(roomBroadcastViewVip6, "binding.layoutVip6");
            o000OO00.OooO0O0(roomBroadcastViewVip6);
            RoomBroadcastViewAll roomBroadcastViewAll = f9Var.f57938OooO0O0;
            Intrinsics.checkNotNullExpressionValue(roomBroadcastViewAll, "binding.layoutAll");
            o000OO00.OooO0O0(roomBroadcastViewAll);
            if (roomBroadcastModel.getType() != 19) {
                RoomUserInfoDTO from = roomBroadcastModel.getFrom();
                boolean z3 = from != null && from.getVipState() == VipState.Vip.getValue() && from.getVipLevel() >= VipLevel.Vip6.getValue() && from.getShowVIP();
                Boolean boolValueOf = Boolean.valueOf(OooOO0O.OooO0O0(roomBroadcastModel));
                Boolean boolValueOf2 = Boolean.valueOf(roomBroadcastModel.getShoweffectflag() == 1);
                Boolean boolValueOf3 = Boolean.valueOf(OooOO0O.OooO0OO(roomBroadcastModel));
                OooOOO0.OooO0O0("RoomBroadcastView Vip6 \nisFromUserVip6 = " + z3 + "\nisGiftEffectFlag = " + boolValueOf2 + "\nisGiftTotalType = " + boolValueOf + "\nisGiftTotal1799 = " + boolValueOf3);
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
                    RoomBroadcastViewVip6 roomBroadcastViewVip7 = f9Var.f57939OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(roomBroadcastViewVip7, "binding.layoutVip6");
                    o000OO00.OooOOOO(roomBroadcastViewVip7);
                    roomBroadcastViewVip7.setData(roomBroadcastModel);
                } else {
                    Intrinsics.checkNotNullExpressionValue(roomBroadcastViewAll, "binding.layoutAll");
                    o000OO00.OooOOOO(roomBroadcastViewAll);
                    roomBroadcastViewAll.setData(roomBroadcastModel);
                }
                int type = roomBroadcastModel.getType();
                LinearLayout linearLayout = f9Var.f57937OooO00o;
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
                RoomBroadcastView roomBroadcastView3 = this.f48721OooO0o;
                Intrinsics.checkNotNull(roomBroadcastView3);
                horizontalScrollView.addView(roomBroadcastView3.getRootView());
                RoomBroadcastView roomBroadcastView4 = this.f48721OooO0o;
                Intrinsics.checkNotNull(roomBroadcastView4);
                o00O0OOO onFailureCallBack = new o00O0OOO(this);
                f9 f9Var2 = roomBroadcastView4.f31285OooO0Oo;
                Intrinsics.checkNotNullParameter(onFailureCallBack, "onFailureCallBack");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    roomBroadcastView4.getRootView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
                    int measuredWidth = f9Var2.f57937OooO00o.getMeasuredWidth();
                    oo0o0O0 oo0o0o0 = roomBroadcastView4.f31288OooO0oO;
                    if (oo0o0o0 == null) {
                        unit = null;
                    } else {
                        TranslateAnimation translateAnimation = p591o0oo000O.OooO.OooO0o0() ? oo0o0o0.f48726OooO0O0 : oo0o0o0.f48725OooO00o;
                        if (translateAnimation != null) {
                            Resources system = Resources.getSystem();
                            Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
                            int i = (int) ((measuredWidth / system.getDisplayMetrics().density) + 0.5f);
                            int i2 = roomBroadcastView4.f31286OooO0o;
                            translateAnimation.setDuration(i2 + ((i * i2) / 360));
                            f9Var2.f57937OooO00o.startAnimation(translateAnimation);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                    }
                    objM4213constructorimpl = Result.m4213constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM4216exceptionOrNullimpl = Result.m4216exceptionOrNullimpl(objM4213constructorimpl);
                if (thM4216exceptionOrNullimpl != null) {
                    OooOOO0.OooO0O0("startInAnimation  onFailure    " + thM4216exceptionOrNullimpl);
                    onFailureCallBack.invoke();
                }
            }
        }
    }

    public final void OooO0o0(@NotNull RoomBroadcastModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        OooOOO0.OooO0O0("收到广播 data.getType = " + data.getType() + ", broadcast = " + OooOO0.OooO00o(data));
        if (data.getType() != 11) {
            OooO0Oo(data);
            if (data.getType() == 12 || data.getType() == 13 || data.getType() == 14 || data.getType() == 22) {
                OooO0Oo(data);
            }
            OooO0o();
            return;
        }
        if (Intrinsics.areEqual(p591o0oo000O.OooO.OooO0O0(), data.getLang())) {
            OooO0Oo(data);
            OooO0o();
        } else if (Intrinsics.areEqual(data.getLang(), "id") && p591o0oo000O.OooO.OooO0OO() == 3) {
            OooO0Oo(data);
            OooO0o();
        }
    }
}
