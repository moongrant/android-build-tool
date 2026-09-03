package p561o0oOo00;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p402o0Oo0O0O.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View f56237OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageView f56238OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f56239OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f56240OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f56241OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public View f56242OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public View f56243OooOO0O;

    public final void OooO0O0(int i, String str, String str2) {
        this.f56239OooO0o0.setVisibility(8);
        if (str != null) {
            this.f56240OooO0oO.setText(str);
        }
        if (str2 != null) {
            this.f56241OooO0oo.setText(str2);
        }
        this.f56238OooO0o.setVisibility(8);
        if (i == 0) {
            this.f56238OooO0o.setVisibility(0);
            this.f56238OooO0o.setImageDrawable(null);
        }
        if (i > 0) {
            this.f56238OooO0o.setVisibility(0);
            this.f56238OooO0o.setImageResource(i);
        }
        this.f56237OooO.setVisibility(8);
        this.f56237OooO.setVisibility(0);
    }
}
