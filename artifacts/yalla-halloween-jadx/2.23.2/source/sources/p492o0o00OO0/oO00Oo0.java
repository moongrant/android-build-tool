package p492o0o00OO0;

import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f49403OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Long f49404OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49405OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo0(TopicPopularMomentVM topicPopularMomentVM, int i, Long l) {
        super(0);
        this.f49403OooO0Oo = topicPopularMomentVM;
        this.f49405OooO0o0 = i;
        this.f49404OooO0o = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue = this.f49404OooO0o.longValue();
        this.f49403OooO0Oo.loadData(true, this.f49405OooO0o0, jLongValue);
        return Unit.INSTANCE;
    }
}
