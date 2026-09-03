package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class y2 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45708OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45709OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45710OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45711OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f45712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final HorizontalScrollView f45713OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45714OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45715OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45716OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45717OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f45718OooOO0O;

    public y2(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull HorizontalScrollView horizontalScrollView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f45709OooO00o = constraintLayout;
        this.f45710OooO0O0 = netImageView;
        this.f45711OooO0OO = imageView;
        this.f45712OooO0Oo = netImageView2;
        this.f45714OooO0o0 = netImageView3;
        this.f45713OooO0o = horizontalScrollView;
        this.f45715OooO0oO = recyclerView;
        this.f45716OooO0oo = textView;
        this.f45708OooO = textView2;
        this.f45717OooOO0 = textView3;
        this.f45718OooOO0O = textView4;
    }

    @NonNull
    public static y2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45709OooO00o;
    }

    @NonNull
    public static y2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_blind_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivBlindBg;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = o0OO00O.ivBlindView;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivGetGift;
                NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView2 != null) {
                    i = o0OO00O.ivSendGift;
                    NetImageView netImageView3 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (netImageView3 != null) {
                        i = o0OO00O.ivSendGiftArrow;
                        if (((NetImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = o0OO00O.llBlindViewBg;
                            if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                i = o0OO00O.llNew;
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) OooO0O0.OooO00o(i, viewInflate);
                                if (horizontalScrollView != null) {
                                    i = o0OO00O.rvBlindGiftTipsList;
                                    RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                                    if (recyclerView != null) {
                                        i = o0OO00O.tvBlindMaySend;
                                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView != null) {
                                            i = o0OO00O.tvGetGift;
                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                i = o0OO00O.tvGetGiftCount;
                                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = o0OO00O.tvSendGift;
                                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = o0OO00O.tvSendGiftCount;
                                                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            return new y2(constraintLayout, netImageView, imageView, netImageView2, netImageView3, horizontalScrollView, recyclerView, textView, textView2, textView3, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
