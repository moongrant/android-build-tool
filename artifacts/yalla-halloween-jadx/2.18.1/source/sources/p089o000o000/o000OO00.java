package p089o000o000;

import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO00 extends FunctionReferenceImpl implements Function1<Continuation<? super o00O00o0<Object, Object>>, Object>, SuspendFunction {
    public o000OO00(Object obj) {
        super(1, obj, oo0oOO0.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super o00O00o0<Object, Object>> continuation) {
        oo0oOO0 oo0ooo0 = (oo0oOO0) this.receiver;
        Objects.requireNonNull(oo0ooo0);
        return BuildersKt.withContext(null, new o00O0OOO(oo0ooo0, null), continuation);
    }
}
