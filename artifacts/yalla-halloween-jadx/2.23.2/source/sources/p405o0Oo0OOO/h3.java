package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43916OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f43917OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f43918OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f43919OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Switch f43920OooO0o0;

    public h3(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull Switch r5) {
        this.f43916OooO00o = linearLayout;
        this.f43917OooO0O0 = textView;
        this.f43918OooO0OO = view;
        this.f43919OooO0Oo = view2;
        this.f43920OooO0o0 = r5;
    }

    @NonNull
    public static h3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43916OooO00o;
    }

    @NonNull
    public static h3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.dotView;
        if (((DotView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ivImage;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.llItem;
                if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.tvContent;
                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.tvTitle;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vLineBottom), viewInflate)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.vLineTop), viewInflate)) != null) {
                            i = o0OO00O.vSwitch;
                            Switch r5 = (Switch) OooO0O0.OooO00o(i, viewInflate);
                            if (r5 != null) {
                                return new h3((LinearLayout) viewInflate, textView, viewOooO00o, viewOooO00o2, r5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
