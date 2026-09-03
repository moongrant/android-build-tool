package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.DotView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class f9 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49339OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ScrollView f49340OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final DotView f49341OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final DotView f49342OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DotView f49343OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49344OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49345OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49346OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49347OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49348OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49349OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49350OooOO0o;

    public f9(@NonNull ScrollView scrollView, @NonNull DotView dotView, @NonNull DotView dotView2, @NonNull DotView dotView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8) {
        this.f49340OooO00o = scrollView;
        this.f49341OooO0O0 = dotView;
        this.f49342OooO0OO = dotView2;
        this.f49343OooO0Oo = dotView3;
        this.f49345OooO0o0 = linearLayout;
        this.f49344OooO0o = linearLayout2;
        this.f49346OooO0oO = linearLayout3;
        this.f49347OooO0oo = linearLayout4;
        this.f49339OooO = linearLayout5;
        this.f49348OooOO0 = linearLayout6;
        this.f49349OooOO0O = linearLayout7;
        this.f49350OooOO0o = linearLayout8;
    }

    @NonNull
    public static f9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49340OooO00o;
    }

    @NonNull
    public static f9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_store_coin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.barrier_room;
        if (((Barrier) o00Oo0.OooO00o(viewInflate, R.id.barrier_room)) != null) {
            i = R.id.dotChatBubble;
            DotView dotView = (DotView) o00Oo0.OooO00o(viewInflate, R.id.dotChatBubble);
            if (dotView != null) {
                i = R.id.dotRoomId;
                DotView dotView2 = (DotView) o00Oo0.OooO00o(viewInflate, R.id.dotRoomId);
                if (dotView2 != null) {
                    i = R.id.dotUserVehicle;
                    DotView dotView3 = (DotView) o00Oo0.OooO00o(viewInflate, R.id.dotUserVehicle);
                    if (dotView3 != null) {
                        i = R.id.ll_store_room_chat_bubble;
                        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_room_chat_bubble);
                        if (linearLayout != null) {
                            i = R.id.ll_store_ware_room_id;
                            LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_ware_room_id);
                            if (linearLayout2 != null) {
                                i = R.id.ll_store_ware_room_lock;
                                LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_ware_room_lock);
                                if (linearLayout3 != null) {
                                    i = R.id.ll_store_ware_room_theme;
                                    LinearLayout linearLayout4 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_ware_room_theme);
                                    if (linearLayout4 != null) {
                                        i = R.id.ll_store_ware_room_top;
                                        LinearLayout linearLayout5 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_ware_room_top);
                                        if (linearLayout5 != null) {
                                            i = R.id.ll_store_ware_user_id;
                                            LinearLayout linearLayout6 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_ware_user_id);
                                            if (linearLayout6 != null) {
                                                i = R.id.ll_store_ware_user_skill;
                                                LinearLayout linearLayout7 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_ware_user_skill);
                                                if (linearLayout7 != null) {
                                                    i = R.id.ll_store_ware_user_vehicle;
                                                    LinearLayout linearLayout8 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_store_ware_user_vehicle);
                                                    if (linearLayout8 != null) {
                                                        i = R.id.tv_room;
                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_room)) != null) {
                                                            i = R.id.tv_user;
                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_user)) != null) {
                                                                return new f9((ScrollView) viewInflate, dotView, dotView2, dotView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8);
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
