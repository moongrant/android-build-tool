package p498o0o00Oo0;

import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.repository.WebEventRepository;
import java.util.ArrayList;
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
@DebugMetadata(c = "com.yalla.yalla.common.repository.WebEventRepository$enterRoomLog$1", f = "WebEventRepository.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f41331Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f41332Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f41333Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f41334Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ EnterRoomParentPage f41335OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(ArrayList<String> arrayList, ArrayList<String> arrayList2, String str, EnterRoomParentPage enterRoomParentPage, Continuation<? super o00O0O0O> continuation) {
        super(2, continuation);
        this.f41333Oooo0oO = arrayList;
        this.f41334Oooo0oo = arrayList2;
        this.f41331Oooo = str;
        this.f41335OoooO00 = enterRoomParentPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O0O(this.f41333Oooo0oO, this.f41334Oooo0oo, this.f41331Oooo, this.f41335OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f41332Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebEventRepository webEventRepository = WebEventRepository.f20839OooO00o;
            ArrayList<String> arrayList = this.f41333Oooo0oO;
            ArrayList<String> arrayList2 = this.f41334Oooo0oo;
            String str = this.f41331Oooo;
            EnterRoomParentPage enterRoomParentPage = this.f41335OoooO00;
            this.f41332Oooo0o = 1;
            if (webEventRepository.OooO0o(arrayList, arrayList2, str, enterRoomParentPage, this) == coroutine_suspended) {
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
