package com.yalla.yalla.mixedroom;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p493o0o00O0o.i2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOO0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23028OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f23029OooO0o0;

    public /* synthetic */ OooOO0O(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f23028OooO0Oo = i;
        this.f23029OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23028OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f23029OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) baseFragmentActivity;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                MixedRoomActivity.OooO0O0 oooO0O0 = mixedRoomActivity.f22962OooOOo;
                if (oooO0O0 != null) {
                    mixedRoomActivity.unbindService(oooO0O0);
                    mixedRoomActivity.f22962OooOOo = null;
                }
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) baseFragmentActivity;
                int i3 = PhoneBindActivity.f24788OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                TopicSearchActivity this$1 = (TopicSearchActivity) baseFragmentActivity;
                List<SearchHistoryTable> list = (List) obj;
                int i4 = TopicSearchActivity.f25949OooOoo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Group groupSearch = this$1.OooOoo0().f44598OooO0OO;
                Intrinsics.checkNotNullExpressionValue(groupSearch, "groupSearch");
                Intrinsics.checkNotNull(list);
                o000O.OooOOO0(groupSearch, !list.isEmpty());
                this$1.OooOoo0().f44597OooO0O0.removeAllViews();
                for (SearchHistoryTable searchHistoryTable : list) {
                    View viewInflate = View.inflate(this$1, p565o0oOo000.o0OO00O.tv_search_history, null);
                    Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(p565o0oOo000.o0Oo0oo.tag_item_relative);
                    View childAt = relativeLayout.getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) childAt).setText(searchHistoryTable.getTag());
                    relativeLayout.setOnClickListener(new i2(this$1, 0));
                    this$1.OooOoo0().f44597OooO0O0.addView(relativeLayout);
                }
                break;
        }
    }
}
