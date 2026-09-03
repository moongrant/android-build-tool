package p485o0o00O0;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000OOo extends Lambda implements Function1<Response<Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f48040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48041OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(TopicDetailActivity topicDetailActivity, boolean z) {
        super(1);
        this.f48040OooO0Oo = z;
        this.f48041OooO0o0 = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Response<Integer> response) {
        String string;
        Response<Integer> response2 = response;
        if (response2.getIsSuccess()) {
            boolean z = this.f48040OooO0Oo;
            if (z) {
                Integer data = response2.getData();
                if (data != null && (string = data.toString()) != null) {
                    String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.follow_topic_success_tip), string);
                    if (!StringsKt.isBlank(strOooO00o)) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                }
            } else {
                o0OO000.OooO00o("103036");
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.topic_Unfollowed);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            }
            int i = TopicDetailActivity.f26305OooOoOO;
            TopicInfoModel value = this.f48041OooO0o0.OooOoo0().getTopicDetailLocal().getValue();
            if (value != null) {
                LiveEventBus.get("TOPIC_FOLLOW_CHANGE").post(new TopicFollowChange(value.getId(), z));
            }
        }
        return Unit.INSTANCE;
    }
}
