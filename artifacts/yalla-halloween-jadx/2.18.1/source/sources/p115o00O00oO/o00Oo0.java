package p115o00O00oO;

import android.graphics.Bitmap;
import android.graphics.Movie;
import coil.size.Size;
import java.io.InterruptedIOException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import o00O0OO0.OooOOOO;
import o0oooo0.o0O00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p113o00O00Oo.OooO0O0;
import p119o00O0Oo0.o00Ooo;
import p119o00O0Oo0.oo000o;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f30356OooO00o = false;

    @Override // p115o00O00oO.Oooo0
    public final boolean OooO00o(@NotNull o0oOOo source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return Oooo000.OooO0OO(source);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p115o00O00oO.Oooo0
    @Nullable
    public final Object OooO0O0(@NotNull OooO0O0 oooO0O0, @NotNull o0oOOo o0oooo2, @NotNull Size size, @NotNull o00oO0o o00oo0o2, @NotNull Continuation<? super OooOo> continuation) throws Exception {
        Bitmap.Config config;
        boolean z = true;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            oo000o oo000oVar = new oo000o(cancellableContinuationImpl, o0oooo2);
            try {
                o0oOOo o0ooooOooO0OO = this.f30356OooO00o ? o0O000Oo.OooO0OO(new o00O0O(oo000oVar)) : o0O000Oo.OooO0OO(oo000oVar);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(((o0O00OO) o0ooooOooO0OO).new OooO00o());
                    CloseableKt.closeFinally(o0ooooOooO0OO, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Failed to decode GIF.".toString());
                    }
                    if (movieDecodeStream.isOpaque() && o00oo0o2.f30379OooO0o) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = oo000o.OooO00o(o00oo0o2.f30376OooO0O0) ? Bitmap.Config.ARGB_8888 : o00oo0o2.f30376OooO0O0;
                    }
                    oo00o.OooO0O0 oooO0O1 = new oo00o.OooO0O0(movieDecodeStream, oooO0O0, config, o00oo0o2.f30378OooO0Oo);
                    OooOOOO oooOOOO = o00oo0o2.f30374OooO;
                    Intrinsics.checkNotNullParameter(oooOOOO, "<this>");
                    oooOOOO.OooO0O0("coil#repeat_count");
                    oooO0O1.f53301OooooO0 = -1;
                    OooOOOO oooOOOO2 = o00oo0o2.f30374OooO;
                    Intrinsics.checkNotNullParameter(oooOOOO2, "<this>");
                    oooOOOO2.OooO0O0("coil#animation_start_callback");
                    Function0 function0 = (Function0) TypeIntrinsics.beforeCheckcastToFunctionOfArity(null, 0);
                    OooOOOO oooOOOO3 = o00oo0o2.f30374OooO;
                    Intrinsics.checkNotNullParameter(oooOOOO3, "<this>");
                    oooOOOO3.OooO0O0("coil#animation_end_callback");
                    Function0 function1 = (Function0) TypeIntrinsics.beforeCheckcastToFunctionOfArity(null, 0);
                    if (function0 != null || function1 != null) {
                        o00Ooo callback = new o00Ooo(function0, function1);
                        Intrinsics.checkNotNullParameter(callback, "callback");
                        oooO0O1.f53290OoooO0.add(callback);
                    }
                    OooOOOO oooOOOO4 = o00oo0o2.f30374OooO;
                    Intrinsics.checkNotNullParameter(oooOOOO4, "<this>");
                    oooOOOO4.OooO0O0("coil#animated_transformation");
                    oooO0O1.OooO0O0();
                    OooOo oooOo = new OooOo(oooO0O1, false);
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m502constructorimpl(oooOo));
                    oo000oVar.OooO00o();
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return result;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(o0ooooOooO0OO, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                oo000oVar.OooO00o();
                throw th3;
            }
        } catch (Exception e) {
            if (!(e instanceof InterruptedException) && !(e instanceof InterruptedIOException)) {
                throw e;
            }
            Throwable thInitCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e);
            Intrinsics.checkNotNullExpressionValue(thInitCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw thInitCause;
        }
    }
}
