package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ff implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49384OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49385OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49386OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f49387OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Group f49388OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Group f49389OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Group f49390OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49391OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49392OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f49393OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49394OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49395OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49396OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49397OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49398OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49399OooOOOo;

    public ff(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull Group group4, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull SVGAView sVGAView, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull NetImageView netImageView2, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7) {
        this.f49385OooO00o = constraintLayout;
        this.f49386OooO0O0 = imageView;
        this.f49387OooO0OO = group;
        this.f49388OooO0Oo = group2;
        this.f49390OooO0o0 = group3;
        this.f49389OooO0o = group4;
        this.f49391OooO0oO = netImageView;
        this.f49392OooO0oo = appCompatTextView;
        this.f49384OooO = appCompatTextView2;
        this.f49393OooOO0 = sVGAView;
        this.f49394OooOO0O = appCompatTextView3;
        this.f49395OooOO0o = appCompatTextView4;
        this.f49397OooOOO0 = appCompatTextView5;
        this.f49396OooOOO = netImageView2;
        this.f49398OooOOOO = appCompatTextView6;
        this.f49399OooOOOo = appCompatTextView7;
    }

    @NonNull
    public static ff inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49385OooO00o;
    }

    @NonNull
    public static ff inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_lucky_packet_register, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.close;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.close);
        if (imageView != null) {
            i = R.id.group_open;
            Group group = (Group) o00Oo0.OooO00o(viewInflate, R.id.group_open);
            if (group != null) {
                i = R.id.group_result;
                Group group2 = (Group) o00Oo0.OooO00o(viewInflate, R.id.group_result);
                if (group2 != null) {
                    i = R.id.group_result_not;
                    Group group3 = (Group) o00Oo0.OooO00o(viewInflate, R.id.group_result_not);
                    if (group3 != null) {
                        i = R.id.group_result_ok_details;
                        Group group4 = (Group) o00Oo0.OooO00o(viewInflate, R.id.group_result_ok_details);
                        if (group4 != null) {
                            i = R.id.head;
                            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head);
                            if (netImageView != null) {
                                i = R.id.info;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.info);
                                if (appCompatTextView != null) {
                                    i = R.id.number;
                                    if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.number)) != null) {
                                        i = R.id.open;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.open);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.open_svga;
                                            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.open_svga);
                                            if (sVGAView != null) {
                                                i = R.id.pic;
                                                if (((NetImageView) o00Oo0.OooO00o(viewInflate, R.id.pic)) != null) {
                                                    i = R.id.result_details;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.result_details);
                                                    if (appCompatTextView3 != null) {
                                                        i = R.id.result_info_not;
                                                        if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.result_info_not)) != null) {
                                                            i = R.id.result_number;
                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.result_number);
                                                            if (appCompatTextView4 != null) {
                                                                i = R.id.result_ok;
                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.result_ok);
                                                                if (appCompatTextView5 != null) {
                                                                    i = R.id.result_pic;
                                                                    NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.result_pic);
                                                                    if (netImageView2 != null) {
                                                                        i = R.id.result_pic_not;
                                                                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.result_pic_not)) != null) {
                                                                            i = R.id.result_title;
                                                                            if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.result_title)) != null) {
                                                                                i = R.id.selected;
                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.selected);
                                                                                if (appCompatTextView6 != null) {
                                                                                    i = R.id.title;
                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.title);
                                                                                    if (appCompatTextView7 != null) {
                                                                                        i = R.id.titleInfo;
                                                                                        if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.titleInfo)) != null) {
                                                                                            i = R.id.topBg;
                                                                                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.topBg)) != null) {
                                                                                                return new ff((ConstraintLayout) viewInflate, imageView, group, group2, group3, group4, netImageView, appCompatTextView, appCompatTextView2, sVGAView, appCompatTextView3, appCompatTextView4, appCompatTextView5, netImageView2, appCompatTextView6, appCompatTextView7);
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
