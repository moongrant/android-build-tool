package com.app.base.view;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;
import p168o00Ooo0.o00Ooo;
import p497o0o00Oo.OooOOO0;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.app.base.view.FacePanelView$1$1$1$1", f = "FacePanelView.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f12064Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f12065Oooo0oO;

    /* JADX INFO: renamed from: com.app.base.view.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0076OooO00o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f12066Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0076OooO00o(FacePanelView facePanelView) {
            super(0);
            this.f12066Oooo0o = facePanelView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            o0O0O0O.OooOO0 oooOO1 = this.f12066Oooo0o.f11960OoooO0;
            Intrinsics.checkNotNull(oooOO1);
            return Integer.valueOf(oooOO1.OooO0o0());
        }
    }

    @DebugMetadata(c = "com.app.base.view.FacePanelView$1$1$1$1$2", f = "FacePanelView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ int f12067Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f12068Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FacePanelView facePanelView, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f12068Oooo0oO = facePanelView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f12068Oooo0oO, continuation);
            oooO0O0.f12067Oooo0o = ((Number) obj).intValue();
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = this.f12067Oooo0o;
            if (this.f12068Oooo0oO.f11965OoooOOo.get(i).f11976OooO0OO == 1) {
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                OooOOO0.OooO0o0().OooOO0o().postValue(Boxing.boxBoolean(true));
                OooOo.OooO0OO("102205", MapsKt.mapOf(new Pair("sources", Boxing.boxInt(o00Ooo.f32650OooO00o ? 1 : 2))));
            }
            FacePanelView facePanelView = this.f12068Oooo0oO;
            boolean z = i == 0;
            facePanelView.isEmojiPanel = z;
            Function1<? super Boolean, Unit> function1 = facePanelView.f11957Oooo0oO;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(FacePanelView facePanelView, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f12065Oooo0oO = facePanelView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO00o(this.f12065Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f12064Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowOooO0oO = o0OOO00.OooO0oO(new C0076OooO00o(this.f12065Oooo0oO));
            OooO0O0 oooO0O0 = new OooO0O0(this.f12065Oooo0oO, null);
            this.f12064Oooo0o = 1;
            if (FlowKt.collectLatest(flowOooO0oO, oooO0O0, this) == coroutine_suspended) {
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
