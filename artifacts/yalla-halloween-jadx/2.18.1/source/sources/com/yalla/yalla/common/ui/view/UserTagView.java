package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.RoomMemberBadgeView;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104o000oo0O.o00Oo0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p649o0ooOOoo.ij;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006J\u001a\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u001cJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/yalla/yalla/common/ui/view/UserTagView;", "Landroid/widget/LinearLayout;", "", "isShow", "", "setLineVertical", "", "identityType", "setIdentityTopic", "setIdentityRoomOnLine", "setIdentityRoomChat", "", "name", "setName", "Landroid/text/SpannableString;", "isFlash", "setNameFlash", "colorId", "setNameTextColor", "", "size", "setNameTextSize", "Landroid/widget/TextView;", "getNameText", "sexType", "setSex", "level", "setLevel", "Lkotlin/Pair;", "vip", "setPremium", "kaVip", "setKaVip", "prettyId", "setPrettyIdRoom", "setPrettyIdUser", "friend", "setFriend", "setAuthor", "Lo0ooOOoo/ij;", "Oooo0o", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOoo/ij;", "binding", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserTagView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    public static final class OooO00o extends Lambda implements Function0<ij> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f21058Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ UserTagView f21059Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, UserTagView userTagView) {
            super(0);
            this.f21058Oooo0o = context;
            this.f21059Oooo0oO = userTagView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ij invoke() {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f21058Oooo0o);
            UserTagView userTagView = this.f21059Oooo0oO;
            Objects.requireNonNull(userTagView, "parent");
            layoutInflaterFrom.inflate(R.layout.view_user_tag, userTagView);
            int i = R.id.author;
            TextView textView = (TextView) o00Oo0.OooO00o(userTagView, R.id.author);
            if (textView != null) {
                i = R.id.friend;
                TextView textView2 = (TextView) o00Oo0.OooO00o(userTagView, R.id.friend);
                if (textView2 != null) {
                    i = R.id.identity;
                    UserIdentityView userIdentityView = (UserIdentityView) o00Oo0.OooO00o(userTagView, R.id.identity);
                    if (userIdentityView != null) {
                        i = R.id.kaVip;
                        UserVipView userVipView = (UserVipView) o00Oo0.OooO00o(userTagView, R.id.kaVip);
                        if (userVipView != null) {
                            i = R.id.layout;
                            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(userTagView, R.id.layout);
                            if (linearLayout != null) {
                                i = R.id.level;
                                UserLevelView userLevelView = (UserLevelView) o00Oo0.OooO00o(userTagView, R.id.level);
                                if (userLevelView != null) {
                                    i = R.id.lineVertical;
                                    View viewOooO00o = o00Oo0.OooO00o(userTagView, R.id.lineVertical);
                                    if (viewOooO00o != null) {
                                        i = R.id.mvMedal;
                                        UserMedalView userMedalView = (UserMedalView) o00Oo0.OooO00o(userTagView, R.id.mvMedal);
                                        if (userMedalView != null) {
                                            i = R.id.name;
                                            UserNameView userNameView = (UserNameView) o00Oo0.OooO00o(userTagView, R.id.name);
                                            if (userNameView != null) {
                                                i = R.id.onMic;
                                                UserOnMicView userOnMicView = (UserOnMicView) o00Oo0.OooO00o(userTagView, R.id.onMic);
                                                if (userOnMicView != null) {
                                                    i = R.id.prettyId;
                                                    UserPrettyIdView userPrettyIdView = (UserPrettyIdView) o00Oo0.OooO00o(userTagView, R.id.prettyId);
                                                    if (userPrettyIdView != null) {
                                                        i = R.id.rank;
                                                        UserRankView userRankView = (UserRankView) o00Oo0.OooO00o(userTagView, R.id.rank);
                                                        if (userRankView != null) {
                                                            i = R.id.roomMemberBadgeView;
                                                            RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) o00Oo0.OooO00o(userTagView, R.id.roomMemberBadgeView);
                                                            if (roomMemberBadgeView != null) {
                                                                i = R.id.sex;
                                                                UserSexView userSexView = (UserSexView) o00Oo0.OooO00o(userTagView, R.id.sex);
                                                                if (userSexView != null) {
                                                                    i = R.id.vip;
                                                                    UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(userTagView, R.id.vip);
                                                                    if (userPremiumView != null) {
                                                                        ij ijVar = new ij(userTagView, textView, textView2, userIdentityView, userVipView, linearLayout, userLevelView, viewOooO00o, userMedalView, userNameView, userOnMicView, userPrettyIdView, userRankView, roomMemberBadgeView, userSexView, userPremiumView);
                                                                        Intrinsics.checkNotNullExpressionValue(ijVar, "inflate(LayoutInflater.from(context), this)");
                                                                        return ijVar;
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
            throw new NullPointerException("Missing required view with ID: ".concat(userTagView.getResources().getResourceName(i)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserTagView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ij getBinding() {
        return (ij) this.binding.getValue();
    }

    private final void setLineVertical(boolean isShow) {
        View view = getBinding().f49699OooO0oo;
        Intrinsics.checkNotNullExpressionValue(view, "binding.lineVertical");
        OooOO0(view, isShow);
    }

    public final void OooO(@Nullable Integer num, @Nullable String str, boolean z, float f) {
        getBinding().f49703OooOOO.OooO00o(num, str, z, f);
    }

    public final void OooO00o() {
        setIdentityTopic(0);
        setLineVertical(false);
        setName("");
        setSex(2);
        setLevel(-1);
        OooO0o0(false, false);
        OooO0oo(0, 0);
        OooO0oO(false, 0);
        setKaVip(VipLevel.Vip0.getValue());
        setPrettyIdUser(0);
        setFriend(false);
        setAuthor(false);
        OooO0Oo("", null);
    }

    public final boolean OooO0O0(TextView textView, String str) {
        oOO00O.OooO00o(textView);
        textView.setText("");
        if (!(!StringsKt.isBlank(str))) {
            return false;
        }
        OooOO0O();
        oOO00O.OooO(textView);
        textView.setText(str);
        return true;
    }

    public final void OooO0OO(int i, boolean z) {
        getBinding().f49697OooO0o0.OooO0OO(i, z);
    }

    public final void OooO0Oo(@Nullable String str, @Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            getBinding().f49691OooO.OooO0O0(str, lifecycleOwner);
            return;
        }
        UserMedalView userMedalView = getBinding().f49691OooO;
        Intrinsics.checkNotNullExpressionValue(userMedalView, "binding.mvMedal");
        oOO00O.OooO00o(userMedalView);
    }

    public final void OooO0o(int i, int i2) {
        getBinding().f49706OooOOOo.OooO0OO(i, i2);
    }

    public final void OooO0o0(boolean z, boolean z2) {
        UserOnMicView userOnMicView = getBinding().f49701OooOO0O;
        if (z) {
            oOO00O.OooO(userOnMicView);
            userOnMicView.setImageResource(R.drawable.ic_room_online_speaking);
        } else if (!z2) {
            oOO00O.OooO00o(userOnMicView);
        } else {
            oOO00O.OooO(userOnMicView);
            userOnMicView.setImageResource(R.drawable.ic_room_banned);
        }
    }

    public final void OooO0oO(boolean z, int i) {
        getBinding().f49706OooOOOo.OooO0Oo(z, i);
    }

    public final void OooO0oo(int i, int i2) {
        getBinding().f49704OooOOO0.OooO00o(i, i2);
    }

    public final void OooOO0(View view, boolean z) {
        oOO00O.OooO00o(view);
        if (z) {
            OooOO0O();
            oOO00O.OooO(view);
        }
    }

    public final void OooOO0O() {
        LinearLayout linearLayout = getBinding().f49696OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layout");
        oOO00O.OooO(linearLayout);
    }

    @NotNull
    public final TextView getNameText() {
        UserNameView userNameView = getBinding().f49700OooOO0;
        Intrinsics.checkNotNullExpressionValue(userNameView, "binding.name");
        return userNameView;
    }

    public final void setAuthor(@NotNull String friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        TextView textView = getBinding().f49693OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.author");
        OooO0O0(textView, friend);
    }

    public final void setFriend(@NotNull String friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        TextView textView = getBinding().f49694OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.friend");
        OooO0O0(textView, friend);
    }

    public final void setIdentityRoomChat(int identityType) {
        getBinding().f49695OooO0Oo.OooO0OO(identityType, false, false);
    }

    public final void setIdentityRoomOnLine(int identityType) {
        setLineVertical(getBinding().f49695OooO0Oo.OooO0OO(identityType, true, false));
    }

    public final void setIdentityTopic(int identityType) {
        UserIdentityView userIdentityView = getBinding().f49695OooO0Oo;
        if (identityType == 1) {
            oOO00O.OooO(userIdentityView);
            userIdentityView.setImageResource(R.drawable.ic_topic_owner);
        } else if (identityType == 2) {
            oOO00O.OooO(userIdentityView);
            userIdentityView.setImageResource(R.drawable.ic_topic_manager);
        } else if (identityType != 3) {
            oOO00O.OooO00o(userIdentityView);
        } else {
            oOO00O.OooO00o(userIdentityView);
        }
    }

    public final void setKaVip(int kaVip) {
        getBinding().f49697OooO0o0.OooO0OO(kaVip, true);
    }

    public final void setLevel(int level) {
        UserLevelView userLevelView = getBinding().f49698OooO0oO;
        if (level < 0) {
            oOO00O.OooO00o(userLevelView);
            return;
        }
        oOO00O.OooO(userLevelView);
        userLevelView.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("LV.%s ", Arrays.copyOf(new Object[]{Integer.valueOf(level)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        userLevelView.setText(str);
    }

    public final void setName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        UserNameView userNameView = getBinding().f49700OooOO0;
        Intrinsics.checkNotNullExpressionValue(userNameView, "binding.name");
        OooO0O0(userNameView, name);
    }

    public final void setNameFlash(boolean isFlash) {
        getBinding().f49700OooOO0.setFlash(isFlash);
    }

    public final void setNameTextColor(@ColorRes int colorId) {
        getBinding().f49700OooOO0.setTextColor(o000O0O0.OooO00o(colorId));
    }

    public final void setNameTextSize(float size) {
        getBinding().f49700OooOO0.setTextSize(size);
    }

    public final void setPremium(@NotNull Pair<Boolean, Integer> vip) {
        Intrinsics.checkNotNullParameter(vip, "vip");
        boolean zBooleanValue = vip.getFirst().booleanValue();
        PremiumLevel vipLevel = PremiumLevel.INSTANCE.OooO00o(vip.getSecond());
        Intrinsics.checkNotNullParameter(vipLevel, "vipLevel");
        getBinding().f49706OooOOOo.OooO0o0(zBooleanValue, vipLevel);
    }

    public final void setPrettyIdRoom(int prettyId) {
        getBinding().f49702OooOO0o.setRoomPrettyId(prettyId);
    }

    public final void setPrettyIdUser(int prettyId) {
        getBinding().f49702OooOO0o.setUserPrettyId(prettyId);
    }

    public final void setSex(int sexType) {
        UserSexView userSexView = getBinding().f49705OooOOOO;
        Objects.requireNonNull(userSexView);
        if (sexType == 0) {
            oOO00O.OooO(userSexView);
            userSexView.setImageResource(R.drawable.icon_female);
        } else if (sexType == 1) {
            oOO00O.OooO(userSexView);
            userSexView.setImageResource(R.drawable.icon_male);
        } else {
            if (sexType != 2) {
                return;
            }
            oOO00O.OooO00o(userSexView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserTagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAuthor(boolean isShow) {
        TextView textView = getBinding().f49693OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.author");
        OooOO0(textView, isShow);
    }

    public final void setFriend(boolean isShow) {
        TextView textView = getBinding().f49694OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.friend");
        OooOO0(textView, isShow);
    }

    public final void setName(@NotNull SpannableString name) {
        Intrinsics.checkNotNullParameter(name, "name");
        UserNameView userNameView = getBinding().f49700OooOO0;
        Intrinsics.checkNotNullExpressionValue(userNameView, "binding.name");
        oOO00O.OooO00o(userNameView);
        userNameView.setText("");
        if (!StringsKt.isBlank(name)) {
            OooOO0O();
            oOO00O.OooO(userNameView);
            userNameView.setText(name);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserTagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o(context, this));
    }
}
