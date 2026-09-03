package com.yalla.yalla.ui.screen.event;

import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventDetailViewModel;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p522o0o0O0o.o000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f24669Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f24670Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f24671Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(EventModel eventModel, EventDetailViewModel eventDetailViewModel, o0O00OO<Boolean> o0o00oo2) {
        super(1);
        this.f24669Oooo0o = eventModel;
        this.f24670Oooo0oO = eventDetailViewModel;
        this.f24671Oooo0oo = o0o00oo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        int iIntValue;
        long jLongValue;
        boolean zBooleanValue = bool.booleanValue();
        this.f24669Oooo0o.setHasSubscribe(zBooleanValue);
        this.f24671Oooo0oo.setValue(Boolean.valueOf(zBooleanValue));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("roomeventid", String.valueOf(this.f24669Oooo0o.getId()));
        if (zBooleanValue) {
            p606o0oo0O.OooOo.OooO0OO("102009", linkedHashMap);
            UserInfoModel userInfoModel = new UserInfoModel();
            EventDetailViewModel eventDetailViewModel = this.f24670Oooo0oO;
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            String value = oooOOO.OooO0oo().getValue();
            String str = "";
            if (value == null) {
                value = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(value, "Account.headerUrl.value ?: \"\"");
            }
            userInfoModel.setUserHeader(value);
            String value2 = oooOOO.OooOoO().getValue();
            if (value2 != null) {
                Intrinsics.checkNotNullExpressionValue(value2, "Account.userName.value ?: \"\"");
                str = value2;
            }
            userInfoModel.setUserName(str);
            Integer value3 = oooOOO.OooOOOo().getValue();
            if (value3 == null) {
                iIntValue = 2;
            } else {
                Intrinsics.checkNotNullExpressionValue(value3, "Account.sex.value ?: AppConstant.SEX_N_A");
                iIntValue = value3.intValue();
            }
            userInfoModel.setSex(iIntValue);
            Pair<Boolean, Integer> value4 = oooOOO.OooOOO0().getValue();
            userInfoModel.setPremium(value4 != null ? value4.getFirst().booleanValue() : false);
            Pair<Boolean, Integer> value5 = oooOOO.OooOOO0().getValue();
            userInfoModel.setPremiumLevel(value5 != null ? value5.getSecond().intValue() : PremiumLevel.Premium0.getValue());
            Pair<Integer, Integer> value6 = oooOOO.OooO().getValue();
            userInfoModel.setVipState(value6 != null ? value6.getFirst().intValue() : VipState.NotVip.getValue());
            Pair<Integer, Integer> value7 = oooOOO.OooO().getValue();
            userInfoModel.setVipLevel(value7 != null ? value7.getSecond().intValue() : VipLevel.Vip0.getValue());
            Long value8 = oooOOO.OooOo().getValue();
            if (value8 == null) {
                jLongValue = 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(value8, "Account.userId.value ?: 0");
                jLongValue = value8.longValue();
            }
            userInfoModel.setUserId(jLongValue);
            eventDetailViewModel.getGetSubsPage().f48682OooO0Oo.add(0, (T) userInfoModel);
        } else {
            p606o0oo0O.OooOo.OooO0OO("102010", linkedHashMap);
            o000O0.OooO0OO(this.f24670Oooo0oO.getGetSubsPage().f48682OooO0Oo, OooOOO0.f24672Oooo0o);
        }
        this.f24670Oooo0oO.getGetSubsPage().OooO0O0();
        return Unit.INSTANCE;
    }
}
