package p519o0o0O0oO;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p081o000OoOO.OooO;
import p508o0o0O.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<OooOO0O<? extends OooO>> f52796OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(Context context, List list) {
        super((FragmentActivity) context);
        this.f52796OooO00o = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        return this.f52796OooO00o.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f52796OooO00o.size();
    }
}
