package o0OOo000;

import androidx.annotation.FloatRange;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface OooO0OO {
    void OooO(@NotNull String str);

    void OooO00o(@NotNull String str);

    void OooO0O0(@NotNull OooOOO oooOOO);

    void OooO0OO(@Nullable Function1<? super OooOO0O, Unit> function1);

    @NotNull
    AtomicBoolean OooO0Oo();

    void OooO0o(boolean z);

    @NotNull
    OooOOO OooO0o0();

    void OooO0oO(@FloatRange(from = 0.0d, to = 1.0d) float f);

    void OooO0oo(boolean z);

    long getDuration();

    @NotNull
    com.google.android.exoplayer2.OooOOO0 getPlayer();

    boolean isPlaying();

    void pause();

    void release();
}
