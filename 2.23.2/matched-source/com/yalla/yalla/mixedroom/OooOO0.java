package com.yalla.yalla.mixedroom;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23022OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f23021OooO0Oo = i;
        this.f23022OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23021OooO0Oo;
        Object obj2 = this.f23022OooO0o0;
        switch (i) {
            case 0:
                int i2 = MixedRoomActivity.f22956OoooO0O;
                ((MixedRoomActivity) obj2).finish();
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) obj2;
                int i3 = PhoneBindActivity.f24787OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 2:
                TopicSearchActivity this$1 = (TopicSearchActivity) obj2;
                List<SearchHistoryTable> list = (List) obj;
                int i4 = TopicSearchActivity.f25947OooOoo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Group groupSearch = this$1.OooOoo0().f44603OooO0OO;
                Intrinsics.checkNotNullExpressionValue(groupSearch, "groupSearch");
                Intrinsics.checkNotNull(list);
                int i5 = 1;
                o000O.OooOOO0(groupSearch, !list.isEmpty());
                this$1.OooOoo0().f44602OooO0O0.removeAllViews();
                for (SearchHistoryTable searchHistoryTable : list) {
                    View viewInflate = View.inflate(this$1, p562o0oOo000.oo0o0Oo.tv_search_history, null);
                    Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(p562o0oOo000.o0OO00O.tag_item_relative);
                    View childAt = relativeLayout.getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) childAt).setText(searchHistoryTable.getTag());
                    relativeLayout.setOnClickListener(new com.facebook.internal.o00Oo0(this$1, i5));
                    this$1.OooOoo0().f44602OooO0O0.addView(relativeLayout);
                }
                break;
            default:
                RoomInfoMemberListFragment.initObserve$lambda$18((RoomInfoMemberListFragment) obj2, obj);
                break;
        }
    }
}
