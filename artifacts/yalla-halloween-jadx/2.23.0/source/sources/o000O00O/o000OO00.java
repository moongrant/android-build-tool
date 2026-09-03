package o000O00O;

import androidx.paging.RemoteMediator$InitializeAction;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface o000OO00<Key, Value> extends o000OOo0<Key, Value> {
    @Nullable
    Object OooO00o(@NotNull Continuation<? super RemoteMediator$InitializeAction> continuation);

    @NotNull
    MutableStateFlow getState();
}
