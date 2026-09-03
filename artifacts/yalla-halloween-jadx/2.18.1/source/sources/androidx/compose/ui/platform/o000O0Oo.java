package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o000O0Oo f6439Oooo0o = new o000O0Oo();

    public o000O0Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(o000OO0O.OooO00o(it));
    }
}
