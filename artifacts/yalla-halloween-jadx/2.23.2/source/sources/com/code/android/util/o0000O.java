package com.code.android.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final List<String> f13414OooO00o = CollectionsKt.mutableListOf("%s", "xxxx", "xxx1", "xxx2", "xxx3", "xxx4", "xxx5", "xxx6", "????", "؟؟؟؟", "yyyy", "???", "؟؟؟", "xxx", "xx1", "xx2", "yyy", "xx", "yy");

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
                for (String str3 : f13414OooO00o) {
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

    @NotNull
    public static final String OooO0O0(long j) {
        long j2 = j / ((long) 1000);
        long j3 = j2 / ((long) 3600);
        long j4 = 60;
        long j5 = j2 / j4;
        long j6 = j2 % j4;
        long j7 = j5 % j4;
        if (j3 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return OooO0O0.OooO0O0.OooO00o(new Object[]{Long.valueOf(j3), Long.valueOf(j7), Long.valueOf(j6)}, 3, "%02d:%02d:%02d", "format(format, *args)");
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return OooO0O0.OooO0O0.OooO00o(new Object[]{Long.valueOf(j7), Long.valueOf(j6)}, 2, "%02d:%02d", "format(format, *args)");
    }

    @NotNull
    public static final String OooO0OO(int i) {
        int i2 = i / 3600;
        int i3 = i / 60;
        int i4 = i % 60;
        int i5 = i3 % 60;
        if (i2 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return OooO0O0.OooO0O0.OooO00o(new Object[]{Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i4)}, 3, "%02d:%02d:%02d", "format(format, *args)");
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return OooO0O0.OooO0O0.OooO00o(new Object[]{Integer.valueOf(i5), Integer.valueOf(i4)}, 2, "%02d:%02d", "format(format, *args)");
    }
}
