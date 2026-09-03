package p089o000o000;

import androidx.paging.RemoteMediator$InitializeAction;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface o00O0O00<Key, Value> extends o00O0O0<Key, Value> {
    @Nullable
    Object OooO0OO(@NotNull Continuation<? super RemoteMediator$InitializeAction> continuation);

    @NotNull
    StateFlow<o000000O> getState();
}
