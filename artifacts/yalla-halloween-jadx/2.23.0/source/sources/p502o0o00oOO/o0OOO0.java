package p502o0o00oOO;

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
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOooO.OooO0o;
import p222o00oOOo.o0OoOo0;
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p486o0o00O00.oo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBaseRoomChatUserVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRoomChatUserVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/BaseRoomChatUserVH\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class o0OOO0 extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final UserRankView f49449OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f49450OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Boolean> f49451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49452OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49453OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final RoundImageView f49454OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final SVGAView f49455OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ViewGroup f49456OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ViewGroup f49457OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final ImageView f49458OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final UserNameView f49459OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final UserIdentityView f49460OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final UserWealthTagView f49461OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final RoomMemberBadgeView f49462OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final UserPremiumView f49463OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final UserVipView f49464OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final UserPrettyIdView f49465OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f49466OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final UserMedalView f49467OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float f49468OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public ChatModel f49469OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0(@NotNull View view, @NotNull FragmentActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.sdv_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.sdv_head)");
        this.f49454OooO0oO = (RoundImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.layout_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.layout_head)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.sdv_icon_hats);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.sdv_icon_hats)");
        this.f49455OooO0oo = (SVGAView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.tv_rank);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.tv_rank)");
        this.f49449OooO = (UserRankView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(oO00O0oO.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.chatlineContent)");
        this.f49456OooOO0 = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(oO00O0oO.chatlineRoot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.chatlineRoot)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById6;
        this.f49457OooOO0O = viewGroup;
        this.f49458OooOO0o = (ImageView) view.findViewById(oO00O0oO.chatlineReplyTag);
        View viewFindViewById7 = view.findViewById(oO00O0oO.identity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.identity)");
        this.f49460OooOOO0 = (UserIdentityView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(oO00O0oO.name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.name)");
        this.f49459OooOOO = (UserNameView) viewFindViewById8;
        UserWealthTagView userWealthTagView = (UserWealthTagView) view.findViewById(oO00O0oO.cl_wealth);
        userWealthTagView.setTextSize(9.0f);
        this.f49461OooOOOO = userWealthTagView;
        RoomMemberBadgeView roomMemberBadgeView = (RoomMemberBadgeView) view.findViewById(oO00O0oO.roomMemberBadgeView);
        roomMemberBadgeView.setTextSize(9.0f);
        this.f49462OooOOOo = roomMemberBadgeView;
        View viewFindViewById9 = view.findViewById(oO00O0oO.kaVip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(R.id.kaVip)");
        this.f49464OooOOo0 = (UserVipView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(oO00O0oO.vip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "view.findViewById(R.id.vip)");
        this.f49463OooOOo = (UserPremiumView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(oO00O0oO.prettyId);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "view.findViewById(R.id.prettyId)");
        this.f49465OooOOoo = (UserPrettyIdView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(oO00O0oO.mvMedal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "view.findViewById(R.id.mvMedal)");
        this.f49467OooOo00 = (UserMedalView) viewFindViewById12;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(oO00O0o.color_FFFFFFF));
        arrayList.add(Integer.valueOf(oO00O0o.color_FFED9368));
        arrayList.add(Integer.valueOf(oO00O0o.color_FF1CCA7F));
        arrayList.add(Integer.valueOf(oO00O0o.color_FF21ABF9));
        arrayList.add(Integer.valueOf(oO00O0o.color_FFFF55B5));
        arrayList.add(Integer.valueOf(oO00O0o.color_FFFF6EFD));
        arrayList.add(Integer.valueOf(oO00O0o.color_FFA67AFB));
        arrayList.add(Integer.valueOf(oO00O0o.color_FFF2D922));
        this.f49466OooOo0 = arrayList;
        this.f49468OooOo0O = 200.0f;
        int i = 1;
        if (OooO00o()) {
            OooO.OooO00o oooO00o = OooO.f9795OooO00o;
            SmartSwipeWrapper smartSwipeWrapper = viewGroup.getParent() instanceof SmartSwipeWrapper ? (SmartSwipeWrapper) viewGroup.getParent() : null;
            if (smartSwipeWrapper == null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (viewGroup.getParent() != null) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                    Context context = viewGroup.getContext();
                    OooO.OooO00o oooO00o2 = OooO.f9795OooO00o;
                    SmartSwipeWrapper smartSwipeWrapper2 = (oooO00o2 == null || (smartSwipeWrapper2 = oooO00o2.OooO00o()) == null) ? new SmartSwipeWrapper(context) : smartSwipeWrapper2;
                    int iIndexOfChild = viewGroup2.indexOfChild(viewGroup);
                    viewGroup2.removeView(viewGroup);
                    viewGroup2.addView(smartSwipeWrapper2, iIndexOfChild, layoutParams);
                    smartSwipeWrapper = smartSwipeWrapper2;
                } else {
                    Context context2 = viewGroup.getContext();
                    OooO.OooO00o oooO00o3 = OooO.f9795OooO00o;
                    SmartSwipeWrapper smartSwipeWrapper3 = (oooO00o3 == null || (smartSwipeWrapper3 = oooO00o3.OooO00o()) == null) ? new SmartSwipeWrapper(context2) : smartSwipeWrapper3;
                    if (layoutParams != null) {
                        smartSwipeWrapper3.setLayoutParams(layoutParams);
                    }
                    smartSwipeWrapper = smartSwipeWrapper3;
                }
                smartSwipeWrapper.setContentView(viewGroup);
            }
            o0OoOo0 o0oooo0 = (o0OoOo0) smartSwipeWrapper.addConsumer(new o0OoOo0());
            o0OOO00 o0ooo00 = new o0OOO00(this);
            CopyOnWriteArrayList copyOnWriteArrayList = o0oooo0.f9814OooOOo0;
            if (!copyOnWriteArrayList.contains(o0ooo00)) {
                copyOnWriteArrayList.add(o0ooo00);
            }
            if (p591o0oo000O.OooO.OooO0o0()) {
                o0oooo0.f9810OooOOO0 |= 2;
            } else {
                o0oooo0.f9810OooOOO0 |= 1;
            }
        }
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOO.o0OO0o00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o0OOO0 this$0 = this.f49447OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.f49450OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00oOO.o0OO0o
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                o0OOO0 this$0 = this.f49446OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Boolean> function0 = this$0.f49451OooO0Oo;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
            }
        });
        frameLayout.setOnClickListener(new oo0O(this, i));
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00oOO.o0OO0oO0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                Function1<? super ChatModel, Unit> function1;
                o0OOO0 this$0 = this.f49448OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("102287");
                ChatModel chatModel = this$0.f49469OooOo0o;
                if (chatModel == null || (function1 = this$0.f49452OooO0o) == null) {
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
                tv.setTextColor(o0000.OooO00o(oO00O0o.color_e2e2e2));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            tv.setTextColor(o0000.OooO00o(oO00O0o.color_e2e2e2));
        }
    }

    public abstract boolean OooO00o();

    /* JADX WARN: Code duplicated, block: B:32:0x01b7  */
    public void OooO0OO(int i, @NotNull ChatModel model) {
        boolean z;
        String bubbleUrl;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f49469OooOo0o = model;
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        final String strOooO00o = OooOOO.OooO00o(newFrom.getUserHeader().getValue());
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        this.f49460OooOOO0.OooO0OO(newFrom2.getRoomMemberType().getValue().intValue(), false, false);
        final OooOO0 option = p543o0oO0O00.OooO.OooO00o();
        Intrinsics.checkNotNullExpressionValue(option, "borderHeader()");
        final RoundImageView roundImageView = this.f49454OooO0oO;
        roundImageView.getClass();
        Intrinsics.checkNotNullParameter(option, "option");
        if (option.f43897OooOo0o) {
            roundImageView.displayType = DisplayType.CIRCLE;
        } else {
            roundImageView.displayType = DisplayType.NORMAL;
        }
        int i2 = option.f43903OooOooO;
        if (i2 > 0) {
            roundImageView.f31345OooO0oo = true;
            roundImageView.f31343OooO0o0 = i2;
            roundImageView.f31344OooO0oO = option.f43904OooOooo;
        }
        int i3 = option.f43900OooOoOO;
        if (i3 == 1) {
            roundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i3 == 2) {
            roundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (i3 == 3) {
            roundImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m4213constructorimpl(Boolean.valueOf(roundImageView.post(new Runnable() { // from class: o0oOoO0o.o00O0O00
                @Override // java.lang.Runnable
                public final void run() {
                    DisplayType[] displayTypeArr = RoundImageView.f31339OooOoO;
                    RoundImageView this$0 = roundImageView;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    OooOO0 option2 = option;
                    Intrinsics.checkNotNullParameter(option2, "$option");
                    OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this$0.getContext());
                    oooO00o.OooO00o(option2);
                    oooO00o.f43911OooO0OO = strOooO00o;
                    oooO00o.f43909OooO00o = 0;
                    oooO00o.OooO0Oo(this$0);
                }
            })));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        RoomUserInfoModel newFrom3 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom3);
        boolean zOooO0O0 = OooOo00.OooO0O0(newFrom3.getHeaderCardUrl().getValue());
        FragmentActivity fragmentActivity = this.f49471OooO00o;
        SVGAView sVGAView = this.f49455OooO0oo;
        if (zOooO0O0) {
            sVGAView.setVisibility(0);
            RoomUserInfoModel newFrom4 = model.getNewFrom();
            Intrinsics.checkNotNull(newFrom4);
            sVGAView.OooOO0O(OooO0o.OooO0Oo(newFrom4.getHeaderCardUrl().getValue()), fragmentActivity);
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
        this.f49449OooO.OooO00o(iIntValue, newFrom6.getRankDay().getValue().intValue());
        RoomUserInfoModel newFrom7 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom7);
        long jLongValue = newFrom7.getUserId().getValue().longValue();
        RoomUserInfoModel newFrom8 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom8);
        MutableStateFlow<String> userName = newFrom8.getUserName();
        Intrinsics.checkNotNull(userName);
        String strOooO0O0 = oOO0O0O.OooO0O0(jLongValue, userName.getValue());
        UserNameView userNameView = this.f49459OooOOO;
        userNameView.setText(strOooO0O0);
        UserWealthTagView userWealthTagView = this.f49461OooOOOO;
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
        this.f49464OooOOo0.OooOOOO(iIntValue2, z, fragmentActivity);
        RoomUserInfoModel newFrom14 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom14);
        boolean zBooleanValue = newFrom14.isPremium().getValue().booleanValue();
        RoomUserInfoModel newFrom15 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom15);
        this.f49463OooOOo.OooO0Oo(newFrom15.getPremiumLevel().getValue().intValue(), zBooleanValue);
        RoomUserInfoModel newFrom16 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom16);
        this.f49465OooOOoo.setUserPrettyId(newFrom16.getIdLevel().getValue().intValue());
        RoomUserInfoModel newFrom17 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom17);
        this.f49467OooOo00.OooO00o(newFrom17.getMedal().getValue(), fragmentActivity);
        RoomUserInfoModel newFrom18 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom18);
        Integer value2 = newFrom18.getMemberLevel().getValue();
        RoomUserInfoModel newFrom19 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom19);
        String value3 = newFrom19.getBadgeUrl().getValue();
        RoomUserInfoModel newFrom20 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom20);
        this.f49462OooOOOo.OooO00o(value2, value3, newFrom20.isTopRank().getValue().booleanValue(), 9.0f);
        RoomUserInfoModel newFrom21 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom21);
        MutableStateFlow<Boolean> mutableStateFlowIsPremium = newFrom21.isPremium();
        RoomUserInfoModel newFrom22 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom22);
        MutableStateFlow<Integer> premiumLevel = newFrom22.getPremiumLevel();
        userNameView.setTextColor(o0000.OooO00o(((Number) this.f49466OooOo0.get((!mutableStateFlowIsPremium.getValue().booleanValue() || premiumLevel.getValue().intValue() <= 0) ? 0 : premiumLevel.getValue().intValue() / 100)).intValue()));
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
                com.code.android.util.OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), new o0OO(bubbleUrl, this, null));
                return;
            }
        }
        this.f49456OooOO0.setBackgroundResource(oOo00OO0.ic_room_bubble_default);
    }

    public abstract boolean OooO0Oo();
}
