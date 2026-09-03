package p543o0o0Ooo0;

import android.content.Context;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$TopicItem$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n1#2:538\n*E\n"})
public final class s1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f55678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f55679OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(Context context, TopicInfoModel topicInfoModel) {
        super(0);
        this.f55678OooO0Oo = context;
        this.f55679OooO0o0 = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = TopicDetailActivity.f25854OooOoOO;
        TopicDetailActivity.OooO00o.OooO00o(this.f55678OooO0Oo, this.f55679OooO0o0);
        return Unit.INSTANCE;
    }
}
