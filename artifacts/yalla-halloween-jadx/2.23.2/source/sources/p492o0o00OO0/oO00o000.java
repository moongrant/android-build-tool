package p492o0o00OO0;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f49419OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Long f49420OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49421OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(TopicPopularMomentVM topicPopularMomentVM, int i, Long l) {
        super(0);
        this.f49419OooO0Oo = topicPopularMomentVM;
        this.f49421OooO0o0 = i;
        this.f49420OooO0o = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicPopularMomentVM topicPopularMomentVM = this.f49419OooO0Oo;
        topicPopularMomentVM.getContentState().setValue(ContentState.Loading);
        topicPopularMomentVM.loadData(true, this.f49421OooO0o0, this.f49420OooO0o.longValue());
        return Unit.INSTANCE;
    }
}
