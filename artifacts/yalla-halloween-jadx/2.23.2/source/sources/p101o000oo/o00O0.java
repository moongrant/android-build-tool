package p101o000oo;

import androidx.paging.RemoteMediator$InitializeAction;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface o00O0<Key, Value> extends o00O0O00<Key, Value> {
    @Nullable
    Object OooO00o(@NotNull Continuation<? super RemoteMediator$InitializeAction> continuation);

    @NotNull
    MutableStateFlow getState();
}
