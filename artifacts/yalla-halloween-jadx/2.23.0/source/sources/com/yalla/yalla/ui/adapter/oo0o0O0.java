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
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0O0 extends p564o0oOo0OO.o000O<YallaTeamFeedbackType> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f27694OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(@NotNull Context context, @NotNull ArrayList data) {
        super(oO00OO0O.message_item_yalla_team_feedback_type, context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        YallaTeamFeedbackType item = (YallaTeamFeedbackType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i = oO00O0oO.tvType;
        TextView textView = (TextView) helper.getView(i);
        textView.setText(item.getTypeName());
        if (this.f27694OooOoo0 == helper.getLayoutPosition()) {
            textView.setAlpha(1.0f);
            textView.setSelected(true);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.white));
        } else {
            textView.setSelected(false);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_FF000000));
            helper.getView(i).setAlpha(0.38f);
        }
    }
}
