package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class l9 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49919OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageButton f49921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageButton f49922OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageButton f49923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f49924OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49925OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49926OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f49927OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49928OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49929OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49930OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49931OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49932OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49933OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49934OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49935OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f49936OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f49937OooOOoo;

    public l9(@NonNull LinearLayout linearLayout, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull ImageButton imageButton3, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f49920OooO00o = linearLayout;
        this.f49921OooO0O0 = imageButton;
        this.f49922OooO0OO = imageButton2;
        this.f49923OooO0Oo = imageButton3;
        this.f49925OooO0o0 = netImageView;
        this.f49924OooO0o = netImageView2;
        this.f49926OooO0oO = netImageView3;
        this.f49927OooO0oo = relativeLayout;
        this.f49919OooO = constraintLayout;
        this.f49928OooOO0 = constraintLayout2;
        this.f49929OooOO0O = constraintLayout3;
        this.f49930OooOO0o = textView;
        this.f49932OooOOO0 = textView2;
        this.f49931OooOOO = textView3;
        this.f49933OooOOOO = textView4;
        this.f49934OooOOOo = textView5;
        this.f49936OooOOo0 = textView6;
        this.f49935OooOOo = textView7;
        this.f49937OooOOoo = textView8;
    }

    @NonNull
    public static l9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49920OooO00o;
    }

    @NonNull
    public static l9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_added_topic_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.click_member_0;
        ImageButton imageButton = (ImageButton) o00Oo0.OooO00o(viewInflate, R.id.click_member_0);
        if (imageButton != null) {
            i = R.id.click_member_1;
            ImageButton imageButton2 = (ImageButton) o00Oo0.OooO00o(viewInflate, R.id.click_member_1);
            if (imageButton2 != null) {
                i = R.id.click_member_2;
                ImageButton imageButton3 = (ImageButton) o00Oo0.OooO00o(viewInflate, R.id.click_member_2);
                if (imageButton3 != null) {
                    i = R.id.head_0;
                    NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head_0);
                    if (netImageView != null) {
                        i = R.id.head_1;
                        NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head_1);
                        if (netImageView2 != null) {
                            i = R.id.head_2;
                            NetImageView netImageView3 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head_2);
                            if (netImageView3 != null) {
                                i = R.id.layout;
                                RelativeLayout relativeLayout = (RelativeLayout) o00Oo0.OooO00o(viewInflate, R.id.layout);
                                if (relativeLayout != null) {
                                    i = R.id.layout_0;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_0);
                                    if (constraintLayout != null) {
                                        i = R.id.layout_1;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_1);
                                        if (constraintLayout2 != null) {
                                            i = R.id.layout_2;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_2);
                                            if (constraintLayout3 != null) {
                                                i = R.id.member_0;
                                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.member_0);
                                                if (textView != null) {
                                                    i = R.id.member_1;
                                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.member_1);
                                                    if (textView2 != null) {
                                                        i = R.id.member_2;
                                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.member_2);
                                                        if (textView3 != null) {
                                                            i = R.id.member_info_0;
                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.member_info_0)) != null) {
                                                                i = R.id.member_info_1;
                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.member_info_1)) != null) {
                                                                    i = R.id.member_info_2;
                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.member_info_2)) != null) {
                                                                        i = R.id.more;
                                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.more);
                                                                        if (textView4 != null) {
                                                                            i = R.id.name_0;
                                                                            TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.name_0);
                                                                            if (textView5 != null) {
                                                                                i = R.id.name_1;
                                                                                TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.name_1);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.name_2;
                                                                                    TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.name_2);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.title;
                                                                                        TextView textView8 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.title);
                                                                                        if (textView8 != null) {
                                                                                            return new l9((LinearLayout) viewInflate, imageButton, imageButton2, imageButton3, netImageView, netImageView2, netImageView3, relativeLayout, constraintLayout, constraintLayout2, constraintLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
