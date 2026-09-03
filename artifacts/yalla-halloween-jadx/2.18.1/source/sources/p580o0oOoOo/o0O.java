package p580o0oOoOo;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.o000O00O;
import p027Oooo0o.oo000o;
import p100o000oOoO.o0O00OO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$2$1", f = "LiveRoomApplyMicListDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f46380Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46381Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(o000O00O o000o00o2, o0O00OO<Boolean> o0o00oo2, Continuation<? super o0O> continuation) {
        super(2, continuation);
        this.f46380Oooo0o = o000o00o2;
        this.f46381Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O(this.f46380Oooo0o, this.f46381Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f46380Oooo0o.OooO00o()) {
            return Unit.INSTANCE;
        }
        oo000o oo000oVar = (oo000o) CollectionsKt.lastOrNull((List) this.f46380Oooo0o.OooO0oO().OooO0O0());
        if (oo000oVar == null) {
            return Unit.INSTANCE;
        }
        int index = oo000oVar.getIndex();
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        if (index == o00O.OooO0o.f43226OooOO0o.size() - 1) {
            this.f46381Oooo0oO.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
