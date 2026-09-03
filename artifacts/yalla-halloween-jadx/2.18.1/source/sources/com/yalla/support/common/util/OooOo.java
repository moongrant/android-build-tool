package com.yalla.support.common.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final List<String> f20507OooO00o = CollectionsKt.mutableListOf("%s", "xxxx", "xxx1", "xxx2", "xxx3", "xxx4", "????", "؟؟؟؟", "yyyy", "???", "؟؟؟", "xxx", "xx1", "xx2", "yyy", "xx", "yy");

    @NotNull
    public static final String OooO00o(@Nullable String str, @NotNull String... strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        if (str == null || str.length() == 0) {
            return "";
        }
        int length = strings.length;
        for (int i = 0; i < length; i++) {
            String str2 = strings[i];
            if (str == null) {
                str = null;
            } else if (str.length() == 0) {
                str = "";
            } else if (!(str2 == null || str2.length() == 0)) {
                for (String str3 : f20507OooO00o) {
                    try {
                        if (StringsKt__StringsKt.contains(str, str3, true)) {
                            str = StringsKt__StringsJVMKt.replaceFirst(str, new Regex(str3).toString(), str2, true);
                            break;
                        }
                        continue;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return str == null ? "" : str;
    }
}
