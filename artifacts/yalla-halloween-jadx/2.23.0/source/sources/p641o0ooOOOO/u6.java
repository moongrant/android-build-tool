package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class u6 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58951OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58952OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixTextView f58953OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58954OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f58955OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f58956OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f58957OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f58958OooO0oo;

    public u6(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.f58951OooO00o = constraintLayout;
        this.f58952OooO0O0 = netImageView;
        this.f58953OooO0OO = fixTextView;
        this.f58954OooO0Oo = textView;
        this.f58956OooO0o0 = view;
        this.f58955OooO0o = view2;
        this.f58957OooO0oO = view3;
        this.f58958OooO0oo = view4;
    }

    @NonNull
    public static u6 OooO00o(@NonNull View view) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        View viewOooO00o4;
        int i = oO00O0oO.ivCamera;
        if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.nivTopicHeader;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, view);
            if (netImageView != null) {
                i = oO00O0oO.tvIntroduction;
                FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, view);
                if (fixTextView != null) {
                    i = oO00O0oO.tvIntroductionTitle;
                    if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                        i = oO00O0oO.tvName;
                        TextView textView = (TextView) OooOO0.OooO00o(i, view);
                        if (textView != null) {
                            i = oO00O0oO.tvNameTitle;
                            if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                i = oO00O0oO.tvNote1;
                                if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                    i = oO00O0oO.tvNote2;
                                    if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                        i = oO00O0oO.tvNote3;
                                        if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                            i = oO00O0oO.tvNote4;
                                            if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                                i = oO00O0oO.tvNote5;
                                                if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                                    i = oO00O0oO.tvNoteTitle;
                                                    if (((TextView) OooOO0.OooO00o(i, view)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vIntroduction), view)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.vLine), view)) != null && (viewOooO00o3 = OooOO0.OooO00o((i = oO00O0oO.vName), view)) != null && (viewOooO00o4 = OooOO0.OooO00o((i = oO00O0oO.vNote), view)) != null) {
                                                        return new u6((ConstraintLayout) view, netImageView, fixTextView, textView, viewOooO00o, viewOooO00o2, viewOooO00o3, viewOooO00o4);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static u6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58951OooO00o;
    }

    @NonNull
    public static u6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_layout_topic_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
