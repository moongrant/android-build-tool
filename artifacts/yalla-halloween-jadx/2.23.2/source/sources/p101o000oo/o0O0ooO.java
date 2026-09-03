package p101o000oo;

import androidx.paging.o0O0O00;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0O0ooO extends FunctionReferenceImpl implements Function1<Continuation<? super o0O0O00<Object, Object>>, Object>, SuspendFunction {
    public o0O0ooO(Lambda lambda) {
        super(1, lambda, o00O0OOO.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super o0O0O00<Object, Object>> continuation) {
        o00O0OOO o00o0ooo2 = (o00O0OOO) this.receiver;
        o00o0ooo2.getClass();
        return BuildersKt.withContext(null, new o00O0OO(o00o0ooo2, null), continuation);
    }
}
