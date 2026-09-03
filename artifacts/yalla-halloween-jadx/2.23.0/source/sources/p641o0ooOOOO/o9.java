package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.UserIdentityView;
import com.yalla.yalla.ui.view.UserNameView;
import com.yalla.yalla.ui.view.UserOfficialsView;
import com.yalla.yalla.ui.view.room.RoomMemberBadgeView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o9 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f58537OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58538OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RoomMemberBadgeView f58539OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f58540OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f58541OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final UserNameView f58542OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58543OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58544OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final UserOfficialsView f58545OooO0oo;

    public o9(@NonNull LinearLayout linearLayout, @NonNull RoomMemberBadgeView roomMemberBadgeView, @NonNull NetImageView netImageView, @NonNull UserIdentityView userIdentityView, @NonNull ImageView imageView, @NonNull UserNameView userNameView, @NonNull TextView textView, @NonNull UserOfficialsView userOfficialsView, @NonNull ImageView imageView2) {
        this.f58538OooO00o = linearLayout;
        this.f58539OooO0O0 = roomMemberBadgeView;
        this.f58540OooO0OO = netImageView;
        this.f58541OooO0Oo = userIdentityView;
        this.f58543OooO0o0 = imageView;
        this.f58542OooO0o = userNameView;
        this.f58544OooO0oO = textView;
        this.f58545OooO0oo = userOfficialsView;
        this.f58537OooO = imageView2;
    }

    @NonNull
    public static o9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58538OooO00o;
    }

    @NonNull
    public static o9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_member_convene_select_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.badge;
        RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) OooOO0.OooO00o(i, viewInflate);
        if (roomMemberBadgeView != null) {
            i = oO00O0oO.head;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = oO00O0oO.identity;
                UserIdentityView userIdentityView = (UserIdentityView) OooOO0.OooO00o(i, viewInflate);
                if (userIdentityView != null) {
                    i = oO00O0oO.inRoom;
                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = oO00O0oO.name;
                        UserNameView userNameView = (UserNameView) OooOO0.OooO00o(i, viewInflate);
                        if (userNameView != null) {
                            i = oO00O0oO.number;
                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView != null) {
                                i = oO00O0oO.officials;
                                UserOfficialsView userOfficialsView = (UserOfficialsView) OooOO0.OooO00o(i, viewInflate);
                                if (userOfficialsView != null) {
                                    i = oO00O0oO.select;
                                    ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView2 != null) {
                                        return new o9((LinearLayout) viewInflate, roomMemberBadgeView, netImageView, userIdentityView, imageView, userNameView, textView, userOfficialsView, imageView2);
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
