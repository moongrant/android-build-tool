package p168o00Ooo0;

import android.text.TextUtils;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import java.util.ArrayList;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {
    public static ArrayList<ImageView9GridModel> OooO00o(String str, String str2, String str3) {
        ArrayList<ImageView9GridModel> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (str2.contains("|") && str3.contains("|")) {
                String[] strArrSplit = str2.split("\\|");
                String[] strArrSplit2 = str3.split("\\|");
                if (strArrSplit.length == strArrSplit2.length) {
                    for (int i = 0; i < strArrSplit.length; i++) {
                        String str4 = strArrSplit[i];
                        arrayList.add(new ImageView9GridModel(OooOo00.OooO0Oo(str, str4)).setSize(strArrSplit2[i]));
                    }
                }
            } else {
                arrayList.add(new ImageView9GridModel(OooOo00.OooO0Oo(str, str2)).setSize(str3));
            }
        }
        return arrayList;
    }
}
