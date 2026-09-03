package com.yalla.yalla.module.event.ui.screen;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f23954OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23955OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23956OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(EventModel eventModel, EventDetailViewModel eventDetailViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.f23954OooO0Oo = eventModel;
        this.f23956OooO0o0 = eventDetailViewModel;
        this.f23955OooO0o = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        int iIntValue;
        long jLongValue;
        boolean zBooleanValue = bool.booleanValue();
        EventModel eventModel = this.f23954OooO0Oo;
        eventModel.setHasSubscribe(zBooleanValue);
        EventDetailScreen.EventSubscribe$lambda$23$lambda$22(this.f23955OooO0o, zBooleanValue);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("roomeventid", String.valueOf(eventModel.getId()));
        EventDetailViewModel eventDetailViewModel = this.f23956OooO0o0;
        if (zBooleanValue) {
            o0OO000.OooO0O0("102009", linkedHashMap);
            UserInfoModel userInfoModel = new UserInfoModel();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            String str = (String) p464o0Oooo.o000000O.OooO().getValue();
            String str2 = "";
            if (str == null) {
                str = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(str, "Account.headerUrl.value ?: \"\"");
            }
            userInfoModel.setUserHeader(str);
            String str3 = (String) p464o0Oooo.o000000O.OooOOoo().getValue();
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(str3, "Account.userName.value ?: \"\"");
                str2 = str3;
            }
            userInfoModel.setUserName(str2);
            Integer num = (Integer) p464o0Oooo.o000000O.OooOOO().getValue();
            if (num == null) {
                iIntValue = 2;
            } else {
                Intrinsics.checkNotNullExpressionValue(num, "Account.sex.value ?: AppConstant.SEX_N_A");
                iIntValue = num.intValue();
            }
            userInfoModel.setSex(iIntValue);
            Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
            userInfoModel.setPremium(pair != null ? ((Boolean) pair.getFirst()).booleanValue() : false);
            Pair pair2 = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
            userInfoModel.setPremiumLevel(pair2 != null ? ((Number) pair2.getSecond()).intValue() : PremiumLevel.Premium0.getValue());
            Pair pair3 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
            userInfoModel.setVipState(pair3 != null ? ((Number) pair3.getFirst()).intValue() : VipState.NotVip.getValue());
            Pair pair4 = (Pair) p464o0Oooo.o000000O.OooOO0().getValue();
            userInfoModel.setVipLevel(pair4 != null ? ((Number) pair4.getSecond()).intValue() : VipLevel.Vip0.getValue());
            Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            if (l == null) {
                jLongValue = 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(l, "Account.userId.value ?: 0");
                jLongValue = l.longValue();
            }
            userInfoModel.setUserId(jLongValue);
            eventDetailViewModel.getGetSubsPage().f37663OooO0Oo.add(0, userInfoModel);
        } else {
            o0OO000.OooO0O0("102010", linkedHashMap);
            CollectionsKt.removeAll((List) eventDetailViewModel.getGetSubsPage().f37663OooO0Oo, (Function1) Oooo0.f23883OooO0Oo);
        }
        eventDetailViewModel.getGetSubsPage().OooO0O0();
        return Unit.INSTANCE;
    }
}
