package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class v7 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59059OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59060OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59061OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f59062OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Group f59063OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Group f59064OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Group f59065OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f59066OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59067OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f59068OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59069OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59070OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final NetImageView f59071OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59072OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59073OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59074OooOOOo;

    public v7(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull Group group4, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull SVGAView sVGAView, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull NetImageView netImageView2, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7) {
        this.f59060OooO00o = constraintLayout;
        this.f59061OooO0O0 = imageView;
        this.f59062OooO0OO = group;
        this.f59063OooO0Oo = group2;
        this.f59065OooO0o0 = group3;
        this.f59064OooO0o = group4;
        this.f59066OooO0oO = netImageView;
        this.f59067OooO0oo = appCompatTextView;
        this.f59059OooO = appCompatTextView2;
        this.f59068OooOO0 = sVGAView;
        this.f59069OooOO0O = appCompatTextView3;
        this.f59070OooOO0o = appCompatTextView4;
        this.f59072OooOOO0 = appCompatTextView5;
        this.f59071OooOOO = netImageView2;
        this.f59073OooOOOO = appCompatTextView6;
        this.f59074OooOOOo = appCompatTextView7;
    }

    @NonNull
    public static v7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59060OooO00o;
    }

    @NonNull
    public static v7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_lucky_packet_register, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.close;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.group_open;
            Group group = (Group) OooOO0.OooO00o(i, viewInflate);
            if (group != null) {
                i = oO00O0oO.group_result;
                Group group2 = (Group) OooOO0.OooO00o(i, viewInflate);
                if (group2 != null) {
                    i = oO00O0oO.group_result_not;
                    Group group3 = (Group) OooOO0.OooO00o(i, viewInflate);
                    if (group3 != null) {
                        i = oO00O0oO.group_result_ok_details;
                        Group group4 = (Group) OooOO0.OooO00o(i, viewInflate);
                        if (group4 != null) {
                            i = oO00O0oO.head;
                            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                            if (netImageView != null) {
                                i = oO00O0oO.info;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                if (appCompatTextView != null) {
                                    i = oO00O0oO.number;
                                    if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                        i = oO00O0oO.open;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                        if (appCompatTextView2 != null) {
                                            i = oO00O0oO.open_svga;
                                            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                            if (sVGAView != null) {
                                                i = oO00O0oO.pic;
                                                if (((NetImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                    i = oO00O0oO.result_details;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (appCompatTextView3 != null) {
                                                        i = oO00O0oO.result_info_not;
                                                        if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            i = oO00O0oO.result_number;
                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (appCompatTextView4 != null) {
                                                                i = oO00O0oO.result_ok;
                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (appCompatTextView5 != null) {
                                                                    i = oO00O0oO.result_pic;
                                                                    NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (netImageView2 != null) {
                                                                        i = oO00O0oO.result_pic_not;
                                                                        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                            i = oO00O0oO.result_title;
                                                                            if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                i = oO00O0oO.selected;
                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                                                                if (appCompatTextView6 != null) {
                                                                                    i = oO00O0oO.title;
                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                                                                    if (appCompatTextView7 != null) {
                                                                                        i = oO00O0oO.titleInfo;
                                                                                        if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                            i = oO00O0oO.topBg;
                                                                                            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                                                return new v7((ConstraintLayout) viewInflate, imageView, group, group2, group3, group4, netImageView, appCompatTextView, appCompatTextView2, sVGAView, appCompatTextView3, appCompatTextView4, appCompatTextView5, netImageView2, appCompatTextView6, appCompatTextView7);
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
