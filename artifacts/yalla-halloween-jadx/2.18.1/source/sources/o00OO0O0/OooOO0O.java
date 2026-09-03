package o00OO0O0;

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
import com.app.base.model.ChatModel;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserRankView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.round.DisplayType;
import com.yalla.yalla.ui.view.round.RoundImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOO0O extends OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final UserRankView f31384OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f31385OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Boolean> f31386OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f31387OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f31388OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final RoundImageView f31389OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final SVGAView f31390OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final UserTagView f31391OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ViewGroup f31392OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ViewGroup f31393OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final List<Integer> f31394OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final ImageView f31395OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final float f31396OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public ChatModel f31397OooOOOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.sdv_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.sdv_head)");
        this.f31389OooO0oO = (RoundImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.layout_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.layout_head)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sdv_icon_hats);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.sdv_icon_hats)");
        this.f31390OooO0oo = (SVGAView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_rank);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.tv_rank)");
        this.f31384OooO = (UserRankView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.chatLine_userTagView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.chatLine_userTagView)");
        this.f31391OooOO0 = (UserTagView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.chatlineContent)");
        this.f31392OooOO0O = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.chatlineRoot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.chatlineRoot)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById7;
        this.f31393OooOO0o = viewGroup;
        this.f31395OooOOO0 = (ImageView) view.findViewById(R.id.chatlineReplyTag);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.color.color_FFFFFFF));
        arrayList.add(Integer.valueOf(R.color.color_FFED9368));
        arrayList.add(Integer.valueOf(R.color.color_FF1CCA7F));
        arrayList.add(Integer.valueOf(R.color.color_FF21ABF9));
        arrayList.add(Integer.valueOf(R.color.color_FFFF55B5));
        arrayList.add(Integer.valueOf(R.color.color_FFFF6EFD));
        arrayList.add(Integer.valueOf(R.color.color_FFA67AFB));
        arrayList.add(Integer.valueOf(R.color.color_FFF2D922));
        this.f31394OooOOO = arrayList;
        this.f31396OooOOOO = 200.0f;
        if (OooO00o()) {
            o00o0oOO.oOO00O.OooO00o oooO00o = p209o00o0oOO.oOO00O.f33368OooO00o;
            SmartSwipeWrapper smartSwipeWrapper = viewGroup.getParent() instanceof SmartSwipeWrapper ? (SmartSwipeWrapper) viewGroup.getParent() : null;
            if (smartSwipeWrapper == null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (viewGroup.getParent() != null) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                    Context context = viewGroup.getContext();
                    o00o0oOO.oOO00O.OooO00o oooO00o2 = p209o00o0oOO.oOO00O.f33368OooO00o;
                    SmartSwipeWrapper smartSwipeWrapper2 = (oooO00o2 == null || (smartSwipeWrapper2 = oooO00o2.OooO00o()) == null) ? new SmartSwipeWrapper(context) : smartSwipeWrapper2;
                    int iIndexOfChild = viewGroup2.indexOfChild(viewGroup);
                    viewGroup2.removeView(viewGroup);
                    viewGroup2.addView(smartSwipeWrapper2, iIndexOfChild, layoutParams);
                    smartSwipeWrapper = smartSwipeWrapper2;
                } else {
                    Context context2 = viewGroup.getContext();
                    o00o0oOO.oOO00O.OooO00o oooO00o3 = p209o00o0oOO.oOO00O.f33368OooO00o;
                    SmartSwipeWrapper smartSwipeWrapper3 = (oooO00o3 == null || (smartSwipeWrapper3 = oooO00o3.OooO00o()) == null) ? new SmartSwipeWrapper(context2) : smartSwipeWrapper3;
                    if (layoutParams != null) {
                        smartSwipeWrapper3.setLayoutParams(layoutParams);
                    }
                    smartSwipeWrapper = smartSwipeWrapper3;
                }
                smartSwipeWrapper.setContentView(viewGroup);
            }
            p212o00o0oo0.o000O0 o000o0 = (p212o00o0oo0.o000O0) smartSwipeWrapper.addConsumer(new p212o00o0oo0.o000O0());
            o000o0.OooO00o(new OooOO0(this));
            if (p168o00Ooo0.oo000o.OooO0o0()) {
                o000o0.f33363OooOOO0 |= 2;
            } else {
                o000o0.f33363OooOOO0 |= 1;
            }
        }
        viewGroup.setOnClickListener(new OooO0O0(this, 0));
        viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: o00OO0O0.OooO0OO
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                OooOO0O this$0 = this.f31381Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Boolean> function0 = this$0.f31386OooO0Oo;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
            }
        });
        frameLayout.setOnClickListener(new OooO00o(this, 0));
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: o00OO0O0.OooO0o
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                Function1<? super ChatModel, Unit> function1;
                OooOO0O this$0 = this.f31382Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ChatModel chatModel = this$0.f31397OooOOOo;
                if (chatModel == null || (function1 = this$0.f31387OooO0o) == null) {
                    return false;
                }
                function1.invoke(chatModel);
                return false;
            }
        });
    }

    public abstract boolean OooO00o();

    public final void OooO0O0(@NotNull ChatModel model, @NotNull TextView tv) {
        Unit unit;
        RoomUserInfoModel.ChatBubbleInfo bubbleInfo;
        String bubbleColour;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tv, "tv");
        RoomUserInfoModel roomUserInfoModel = model.from;
        if (roomUserInfoModel == null || (bubbleInfo = roomUserInfoModel.getBubbleInfo()) == null || (bubbleColour = bubbleInfo.getBubbleColour()) == null) {
            unit = null;
        } else {
            try {
                tv.setTextColor(Color.parseColor(bubbleColour));
            } catch (Exception unused) {
                tv.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_e2e2e2));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            tv.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_e2e2e2));
        }
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    public void OooO0OO(int i, @NotNull ChatModel model) {
        RoomUserInfoModel.ChatBubbleInfo bubbleInfo;
        String bubbleUrl;
        RoomUserInfoModel.ChatBubbleInfo bubbleInfo2;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f31397OooOOOo = model;
        boolean z = true;
        final String strImgSize = CloudImageUtilKt.imgSize(model.from.getUserHeader(), com.yalla.support.common.util.OooOo00.OooO00o(34), true);
        this.f31391OooOO0.setIdentityRoomChat(model.from.getRoomMemberType());
        final RoundImageView roundImageView = this.f31389OooO0oO;
        final oO0O00 option = o00OOO.OooO00o.OooO00o();
        Intrinsics.checkNotNullExpressionValue(option, "borderHeader()");
        Objects.requireNonNull(roundImageView);
        Intrinsics.checkNotNullParameter(option, "option");
        if (option.f48415OooOo0o) {
            roundImageView.displayType = DisplayType.CIRCLE;
        } else {
            roundImageView.displayType = DisplayType.NORMAL;
        }
        int i2 = option.f48421OooOooO;
        if (i2 > 0) {
            roundImageView.f25240OoooO = true;
            roundImageView.f25242OoooO00 = i2;
            roundImageView.f25243OoooO0O = option.f48422OooOooo;
        }
        int i3 = option.f48418OooOoOO;
        if (i3 == 1) {
            roundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i3 == 2) {
            roundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (i3 == 3) {
            roundImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m502constructorimpl(Boolean.valueOf(roundImageView.post(new Runnable() { // from class: o0oo00o.oO00OOo0
                @Override // java.lang.Runnable
                public final void run() {
                    RoundImageView this$0 = roundImageView;
                    String str = strImgSize;
                    oO0O00 option2 = option;
                    DisplayType[] displayTypeArr = RoundImageView.f25238ooOO;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(option2, "$option");
                    oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this$0.getContext());
                    oooO00o.f48429OooO0OO = str;
                    oooO00o.f48427OooO00o = 0;
                    oooO00o.f48441OooOOOo = option2.f48405OooOOO0;
                    oooO00o.f48431OooO0o = option2.f48409OooOOo0;
                    oooO00o.OooO0o(this$0);
                }
            })));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(model.from.getHeaderCardUrl())) {
            this.f31390OooO0oo.setVisibility(0);
            SVGAView sVGAView = this.f31390OooO0oo;
            sVGAView.OooO0oo(CloudImageUtilKt.imgFormat(model.from.getHeaderCardUrl()), this.f31399OooO00o);
            sVGAView.OooO();
        } else {
            this.f31390OooO0oo.setVisibility(8);
            this.f31390OooO0oo.OooOO0(false);
        }
        this.f31391OooOO0.setName(p520o0o0O0O0.o00O0O.f42677OooO00o.OooO0O0(model.from.getUserId(), model.from.getUserName()));
        this.f31384OooO.OooO00o(model.from.getRankWeek(), model.from.getRankDay());
        this.f31391OooOO0.OooO0oO(model.from.isPremium(), model.from.getPremiumLevel());
        this.f31391OooOO0.setPrettyIdUser(model.from.getIdLevel());
        this.f31391OooOO0.OooO0Oo(model.from.getMedal(), this.f31399OooO00o);
        this.f31391OooOO0.OooO0OO(model.from.getVipLevel(), model.from.getVipState() == VipState.Vip.getValue() && model.from.getShowVIP());
        this.f31391OooOO0.OooO(Integer.valueOf(model.from.getMemberLevel()), model.from.getBadgeUrl(), model.from.getIsTopRank(), 9.0f);
        boolean zIsPremium = model.from.isPremium();
        int premiumLevel = model.from.getPremiumLevel();
        this.f31391OooOO0.setNameTextColor(((Number) this.f31394OooOOO.get((!zIsPremium || premiumLevel <= 0) ? 0 : premiumLevel / 100)).intValue());
        if (OooO0Oo()) {
            RoomUserInfoModel roomUserInfoModel = model.from;
            String bubbleUrl2 = (roomUserInfoModel == null || (bubbleInfo2 = roomUserInfoModel.getBubbleInfo()) == null) ? null : bubbleInfo2.getBubbleUrl();
            if (bubbleUrl2 != null && !StringsKt.isBlank(bubbleUrl2)) {
                z = false;
            }
            if (!z) {
                RoomUserInfoModel roomUserInfoModel2 = model.from;
                if (roomUserInfoModel2 == null || (bubbleInfo = roomUserInfoModel2.getBubbleInfo()) == null || (bubbleUrl = bubbleInfo.getBubbleUrl()) == null) {
                    return;
                }
                p254o00ooO0O.o0000O0.OooO00o(LifecycleOwnerKt.getLifecycleScope(this.f31399OooO00o), new OooO(bubbleUrl, this, null));
                return;
            }
        }
        this.f31392OooOO0O.setBackgroundResource(R.drawable.ic_room_bubble_default);
    }

    public abstract boolean OooO0Oo();
}
