package p538o0o0Oo0;

import android.net.Uri;
import androidx.lifecycle.Observer;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p616o0oo0Ooo.oO0O00;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0Ooo extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f44067Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(TopicCreateActivity topicCreateActivity) {
        super(1);
        this.f44067Oooo0o = topicCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            final TopicCreateActivity topicCreateActivity = this.f44067Oooo0o;
            int i = TopicCreateActivity.f22549OooooO0;
            Objects.requireNonNull(topicCreateActivity);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(topicCreateActivity);
            oooO00o.f48429OooO0OO = uriOooO0O0.toString();
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0oO(4);
            oooO00o.f48441OooOOOo = R.drawable.ic_header_placeholder_color;
            oooO00o.OooO0o(topicCreateActivity.OooOoo().f50889OooO0OO.f50969OooO0O0);
            final o000O o000o = new o000O();
            o000o.OooO0O0(topicCreateActivity, R.string.uploading);
            topicCreateActivity.OooOooO().uploadTopicCover(uriOooO0O0).observe(topicCreateActivity, new Observer() { // from class: o0o0Oo0.o0O00OO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o000O loadingDialog = o000o;
                    TopicCreateActivity this$0 = topicCreateActivity;
                    CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                    int i2 = TopicCreateActivity.f22549OooooO0;
                    Intrinsics.checkNotNullParameter(loadingDialog, "$loadingDialog");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    loadingDialog.OooO00o();
                    if (!(cloudFileInfo != null)) {
                        ToastUtil.f12567OooO00o.OooO00o(R.string.Image_upload_failed);
                        return;
                    }
                    Intrinsics.checkNotNull(cloudFileInfo);
                    this$0.f22552Ooooo0o = cloudFileInfo.getUrl();
                    this$0.OooOooo();
                }
            });
        }
        return Unit.INSTANCE;
    }
}
