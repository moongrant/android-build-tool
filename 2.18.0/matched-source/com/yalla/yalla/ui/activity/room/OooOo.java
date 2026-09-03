package com.yalla.yalla.ui.activity.room;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<Fragment> f22946OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(RoomThemeStoreActivity roomThemeStoreActivity, List<Fragment> list) {
        super(roomThemeStoreActivity);
        this.f22946OooO00o = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        return this.f22946OooO00o.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f22946OooO00o.size();
    }
}
