package p485o0o00O0;

import android.content.Intent;
import android.os.Bundle;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;
import p599o0oo00oo.o0000O;
import p599o0oo00oo.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47889OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(MomentSendActivity momentSendActivity) {
        super(0);
        this.f47889OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentSendActivity.f26175Oooo0OO;
        final MomentSendActivity momentSendActivity = this.f47889OooO0Oo;
        if (!momentSendActivity.OooOoOO().isInEdit()) {
            o0OO000.OooO00o("203009");
            momentSendActivity.OooOo().f58558OooO0o.OooO0o0();
            o0000O o0000o2 = new o0000O() { // from class: o0o00O0.o00Oo00
                @Override // p599o0oo00oo.o0000O
                public final void onActivityResult(int i2, Intent intent) {
                    int i3 = MomentSendActivity.f26175Oooo0OO;
                    MomentSendActivity this$0 = momentSendActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (i2 != -1 || intent == null || intent.getSerializableExtra("Data") == null) {
                        return;
                    }
                    this$0.f26177OooOo = (TopicInfoModel) intent.getSerializableExtra("Data");
                    this$0.OooOo().f58562OooOO0.setData(this$0.f26177OooOo);
                    this$0.OooOo().f58560OooO0oO.setTopicInfoModel(this$0.f26177OooOo);
                }
            };
            try {
                Bundle bundle = new Bundle();
                o000OO o000oo2 = new o000OO(momentSendActivity);
                o000oo2.f56864OooO0O0 = AddTopicListActivity.class;
                o000oo2.OooO00o(bundle);
                o000oo2.OooO0O0(o0000o2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Unit.INSTANCE;
    }
}
