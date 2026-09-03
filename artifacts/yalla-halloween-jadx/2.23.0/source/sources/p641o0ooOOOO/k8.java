package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class k8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58299OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58300OooO0O0;

    public k8(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.f58299OooO00o = frameLayout;
        this.f58300OooO0O0 = imageView;
    }

    @NonNull
    public static k8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58299OooO00o;
    }

    @NonNull
    public static k8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_vote_game_rule, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivClose;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.tvContent1;
            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.tvContent2;
                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.tvContent3;
                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.tvContent4;
                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.tvContent5;
                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                i = oO00O0oO.tvTitle;
                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    return new k8((FrameLayout) viewInflate, imageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
