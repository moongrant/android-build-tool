package p367o0OOo0OO;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends Lambda implements Function1<Type, Sequence<? extends Type>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOo00 f43083OooO0Oo = new OooOo00();

    public OooOo00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Sequence<? extends Type> invoke(Type type) {
        Type it = type;
        Intrinsics.checkNotNullParameter(it, "it");
        Type[] actualTypeArguments = ((ParameterizedType) it).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return ArraysKt.asSequence(actualTypeArguments);
    }
}
