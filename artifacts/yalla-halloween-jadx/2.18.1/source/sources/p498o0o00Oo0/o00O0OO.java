package p498o0o00Oo0;

import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.common.repository.WebEventRepository;
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

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.repository.WebEventRepository$momentsEvent$1", f = "WebEventRepository.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f41336Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f41337Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentLogSourcePage f41338Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MomentLogActionType f41339Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f41340OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(MomentLogSourcePage momentLogSourcePage, MomentLogActionType momentLogActionType, String str, String str2, Continuation<? super o00O0OO> continuation) {
        super(2, continuation);
        this.f41338Oooo0oO = momentLogSourcePage;
        this.f41339Oooo0oo = momentLogActionType;
        this.f41336Oooo = str;
        this.f41340OoooO00 = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0OO(this.f41338Oooo0oO, this.f41339Oooo0oo, this.f41336Oooo, this.f41340OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f41337Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebEventRepository webEventRepository = WebEventRepository.f20839OooO00o;
            MomentLogSourcePage momentLogSourcePage = this.f41338Oooo0oO;
            MomentLogActionType momentLogActionType = this.f41339Oooo0oo;
            String str = this.f41336Oooo;
            String str2 = this.f41340OoooO00;
            this.f41337Oooo0o = 1;
            if (webEventRepository.OooO0o0(momentLogSourcePage, momentLogActionType, str, str2, this) == coroutine_suspended) {
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
