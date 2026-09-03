package com.app.base.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.app.base.Function.OooO0OO;
import com.app.base.application.App;
import com.app.base.model.SkillCardListModel;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p031OoooO.o0000O;
import p043OooooO0.o00O0000;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0O0O00;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p255o00ooO0o.oo0oOO0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ SkillCardListModel.DataBean f11617Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ SkillCardDataFragment.OooO0O0 f11618OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ p188o00o00o0.OooO0o f11619OoooO00;

    public OooOOO(SkillCardDataFragment.OooO0O0 oooO0O0, SkillCardListModel.DataBean dataBean, p188o00o00o0.OooO0o oooO0o) {
        this.f11618OoooO0 = oooO0O0;
        this.f11617Oooo = dataBean;
        this.f11619OoooO00 = oooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        final SkillCardListModel.DataBean dataBean;
        Integer numValueOf;
        Integer num;
        String value;
        String str;
        SkillCardListModel.DataBean dataBean2 = this.f11617Oooo;
        if (dataBean2.warestype == 1 && dataBean2.state == 1) {
            return;
        }
        final PurchaseSkillCardActivity activity = (PurchaseSkillCardActivity) SkillCardDataFragment.this.getActivity();
        int i = SkillCardDataFragment.this.wareType;
        final int layoutPosition = this.f11619OoooO00.getLayoutPosition();
        if (i == 1) {
            dataBean = activity.f23213OoooOoO.data1.get(layoutPosition);
        } else {
            dataBean = i == 2 ? activity.f23213OoooOoO.data.get(layoutPosition) : activity.f23213OoooOoO.data2.get(layoutPosition);
        }
        int i2 = Integer.parseInt(dataBean.promotionprice);
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Pair<Boolean, Integer> value2 = oooOOO.OooOOO0().getValue();
        if (value2.getFirst().booleanValue() && value2.getSecond().intValue() >= PremiumLevel.Premium5.getValue()) {
            i2 = Integer.parseInt(dataBean.discountprice);
        }
        int i3 = i2;
        int i4 = Integer.parseInt(dataBean.shopid);
        if (i4 != 10) {
            if (i4 != 38) {
                num = null;
            } else {
                numValueOf = Integer.valueOf(R.drawable.bg_wear_crazy_love_line);
            }
            String warnText = activity.getString(R.string.cost) + " yyy " + activity.getString(R.string.golds);
            if (num == null) {
                value = null;
                str = null;
            } else if (i == 1) {
                value = oooOOO.OooO0oo().getValue();
                str = dataBean.picurl;
            } else {
                value = dataBean.picurl;
                str = null;
            }
            Function1 onConfirmClick = new Function1(dataBean, layoutPosition) { // from class: o0oOo00.OooOOO

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ SkillCardListModel.DataBean f45122Oooo0oO;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PurchaseSkillCardActivity purchaseSkillCardActivity = this.f45121Oooo0o;
                    SkillCardListModel.DataBean dataBean3 = this.f45122Oooo0oO;
                    Long l = (Long) obj;
                    int i5 = PurchaseSkillCardActivity.f23211Oooooo;
                    Objects.requireNonNull(purchaseSkillCardActivity);
                    if (dataBean3.lowestVIPLv <= 0 || p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue().getFirst().booleanValue()) {
                        String str2 = dataBean3.shopid;
                        long jLongValue = l.longValue();
                        int i6 = (int) jLongValue;
                        if (jLongValue != i6) {
                            throw new ArithmeticException();
                        }
                        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                        o0O0O00 o0o0o00 = o00000OO.f32211OooO0o;
                        OooOo oooOo = new OooOo(purchaseSkillCardActivity, App.f11458Oooo0oO);
                        App app = App.f11458Oooo0oO;
                        Map mapOooO00o = OooO0OO.OooO00o();
                        mapOooO00o.put("shopid", str2);
                        mapOooO00o.put("num", i6 + "");
                        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32268OoooOoo, mapOooO00o, oooOo);
                    } else {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(purchaseSkillCardActivity);
                        oo0ooo0.OooOo0(R.string.VIP_commodity);
                        oo0ooo0.OooOOOo(R.string.Get_Yalla_Premium);
                        oo0ooo0.OooOo0o(new Function0() { // from class: o0oOo00.OooOOO0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = PurchaseSkillCardActivity.f23211Oooooo;
                                Context context = OooO0O0.f20502OooO00o.OooO0O0();
                                if (context == null && (context = o0000O.f2657OooO00o) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                PremiumLevel level = PremiumLevel.Premium1;
                                Intrinsics.checkNotNullParameter(context, "context");
                                Intrinsics.checkNotNullParameter(level, "level");
                                Intent intent = new Intent(context, (Class<?>) PremiumActivity.class);
                                intent.putExtra("VipLevel", level.getValue());
                                context.startActivity(intent);
                                return null;
                            }
                        });
                        oo0ooo0.OooOoO();
                        oo0ooo0.OooOOO0();
                    }
                    return null;
                }
            };
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(warnText, "warnText");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            activity.showDialog((String) null, o00O0000.OooO0O0(-1474523587, true, new p139o00OOOo0.OooOO0(onConfirmClick, warnText, i3, value, str, num)));
        }
        numValueOf = Integer.valueOf(R.drawable.bg_wear_crazy_nonsense);
        num = numValueOf;
        String warnText2 = activity.getString(R.string.cost) + " yyy " + activity.getString(R.string.golds);
        if (num == null) {
            value = null;
            str = null;
        } else if (i == 1) {
            value = oooOOO.OooO0oo().getValue();
            str = dataBean.picurl;
        } else {
            value = dataBean.picurl;
            str = null;
        }
        Function1 onConfirmClick2 = new Function1(dataBean, layoutPosition) { // from class: o0oOo00.OooOOO

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ SkillCardListModel.DataBean f45122Oooo0oO;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PurchaseSkillCardActivity purchaseSkillCardActivity = this.f45121Oooo0o;
                SkillCardListModel.DataBean dataBean3 = this.f45122Oooo0oO;
                Long l = (Long) obj;
                int i5 = PurchaseSkillCardActivity.f23211Oooooo;
                Objects.requireNonNull(purchaseSkillCardActivity);
                if (dataBean3.lowestVIPLv <= 0 || p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue().getFirst().booleanValue()) {
                    String str2 = dataBean3.shopid;
                    long jLongValue = l.longValue();
                    int i6 = (int) jLongValue;
                    if (jLongValue != i6) {
                        throw new ArithmeticException();
                    }
                    o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                    o0O0O00 o0o0o00 = o00000OO.f32211OooO0o;
                    OooOo oooOo = new OooOo(purchaseSkillCardActivity, App.f11458Oooo0oO);
                    App app = App.f11458Oooo0oO;
                    Map mapOooO00o = OooO0OO.OooO00o();
                    mapOooO00o.put("shopid", str2);
                    mapOooO00o.put("num", i6 + "");
                    o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                    o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32268OoooOoo, mapOooO00o, oooOo);
                } else {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(purchaseSkillCardActivity);
                    oo0ooo0.OooOo0(R.string.VIP_commodity);
                    oo0ooo0.OooOOOo(R.string.Get_Yalla_Premium);
                    oo0ooo0.OooOo0o(new Function0() { // from class: o0oOo00.OooOOO0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = PurchaseSkillCardActivity.f23211Oooooo;
                            Context context = OooO0O0.f20502OooO00o.OooO0O0();
                            if (context == null && (context = o0000O.f2657OooO00o) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            PremiumLevel level = PremiumLevel.Premium1;
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(level, "level");
                            Intent intent = new Intent(context, (Class<?>) PremiumActivity.class);
                            intent.putExtra("VipLevel", level.getValue());
                            context.startActivity(intent);
                            return null;
                        }
                    });
                    oo0ooo0.OooOoO();
                    oo0ooo0.OooOOO0();
                }
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(warnText2, "warnText");
        Intrinsics.checkNotNullParameter(onConfirmClick2, "onConfirmClick");
        activity.showDialog((String) null, o00O0000.OooO0O0(-1474523587, true, new p139o00OOOo0.OooOO0(onConfirmClick2, warnText2, i3, value, str, num)));
    }
}
