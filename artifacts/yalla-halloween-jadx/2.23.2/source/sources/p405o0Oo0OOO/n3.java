package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class n3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44195OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44196OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44197OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44198OooO0Oo;

    public n3(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f44195OooO00o = constraintLayout;
        this.f44196OooO0O0 = netImageView;
        this.f44197OooO0OO = sVGAView;
        this.f44198OooO0Oo = textView;
    }

    @NonNull
    public static n3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44195OooO00o;
    }

    @NonNull
    public static n3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_room_user_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bg;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i2 = o0OO00O.svga;
            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i2, viewInflate);
            if (sVGAView != null) {
                i2 = o0OO00O.tvVip;
                TextView textView = (TextView) OooO0O0.OooO00o(i2, viewInflate);
                if (textView != null) {
                    return new n3(constraintLayout, netImageView, sVGAView, textView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
