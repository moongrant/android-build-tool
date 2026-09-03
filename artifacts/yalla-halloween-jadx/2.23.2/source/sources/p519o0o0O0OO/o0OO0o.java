package p519o0o0O0OO;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.data.db.model.ReadPostTable;
import com.yalla.yalla.model.RecommendNewPostModel;
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
import p407o0Oo0Oo.o0O00O0o;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentTopFollowUsersCompKt$MomentFollowUserList$1$1$1$2$1", f = "MomentTopFollowUsersComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f52444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52445OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(RecommendNewPostModel recommendNewPostModel, MutableState<Boolean> mutableState, Continuation<? super o0OO0o> continuation) {
        super(2, continuation);
        this.f52444OooO0Oo = recommendNewPostModel;
        this.f52445OooO0o0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO0o(this.f52444OooO0Oo, this.f52445OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0O00O0o o0o00o0oOooOoOO = o00Oo0.OooO00o().OooOoOO();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        long jLongValue = ((Number) OooO00o.OooO00o()).longValue();
        RecommendNewPostModel recommendNewPostModel = this.f52444OooO0Oo;
        ReadPostTable readPostTableOooO0O0 = o0o00o0oOooOoOO.OooO0O0(jLongValue, recommendNewPostModel.getUserId());
        this.f52445OooO0o0.setValue(Boolean.valueOf((readPostTableOooO0O0 != null ? readPostTableOooO0O0.getReadPostId() : 0L) != recommendNewPostModel.getMaxDyId()));
        return Unit.INSTANCE;
    }
}
