package p576o0oOoOOo;

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
import p423o0OoO0OO.o00O00OO;
import p429o0OoOO.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$enterRoom$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f56463OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56464OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Integer f56465OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f56466OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO(String str, Integer num, Function0<Unit> function0, int i, Continuation<? super oO> continuation) {
        super(2, continuation);
        this.f56463OooO0Oo = str;
        this.f56465OooO0o0 = num;
        this.f56464OooO0o = function0;
        this.f56466OooO0oO = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO(this.f56463OooO0Oo, this.f56465OooO0o0, this.f56464OooO0o, this.f56466OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int iIntValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f56463OooO0Oo;
        if (o00O00OO.OooO0o(str)) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO0o0(o000000.OooO0o(str), EnterRoomParentPage.Activity_Room);
            Integer num = this.f56465OooO0o0;
            if (num != null && (iIntValue = num.intValue()) > 0) {
                LiveEventBus.get("Room_Show_Gift_Dialog").postDelay(new GiftPropRoomShowModel(iIntValue, this.f56466OooO0oO), 400L);
            }
        }
        Function0<Unit> function0 = this.f56464OooO0o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
