package p519o0o0O0OO;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p063o0000oO.o000oOoO;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function1<TopicGroupInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f52709OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f52710OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(long j, String str) {
        super(1);
        this.f52709OooO0Oo = j;
        this.f52710OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupInfoModel topicGroupInfoModel) {
        TopicGroupInfoModel topicGroupInfoModel2 = topicGroupInfoModel;
        if (topicGroupInfoModel2 != null) {
            if (topicGroupInfoModel2.getIsDisbanded() || topicGroupInfoModel2.getCircleUserIsCancel()) {
                String strOooO0OO = o0000.OooO0OO(o000000.topic_group_join_dissolved);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                topicGroupInfoModel2.setLocalTopicId(this.f52709OooO0Oo);
                topicGroupInfoModel2.setLocalTopicName(this.f52710OooO0o0);
                o00O00.OooO0o0(TopicGroupJoinScreen.INSTANCE, o000oOoO.OooO0O0(TuplesKt.to("DATA", topicGroupInfoModel2)), false, null, 12);
            }
        }
        return Unit.INSTANCE;
    }
}
