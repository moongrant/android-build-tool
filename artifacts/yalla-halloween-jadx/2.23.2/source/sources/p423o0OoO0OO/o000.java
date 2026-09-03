package p423o0OoO0OO;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 {
    @NotNull
    public static final Context OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context contextCreateConfigurationContext = context.createConfigurationContext(new Configuration());
        Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    @NotNull
    public static final Uri OooO0O0(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + "/" + i);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }

    @NotNull
    public static final String OooO0OO(@NotNull Context context, @StringRes int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = context.getString(i);
        Intrinsics.checkNotNull(string);
        return string;
    }
}
