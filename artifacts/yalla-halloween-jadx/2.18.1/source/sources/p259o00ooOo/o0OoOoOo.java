package p259o00ooOo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o0000;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.code.android.ylrefreshcontentstatus.LoadMoreFooterKt$LoadingPage$1$1$1", f = "LoadMoreFooter.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoOoOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f34754Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Integer> f34755Oooo0oO;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Integer> f34756Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<Integer> o0o00oo2) {
            super(1);
            this.f34756Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            System.out.println((Object) "AnimationUtil ");
            this.f34756Oooo0o.setValue(Integer.valueOf(iIntValue));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(o0O00OO<Integer> o0o00oo2, Continuation<? super o0OoOoOo> continuation) {
        super(2, continuation);
        this.f34755Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoOoOo(this.f34755Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoOoOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34754Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int[] iArr = o0O00OOO.f34694OooO00o;
            int[] iArr2 = o0O00OOO.f34694OooO00o;
            OooO00o oooO00o = new OooO00o(this.f34755Oooo0oO);
            this.f34754Oooo0o = 1;
            Object objOooO0OO = o0000O0.OooO0OO(new o0000(1000L, iArr2, -1, oooO00o, null), this);
            if (objOooO0OO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO0OO = Unit.INSTANCE;
            }
            if (objOooO0OO == coroutine_suspended) {
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
