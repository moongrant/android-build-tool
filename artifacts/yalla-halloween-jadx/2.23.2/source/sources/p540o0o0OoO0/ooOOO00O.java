package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0OO;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog$OnDialog$2$1$4$1", f = "RoomLiveEnterPasswordDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ooOOO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55055OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(MutableState<Boolean> mutableState, Continuation<? super ooOOO00O> continuation) {
        super(2, continuation);
        this.f55055OooO0Oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ooOOO00O(this.f55055OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ooOOO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = OooO00o.f24511OooO00o;
        if (Intrinsics.areEqual(OooO00o.OooO0OO(), OooO0OO.AbstractC0317OooO0OO.OooO00o.f24591OooO00o) && ((Number) OooO00o.f24516OooO0o0.f48465OooO0oO.getValue()).intValue() > 0) {
            this.f55055OooO0Oo.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
