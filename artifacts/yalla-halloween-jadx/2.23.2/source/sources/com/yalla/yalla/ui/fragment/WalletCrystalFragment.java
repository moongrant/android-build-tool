package com.yalla.yalla.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.j2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/fragment/WalletCrystalFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/j2;", "", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class WalletCrystalFragment extends p527o0o0OO0o.o000O<j2> {
    public static final int $stable = 0;

    private final void initView() {
        getBinding().f43980OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o00O0000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalletCrystalFragment.initView$lambda$0(this.f28404OooO0Oo, view);
            }
        });
        getBinding().f43981OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o0O0ooO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalletCrystalFragment.initView$lambda$1(this.f28415OooO0Oo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(WalletCrystalFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StoreActivity.OooOo0(this$0.getContext(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(WalletCrystalFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0oo0000.OooO00o.OooO0O0("105105");
        this$0.startActivity(new Intent(this$0.getActivity(), (Class<?>) TaskActivity.class));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public j2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        j2 j2VarInflate = j2.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(j2VarInflate, "inflate(...)");
        return j2VarInflate;
    }
}
