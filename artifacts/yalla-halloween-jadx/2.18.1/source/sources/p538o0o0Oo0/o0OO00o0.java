package p538o0o0Oo0;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f44033Oooo;

    public o0OO00o0(TopicInfoActivity topicInfoActivity) {
        this.f44033Oooo = topicInfoActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@Nullable View view) {
        TopicInfoModel topicInfo = this.f44033Oooo.f22625Ooooo00;
        if (topicInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfo = null;
        }
        TopicInfoActivity context = this.f44033Oooo;
        TopicSettingActivity.OooO00o oooO00o = TopicSettingActivity.f22666OooooO0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
        Intent intent = new Intent(context, (Class<?>) TopicSettingActivity.class);
        intent.putExtra("info", topicInfo);
        context.startActivity(intent);
    }
}
