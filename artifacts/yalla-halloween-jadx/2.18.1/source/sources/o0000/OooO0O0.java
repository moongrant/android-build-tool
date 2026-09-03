package o0000;

import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements OooOO0O {
    @Override // o0000.OooOO0O
    @NotNull
    public final List<OooOO0> OooO00o() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return CollectionsKt.listOf(new OooO00o(locale));
    }

    @Override // o0000.OooOO0O
    @NotNull
    public final OooOO0 OooO0O0(@NotNull String languageTag) {
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(languageTag)");
        return new OooO00o(localeForLanguageTag);
    }
}
