package p407o0Oo0OOO;

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
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43934OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f43935OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f43936OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f43937OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Switch f43938OooO0o0;

    public i3(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull Switch r5) {
        this.f43934OooO00o = linearLayout;
        this.f43935OooO0O0 = textView;
        this.f43936OooO0OO = view;
        this.f43937OooO0Oo = view2;
        this.f43938OooO0o0 = r5;
    }

    @NonNull
    public static i3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43934OooO00o;
    }

    @NonNull
    public static i3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(o0OO00O.view_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.dotView;
        if (((DotView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0Oo0oo.ivImage;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0Oo0oo.llItem;
                if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0Oo0oo.tvContent;
                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0Oo0oo.tvTitle;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0Oo0oo.vLineBottom), viewInflate)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0Oo0oo.vLineTop), viewInflate)) != null) {
                            i = o0Oo0oo.vSwitch;
                            Switch r5 = (Switch) OooO0O0.OooO00o(i, viewInflate);
                            if (r5 != null) {
                                return new i3((LinearLayout) viewInflate, textView, viewOooO00o, viewOooO00o2, r5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
