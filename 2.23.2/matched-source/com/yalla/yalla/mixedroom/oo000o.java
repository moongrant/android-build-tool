package com.yalla.yalla.mixedroom;

import android.app.Activity;
import android.content.Intent;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo000o implements Function1 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23078OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23079OooO0o0;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f23078OooO0Oo = i;
        this.f23079OooO0o0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f23078OooO0Oo;
        Object obj2 = this.f23079OooO0o0;
        switch (i) {
            case 0:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                final Integer num = (Integer) obj;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                mixedRoomActivity.getClass();
                Function0 onLogin = new Function0() { // from class: com.yalla.yalla.mixedroom.o0O0O00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = MixedRoomActivity.f22956OoooO0O;
                        final MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        mixedRoomActivity2.getClass();
                        Integer num2 = num;
                        if (num2.intValue() >= mixedRoomActivity2.f22968OooOoo.f50854OooO0o0.size()) {
                            return null;
                        }
                        final EventModel eventModel = mixedRoomActivity2.f22968OooOoo.f50854OooO0o0.get(num2.intValue()).getEventModel();
                        if (!eventModel.getHasSubscribe()) {
                            p569o0oOo0o0.o00000OO.f56399OooO0O0.OooO0Oo(mixedRoomActivity2, eventModel, new Function1() { // from class: com.yalla.yalla.mixedroom.o000OOo
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i4 = MixedRoomActivity.f22956OoooO0O;
                                    MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity2;
                                    mixedRoomActivity3.getClass();
                                    eventModel.setHasSubscribe(((Boolean) obj3).booleanValue());
                                    mixedRoomActivity3.f22968OooOoo.notifyDataSetChanged();
                                    return null;
                                }
                            });
                            return null;
                        }
                        o000O o000o = new o000O(mixedRoomActivity2);
                        o000o.OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.event_unSubscribe_content));
                        o000o.OooOo(true);
                        o000o.OooOOOO(p562o0oOo000.o000000.event_unSubscribe_confirm);
                        o000o.OooOo0(new o000OO(mixedRoomActivity2, eventModel));
                        o000o.OooOO0o();
                        return null;
                    }
                };
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (!Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    Activity context = com.code.android.util.OooO0O0.OooO0O0();
                    if (context != null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
                    }
                } else {
                    onLogin.invoke();
                }
                break;
            default:
                ((MomentSendModel) obj2).setType(((MomentType) obj).getValue());
                break;
        }
        return null;
    }
}
