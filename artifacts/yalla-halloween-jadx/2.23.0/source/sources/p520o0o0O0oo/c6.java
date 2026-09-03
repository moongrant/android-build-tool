package p520o0o0O0oo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class c6 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ArrayList f53255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f53256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f53257OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f53258OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f53259OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super List<GiftSendFragment>, Unit> f53260OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(@NotNull FragmentActivity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53255OooO00o = new ArrayList();
        this.f53256OooO0O0 = new ArrayList();
        this.f53257OooO0OO = new LinkedHashMap();
    }

    public final void OooO00o(@NotNull GiftSendFragment fragment, @NotNull String title, long j) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f53255OooO00o.add(fragment);
        this.f53256OooO0O0.add(title);
        this.f53257OooO0OO.put(title, Long.valueOf(j));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        return (Fragment) this.f53255OooO00o.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f53255OooO00o.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (this.f53255OooO00o.size() == 2) {
            i++;
        }
        return i;
    }
}
