package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.model.moment.MomentImageModel;
import java.util.ArrayList;
import p642o0ooOOo.o0OO0o00;
import p642o0ooOOo.o0OOo000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000Oo0 {
    public static String OooO00o(String str, String str2) {
        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(str, "");
        if (TextUtils.isEmpty(strOooO00o)) {
            return strOooO00o;
        }
        if (strOooO00o.contains("%s")) {
            return OooO0Oo(strOooO00o, "%s", str2);
        }
        if (strOooO00o.contains("xxxx")) {
            return OooO0Oo(strOooO00o, "xxxx", str2);
        }
        if (strOooO00o.contains("XXXX")) {
            return OooO0Oo(strOooO00o, "XXXX", str2);
        }
        if (strOooO00o.contains("xxx")) {
            return OooO0Oo(strOooO00o, "xxx", str2);
        }
        if (strOooO00o.contains("XXX")) {
            return OooO0Oo(strOooO00o, "XXX", str2);
        }
        if (strOooO00o.contains("؟؟؟؟")) {
            return OooO0Oo(strOooO00o, "؟؟؟؟", str2);
        }
        if (strOooO00o.contains("؟؟؟")) {
            return OooO0Oo(strOooO00o, "؟؟؟", str2);
        }
        if (strOooO00o.contains("yyyy")) {
            return OooO0Oo(strOooO00o, "yyyy", str2);
        }
        if (strOooO00o.contains("YYYY")) {
            return OooO0Oo(strOooO00o, "YYYY", str2);
        }
        if (strOooO00o.contains("yyy")) {
            return OooO0Oo(strOooO00o, "yyy", str2);
        }
        if (strOooO00o.contains("YYY")) {
            return OooO0Oo(strOooO00o, "YYY", str2);
        }
        if (strOooO00o.contains("XX")) {
            return OooO0Oo(strOooO00o, "XX", str2);
        }
        if (strOooO00o.contains("xx")) {
            return OooO0Oo(strOooO00o, "xx", str2);
        }
        if (strOooO00o.contains("X")) {
            return OooO0Oo(strOooO00o, "X", str2);
        }
        return strOooO00o.contains("x") ? OooO0Oo(strOooO00o, "x", str2) : strOooO00o;
    }

    public static ArrayList OooO0O0(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (str2.contains("|") && str3.contains("|")) {
                String[] strArrSplit = str2.split("\\|");
                String[] strArrSplit2 = str3.split("\\|");
                if (strArrSplit.length == strArrSplit2.length) {
                    for (int i = 0; i < strArrSplit.length; i++) {
                        String str4 = strArrSplit[i];
                        arrayList.add(new MomentImageModel(androidx.camera.core.impl.OooOOOO.OooO00o(str, str4)).setSize(strArrSplit2[i]));
                    }
                }
            } else {
                arrayList.add(new MomentImageModel(androidx.camera.core.impl.OooOOOO.OooO00o(str, str2)).setSize(str3));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void OooO0OO(o0OOo000 o0ooo001, o0OO0o00.OooO0O0 oooO0O0, float f, int i) {
        if ((i & 2) != 0) {
            f = Dp.m3765constructorimpl(0);
        }
        o0ooo001.OooO00o(oooO0O0, f, (i & 4) != 0 ? Dp.m3765constructorimpl(0) : 0.0f);
    }

    public static String OooO0Oo(String str, String str2, String str3) {
        try {
            if (!str.contains(str2)) {
                return str;
            }
            if (str3 == null) {
                str3 = "";
            }
            return str.replaceFirst(str2, str3);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
