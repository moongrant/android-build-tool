package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class OooO00o extends OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f19749OooO00o = 0;

    static {
        String strConcat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb = new StringBuilder(78);
        sb.append("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + String.valueOf(strConcat).length() + 23);
        sb2.append("[+-]?(?:NaN|Infinity|");
        sb2.append(strConcat);
        sb2.append("|");
        sb2.append(string);
        sb2.append(")");
        Pattern.compile(sb2.toString().replace("#", "+"));
    }
}
