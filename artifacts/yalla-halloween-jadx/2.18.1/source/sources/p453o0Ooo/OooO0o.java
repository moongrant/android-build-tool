package p453o0Ooo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {
    @NotNull
    public static final List OooO00o(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        OooOO0 oooOO1 = OooOO0.f40347OooO00o;
        Matcher matcher = OooOO0.f40352OooO0o0.matcher(text);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group();
            Intrinsics.checkNotNullExpressionValue(group, "group");
            if (OooO0O0(group) != null) {
                arrayList.add(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())));
            }
        }
        return arrayList;
    }

    public static final String OooO0O0(String str) {
        OooOO0 oooOO1 = OooOO0.f40347OooO00o;
        return OooOO0.OooO0O0(StringsKt.removeSuffix(str, (CharSequence) "_"));
    }
}
