package o00OO0O0;

import android.view.View;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ChatModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p393o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31449Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f31450OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31451OoooO00;

    public /* synthetic */ o000000O(Object obj, Object obj2, int i) {
        this.f31449Oooo = i;
        this.f31451OoooO00 = obj;
        this.f31450OoooO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2<? super String, ? super Boolean, Unit> function2;
        switch (this.f31449Oooo) {
            case 0:
                o00000 this$0 = (o00000) this.f31451OoooO00;
                ChatModel model = (ChatModel) this.f31450OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(model, "$model");
                o0O00000.OooO0OO("InRoom_announcement");
                RoomConfiguration roomConfiguration = p160o00OoOO.o000O00O.OooO().f32453OoooO0O;
                if (roomConfiguration != null && (function2 = this$0.f31441OooO0oO) != null) {
                    String notice = roomConfiguration.getNotice();
                    Intrinsics.checkNotNullExpressionValue(notice, "roomConfiguration.notice");
                    function2.invoke(notice, Boolean.valueOf(com.yalla.support.common.util.OooO0OO.OooO00o(model.message)));
                    break;
                }
                break;
            default:
                TopicInfoHeadView.OooO00o((TopicInfoModel) this.f31451OoooO00, (TopicInfoHeadView) this.f31450OoooO0);
                break;
        }
    }
}
