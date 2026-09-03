package com.yalla.yalla.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.model.MoraGiftListModel;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p530o0o0OOO.o00OO00O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.yf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/fragment/GuessGiftListFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/yf;", "", "Lcom/app/base/model/MoraGiftListModel;", "giftIds", "", "loadGiftTable", "", "position", "changePageSelected", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onResume", "onLazyInit", "Landroid/view/View;", ak.aE, "onClick", "Landroidx/fragment/app/FragmentActivity;", "mContext", "Landroidx/fragment/app/FragmentActivity;", "getMContext", "()Landroidx/fragment/app/FragmentActivity;", "Landroid/widget/ImageView;", "selectView", "Landroid/widget/ImageView;", "Landroidx/fragment/app/Fragment;", "fragments", "Ljava/util/List;", "mPosition", "I", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GuessGiftListFragment extends p503o0o00o00.OooO<yf> {
    public static final int $stable = 8;

    @NotNull
    private final List<Fragment> fragments;

    @NotNull
    private final FragmentActivity mContext;
    private int mPosition;

    @Nullable
    private ImageView selectView;

    public static final class OooO00o extends ViewPager2.OnPageChangeCallback {
        public OooO00o() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i) {
            super.onPageSelected(i);
            GuessGiftListFragment.this.changePageSelected(i);
        }
    }

    public static final class OooO0O0 extends FragmentStateAdapter {
        public OooO0O0(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public final Fragment createFragment(int i) {
            return (Fragment) GuessGiftListFragment.this.fragments.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return GuessGiftListFragment.this.fragments.size();
        }
    }

    public GuessGiftListFragment(@NotNull FragmentActivity mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.fragments = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changePageSelected(int position) {
        ImageView imageView;
        this.mPosition = position;
        getBinding().f51037OooO0O0.setSelected(position == 0);
        getBinding().f51039OooO0Oo.setSelected(position == 1);
        getBinding().f51041OooO0o0.setSelected(position == 2);
        getBinding().f51038OooO0OO.setSelected(position == 3);
        ImageView imageView2 = this.selectView;
        if (imageView2 != null) {
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = com.yalla.support.common.util.OooOo00.OooO00o(40);
            imageView2.setLayoutParams(layoutParams2);
        }
        if (position == 1) {
            imageView = getBinding().f51039OooO0Oo;
        } else if (position != 2) {
            imageView = position != 3 ? getBinding().f51037OooO0O0 : getBinding().f51038OooO0OO;
        } else {
            imageView = getBinding().f51041OooO0o0;
        }
        this.selectView = imageView;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.height = com.yalla.support.common.util.OooOo00.OooO00o(50);
            imageView.setLayoutParams(layoutParams4);
        }
    }

    public static /* synthetic */ void changePageSelected$default(GuessGiftListFragment guessGiftListFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        guessGiftListFragment.changePageSelected(i);
    }

    private final void loadGiftTable(List<MoraGiftListModel> giftIds) {
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.f48429OooO0OO = giftIds.get(0).getImageUrl();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(getBinding().f51037OooO0O0);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o2.f48429OooO0OO = giftIds.get(1).getImageUrl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(getBinding().f51039OooO0Oo);
        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getContext());
        oooO00o3.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o3.f48429OooO0OO = giftIds.get(2).getImageUrl();
        oooO00o3.f48427OooO00o = 0;
        oooO00o3.OooO0o(getBinding().f51041OooO0o0);
        oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(getContext());
        oooO00o4.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o4.f48429OooO0OO = giftIds.get(3).getImageUrl();
        oooO00o4.f48427OooO00o = 0;
        oooO00o4.OooO0o(getBinding().f51038OooO0OO);
    }

    @NotNull
    public final FragmentActivity getMContext() {
        return this.mContext;
    }

    @Override // p503o0o00o00.OooO, android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        super.onClick(v);
        if (Intrinsics.areEqual(v, getBinding().f51037OooO0O0)) {
            getBinding().f51040OooO0o.setCurrentItem(0, false);
            return;
        }
        if (Intrinsics.areEqual(v, getBinding().f51039OooO0Oo)) {
            getBinding().f51040OooO0o.setCurrentItem(1, false);
        } else if (Intrinsics.areEqual(v, getBinding().f51041OooO0o0)) {
            getBinding().f51040OooO0o.setCurrentItem(2, false);
        } else if (Intrinsics.areEqual(v, getBinding().f51038OooO0OO)) {
            getBinding().f51040OooO0o.setCurrentItem(3, false);
        }
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        List<MoraGiftListModel> value = o00OO00O.f43313OooooOo.OooO00o().f43340OooOoO0.getValue();
        if (value == null || value.size() < 4) {
            return;
        }
        changePageSelected$default(this, 0, 1, null);
        loadGiftTable(value);
        getBinding().f51037OooO0O0.setOnClickListener(this);
        getBinding().f51039OooO0Oo.setOnClickListener(this);
        getBinding().f51041OooO0o0.setOnClickListener(this);
        getBinding().f51038OooO0OO.setOnClickListener(this);
        int i = 0;
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.fragments.add(new GuessListFragment(this.mContext, value.get(0).getPropId(), i, i2, defaultConstructorMarker));
        this.fragments.add(new GuessListFragment(this.mContext, value.get(1).getPropId(), i, i2, defaultConstructorMarker));
        this.fragments.add(new GuessListFragment(this.mContext, value.get(2).getPropId(), i, i2, defaultConstructorMarker));
        this.fragments.add(new GuessListFragment(this.mContext, value.get(3).getPropId(), i, i2, defaultConstructorMarker));
        getBinding().f51040OooO0o.setAdapter(new OooO0O0(this.mContext));
        getBinding().f51040OooO0o.setOffscreenPageLimit(1);
        getBinding().f51040OooO0o.registerOnPageChangeCallback(new OooO00o());
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int size = this.fragments.size();
        int i = this.mPosition;
        boolean z = false;
        if (i >= 0 && i < size) {
            z = true;
        }
        if (z) {
            Fragment fragment = this.fragments.get(i);
            Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.yalla.yalla.ui.fragment.GuessListFragment");
            if (((GuessListFragment) fragment).getIsLazyInit()) {
                Fragment fragment2 = this.fragments.get(this.mPosition);
                Intrinsics.checkNotNull(fragment2, "null cannot be cast to non-null type com.yalla.yalla.ui.fragment.GuessListFragment");
                ((GuessListFragment) fragment2).updateSelfData();
            }
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public yf getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        yf yfVarInflate = yf.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(yfVarInflate, "inflate(inflater, container, false)");
        return yfVarInflate;
    }
}
