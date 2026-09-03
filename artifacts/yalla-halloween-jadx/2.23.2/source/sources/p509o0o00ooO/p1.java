package p509o0o00ooO;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.billy.android.swipe.OooO;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.facebook.internal.o00Oo0;
import com.google.android.material.search.OooOO0;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.UserIdentityView;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.UserNameView;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserPrettyIdView;
import com.yalla.yalla.ui.view.UserRankView;
import com.yalla.yalla.ui.view.UserVipView;
import com.yalla.yalla.ui.view.UserWealthTagView;
import com.yalla.yalla.ui.view.room.RoomMemberBadgeView;
import com.yalla.yalla.ui.view.round.DisplayType;
import com.yalla.yalla.ui.view.round.RoundImageView;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o000O00O.o00O0;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p403o0Oo0OO.OooO0OO;
import p412o0Oo0o0O.o000O000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBaseRoomChatUserVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRoomChatUserVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/BaseRoomChatUserVH\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class p1 extends q1 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final UserRankView f50751OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f50752OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Boolean> f50753OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50754OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50755OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final RoundImageView f50756OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final SVGAView f50757OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ViewGroup f50758OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ViewGroup f50759OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final ImageView f50760OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final UserNameView f50761OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final UserIdentityView f50762OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final UserWealthTagView f50763OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final RoomMemberBadgeView f50764OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final UserPremiumView f50765OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final UserVipView f50766OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final UserPrettyIdView f50767OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f50768OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final UserMedalView f50769OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float f50770OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public ChatModel f50771OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(@NotNull View view, @NotNull FragmentActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.sdv_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50756OooO0oO = (RoundImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.layout_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.sdv_icon_hats);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50757OooO0oo = (SVGAView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.tv_rank);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50751OooO = (UserRankView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(o0OO00O.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f50758OooOO0 = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(o0OO00O.chatlineRoot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById6;
        this.f50759OooOO0O = viewGroup;
        this.f50760OooOO0o = (ImageView) view.findViewById(o0OO00O.chatlineReplyTag);
        View viewFindViewById7 = view.findViewById(o0OO00O.identity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f50762OooOOO0 = (UserIdentityView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(o0OO00O.name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f50761OooOOO = (UserNameView) viewFindViewById8;
        UserWealthTagView userWealthTagView = (UserWealthTagView) view.findViewById(o0OO00O.cl_wealth);
        userWealthTagView.setTextSize(9.0f);
        this.f50763OooOOOO = userWealthTagView;
        RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) view.findViewById(o0OO00O.roomMemberBadgeView);
        roomMemberBadgeView.setTextSize(9.0f);
        this.f50764OooOOOo = roomMemberBadgeView;
        View viewFindViewById9 = view.findViewById(o0OO00O.kaVip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f50766OooOOo0 = (UserVipView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(o0OO00O.vip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f50765OooOOo = (UserPremiumView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(o0OO00O.prettyId);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f50767OooOOoo = (UserPrettyIdView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(o0OO00O.mvMedal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f50769OooOo00 = (UserMedalView) viewFindViewById12;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(o0OOO0o.color_FFFFFFF));
        arrayList.add(Integer.valueOf(o0OOO0o.color_FFED9368));
        arrayList.add(Integer.valueOf(o0OOO0o.color_FF1CCA7F));
        arrayList.add(Integer.valueOf(o0OOO0o.color_FF21ABF9));
        arrayList.add(Integer.valueOf(o0OOO0o.color_FFFF55B5));
        arrayList.add(Integer.valueOf(o0OOO0o.color_FFFF6EFD));
        arrayList.add(Integer.valueOf(o0OOO0o.color_FFA67AFB));
        arrayList.add(Integer.valueOf(o0OOO0o.color_FFF2D922));
        this.f50768OooOo0 = arrayList;
        this.f50770OooOo0O = 200.0f;
        int i = 2;
        if (OooO00o()) {
            OooO.OooO00o oooO00o = OooO.f12886OooO00o;
            SmartSwipeWrapper smartSwipeWrapper = viewGroup.getParent() instanceof SmartSwipeWrapper ? (SmartSwipeWrapper) viewGroup.getParent() : null;
            if (smartSwipeWrapper == null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (viewGroup.getParent() != null) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                    Context context = viewGroup.getContext();
                    OooO.OooO00o oooO00o2 = OooO.f12886OooO00o;
                    SmartSwipeWrapper smartSwipeWrapper2 = (oooO00o2 == null || (smartSwipeWrapper2 = oooO00o2.OooO00o()) == null) ? new SmartSwipeWrapper(context) : smartSwipeWrapper2;
                    int iIndexOfChild = viewGroup2.indexOfChild(viewGroup);
                    viewGroup2.removeView(viewGroup);
                    viewGroup2.addView(smartSwipeWrapper2, iIndexOfChild, layoutParams);
                    smartSwipeWrapper = smartSwipeWrapper2;
                } else {
                    Context context2 = viewGroup.getContext();
                    OooO.OooO00o oooO00o3 = OooO.f12886OooO00o;
                    SmartSwipeWrapper smartSwipeWrapper3 = (oooO00o3 == null || (smartSwipeWrapper3 = oooO00o3.OooO00o()) == null) ? new SmartSwipeWrapper(context2) : smartSwipeWrapper3;
                    if (layoutParams != null) {
                        smartSwipeWrapper3.setLayoutParams(layoutParams);
                    }
                    smartSwipeWrapper = smartSwipeWrapper3;
                }
                smartSwipeWrapper.setContentView(viewGroup);
            }
            p147o00Oo00o.o0OOO0o o0ooo0o2 = (p147o00Oo00o.o0OOO0o) smartSwipeWrapper.addConsumer(new p147o00Oo00o.o0OOO0o());
            o1 o1Var = new o1(this);
            CopyOnWriteArrayList copyOnWriteArrayList = o0ooo0o2.f12905OooOOo0;
            if (!copyOnWriteArrayList.contains(o1Var)) {
                copyOnWriteArrayList.add(o1Var);
            }
            if (OooOo00.OooO0o0()) {
                o0ooo0o2.f12901OooOOO0 |= 2;
            } else {
                o0ooo0o2.f12901OooOOO0 |= 1;
            }
        }
        viewGroup.setOnClickListener(new o00Oo0(this, i));
        viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00ooO.l1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                p1 this$0 = this.f50726OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Boolean> function0 = this$0.f50753OooO0Oo;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
            }
        });
        frameLayout.setOnClickListener(new OooOO0(this, i));
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00ooO.m1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                Function1<? super ChatModel, Unit> function1;
                p1 this$0 = this.f50730OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o.OooO0O0("102287");
                ChatModel chatModel = this$0.f50771OooOo0o;
                if (chatModel == null || (function1 = this$0.f50754OooO0o) == null) {
                    return false;
                }
                function1.invoke(chatModel);
                return false;
            }
        });
    }

    public static void OooO0O0(@NotNull ChatModel model, @NotNull TextView tv) {
        Unit unit;
        String bubbleColour;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tv, "tv");
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        RoomUserInfoDTO.ChatBubbleInfo value = newFrom.getBubbleInfo().getValue();
        if (value == null || (bubbleColour = value.getBubbleColour()) == null) {
            unit = null;
        } else {
            try {
                tv.setTextColor(Color.parseColor(bubbleColour));
            } catch (Exception unused) {
                tv.setTextColor(o0000.OooO00o(o0OOO0o.color_e2e2e2));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            tv.setTextColor(o0000.OooO00o(o0OOO0o.color_e2e2e2));
        }
    }

    public abstract boolean OooO00o();

    /* JADX WARN: Code duplicated, block: B:32:0x01b6  */
    public void OooO0OO(int i, @NotNull ChatModel model) {
        boolean z;
        String bubbleUrl;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f50771OooOo0o = model;
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        String strOooO00o = OooO0OO.OooO00o(newFrom.getUserHeader().getValue());
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        this.f50762OooOOO0.OooO0OO(newFrom2.getRoomMemberType().getValue().intValue(), false, false);
        Oooo000 option = d1.OooO00o();
        Intrinsics.checkNotNullExpressionValue(option, "borderHeader(...)");
        RoundImageView roundImageView = this.f50756OooO0oO;
        roundImageView.getClass();
        Intrinsics.checkNotNullParameter(option, "option");
        if (option.f43112OooOo0o) {
            roundImageView.displayType = DisplayType.CIRCLE;
        } else {
            roundImageView.displayType = DisplayType.NORMAL;
        }
        int i2 = 1;
        int i3 = option.f43118OooOooO;
        if (i3 > 0) {
            roundImageView.f30804OooO0oo = true;
            roundImageView.f30802OooO0o0 = i3;
            roundImageView.f30803OooO0oO = option.f43119OooOooo;
        }
        int i4 = option.f43115OooOoOO;
        if (i4 == 1) {
            roundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i4 == 2) {
            roundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (i4 == 3) {
            roundImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m4215constructorimpl(Boolean.valueOf(roundImageView.post(new o00O0(i2, roundImageView, option, strOooO00o))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        RoomUserInfoModel newFrom3 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom3);
        boolean zOooO0O0 = com.code.android.util.OooOo00.OooO0O0(newFrom3.getHeaderCardUrl().getValue());
        FragmentActivity fragmentActivity = this.f50780OooO00o;
        SVGAView sVGAView = this.f50757OooO0oo;
        if (zOooO0O0) {
            sVGAView.setVisibility(0);
            RoomUserInfoModel newFrom4 = model.getNewFrom();
            Intrinsics.checkNotNull(newFrom4);
            sVGAView.OooOO0O(p184o00o00O0.OooO0OO.OooO0Oo(newFrom4.getHeaderCardUrl().getValue()), fragmentActivity);
            sVGAView.OooOO0o();
        } else {
            sVGAView.setVisibility(8);
            sVGAView.OooOOO0(false);
        }
        RoomUserInfoModel newFrom5 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom5);
        int iIntValue = newFrom5.getRankWeek().getValue().intValue();
        RoomUserInfoModel newFrom6 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom6);
        this.f50751OooO.OooO00o(iIntValue, newFrom6.getRankDay().getValue().intValue());
        RoomUserInfoModel newFrom7 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom7);
        long jLongValue = newFrom7.getUserId().getValue().longValue();
        RoomUserInfoModel newFrom8 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom8);
        MutableStateFlow<String> userName = newFrom8.getUserName();
        Intrinsics.checkNotNull(userName);
        String strOooO0O0 = o000O000.OooO0O0(jLongValue, userName.getValue());
        UserNameView userNameView = this.f50761OooOOO;
        userNameView.setText(strOooO0O0);
        UserWealthTagView userWealthTagView = this.f50763OooOOOO;
        Intrinsics.checkNotNullExpressionValue(userWealthTagView, "userWealthTagView");
        RoomUserInfoModel newFrom9 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom9);
        Integer value = newFrom9.getWealthLevel().getValue();
        RoomUserInfoModel newFrom10 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom10);
        userWealthTagView.OooO0O0(fragmentActivity, value, newFrom10.getWealthBadgeWithBg().getValue(), 10.0f);
        RoomUserInfoModel newFrom11 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom11);
        int iIntValue2 = newFrom11.getVipLevel().getValue().intValue();
        RoomUserInfoModel newFrom12 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom12);
        if (newFrom12.getVipState().getValue().intValue() == VipState.Vip.getValue()) {
            RoomUserInfoModel newFrom13 = model.getNewFrom();
            Intrinsics.checkNotNull(newFrom13);
            if (newFrom13.getShowVIP().getValue().booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f50766OooOOo0.OooOOOO(iIntValue2, z, fragmentActivity);
        RoomUserInfoModel newFrom14 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom14);
        boolean zBooleanValue = newFrom14.isPremium().getValue().booleanValue();
        RoomUserInfoModel newFrom15 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom15);
        this.f50765OooOOo.OooO0Oo(newFrom15.getPremiumLevel().getValue().intValue(), zBooleanValue);
        RoomUserInfoModel newFrom16 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom16);
        this.f50767OooOOoo.setUserPrettyId(newFrom16.getIdLevel().getValue().intValue());
        RoomUserInfoModel newFrom17 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom17);
        this.f50769OooOo00.OooO00o(newFrom17.getMedal().getValue(), fragmentActivity);
        RoomUserInfoModel newFrom18 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom18);
        Integer value2 = newFrom18.getMemberLevel().getValue();
        RoomUserInfoModel newFrom19 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom19);
        String value3 = newFrom19.getBadgeUrl().getValue();
        RoomUserInfoModel newFrom20 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom20);
        this.f50764OooOOOo.OooO00o(value2, value3, newFrom20.isTopRank().getValue().booleanValue(), 9.0f);
        RoomUserInfoModel newFrom21 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom21);
        MutableStateFlow<Boolean> mutableStateFlowIsPremium = newFrom21.isPremium();
        RoomUserInfoModel newFrom22 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom22);
        MutableStateFlow<Integer> premiumLevel = newFrom22.getPremiumLevel();
        userNameView.setTextColor(o0000.OooO00o(((Number) this.f50768OooOo0.get((!mutableStateFlowIsPremium.getValue().booleanValue() || premiumLevel.getValue().intValue() <= 0) ? 0 : premiumLevel.getValue().intValue() / 100)).intValue()));
        if (OooO0Oo()) {
            RoomUserInfoModel newFrom23 = model.getNewFrom();
            Intrinsics.checkNotNull(newFrom23);
            RoomUserInfoDTO.ChatBubbleInfo value4 = newFrom23.getBubbleInfo().getValue();
            String bubbleUrl2 = value4 != null ? value4.getBubbleUrl() : null;
            if (!(bubbleUrl2 == null || StringsKt.isBlank(bubbleUrl2))) {
                RoomUserInfoModel newFrom24 = model.getNewFrom();
                Intrinsics.checkNotNull(newFrom24);
                RoomUserInfoDTO.ChatBubbleInfo value5 = newFrom24.getBubbleInfo().getValue();
                if (value5 == null || (bubbleUrl = value5.getBubbleUrl()) == null) {
                    return;
                }
                OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), new n1(bubbleUrl, this, null));
                return;
            }
        }
        this.f50758OooOO0.setBackgroundResource(o0Oo0oo.ic_room_bubble_default);
    }

    public abstract boolean OooO0Oo();
}
