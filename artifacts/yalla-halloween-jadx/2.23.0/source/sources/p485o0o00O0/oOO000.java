package p485o0o00O0;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000 implements Observer<Response<Boolean>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f48137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f48138OooO0o0;

    public oOO000(TopicEditRuleActivity topicEditRuleActivity, String str) {
        this.f48137OooO0Oo = str;
        this.f48138OooO0o0 = topicEditRuleActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<Boolean> response) {
        if (response.getIsSuccess()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            LiveEventBus.get("TOPIC_RULE").post(this.f48137OooO0Oo);
            this.f48138OooO0o0.finish();
        }
    }
}
