package p506o0o00oOo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.PremiumFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00O extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<PremiumShopModel.PremiumInfo> f50470OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00O(PremiumActivity premiumActivity, ArrayList arrayList) {
        super(premiumActivity);
        this.f50470OooO00o = arrayList;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        PremiumShopModel.PremiumInfo data = this.f50470OooO00o.get(i);
        data.setVipName(data.getName());
        data.setPositionLocal(i);
        data.setVipLevel(PremiumLevel.INSTANCE.of(Integer.valueOf(data.getIndex() + 1)));
        PremiumFragment.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        PremiumFragment premiumFragment = new PremiumFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", data);
        premiumFragment.setArguments(bundle);
        return premiumFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f50470OooO00o.size();
    }
}
