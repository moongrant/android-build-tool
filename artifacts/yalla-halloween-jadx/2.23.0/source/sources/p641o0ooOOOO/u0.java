package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58921OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FixTextView f58923OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58924OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58925OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58926OooO0oo;

    public u0(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f58919OooO00o = frameLayout;
        this.f58920OooO0O0 = imageView;
        this.f58921OooO0OO = imageView2;
        this.f58922OooO0Oo = linearLayout;
        this.f58924OooO0o0 = netImageView;
        this.f58923OooO0o = fixTextView;
        this.f58925OooO0oO = textView;
        this.f58926OooO0oo = textView2;
    }

    @NonNull
    public static u0 OooO00o(@NonNull View view) {
        int i = oO00O0oO.ivEventState;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, view);
        if (imageView != null) {
            i = oO00O0oO.ivMore;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, view);
            if (imageView2 != null) {
                i = oO00O0oO.llSub;
                LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, view);
                if (linearLayout != null) {
                    i = oO00O0oO.niv;
                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, view);
                    if (netImageView != null) {
                        i = oO00O0oO.tvEvent;
                        FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, view);
                        if (fixTextView != null) {
                            i = oO00O0oO.tvEventTime;
                            TextView textView = (TextView) OooOO0.OooO00o(i, view);
                            if (textView != null) {
                                i = oO00O0oO.tvSubscribe;
                                TextView textView2 = (TextView) OooOO0.OooO00o(i, view);
                                if (textView2 != null) {
                                    return new u0((FrameLayout) view, imageView, imageView2, linearLayout, netImageView, fixTextView, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static u0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58919OooO00o;
    }

    @NonNull
    public static u0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.chatline_event, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
