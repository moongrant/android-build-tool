package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43921OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43923OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f43924OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Group f43925OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Group f43926OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Group f43927OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f43928OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43929OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f43930OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43931OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43932OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final NetImageView f43933OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43934OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43935OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43936OooOOOo;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull Group group4, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull SVGAView sVGAView, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull NetImageView netImageView2, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7) {
        this.f43922OooO00o = constraintLayout;
        this.f43923OooO0O0 = imageView;
        this.f43924OooO0OO = group;
        this.f43925OooO0Oo = group2;
        this.f43927OooO0o0 = group3;
        this.f43926OooO0o = group4;
        this.f43928OooO0oO = netImageView;
        this.f43929OooO0oo = appCompatTextView;
        this.f43921OooO = appCompatTextView2;
        this.f43930OooOO0 = sVGAView;
        this.f43931OooOO0O = appCompatTextView3;
        this.f43932OooOO0o = appCompatTextView4;
        this.f43934OooOOO0 = appCompatTextView5;
        this.f43933OooOOO = netImageView2;
        this.f43935OooOOOO = appCompatTextView6;
        this.f43936OooOOOo = appCompatTextView7;
    }

    @NonNull
    public static i inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43922OooO00o;
    }

    @NonNull
    public static i inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_lucky_packet_register, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.close;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.group_open;
            Group group = (Group) OooO0O0.OooO00o(i, viewInflate);
            if (group != null) {
                i = o0OO00O.group_result;
                Group group2 = (Group) OooO0O0.OooO00o(i, viewInflate);
                if (group2 != null) {
                    i = o0OO00O.group_result_not;
                    Group group3 = (Group) OooO0O0.OooO00o(i, viewInflate);
                    if (group3 != null) {
                        i = o0OO00O.group_result_ok_details;
                        Group group4 = (Group) OooO0O0.OooO00o(i, viewInflate);
                        if (group4 != null) {
                            i = o0OO00O.head;
                            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (netImageView != null) {
                                i = o0OO00O.info;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                if (appCompatTextView != null) {
                                    i = o0OO00O.number;
                                    if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                        i = o0OO00O.open;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (appCompatTextView2 != null) {
                                            i = o0OO00O.open_svga;
                                            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                            if (sVGAView != null) {
                                                i = o0OO00O.pic;
                                                if (((NetImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                    i = o0OO00O.result_details;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (appCompatTextView3 != null) {
                                                        i = o0OO00O.result_info_not;
                                                        if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            i = o0OO00O.result_number;
                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (appCompatTextView4 != null) {
                                                                i = o0OO00O.result_ok;
                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (appCompatTextView5 != null) {
                                                                    i = o0OO00O.result_pic;
                                                                    NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (netImageView2 != null) {
                                                                        i = o0OO00O.result_pic_not;
                                                                        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                            i = o0OO00O.result_title;
                                                                            if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                i = o0OO00O.selected;
                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                if (appCompatTextView6 != null) {
                                                                                    i = o0OO00O.title;
                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                    if (appCompatTextView7 != null) {
                                                                                        i = o0OO00O.titleInfo;
                                                                                        if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                            i = o0OO00O.topBg;
                                                                                            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                                                return new i((ConstraintLayout) viewInflate, imageView, group, group2, group3, group4, netImageView, appCompatTextView, appCompatTextView2, sVGAView, appCompatTextView3, appCompatTextView4, appCompatTextView5, netImageView2, appCompatTextView6, appCompatTextView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
