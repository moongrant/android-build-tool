package p485o0o00O0;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Observer<Response<Boolean>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ O0000000 f47786OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f47787OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f47788OooO0o0;

    public j(O0000000 o0000000, String str, TopicSettingActivity topicSettingActivity) {
        this.f47786OooO0Oo = o0000000;
        this.f47788OooO0o0 = str;
        this.f47787OooO0o = topicSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<Boolean> response) {
        this.f47786OooO0Oo.OooO00o();
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
            String strOooO0Oo = OooO0o.OooO0Oo(this.f47788OooO0o0);
            TopicSettingActivity topicSettingActivity = this.f47787OooO0o;
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(topicSettingActivity);
            oooO00o.f43911OooO0OO = strOooO0Oo;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0o0(4);
            int i = TopicSettingActivity.f26415OooOo0O;
            oooO00o.OooO0Oo(topicSettingActivity.OooOo().f58270OooO0o);
            LiveEventBus.get("TOPIC_HEADER").post(strOooO0Oo);
        }
    }
}
