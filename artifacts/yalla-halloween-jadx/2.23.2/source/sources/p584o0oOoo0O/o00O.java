package p584o0oOoo0O;

import com.code.android.util.o000O00O;
import com.yalla.yalla.model.MusicFileModel;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p589o0oOooo.o0OO00o0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentMusicVM$initFolder$1", f = "MomentMusicVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0O0 f56692OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(oo0o0O0 oo0o0o0, Continuation<? super o00O> continuation) {
        super(2, continuation);
        this.f56692OooO0Oo = oo0o0o0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O(this.f56692OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (o000O00O.OooO00o() != null) {
            MutableStateFlow<ArrayList<MusicFileModel>> mutableStateFlow = this.f56692OooO0Oo.f56703OooO0oO;
            ArrayList arrayListOooO00o = o0OO00o0.OooO00o(o000O00O.OooO00o());
            Intrinsics.checkNotNullExpressionValue(arrayListOooO00o, "loadMusicList(...)");
            mutableStateFlow.setValue(oo0o0O0.OooO0O0(arrayListOooO00o));
        }
        return Unit.INSTANCE;
    }
}
