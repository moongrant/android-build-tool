package p029Oooo0oo;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.o000oOoO;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.concurrent.Executor;
import p099o000oOoO.o00000;
import p099o000oOoO.o000000O;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(api = 21)
public abstract class o0oo0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f1351OooO00o;

    public interface OooO00o {
    }

    public o0oo0000() {
        this.f1351OooO00o = ((o000000O) o00000.OooO00o(o000000O.class)) == null ? 0 : 1;
    }

    @NonNull
    public abstract Matrix OooO();

    @NonNull
    public abstract Executor OooO00o();

    public abstract int OooO0O0();

    @NonNull
    public abstract Rect OooO0OO();

    @Nullable
    public abstract ImageCapture.OooO OooO0Oo();

    @Nullable
    public abstract ImageCapture.OooOO0 OooO0o();

    @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public abstract int OooO0o0();

    @Nullable
    public abstract ImageCapture.OooOO0O OooO0oO();

    public abstract int OooO0oo();

    @NonNull
    public abstract List<o000oOoO> OooOO0();
}
