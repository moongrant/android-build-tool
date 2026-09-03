package p492o0o00OO0;

import android.net.Uri;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p182o00o000O.OooO0o;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f49354OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(TopicCreateActivity topicCreateActivity) {
        super(1);
        this.f49354OooO0Oo = topicCreateActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = TopicCreateActivity.f25836OooOo0O;
            final TopicCreateActivity topicCreateActivity = this.f49354OooO0Oo;
            topicCreateActivity.getClass();
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(topicCreateActivity);
            oooO00o.f43126OooO0OO = uriOooO0O0.toString();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0o0(4);
            oooO00o.f43138OooOOOo = o0Oo0oo.ic_header_placeholder_color;
            oooO00o.OooO0Oo(topicCreateActivity.OooOo().f45027OooO0OO.f45002OooO0O0);
            final a aVar = new a();
            aVar.OooO0O0(o000000.uploading, topicCreateActivity);
            ((TopicEditVM) topicCreateActivity.f25839OooOo00.getValue()).uploadTopicCover(uriOooO0O0).observe(topicCreateActivity, new Observer() { // from class: o0o00OO0.o0OOo000
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    OooO0o oooO0o = (OooO0o) obj;
                    int i2 = TopicCreateActivity.f25836OooOo0O;
                    a loadingDialog = aVar;
                    Intrinsics.checkNotNullParameter(loadingDialog, "$loadingDialog");
                    TopicCreateActivity this$0 = topicCreateActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    loadingDialog.OooO00o();
                    boolean z = true;
                    if (oooO0o != null) {
                        Intrinsics.checkNotNull(oooO0o);
                        this$0.f25838OooOo0 = oooO0o.OooO00o();
                        this$0.OooOoO0();
                        return;
                    }
                    String strOooO0OO = o0000.OooO0OO(o000000.Image_upload_failed);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
