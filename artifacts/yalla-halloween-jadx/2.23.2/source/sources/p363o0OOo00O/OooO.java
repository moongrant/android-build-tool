package p363o0OOo00O;

import androidx.annotation.FloatRange;
import androidx.media3.exoplayer.OooO0o;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO {
    void OooO(@NotNull String str);

    void OooO00o(@NotNull String str);

    void OooO0O0(@Nullable Function1<? super OooOOO, Unit> function1);

    @NotNull
    AtomicBoolean OooO0OO();

    void OooO0Oo(@NotNull OooOo oooOo);

    void OooO0o(boolean z);

    @NotNull
    OooOo OooO0o0();

    void OooO0oO(@FloatRange(from = 0.0d, to = 1.0d) float f);

    void OooO0oo(boolean z);

    long getDuration();

    @NotNull
    OooO0o getPlayer();

    boolean isPlaying();

    void pause();

    void release();
}
