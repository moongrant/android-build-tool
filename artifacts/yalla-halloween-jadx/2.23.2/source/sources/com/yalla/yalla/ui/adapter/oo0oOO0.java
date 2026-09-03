package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.YallaTeamFeedbackType;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo0oOO0 extends p571o0oOoO0.o0000oo<YallaTeamFeedbackType> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f27238OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(@NotNull Context context, @NotNull ArrayList data) {
        super(p562o0oOo000.oo0o0Oo.message_item_yalla_team_feedback_type, context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        YallaTeamFeedbackType item = (YallaTeamFeedbackType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i = p562o0oOo000.o0OO00O.tvType;
        TextView textView = (TextView) helper.getView(i);
        textView.setText(item.getTypeName());
        if (this.f27238OooOoo0 == helper.getLayoutPosition()) {
            textView.setAlpha(1.0f);
            textView.setSelected(true);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.white));
        } else {
            textView.setSelected(false);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_FF000000));
            helper.getView(i).setAlpha(0.38f);
        }
    }
}
