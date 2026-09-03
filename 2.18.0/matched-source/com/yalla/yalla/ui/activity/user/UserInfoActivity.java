package com.yalla.yalla.ui.activity.user;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.app.appConfig.apiDataModela.ApiCountryUtils;
import com.app.base.application.App;
import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.model.RoomModel;
import com.app.base.model.UserInBarModel;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import com.yalla.yalla.ui.fragment.UserInfoRightFragment;
import com.yalla.yalla.ui.vm.user.UserInfoVM;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p140o00OOOo0.o00Ooo;
import p140o00OOOo0.o0ooOOo;
import p143o00OOooO.o0000;
import p143o00OOooO.o000000O;
import p143o00OOooO.o0000O;
import p143o00OOooO.o0000O0;
import p143o00OOooO.o0000O00;
import p143o00OOooO.o0000oo;
import p153o00Oo0o0.o00Oo00;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o000OOo;
import p154o00Oo0oO.o00oO0o;
import p160o00OoOO.o0000Ooo;
import p161o00OoOO0.o00OO0OO;
import p169o00Ooo0.o00O0O;
import p169o00Ooo0.o0O0O00;
import p169o00Ooo0.oo000o;
import p177o00OoooO.oO00000;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.o00O0;
import p256o00ooO0o.oo0oOO0;
import p393o0OOooOo.o0O00000;
import p480o0OooooO.oO0OoOO0;
import p480o0OooooO.oO0o0o;
import p520o0o0O00o.o000O00O;
import p568o0oOo00O.o0;
import p568o0oOo00O.o00OOOO0;
import p568o0oOo00O.o0O000;
import p568o0oOo00O.o0O0000O;
import p568o0oOo00O.o0O000O;
import p568o0oOo00O.o0O00O0o;
import p568o0oOo00O.o0O00OO;
import p568o0oOo00O.o0O00OOO;
import p568o0oOo00O.o0O00o0;
import p568o0oOo00O.o0O00o00;
import p568o0oOo00O.o0O0O0O;
import p568o0oOo00O.o0O0O0Oo;
import p568o0oOo00O.o0O0OOO0;
import p568o0oOo00O.o0O0o;
import p568o0oOo00O.o0oOOo;
import p618o0oo0Ooo.oO0O000o;
import p622o0oo0o0O.o00O00OO;
import p622o0oo0o0O.oOO00O;
import p651o0ooOOoo.ph;
import p656o0ooo.o000oOoO;
import p709oOooo0o.o000O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClick", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23471o0OOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public o00O0O f23474OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public UserInfoModel f23475Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public String f23476Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f23477OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public List<Fragment> f23478Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public UserInfoLeftFragment f23479o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public UserInfoRightFragment f23480o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f23481o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f23482o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f23483o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean f23484o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @Nullable
    public ArgbEvaluator f23485o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public o0O000O f23486o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public int f23487o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public ArrayList<SelectDialogModel<String>> f23488o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @Nullable
    public o000oOoO f23489o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final o000O f23490oo000o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f23472OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(ph.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23473OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f23510Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23510Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public final int[] f23491ooOO = {R.string.UserInfo_Track, R.string.UserInfo_Profile};

    public static final class OooO extends Lambda implements Function1<UserInfoModel, Unit> {
        public OooO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:73:0x03e1  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UserInfoModel userInfoModel) {
            UserInfoModel userInfoModel2 = userInfoModel;
            UserInfoActivity.OooOooO(UserInfoActivity.this, true);
            UserInfoActivity.this.Oooo00o().f50337OooO0o.setVisibility(0);
            UserInfoActivity.this.Oooo00o().f50349OooOOo0.setVisibility(0);
            UserInfoActivity.this.Oooo00o().f50334OooO0O0.setVisibility(0);
            if (userInfoModel2 != null) {
                UserInfoActivity.this.f23475Oooooo = userInfoModel2;
                MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel = new MomentChangeUserIsInRoomModel();
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("");
                sbOooO0O0.append(userInfoModel2.getUserId());
                momentChangeUserIsInRoomModel.setUserId(sbOooO0O0.toString());
                momentChangeUserIsInRoomModel.setInRoom(userInfoModel2.getInRoom() != 0);
                LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM").post(momentChangeUserIsInRoomModel);
                UserInfoActivity userInfoActivity = UserInfoActivity.this;
                UserInfoModel userInfoModel3 = userInfoActivity.f23475Oooooo;
                if (userInfoModel3 != null) {
                    if (o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, userInfoActivity.f23476Oooooo0)) {
                        userInfoActivity.Oooo00o().f50337OooO0o.setVisibility(8);
                    } else {
                        userInfoActivity.Oooo00o().f50337OooO0o.setVisibility(0);
                    }
                    String userName = com.yalla.support.common.util.OooO0OO.OooO00o(userInfoModel3.getUserName()) ? ZegoConstants.ZegoVideoDataAuxPublishingStream : userInfoModel3.getUserName();
                    String memoName = com.yalla.support.common.util.OooO0OO.OooO0O0(userInfoModel3.getMemoName()) ? userInfoModel3.getMemoName() : userName;
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49993OooOo.setText(memoName);
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49993OooOo.setFlash(userInfoModel3.getVipLevel() >= VipLevel.Vip4.getValue());
                    if (userInfoModel3.getVipLevel() > VipLevel.Vip0.getValue()) {
                        ImageView imageView = userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49982OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.head.details.ivKaVip");
                        com.yalla.support.common.util.o00O0O.OooO(imageView);
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49982OooO0oo.setImageResource(VipLevel.INSTANCE.OooO00o(userInfoModel3.getVipLevel()));
                    } else {
                        ImageView imageView2 = userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49982OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.head.details.ivKaVip");
                        com.yalla.support.common.util.o00O0O.OooO00o(imageView2);
                    }
                    if (com.yalla.support.common.util.OooO0OO.OooO0O0(userInfoModel3.getMemoName())) {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f50001OooOoo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.User_Edit_Remark_name) + ' ' + userName);
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f50001OooOoo.setVisibility(0);
                    } else {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f50001OooOoo.setVisibility(8);
                    }
                    userInfoActivity.Oooo00o().f50346OooOOOO.setText(memoName);
                    oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(userInfoActivity);
                    oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
                    oooO00o.f48447OooO0OO = CloudImageUtilKt.imgFormat(userInfoModel3.getUserHeader());
                    oooO00o.f48445OooO00o = 0;
                    oooO00o.OooO0OO(2, o000O0O0.OooO00o(R.color.white));
                    oooO00o.OooO0o(userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49988OooOOOO);
                    o00O0O o00o0o2 = userInfoActivity.f23474OooooOo;
                    int i = 4;
                    if (o00o0o2 != null) {
                        o00o0o2.OooO00o(userInfoModel3.getUserHeaderFrame());
                    }
                    if (com.yalla.support.common.util.OooO0OO.OooO0O0(userInfoModel3.getBackground())) {
                        oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(userInfoActivity);
                        oooO00o2.f48447OooO0OO = userInfoModel3.getBackground();
                        oooO00o2.f48445OooO00o = 0;
                        oooO00o2.f48459OooOOOo = R.drawable.icon_userinfo_header_bg;
                        oooO00o2.OooO0o(userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49986OooOOO);
                    } else {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49986OooOOO.setBackground(com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_userinfo_header_bg));
                    }
                    if (userInfoModel3.isOfficialRole()) {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49983OooOO0.setVisibility(0);
                    } else {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49983OooOO0.setVisibility(8);
                    }
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49985OooOO0o.OooO0Oo(userInfoModel3.isPremium(), userInfoModel3.getPremiumLevel());
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49974OooO.setUserPrettyId(userInfoModel3.getIdLevel());
                    TextView textView = userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f50000OooOoOO;
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("ID:");
                    sbOooO0O1.append(userInfoModel3.getUserIdx());
                    textView.setText(sbOooO0O1.toString());
                    int sex = userInfoModel3.getSex();
                    if (sex == 0) {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49984OooOO0O.setVisibility(0);
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49984OooOO0O.setImageResource(R.drawable.me_top_icon_female);
                    } else if (sex != 1) {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49984OooOO0O.setVisibility(8);
                    } else {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49984OooOO0O.setVisibility(0);
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49984OooOO0O.setImageResource(R.drawable.me_top_icon_male);
                    }
                    TextView textView2 = userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f50002OooOoo0;
                    StringBuilder sb = new StringBuilder();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("LV.%s", Arrays.copyOf(new Object[]{Integer.valueOf(userInfoModel3.getUserLevel())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    sb.append(str);
                    sb.append(' ');
                    textView2.setText(sb.toString());
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49999OooOoO0.setText(userInfoModel3.getAge() + "");
                    try {
                        new SimpleDateFormat("yyyy-MM-dd").parse(userInfoModel3.getBirthday());
                    } catch (Exception unused) {
                        Calendar.getInstance().getTime();
                    }
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49995OooOo00.setVisibility(8);
                    if (com.yalla.support.common.util.OooO0OO.OooO0O0(Integer.valueOf(userInfoModel3.getCountryId())) && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(Integer.valueOf(userInfoModel3.getCountryId()))) {
                        String modelNameForId = ApiCountryUtils.INSTANCE.getModelNameForId(userInfoModel3.getCountryId() + "");
                        if (!TextUtils.isEmpty(modelNameForId)) {
                            userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49995OooOo00.setText(modelNameForId);
                            userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49995OooOo00.setVisibility(0);
                        }
                    }
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f50003OooOooO.setText(o0O0O00.OooO0oO(userInfoModel3.getVisitorNum(), false));
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49997OooOo0o.setText(o0O0O00.OooO0oO(userInfoModel3.getFollowedNum(), false));
                    userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49994OooOo0.setText(o0O0O00.OooO0oO(userInfoModel3.getFansNum(), false));
                    if (userInfoModel3.getBio() == null) {
                        userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49998OooOoO.setText(R.string.Userinfo_Sign_Hint);
                    } else {
                        String bio = userInfoModel3.getBio();
                        if (com.yalla.support.common.util.OooO0OO.OooO0O0(bio != null ? StringsKt.trim((CharSequence) bio).toString() : null)) {
                            userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49998OooOoO.setText(userInfoModel3.getBio());
                        } else {
                            userInfoActivity.Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49998OooOoO.setText(R.string.Userinfo_Sign_Hint);
                        }
                    }
                    String str2 = userInfoActivity.f23476Oooooo0;
                    p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
                    if (o0000O.OooO00o(oooOOO, str2) && userInfoActivity.f23476Oooooo0 != null) {
                        userInfoActivity.Oooo0().getNewFans().observe(userInfoActivity, new o0000Ooo(userInfoActivity, i));
                    }
                    if (o0000O.OooO00o(oooOOO, userInfoActivity.f23476Oooooo0)) {
                        userInfoActivity.Oooo0().getNewVisitor().observe(userInfoActivity, new o000000O(userInfoActivity, 5));
                    }
                }
                UserInfoActivity userInfoActivity2 = UserInfoActivity.this;
                UserInfoLeftFragment userInfoLeftFragment = userInfoActivity2.f23479o00O0O;
                if (userInfoLeftFragment != null) {
                    userInfoLeftFragment.updateInfo(userInfoActivity2.f23475Oooooo);
                }
                UserInfoActivity userInfoActivity3 = UserInfoActivity.this;
                UserInfoRightFragment userInfoRightFragment = userInfoActivity3.f23480o00Oo0;
                if (userInfoRightFragment != null) {
                    userInfoRightFragment.updataInfo(userInfoActivity3.f23475Oooooo);
                }
                UserInfoActivity userInfoActivity4 = UserInfoActivity.this;
                UserInfoModel userInfoModel4 = userInfoActivity4.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel4);
                if (userInfoModel4.getInHeBlack()) {
                    userInfoActivity4.Oooo00o().f50332OooO.setVisibility(8);
                } else if (userInfoModel4.getPurview().getSeeInRoom() == 1 && userInfoModel4.getIsFriend()) {
                    userInfoActivity4.Oooo00o().f50332OooO.setVisibility(0);
                } else if (userInfoModel4.getPurview().getSeeInRoom() == 2) {
                    if (userInfoModel4.getIsFollow() || userInfoModel4.getIsFriend()) {
                        userInfoActivity4.Oooo00o().f50332OooO.setVisibility(0);
                    }
                } else if (userInfoModel4.getPurview().getSeeInRoom() == 0) {
                    userInfoActivity4.Oooo00o().f50332OooO.setVisibility(0);
                } else {
                    userInfoActivity4.Oooo00o().f50332OooO.setVisibility(8);
                }
                if (userInfoModel4.getInRoom() == 0) {
                    o00Oo00.OooO00o(userInfoActivity4.Oooo00o().f50344OooOOO, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_inroom_false), ViewLocation.top, oo000o.OooO0o0());
                } else {
                    o00Oo00.OooO00o(userInfoActivity4.Oooo00o().f50344OooOOO, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_inroom), ViewLocation.top, oo000o.OooO0o0());
                }
                UserInfoLeftFragment userInfoLeftFragment2 = userInfoActivity4.f23479o00O0O;
                if (userInfoLeftFragment2 != null) {
                    Intrinsics.checkNotNull(userInfoLeftFragment2);
                    userInfoLeftFragment2.setIsFollow(userInfoModel4.getIsFollow() ? 1 : 0);
                }
                if (userInfoModel4.getIsFollow()) {
                    o00Oo00.OooO00o(userInfoActivity4.Oooo00o().f50343OooOO0o, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_followed), ViewLocation.top, oo000o.OooO0o0());
                    userInfoActivity4.Oooo00o().f50343OooOO0o.setText(R.string.Following_user);
                } else {
                    o00Oo00.OooO00o(userInfoActivity4.Oooo00o().f50343OooOO0o, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_follow), ViewLocation.top, oo000o.OooO0o0());
                    userInfoActivity4.Oooo00o().f50343OooOO0o.setText(R.string.Follow);
                }
                if (userInfoActivity4.f23477OoooooO) {
                    userInfoActivity4.getIntent().putExtra("UserInfoActivityNew_Go_To_Add_Friend", false);
                    userInfoActivity4.f23477OoooooO = false;
                    userInfoActivity4.OooOooo(userInfoModel4.getPurview().getIsVerify(), userInfoModel4.getIsBlack(), userInfoModel4.getInHeBlack());
                }
                UserInfoModel userInfoModel5 = UserInfoActivity.this.f23475Oooooo;
                Boolean boolValueOf = userInfoModel5 != null ? Boolean.valueOf(userInfoModel5.getIsShowMomentPostDialog()) : null;
                UserInfoActivity userInfoActivity5 = UserInfoActivity.this;
                if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                    userInfoActivity5.Oooo0().closeMark().observe(userInfoActivity5, new o0o0000.OooOo(null, null, o0O00OOO.f45311Oooo, false, 11));
                    oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoActivity5);
                    oo0ooo0.OooOoo(R.string.user_info_first_post_title);
                    oo0ooo0.OooOo0(R.string.user_info_first_post_content);
                    oo0ooo0.OooOo(new o0O00o00(userInfoActivity5));
                    oo0ooo0.OooOOo0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_info_first_post_post));
                    oo0ooo0.OooOo0o(new o0O0O0O(userInfoActivity5));
                    oo0ooo0.OooO0oO(false);
                    oo0ooo0.OooOOO0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.user.UserInfoActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0258OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Activity f23493Oooo;

            /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
            public final /* synthetic */ boolean f23494OoooO;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ boolean f23495OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ String f23496OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public final /* synthetic */ boolean f23497OoooO0O;

            /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
            public final /* synthetic */ boolean f23498OoooOO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0258OooO00o(Activity activity, String str, boolean z, boolean z2, boolean z3, boolean z4) {
                super(0);
                this.f23493Oooo = activity;
                this.f23496OoooO00 = str;
                this.f23495OoooO0 = z;
                this.f23497OoooO0O = z2;
                this.f23494OoooO = z3;
                this.f23498OoooOO0 = z4;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intent intent = new Intent(this.f23493Oooo, (Class<?>) UserInfoActivity.class);
                intent.putExtra("Id", this.f23496OoooO00);
                intent.putExtra("UserInfoActivityNew_Go_To_Add_Friend", this.f23495OoooO0);
                intent.putExtra("UserInfoActivityNew_FROM_ROOM_KEY", this.f23497OoooO0O);
                intent.putExtra("UserInfoActivityNew_FROM_PRIVATE_CHAT", this.f23494OoooO);
                intent.putExtra("UserInfoActivityNew_From_Room_Page", this.f23498OoooOO0);
                this.f23493Oooo.startActivityForResult(intent, 1022);
                return null;
            }
        }

        public static void OooO0Oo(OooO00o oooO00o, Activity context, String str, boolean z, int i) {
            boolean z2 = (i & 8) != 0 ? false : z;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(context, "context");
            oooO00o.OooO0OO(context, str, false, false, false, z2);
        }

        @JvmOverloads
        public final void OooO00o(@NotNull Activity context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            OooO0Oo(this, context, str, false, 12);
        }

        @JvmStatic
        public final void OooO0O0(@Nullable Activity activity, @Nullable String str, boolean z, @Nullable o00O00OO o00o00oo2) {
            Bundle bundle = new Bundle();
            bundle.putString("Id", str);
            bundle.putBoolean("UserInfoActivityNew_Go_To_Add_Friend", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_ROOM_KEY", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_PRIVATE_CHAT", z);
            oOO00O ooo00o = new oOO00O((FragmentActivity) activity);
            ooo00o.f48639OooO0O0 = UserInfoActivity.class;
            ooo00o.OooO00o(bundle);
            ooo00o.OooO0O0(o00o00oo2);
        }

        public final void OooO0OO(@NotNull Activity context, @Nullable String str, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(context, "context");
            C0258OooO00o onLogin = new C0258OooO00o(context, str, z, z2, z3, z4);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f23500OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(0);
            this.f23500OoooO00 = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoActivity.OooOoo(UserInfoActivity.this, false);
            if (this.f23500OoooO00) {
                UserInfoActivity.this.Oooo0oO();
            } else {
                UserInfoActivity.this.Oooo0o0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.addbuddy));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends o00OO0OO.OooO0O0 {
        public OooO0OO() {
            super(UserInfoActivity.this);
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            UserInBarModel.DataBean dataBean;
            Intrinsics.checkNotNullParameter(response, "response");
            UserInBarModel userInBarModel = (UserInBarModel) o0Oo0oo.OooO0O0(response, UserInBarModel.class);
            if (UserInfoActivity.this.isFinishing() || userInBarModel == null || (dataBean = userInBarModel.data) == null) {
                return;
            }
            if (!userInBarModel.isinbar) {
                UserInfoModel userInfoModel = UserInfoActivity.this.f23475Oooooo;
                if (userInfoModel != null) {
                    userInfoModel.setInRoom(0L);
                }
                o00Oo00.OooO00o(UserInfoActivity.this.Oooo00o().f50344OooOOO, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_inroom_false), ViewLocation.top, oo000o.OooO0o0());
                ToastUtil.f12582OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notinroom));
                return;
            }
            String str = dataBean.roomserverip;
            RoomModel roomModel = new RoomModel();
            roomModel.setRoomIp(str);
            roomModel.setId(o0O0O00.OooOOO0(userInBarModel.data.barid));
            roomModel.setName(userInBarModel.data.barname);
            roomModel.setLevel(userInBarModel.data.barlevel);
            if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Protile_lnRoom);
            }
        }
    }

    public static final class OooO0o extends o00OO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f23503OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ boolean f23504OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000oOoO o000oooo2, boolean z) {
            super(UserInfoActivity.this);
            this.f23503OooO0O0 = o000oooo2;
            this.f23504OooO0OO = z;
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
            userInfoActivity.Oooo00o().f50339OooO0oO.setClickable(true);
        }

        /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            p141o00OOOoO.OooO0OO oooO0OO = new p141o00OOOoO.OooO0OO();
            oooO0OO.f31906OooO00o = 19;
            UserInfoModel userInfoModel = UserInfoActivity.this.f23475Oooooo;
            Intrinsics.checkNotNull(userInfoModel);
            if (userInfoModel.getIsFollow()) {
                UserInfoModel userInfoModel2 = UserInfoActivity.this.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel2);
                userInfoModel2.setFollow(false);
                oooO0OO.f31907OooO0O0 = 0;
                String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Unfollowed);
                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34368OooO00o;
                        o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
                Observable<Object> observable = LiveEventBus.get("USER_UN_FOLLOWING");
                UserInfoModel userInfoModel3 = UserInfoActivity.this.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel3);
                observable.post(Long.valueOf(userInfoModel3.getUserId()));
            } else {
                String strOooO0OO2 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Following_room_profile_toast);
                ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                    o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O1.run();
                    } else {
                        o00O000 o00o002 = o00O000.f34368OooO00o;
                        o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                    }
                }
                UserInfoModel userInfoModel4 = UserInfoActivity.this.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel4);
                userInfoModel4.getIsFollow();
                oooO0OO.f31907OooO0O0 = 1;
                o000oOoO o000oooo2 = this.f23503OooO0O0;
                if (o000oooo2 != null) {
                    o000oooo2.OooO0Oo();
                }
            }
            UserInfoModel userInfoModel5 = UserInfoActivity.this.f23475Oooooo;
            Intrinsics.checkNotNull(userInfoModel5);
            oooO0OO.f31908OooO0OO = com.yalla.support.common.util.OooO.OooO(Long.valueOf(userInfoModel5.getUserId()), "");
            p034OoooO0O.o0Oo0oo.OooO0o(oooO0OO);
            UserInfoLeftFragment userInfoLeftFragment = UserInfoActivity.this.f23479o00O0O;
            if (userInfoLeftFragment != null) {
                Intrinsics.checkNotNull(userInfoLeftFragment);
                userInfoLeftFragment.setIsFollow(oooO0OO.f31907OooO0O0);
            }
            o00Oo00.OooO00o(UserInfoActivity.this.Oooo00o().f50343OooOO0o, com.yalla.support.common.util.OooOOO.OooO0O0(oooO0OO.f31907OooO0O0 == 1 ? R.drawable.icon_profile_followed : R.drawable.icon_profile_follow), ViewLocation.top, oo000o.OooO0o0());
            UserInfoActivity.this.Oooo00o().f50343OooOO0o.setText(this.f23504OooO0OO ? R.string.Following_user : R.string.Follow);
            UserInfoActivity.this.Oooo00o().f50339OooO0oO.setClickable(true);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            UserInfoActivity.OooOooO(UserInfoActivity.this, false);
            int code2 = error.getCode();
            if (code2 == 1 || code2 == 2) {
                UserInfoActivity userInfoActivity = UserInfoActivity.this;
                if (userInfoActivity.f23484o00oO0o && !userInfoActivity.isFinishing() && !UserInfoActivity.this.isDestroyed()) {
                    UserInfoActivity userInfoActivity2 = UserInfoActivity.this;
                    Objects.requireNonNull(userInfoActivity2);
                    oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoActivity2);
                    UserInfoActivity userInfoActivity3 = UserInfoActivity.this;
                    oo0ooo0.OooOo0(R.string.Network_request_failed);
                    oo0ooo0.OooOO0O(new com.yalla.yalla.ui.activity.user.OooO(userInfoActivity3));
                    oo0ooo0.OooOO0(new com.yalla.yalla.ui.activity.user.OooOO0(userInfoActivity3));
                    oo0ooo0.OooOOO0();
                }
            } else if (code2 == 1057 || code2 == 1058) {
                ToastUtil.f12582OooO00o.OooO00o(R.string.activity_delete_account);
                UserInfoActivity.this.Oooo00o().f50334OooO0O0.setVisibility(8);
                UserInfoActivity.this.Oooo00o().f50335OooO0OO.f49973OooO0O0.setVisibility(0);
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooOOOO(error, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<UserInfoModel>, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<UserInfoModel> apiResult) {
            ApiResult<UserInfoModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            UserInfoActivity.this.invalidateOptionsMenu();
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            userInfoActivity.f23484o00oO0o = false;
            userInfoActivity.f23481o00Ooo = false;
            o000O o000o = userInfoActivity.f23490oo000o;
            if (o000o != null) {
                o000o.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<String, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
            userInfoActivity.Oooo0o0(it);
            return Unit.INSTANCE;
        }
    }

    public UserInfoActivity() {
        Objects.requireNonNull(o0ooOOo.OooO0O0());
        this.f23490oo000o = new o000O();
        this.f23484o00oO0o = true;
        this.f23488o0ooOOo = new ArrayList<>();
    }

    public static final void OooOoo(final UserInfoActivity userInfoActivity, final boolean z) {
        UserInfoModel userInfoModel = userInfoActivity.f23475Oooooo;
        if (userInfoModel != null) {
            final long userId = userInfoModel.getUserId();
            userInfoActivity.Oooo0().blockUser(userId, z).observe(userInfoActivity, new Observer() { // from class: o0oOo00O.o00OOO0O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    UserInfoActivity this$0 = this.f45290OooO00o;
                    boolean z2 = z;
                    long j = userId;
                    Boolean isSuccess = (Boolean) obj;
                    UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullExpressionValue(isSuccess, "isSuccess");
                    if (isSuccess.booleanValue()) {
                        UserInfoModel userInfoModel2 = this$0.f23475Oooooo;
                        if (userInfoModel2 != null) {
                            userInfoModel2.setBlack(z2);
                        }
                        if (this$0.f23482o00o0O) {
                            ToastUtil.f12582OooO00o.OooO0O0(this$0.getString(R.string.Success));
                        }
                        if (z2) {
                            LiveEventBus.get("USER_ADD_BLACKLISTED").post(Long.valueOf(j));
                            this$0.Oooo0OO();
                        }
                    }
                }
            });
        }
    }

    public static final void OooOooO(UserInfoActivity userInfoActivity, boolean z) {
        if (z) {
            if (!o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, userInfoActivity.f23476Oooooo0)) {
                userInfoActivity.Oooo00o().f50338OooO0o0.setVisibility(0);
                return;
            }
        }
        userInfoActivity.Oooo00o().f50338OooO0o0.setVisibility(8);
    }

    public final void OooOooo(boolean z, boolean z2, boolean z3) {
        if (z3) {
            ToastUtil.f12582OooO00o.OooO0O0(getString(R.string.On_His_Blacklist));
            return;
        }
        if (!z2) {
            if (z) {
                Oooo0oO();
                return;
            } else {
                Oooo0o0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.addbuddy));
                return;
            }
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOo0(R.string.As_Block_Add_Friends);
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOo0o(new OooO0O0(z));
        oo0ooo0.OooOOO0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UserInfoVM Oooo0() {
        return (UserInfoVM) this.f23473OooooOO.getValue();
    }

    public final void Oooo000() {
        UserInfoModel userInfoModel = this.f23475Oooooo;
        Intrinsics.checkNotNull(userInfoModel);
        p154o00Oo0oO.o000000O.OooO0OO(String.valueOf(userInfoModel.getUserId()), new OooO0OO());
    }

    public final void Oooo00O(boolean z, @Nullable o000oOoO o000oooo2) {
        Oooo00o().f50339OooO0oO.setClickable(false);
        UserInfoModel userInfoModel = this.f23475Oooooo;
        Intrinsics.checkNotNull(userInfoModel);
        p154o00Oo0oO.o000000O.OooO00o(String.valueOf(userInfoModel.getUserId()), z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1", new OooO0o(o000oooo2, z));
    }

    public final ph Oooo00o() {
        return (ph) this.f23472OooooO0.getValue();
    }

    public final void Oooo0O0(Intent intent) {
        if (intent != null) {
            this.f23476Oooooo0 = intent.getStringExtra("Id");
            this.f23477OoooooO = intent.getBooleanExtra("UserInfoActivityNew_Go_To_Add_Friend", false);
        }
        if (TextUtils.isEmpty(this.f23476Oooooo0)) {
            this.f23476Oooooo0 = kotlin.collections.unsigned.OooO00o.OooO0O0(p500o0o00Oo0.OooOOO.f41235OooO00o);
        }
        if (!o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, this.f23476Oooooo0) || Oooo00o().f50337OooO0o == null) {
            return;
        }
        Oooo00o().f50337OooO0o.setVisibility(8);
    }

    public final void Oooo0OO() {
        o000O o000o;
        if (this.f23481o00Ooo) {
            return;
        }
        this.f23481o00Ooo = true;
        if (this.f23484o00oO0o && (o000o = this.f23490oo000o) != null) {
            o000o.OooO0O0(this, R.string.loading);
        }
        UserInfoVM userInfoVMOooo0 = Oooo0();
        String str = this.f23476Oooooo0;
        Intrinsics.checkNotNull(str);
        userInfoVMOooo0.loadUserInfo(com.yalla.support.common.util.OooO.OooO0oO(str)).observe(this, new o0o0000.OooOo(new OooO(), new OooOO0(), new OooOO0O(), true));
    }

    public final void Oooo0o() {
        UserInfoModel userInfoModel = this.f23475Oooooo;
        if (userInfoModel != null) {
            OooOooo(userInfoModel.getPurview().getIsVerify(), userInfoModel.getIsBlack(), userInfoModel.getInHeBlack());
        }
    }

    public final void Oooo0o0(String str) {
        UserInfoVM userInfoVMOooo0 = Oooo0();
        UserInfoModel userInfoModel = this.f23475Oooooo;
        Intrinsics.checkNotNull(userInfoModel);
        userInfoVMOooo0.addFriend(userInfoModel.getUserId(), str).observe(this, o000O00O.f42207OooO0OO);
    }

    public final void Oooo0oO() {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        oO00000.OooO00o(this, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.UserInfo_Dialog_Friend_Request), getResources().getString(R.string.import_verifymessage), getString(R.string.iam) + ' ' + p500o0o00Oo0.OooOOO.f41235OooO00o.OooOoO().getValue(), new OooOOO0());
    }

    public final void Oooo0oo() {
        String userHeader;
        UserInfoModel userInfoModel = this.f23475Oooooo;
        if (userInfoModel == null || (userHeader = userInfoModel.getUserHeader()) == null) {
            return;
        }
        String strImgPng = CloudImageUtilKt.imgPng(CloudImageUtilKt.imgFormat(userHeader));
        String userIdx = null;
        UserInfoModel userInfoModel2 = this.f23475Oooooo;
        Intrinsics.checkNotNull(userInfoModel2);
        if (userInfoModel2.getPurview().getIsWaterMark()) {
            UserInfoModel userInfoModel3 = this.f23475Oooooo;
            Intrinsics.checkNotNull(userInfoModel3);
            userIdx = userInfoModel3.getUserIdx();
        }
        ShowImageActivity.OooO00o oooO00o = ShowImageActivity.f22534o00oO0o;
        NetImageView netImageView = Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49988OooOOOO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.head.details.nivUserinfoHead");
        oooO00o.OooO0O0(this, strImgPng, netImageView, userIdx, true);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("userid", this.f23476Oooooo0);
        UserInfoModel userInfoModel = this.f23475Oooooo;
        if (userInfoModel != null) {
            Intrinsics.checkNotNull(userInfoModel);
            intent.putExtra("follow", userInfoModel.getIsFollow());
        }
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f23475Oooooo == null) {
        }
        switch (view.getId()) {
            case R.id.ll_follow /* 2131298396 */:
                UserInfoModel userInfoModel = this.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel);
                if (!userInfoModel.getIsFollow()) {
                    o0O00000.OooO0OO("Me_profile_follow");
                    UserInfoModel userInfoModel2 = this.f23475Oooooo;
                    Intrinsics.checkNotNull(userInfoModel2);
                    if (!userInfoModel2.getIsBlack()) {
                        UserInfoModel userInfoModel3 = this.f23475Oooooo;
                        Intrinsics.checkNotNull(userInfoModel3);
                        if (!userInfoModel3.getInHeBlack()) {
                            Oooo00O(true, null);
                        } else {
                            ToastUtil.f12582OooO00o.OooO0O0(getString(R.string.On_His_Blacklist));
                        }
                    } else {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
                        oo0ooo0.OooOo0(R.string.As_Block_Add_Follow);
                        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                        oo0ooo0.OooOo0o(new o00OOOO0(this));
                        oo0ooo0.OooOOO0();
                    }
                } else {
                    o0O00000.OooO0OO("Me_profile_unfollow");
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
                    showDialog((String) null, o00O0000.OooO0O0(-581127448, true, new o0O0OOO0(this)));
                }
                break;
            case R.id.ll_friend /* 2131298397 */:
                UserInfoModel userInfoModel4 = this.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel4);
                if (!userInfoModel4.getIsFriend()) {
                    o0O00000.OooO0OO("Me_profile_addfriends");
                    Oooo0o();
                } else {
                    o0O00000.OooO0OO("Me_profile_friend");
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
                    String userUrl = p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0oo().getValue();
                    if (userUrl == null) {
                        userUrl = "";
                    }
                    UserInfoModel userInfoModel5 = this.f23475Oooooo;
                    Intrinsics.checkNotNull(userInfoModel5);
                    String friendUrl = userInfoModel5.getUserHeader();
                    o0O00O0o onConfirmClick = new o0O00O0o(this);
                    Intrinsics.checkNotNullParameter(this, "activity");
                    Intrinsics.checkNotNullParameter(userUrl, "userUrl");
                    Intrinsics.checkNotNullParameter(friendUrl, "friendUrl");
                    Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
                    showDialog((String) null, o00O0000.OooO0O0(-1802037086, true, new o00Ooo(onConfirmClick, userUrl, friendUrl)));
                }
                break;
            case R.id.ll_id /* 2131298404 */:
                o0O00000.OooO0OO("Me_profile_id");
                Object systemService = getSystemService("clipboard");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                UserInfoModel userInfoModel6 = this.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel6);
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Yalla", userInfoModel6.getUserIdx()));
                ToastUtil.f12582OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.UserInfo_Clip_cpoied));
                break;
            case R.id.ll_inroom /* 2131298406 */:
                o0O00000.OooO0OO("Me_profile_inRoom");
                UserInfoModel userInfoModel7 = this.f23475Oooooo;
                Intrinsics.checkNotNull(userInfoModel7);
                if (userInfoModel7.getInRoom() != 0) {
                    UserInfoModel userInfoModel8 = this.f23475Oooooo;
                    Intrinsics.checkNotNull(userInfoModel8);
                    if (userInfoModel8.getPurview().getSeeInRoom() == 1) {
                        UserInfoModel userInfoModel9 = this.f23475Oooooo;
                        Intrinsics.checkNotNull(userInfoModel9);
                        if (userInfoModel9.getIsFriend()) {
                            Oooo000();
                        }
                    }
                    UserInfoModel userInfoModel10 = this.f23475Oooooo;
                    Intrinsics.checkNotNull(userInfoModel10);
                    if (userInfoModel10.getPurview().getSeeInRoom() != 2) {
                        UserInfoModel userInfoModel11 = this.f23475Oooooo;
                        Intrinsics.checkNotNull(userInfoModel11);
                        if (userInfoModel11.getPurview().getSeeInRoom() != 0) {
                            ToastUtil.f12582OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.nopower));
                        } else {
                            Oooo000();
                        }
                    } else {
                        UserInfoModel userInfoModel12 = this.f23475Oooooo;
                        Intrinsics.checkNotNull(userInfoModel12);
                        if (!userInfoModel12.getIsFollow()) {
                            UserInfoModel userInfoModel13 = this.f23475Oooooo;
                            Intrinsics.checkNotNull(userInfoModel13);
                            if (!userInfoModel13.getIsFriend()) {
                                ToastUtil.f12582OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.nopower));
                            }
                        }
                        Oooo000();
                    }
                } else {
                    ToastUtil.f12582OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notinroom));
                }
                break;
            case R.id.ll_message /* 2131298414 */:
                o0O00000.OooO0OO("Me_profile_message");
                UserInfoModel userInfoModel14 = this.f23475Oooooo;
                if (userInfoModel14 != null && (lValueOf = Long.valueOf(userInfoModel14.getUserId())) != null) {
                    Intent intent = new Intent(this, (Class<?>) PrivateChatActivity.class);
                    intent.putExtra(o00OOOO0.OooO00o.f31699OooO00o, lValueOf.longValue());
                    startActivity(intent);
                    break;
                }
                break;
            case R.id.niv_userinfo_head /* 2131298665 */:
                if (!o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, this.f23476Oooooo0)) {
                    o0O00000.OooO0OO("Me_profile_photo");
                    Oooo0oo();
                } else {
                    ArrayList<SelectDialogModel<String>> arrayList = this.f23488o0ooOOo;
                    arrayList.clear();
                    SelectDialogModel<String> selectDialogModel = new SelectDialogModel<>();
                    selectDialogModel.setContent(0, getString(R.string.user_info_header_show_header));
                    arrayList.add(selectDialogModel);
                    SelectDialogModel<String> selectDialogModel2 = new SelectDialogModel<>();
                    selectDialogModel2.setContent(1, getString(R.string.user_info_header_change_header));
                    arrayList.add(selectDialogModel2);
                    SelectDialogModel<String> selectDialogModel3 = new SelectDialogModel<>();
                    selectDialogModel3.setContent(3, getString(R.string.user_info_header_url_change_type_default_url));
                    arrayList.add(selectDialogModel3);
                    SelectDialogModel<String> selectDialogModel4 = new SelectDialogModel<>();
                    selectDialogModel4.setContent(2, getString(R.string.user_info_header_select_header_frame));
                    arrayList.add(selectDialogModel4);
                    o00O0 o00o1 = new o00O0(this);
                    o00o1.OooOOO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_info_header_show_header));
                    o00o1.OooOOO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_info_header_change_header));
                    o00o1.OooOOO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_info_header_url_change_type_default_url));
                    o00o1.OooOOO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_info_header_select_header_frame));
                    o00o1.OooOOoo(new o0O00OO(this));
                    o00o1.OooOOO0();
                }
                break;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Oooo00o().f50333OooO00o);
        o0O00000.OooO0OO("Me_profile");
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0o0o.OooO0Oo(window, 0);
        Oooo0O0(getIntent());
        Toolbar toolbar = Oooo00o().f50342OooOO0O;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        oO0o0o.OooO0O0(toolbar, true, 2);
        Toolbar toolbar2 = Oooo00o().f50336OooO0Oo.f49926OooO0o;
        Intrinsics.checkNotNullExpressionValue(toolbar2, "binding.head.toolbarHolder");
        oO0o0o.OooO0O0(toolbar2, true, 2);
        CollapsingToolbarLayout unconsumeWindowInset = Oooo00o().f50336OooO0Oo.f49924OooO0OO;
        Intrinsics.checkNotNullExpressionValue(unconsumeWindowInset, "binding.head.ctl");
        Intrinsics.checkNotNullParameter(unconsumeWindowInset, "$this$unconsumeWindowInset");
        unconsumeWindowInset.setOnApplyWindowInsetsListener(oO0OoOO0.f40686OooO00o);
        Oooo00o().f50336OooO0Oo.f49923OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0oOo00O.o0o0Oo
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                UserInfoActivity this$0 = this.f45352OooO00o;
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Objects.requireNonNull(this$0);
                int iOooO0O0 = OooOo00.OooO0O0(i);
                if (this$0.f23485o00ooo == null) {
                    this$0.f23485o00ooo = new ArgbEvaluator();
                }
                int i2 = iOooO0O0 + Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
                if (i2 > 0) {
                    this$0.Oooo00o().f50342OooOO0O.setBackgroundColor(o000O0O0.OooO00o(R.color.transparent));
                    this$0.Oooo00o().f50346OooOOOO.setTextColor(o000O0O0.OooO00o(R.color.transparent));
                    return;
                }
                float fAbs = Math.abs(i2) / 100.0f;
                if (fAbs > 1.0f) {
                    fAbs = 1.0f;
                }
                ArgbEvaluator argbEvaluator = this$0.f23485o00ooo;
                Intrinsics.checkNotNull(argbEvaluator);
                Object objEvaluate = argbEvaluator.evaluate(fAbs, Integer.valueOf(o000O0O0.OooO00o(R.color.transparent)), Integer.valueOf(o000O0O0.OooO00o(R.color.color_00d8c9)));
                Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                ArgbEvaluator argbEvaluator2 = this$0.f23485o00ooo;
                Intrinsics.checkNotNull(argbEvaluator2);
                Object objEvaluate2 = argbEvaluator2.evaluate(fAbs, Integer.valueOf(o000O0O0.OooO00o(R.color.transparent)), Integer.valueOf(o000O0O0.OooO00o(R.color.color_white)));
                Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) objEvaluate2).intValue();
                this$0.Oooo00o().f50342OooOO0O.setBackgroundColor(iIntValue);
                this$0.Oooo00o().f50346OooOOOO.setTextColor(iIntValue2);
            }
        });
        this.f23474OooooOo = new o00O0O(this, Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49989OooOOOo);
        Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49986OooOOO.setOnClickListener(new o0O0o(this));
        Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49978OooO0Oo.setOnClickListener(new o0(this));
        Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49977OooO0OO.setOnClickListener(new p568o0oOo00O.o0O00000(this));
        Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49976OooO0O0.setOnClickListener(new o0O0000O(this));
        OooOOO(Oooo00o().f50342OooOO0O);
        ActionBar actionBarOooOO0o = OooOO0o();
        Intrinsics.checkNotNull(actionBarOooOO0o);
        actionBarOooOO0o.OooOOO0(false);
        Oooo00o().f50342OooOO0O.setNavigationIcon(R.drawable.btn_return);
        Oooo00o().f50342OooOO0O.setNavigationOnClickListener(new o0O000(this));
        String str = this.f23476Oooooo0;
        p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
        if (o0000O.OooO00o(oooOOO, str)) {
            Oooo00o().f50347OooOOOo.setVisibility(0);
            LinearLayout linearLayout = Oooo00o().f50347OooOOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.userEditContainer");
            p255o00ooO0O.oOO00O.OooO0oO(linearLayout, new o0O00o0(this));
        } else {
            ImageView imageView = Oooo00o().f50338OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivMore");
            p255o00ooO0O.oOO00O.OooO0oO(imageView, new o0oOOo(this));
        }
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o.f48447OooO0OO = "";
        oooO00o.f48445OooO00o = 0;
        oooO00o.OooO0OO(1, o000O0O0.OooO00o(R.color.white));
        oooO00o.OooO0o(Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49988OooOOOO);
        this.f23478Ooooooo = new ArrayList();
        this.f23479o00O0O = UserInfoLeftFragment.newInstantce(this.f23476Oooooo0);
        this.f23480o00Oo0 = UserInfoRightFragment.newInstantce();
        List<Fragment> list = this.f23478Ooooooo;
        if (list != 0) {
            UserInfoLeftFragment userInfoLeftFragment = this.f23479o00O0O;
            Intrinsics.checkNotNull(userInfoLeftFragment);
            list.add(userInfoLeftFragment);
        }
        List<Fragment> list2 = this.f23478Ooooooo;
        if (list2 != 0) {
            UserInfoRightFragment userInfoRightFragment = this.f23480o00Oo0;
            Intrinsics.checkNotNull(userInfoRightFragment);
            list2.add(userInfoRightFragment);
        }
        this.f23486o0OoOo0 = new o0O000O(this, getSupportFragmentManager());
        Oooo00o().f50348OooOOo.setAdapter(this.f23486o0OoOo0);
        ArrayList titleList = new ArrayList();
        titleList.add(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.UserInfo_Track));
        titleList.add(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.UserInfo_Profile));
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o2 = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o2.f33003OooO0Oo = 13.0f;
        oooO00o2.f33005OooO0o0 = 13.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o2.f33002OooO0OO = titleList;
        oooO00o2.f33004OooO0o = o000O0O0.OooO00o(R.color.color_alpha_87);
        oooO00o2.f33006OooO0oO = o000O0O0.OooO00o(R.color.color_alpha_54_A2);
        ViewPagerFixed viewPagerFixed = Oooo00o().f50348OooOOo;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.vpUserinfo");
        oooO00o2.OooO0OO(viewPagerFixed);
        oooO00o2.f33007OooO0oo = 5.0f;
        oooO00o2.f32999OooO = o000O0O0.OooO00o(R.color.color_00d8c9);
        oooO00o2.f33008OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(30.0f);
        oooO00o2.f33009OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3.0f);
        oooO00o2.f33001OooO0O0.setAdjustMode(true);
        YlTableLayout ylTableLayout = Oooo00o().f50336OooO0Oo.f49927OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.head.magicIndicator");
        oooO00o2.OooO00o(ylTableLayout);
        Oooo00o().f50335OooO0OO.f49973OooO0O0.setVisibility(8);
        Oooo00o().f50340OooO0oo.setOnClickListener(this);
        Oooo00o().f50332OooO.setOnClickListener(this);
        Oooo00o().f50341OooOO0.setOnClickListener(this);
        Oooo00o().f50339OooO0oO.setOnClickListener(this);
        Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49988OooOOOO.setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.ll_id)).setOnClickListener(this);
        long j = 0;
        if (o0000O.OooO00o(oooOOO, this.f23476Oooooo0)) {
            o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
            o000OOo o000ooo2 = o00000OO.f32230OooO0OO;
            String str2 = this.f23476Oooooo0;
            Long lValueOf = str2 != null ? Long.valueOf(com.yalla.support.common.util.OooO.OooO0oO(str2)) : null;
            String value = oooOOO.OooOo00().getValue();
            o0O0O0Oo o0o0o0oo = new o0O0O0Oo(this);
            App app = App.f11473OoooO00;
            Map mapOooO00o = com.app.base.Function.OooO0OO.OooO00o();
            mapOooO00o.put(FirebaseMessagingService.EXTRA_TOKEN, value);
            mapOooO00o.put("userid", lValueOf + "");
            p154o00Oo0oO.o0ooOOo o0ooooo2 = p154o00Oo0oO.o0ooOOo.f32239OooO00o;
            o00OO0OO.OooO0OO(null, p154o00Oo0oO.o0ooOOo.f32265OooOoo, "/Webservers/RankingList/UserSupportersRank", mapOooO00o, o0o0o0oo);
            Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49987OooOOO0.setOnClickListener(this);
        } else {
            LinearLayout linearLayout2 = Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49987OooOOO0;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.head.details.llSupport");
            com.yalla.support.common.util.o00O0O.OooO00o(linearLayout2);
            View view = Oooo00o().f50336OooO0Oo.f49925OooO0Oo.f49981OooO0oO;
            Intrinsics.checkNotNullExpressionValue(view, "binding.head.details.headLine");
            com.yalla.support.common.util.o00O0O.OooO(view);
        }
        int i = 3;
        LiveEventBus.get("UserInfoEditChange", Boolean.TYPE).observe(this, new o0000(this, i));
        oooOOO.OooO0oO().observe(this, new o0000oo(this, i));
        oooOOO.OooO0oo().observe(this, new o0000O0(this, i));
        oooOOO.OooOoO().observe(this, new p143o00OOooO.o0000Ooo(this, i));
        oooOOO.OooOOOo().observe(this, new o0000O00(this, 5));
        oooOOO.OooO0O0().observe(this, new p160o00OoOO.o00000OO(this, i));
        LiveEventBus.get("UserHeaderUrl").observe(this, new p044OooooOO.o00O000(this, 6));
        String str3 = this.f23476Oooooo0;
        if (str3 != null) {
            Intrinsics.checkNotNullParameter(str3, "<this>");
            try {
                j = Long.parseLong(str3);
            } catch (NumberFormatException unused) {
            }
            Oooo0().getFriendState(j).observe(this, new p160o00OoOO.o00000O(this, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, p141o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p141o00OOOoO.OooO0OO<?> oooO0OO) {
        UserInfoModel userInfoModel;
        String string;
        super.onEventMainThread(oooO0OO);
        UserInfoModel userInfoModel2 = this.f23475Oooooo;
        if (userInfoModel2 != null) {
            if (com.yalla.support.common.util.OooO0OO.OooO00o(Long.valueOf(userInfoModel2.getUserId()))) {
                return;
            }
            Integer numValueOf = oooO0OO != null ? Integer.valueOf(oooO0OO.f31906OooO00o) : null;
            boolean z = true;
            if (numValueOf != null && numValueOf.intValue() == 533) {
                T t = oooO0OO.f31908OooO0OO;
                if (t == 0 || (string = t.toString()) == null) {
                    return;
                }
                long jOooO0oO = com.yalla.support.common.util.OooO.OooO0oO(string);
                UserInfoModel userInfoModel3 = this.f23475Oooooo;
                if ((userInfoModel3 != null && userInfoModel3.getUserId() == jOooO0oO) && this.f23482o00o0O) {
                    String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Friends_Already);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                        return;
                    } else {
                        o00O000 o00o001 = o00O000.f34368OooO00o;
                        o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        return;
                    }
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 19) {
                T t2 = oooO0OO.f31908OooO0OO;
                Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) t2;
                if (com.yalla.support.common.util.OooO0OO.OooO00o(str) || (userInfoModel = this.f23475Oooooo) == null || !Intrinsics.areEqual(str, String.valueOf(Long.valueOf(userInfoModel.getUserId())))) {
                    return;
                }
                int i = oooO0OO.f31907OooO0O0;
                UserInfoLeftFragment userInfoLeftFragment = this.f23479o00O0O;
                if (userInfoLeftFragment != null) {
                    Intrinsics.checkNotNull(userInfoLeftFragment);
                    userInfoLeftFragment.setIsFollow(i);
                }
                if (isFinishing() && Oooo00o().f50343OooOO0o == null) {
                    return;
                }
                if (i == 1) {
                    o00Oo00.OooO00o(Oooo00o().f50343OooOO0o, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_followed), ViewLocation.top, oo000o.OooO0o0());
                    Oooo00o().f50343OooOO0o.setText(R.string.Following_user);
                } else {
                    o00Oo00.OooO00o(Oooo00o().f50343OooOO0o, com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_profile_follow), ViewLocation.top, oo000o.OooO0o0());
                    Oooo00o().f50343OooOO0o.setText(R.string.Follow);
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Oooo0O0(intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f23482o00o0O = false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f23482o00o0O = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!this.f23483o00oO0O) {
            Oooo0OO();
        }
        this.f23483o00oO0O = false;
    }
}
