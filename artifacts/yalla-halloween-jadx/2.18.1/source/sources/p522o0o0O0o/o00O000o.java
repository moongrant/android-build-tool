package p522o0o0O0o;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.core.Observable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o {

    @DebugMetadata(c = "com.yalla.yalla.ext.LiveEventBusObservableExtKt$effectObserve$1", f = "LiveEventBusObservableExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f42996Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f42997Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f42998Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Observable<Object> observable, LifecycleOwner lifecycleOwner, Observer<T> observer, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f42996Oooo0o = observable;
            this.f42997Oooo0oO = lifecycleOwner;
            this.f42998Oooo0oo = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f42996Oooo0o, this.f42997Oooo0oO, this.f42998Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f42996Oooo0o.observe(this.f42997Oooo0oO, new o000Oo0(this.f42998Oooo0oo, 3));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f42999Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f43000Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f43001Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Observable<Object> observable, Observer<T> observer, int i) {
            super(2);
            this.f42999Oooo0o = observable;
            this.f43000Oooo0oO = observer;
            this.f43001Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O000o.OooO00o(this.f42999Oooo0o, this.f43000Oooo0oO, ooo00o, this.f43001Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final <T> void OooO00o(@NotNull Observable<Object> observable, @NotNull Observer<T> observer, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1377760164);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00Oo00.OooO0o0(null, new OooO00o(observable, (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo), observer, null), ooo00oOooOOo);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(observable, observer, i));
    }
}
