package p522o0o0O0o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f42985OooO00o = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f42986OooO0O0 = Resources.getSystem().getDisplayMetrics().heightPixels;

    @NotNull
    public static final Drawable OooO00o(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable drawable = context.getDrawable(i);
        Intrinsics.checkNotNull(drawable);
        Intrinsics.checkNotNullExpressionValue(drawable, "{\n        getDrawable(resourceId)!!\n    }");
        return drawable;
    }

    public static final int OooO0O0() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    @NotNull
    public static final Uri OooO0OO(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + '/' + i);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(\"android.resource:…packageName/$resourceId\")");
        return uri;
    }
}
