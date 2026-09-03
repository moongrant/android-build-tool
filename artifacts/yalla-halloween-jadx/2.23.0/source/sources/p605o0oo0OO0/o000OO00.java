package p605o0oo0OO0;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@JvmName(name = "StringUtil")
public final class o000OO00 {
    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull String... str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        CharSequence[] str3 = (CharSequence[]) Arrays.copyOf(str2, str2.length);
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str3, "str");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = str3.length;
        if (length != 0) {
            if (length != 1) {
                int i = 0;
                for (CharSequence charSequence : str3) {
                    i++;
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) spannableStringBuilder, "XXX", 0, false, 6, (Object) null);
                    if (iIndexOf$default >= 0) {
                        spannableStringBuilder.replace(iIndexOf$default, Intrinsics.stringPlus("XXX", Integer.valueOf(i)).length() + iIndexOf$default, charSequence);
                    }
                }
            } else {
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) spannableStringBuilder, "XXX", 0, false, 6, (Object) null);
                if (iIndexOf$default2 >= 0) {
                    spannableStringBuilder.replace(iIndexOf$default2, iIndexOf$default2 + 3, (CharSequence) ArraysKt.first(str3));
                }
            }
        }
        return new SpannedString(spannableStringBuilder).toString();
    }
}
