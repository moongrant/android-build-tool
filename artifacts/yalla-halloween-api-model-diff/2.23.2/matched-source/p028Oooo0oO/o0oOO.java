package p028Oooo0oO;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooOO0;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import io.agora.rtc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p205o00o0o0o.o000O;
import p391o0OOooo0.o0OO00O;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0oOO implements OooOO0, o0OO00O.OooO0O0 {
    public static String OooO0O0(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.firebase.components.OooOO0
    public List OooO00o(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // o0OOooo0.o0OO00O.OooO0O0
    public void OooO0OO(ApiErrorCodeDB apiErrorCodeDB) {
        int iOooO0o0 = o000000.OooO0o0(apiErrorCodeDB.Code);
        if (iOooO0o0 != 1007 && iOooO0o0 != 1058 && iOooO0o0 != 2045 && iOooO0o0 != 2048 && iOooO0o0 != 2058 && iOooO0o0 != 2083 && iOooO0o0 != 2074 && iOooO0o0 != 2075 && iOooO0o0 != 4002 && iOooO0o0 != 4003) {
            switch (iOooO0o0) {
                case 1003:
                    o0O000 o0o001 = o0O000.f47005OooO00o;
                    String messge = apiErrorCodeDB.getMessge();
                    Intrinsics.checkNotNullExpressionValue(messge, "getMessge(...)");
                    o0o001.OooO0OO(new o0O0o(o0O0o.Other_Device_Login, messge));
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
                                                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(messge2, "runnable");
                                                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
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
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o000O o000o = new o000O(activityOooO0O0);
            o000o.OooOo00(messge3);
            o000o.OooOO0o();
        }
    }
}
