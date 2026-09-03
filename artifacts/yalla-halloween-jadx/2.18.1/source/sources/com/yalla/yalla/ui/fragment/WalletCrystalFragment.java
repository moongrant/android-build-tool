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
import com.yalla.yalla.ui.fragment.WalletCrystalFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O00O;
import p391o0OOooOo.o0O00000;
import p649o0ooOOoo.ei;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/fragment/WalletCrystalFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ei;", "", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class WalletCrystalFragment extends p503o0o00o00.OooO<ei> {
    public static final int $stable = 0;

    private final void initView() {
        getBinding().f49295OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oOoOoO.k3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalletCrystalFragment.m441initView$lambda0(this.f46870Oooo0o, view);
            }
        });
        getBinding().f49296OooO0OO.setOnClickListener(new o00O00O(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m441initView$lambda0(WalletCrystalFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StoreActivity.OooOoO(this$0.getContext(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m442initView$lambda1(WalletCrystalFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getActivity(), (Class<?>) TaskActivity.class));
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO("Me_wallet_crystals");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public ei getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ei eiVarInflate = ei.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(eiVarInflate, "inflate(layoutInflater)");
        return eiVarInflate;
    }
}
