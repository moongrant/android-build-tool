package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43902OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43903OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f43904OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f43905OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f43906OooO0o0;

    public h1(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f43902OooO00o = linearLayout;
        this.f43903OooO0O0 = imageView;
        this.f43904OooO0OO = imageView2;
        this.f43905OooO0Oo = textView;
        this.f43906OooO0o0 = textView2;
    }

    @NonNull
    public static h1 OooO00o(@NonNull View view) {
        int i = o0OO00O.ivGiftImage;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
        if (imageView != null) {
            i = o0OO00O.ivSubscript;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, view);
            if (imageView2 != null) {
                i = o0OO00O.top;
                if (((LinearLayout) OooO0O0.OooO00o(i, view)) != null) {
                    i = o0OO00O.tvGiftContent;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, view);
                    if (textView != null) {
                        i = o0OO00O.tvGiftTitle;
                        TextView textView2 = (TextView) OooO0O0.OooO00o(i, view);
                        if (textView2 != null) {
                            return new h1((LinearLayout) view, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static h1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43902OooO00o;
    }

    @NonNull
    public static h1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_popupwindow_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
