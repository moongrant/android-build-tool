package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final String[] AFInAppEventType;

    public interface d {
        void valueOf(String str);

        void valueOf(@Nullable String str, @Nullable String str2, @Nullable String str3);
    }

    public o() {
    }

    public o(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFInAppEventType = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.AppsFlyer2dXConversionCallback("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase());
            }
        }
        if (arrayList.contains("all")) {
            this.AFInAppEventType = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.AFInAppEventType = null;
        } else {
            this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
