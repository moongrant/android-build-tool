package p101o000oo;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface o00O0O0O<T> extends CoroutineScope, SendChannel<T> {
    @Nullable
    Object OooO0OO(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation);
}
