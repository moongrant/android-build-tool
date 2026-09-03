package com.ishumei.l111l11111Il;

import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l111l11111Il {
    public static HashMap<String, String> l1111l111111Il(boolean z) {
        String str;
        HashMap<String, String> map = new HashMap<>();
        try {
            String strL111l11111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd1908cd1bd8a96939b");
            Field[] fieldArrL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(strL111l11111Il);
            if (z) {
                try {
                    Object objL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111l1Il.l1111l111111Il(strL111l11111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bac9a8d969e93"));
                    if (objL1111l111111Il != null) {
                        map.put(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c9a8d969e93a0af"), objL1111l111111Il.toString());
                    }
                } catch (Throwable unused) {
                }
                str = "9d909e8d9bd392909b9a93d38c9a8d969e93d39d8d9e919bd3929e918a999e9c8b8a8d9a8dd3999691989a8d8f8d96918bd39c8f8aa09e9d96d39c8f8aa09e9d96cd";
            } else {
                str = "9d909e8d9bd392909b9a93d39d8d9e919bd3929e918a999e9c8b8a8d9a8dd3999691989a8d8f8d96918bd39c8f8aa09e9d96d39c8f8aa09e9d96cd";
            }
            String strL111l11111Il2 = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il(str);
            for (Field field : fieldArrL1111l111111Il) {
                field.setAccessible(true);
                String lowerCase = field.getName().toLowerCase();
                if (strL111l11111Il2.contains(lowerCase)) {
                    map.put(lowerCase, field.get(null).toString());
                }
            }
        } catch (Exception unused2) {
        }
        return map;
    }
}
