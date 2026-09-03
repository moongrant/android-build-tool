package p492o0o00OO0;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicInfoActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicInfoActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class oOo0oooO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f49537OooO0oO;

    public oOo0oooO(TopicInfoActivity topicInfoActivity) {
        this.f49537OooO0oO = topicInfoActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@Nullable View view) {
        TopicInfoActivity context = this.f49537OooO0oO;
        TopicInfoModel topicInfo = context.f25920OooOo00;
        if (topicInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfo = null;
        }
        int i = TopicSettingActivity.f25963OooOo0O;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
        Intent intent = new Intent(context, (Class<?>) TopicSettingActivity.class);
        intent.putExtra("info", topicInfo);
        context.startActivity(intent);
    }
}
