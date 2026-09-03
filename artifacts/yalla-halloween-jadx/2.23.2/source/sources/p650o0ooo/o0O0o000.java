package p650o0ooo;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import o00O00o0.OooO00o;
import org.jetbrains.annotations.NotNull;
import p527o0o0OO0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<o000O<? extends OooO00o>> f58659OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(Context context, List list) {
        super((FragmentActivity) context);
        this.f58659OooO00o = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        return this.f58659OooO00o.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f58659OooO00o.size();
    }
}
