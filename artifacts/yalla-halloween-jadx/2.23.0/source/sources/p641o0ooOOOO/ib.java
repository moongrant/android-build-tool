package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ib implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58148OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58149OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58150OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f58151OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f58152OooO0o0;

    public ib(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView) {
        this.f58148OooO00o = linearLayout;
        this.f58149OooO0O0 = imageView;
        this.f58150OooO0OO = imageView2;
        this.f58151OooO0Oo = view;
        this.f58152OooO0o0 = textView;
    }

    @NonNull
    public static ib inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58148OooO00o;
    }

    @NonNull
    public static ib inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_dialog_title, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivEnd;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.ivStart;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i = oO00O0oO.line;
                View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
                if (viewOooO00o != null) {
                    i = oO00O0oO.tvTitle;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        return new ib(linearLayout, imageView, imageView2, viewOooO00o, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
