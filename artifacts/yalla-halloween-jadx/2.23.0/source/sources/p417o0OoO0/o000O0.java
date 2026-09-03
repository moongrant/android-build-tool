package p417o0OoO0;

import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 {
    @ColorInt
    public static final int OooO00o(@ColorRes int i, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getContext().getColor(i);
    }

    @NotNull
    public static final String OooO0O0(@StringRes int i, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        String string = view.getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "{\n        context.getString(resourceId)\n    }");
        return string;
    }
}
