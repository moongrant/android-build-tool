package p492o0o00OO0;

import android.net.Uri;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p182o00o000O.OooO0o;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o000000;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f49464OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(TopicSettingActivity topicSettingActivity) {
        super(1);
        this.f49464OooO0Oo = topicSettingActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = TopicSettingActivity.f25963OooOo0O;
            final TopicSettingActivity topicSettingActivity = this.f49464OooO0Oo;
            topicSettingActivity.getClass();
            final a aVar = new a();
            aVar.OooO0O0(o000000.uploading, topicSettingActivity);
            ((TopicEditVM) topicSettingActivity.f25965OooOo0.getValue()).uploadTopicCover(uriOooO0O0).observe(topicSettingActivity, new Observer() { // from class: o0o00OO0.oOO0Oo00
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    OooO0o oooO0o = (OooO0o) obj;
                    int i2 = TopicSettingActivity.f25963OooOo0O;
                    final TopicSettingActivity this$0 = topicSettingActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    aVar.OooO00o();
                    if (oooO0o != null) {
                        Intrinsics.checkNotNull(oooO0o);
                        final String strOooO00o = oooO0o.OooO00o();
                        TopicInfoModel topicInfoModel = this$0.f25966OooOo00;
                        if (topicInfoModel != null) {
                            long id = topicInfoModel.getId();
                            final a aVar2 = new a();
                            aVar2.OooO0O0(o000000.uploading, this$0);
                            ((TopicEditVM) this$0.f25965OooOo0.getValue()).changeTopicImage(id, strOooO00o).observe(this$0, new Observer() { // from class: o0o00OO0.oOO0OoO0
                                @Override // androidx.lifecycle.Observer
                                public final void onChanged(Object obj2) {
                                    int i3 = TopicSettingActivity.f25963OooOo0O;
                                    String url = strOooO00o;
                                    Intrinsics.checkNotNullParameter(url, "$url");
                                    TopicSettingActivity this$1 = this$0;
                                    Intrinsics.checkNotNullParameter(this$1, "this$0");
                                    aVar2.OooO00o();
                                    if (((Response) obj2).getIsSuccess()) {
                                        String strOooO0OO = o0000.OooO0OO(o000000.Success);
                                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                                            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o000oo0OooO00o.run();
                                            } else {
                                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                                            }
                                        }
                                        String strOooO0Oo = OooO0OO.OooO0Oo(url);
                                        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$1);
                                        oooO00o.f43126OooO0OO = strOooO0Oo;
                                        oooO00o.f43124OooO00o = 0;
                                        oooO00o.OooO0o0(4);
                                        oooO00o.OooO0Oo(this$1.OooOo().f45085OooO0o);
                                        LiveEventBus.get("TOPIC_HEADER").post(strOooO0Oo);
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
