package p616o0oo0oO;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o0000O0O extends FunctionReferenceImpl implements Function1<LazyListItemInfo, o0000O> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000O0O f57099OooO0Oo = new o0000O0O();

    public o0000O0O() {
        super(1, o0000O.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0000O invoke(LazyListItemInfo lazyListItemInfo) {
        LazyListItemInfo p0 = lazyListItemInfo;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new o0000O(p0);
    }
}
