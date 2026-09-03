package p053o00000oO;

import android.os.Build;
import androidx.compose.ui.text.ExperimentalTextApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalTextApi
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000OO0 f27134OooO00o;

    public o0000O0O() {
        this.f27134OooO00o = Build.VERSION.SDK_INT >= 28 ? new o000() : new o000O000();
    }
}
