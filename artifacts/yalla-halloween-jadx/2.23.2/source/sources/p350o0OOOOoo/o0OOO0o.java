package p350o0OOOOoo;

import android.view.KeyEvent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import com.yalla.yalla.ui.activity.main.OooO00o;
import com.yalla.yalla.ui.adapter.RecAdapterCountries;
import kotlin.jvm.internal.Intrinsics;
import p411o0Oo0o00.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OOO0o implements ObservableScrollView.OooO00o, BaseQuickAdapter.OooO0o, RecAdapterCountries.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f42855OooO0Oo;

    public /* synthetic */ o0OOO0o(KeyEvent.Callback callback) {
        this.f42855OooO0Oo = callback;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ChangeRegionActivity this$0 = (ChangeRegionActivity) this.f42855OooO0Oo;
        int i2 = ChangeRegionActivity.f24923OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooO00o oooO00o = this$0.f24930OooOo0O;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO00o = null;
        }
        Object obj = oooO00o.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj);
        this$0.f24928OooOo0 = ((ChangeRegionActivity.OooO00o) obj).f24933OooO0O0;
        this$0.OooOo0();
        OooO00o oooO00o2 = this$0.f24930OooOo0O;
        if (oooO00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO00o2 = null;
        }
        oooO00o2.notifyDataSetChanged();
        OooOO0O.f45930OooO00o.postValue(null);
    }
}
