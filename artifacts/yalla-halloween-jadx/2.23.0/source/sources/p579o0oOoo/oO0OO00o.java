package p579o0oOoo;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oO0OO00o implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2 f56604OooO0Oo;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function2 tmp0 = this.f56604OooO0Oo;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}
