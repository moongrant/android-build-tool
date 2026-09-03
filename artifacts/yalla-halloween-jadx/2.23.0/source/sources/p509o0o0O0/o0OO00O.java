package p509o0o0O0;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p063o0000oO.o00Ooo;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O extends Lambda implements Function1<TopicGroupInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f51173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f51174OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(long j, String str) {
        super(1);
        this.f51173OooO0Oo = j;
        this.f51174OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupInfoModel topicGroupInfoModel) {
        TopicGroupInfoModel topicGroupInfoModel2 = topicGroupInfoModel;
        if (topicGroupInfoModel2 != null) {
            if (topicGroupInfoModel2.getIsDisbanded() || topicGroupInfoModel2.getCircleUserIsCancel()) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.topic_group_join_dissolved);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                topicGroupInfoModel2.setLocalTopicId(this.f51173OooO0Oo);
                topicGroupInfoModel2.setLocalTopicName(this.f51174OooO0o0);
                oo0oOO0.OooO0o0(TopicGroupJoinScreen.INSTANCE, o00Ooo.OooO0O0(TuplesKt.to("DATA", topicGroupInfoModel2)), false, null, 12);
            }
        }
        return Unit.INSTANCE;
    }
}
