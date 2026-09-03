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
import p587o0oOooOO.u;

/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayCrystalFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private View rootView;

    private void initView() {
        u.OooO00o(this.rootView, p562o0oOo000.o0OO00O.google_play_enter_crystal_mall, getMNoDoubleClickListener());
        u.OooO00o(this.rootView, p562o0oOo000.o0OO00O.google_play_get_crystal, getMNoDoubleClickListener());
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(View view) {
        super.onClickNotDouble(view);
        if (view.getId() == p562o0oOo000.o0OO00O.google_play_enter_crystal_mall) {
            StoreActivity.OooOo0(getContext(), true);
        } else if (view.getId() == p562o0oOo000.o0OO00O.google_play_get_crystal) {
            getActivity().startActivity(new Intent(getActivity(), (Class<?>) TaskActivity.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.rootView == null) {
            this.rootView = layoutInflater.inflate(p562o0oOo000.oo0o0Oo.google_play_crystal_fragment, viewGroup, false);
        }
        return this.rootView;
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, com.yalla.yalla.base.fragment.OooO0OO
    public void onTrueVisibleChanged(boolean z) {
        super.onTrueVisibleChanged(z);
        if (z) {
            o0oo0000.OooO00o.OooO0O0("105028");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
    }
}
