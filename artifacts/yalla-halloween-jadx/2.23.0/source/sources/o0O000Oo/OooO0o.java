package o0O000Oo;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.OooO0O0 f41657OooO0Oo;

    public OooO0o(com.google.android.material.bottomsheet.OooO0O0 oooO0O0) {
        this.f41657OooO0Oo = oooO0O0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.material.bottomsheet.OooO0O0 oooO0O0 = this.f41657OooO0Oo;
        if (oooO0O0.f16520OooOO0O && oooO0O0.isShowing()) {
            if (!oooO0O0.f16523OooOOO0) {
                TypedArray typedArrayObtainStyledAttributes = oooO0O0.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                oooO0O0.f16521OooOO0o = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                oooO0O0.f16523OooOOO0 = true;
            }
            if (oooO0O0.f16521OooOO0o) {
                oooO0O0.cancel();
            }
        }
    }
}
