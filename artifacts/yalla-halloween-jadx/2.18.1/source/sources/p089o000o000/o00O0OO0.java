package p089o000o000;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface o00O0OO0<T> extends CoroutineScope, SendChannel<T> {
    @Nullable
    Object OooO00o(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation);
}
