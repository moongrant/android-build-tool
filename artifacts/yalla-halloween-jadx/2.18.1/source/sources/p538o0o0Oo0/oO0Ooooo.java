package p538o0o0Oo0;

import android.net.Uri;
import androidx.lifecycle.Observer;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p616o0oo0Ooo.oO0O00;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0Ooooo extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f44097Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(TopicSettingActivity topicSettingActivity) {
        super(1);
        this.f44097Oooo0o = topicSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            final TopicSettingActivity topicSettingActivity = this.f44097Oooo0o;
            TopicSettingActivity.OooO00o oooO00o = TopicSettingActivity.f22666OooooO0;
            Objects.requireNonNull(topicSettingActivity);
            final o000O o000o = new o000O();
            o000o.OooO0O0(topicSettingActivity, R.string.uploading);
            topicSettingActivity.OooOooO().uploadTopicCover(uriOooO0O0).observe(topicSettingActivity, new Observer() { // from class: o0o0Oo0.oO000
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o000O o000o2 = o000o;
                    final TopicSettingActivity this$0 = topicSettingActivity;
                    CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                    TopicSettingActivity.OooO00o oooO00o2 = TopicSettingActivity.f22666OooooO0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    o000o2.OooO00o();
                    if (cloudFileInfo != null) {
                        Intrinsics.checkNotNull(cloudFileInfo);
                        final String url = cloudFileInfo.getUrl();
                        TopicInfoModel topicInfoModel = this$0.f22668Ooooo00;
                        if (topicInfoModel != null) {
                            long id = topicInfoModel.getId();
                            final o000O o000o3 = new o000O();
                            o000o3.OooO0O0(this$0, R.string.uploading);
                            this$0.OooOooO().changeTopicImage(id, url).observe(this$0, new Observer() { // from class: o0o0Oo0.oO000O0
                                @Override // androidx.lifecycle.Observer
                                public final void onChanged(Object obj2) {
                                    o000O o000o4 = o000o3;
                                    String url2 = url;
                                    TopicSettingActivity this$1 = this$0;
                                    TopicSettingActivity.OooO00o oooO00o3 = TopicSettingActivity.f22666OooooO0;
                                    Intrinsics.checkNotNullParameter(url2, "$url");
                                    Intrinsics.checkNotNullParameter(this$1, "this$0");
                                    o000o4.OooO00o();
                                    if (((Response) obj2).getIsSuccess()) {
                                        ToastUtil.f12567OooO00o.OooO00o(R.string.Success);
                                        String strImgFormat = CloudImageUtilKt.imgFormat(url2);
                                        oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(this$1);
                                        oooO00o4.f48429OooO0OO = strImgFormat;
                                        oooO00o4.f48427OooO00o = 0;
                                        oooO00o4.OooO0oO(4);
                                        oooO00o4.OooO0o(this$1.OooOoo().f49368OooO0o);
                                        LiveEventBus.get("TOPIC_HEADER").post(strImgFormat);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
