package o0000;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Locale f26566OooO00o;

    public OooO00o(@NotNull Locale javaLocale) {
        Intrinsics.checkNotNullParameter(javaLocale, "javaLocale");
        this.f26566OooO00o = javaLocale;
    }

    @Override // o0000.OooOO0
    @NotNull
    public final String OooO00o() {
        String languageTag = this.f26566OooO00o.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
