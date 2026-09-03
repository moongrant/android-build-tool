package p553o0oOOO0o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO000o extends Lambda implements Function1<Type, Sequence<? extends Type>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0OO000o f44625Oooo0o = new o0OO000o();

    public o0OO000o() {
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
