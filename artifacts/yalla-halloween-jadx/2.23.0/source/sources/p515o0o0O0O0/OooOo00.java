package p515o0o0O0O0;

import com.code.android.util.o000O00O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f51788OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51789OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Long f51790OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(int i, Long l, MomentDetailModel momentDetailModel) {
        super(1);
        this.f51788OooO0Oo = i;
        this.f51790OooO0o0 = l;
        this.f51789OooO0o = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        Long l = this.f51790OooO0o0;
        int i = this.f51788OooO0Oo;
        if (i == 1) {
            o000O00O.OooO00o(oO00OOo0.user_top_pinned);
            long jLongValue = l.longValue();
            MomentDetailModel momentDetailModel = this.f51789OooO0o;
            LiveEventBus.get("MOMENT_TOP_OF_TOPIC").post(new OnTopPostForTopicModel(jLongValue, momentDetailModel != null ? momentDetailModel.getId() : 0L));
        } else if (i == 2) {
            o000O00O.OooO00o(oO00OOo0.user_top_unpinned);
            LiveEventBus.get("MOMENT_UN_TOP_OF_TOPIC").post(new OnTopPostForTopicModel(l.longValue(), 0L));
        }
        return Unit.INSTANCE;
    }
}
