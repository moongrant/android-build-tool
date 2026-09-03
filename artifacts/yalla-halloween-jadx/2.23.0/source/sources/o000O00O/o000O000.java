package o000O00O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O000 extends FunctionReferenceImpl implements Function1<Continuation<? super androidx.paging.o0O0O00<Object, Object>>, Object>, SuspendFunction {
    public o000O000(Lambda lambda) {
        super(1, lambda, o00O000o.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super androidx.paging.o0O0O00<Object, Object>> continuation) {
        o00O000o o00o000o2 = (o00O000o) this.receiver;
        o00o000o2.getClass();
        return BuildersKt.withContext(null, new o00O000(o00o000o2, null), continuation);
    }
}
