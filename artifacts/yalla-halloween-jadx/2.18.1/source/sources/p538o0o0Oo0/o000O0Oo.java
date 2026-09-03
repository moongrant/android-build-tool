package p538o0o0Oo0;

import android.content.Intent;
import android.os.Bundle;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p620o0oo0o0O.o00O00OO;
import p620o0oo0o0O.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43927Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(MomentSendActivity momentSendActivity) {
        super(0);
        this.f43927Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final MomentSendActivity momentSendActivity = this.f43927Oooo0o;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        if (!momentSendActivity.Oooo00O().isInEdit()) {
            if (momentSendActivity.OooOooo().getType() == MomentType.Forward.getValue()) {
                o0O00000.OooO0OO("Moments_repost_AddTopic");
            }
            o0O00000.OooO0OO("Moments_post_topic");
            momentSendActivity.OooOooO().f48991OooO0oo.OooO0O0();
            o00O00o0 o00o00o1 = new o00O00o0() { // from class: o0o0Oo0.o0000O0
                @Override // p620o0oo0o0O.o00O00o0
                public final void onActivityResult(int i, Intent intent) {
                    MomentSendActivity this$0 = momentSendActivity;
                    MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22367o00oO0o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (i != -1 || intent == null || intent.getSerializableExtra("Data") == null) {
                        return;
                    }
                    this$0.f22373OooooOo = (TopicInfoModel) intent.getSerializableExtra("Data");
                    this$0.OooOooO().f48995OooOOO0.setData(this$0.f22373OooooOo);
                    this$0.OooOooO().f48983OooO.setTopicInfoModel(this$0.f22373OooooOo);
                }
            };
            try {
                Bundle bundle = new Bundle();
                o00O00OO o00o00oo2 = new o00O00OO(momentSendActivity);
                o00o00oo2.f48618OooO0O0 = AddTopicListActivity.class;
                o00o00oo2.OooO00o(bundle);
                o00o00oo2.OooO0O0(o00o00o1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Unit.INSTANCE;
    }
}
