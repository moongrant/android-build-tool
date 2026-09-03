package p579o0oOoOOo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends FragmentStateAdapter {
    public h1(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        Objects.requireNonNull(TreasureBoxFragment.INSTANCE);
        TreasureBoxFragment treasureBoxFragment = new TreasureBoxFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("data", i);
        treasureBoxFragment.setArguments(bundle);
        return treasureBoxFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 3;
    }
}
