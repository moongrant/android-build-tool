package p051o00000Oo;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oo000o f27069OooO00o;

    public o00Ooo(@NotNull Locale locale, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f27069OooO00o = new oo000o(text, text.length(), locale);
    }
}
