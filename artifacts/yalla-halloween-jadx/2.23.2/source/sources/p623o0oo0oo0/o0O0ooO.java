package p623o0oo0oo0;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o0O0ooO extends FunctionReferenceImpl implements Function1<LazyListItemInfo, o00O000> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0ooO f57653OooO0Oo = new o0O0ooO();

    public o0O0ooO() {
        super(1, o00O000.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final o00O000 invoke(LazyListItemInfo lazyListItemInfo) {
        LazyListItemInfo p0 = lazyListItemInfo;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new o00O000(p0);
    }
}
