package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45001OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45002OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixTextView f45003OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f45004OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f45005OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f45006OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f45007OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f45008OooO0oo;

    public oOO(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.f45001OooO00o = constraintLayout;
        this.f45002OooO0O0 = netImageView;
        this.f45003OooO0OO = fixTextView;
        this.f45004OooO0Oo = textView;
        this.f45006OooO0o0 = view;
        this.f45005OooO0o = view2;
        this.f45007OooO0oO = view3;
        this.f45008OooO0oo = view4;
    }

    @NonNull
    public static oOO OooO00o(@NonNull View view) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        View viewOooO00o4;
        int i = o0OO00O.ivCamera;
        if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
            i = o0OO00O.nivTopicHeader;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, view);
            if (netImageView != null) {
                i = o0OO00O.tvIntroduction;
                FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, view);
                if (fixTextView != null) {
                    i = o0OO00O.tvIntroductionTitle;
                    if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                        i = o0OO00O.tvName;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, view);
                        if (textView != null) {
                            i = o0OO00O.tvNameTitle;
                            if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                i = o0OO00O.tvNote1;
                                if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                    i = o0OO00O.tvNote2;
                                    if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                        i = o0OO00O.tvNote3;
                                        if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                            i = o0OO00O.tvNote4;
                                            if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                                i = o0OO00O.tvNote5;
                                                if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                                    i = o0OO00O.tvNoteTitle;
                                                    if (((TextView) OooO0O0.OooO00o(i, view)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vIntroduction), view)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.vLine), view)) != null && (viewOooO00o3 = OooO0O0.OooO00o((i = o0OO00O.vName), view)) != null && (viewOooO00o4 = OooO0O0.OooO00o((i = o0OO00O.vNote), view)) != null) {
                                                        return new oOO((ConstraintLayout) view, netImageView, fixTextView, textView, viewOooO00o, viewOooO00o2, viewOooO00o3, viewOooO00o4);
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
    public static oOO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45001OooO00o;
    }

    @NonNull
    public static oOO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_layout_topic_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
