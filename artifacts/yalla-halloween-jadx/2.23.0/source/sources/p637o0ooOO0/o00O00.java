package p637o0ooOO0;

import androidx.concurrent.futures.DirectExecutor;
import com.yalla.yalla.module.media.camera.OooOo;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p030OoooO.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 {
    @Nullable
    public static final Object OooO00o(@NotNull OooOO0O oooOO0O, @NotNull OooOo.OooOO0O oooOO0O2) {
        try {
            if (oooOO0O.isDone()) {
                return o00oOoo.OooO0o(oooOO0O);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooOO0O2), 1);
            oooOO0O.OooO(new oOO00O(oooOO0O, cancellableContinuationImpl), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new o00O000o(oooOO0O));
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
