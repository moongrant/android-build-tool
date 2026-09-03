package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p182o00o000O.OooO0o f26417OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26418OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(p182o00o000O.OooO0o oooO0o, RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26417OooO0Oo = oooO0o;
        this.f26418OooO0o0 = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        if (apiResult.isSuccess()) {
            MutableLiveData<String> mutableLiveData = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24536OooO00o;
            p182o00o000O.OooO0o oooO0o = this.f26417OooO0Oo;
            mutableLiveData.postValue(oooO0o.OooO00o());
            LiveEventBus.get("RoomHeaderUrl").post(oooO0o.OooO00o());
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.OK);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            RoomSettingActivity roomSettingActivity = this.f26418OooO0o0;
            roomSettingActivity.setResult(-1);
            roomSettingActivity.OooOo().notifyItemChanged(0);
        }
        return Unit.INSTANCE;
    }
}
