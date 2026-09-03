package p507o0o00ooo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOO00Oo extends FunctionReferenceImpl implements Function1<Integer, Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50110OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(int i) {
        super(1, Intrinsics.Kotlin.class, "pageMapper", "BannerComp_uuZZ4FU$pageMapper(III)I", 0);
        this.f50110OooO0Oo = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        return Integer.valueOf(oOOO00o0.OooO0OO(num.intValue() - LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f50110OooO0Oo));
    }
}
