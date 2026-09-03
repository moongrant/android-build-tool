package o00OO00O;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-Contexts")
public final class OooO0OO {
    @NotNull
    public static final Drawable OooO00o(@DrawableRes int i, @NotNull Context context) {
        Drawable drawableOooO00o = p013OooOo0o.o00Oo0.OooO00o(context, i);
        if (drawableOooO00o != null) {
            return drawableOooO00o;
        }
        throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Invalid resource ID: ", i).toString());
    }
}
