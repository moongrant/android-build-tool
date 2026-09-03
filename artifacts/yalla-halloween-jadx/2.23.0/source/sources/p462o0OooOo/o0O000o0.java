package p462o0OooOo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 extends Lambda implements Function1<Type, Sequence<? extends Type>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O000o0 f46661OooO0Oo = new o0O000o0();

    public o0O000o0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Sequence<? extends Type> invoke(Type type) {
        Type it = type;
        Intrinsics.checkNotNullParameter(it, "it");
        Type[] actualTypeArguments = ((ParameterizedType) it).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "it as ParameterizedType).actualTypeArguments");
        return ArraysKt.asSequence(actualTypeArguments);
    }
}
