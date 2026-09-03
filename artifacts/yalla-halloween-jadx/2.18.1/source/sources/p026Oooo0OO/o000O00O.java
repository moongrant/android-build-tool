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
@DebugMetadata(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1", f = "PressInteraction.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f1722Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f1723Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f1724Oooo0oo;

    public static final class OooO00o implements FlowCollector<o0000O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<o000Oo0> f1725Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f1726Oooo0oO;

        public OooO00o(List<o000Oo0> list, o0O00OO<Boolean> o0o00oo2) {
            this.f1725Oooo0o = list;
            this.f1726Oooo0oO = o0o00oo2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(o0000O o0000o2, Continuation continuation) {
            o0000O o0000o3 = o0000o2;
            if (o0000o3 instanceof o000Oo0) {
                this.f1725Oooo0o.add((o000Oo0) o0000o3);
            } else if (o0000o3 instanceof o000O00) {
                this.f1725Oooo0o.remove(((o000O00) o0000o3).f1720OooO00o);
            } else if (o0000o3 instanceof o000O0o) {
                this.f1725Oooo0o.remove(((o000O0o) o0000o3).f1727OooO00o);
            }
            this.f1726Oooo0oO.setValue(Boxing.boxBoolean(!this.f1725Oooo0o.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o0000OO0 o0000oo1, o0O00OO<Boolean> o0o00oo2, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f1723Oooo0oO = o0000oo1;
        this.f1724Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f1723Oooo0oO, this.f1724Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1722Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            Flow<o0000O> flowOooO00o = this.f1723Oooo0oO.OooO00o();
            OooO00o oooO00o = new OooO00o(arrayList, this.f1724Oooo0oo);
            this.f1722Oooo0o = 1;
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
