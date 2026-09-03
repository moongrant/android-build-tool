package com.yalla.yalla.ui.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.ui.view.room.RoomMemberBadgeView;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.dc;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u001a\u0010\u001f\u001a\u00020\u00042\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\bJ\u000e\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000eJ\u000e\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\bJ\u000e\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000eJ\u000e\u0010(\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\bJ\u000e\u0010(\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000eJ\u0010\u0010)\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000eH\u0002R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/view/UserTagView;", "Landroid/widget/LinearLayout;", "", "identityType", "", "setIdentityTopic", "setIdentityRoomOnLine", "setIdentityRoomChat", "", "name", "setName", "Landroid/text/SpannableString;", "size", "setNameSize", "", "isFlash", "setNameFlash", "colorId", "setNameTextColor", "", "setNameTextSize", "Landroid/widget/TextView;", "getNameText", "sexType", "setSex", "setSexSize", "level", "setLevel", "setPremiumSize", "Lkotlin/Pair;", "vip", "setPremium", "setKaVipSize", "prettyId", "setPrettyIdRoom", "setPrettyIdUser", "friend", "setFriend", "isShow", "setAuthor", "setAuthorComment", "setLineVertical", "Lo0ooOOOO/dc;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOOO/dc;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@Deprecated(message = "分开写")
@SourceDebugExtension({"SMAP\nUserTagView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTagView.kt\ncom/yalla/yalla/ui/view/UserTagView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,393:1\n329#2,4:394\n329#2,4:398\n329#2,4:402\n*S KotlinDebug\n*F\n+ 1 UserTagView.kt\ncom/yalla/yalla/ui/view/UserTagView\n*L\n250#1:394,4\n256#1:398,4\n261#1:402,4\n*E\n"})
public final class UserTagView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    public static final class OooO00o extends Lambda implements Function0<dc> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30809OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserTagView f30810OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, UserTagView userTagView) {
            super(0);
            this.f30809OooO0Oo = context;
            this.f30810OooO0o0 = userTagView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final dc invoke() {
            View viewOooO00o;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f30809OooO0Oo);
            UserTagView userTagView = this.f30810OooO0o0;
            if (userTagView == null) {
                throw new NullPointerException("parent");
            }
            layoutInflaterFrom.inflate(oO00OO0O.view_user_tag, userTagView);
            int i = oO00O0oO.author;
            TextView textView = (TextView) OooOO0.OooO00o(i, userTagView);
            if (textView != null) {
                i = oO00O0oO.authorComment;
                TextView textView2 = (TextView) OooOO0.OooO00o(i, userTagView);
                if (textView2 != null) {
                    i = oO00O0oO.cl_wealth;
                    UserWealthTagView userWealthTagView = (UserWealthTagView) OooOO0.OooO00o(i, userTagView);
                    if (userWealthTagView != null) {
                        i = oO00O0oO.friend;
                        TextView textView3 = (TextView) OooOO0.OooO00o(i, userTagView);
                        if (textView3 != null) {
                            i = oO00O0oO.identity;
                            UserIdentityView userIdentityView = (UserIdentityView) OooOO0.OooO00o(i, userTagView);
                            if (userIdentityView != null) {
                                i = oO00O0oO.kaVip;
                                UserVipView userVipView = (UserVipView) OooOO0.OooO00o(i, userTagView);
                                if (userVipView != null) {
                                    i = oO00O0oO.layout;
                                    LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, userTagView);
                                    if (linearLayout != null) {
                                        i = oO00O0oO.level;
                                        UserLevelView userLevelView = (UserLevelView) OooOO0.OooO00o(i, userTagView);
                                        if (userLevelView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.lineVertical), userTagView)) != null) {
                                            i = oO00O0oO.mvMedal;
                                            UserMedalView userMedalView = (UserMedalView) OooOO0.OooO00o(i, userTagView);
                                            if (userMedalView != null) {
                                                i = oO00O0oO.name;
                                                UserNameView userNameView = (UserNameView) OooOO0.OooO00o(i, userTagView);
                                                if (userNameView != null) {
                                                    i = oO00O0oO.onMic;
                                                    UserOnMicView userOnMicView = (UserOnMicView) OooOO0.OooO00o(i, userTagView);
                                                    if (userOnMicView != null) {
                                                        i = oO00O0oO.prettyId;
                                                        UserPrettyIdView userPrettyIdView = (UserPrettyIdView) OooOO0.OooO00o(i, userTagView);
                                                        if (userPrettyIdView != null) {
                                                            i = oO00O0oO.rank;
                                                            UserRankView userRankView = (UserRankView) OooOO0.OooO00o(i, userTagView);
                                                            if (userRankView != null) {
                                                                i = oO00O0oO.roomMemberBadgeView;
                                                                RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) OooOO0.OooO00o(i, userTagView);
                                                                if (roomMemberBadgeView != null) {
                                                                    i = oO00O0oO.sex;
                                                                    UserSexView userSexView = (UserSexView) OooOO0.OooO00o(i, userTagView);
                                                                    if (userSexView != null) {
                                                                        i = oO00O0oO.vip;
                                                                        UserPremiumView userPremiumView = (UserPremiumView) OooOO0.OooO00o(i, userTagView);
                                                                        if (userPremiumView != null) {
                                                                            dc dcVar = new dc(userTagView, textView, textView2, userWealthTagView, textView3, userIdentityView, userVipView, linearLayout, userLevelView, viewOooO00o, userMedalView, userNameView, userOnMicView, userPrettyIdView, userRankView, roomMemberBadgeView, userSexView, userPremiumView);
                                                                            Intrinsics.checkNotNullExpressionValue(dcVar, "inflate(LayoutInflater.from(context), this)");
                                                                            return dcVar;
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
            throw new NullPointerException("Missing required view with ID: ".concat(userTagView.getResources().getResourceName(i)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserTagView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void OooOO0o(UserTagView userTagView, LifecycleOwner lifecycleOwner, Integer num, String str, int i) {
        if ((i & 2) != 0) {
            num = 0;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        userTagView.OooOO0O(lifecycleOwner, num, str, (i & 8) != 0 ? 10.0f : 0.0f);
    }

    private final dc getBinding() {
        return (dc) this.binding.getValue();
    }

    private final void setLineVertical(boolean isShow) {
        View view = getBinding().f57777OooOO0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.lineVertical");
        o000OO00.OooO0O0(view);
        if (isShow) {
            LinearLayout linearLayout = getBinding().f57776OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layout");
            o000OO00.OooOOOO(linearLayout);
            o000OO00.OooOOOO(view);
        }
    }

    public final void OooO(int i, int i2) {
        getBinding().f57782OooOOOO.OooO00o(i, i2);
    }

    public final void OooO00o() {
        setIdentityTopic(0);
        setLineVertical(false);
        setName("");
        setSex(2);
        setLevel(-1);
        OooO0o(false, false);
        OooO(0, 0);
        OooO0oo(0, false);
        UserVipView userVipView = getBinding().f57775OooO0oO;
        userVipView.getClass();
        userVipView.OooOOO(VipLevel.Vip0.getValue(), true, null);
        setPrettyIdUser(0);
        setFriend(false);
        setAuthor(false);
        setAuthorComment(false);
        OooO0o0("", null);
    }

    public final void OooO0O0(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getBinding().f57775OooO0oO.getLayoutParams();
        float f = i;
        layoutParams.height = o0000O0.OooO00o(f);
        layoutParams.width = o0000O0.OooO00o(f);
        UserVipView userVipView = getBinding().f57775OooO0oO;
        Intrinsics.checkNotNullExpressionValue(userVipView, "binding.kaVip");
        ViewGroup.LayoutParams layoutParams2 = userVipView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        float f2 = i2;
        marginLayoutParams.setMarginEnd(o0000O0.OooO00o(f2));
        userVipView.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams3 = getBinding().f57784OooOOo.getLayoutParams();
        layoutParams3.height = o0000O0.OooO00o(f);
        layoutParams3.width = o0000O0.OooO00o(f);
        UserPremiumView userPremiumView = getBinding().f57784OooOOo;
        Intrinsics.checkNotNullExpressionValue(userPremiumView, "binding.vip");
        ViewGroup.LayoutParams layoutParams4 = userPremiumView.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams2.setMarginEnd(o0000O0.OooO00o(f2));
        userPremiumView.setLayoutParams(marginLayoutParams2);
        ViewGroup.LayoutParams layoutParams5 = getBinding().f57772OooO0Oo.getLayoutParams();
        layoutParams5.height = o0000O0.OooO00o(f);
        layoutParams5.width = o0000O0.OooO00o((i * 37) / 18);
        UserWealthTagView userWealthTagView = getBinding().f57772OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(userWealthTagView, "binding.clWealth");
        ViewGroup.LayoutParams layoutParams6 = userWealthTagView.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams3.setMarginEnd(o0000O0.OooO00o(f2));
        userWealthTagView.setLayoutParams(marginLayoutParams3);
    }

    public final void OooO0OO(TextView textView, String str) {
        o000OO00.OooO0O0(textView);
        textView.setText("");
        if (!StringsKt.isBlank(str)) {
            LinearLayout linearLayout = getBinding().f57776OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layout");
            o000OO00.OooOOOO(linearLayout);
            o000OO00.OooOOOO(textView);
            textView.setText(str);
        }
    }

    public final void OooO0Oo(int i, boolean z, @Nullable LifecycleOwner lifecycleOwner) {
        getBinding().f57775OooO0oO.OooOOOO(i, z, lifecycleOwner);
    }

    public final void OooO0o(boolean z, boolean z2) {
        UserOnMicView userOnMicView = getBinding().f57781OooOOO0;
        userOnMicView.getClass();
        if (z) {
            o000OO00.OooOOOO(userOnMicView);
            userOnMicView.setImageResource(oOo00OO0.ic_room_online_speaking);
        } else if (!z2) {
            o000OO00.OooO0O0(userOnMicView);
        } else {
            o000OO00.OooOOOO(userOnMicView);
            userOnMicView.setImageResource(oOo00OO0.ic_room_banned);
        }
    }

    public final void OooO0o0(@Nullable String str, @Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            getBinding().f57778OooOO0O.OooO00o(str, lifecycleOwner);
            return;
        }
        UserMedalView userMedalView = getBinding().f57778OooOO0O;
        Intrinsics.checkNotNullExpressionValue(userMedalView, "binding.mvMedal");
        o000OO00.OooO0O0(userMedalView);
    }

    public final void OooO0oO(int i, int i2) {
        getBinding().f57784OooOOo.OooO0OO(i, i2);
    }

    public final void OooO0oo(int i, boolean z) {
        getBinding().f57784OooOOo.OooO0Oo(i, z);
    }

    public final void OooOO0(@Nullable Integer num, @Nullable String str, boolean z, float f) {
        getBinding().f57783OooOOOo.OooO00o(num, str, z, f);
    }

    public final void OooOO0O(@Nullable LifecycleOwner lifecycleOwner, @Nullable Integer num, @Nullable String str, float f) {
        if (num == null || num.intValue() <= 0) {
            UserWealthTagView userWealthTagView = getBinding().f57772OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(userWealthTagView, "binding.clWealth");
            o000OO00.OooO0O0(userWealthTagView);
        } else {
            UserWealthTagView userWealthTagView2 = getBinding().f57772OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(userWealthTagView2, "binding.clWealth");
            o000OO00.OooOOOO(userWealthTagView2);
            getBinding().f57772OooO0Oo.OooO0O0(lifecycleOwner, num, str, f);
        }
    }

    public final void OooOOO0() {
        ViewGroup.LayoutParams layoutParams = getBinding().f57772OooO0Oo.getLayoutParams();
        layoutParams.width = o0000O0.OooO00o(30);
        layoutParams.height = o0000O0.OooO00o(16);
    }

    @NotNull
    public final TextView getNameText() {
        UserNameView userNameView = getBinding().f57779OooOO0o;
        Intrinsics.checkNotNullExpressionValue(userNameView, "binding.name");
        return userNameView;
    }

    public final void setAuthor(@NotNull String friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        TextView textView = getBinding().f57770OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.author");
        OooO0OO(textView, friend);
    }

    public final void setAuthorComment(@NotNull String friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        TextView textView = getBinding().f57771OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.authorComment");
        OooO0OO(textView, friend);
    }

    public final void setFriend(@NotNull String friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        TextView textView = getBinding().f57774OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.friend");
        OooO0OO(textView, friend);
    }

    public final void setIdentityRoomChat(int identityType) {
        getBinding().f57773OooO0o.OooO0OO(identityType, false, false);
    }

    public final void setIdentityRoomOnLine(int identityType) {
        setLineVertical(getBinding().f57773OooO0o.OooO0OO(identityType, true, false));
    }

    public final void setIdentityTopic(int identityType) {
        getBinding().f57773OooO0o.OooO0Oo(identityType);
    }

    public final void setKaVipSize(int size) {
        ViewGroup.LayoutParams layoutParams = getBinding().f57775OooO0oO.getLayoutParams();
        float f = size;
        layoutParams.height = o0000O0.OooO00o(f);
        layoutParams.width = o0000O0.OooO00o(f);
    }

    public final void setLevel(int level) {
        getBinding().f57768OooO.OooOO0o(level);
    }

    public final void setName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        UserNameView userNameView = getBinding().f57779OooOO0o;
        Intrinsics.checkNotNullExpressionValue(userNameView, "binding.name");
        OooO0OO(userNameView, name);
    }

    public final void setNameFlash(boolean isFlash) {
        getBinding().f57779OooOO0o.setFlash(isFlash);
    }

    public final void setNameSize(int size) {
        getBinding().f57779OooOO0o.setTextSize((int) (TypedValue.applyDimension(2, size, o000O0.OooO00o().getResources().getDisplayMetrics()) + 0.5f));
    }

    public final void setNameTextColor(@ColorRes int colorId) {
        getBinding().f57779OooOO0o.setTextColor(o0000.OooO00o(colorId));
    }

    public final void setNameTextSize(float size) {
        getBinding().f57779OooOO0o.setTextSize(size);
    }

    public final void setPremium(@NotNull Pair<Boolean, Integer> vip) {
        Intrinsics.checkNotNullParameter(vip, "vip");
        boolean zBooleanValue = vip.getFirst().booleanValue();
        PremiumLevel vipLevel = PremiumLevel.INSTANCE.of(vip.getSecond());
        Intrinsics.checkNotNullParameter(vipLevel, "vipLevel");
        getBinding().f57784OooOOo.OooO0o0(zBooleanValue, vipLevel);
    }

    public final void setPremiumSize(int size) {
        ViewGroup.LayoutParams layoutParams = getBinding().f57784OooOOo.getLayoutParams();
        float f = size;
        layoutParams.height = o0000O0.OooO00o(f);
        layoutParams.width = o0000O0.OooO00o(f);
    }

    public final void setPrettyIdRoom(int prettyId) {
        getBinding().f57780OooOOO.setRoomPrettyId(prettyId);
    }

    public final void setPrettyIdUser(int prettyId) {
        getBinding().f57780OooOOO.setUserPrettyId(prettyId);
    }

    public final void setSex(int sexType) {
        getBinding().f57785OooOOo0.OooO0OO(sexType);
    }

    public final void setSexSize(int size) {
        ViewGroup.LayoutParams layoutParams = getBinding().f57785OooOOo0.getLayoutParams();
        float f = size;
        layoutParams.height = o0000O0.OooO00o(f);
        layoutParams.width = o0000O0.OooO00o(f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserTagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAuthor(boolean isShow) {
        TextView textView = getBinding().f57770OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.author");
        o000OO00.OooO0O0(textView);
        if (isShow) {
            LinearLayout linearLayout = getBinding().f57776OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layout");
            o000OO00.OooOOOO(linearLayout);
            o000OO00.OooOOOO(textView);
        }
    }

    public final void setAuthorComment(boolean isShow) {
        TextView textView = getBinding().f57771OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.authorComment");
        o000OO00.OooO0O0(textView);
        if (isShow) {
            LinearLayout linearLayout = getBinding().f57776OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layout");
            o000OO00.OooOOOO(linearLayout);
            o000OO00.OooOOOO(textView);
        }
    }

    public final void setFriend(boolean isShow) {
        TextView textView = getBinding().f57774OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.friend");
        o000OO00.OooO0O0(textView);
        if (isShow) {
            LinearLayout linearLayout = getBinding().f57776OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layout");
            o000OO00.OooOOOO(linearLayout);
            o000OO00.OooOOOO(textView);
        }
    }

    public final void setName(@NotNull SpannableString name) {
        Intrinsics.checkNotNullParameter(name, "name");
        UserNameView userNameView = getBinding().f57779OooOO0o;
        Intrinsics.checkNotNullExpressionValue(userNameView, "binding.name");
        o000OO00.OooO0O0(userNameView);
        userNameView.setText("");
        if (!StringsKt.isBlank(name)) {
            LinearLayout linearLayout = getBinding().f57776OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layout");
            o000OO00.OooOOOO(linearLayout);
            o000OO00.OooOOOO(userNameView);
            userNameView.setText(name);
        }
    }

    public /* synthetic */ UserTagView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserTagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o(context, this));
    }
}
