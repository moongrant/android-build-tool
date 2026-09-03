package p579o0oOoo;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class oOOO0O0o {

    @DebugMetadata(c = "com.yalla.yalla.util.SoftwareKeyboardControllerExtKt", f = "SoftwareKeyboardControllerExt.kt", i = {0}, l = {12}, m = "showByDelay", n = {"$this$showByDelay"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public SoftwareKeyboardController f56679OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f56680OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f56681OooO0o0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f56681OooO0o0 = obj;
            this.f56680OooO0o |= Integer.MIN_VALUE;
            return oOOO0O0o.OooO00o(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @ExperimentalComposeUiApi
    @Nullable
    public static final Object OooO00o(@Nullable SoftwareKeyboardController softwareKeyboardController, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f56680OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f56680OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f56681OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f56680OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO00o.f56679OooO0Oo = softwareKeyboardController;
            oooO00o.f56680OooO0o = 1;
            if (DelayKt.delay(50L, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            softwareKeyboardController = oooO00o.f56679OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        if (softwareKeyboardController != null) {
            softwareKeyboardController.show();
        }
        return Unit.INSTANCE;
    }
}
