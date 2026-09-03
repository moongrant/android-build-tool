package p367o0OOo0OO;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Lambda implements Function1<Type, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOOOO f43082OooO0Oo = new OooOOOO();

    public OooOOOO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Type type) {
        Type it = type;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof ParameterizedType);
    }
}
