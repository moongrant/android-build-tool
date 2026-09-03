package com.code.android.util;

import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {
    public static final boolean OooO00o(@Nullable Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            if (((CharSequence) obj).length() == 0) {
                return true;
            }
        } else {
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                if (((Map) obj).isEmpty()) {
                    return true;
                }
            } else if ((obj instanceof Object[]) && ((Object[]) obj).length == 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooO0O0(@Nullable Object obj) {
        return !OooO00o(obj);
    }
}
