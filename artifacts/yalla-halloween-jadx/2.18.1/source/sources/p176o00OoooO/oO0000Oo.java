package p176o00OoooO;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.OooO0O0;
import com.rbrooks.indefinitepagerindicator.IndefinitePagerIndicator;
import com.rbrooks.indefinitepagerindicator.IndefinitePagerIndicator.OooO0O0;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.fragment.UserNewPostFragment;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p649o0ooOOoo.u7;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oO0000Oo extends OooO0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public u7 f32783Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final List<RecommendNewPostModel> f32784Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f32785Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior<View> f32786Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f32787OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final OooO00o f32788OoooO00;

    public static final class OooO00o extends BottomSheetBehavior.OooO0OO {
        public OooO00o() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NotNull View bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(@NotNull View bottomSheet, int i) {
            BottomSheetBehavior<View> bottomSheetBehavior;
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i != 4 || (bottomSheetBehavior = oO0000Oo.this.f32786Oooo0oo) == null) {
                return;
            }
            bottomSheetBehavior.Oooo00O(5);
        }
    }

    public oO0000Oo(@NotNull List<RecommendNewPostModel> newPostUserList, int i) {
        Intrinsics.checkNotNullParameter(newPostUserList, "newPostUserList");
        this.f32784Oooo0o = newPostUserList;
        this.f32785Oooo0oO = i;
        this.f32788OoooO00 = new OooO00o();
    }

    @Override // com.google.android.material.bottomsheet.OooO0O0, androidx.appcompat.app.Oooo0, androidx.fragment.app.OooOo00
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        setStyle(0, R.style.TransBottomSheetDialogStyle);
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        u7 u7VarInflate = u7.inflate(inflater, viewGroup, false);
        this.f32783Oooo = u7VarInflate;
        if (u7VarInflate != null) {
            return u7VarInflate.f50680OooO00o;
        }
        return null;
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Function0<Unit> function0 = this.f32787OoooO0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onStart() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        AppCompatDelegate appCompatDelegateOooO0oO;
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        com.google.android.material.bottomsheet.OooO00o oooO00o = (com.google.android.material.bottomsheet.OooO00o) getDialog();
        if (oooO00o != null && (window3 = oooO00o.getWindow()) != null) {
            window3.setSoftInputMode(2);
        }
        if (oooO00o != null && (window2 = oooO00o.getWindow()) != null) {
            window2.setDimAmount(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        if (oooO00o != null && (window = oooO00o.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(o000O0O0.OooO00o(R.color.transparent)));
        }
        View view = (oooO00o == null || (appCompatDelegateOooO0oO = oooO00o.OooO0oO()) == null) ? null : (FrameLayout) appCompatDelegateOooO0oO.OooO0o0(R.id.design_bottom_sheet);
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (view != null) {
            view.setBackgroundColor(0);
        }
        u7 u7Var = this.f32783Oooo;
        Object parent = (u7Var == null || (constraintLayout2 = u7Var.f50681OooO0O0) == null) ? null : constraintLayout2.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior<View> bottomSheetBehaviorOooOoO0 = BottomSheetBehavior.OooOoO0((View) parent);
        this.f32786Oooo0oo = bottomSheetBehaviorOooOoO0;
        if (bottomSheetBehaviorOooOoO0 != null) {
            bottomSheetBehaviorOooOoO0.Oooo00O(3);
        }
        BottomSheetBehavior<View> bottomSheetBehavior = this.f32786Oooo0oo;
        if (bottomSheetBehavior != null) {
            u7 u7Var2 = this.f32783Oooo;
            Integer numValueOf = (u7Var2 == null || (constraintLayout = u7Var2.f50681OooO0O0) == null) ? null : Integer.valueOf(constraintLayout.getMeasuredHeight());
            Intrinsics.checkNotNull(numValueOf);
            bottomSheetBehavior.Oooo000(numValueOf.intValue());
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.f32786Oooo0oo;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.OooOoo(this.f32788OoooO00);
        }
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.f32786Oooo0oo;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.OooOo00(this.f32788OoooO00);
        }
        while (true) {
            Object parent2 = view != null ? view.getParent() : null;
            if (!((parent2 instanceof View ? (View) parent2 : null) != null)) {
                break;
            }
            Object parent3 = view != null ? view.getParent() : null;
            view = parent3 instanceof View ? (View) parent3 : null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (view != null) {
                view.setOutlineAmbientShadowColor(o000O0O0.OooO00o(R.color.transparent));
            }
            if (view == null) {
                return;
            }
            view.setOutlineSpotShadowColor(o000O0O0.OooO00o(R.color.transparent));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        IndefinitePagerIndicator indefinitePagerIndicator;
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        u7 u7Var = this.f32783Oooo;
        if (u7Var != null && (imageView = u7Var.f50682OooO0OO) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o00OoooO.oO00000o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    oO0000Oo this$0 = this.f32781Oooo0o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    BottomSheetBehavior<View> bottomSheetBehavior = this$0.f32786Oooo0oo;
                    if (bottomSheetBehavior == null) {
                        return;
                    }
                    bottomSheetBehavior.Oooo00O(5);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f32784Oooo0o.iterator();
        while (it.hasNext()) {
            arrayList.add(new UserNewPostFragment((RecommendNewPostModel) it.next()));
        }
        u7 u7Var2 = this.f32783Oooo;
        View childAt = (u7Var2 == null || (viewPager3 = u7Var2.f50684OooO0o) == null) ? null : viewPager3.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) childAt;
        recyclerView.setItemViewCacheSize(arrayList.size());
        u7 u7Var3 = this.f32783Oooo;
        ViewPager2 viewPager4 = u7Var3 != null ? u7Var3.f50684OooO0o : null;
        if (viewPager4 != null) {
            viewPager4.setAdapter(new oO0000O(arrayList, getChildFragmentManager(), getLifecycle()));
        }
        u7 u7Var4 = this.f32783Oooo;
        if (u7Var4 != null && (viewPager2 = u7Var4.f50684OooO0o) != null) {
            viewPager2.setCurrentItem(this.f32785Oooo0oO, false);
        }
        u7 u7Var5 = this.f32783Oooo;
        if (u7Var5 == null || (indefinitePagerIndicator = u7Var5.f50683OooO0Oo) == null) {
            return;
        }
        RecyclerView recyclerView2 = indefinitePagerIndicator.f19452Oooo0o;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(indefinitePagerIndicator.f19453Oooo0oO);
        }
        indefinitePagerIndicator.f19452Oooo0o = recyclerView;
        IndefinitePagerIndicator.OooO0O0 oooO0O0 = indefinitePagerIndicator.new OooO0O0();
        indefinitePagerIndicator.f19453Oooo0oO = oooO0O0;
        RecyclerView recyclerView3 = indefinitePagerIndicator.f19452Oooo0o;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(oooO0O0);
        }
    }

    @Override // androidx.fragment.app.OooOo00
    public final void show(@NotNull FragmentManager manager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            super.show(manager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
