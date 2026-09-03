package p485o0o00O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0000O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f48180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f48181OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48182OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f48183OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f48184OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(TopicPopularMomentVM topicPopularMomentVM, int i, TopicDetailVM topicDetailVM, Function0<Unit> function0, int i2) {
        super(2);
        this.f48180OooO0Oo = topicPopularMomentVM;
        this.f48182OooO0o0 = i;
        this.f48181OooO0o = topicDetailVM;
        this.f48183OooO0oO = function0;
        this.f48184OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oOo000o0.OooO0O0(this.f48180OooO0Oo, this.f48182OooO0o0, this.f48181OooO0o, this.f48183OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f48184OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
