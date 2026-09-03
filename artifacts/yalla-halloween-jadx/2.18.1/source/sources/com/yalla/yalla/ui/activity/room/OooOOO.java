package com.yalla.yalla.ui.activity.room;

import android.app.Activity;
import android.content.Intent;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.mixedroom.model.RoomConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Activity f22923OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<RoomConfiguration>> {
    }

    public OooOOO(Activity activity) {
        this.f22923OooO00o = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…omConfiguration?>?>() {})");
        RoomConfiguration roomConfiguration = (RoomConfiguration) ((AbsJavaBeanApi) objOooO0OO).data;
        if (roomConfiguration != null) {
            Activity activity = this.f22923OooO00o;
            o00OO00O.f43313OooooOo.OooO00o().f43326OooOO0o.setValue(roomConfiguration);
            Intent intent = new Intent(activity, (Class<?>) RoomSettingActivity.class);
            intent.putExtra("Module", roomConfiguration);
            if (activity != null) {
                activity.startActivityForResult(intent, 104);
            }
        }
    }
}
