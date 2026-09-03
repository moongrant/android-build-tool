package o00000OO;

import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f27034OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOo f27035OooO0O0;

    static {
        f27035OooO0O0 = Build.VERSION.SDK_INT >= 23 ? new OooOOO0() : new Oooo000();
    }
}
