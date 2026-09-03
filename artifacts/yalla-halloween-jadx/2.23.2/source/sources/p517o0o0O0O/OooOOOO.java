package p517o0o0O0O;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p518o0o0O0O0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.input_face_panel.InputFacePanelKt$InputMaskPopup$2$1", f = "InputFacePanel.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f51822OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51823OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f51824OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f51825OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f51826OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.input_face_panel.InputFacePanelKt$InputMaskPopup$2$1$1", f = "InputFacePanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f51827OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f51828OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51829OooO0o0;

        /* JADX INFO: renamed from: o0o0O0O.OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.composable.input_face_panel.InputFacePanelKt$InputMaskPopup$2$1$1$1", f = "InputFacePanel.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0474OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f51830OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f51831OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0474OooO00o(OooO0OO oooO0OO, Continuation<? super C0474OooO00o> continuation) {
                super(2, continuation);
                this.f51831OooO0o0 = oooO0OO;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0474OooO00o(this.f51831OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0474OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f51830OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f51830OooO0Oo = 1;
                    if (this.f51831OooO0o0.OooO0oO(this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, OooO0OO oooO0OO, Continuation<? super OooO00o> continuation) {
            super(3, continuation);
            this.f51827OooO0Oo = coroutineScope;
            this.f51829OooO0o0 = mutableState;
            this.f51828OooO0o = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            offset.getPackedValue();
            OooO0OO oooO0OO = this.f51828OooO0o;
            return new OooO00o(this.f51827OooO0Oo, this.f51829OooO0o0, oooO0OO, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (!this.f51829OooO0o0.getValue().booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(this.f51827OooO0Oo, null, null, new C0474OooO00o(this.f51828OooO0o, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, OooO0OO oooO0OO, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f51823OooO0o = coroutineScope;
        this.f51825OooO0oO = mutableState;
        this.f51826OooO0oo = oooO0OO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooOOOO oooOOOO = new OooOOOO(this.f51823OooO0o, this.f51825OooO0oO, this.f51826OooO0oo, continuation);
        oooOOOO.f51824OooO0o0 = obj;
        return oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((OooOOOO) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f51822OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f51824OooO0o0;
            OooO00o oooO00o = new OooO00o(this.f51823OooO0o, this.f51825OooO0oO, this.f51826OooO0oo, null);
            this.f51822OooO0Oo = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, oooO00o, null, this, 11, null) == coroutine_suspended) {
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
