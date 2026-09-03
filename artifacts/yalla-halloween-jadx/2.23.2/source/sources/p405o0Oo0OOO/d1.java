package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f43774OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43775OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RoomMemberBadgeView f43776OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f43777OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f43778OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final UserNameView f43779OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f43780OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f43781OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final UserOfficialsView f43782OooO0oo;

    public d1(@NonNull LinearLayout linearLayout, @NonNull RoomMemberBadgeView roomMemberBadgeView, @NonNull NetImageView netImageView, @NonNull UserIdentityView userIdentityView, @NonNull ImageView imageView, @NonNull UserNameView userNameView, @NonNull TextView textView, @NonNull UserOfficialsView userOfficialsView, @NonNull ImageView imageView2) {
        this.f43775OooO00o = linearLayout;
        this.f43776OooO0O0 = roomMemberBadgeView;
        this.f43777OooO0OO = netImageView;
        this.f43778OooO0Oo = userIdentityView;
        this.f43780OooO0o0 = imageView;
        this.f43779OooO0o = userNameView;
        this.f43781OooO0oO = textView;
        this.f43782OooO0oo = userOfficialsView;
        this.f43774OooO = imageView2;
    }

    @NonNull
    public static d1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43775OooO00o;
    }

    @NonNull
    public static d1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_member_convene_select_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.badge;
        RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) OooO0O0.OooO00o(i, viewInflate);
        if (roomMemberBadgeView != null) {
            i = o0OO00O.head;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = o0OO00O.identity;
                UserIdentityView userIdentityView = (UserIdentityView) OooO0O0.OooO00o(i, viewInflate);
                if (userIdentityView != null) {
                    i = o0OO00O.inRoom;
                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = o0OO00O.name;
                        UserNameView userNameView = (UserNameView) OooO0O0.OooO00o(i, viewInflate);
                        if (userNameView != null) {
                            i = o0OO00O.number;
                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView != null) {
                                i = o0OO00O.officials;
                                UserOfficialsView userOfficialsView = (UserOfficialsView) OooO0O0.OooO00o(i, viewInflate);
                                if (userOfficialsView != null) {
                                    i = o0OO00O.select;
                                    ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView2 != null) {
                                        return new d1((LinearLayout) viewInflate, roomMemberBadgeView, netImageView, userIdentityView, imageView, userNameView, textView, userOfficialsView, imageView2);
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
