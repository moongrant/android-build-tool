package p632o0ooO00O;

import androidx.paging.compose.OooO0OO;
import come.code.android.easyrefreshcontentstatus.ContentState;
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
import p089o000o000.o000000;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "come.code.android.easyrefreshcontentstatus.EasyContentStatusKt$observerAsContentState$1", f = "EasyContentStatus.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO00OO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<Object> f48723Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f48724Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<ContentState> f48725Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(OooO0OO<Object> oooO0OO, boolean z, o0O00OO<ContentState> o0o00oo2, Continuation<? super oO00OO0O> continuation) {
        super(2, continuation);
        this.f48723Oooo0o = oooO0OO;
        this.f48724Oooo0oO = z;
        this.f48725Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO00OO0O(this.f48723Oooo0o, this.f48724Oooo0oO, this.f48725Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO00OO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f48723Oooo0o.OooO0o0().f28682OooO00o instanceof o000000.OooO00o) {
            this.f48725Oooo0oo.setValue(ContentState.Error);
        } else if (this.f48723Oooo0o.OooO0o0().f28682OooO00o instanceof o000000.OooO0OO) {
            this.f48725Oooo0oo.setValue((this.f48723Oooo0o.OooO0o0().f28684OooO0OO.f28695OooO00o && this.f48723Oooo0o.OooO0OO() == 0) ? ContentState.Empty : ContentState.Content);
        } else if ((this.f48723Oooo0o.OooO0o0().f28682OooO00o instanceof o000000.OooO0O0) && !this.f48724Oooo0oO && this.f48723Oooo0o.OooO0OO() == 0) {
            this.f48725Oooo0oo.setValue(ContentState.Loading);
        }
        return Unit.INSTANCE;
    }
}
