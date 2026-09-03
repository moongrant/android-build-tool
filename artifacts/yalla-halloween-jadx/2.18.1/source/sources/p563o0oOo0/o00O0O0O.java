package p563o0oOo0;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.YallaTeamFeedbackType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O0O extends OooO0OO<YallaTeamFeedbackType> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f45086OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(@NotNull Context context, @NotNull List<YallaTeamFeedbackType> data) {
        super(context, R.layout.message_item_yalla_team_feedback_type, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        YallaTeamFeedbackType item = (YallaTeamFeedbackType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.OooO0Oo(R.id.tvType);
        textView.setText(item.getTypeName());
        if (this.f45086OooO00o == helper.getLayoutPosition()) {
            textView.setAlpha(1.0f);
            textView.setSelected(true);
            textView.setTextColor(o000O0O0.OooO00o(R.color.white));
        } else {
            textView.setSelected(false);
            textView.setTextColor(o000O0O0.OooO00o(R.color.color_FF000000));
            helper.OooO0Oo(R.id.tvType).setAlpha(0.38f);
        }
    }
}
