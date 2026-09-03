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
import com.yalla.yalla.ui.view.GiftRunWayNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ui implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50752OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50754OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50755OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final GiftRunWayNumberView f50757OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50758OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50759OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f50760OooO0oo;

    public ui(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull GiftRunWayNumberView giftRunWayNumberView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f50753OooO00o = linearLayout;
        this.f50754OooO0O0 = netImageView;
        this.f50755OooO0OO = netImageView2;
        this.f50756OooO0Oo = imageView;
        this.f50758OooO0o0 = linearLayout2;
        this.f50757OooO0o = giftRunWayNumberView;
        this.f50759OooO0oO = textView;
        this.f50760OooO0oo = textView2;
        this.f50752OooO = textView3;
    }

    @NonNull
    public static ui inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50753OooO00o;
    }

    @NonNull
    public static ui inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_run_way_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.iv_from_head;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_from_head);
        if (netImageView != null) {
            i = R.id.iv_gift;
            NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_gift);
            if (netImageView2 != null) {
                i = R.id.iv_gift_bg;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_gift_bg);
                if (imageView != null) {
                    i = R.id.layout_content;
                    LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_content);
                    if (linearLayout != null) {
                        i = R.id.layout_count;
                        GiftRunWayNumberView giftRunWayNumberView = (GiftRunWayNumberView) o00Oo0.OooO00o(viewInflate, R.id.layout_count);
                        if (giftRunWayNumberView != null) {
                            i = R.id.layout_text_content;
                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_text_content)) != null) {
                                i = R.id.tv_content_tips;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_content_tips);
                                if (textView != null) {
                                    i = R.id.tv_from_user;
                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_from_user);
                                    if (textView2 != null) {
                                        i = R.id.tv_to_user;
                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_to_user);
                                        if (textView3 != null) {
                                            return new ui((LinearLayout) viewInflate, netImageView, netImageView2, imageView, linearLayout, giftRunWayNumberView, textView, textView2, textView3);
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
