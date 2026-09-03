package androidx.media3.ui;

import android.view.View;
import com.facebook.internal.WebDialog;
import com.yalla.yalla.ui.fragment.BadgeFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0Oo0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6761OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6762OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f6761OooO0Oo = i;
        this.f6762OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6761OooO0Oo;
        Object obj = this.f6762OooO0o0;
        switch (i) {
            case 0:
                oo0o0Oo.OooO00o((oo0o0Oo) obj, view);
                break;
            case 1:
                WebDialog.m4140createCrossImage$lambda5((WebDialog) obj, view);
                break;
            default:
                BadgeFragment.showPopupWindow$lambda$3((BadgeFragment) obj, view);
                break;
        }
    }
}
