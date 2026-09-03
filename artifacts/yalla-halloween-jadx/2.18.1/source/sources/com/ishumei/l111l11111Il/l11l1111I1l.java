package com.ishumei.l111l11111Il;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l11l1111I1l {
    public static HashMap<String, String> l1111l111111Il() {
        HashMap<String, String> map = new HashMap<>();
        try {
            Class<?> clsLoadClass = Context.class.getClassLoader().loadClass(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd1908cd1ac868c8b9a92af8d908f9a8d8b969a8c"));
            Method method = clsLoadClass.getMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8b"), String.class);
            method.setAccessible(true);
            String[] strArr = {com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d90d19b9a9d8a98989e9d939a"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d90d19d90908bd1979e8d9b889e8d9a"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c868cd18a8c9dd18c8b9e8b9a"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d90d18d9693d1909a92d18c9190"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d90d18d9693d1909a92d18f8c9190"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d90d18d8f929dd19d909e8d9b"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c868cd18c9a8d969e939190"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d90d19d90908bd18c9a9c8a8d9a9d90908b949a86979e8c97"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8f9a8d8c968c8bd18c868cd18c979088d19b9a89969c9ad196929a96"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("988c92d18c9a8d969e93"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8f9a8d8c968c8bd18d9e9b9690d18c9a8d969e939190")};
            for (int i = 0; i < 11; i++) {
                String str = strArr[i];
                String str2 = (String) method.invoke(clsLoadClass, str);
                if (str2 != null && !str2.isEmpty()) {
                    map.put(str, str2);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }
}
