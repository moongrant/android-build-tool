package p509o0o0O0;

import android.content.Context;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f50498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f50499OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(Context context, TopicInfoModel topicInfoModel) {
        super(0);
        this.f50498OooO0Oo = context;
        this.f50499OooO0o0 = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity.OooO00o.OooO00o(this.f50498OooO0Oo, this.f50499OooO0o0);
        return Unit.INSTANCE;
    }
}
