package p523o0o0O0o0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo00oO {
    @NotNull
    public static final Observable OooO00o(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Observable observable = LiveEventBus.get("room" + key, Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
        return observable;
    }
}
