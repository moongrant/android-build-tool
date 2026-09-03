package p519o0o0O0OO;

import android.content.Context;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f52111OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f52112OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(Context context, TopicInfoModel topicInfoModel) {
        super(0);
        this.f52111OooO0Oo = context;
        this.f52112OooO0o0 = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = TopicDetailActivity.f25854OooOoOO;
        TopicDetailActivity.OooO00o.OooO00o(this.f52111OooO0Oo, this.f52112OooO0o0);
        return Unit.INSTANCE;
    }
}
