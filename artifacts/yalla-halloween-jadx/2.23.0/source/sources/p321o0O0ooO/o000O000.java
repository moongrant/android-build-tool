package p321o0O0ooO;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.OooO00o;
import androidx.annotation.DrawableRes;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import p013OooOo0o.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-Contexts")
public final class o000O000 {
    @NotNull
    public static final Drawable OooO00o(@DrawableRes int i, @NotNull Context context) {
        Drawable drawableOooO00o = o00Oo0.OooO00o(context, i);
        if (drawableOooO00o != null) {
            return drawableOooO00o;
        }
        throw new IllegalStateException(OooO00o.OooO00o("Invalid resource ID: ", i).toString());
    }
}
