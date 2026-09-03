package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O000o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f49429OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f49430OooO0o0;

    public /* synthetic */ oO0O000o(TopicEditDescActivity topicEditDescActivity, String str) {
        this.f49429OooO0Oo = str;
        this.f49430OooO0o0 = topicEditDescActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = TopicEditDescActivity.f25898OooOo0o;
        String desc = this.f49429OooO0Oo;
        Intrinsics.checkNotNullParameter(desc, "$desc");
        TopicEditDescActivity this$0 = this.f49430OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((Response) obj).getIsSuccess()) {
            String strOooO0OO = o0000.OooO0OO(o000000.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            LiveEventBus.get("TOPIC_DESC").post(desc);
            this$0.finish();
        }
    }
}
