package p498o0o00Oo0;

import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.common.repository.WebEventRepository;
import io.agora.rtc.Constants;
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
@DebugMetadata(c = "com.yalla.yalla.common.repository.WebEventRepository$momentsContent$1", f = "WebEventRepository.kt", i = {}, l = {Constants.ERR_WATERMARK_READ}, m = "invokeSuspend", n = {}, s = {})
public final class oo0o0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f41360Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f41361Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentLogActionType f41362Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f41363Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(MomentLogActionType momentLogActionType, String str, String str2, Continuation<? super oo0o0O0> continuation) {
        super(2, continuation);
        this.f41362Oooo0oO = momentLogActionType;
        this.f41363Oooo0oo = str;
        this.f41360Oooo = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo0o0O0(this.f41362Oooo0oO, this.f41363Oooo0oo, this.f41360Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo0o0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f41361Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebEventRepository webEventRepository = WebEventRepository.f20839OooO00o;
            MomentLogSourcePage momentLogSourcePage = MomentLogSourcePage.moments_content;
            MomentLogActionType momentLogActionType = this.f41362Oooo0oO;
            String str = this.f41363Oooo0oo;
            String str2 = this.f41360Oooo;
            this.f41361Oooo0o = 1;
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
