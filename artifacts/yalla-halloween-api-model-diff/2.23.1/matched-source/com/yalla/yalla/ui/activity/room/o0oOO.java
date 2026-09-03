package com.yalla.yalla.ui.activity.room;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<Fragment> f26486OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(RoomThemeStoreActivity roomThemeStoreActivity, List<Fragment> list) {
        super(roomThemeStoreActivity);
        this.f26486OooO00o = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        return this.f26486OooO00o.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f26486OooO00o.size();
    }
}
