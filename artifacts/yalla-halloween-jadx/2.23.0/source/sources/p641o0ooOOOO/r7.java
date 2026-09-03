package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class r7 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58738OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58739OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Space f58740OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58741OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f58743OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58744OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f58745OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58746OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f58747OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58748OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58749OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58750OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58751OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58752OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f58753OooOOOo;

    public r7(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull SVGAView sVGAView, @NonNull NetImageView netImageView, @NonNull ImageView imageView4, @NonNull ConstraintLayout constraintLayout2, @NonNull GiftNumberView giftNumberView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f58739OooO00o = constraintLayout;
        this.f58740OooO0O0 = space;
        this.f58741OooO0OO = imageView;
        this.f58742OooO0Oo = imageView2;
        this.f58744OooO0o0 = imageView3;
        this.f58743OooO0o = sVGAView;
        this.f58745OooO0oO = netImageView;
        this.f58746OooO0oo = imageView4;
        this.f58738OooO = constraintLayout2;
        this.f58747OooOO0 = giftNumberView;
        this.f58748OooOO0O = textView;
        this.f58749OooOO0o = textView2;
        this.f58751OooOOO0 = textView3;
        this.f58750OooOOO = textView4;
        this.f58752OooOOOO = textView5;
        this.f58753OooOOOo = textView6;
    }

    @NonNull
    public static r7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58739OooO00o;
    }

    @NonNull
    public static r7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_chat_reply, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomSpace;
        if (((Space) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.endSpace;
            Space space = (Space) OooOO0.OooO00o(i, viewInflate);
            if (space != null) {
                i = oO00O0oO.ivEmojiTag;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.ivGiftTag;
                    ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = oO00O0oO.ivPicTag;
                        ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView3 != null) {
                            i = oO00O0oO.ivReplyGift;
                            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                            if (sVGAView != null) {
                                i = oO00O0oO.ivReplyPicGif;
                                NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                if (netImageView != null) {
                                    i = oO00O0oO.ivToTag;
                                    ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView4 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        i = oO00O0oO.numberView;
                                        GiftNumberView giftNumberView = (GiftNumberView) OooOO0.OooO00o(i, viewInflate);
                                        if (giftNumberView != null) {
                                            i = oO00O0oO.startSpace;
                                            if (((Space) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                i = oO00O0oO.tvEmojiTag;
                                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    i = oO00O0oO.tvGiftTag;
                                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView2 != null) {
                                                        i = oO00O0oO.tvPicTag;
                                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView3 != null) {
                                                            i = oO00O0oO.tvText;
                                                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView4 != null) {
                                                                i = oO00O0oO.tvToTag;
                                                                TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = oO00O0oO.tvUser;
                                                                    TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView6 != null) {
                                                                        return new r7(constraintLayout, space, imageView, imageView2, imageView3, sVGAView, netImageView, imageView4, constraintLayout, giftNumberView, textView, textView2, textView3, textView4, textView5, textView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
