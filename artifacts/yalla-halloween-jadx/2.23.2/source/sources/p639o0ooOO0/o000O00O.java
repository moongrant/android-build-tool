package p639o0ooOO0;

import androidx.concurrent.futures.DirectExecutor;
import com.yalla.yalla.module.media.camera.OooOo00;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p030OoooO.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O {
    @Nullable
    public static final Object OooO00o(@NotNull OooOO0O oooOO0O, @NotNull OooOo00.OooOO0O oooOO0O2) {
        try {
            if (oooOO0O.isDone()) {
                return o000O0o.OooO0o(oooOO0O);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooOO0O2), 1);
            oooOO0O.OooO0oo(new o000O0Oo(oooOO0O, cancellableContinuationImpl), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new o000O00(oooOO0O));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooOO0O2);
            }
            return result;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                Intrinsics.throwNpe();
            }
            throw cause;
        }
    }
}
