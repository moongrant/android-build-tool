package p590o0oOooo0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0O00 {
    @NotNull
    public static final Locale OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = LocaleList.getDefault().get(0);
            Intrinsics.checkNotNull(locale);
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNull(locale2);
        return locale2;
    }
}
