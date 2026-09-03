package p418o0Oo0oo;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.platform.o00OOOOo;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.functions.Function2;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictsSuspension
public interface OooOOO extends OooO {
    long OooO00o();

    @Nullable
    Object OooOo0(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super o00Oo0> continuation);

    @NotNull
    o00Oo0 OooOoO0();

    @Nullable
    <T> Object Oooo0o0(long j, @NotNull Function2<? super OooOOO, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation);

    long OooooO0();

    @NotNull
    o00OOOOo getViewConfiguration();

    @Nullable
    <T> Object o00O0O(long j, @NotNull Function2<? super OooOOO, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation);
}
