package p617o0oo0o;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.platform.o00OO0O0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 {

    @DebugMetadata(c = "com.yalla.yalla.util.SoftwareKeyboardControllerExtKt", f = "SoftwareKeyboardControllerExt.kt", i = {0}, l = {12}, m = "showByDelay", n = {"$this$showByDelay"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00OO0O0 f48549Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f48550Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f48551Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48550Oooo0oO = obj;
            this.f48551Oooo0oo |= Integer.MIN_VALUE;
            return o00O000.OooO00o(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @ExperimentalComposeUiApi
    @Nullable
    public static final Object OooO00o(@Nullable o00OO0O0 o00oo0o1, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f48551Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f48551Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f48550Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f48551Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO00o.f48549Oooo0o = o00oo0o1;
            oooO00o.f48551Oooo0oo = 1;
            if (DelayKt.delay(50L, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00oo0o1 = oooO00o.f48549Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        if (o00oo0o1 != null) {
            o00oo0o1.OooO00o();
        }
        return Unit.INSTANCE;
    }
}
