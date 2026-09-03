package p554o0oOOoo0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p398o0Oo0O00.OooO0OO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000 extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View f56065OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageView f56066OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f56067OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f56068OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f56069OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public View f56070OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public View f56071OooOO0O;

    public final void OooO0O0(int i, String str, String str2) {
        this.f56067OooO0o0.setVisibility(8);
        if (str != null) {
            this.f56068OooO0oO.setText(str);
        }
        if (str2 != null) {
            this.f56069OooO0oo.setText(str2);
        }
        this.f56066OooO0o.setVisibility(8);
        if (i == 0) {
            this.f56066OooO0o.setVisibility(0);
            this.f56066OooO0o.setImageDrawable(null);
        }
        if (i > 0) {
            this.f56066OooO0o.setVisibility(0);
            this.f56066OooO0o.setImageResource(i);
        }
        this.f56065OooO.setVisibility(8);
        this.f56065OooO.setVisibility(0);
    }
}
