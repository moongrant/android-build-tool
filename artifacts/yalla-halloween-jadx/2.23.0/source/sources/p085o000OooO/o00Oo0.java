package p085o000OooO;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import io.agora.rtc.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p157o00OoOO0.o0OO00O;
import p385o0OOooOO.o00O00O;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Oo0 implements o00O00O.OooO0O0 {
    public static void OooO0O0(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3, String str4) {
        supportSQLiteDatabase.execSQL(str);
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
        supportSQLiteDatabase.execSQL(str4);
    }

    @Override // o0OOooOO.o00O00O.OooO0O0
    public void OooO00o(ApiErrorCodeDB apiErrorCodeDB) {
        int iOooO0o0 = o000000.OooO0o0(apiErrorCodeDB.Code);
        if (iOooO0o0 != 1007 && iOooO0o0 != 1058 && iOooO0o0 != 2045 && iOooO0o0 != 2048 && iOooO0o0 != 2058 && iOooO0o0 != 2083 && iOooO0o0 != 2074 && iOooO0o0 != 2075 && iOooO0o0 != 4002 && iOooO0o0 != 4003) {
            switch (iOooO0o0) {
                case 1003:
                    o00O0 o00o1 = o00O0.f45732OooO00o;
                    String messge = apiErrorCodeDB.getMessge();
                    Intrinsics.checkNotNullExpressionValue(messge, "it.messge");
                    o00o1.OooO0OO(new oOO00O(oOO00O.Other_Device_Login, messge));
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
                                                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(messge2, "runnable");
                                                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
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
        Intrinsics.checkNotNullExpressionValue(messge3, "it.messge");
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
            o0oo00o2.OooOo00(messge3);
            o0oo00o2.OooOO0o();
        }
    }
}
