package com.app.base.mixedroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p142o00OOooO.o000O00O;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.o00O0;
import p255o00ooO0o.oo0oOO0;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;
import p561o0oOOooo.oO00o00;
import p561o0oOOooo.oO00o00O;
import p561o0oOOooo.oO0OO00o;
import p561o0oOOooo.oO0OOO00;
import p561o0oOOooo.oOo000Oo;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomMicView f11839Oooo;

    public OooO00o(MixedRoomMicView mixedRoomMicView) {
        this.f11839Oooo = mixedRoomMicView;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        MixedRoomMicView.OooO0OO oooO0OO;
        MixedRoomMicView mixedRoomMicView = this.f11839Oooo;
        int i = mixedRoomMicView.f11810Oooo0oO;
        if (i == -1 || (oooO0OO = mixedRoomMicView.f11819OoooOo0) == null) {
            return;
        }
        int i2 = mixedRoomMicView.f11811Oooo0oo;
        oOo000Oo this$0 = (oOo000Oo) ((o000O00O) oooO0OO).f31945OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (i2 == 1) {
                o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
                Integer value = oooO00o.OooO00o().f43329OooOOOO.getValue();
                if (value != null && value.intValue() == 1) {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(this$0.f44365OooO00o);
                    oo0ooo0.OooOo0(R.string.tip_unlock_mic);
                    oo0ooo0.OooOoOO(true);
                    oo0ooo0.OooOo0o(new oO00o00(this$0, i));
                    oo0ooo0.OooOOO0();
                    return;
                }
                if (value != null && value.intValue() == 2) {
                    if (Intrinsics.areEqual(oooO00o.OooO00o().f43349Oooo00O.getValue(), Boolean.TRUE)) {
                        oo0oOO0 oo0ooo1 = new oo0oOO0(this$0.f44365OooO00o);
                        oo0ooo1.OooOo0(R.string.tip_unlock_mic);
                        oo0ooo1.OooOoOO(true);
                        oo0ooo1.OooOo0o(new oO0OOO00(this$0, i));
                        oo0ooo1.OooOOO0();
                        return;
                    }
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.mic_locked_by_ower);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o0O0ooO runnable = new o0O0ooO(toastUtil, strOooO0OO);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable.run();
                        return;
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(runnable);
                        return;
                    }
                }
                String strOooO0OO2 = o000O0O0.OooO0OO(R.string.mic_locked_by_ower);
                ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                    return;
                }
                o0O0ooO runnable2 = new o0O0ooO(toastUtil2, strOooO0OO2);
                Intrinsics.checkNotNullParameter(runnable2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    runnable2.run();
                    return;
                } else {
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(runnable2);
                    return;
                }
            }
            if (i2 == 2) {
                if (p159o00OoOO.o000O00O.OooO().f32431OoooO.get(i).user != null) {
                    Long value2 = OooOOO.f41216OooO00o.OooOo().getValue();
                    long userId = p159o00OoOO.o000O00O.OooO().f32431OoooO.get(i).user.getUserId();
                    if (value2 != null && value2.longValue() == userId) {
                        o00O0 o00o1 = new o00O0(this$0.f44923OooO0O0);
                        o00o1.OooOOO(o000O0O0.OooO0OO(R.string.Room_Dialog_leave_mic));
                        o00o1.OooOOO(o000O0O0.OooO0OO(R.string.Room_Dialog_open_profile));
                        o00o1.OooOOoo(oO00o00O.f44914Oooo0o);
                        o00o1.OooOOO0();
                        return;
                    }
                }
                RoomUserInfoModel roomUserInfoModel = p159o00OoOO.o000O00O.OooO().f32431OoooO.get(i).user;
                Intrinsics.checkNotNullExpressionValue(roomUserInfoModel, "MixedRoomDataSource.getI…icListInfo[position].user");
                Objects.requireNonNull(this$0);
                o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(roomUserInfoModel);
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                String strOooO0OO3 = o000O0O0.OooO0OO(R.string.mic_lock_click_tip);
                ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                if (strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) {
                    return;
                }
                o0O0ooO runnable3 = new o0O0ooO(toastUtil3, strOooO0OO3);
                Intrinsics.checkNotNullParameter(runnable3, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    runnable3.run();
                    return;
                } else {
                    o00O000 o00o003 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(runnable3);
                    return;
                }
            }
            this$0.OooO0Oo(true);
            if (o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue() == null) {
                return;
            }
            oO0OO00o onLogin = new oO0OO00o(this$0, i);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity context = o00000O.f34254OooO00o.OooO0O0();
            if (context != null) {
                LoginActivity.OooO00o oooO00o2 = LoginActivity.f21752OooooO0;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
