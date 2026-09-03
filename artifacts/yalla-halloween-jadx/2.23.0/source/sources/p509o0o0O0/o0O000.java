package p509o0o0O0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
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
import p403o0Oo0OOo.oO000Oo0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentTopFollowUsersCompKt$MomentFollowUserList$1$1$1$2$1", f = "MomentTopFollowUsersComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0O000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f50967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f50968OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(RecommendNewPostModel recommendNewPostModel, MutableState<Boolean> mutableState, Continuation<? super o0O000> continuation) {
        super(2, continuation);
        this.f50967OooO0Oo = recommendNewPostModel;
        this.f50968OooO0o0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O000(this.f50967OooO0Oo, this.f50968OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oO000Oo0 oo000oo0OooOoO = o000OOo.OooO00o().OooOoO();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        long jLongValue = ((Number) OooO0OO.OooO0O0()).longValue();
        RecommendNewPostModel recommendNewPostModel = this.f50967OooO0Oo;
        ReadPostTable readPostTableOooO0O0 = oo000oo0OooOoO.OooO0O0(jLongValue, recommendNewPostModel.getUserId());
        this.f50968OooO0o0.setValue(Boolean.valueOf((readPostTableOooO0O0 != null ? readPostTableOooO0O0.getReadPostId() : 0L) != recommendNewPostModel.getMaxDyId()));
        return Unit.INSTANCE;
    }
}
