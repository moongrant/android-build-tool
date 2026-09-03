package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43790OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43791OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Space f43792OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f43793OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f43794OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f43795OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f43796OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f43797OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f43798OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f43799OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f43800OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f43801OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f43802OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f43803OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f43804OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f43805OooOOOo;

    public e(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull SVGAView sVGAView, @NonNull NetImageView netImageView, @NonNull ImageView imageView4, @NonNull ConstraintLayout constraintLayout2, @NonNull GiftNumberView giftNumberView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f43791OooO00o = constraintLayout;
        this.f43792OooO0O0 = space;
        this.f43793OooO0OO = imageView;
        this.f43794OooO0Oo = imageView2;
        this.f43796OooO0o0 = imageView3;
        this.f43795OooO0o = sVGAView;
        this.f43797OooO0oO = netImageView;
        this.f43798OooO0oo = imageView4;
        this.f43790OooO = constraintLayout2;
        this.f43799OooOO0 = giftNumberView;
        this.f43800OooOO0O = textView;
        this.f43801OooOO0o = textView2;
        this.f43803OooOOO0 = textView3;
        this.f43802OooOOO = textView4;
        this.f43804OooOOOO = textView5;
        this.f43805OooOOOo = textView6;
    }

    @NonNull
    public static e inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43791OooO00o;
    }

    @NonNull
    public static e inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_chat_reply, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bottomSpace;
        if (((Space) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.endSpace;
            Space space = (Space) OooO0O0.OooO00o(i, viewInflate);
            if (space != null) {
                i = o0OO00O.ivEmojiTag;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ivGiftTag;
                    ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = o0OO00O.ivPicTag;
                        ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView3 != null) {
                            i = o0OO00O.ivReplyGift;
                            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                            if (sVGAView != null) {
                                i = o0OO00O.ivReplyPicGif;
                                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (netImageView != null) {
                                    i = o0OO00O.ivToTag;
                                    ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView4 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        i = o0OO00O.numberView;
                                        GiftNumberView giftNumberView = (GiftNumberView) OooO0O0.OooO00o(i, viewInflate);
                                        if (giftNumberView != null) {
                                            i = o0OO00O.startSpace;
                                            if (((Space) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                i = o0OO00O.tvEmojiTag;
                                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    i = o0OO00O.tvGiftTag;
                                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView2 != null) {
                                                        i = o0OO00O.tvPicTag;
                                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView3 != null) {
                                                            i = o0OO00O.tvText;
                                                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView4 != null) {
                                                                i = o0OO00O.tvToTag;
                                                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = o0OO00O.tvUser;
                                                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView6 != null) {
                                                                        return new e(constraintLayout, space, imageView, imageView2, imageView3, sVGAView, netImageView, imageView4, constraintLayout, giftNumberView, textView, textView2, textView3, textView4, textView5, textView6);
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
