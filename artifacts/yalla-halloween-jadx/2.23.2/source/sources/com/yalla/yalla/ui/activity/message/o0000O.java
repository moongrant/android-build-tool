package com.yalla.yalla.ui.activity.message;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25352OooO00o;

    public o0000O(PrivateChatActivity privateChatActivity) {
        this.f25352OooO00o = privateChatActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        PrivateChatActivity privateChatActivity = this.f25352OooO00o;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            privateChatActivity.f25242OooOOoo = false;
        } else {
            int i2 = PrivateChatActivity.f25239Oooo000;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) privateChatActivity.OooOo0().f44878OooO.getLayoutManager();
            Intrinsics.checkNotNull(linearLayoutManager);
            privateChatActivity.f25242OooOOoo = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
        }
    }
}
