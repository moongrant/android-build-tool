package p617o0oo0o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000 extends FunctionReferenceImpl implements Function1<Integer, Integer> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f48474Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(int i) {
        super(1, Intrinsics.Kotlin.class, "pageMapper", "HorizontalPagerAutoLooping_GmEhDVc$pageMapper(III)I", 0);
        this.f48474Oooo0o = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        return Integer.valueOf(o000000O.OooO0O0(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f48474Oooo0o, num.intValue()));
    }
}
