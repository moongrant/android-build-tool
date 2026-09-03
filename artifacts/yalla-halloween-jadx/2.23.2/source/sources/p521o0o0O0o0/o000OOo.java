package p521o0o0O0o0;

import com.code.android.util.o000O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52977OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52978OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Long f52979OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(int i, Long l, MomentDetailModel momentDetailModel) {
        super(1);
        this.f52977OooO0Oo = i;
        this.f52979OooO0o0 = l;
        this.f52978OooO0o = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        Long l = this.f52979OooO0o0;
        int i = this.f52977OooO0Oo;
        if (i == 1) {
            o000O00.OooO00o(o000000.user_top_pinned);
            long jLongValue = l.longValue();
            MomentDetailModel momentDetailModel = this.f52978OooO0o;
            LiveEventBus.get("MOMENT_TOP_OF_TOPIC").post(new OnTopPostForTopicModel(jLongValue, momentDetailModel != null ? momentDetailModel.getId() : 0L));
        } else if (i == 2) {
            o000O00.OooO00o(o000000.user_top_unpinned);
            LiveEventBus.get("MOMENT_UN_TOP_OF_TOPIC").post(new OnTopPostForTopicModel(l.longValue(), 0L));
        }
        return Unit.INSTANCE;
    }
}
