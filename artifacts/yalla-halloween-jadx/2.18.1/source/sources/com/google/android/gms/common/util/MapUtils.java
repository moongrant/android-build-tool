package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import p023Oooo00O.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb, @NonNull HashMap<String, String> map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = map.get(str);
            o00O0.OooO0OO(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                o00O0.OooO0OO(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
