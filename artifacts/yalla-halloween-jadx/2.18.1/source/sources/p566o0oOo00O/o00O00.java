package p566o0oOo00O;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.PremiumFragment;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<PremiumShopModel.PremiumInfo> f45244OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(PremiumActivity premiumActivity, List<PremiumShopModel.PremiumInfo> list) {
        super(premiumActivity);
        this.f45244OooO00o = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i) {
        PremiumShopModel.PremiumInfo data = this.f45244OooO00o.get(i);
        data.setVipName(data.getName());
        data.setPositionLocal(i);
        data.setVipLevel(PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(data.getIndex() + 1)));
        Objects.requireNonNull(PremiumFragment.INSTANCE);
        Intrinsics.checkNotNullParameter(data, "data");
        PremiumFragment premiumFragment = new PremiumFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", data);
        premiumFragment.setArguments(bundle);
        return premiumFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f45244OooO00o.size();
    }
}
