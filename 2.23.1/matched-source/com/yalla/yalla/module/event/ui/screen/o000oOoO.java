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
import p474o0OoooOO.oo0oO0;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f23495OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23496OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23497OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(EventModel eventModel, EventDetailViewModel eventDetailViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.f23495OooO0Oo = eventModel;
        this.f23497OooO0o0 = eventDetailViewModel;
        this.f23496OooO0o = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        int iIntValue;
        long jLongValue;
        boolean zBooleanValue = bool.booleanValue();
        EventModel eventModel = this.f23495OooO0Oo;
        eventModel.setHasSubscribe(zBooleanValue);
        EventDetailScreen.EventSubscribe$lambda$24$lambda$23(this.f23496OooO0o, zBooleanValue);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("roomeventid", String.valueOf(eventModel.getId()));
        EventDetailViewModel eventDetailViewModel = this.f23497OooO0o0;
        if (zBooleanValue) {
            h0.OooO0OO("102009", linkedHashMap);
            UserInfoModel userInfoModel = new UserInfoModel();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            String str = (String) oo0oO0.OooO().getValue();
            String str2 = "";
            if (str == null) {
                str = "";
            } else {
                Intrinsics.checkNotNull(str);
            }
            userInfoModel.setUserHeader(str);
            String str3 = (String) oo0oO0.OooOOoo().getValue();
            if (str3 != null) {
                Intrinsics.checkNotNull(str3);
                str2 = str3;
            }
            userInfoModel.setUserName(str2);
            Integer num = (Integer) oo0oO0.OooOOO().getValue();
            if (num == null) {
                iIntValue = 2;
            } else {
                Intrinsics.checkNotNull(num);
                iIntValue = num.intValue();
            }
            userInfoModel.setSex(iIntValue);
            Pair pair = (Pair) oo0oO0.OooOO0o().getValue();
            userInfoModel.setPremium(pair != null ? ((Boolean) pair.getFirst()).booleanValue() : false);
            Pair pair2 = (Pair) oo0oO0.OooOO0o().getValue();
            userInfoModel.setPremiumLevel(pair2 != null ? ((Number) pair2.getSecond()).intValue() : PremiumLevel.Premium0.getValue());
            Pair pair3 = (Pair) oo0oO0.OooOO0().getValue();
            userInfoModel.setVipState(pair3 != null ? ((Number) pair3.getFirst()).intValue() : VipState.NotVip.getValue());
            Pair pair4 = (Pair) oo0oO0.OooOO0().getValue();
            userInfoModel.setVipLevel(pair4 != null ? ((Number) pair4.getSecond()).intValue() : VipLevel.Vip0.getValue());
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            if (l == null) {
                jLongValue = 0;
            } else {
                Intrinsics.checkNotNull(l);
                jLongValue = l.longValue();
            }
            userInfoModel.setUserId(jLongValue);
            eventDetailViewModel.getGetSubsPage().f38492OooO0Oo.add(0, userInfoModel);
        } else {
            h0.OooO0OO("102010", linkedHashMap);
            CollectionsKt.removeAll((List) eventDetailViewModel.getGetSubsPage().f38492OooO0Oo, (Function1) Oooo0.f23432OooO0Oo);
        }
        eventDetailViewModel.getGetSubsPage().OooO0O0();
        return Unit.INSTANCE;
    }
}
