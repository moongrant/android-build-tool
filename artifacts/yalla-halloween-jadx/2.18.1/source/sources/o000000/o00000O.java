package o000000;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00000O f26626Oooo0o = new o00000O();

    public o00000O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!((o00000O0) it).isValid());
    }
}
