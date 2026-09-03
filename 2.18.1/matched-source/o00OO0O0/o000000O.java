package o00OO0O0;

import android.view.View;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ChatModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31431Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f31432Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f31433Oooo0oo;

    public /* synthetic */ o000000O(Object obj, Object obj2, int i) {
        this.f31431Oooo0o = i;
        this.f31432Oooo0oO = obj;
        this.f31433Oooo0oo = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2<? super String, ? super Boolean, Unit> function2;
        switch (this.f31431Oooo0o) {
            case 0:
                o00000 this$0 = (o00000) this.f31432Oooo0oO;
                ChatModel model = (ChatModel) this.f31433Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(model, "$model");
                o0O00000.OooO0OO("InRoom_announcement");
                RoomConfiguration roomConfiguration = p159o00OoOO.o000O00O.OooO().f32427Oooo;
                if (roomConfiguration != null && (function2 = this$0.f31423OooO0oO) != null) {
                    String notice = roomConfiguration.getNotice();
                    Intrinsics.checkNotNullExpressionValue(notice, "roomConfiguration.notice");
                    function2.invoke(notice, Boolean.valueOf(com.yalla.support.common.util.OooO0OO.OooO00o(model.message)));
                    break;
                }
                break;
            default:
                TopicInfoHeadView.OooO00o((TopicInfoModel) this.f31432Oooo0oO, (TopicInfoHeadView) this.f31433Oooo0oo);
                break;
        }
    }
}
