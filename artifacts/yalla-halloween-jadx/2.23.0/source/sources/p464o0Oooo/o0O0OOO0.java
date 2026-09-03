package p464o0Oooo;

import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.repository.WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$enterRoomLog$2", f = "WebEventRepository.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46844OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f46845OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f46846OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(String str, EnterRoomParentPage enterRoomParentPage, Continuation<? super o0O0OOO0> continuation) {
        super(2, continuation);
        this.f46846OooO0o0 = str;
        this.f46845OooO0o = enterRoomParentPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0OOO0(this.f46846OooO0o0, this.f46845OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0OOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46844OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
            String str = this.f46846OooO0o0;
            EnterRoomParentPage enterRoomParentPage = this.f46845OooO0o;
            this.f46844OooO0Oo = 1;
            webEventRepository.getClass();
            if (BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1(webEventRepository, null, null, null, str, enterRoomParentPage), this) == coroutine_suspended) {
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
