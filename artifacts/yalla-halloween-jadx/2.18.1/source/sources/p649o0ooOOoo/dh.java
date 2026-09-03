package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class dh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49196OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49197OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49198OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49200OooO0o0;

    public dh(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f49196OooO00o = linearLayout;
        this.f49197OooO0O0 = imageView;
        this.f49198OooO0OO = imageView2;
        this.f49199OooO0Oo = textView;
        this.f49200OooO0o0 = textView2;
    }

    @NonNull
    public static dh OooO00o(@NonNull View view) {
        int i = R.id.ivGiftImage;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivGiftImage);
        if (imageView != null) {
            i = R.id.ivSubscript;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(view, R.id.ivSubscript);
            if (imageView2 != null) {
                i = R.id.top;
                if (((LinearLayout) o00Oo0.OooO00o(view, R.id.top)) != null) {
                    i = R.id.tvGiftContent;
                    TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvGiftContent);
                    if (textView != null) {
                        i = R.id.tvGiftTitle;
                        TextView textView2 = (TextView) o00Oo0.OooO00o(view, R.id.tvGiftTitle);
                        if (textView2 != null) {
                            return new dh((LinearLayout) view, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static dh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49196OooO00o;
    }

    @NonNull
    public static dh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_popupwindow_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
