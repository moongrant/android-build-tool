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
import p402o0Oo0OOO.o00O000o;
import p572o0oOoOO0.oO000O0;
import p579o0oOoo.oOo0o00;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.q2;

/* JADX INFO: loaded from: classes4.dex */
public class StoreCrystalFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private q2 binding;

    public class OooO00o implements Function0<Unit> {
        public OooO00o() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StoreCrystalFragment storeCrystalFragment = StoreCrystalFragment.this;
            storeCrystalFragment.binding.f58652OooO00o.OooO0oo();
            storeCrystalFragment.binding.f58653OooO0O0.reload();
            return null;
        }
    }

    public class OooO0O0 extends oO000O0 {
        public OooO0O0() {
        }

        @Override // p572o0oOoOO0.oO000O0
        public final void onClosePage() {
            p417o0OoO0.OooO.OooO00o(StoreCrystalFragment.this.getActivity(), new o000OO());
        }

        @Override // p572o0oOoOO0.oO000O0
        public final void refreshUrl() {
            StoreCrystalFragment.this.binding.f58653OooO0O0.reload();
        }
    }

    public class OooO0OO implements BaseWebView.OooO0OO {
        public OooO0OO() {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
            if (i == 0) {
                StoreCrystalFragment.this.binding.f58652OooO00o.OooO0oo();
            }
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            StoreCrystalFragment storeCrystalFragment = StoreCrystalFragment.this;
            if (z) {
                storeCrystalFragment.binding.f58652OooO00o.OooO0Oo();
            } else {
                storeCrystalFragment.binding.f58652OooO00o.OooO0o();
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
            StoreCrystalFragment.this.binding.f58653OooO0O0.loadUrl(oOo0o00.OooO0OO(oOo0o00.OooO00o(str2), null));
        }
    }

    private void initView() {
        this.binding.f58653OooO0O0.setBackgroundColor(0);
        this.binding.f58652OooO00o.setErrorButtonClickListener(new OooO00o());
        this.binding.f58653OooO0O0.addJavascriptInterface(new OooO0O0(), "Yalla");
        this.binding.f58653OooO0O0.setLoadStateListener(new OooO0OO());
    }

    private void loadCrystalUrl() {
        this.binding.f58652OooO00o.OooO0oo();
        o00O000o.f44489OooO.observe(getViewLifecycleOwner(), new OooO0o());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = q2.inflate(layoutInflater, viewGroup, false);
        initView();
        loadCrystalUrl();
        return this.binding.f58652OooO00o;
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, com.yalla.yalla.base.fragment.OooO0OO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.binding.f58653OooO0O0.OooO0Oo();
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, p418o0OoO000.Oooo000
    public void onEventMainThread(p418o0OoO000.OooOo oooOo) {
        super.onEventMainThread(oooOo);
        if (oooOo.f45532OooO00o == 31) {
            this.binding.f58653OooO0O0.reload();
        }
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, com.yalla.yalla.base.fragment.OooO0OO
    public void onTrueVisibleChanged(boolean z) {
        super.onTrueVisibleChanged(z);
        if (z) {
            o0OO000.OooO00o("105029");
        }
    }
}
