package p211o00o0oo0;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.core.impl.OooOOOO;
import com.yalla.yalla.model.moment.MomentImageModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 {
    public static ArrayList OooO00o(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (str2.contains("|") && str3.contains("|")) {
                String[] strArrSplit = str2.split("\\|");
                String[] strArrSplit2 = str3.split("\\|");
                if (strArrSplit.length == strArrSplit2.length) {
                    for (int i = 0; i < strArrSplit.length; i++) {
                        String str4 = strArrSplit[i];
                        arrayList.add(new MomentImageModel(OooOOOO.OooO00o(str, str4)).setSize(strArrSplit2[i]));
                    }
                }
            } else {
                arrayList.add(new MomentImageModel(OooOOOO.OooO00o(str, str2)).setSize(str3));
            }
        }
        return arrayList;
    }

    public static boolean OooO0O0(Context context, Intent intent) {
        if (!(!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty())) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
