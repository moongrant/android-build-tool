package p464o0Oooo;

import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogSourcePage;
import com.yalla.yalla.repository.WebEventRepository;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$momentsNotifications$1", f = "WebEventRepository.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46847OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f46848OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentLogActionType f46849OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f46850OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(MomentLogActionType momentLogActionType, String str, String str2, Continuation<? super o0O0OOOo> continuation) {
        super(2, continuation);
        this.f46849OooO0o0 = momentLogActionType;
        this.f46848OooO0o = str;
        this.f46850OooO0oO = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0OOOo(this.f46849OooO0o0, this.f46848OooO0o, this.f46850OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0OOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46847OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
            MomentLogSourcePage momentLogSourcePage = MomentLogSourcePage.moments_notifications;
            MomentLogActionType momentLogActionType = this.f46849OooO0o0;
            String str = this.f46848OooO0o;
            String str2 = this.f46850OooO0oO;
            this.f46847OooO0Oo = 1;
            if (webEventRepository.OooO0Oo(momentLogSourcePage, momentLogActionType, str, str2, this) == coroutine_suspended) {
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
