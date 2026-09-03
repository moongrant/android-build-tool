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
import p579o0oOoOOo.O0000000;
import p579o0oOoOOo.O0OO00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31434Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f31435Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f31436Oooo0oo;

    public /* synthetic */ o00000O(Object obj, Object obj2, int i) {
        this.f31434Oooo0o = i;
        this.f31435Oooo0oO = obj;
        this.f31436Oooo0oo = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31434Oooo0o) {
            case 0:
                ChatModel model = (ChatModel) this.f31435Oooo0oO;
                o0000Ooo this$0 = (o0000Ooo) this.f31436Oooo0oo;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p606o0oo0O.OooOo.OooO0OO(model.eventModel.getHasSubscribe() ? "102003" : "102002", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(model.eventModel.getId()))));
                Function0<Unit> function0 = this$0.f31460OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                O0000000 this$1 = (O0000000) this.f31435Oooo0oO;
                p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) this.f31436Oooo0oo;
                int i = O0OO00.f45895OooO0O0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f45879Ooooo00 = oooO0o.getLayoutPosition();
                O0000000.OooOOO(this$1, view, null, 2);
                break;
            default:
                TopicInfoHeadView this$2 = (TopicInfoHeadView) this.f31435Oooo0oO;
                TextView this_apply = (TextView) this.f31436Oooo0oo;
                int i2 = TopicInfoHeadView.f25226Oooo0oo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                if (this$2.f25227Oooo0o.f49514OooOOO0.getMaxLines() != 2) {
                    p522o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_bottom_gray));
                    this$2.f25227Oooo0o.f49514OooOOO0.setMaxLines(2);
                } else {
                    p522o0o0O0o.oo0o0O0.OooO0oO(this_apply, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_arrow_top_gray));
                    this$2.f25227Oooo0o.f49514OooOOO0.setMaxLines(Integer.MAX_VALUE);
                }
                break;
        }
    }
}
