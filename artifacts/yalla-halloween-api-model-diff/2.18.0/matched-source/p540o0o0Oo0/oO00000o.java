package p540o0o0Oo0;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.jvm.internal.Intrinsics;
import p581o0oOoOOo.oOOOoo00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO00000o implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44097Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44098OoooO00;

    public /* synthetic */ oO00000o(Object obj, int i) {
        this.f44097Oooo = i;
        this.f44098OoooO00 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f44097Oooo) {
            case 0:
                TopicSearchActivity context = (TopicSearchActivity) this.f44098OoooO00;
                TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22673OoooooO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                TopicInfoModel topicInfoModel = context.OooOoo().getData().get(i);
                Intrinsics.checkNotNullExpressionValue(topicInfoModel, "baseAdapter.data[position]");
                TopicInfoModel topicInfo = topicInfoModel;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
                Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
                intent.putExtra("topic", topicInfo);
                context.startActivity(intent);
                break;
            default:
                oOOOoo00 this$0 = (oOOOoo00) this.f44098OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f46194OoooOOo != i) {
                    this$0.f46194OoooOOo = i;
                    RecyclerView.Adapter adapter = this$0.f46193OoooOOO.f49609OooO0O0.getAdapter();
                    boolean z = false;
                    int itemCount = adapter != null ? adapter.getItemCount() : 0;
                    int i2 = this$0.f46194OoooOOo;
                    if (i2 >= 0 && i2 < itemCount) {
                        z = true;
                    }
                    if (z) {
                        this$0.f46193OoooOOO.f49609OooO0O0.scrollToPosition(i2);
                        oOOOoo00.OooO0O0 oooO0O0 = this$0.f46195OoooOo0;
                        if (oooO0O0 != null) {
                            oooO0O0.notifyDataSetChanged();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
