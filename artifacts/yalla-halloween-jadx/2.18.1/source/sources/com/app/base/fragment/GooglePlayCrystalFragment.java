package com.app.base.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import p148o00Oo0O.o00Oo0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes.dex */
public class GooglePlayCrystalFragment extends o00OOO0.OooO00o {
    private View rootView;

    private void initView() {
        o00Oo0.OooO00o(this.rootView, R.id.google_play_enter_crystal_mall, getMNoDoubleClickListener());
        o00Oo0.OooO00o(this.rootView, R.id.google_play_get_crystal, getMNoDoubleClickListener());
    }

    @Override // o00OOO0.OooO00o, o00Oo00.OooO00o
    public void onClickNotDouble(View view) {
        super.onClickNotDouble(view);
        if (view.getId() == R.id.google_play_enter_crystal_mall) {
            StoreActivity.OooOoO(getContext(), true);
        } else if (view.getId() == R.id.google_play_get_crystal) {
            getActivity().startActivity(new Intent(getActivity(), (Class<?>) TaskActivity.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.rootView == null) {
            this.rootView = layoutInflater.inflate(R.layout.google_play_crystal_fragment, viewGroup, false);
        }
        return this.rootView;
    }

    @Override // o00OOO0.OooO00o, o00OOO0.OooO0OO
    public void onTrueVisibleChanged(boolean z) {
        super.onTrueVisibleChanged(z);
        if (z) {
            o0O00000.OooO0OO("Me_wallet_crystals");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
    }
}
