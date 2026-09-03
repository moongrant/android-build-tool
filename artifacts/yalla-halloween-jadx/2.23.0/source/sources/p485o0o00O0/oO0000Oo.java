package p485o0o00O0;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p362o0OOo0O.OooOO0;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f48035OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(TopicCreateActivity topicCreateActivity) {
        super(1);
        this.f48035OooO0Oo = topicCreateActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = TopicCreateActivity.f26287OooOo0O;
            TopicCreateActivity topicCreateActivity = this.f48035OooO0Oo;
            topicCreateActivity.getClass();
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(topicCreateActivity);
            oooO00o.f43911OooO0OO = uriOooO0O0.toString();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0o0(4);
            oooO00o.f43923OooOOOo = oOo00OO0.ic_header_placeholder_color;
            oooO00o.OooO0Oo(topicCreateActivity.OooOo().f57587OooO0OO.f58952OooO0O0);
            O0000000 o0000000 = new O0000000();
            o0000000.OooO0O0(oO00OOo0.uploading, topicCreateActivity);
            ((TopicEditVM) topicCreateActivity.f26290OooOo00.getValue()).uploadTopicCover(uriOooO0O0).observe(topicCreateActivity, new oO000(o0000000, topicCreateActivity));
        }
        return Unit.INSTANCE;
    }
}
