package p492o0o00OO0;

import android.os.Looper;
import android.view.View;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O00 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f49435OooO0oO;

    public oO0O0O00(TopicEditRuleActivity topicEditRuleActivity) {
        this.f49435OooO0oO = topicEditRuleActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@Nullable View view) {
        int i = TopicEditRuleActivity.f25907OooOo0o;
        final TopicEditRuleActivity topicEditRuleActivity = this.f49435OooO0oO;
        final String string = StringsKt.trim((CharSequence) topicEditRuleActivity.OooOo().f45045OooO0O0.getText().toString()).toString();
        ((TopicEditVM) topicEditRuleActivity.f25911OooOo0O.getValue()).changeTopicRule(topicEditRuleActivity.f25909OooOo0, string).observe(topicEditRuleActivity, new Observer() { // from class: o0o00OO0.oO0O00oO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i2 = TopicEditRuleActivity.f25907OooOo0o;
                String rule = string;
                Intrinsics.checkNotNullParameter(rule, "$rule");
                TopicEditRuleActivity this$0 = topicEditRuleActivity;
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
                    LiveEventBus.get("TOPIC_RULE").post(rule);
                    this$0.finish();
                }
            }
        });
    }
}
