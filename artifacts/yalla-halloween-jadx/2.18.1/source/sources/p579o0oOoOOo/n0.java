package p579o0oOoOOo;

import android.webkit.WebView;
import androidx.lifecycle.LifecycleOwner;
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
import p100o000oOoO.o0O00OO;
import p143o00OOooo.o00OOOO0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomWebDialog$OnDialog$3$1$3", f = "RoomWebDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class n0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f46022Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<WebView> f46023Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(LifecycleOwner lifecycleOwner, o0O00OO<WebView> o0o00oo2, Continuation<? super n0> continuation) {
        super(2, continuation);
        this.f46022Oooo0o = lifecycleOwner;
        this.f46023Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new n0(this.f46022Oooo0o, this.f46023Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((n0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OooOOO.f41216OooO00o.OooO0OO().observe(this.f46022Oooo0o, new o00OOOO0(this.f46023Oooo0oO, 7));
        return Unit.INSTANCE;
    }
}
