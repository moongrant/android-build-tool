package p538o0o0Oo0;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoOOo.oOOOOo0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO00000o implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f44082OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f44083OooO0o0;

    public /* synthetic */ oO00000o(Object obj, int i) {
        this.f44082OooO0Oo = i;
        this.f44083OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f44082OooO0Oo) {
            case 0:
                TopicSearchActivity context = (TopicSearchActivity) this.f44083OooO0o0;
                TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
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
                oOOOOo0O this$0 = (oOOOOo0O) this.f44083OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f46184OoooOO0 != i) {
                    this$0.f46184OoooOO0 = i;
                    RecyclerView.Adapter adapter = this$0.f46183OoooO.f49672OooO0O0.getAdapter();
                    boolean z = false;
                    int itemCount = adapter != null ? adapter.getItemCount() : 0;
                    int i2 = this$0.f46184OoooOO0;
                    if (i2 >= 0 && i2 < itemCount) {
                        z = true;
                    }
                    if (z) {
                        this$0.f46183OoooO.f49672OooO0O0.scrollToPosition(i2);
                        oOOOOo0O.OooO0O0 oooO0O0 = this$0.f46187o000oOoO;
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
