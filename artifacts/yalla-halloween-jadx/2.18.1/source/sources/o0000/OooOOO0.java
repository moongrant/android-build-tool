package o0000;

import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOO0O f26569OooO00o;

    static {
        f26569OooO00o = Build.VERSION.SDK_INT >= 24 ? new OooO0OO() : new OooO0O0();
    }
}
