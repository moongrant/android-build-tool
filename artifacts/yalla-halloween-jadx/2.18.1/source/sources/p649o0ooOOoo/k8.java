package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class k8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49830OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f49831OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49833OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49834OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49835OooO0oO;

    public k8(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f49829OooO00o = linearLayout;
        this.f49830OooO0O0 = imageView;
        this.f49831OooO0OO = relativeLayout;
        this.f49832OooO0Oo = textView;
        this.f49834OooO0o0 = textView2;
        this.f49833OooO0o = textView3;
        this.f49835OooO0oO = textView4;
    }

    @NonNull
    public static k8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49829OooO00o;
    }

    @NonNull
    public static k8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_update_app, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.iv_cancel;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_cancel);
        if (imageView != null) {
            i = R.id.layout_bg;
            RelativeLayout relativeLayout = (RelativeLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_bg);
            if (relativeLayout != null) {
                i = R.id.layout_content;
                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_content)) != null) {
                    i = R.id.tv_confirm;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_confirm);
                    if (textView != null) {
                        i = R.id.tv_info;
                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_info);
                        if (textView2 != null) {
                            i = R.id.tv_title;
                            TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_title);
                            if (textView3 != null) {
                                i = R.id.tv_version_name;
                                TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_version_name);
                                if (textView4 != null) {
                                    return new k8((LinearLayout) viewInflate, imageView, relativeLayout, textView, textView2, textView3, textView4);
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
