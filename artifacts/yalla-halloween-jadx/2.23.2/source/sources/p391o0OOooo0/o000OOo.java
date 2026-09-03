package p391o0OOooo0;

import com.code.android.util.OooOOO;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropAll;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$initDataGiftBackpack$1", f = "GiftPropManager.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
public final class o000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f43562OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(long j, Continuation<? super o000OOo> continuation) {
        super(2, continuation);
        this.f43562OooO0o0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OOo(this.f43562OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43561OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<GiftPropAll> value = oo0o0Oo.f43576OooO0Oo.getValue();
            if (o0OoOo0.OooO0o0(0, value != null ? Boxing.boxInt(value.size()) : null) <= 1) {
                oo0o0Oo.OooO0Oo(true);
            } else {
                this.f43561OooO0Oo = 1;
                Object objOooO0Oo = OooOOO.OooO0Oo(new o000000O(this.f43562OooO0o0, null), this);
                if (objOooO0Oo != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0Oo = Unit.INSTANCE;
                }
                if (objOooO0Oo == coroutine_suspended) {
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
