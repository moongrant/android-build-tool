package com.yalla.yalla.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p405o0Oo0OOO.o0OO000o;
import p576o0oOoOOo.oO0o0000;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public class StoreCrystalFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private o0OO000o binding;

    public class OooO00o implements Function0<Unit> {
        public OooO00o() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StoreCrystalFragment storeCrystalFragment = StoreCrystalFragment.this;
            storeCrystalFragment.binding.f44575OooO00o.OooO0oo();
            storeCrystalFragment.binding.f44576OooO0O0.reload();
            return null;
        }
    }

    public class OooO0O0 extends oO0o0000 {
        public OooO0O0() {
        }

        @Override // p576o0oOoOOo.oO0o0000
        public final void onClosePage() {
            p423o0OoO0OO.oo0o0Oo.OooO00o(StoreCrystalFragment.this.getActivity(), new o000());
        }

        @Override // p576o0oOoOOo.oO0o0000
        public final void refreshUrl() {
            StoreCrystalFragment.this.binding.f44576OooO0O0.reload();
        }
    }

    public class OooO0OO implements BaseWebView.OooO0OO {
        public OooO0OO() {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
            if (i == 0) {
                StoreCrystalFragment.this.binding.f44575OooO00o.OooO0oo();
            }
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            StoreCrystalFragment storeCrystalFragment = StoreCrystalFragment.this;
            if (z) {
                storeCrystalFragment.binding.f44575OooO00o.OooO0Oo();
            } else {
                storeCrystalFragment.binding.f44575OooO00o.OooO0o();
            }
        }
    }

    public class OooO0o implements Observer<String> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            String str2 = str;
            if (com.code.android.util.OooOo00.OooO00o(str2)) {
                return;
            }
            StoreCrystalFragment.this.binding.f44576OooO0O0.loadUrl(c1.OooO0OO(c1.OooO00o(str2), null));
        }
    }

    private void initView() {
        this.binding.f44576OooO0O0.setBackgroundColor(0);
        this.binding.f44575OooO00o.setErrorButtonClickListener(new OooO00o());
        this.binding.f44576OooO0O0.addJavascriptInterface(new OooO0O0(), "Yalla");
        this.binding.f44576OooO0O0.setLoadStateListener(new OooO0OO());
    }

    private void loadCrystalUrl() {
        this.binding.f44575OooO00o.OooO0oo();
        p583o0oOoo00.o00000OO.f56658OooO.observe(getViewLifecycleOwner(), new OooO0o());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = o0OO000o.inflate(layoutInflater, viewGroup, false);
        initView();
        loadCrystalUrl();
        return this.binding.f44575OooO00o;
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, com.yalla.yalla.base.fragment.OooO0OO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.binding.f44576OooO0O0.OooO0Oo();
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, p545o0oO0O00.OooOOOO
    public void onEventMainThread(p545o0oO0O00.OooOOO oooOOO) {
        super.onEventMainThread(oooOOO);
        if (oooOOO.f55758OooO00o == 31) {
            this.binding.f44576OooO0O0.reload();
        }
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, com.yalla.yalla.base.fragment.OooO0OO
    public void onTrueVisibleChanged(boolean z) {
        super.onTrueVisibleChanged(z);
        if (z) {
            o0oo0000.OooO00o.OooO0O0("105029");
        }
    }
}
