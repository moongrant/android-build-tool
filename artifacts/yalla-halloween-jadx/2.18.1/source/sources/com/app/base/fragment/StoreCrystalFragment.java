package com.app.base.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.ui.view.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p391o0OOooOo.o0O00000;
import p488o0o000oo.o0OO00O;
import p516o0o0O000.o00000OO;
import p649o0ooOOoo.g9;

/* JADX INFO: loaded from: classes.dex */
public class StoreCrystalFragment extends o00OOO0.OooO00o {
    private g9 binding;

    public class OooO00o implements Function0<Unit> {
        public OooO00o() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StoreCrystalFragment.this.binding.f49439OooO00o.OooO0oo();
            StoreCrystalFragment.this.binding.f49440OooO0O0.reload();
            return null;
        }
    }

    public class OooO0O0 extends o0OO00O {
        public OooO0O0() {
        }

        @Override // p488o0o000oo.o0OO00O
        @JavascriptInterface
        public void closePage() {
            StoreCrystalFragment.this.getActivity().finish();
        }

        @Override // p488o0o000oo.o0OO00O
        public final void refreshUrl() {
            StoreCrystalFragment.this.binding.f49440OooO0O0.reload();
        }
    }

    public class OooO0OO implements BaseWebView.OooO0o {
        public OooO0OO() {
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO00o(int i) {
            if (i == 0) {
                StoreCrystalFragment.this.binding.f49439OooO00o.OooO0oo();
            }
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO0O0(boolean z) {
            if (z) {
                StoreCrystalFragment.this.binding.f49439OooO00o.OooO0Oo();
            } else {
                StoreCrystalFragment.this.binding.f49439OooO00o.OooO0o();
            }
        }
    }

    public class OooO0o implements Observer<String> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            String str2 = str;
            if (com.yalla.support.common.util.OooO0OO.OooO00o(str2)) {
                return;
            }
            StoreCrystalFragment.this.binding.f49440OooO0O0.loadUrl(o00000OO.OooO0OO(o00000OO.OooO00o(str2), null));
        }
    }

    private void initView() {
        this.binding.f49440OooO0O0.setBackgroundColor(0);
        this.binding.f49439OooO00o.setErrorButtonClickListener(new OooO00o());
        this.binding.f49440OooO0O0.addJavascriptInterface(new OooO0O0(), "Yalla");
        this.binding.f49440OooO0O0.setLoadStateListener(new OooO0OO());
    }

    private void loadCrystalUrl() {
        this.binding.f49439OooO00o.OooO0oo();
        SharedUrlManager.INSTANCE.getCrystalStoreUrl().observe(getViewLifecycleOwner(), new OooO0o());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = g9.inflate(layoutInflater, viewGroup, false);
        initView();
        loadCrystalUrl();
        return this.binding.f49439OooO00o;
    }

    @Override // o00OOO0.OooO00o, o00OOO0.OooO0OO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.binding.f49440OooO0O0.OooO0OO();
    }

    @Override // o00OOO0.OooO00o, p140o00OOOoO.OooO0o
    public void onEventMainThread(p140o00OOOoO.OooO0OO oooO0OO) {
        super.onEventMainThread(oooO0OO);
        if (oooO0OO.f31885OooO00o == 31) {
            this.binding.f49440OooO0O0.reload();
        }
    }

    @Override // o00OOO0.OooO00o, o00OOO0.OooO0OO
    public void onTrueVisibleChanged(boolean z) {
        super.onTrueVisibleChanged(z);
        if (z) {
            o0O00000.OooO0OO("Me_store_crystals");
        }
    }
}
