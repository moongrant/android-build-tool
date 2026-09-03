package p176o00OoooO;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.yalla.yalla.ui.fragment.UserNewPostFragment;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oO0000O extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<UserNewPostFragment> f32782OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(List<UserNewPostFragment> list, FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.f32782OooO00o = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        return this.f32782OooO00o.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f32782OooO00o.size();
    }
}
