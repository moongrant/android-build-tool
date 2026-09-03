package o00000O0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends Lambda implements Function2<Object, Object, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0OOO0o f26956Oooo0o = new o0OOO0o();

    public o0OOO0o() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@Nullable Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }
}
