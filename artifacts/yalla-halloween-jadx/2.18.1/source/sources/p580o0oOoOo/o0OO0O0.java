package p580o0oOoOo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.o000O00O;
import p100o000oOoO.o0O00OO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$4$3$1$1", f = "LiveRoomApplyMicListDialog.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f46404Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O00O f46405Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46406Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(o000O00O o000o00o2, o0O00OO<Boolean> o0o00oo2, Continuation<? super o0OO0O0> continuation) {
        super(2, continuation);
        this.f46405Oooo0oO = o000o00o2;
        this.f46406Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO0O0(this.f46405Oooo0oO, this.f46406Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46404Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f46406Oooo0oo.setValue(Boolean.FALSE);
            o000O00O o000o00o2 = this.f46405Oooo0oO;
            int iCoerceIn = RangesKt.coerceIn(o00O.OooO0o.f43216OooO00o.OooO00o() - 1, 0, 99);
            this.f46404Oooo0o = 1;
            if (o000O00O.OooO(o000o00o2, iCoerceIn, this) == coroutine_suspended) {
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
