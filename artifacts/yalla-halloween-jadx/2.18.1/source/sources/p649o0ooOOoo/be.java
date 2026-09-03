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
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class be implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f49032OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49033OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49034OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49035OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49037OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49038OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49039OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49040OooO0oo;

    public be(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull NetImageView netImageView2, @NonNull TextView textView4, @NonNull ImageView imageView2) {
        this.f49033OooO00o = linearLayout;
        this.f49034OooO0O0 = netImageView;
        this.f49035OooO0OO = textView;
        this.f49036OooO0Oo = imageView;
        this.f49038OooO0o0 = textView2;
        this.f49037OooO0o = textView3;
        this.f49039OooO0oO = netImageView2;
        this.f49040OooO0oo = textView4;
        this.f49032OooO = imageView2;
    }

    @NonNull
    public static be inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49033OooO00o;
    }

    @NonNull
    public static be inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_view_ad, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ad_iv;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ad_iv);
        if (netImageView != null) {
            i = R.id.content_tv;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.content_tv);
            if (textView != null) {
                i = R.id.del_iv;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.del_iv);
                if (imageView != null) {
                    i = R.id.description_tv;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.description_tv);
                    if (textView2 != null) {
                        i = R.id.download_tv;
                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.download_tv);
                        if (textView3 != null) {
                            i = R.id.head_iv;
                            NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head_iv);
                            if (netImageView2 != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                i = R.id.name_tv;
                                TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.name_tv);
                                if (textView4 != null) {
                                    i = R.id.tag_iv;
                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tag_iv)) != null) {
                                        i = R.id.title_bg_iv;
                                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.title_bg_iv);
                                        if (imageView2 != null) {
                                            return new be(linearLayout, netImageView, textView, imageView, textView2, textView3, netImageView2, textView4, imageView2);
                                        }
                                    }
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
