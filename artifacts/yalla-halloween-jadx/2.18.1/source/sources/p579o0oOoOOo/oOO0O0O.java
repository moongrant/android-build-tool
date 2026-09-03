package p579o0oOoOOo;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p104o000oo0O.o00O0O;
import p503o0o00o00.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<OooO<? extends o00O0O>> f46091OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O(List<OooO<? extends o00O0O>> list, Context context) {
        super((FragmentActivity) context);
        this.f46091OooO00o = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        return this.f46091OooO00o.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f46091OooO00o.size();
    }
}
