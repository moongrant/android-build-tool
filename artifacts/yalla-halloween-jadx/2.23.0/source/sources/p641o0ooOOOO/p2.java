package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import com.yalla.yalla.ui.view.DotView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class p2 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58568OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ScrollView f58569OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final DotView f58570OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final DotView f58571OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DotView f58572OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58573OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58574OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58575OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58576OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58577OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58578OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58579OooOO0o;

    public p2(@NonNull ScrollView scrollView, @NonNull DotView dotView, @NonNull DotView dotView2, @NonNull DotView dotView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8) {
        this.f58569OooO00o = scrollView;
        this.f58570OooO0O0 = dotView;
        this.f58571OooO0OO = dotView2;
        this.f58572OooO0Oo = dotView3;
        this.f58574OooO0o0 = linearLayout;
        this.f58573OooO0o = linearLayout2;
        this.f58575OooO0oO = linearLayout3;
        this.f58576OooO0oo = linearLayout4;
        this.f58568OooO = linearLayout5;
        this.f58577OooOO0 = linearLayout6;
        this.f58578OooOO0O = linearLayout7;
        this.f58579OooOO0o = linearLayout8;
    }

    @NonNull
    public static p2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58569OooO00o;
    }

    @NonNull
    public static p2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.fragment_store_coin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.barrier_room;
        if (((Barrier) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.dotChatBubble;
            DotView dotView = (DotView) OooOO0.OooO00o(i, viewInflate);
            if (dotView != null) {
                i = oO00O0oO.dotRoomId;
                DotView dotView2 = (DotView) OooOO0.OooO00o(i, viewInflate);
                if (dotView2 != null) {
                    i = oO00O0oO.dotUserVehicle;
                    DotView dotView3 = (DotView) OooOO0.OooO00o(i, viewInflate);
                    if (dotView3 != null) {
                        i = oO00O0oO.ll_store_room_chat_bubble;
                        LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayout != null) {
                            i = oO00O0oO.ll_store_ware_room_id;
                            LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayout2 != null) {
                                i = oO00O0oO.ll_store_ware_room_lock;
                                LinearLayout linearLayout3 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                if (linearLayout3 != null) {
                                    i = oO00O0oO.ll_store_ware_room_theme;
                                    LinearLayout linearLayout4 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                    if (linearLayout4 != null) {
                                        i = oO00O0oO.ll_store_ware_room_top;
                                        LinearLayout linearLayout5 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                        if (linearLayout5 != null) {
                                            i = oO00O0oO.ll_store_ware_user_id;
                                            LinearLayout linearLayout6 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                            if (linearLayout6 != null) {
                                                i = oO00O0oO.ll_store_ware_user_skill;
                                                LinearLayout linearLayout7 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                                if (linearLayout7 != null) {
                                                    i = oO00O0oO.ll_store_ware_user_vehicle;
                                                    LinearLayout linearLayout8 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                                    if (linearLayout8 != null) {
                                                        i = oO00O0oO.tv_room;
                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            i = oO00O0oO.tv_user;
                                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                return new p2((ScrollView) viewInflate, dotView, dotView2, dotView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8);
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
