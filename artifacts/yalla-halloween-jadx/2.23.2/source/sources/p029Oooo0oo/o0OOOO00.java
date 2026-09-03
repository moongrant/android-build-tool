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
import p099o000oOoO.o0000O0O;
import p099o000oOoO.o000OO;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(api = 21)
public abstract class o0OOOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f1302OooO00o;

    public interface OooO00o {
    }

    public o0OOOO00() {
        this.f1302OooO00o = ((o0000O0O) o000OO.OooO00o(o0000O0O.class)) == null ? 0 : 1;
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
