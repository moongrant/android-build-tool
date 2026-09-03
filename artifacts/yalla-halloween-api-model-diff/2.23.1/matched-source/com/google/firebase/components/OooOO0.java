package com.google.firebase.components;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.code.android.util.o000000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import io.agora.rtc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p205o00o0o0o.o000O;
import p393o0OOooo0.o0Oo0oo;
import p437o0OoOOOo.o0O00000;
import p437o0OoOOOo.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements OooOO0O, o0Oo0oo.OooO0O0 {
    @Override // com.google.firebase.components.OooOO0O
    public final List OooO00o(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // o0OOooo0.o0Oo0oo.OooO0O0
    public final void OooO0O0(ApiErrorCodeDB apiErrorCodeDB) {
        int iOooO0o0 = o000000.OooO0o0(apiErrorCodeDB.Code);
        if (iOooO0o0 != 1007 && iOooO0o0 != 1058 && iOooO0o0 != 2045 && iOooO0o0 != 2048 && iOooO0o0 != 2058 && iOooO0o0 != 2083 && iOooO0o0 != 2074 && iOooO0o0 != 2075 && iOooO0o0 != 4002 && iOooO0o0 != 4003) {
            switch (iOooO0o0) {
                case 1003:
                    o0OoOoOo o0oooooo = o0OoOoOo.f47016OooO00o;
                    String messge = apiErrorCodeDB.getMessge();
                    Intrinsics.checkNotNullExpressionValue(messge, "getMessge(...)");
                    o0oooooo.OooO0OO(new o0O00000(o0O00000.Other_Device_Login, messge));
                    return;
                case 1004:
                case 1005:
                    break;
                default:
                    switch (iOooO0o0) {
                        case 2053:
                        case 2054:
                        case 2055:
                            break;
                        default:
                            switch (iOooO0o0) {
                                case Constants.LOG_FILTER_DEBUG /* 2063 */:
                                case 2064:
                                case 2065:
                                case 2066:
                                case 2067:
                                case 2068:
                                    break;
                                default:
                                    switch (iOooO0o0) {
                                        case 2086:
                                        case 2087:
                                        case 2088:
                                        case 2089:
                                            break;
                                        default:
                                            String messge2 = apiErrorCodeDB.getMessge();
                                            if (!(messge2 == null || StringsKt.isBlank(messge2))) {
                                                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(messge2, "runnable");
                                                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                    o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                                                } else {
                                                    o000oo0OooO00o.run();
                                                }
                                                break;
                                            }
                                            break;
                                    }
                            }
                            break;
                    }
                    break;
            }
        }
        String messge3 = apiErrorCodeDB.getMessge();
        Intrinsics.checkNotNullExpressionValue(messge3, "getMessge(...)");
        Context context = o000O00O.f13430OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o000O o000o = new o000O(activityOooO0O0);
            o000o.OooOo00(messge3);
            o000o.OooOO0o();
        }
    }
}
