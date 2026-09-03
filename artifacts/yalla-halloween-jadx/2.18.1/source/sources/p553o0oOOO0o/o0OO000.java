package p553o0oOOO0o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO000 extends Lambda implements Function1<Type, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0OO000 f44624Oooo0o = new o0OO000();

    public o0OO000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Type type) {
        Type it = type;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof ParameterizedType);
    }
}
