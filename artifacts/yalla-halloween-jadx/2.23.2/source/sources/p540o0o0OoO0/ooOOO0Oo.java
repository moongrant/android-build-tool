package p540o0o0OoO0;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.code.android.util.OooOOO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p590o0oOooo0.v0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog$OnDialog$2$1$3$1", f = "RoomLiveEnterPasswordDialog.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class ooOOO0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f55056OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SoftwareKeyboardController f55057OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f55058OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog$OnDialog$2$1$3$1$1", f = "RoomLiveEnterPasswordDialog.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55059OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f55060OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f55061OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f55061OooO0o0 = focusRequester;
            this.f55060OooO0o = softwareKeyboardController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f55061OooO0o0, this.f55060OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55059OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f55061OooO0o0.requestFocus();
                SoftwareKeyboardController softwareKeyboardController = this.f55060OooO0o;
                if (softwareKeyboardController != null) {
                    this.f55059OooO0Oo = 1;
                    if (v0.OooO00o(softwareKeyboardController, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO0Oo(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Continuation<? super ooOOO0Oo> continuation) {
        super(2, continuation);
        this.f55058OooO0o0 = focusRequester;
        this.f55057OooO0o = softwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ooOOO0Oo(this.f55058OooO0o0, this.f55057OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ooOOO0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f55056OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = new OooO00o(this.f55058OooO0o0, this.f55057OooO0o, null);
            this.f55056OooO0Oo = 1;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
