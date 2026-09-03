package o0000OO;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import kotlin.jvm.internal.Intrinsics;
import p420o0OoO0OO.o0ooOOo;
import p486o0o00O00.o00oO0o;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements OooOOO0, o000oOoO, BaseQuickAdapter.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34115OooO0Oo;

    public /* synthetic */ OooO(Object obj) {
        this.f34115OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        MainRoomMineJoinedFragment.initView$lambda$1((MainRoomMineJoinedFragment) this.f34115OooO0Oo);
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        BlackListActivity this$0 = (BlackListActivity) this.f34115OooO0Oo;
        int i = BlackListActivity.f25368OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new o00oO0o(this$0, null)).observe(this$0, new BlackListActivity.OooO00o(new p486o0o00O00.o0ooOOo(this$0, false)));
    }

    public final boolean OooO0OO(OooOOO oooOOO, int i, Bundle bundle) {
        View view = (View) this.f34115OooO0Oo;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                oooOOO.f34119OooO00o.OooO0OO();
                InputContentInfo inputContentInfoOooO00o = OooO0o.OooO00o(oooOOO.f34119OooO00o.OooO00o());
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfoOooO00o);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        }
        ClipDescription description = oooOOO.f34119OooO00o.getDescription();
        OooOOO.OooO0OO oooO0OO = oooOOO.f34119OooO00o;
        ClipData clipData = new ClipData(description, new ClipData.Item(oooO0OO.OooO0O0()));
        ContentInfoCompat.OooO0O0 oooO00o = i2 >= 31 ? new ContentInfoCompat.OooO00o(clipData, 2) : new ContentInfoCompat.OooO0OO(clipData, 2);
        oooO00o.OooO00o(oooO0OO.OooO0Oo());
        oooO00o.setExtras(bundle);
        return ViewCompat.OooOO0O(view, oooO00o.build()) == null;
    }
}
