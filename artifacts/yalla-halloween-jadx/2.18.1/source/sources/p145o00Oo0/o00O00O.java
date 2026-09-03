package p145o00Oo0;

import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O00O f32135OooO00o = new o00O00O();

    @DoNotInline
    public final void OooO00o(@NotNull Paint paint, int i) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setBlendMode(OooOOO0.OooO00o(i));
    }
}
