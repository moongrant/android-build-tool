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
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p136o00OOOo0.OooO0OO f26965OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26966OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(p136o00OOOo0.OooO0OO oooO0OO, RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26965OooO0Oo = oooO0OO;
        this.f26966OooO0o0 = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        if (apiResult.isSuccess()) {
            MutableLiveData<String> mutableLiveData = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f24998OooO00o;
            p136o00OOOo0.OooO0OO oooO0OO = this.f26965OooO0Oo;
            mutableLiveData.postValue(oooO0OO.OooO00o());
            LiveEventBus.get("RoomHeaderUrl").post(oooO0OO.OooO00o());
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.OK);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            RoomSettingActivity roomSettingActivity = this.f26966OooO0o0;
            roomSettingActivity.setResult(-1);
            roomSettingActivity.OooOo().notifyItemChanged(0);
        }
        return Unit.INSTANCE;
    }
}
