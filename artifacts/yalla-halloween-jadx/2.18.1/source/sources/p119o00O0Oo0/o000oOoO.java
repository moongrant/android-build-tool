package p119o00O0Oo0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p012OooOo0.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "-Contexts")
public final class o000oOoO {
    @NotNull
    public static final Drawable OooO00o(@NotNull Context context, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable drawableOooO0O0 = OooOO0O.OooO0O0(context, i);
        if (drawableOooO0O0 != null) {
            return drawableOooO0O0;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Invalid resource ID: ", Integer.valueOf(i)).toString());
    }
}
