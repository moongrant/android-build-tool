package p498o0o00Oo0;

import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.repository.WebEventRepository;
import com.yalla.yalla.common.repository.WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.repository.WebEventRepository$roomExposureLog$1", f = "WebEventRepository.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class oo0oOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f41365Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f41366Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f41367Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f41368Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(ArrayList<String> arrayList, ArrayList<String> arrayList2, EnterRoomParentPage enterRoomParentPage, Continuation<? super oo0oOO0> continuation) {
        super(2, continuation);
        this.f41367Oooo0oO = arrayList;
        this.f41368Oooo0oo = arrayList2;
        this.f41365Oooo = enterRoomParentPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo0oOO0(this.f41367Oooo0oO, this.f41368Oooo0oo, this.f41365Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo0oOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f41366Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebEventRepository webEventRepository = WebEventRepository.f20839OooO00o;
            ArrayList<String> arrayList = this.f41367Oooo0oO;
            ArrayList<String> arrayList2 = this.f41368Oooo0oo;
            EnterRoomParentPage enterRoomParentPage = this.f41365Oooo;
            this.f41366Oooo0o = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1(webEventRepository, null, arrayList, arrayList2, enterRoomParentPage), this) == coroutine_suspended) {
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
