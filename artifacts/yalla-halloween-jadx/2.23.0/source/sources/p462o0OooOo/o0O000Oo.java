package p462o0OooOo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function1<Type, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O000Oo f46660OooO0Oo = new o0O000Oo();

    public o0O000Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Type type) {
        Type it = type;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof ParameterizedType);
    }
}
