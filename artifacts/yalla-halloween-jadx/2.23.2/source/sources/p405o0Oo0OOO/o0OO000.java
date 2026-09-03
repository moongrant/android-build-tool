package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44563OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ScrollView f44564OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final DotView f44565OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final DotView f44566OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DotView f44567OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44568OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44569OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44570OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44571OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44572OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44573OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44574OooOO0o;

    public o0OO000(@NonNull ScrollView scrollView, @NonNull DotView dotView, @NonNull DotView dotView2, @NonNull DotView dotView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8) {
        this.f44564OooO00o = scrollView;
        this.f44565OooO0O0 = dotView;
        this.f44566OooO0OO = dotView2;
        this.f44567OooO0Oo = dotView3;
        this.f44569OooO0o0 = linearLayout;
        this.f44568OooO0o = linearLayout2;
        this.f44570OooO0oO = linearLayout3;
        this.f44571OooO0oo = linearLayout4;
        this.f44563OooO = linearLayout5;
        this.f44572OooOO0 = linearLayout6;
        this.f44573OooOO0O = linearLayout7;
        this.f44574OooOO0o = linearLayout8;
    }

    @NonNull
    public static o0OO000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44564OooO00o;
    }

    @NonNull
    public static o0OO000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.fragment_store_coin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.barrier_room;
        if (((Barrier) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.dotChatBubble;
            DotView dotView = (DotView) OooO0O0.OooO00o(i, viewInflate);
            if (dotView != null) {
                i = o0OO00O.dotRoomId;
                DotView dotView2 = (DotView) OooO0O0.OooO00o(i, viewInflate);
                if (dotView2 != null) {
                    i = o0OO00O.dotUserVehicle;
                    DotView dotView3 = (DotView) OooO0O0.OooO00o(i, viewInflate);
                    if (dotView3 != null) {
                        i = o0OO00O.ll_store_room_chat_bubble;
                        LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayout != null) {
                            i = o0OO00O.ll_store_ware_room_id;
                            LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayout2 != null) {
                                i = o0OO00O.ll_store_ware_room_lock;
                                LinearLayout linearLayout3 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                if (linearLayout3 != null) {
                                    i = o0OO00O.ll_store_ware_room_theme;
                                    LinearLayout linearLayout4 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (linearLayout4 != null) {
                                        i = o0OO00O.ll_store_ware_room_top;
                                        LinearLayout linearLayout5 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                        if (linearLayout5 != null) {
                                            i = o0OO00O.ll_store_ware_user_id;
                                            LinearLayout linearLayout6 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                            if (linearLayout6 != null) {
                                                i = o0OO00O.ll_store_ware_user_skill;
                                                LinearLayout linearLayout7 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                                if (linearLayout7 != null) {
                                                    i = o0OO00O.ll_store_ware_user_vehicle;
                                                    LinearLayout linearLayout8 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                                    if (linearLayout8 != null) {
                                                        i = o0OO00O.tv_room;
                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            i = o0OO00O.tv_user;
                                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                return new o0OO000((ScrollView) viewInflate, dotView, dotView2, dotView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8);
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
