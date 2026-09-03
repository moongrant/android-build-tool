package p617o0oo0o;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 {
    @NotNull
    public static final Locale OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = LocaleList.getDefault().get(0);
            Intrinsics.checkNotNullExpressionValue(locale, "{\n        LocaleList.getDefault()[0]\n    }");
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "{\n        Locale.getDefault()\n    }");
        return locale2;
    }
}
