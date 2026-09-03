package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserIdentityView;
import com.yalla.yalla.common.ui.view.UserNameView;
import com.yalla.yalla.common.ui.view.UserOfficialsView;
import com.yalla.yalla.ui.view.RoomMemberBadgeView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zg implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f51099OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RoomMemberBadgeView f51101OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f51102OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f51103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final UserNameView f51104OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f51105OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f51106OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final UserOfficialsView f51107OooO0oo;

    public zg(@NonNull LinearLayout linearLayout, @NonNull RoomMemberBadgeView roomMemberBadgeView, @NonNull NetImageView netImageView, @NonNull UserIdentityView userIdentityView, @NonNull ImageView imageView, @NonNull UserNameView userNameView, @NonNull TextView textView, @NonNull UserOfficialsView userOfficialsView, @NonNull ImageView imageView2) {
        this.f51100OooO00o = linearLayout;
        this.f51101OooO0O0 = roomMemberBadgeView;
        this.f51102OooO0OO = netImageView;
        this.f51103OooO0Oo = userIdentityView;
        this.f51105OooO0o0 = imageView;
        this.f51104OooO0o = userNameView;
        this.f51106OooO0oO = textView;
        this.f51107OooO0oo = userOfficialsView;
        this.f51099OooO = imageView2;
    }

    @NonNull
    public static zg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51100OooO00o;
    }

    @NonNull
    public static zg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_member_convene_select_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.badge;
        RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) o00Oo0.OooO00o(viewInflate, R.id.badge);
        if (roomMemberBadgeView != null) {
            i = R.id.head;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head);
            if (netImageView != null) {
                i = R.id.identity;
                UserIdentityView userIdentityView = (UserIdentityView) o00Oo0.OooO00o(viewInflate, R.id.identity);
                if (userIdentityView != null) {
                    i = R.id.inRoom;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.inRoom);
                    if (imageView != null) {
                        i = R.id.name;
                        UserNameView userNameView = (UserNameView) o00Oo0.OooO00o(viewInflate, R.id.name);
                        if (userNameView != null) {
                            i = R.id.number;
                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.number);
                            if (textView != null) {
                                i = R.id.officials;
                                UserOfficialsView userOfficialsView = (UserOfficialsView) o00Oo0.OooO00o(viewInflate, R.id.officials);
                                if (userOfficialsView != null) {
                                    i = R.id.select;
                                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.select);
                                    if (imageView2 != null) {
                                        return new zg((LinearLayout) viewInflate, roomMemberBadgeView, netImageView, userIdentityView, imageView, userNameView, textView, userOfficialsView, imageView2);
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
