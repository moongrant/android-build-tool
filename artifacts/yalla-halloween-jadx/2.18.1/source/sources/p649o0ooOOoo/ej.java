package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.view.GiftNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ej implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49297OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49298OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49299OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49300OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f49302OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49303OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49304OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49305OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49306OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f49307OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49308OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49309OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49310OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49311OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49312OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f49313OooOOo0;

    public ej(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull SVGAView sVGAView, @NonNull NetImageView netImageView, @NonNull ImageView imageView5, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull GiftNumberView giftNumberView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f49298OooO00o = constraintLayout;
        this.f49299OooO0O0 = imageView;
        this.f49300OooO0OO = imageView2;
        this.f49301OooO0Oo = imageView3;
        this.f49303OooO0o0 = imageView4;
        this.f49302OooO0o = sVGAView;
        this.f49304OooO0oO = netImageView;
        this.f49305OooO0oo = imageView5;
        this.f49297OooO = constraintLayout2;
        this.f49306OooOO0 = constraintLayout3;
        this.f49307OooOO0O = giftNumberView;
        this.f49308OooOO0o = textView;
        this.f49310OooOOO0 = textView2;
        this.f49309OooOOO = textView3;
        this.f49311OooOOOO = textView4;
        this.f49312OooOOOo = textView5;
        this.f49313OooOOo0 = textView6;
    }

    @NonNull
    public static ej inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49298OooO00o;
    }

    @NonNull
    public static ej inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_room_reply, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivEmojiTag;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEmojiTag);
        if (imageView != null) {
            i = R.id.ivGiftTag;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftTag);
            if (imageView2 != null) {
                i = R.id.ivPicTag;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPicTag);
                if (imageView3 != null) {
                    i = R.id.ivReplyClose;
                    ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivReplyClose);
                    if (imageView4 != null) {
                        i = R.id.ivReplyGift;
                        SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.ivReplyGift);
                        if (sVGAView != null) {
                            i = R.id.ivReplyPicGif;
                            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivReplyPicGif);
                            if (netImageView != null) {
                                i = R.id.ivToTag;
                                ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivToTag);
                                if (imageView5 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = R.id.layoutReplyEnd;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutReplyEnd);
                                    if (constraintLayout2 != null) {
                                        i = R.id.numberView;
                                        GiftNumberView giftNumberView = (GiftNumberView) o00Oo0.OooO00o(viewInflate, R.id.numberView);
                                        if (giftNumberView != null) {
                                            i = R.id.tvEmojiTag;
                                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvEmojiTag);
                                            if (textView != null) {
                                                i = R.id.tvGiftTag;
                                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGiftTag);
                                                if (textView2 != null) {
                                                    i = R.id.tvPicTag;
                                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPicTag);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_reply_bottom_space;
                                                        if (((Space) o00Oo0.OooO00o(viewInflate, R.id.tv_reply_bottom_space)) != null) {
                                                            i = R.id.tv_reply_start_space;
                                                            if (((Space) o00Oo0.OooO00o(viewInflate, R.id.tv_reply_start_space)) != null) {
                                                                i = R.id.tvText;
                                                                TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvText);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvToTag;
                                                                    TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvToTag);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvUser;
                                                                        TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvUser);
                                                                        if (textView6 != null) {
                                                                            return new ej(constraintLayout, imageView, imageView2, imageView3, imageView4, sVGAView, netImageView, imageView5, constraintLayout, constraintLayout2, giftNumberView, textView, textView2, textView3, textView4, textView5, textView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
