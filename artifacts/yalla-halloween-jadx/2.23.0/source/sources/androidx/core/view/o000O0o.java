package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {414, 416}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
public final class o000O0o extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f5433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f5434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f5435OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(View view, Continuation<? super o000O0o> continuation) {
        super(2, continuation);
        this.f5434OooO0o = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000O0o o000o0o2 = new o000O0o(this.f5434OooO0o, continuation);
        o000o0o2.f5435OooO0o0 = obj;
        return o000o0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
        return ((o000O0o) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SequenceScope sequenceScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5433OooO0Oo;
        View view = this.f5434OooO0o;
        if (i != 0) {
            if (i == 1) {
                sequenceScope = (SequenceScope) this.f5435OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        sequenceScope = (SequenceScope) this.f5435OooO0o0;
        this.f5435OooO0o0 = sequenceScope;
        this.f5433OooO0Oo = 1;
        if (sequenceScope.yield(view, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            Intrinsics.checkNotNullParameter(viewGroup, "<this>");
            Sequence sequence = SequencesKt.sequence(new o000O000(viewGroup, null));
            this.f5435OooO0o0 = null;
            this.f5433OooO0Oo = 2;
            if (sequenceScope.yieldAll(sequence, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
