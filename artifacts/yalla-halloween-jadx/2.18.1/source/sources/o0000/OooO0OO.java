package o0000;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 24)
public final class OooO0OO implements OooOO0O {
    @Override // o0000.OooOO0O
    @NotNull
    public final List<OooOO0> OooO00o() {
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            Locale locale = localeList.get(i);
            Intrinsics.checkNotNullExpressionValue(locale, "localeList[i]");
            arrayList.add(new OooO00o(locale));
        }
        return arrayList;
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
