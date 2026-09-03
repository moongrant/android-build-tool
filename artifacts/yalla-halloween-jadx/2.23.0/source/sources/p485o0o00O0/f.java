package p485o0o00O0;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f47782OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TopicSettingActivity topicSettingActivity) {
        super(1);
        this.f47782OooO0Oo = topicSettingActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = TopicSettingActivity.f26415OooOo0O;
            TopicSettingActivity topicSettingActivity = this.f47782OooO0Oo;
            topicSettingActivity.getClass();
            O0000000 o0000000 = new O0000000();
            o0000000.OooO0O0(oO00OOo0.uploading, topicSettingActivity);
            ((TopicEditVM) topicSettingActivity.f26417OooOo0.getValue()).uploadTopicCover(uriOooO0O0).observe(topicSettingActivity, new k(o0000000, topicSettingActivity));
        }
        return Unit.INSTANCE;
    }
}
