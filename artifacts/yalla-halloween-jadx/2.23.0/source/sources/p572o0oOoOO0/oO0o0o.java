package p572o0oOoOO0;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o000000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.gift.GiftPropRoomShowModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0000O0O;
import p427o0OoOO00.o0OOO0o;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$enterRoom$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0o0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f56298OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56299OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Integer f56300OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f56301OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(String str, Integer num, Function0<Unit> function0, int i, Continuation<? super oO0o0o> continuation) {
        super(2, continuation);
        this.f56298OooO0Oo = str;
        this.f56300OooO0o0 = num;
        this.f56299OooO0o = function0;
        this.f56301OooO0oO = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0o0o(this.f56298OooO0Oo, this.f56300OooO0o0, this.f56299OooO0o, this.f56301OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0o0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int iIntValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f56298OooO0Oo;
        if (o0000O0O.OooO0o(str)) {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            o0OOO0o.OooO0o0(o000000.OooO0o(str), EnterRoomParentPage.Activity_Room);
            Integer num = this.f56300OooO0o0;
            if (num != null && (iIntValue = num.intValue()) > 0) {
                LiveEventBus.get("Room_Show_Gift_Dialog").postDelay(new GiftPropRoomShowModel(iIntValue, this.f56301OooO0oO), 400L);
            }
        }
        Function0<Unit> function0 = this.f56299OooO0o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
