package p519o0o0O0oO;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g4 extends FragmentStateAdapter {
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        TreasureBoxFragment.INSTANCE.getClass();
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
