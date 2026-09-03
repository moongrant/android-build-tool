package p492o0o00OO0;

import android.content.Intent;
import android.os.Bundle;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p604o0oo0O0.OooOo;
import p604o0oo0O0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49208OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(MomentSendActivity momentSendActivity) {
        super(0);
        this.f49208OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentSendActivity.f25726Oooo0OO;
        final MomentSendActivity momentSendActivity = this.f49208OooO0Oo;
        if (!momentSendActivity.OooOoOO().isInEdit()) {
            OooO00o.OooO0O0("203009");
            momentSendActivity.OooOo().f44320OooO0o.OooO0o0();
            Oooo000 oooo000 = new Oooo000() { // from class: o0o00OO0.o0o0Oo
                @Override // p604o0oo0O0.Oooo000
                public final void onActivityResult(int i2, Intent intent) {
                    int i3 = MomentSendActivity.f25726Oooo0OO;
                    MomentSendActivity this$0 = momentSendActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (i2 != -1 || intent == null || intent.getSerializableExtra("Data") == null) {
                        return;
                    }
                    this$0.f25728OooOo = (TopicInfoModel) intent.getSerializableExtra("Data");
                    this$0.OooOo().f44324OooOO0.setData(this$0.f25728OooOo);
                    this$0.OooOo().f44322OooO0oO.setTopicInfoModel(this$0.f25728OooOo);
                }
            };
            try {
                Bundle bundle = new Bundle();
                OooOo oooOo = new OooOo(momentSendActivity);
                oooOo.f57388OooO0O0 = AddTopicListActivity.class;
                oooOo.OooO00o(bundle);
                oooOo.OooO0O0(oooo000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Unit.INSTANCE;
    }
}
