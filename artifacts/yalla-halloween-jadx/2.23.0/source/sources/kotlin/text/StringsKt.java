package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {1, 8, 0}, xi = 49)
public final class StringsKt extends StringsKt___StringsKt {
    private StringsKt() {
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static /* bridge */ /* synthetic */ String OooO0OO(@NotNull char[] cArr, int i) {
        return StringsKt__StringsJVMKt.concatToString(cArr, i, 8);
    }

    public static /* bridge */ /* synthetic */ boolean OooO0o(CharSequence charSequence, CharSequence charSequence2) {
        return StringsKt__StringsKt.contains$default(charSequence, charSequence2, false, 2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean OooOO0O(String str, String str2) {
        return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ boolean OooOO0o(@Nullable String str, @Nullable String str2) {
        return StringsKt__StringsJVMKt.equals(str, str2, true);
    }

    public static /* bridge */ /* synthetic */ String OooOoO(String str, String str2, String str3) {
        return StringsKt__StringsJVMKt.replace$default(str, str2, str3, false, 4, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean Oooo00o(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
    }
}
