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
public final class bf implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49041OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Space f49043OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49044OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f49046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49048OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49049OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f49050OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f49051OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49052OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49053OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49054OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49055OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49056OooOOOo;

    public bf(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull SVGAView sVGAView, @NonNull NetImageView netImageView, @NonNull ImageView imageView4, @NonNull ConstraintLayout constraintLayout2, @NonNull GiftNumberView giftNumberView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f49042OooO00o = constraintLayout;
        this.f49043OooO0O0 = space;
        this.f49044OooO0OO = imageView;
        this.f49045OooO0Oo = imageView2;
        this.f49047OooO0o0 = imageView3;
        this.f49046OooO0o = sVGAView;
        this.f49048OooO0oO = netImageView;
        this.f49049OooO0oo = imageView4;
        this.f49041OooO = constraintLayout2;
        this.f49050OooOO0 = giftNumberView;
        this.f49051OooOO0O = textView;
        this.f49052OooOO0o = textView2;
        this.f49054OooOOO0 = textView3;
        this.f49053OooOOO = textView4;
        this.f49055OooOOOO = textView5;
        this.f49056OooOOOo = textView6;
    }

    @NonNull
    public static bf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49042OooO00o;
    }

    @NonNull
    public static bf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_chat_reply, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bottomSpace;
        if (((Space) o00Oo0.OooO00o(viewInflate, R.id.bottomSpace)) != null) {
            i = R.id.endSpace;
            Space space = (Space) o00Oo0.OooO00o(viewInflate, R.id.endSpace);
            if (space != null) {
                i = R.id.ivEmojiTag;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEmojiTag);
                if (imageView != null) {
                    i = R.id.ivGiftTag;
                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftTag);
                    if (imageView2 != null) {
                        i = R.id.ivPicTag;
                        ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPicTag);
                        if (imageView3 != null) {
                            i = R.id.ivReplyGift;
                            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.ivReplyGift);
                            if (sVGAView != null) {
                                i = R.id.ivReplyPicGif;
                                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivReplyPicGif);
                                if (netImageView != null) {
                                    i = R.id.ivToTag;
                                    ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivToTag);
                                    if (imageView4 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        i = R.id.numberView;
                                        GiftNumberView giftNumberView = (GiftNumberView) o00Oo0.OooO00o(viewInflate, R.id.numberView);
                                        if (giftNumberView != null) {
                                            i = R.id.startSpace;
                                            if (((Space) o00Oo0.OooO00o(viewInflate, R.id.startSpace)) != null) {
                                                i = R.id.tvEmojiTag;
                                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvEmojiTag);
                                                if (textView != null) {
                                                    i = R.id.tvGiftTag;
                                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGiftTag);
                                                    if (textView2 != null) {
                                                        i = R.id.tvPicTag;
                                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPicTag);
                                                        if (textView3 != null) {
                                                            i = R.id.tvText;
                                                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvText);
                                                            if (textView4 != null) {
                                                                i = R.id.tvToTag;
                                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvToTag);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvUser;
                                                                    TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvUser);
                                                                    if (textView6 != null) {
                                                                        return new bf(constraintLayout, space, imageView, imageView2, imageView3, sVGAView, netImageView, imageView4, constraintLayout, giftNumberView, textView, textView2, textView3, textView4, textView5, textView6);
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
