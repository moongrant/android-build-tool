package com.yalla.yalla.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import p539o0o0OoOO.z0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayCrystalFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private View rootView;

    private void initView() {
        z0.OooO00o(this.rootView, oO00O0oO.google_play_enter_crystal_mall, getMNoDoubleClickListener());
        z0.OooO00o(this.rootView, oO00O0oO.google_play_get_crystal, getMNoDoubleClickListener());
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(View view) {
        super.onClickNotDouble(view);
        if (view.getId() == oO00O0oO.google_play_enter_crystal_mall) {
            StoreActivity.OooOo0(getContext(), true);
        } else if (view.getId() == oO00O0oO.google_play_get_crystal) {
            getActivity().startActivity(new Intent(getActivity(), (Class<?>) TaskActivity.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.rootView == null) {
            this.rootView = layoutInflater.inflate(oO00OO0O.google_play_crystal_fragment, viewGroup, false);
        }
        return this.rootView;
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, com.yalla.yalla.base.fragment.OooO0OO
    public void onTrueVisibleChanged(boolean z) {
        super.onTrueVisibleChanged(z);
        if (z) {
            o0OO000.OooO00o("105028");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
    }
}
