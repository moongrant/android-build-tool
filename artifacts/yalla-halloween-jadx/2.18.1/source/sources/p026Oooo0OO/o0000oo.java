package p026Oooo0OO;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1", f = "FocusInteraction.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class o0000oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f1715Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f1716Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f1717Oooo0oo;

    public static final class OooO00o implements FlowCollector<o0000O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<o0000> f1718Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f1719Oooo0oO;

        public OooO00o(List<o0000> list, o0O00OO<Boolean> o0o00oo2) {
            this.f1718Oooo0o = list;
            this.f1719Oooo0oO = o0o00oo2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(o0000O o0000o2, Continuation continuation) {
            o0000O o0000o3 = o0000o2;
            if (o0000o3 instanceof o0000) {
                this.f1718Oooo0o.add((o0000) o0000o3);
            } else if (o0000o3 instanceof o0000O00) {
                this.f1718Oooo0o.remove(((o0000O00) o0000o3).f1712OooO00o);
            }
            this.f1719Oooo0oO.setValue(Boxing.boxBoolean(!this.f1718Oooo0o.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(o0000OO0 o0000oo1, o0O00OO<Boolean> o0o00oo2, Continuation<? super o0000oo> continuation) {
        super(2, continuation);
        this.f1716Oooo0oO = o0000oo1;
        this.f1717Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000oo(this.f1716Oooo0oO, this.f1717Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1715Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            Flow<o0000O> flowOooO00o = this.f1716Oooo0oO.OooO00o();
            OooO00o oooO00o = new OooO00o(arrayList, this.f1717Oooo0oo);
            this.f1715Oooo0o = 1;
            if (flowOooO00o.collect(oooO00o, this) == coroutine_suspended) {
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
