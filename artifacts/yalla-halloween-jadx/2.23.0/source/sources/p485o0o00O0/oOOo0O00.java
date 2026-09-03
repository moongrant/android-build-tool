package p485o0o00O0;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0O00 implements Observer<List<? extends SearchHistoryTable>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f48178OooO0Oo;

    public oOOo0O00(TopicSearchActivity topicSearchActivity) {
        this.f48178OooO0Oo = topicSearchActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends SearchHistoryTable> list) {
        List<? extends SearchHistoryTable> it = list;
        int i = TopicSearchActivity.f26398OooOoo0;
        TopicSearchActivity topicSearchActivity = this.f48178OooO0Oo;
        Group group = topicSearchActivity.OooOoo0().f59377OooO0OO;
        Intrinsics.checkNotNullExpressionValue(group, "recommendHeaderView.groupSearch");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000OO00.OooOOO0(group, !it.isEmpty());
        topicSearchActivity.OooOoo0().f59376OooO0O0.removeAllViews();
        for (SearchHistoryTable searchHistoryTable : it) {
            View viewInflate = View.inflate(topicSearchActivity, oO00OO0O.tv_search_history, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(this, R.layout.tv_search_history, null)");
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(oO00O0oO.tag_item_relative);
            View childAt = relativeLayout.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setText(searchHistoryTable.getTag());
            relativeLayout.setOnClickListener(new oOOOoo00(topicSearchActivity, 0));
            topicSearchActivity.OooOoo0().f59376OooO0O0.addView(relativeLayout);
        }
    }
}
