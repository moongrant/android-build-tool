package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class jb implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58202OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58204OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58205OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f58206OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final HorizontalScrollView f58207OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58208OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58209OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58210OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58211OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58212OooOO0O;

    public jb(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull HorizontalScrollView horizontalScrollView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f58203OooO00o = constraintLayout;
        this.f58204OooO0O0 = netImageView;
        this.f58205OooO0OO = imageView;
        this.f58206OooO0Oo = netImageView2;
        this.f58208OooO0o0 = netImageView3;
        this.f58207OooO0o = horizontalScrollView;
        this.f58209OooO0oO = recyclerView;
        this.f58210OooO0oo = textView;
        this.f58202OooO = textView2;
        this.f58211OooOO0 = textView3;
        this.f58212OooOO0O = textView4;
    }

    @NonNull
    public static jb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58203OooO00o;
    }

    @NonNull
    public static jb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_gift_blind_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivBlindBg;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = oO00O0oO.ivBlindView;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.ivGetGift;
                NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView2 != null) {
                    i = oO00O0oO.ivSendGift;
                    NetImageView netImageView3 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView3 != null) {
                        i = oO00O0oO.ivSendGiftArrow;
                        if (((NetImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = oO00O0oO.llBlindViewBg;
                            if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                i = oO00O0oO.llNew;
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) OooOO0.OooO00o(i, viewInflate);
                                if (horizontalScrollView != null) {
                                    i = oO00O0oO.rvBlindGiftTipsList;
                                    RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                                    if (recyclerView != null) {
                                        i = oO00O0oO.tvBlindMaySend;
                                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView != null) {
                                            i = oO00O0oO.tvGetGift;
                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                i = oO00O0oO.tvGetGiftCount;
                                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = oO00O0oO.tvSendGift;
                                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = oO00O0oO.tvSendGiftCount;
                                                        TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            return new jb(constraintLayout, netImageView, imageView, netImageView2, netImageView3, horizontalScrollView, recyclerView, textView, textView2, textView3, textView4);
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
