package p418o0Oo0oo;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000oOoO f39721OooO00o = new o000oOoO();

    @DoNotInline
    public final long OooO00o(@NotNull MotionEvent motionEvent, int i) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        return OooOO0.OooO00o(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
