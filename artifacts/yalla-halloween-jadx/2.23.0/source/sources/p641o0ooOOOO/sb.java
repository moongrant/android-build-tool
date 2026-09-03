package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.DotView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class sb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f58823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f58824OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f58825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Switch f58826OooO0o0;

    public sb(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull Switch r5) {
        this.f58822OooO00o = linearLayout;
        this.f58823OooO0O0 = textView;
        this.f58824OooO0OO = view;
        this.f58825OooO0Oo = view2;
        this.f58826OooO0o0 = r5;
    }

    @NonNull
    public static sb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58822OooO00o;
    }

    @NonNull
    public static sb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.dotView;
        if (((DotView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.ivImage;
            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.llItem;
                if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.tvContent;
                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.tvTitle;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vLineBottom), viewInflate)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.vLineTop), viewInflate)) != null) {
                            i = oO00O0oO.vSwitch;
                            Switch r5 = (Switch) OooOO0.OooO00o(i, viewInflate);
                            if (r5 != null) {
                                return new sb((LinearLayout) viewInflate, textView, viewOooO00o, viewOooO00o2, r5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
