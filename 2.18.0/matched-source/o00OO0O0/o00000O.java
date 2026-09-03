package o00OO0O0;

import android.view.View;
import android.widget.TextView;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p581o0oOoOOo.O0O0;
import p581o0oOoOOo.oo00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31452Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f31453OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31454OoooO00;

    public /* synthetic */ o00000O(Object obj, Object obj2, int i) {
        this.f31452Oooo = i;
        this.f31454OoooO00 = obj;
        this.f31453OoooO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31452Oooo) {
            case 0:
                ChatModel model = (ChatModel) this.f31454OoooO00;
                o0000Ooo this$0 = (o0000Ooo) this.f31453OoooO0;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p608o0oo0O.OooOo.OooO0OO(model.eventModel.getHasSubscribe() ? "102003" : "102002", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(model.eventModel.getId()))));
                Function0<Unit> function0 = this$0.f31478OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                oo00 this$1 = (oo00) this.f31454OoooO00;
                p189o00o00o0.OooO0o oooO0o = (p189o00o00o0.OooO0o) this.f31453OoooO0;
                int i = O0O0.f45889OooO0O0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f46240OooooOO = oooO0o.getLayoutPosition();
                oo00.OooOOO(this$1, view, null, 2);
                break;
            default:
                TopicInfoHeadView this$2 = (TopicInfoHeadView) this.f31454OoooO00;
                TextView this_apply = (TextView) this.f31453OoooO0;
                int i2 = TopicInfoHeadView.f25245OoooO0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                if (this$2.f25246Oooo.f49451OooOOO0.getMaxLines() != 2) {
                    p524o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_bottom_gray));
                    this$2.f25246Oooo.f49451OooOOO0.setMaxLines(2);
                } else {
                    p524o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_top_gray));
                    this$2.f25246Oooo.f49451OooOOO0.setMaxLines(Integer.MAX_VALUE);
                }
                break;
        }
    }
}
