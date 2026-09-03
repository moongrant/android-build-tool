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
import androidx.camera.core.impl.o00OOO00;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.user.UserInBarModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import com.yalla.yalla.ui.fragment.UserInfoRightFragment;
import com.yalla.yalla.ui.fragment.o000O00O;
import com.yalla.yalla.ui.view.UserWealthTagView;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import com.yalla.yalla.ui.vm.user.UserInfoVM;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p375o0OOoOO.o00000O0;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o0000OO0;
import p377o0OOoOo.o000O0O0;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oOO00O;
import p496o0o00o.o0O;
import p496o0o00o.o0O00O;
import p496o0o00o.o0O00oO0;
import p496o0o00o.o0O0O0O;
import p496o0o00o.o0O0O0Oo;
import p496o0o00o.o0O0O0o0;
import p496o0o00o.o0O0OO0;
import p496o0o00o.o0O0OOO0;
import p496o0o00o.o0O0OOOo;
import p496o0o00o.o0O0o000;
import p496o0o00o.o0O0o00O;
import p496o0o00o.o0O0oo00;
import p496o0o00o.o0O0oo0o;
import p496o0o00o.o0OO;
import p496o0o00o.o0OO0;
import p496o0o00o.o0OO000o;
import p496o0o00o.o0OO00o0;
import p496o0o00o.o0OO0o00;
import p496o0o00o.o0OO0oO0;
import p496o0o00o.o0OOO0;
import p496o0o00o.o0OOOO00;
import p496o0o00o.o0OOo000;
import p496o0o00o.o0oO0Ooo;
import p496o0o00o.o0oOo0O0;
import p496o0o00o.o0oo0000;
import p496o0o00o.oo0OOoo;
import p496o0o00o.oo0oO0;
import p496o0o00o.oo0ooO;
import p496o0o00o.ooo0Oo0;
import p519o0o0O0oO.O0000000;
import p519o0o0O0oO.o0O000o0;
import p519o0o0O0oO.o0O00O0o;
import p519o0o0O0oO.o0O00o00;
import p553o0oOOoo.o0oO0O0o;
import p567o0oOo0o0.o00000O;
import p576o0oOoOo0.oO000Oo;
import p579o0oOoo.oO00O0oO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.ga;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClick", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1768:1\n22#2,2:1769\n75#3,13:1771\n1#4:1784\n*S KotlinDebug\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity\n*L\n128#1:1769,2\n129#1:1771,13\n*E\n"})
public final class UserInfoActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27240Oooo0o = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f27242OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public oO00O0oO f27243OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public String f27245OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public UserInfoModel f27246OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public oo0ooO f27247OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public ArrayList f27248OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public UserInfoRightFragment f27250OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public UserInfoLeftFragment f27251OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f27252OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f27253OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f27254Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public ArgbEvaluator f27255Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final O0000000 f27256Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f27257Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f27258Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList<SelectDialogModel<String>> f27259Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public oOO00O f27260Oooo0o0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27241OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ga.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27244OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27281OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27281OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final int[] f27249OooOoOO = {oO00OOo0.UserInfo_Track, oO00OOo0.UserInfo_Profile};

    public static final class OooO extends Lambda implements Function1<UserInfoModel, Unit> {
        public OooO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:81:0x03cf  */
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
            String name;
            UserInfoModel userInfoModel2 = userInfoModel;
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            UserInfoActivity.OooOoO0(userInfoActivity, true);
            userInfoActivity.OooOooO().f57993OooO0o.setVisibility(0);
            userInfoActivity.OooOooO().f58005OooOOo0.setVisibility(0);
            userInfoActivity.OooOooO().f57990OooO0O0.setVisibility(0);
            if (userInfoModel2 != null) {
                userInfoActivity.f27246OooOo0o = userInfoModel2;
                MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel = new MomentChangeUserIsInRoomModel();
                long userId = userInfoModel2.getUserId();
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                momentChangeUserIsInRoomModel.setUserId(sb.toString());
                momentChangeUserIsInRoomModel.setInRoom(userInfoModel2.getInRoomId() != 0);
                LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM").post(momentChangeUserIsInRoomModel);
                UserInfoModel userInfoModel3 = userInfoActivity.f27246OooOo0o;
                if (userInfoModel3 != null) {
                    String str = userInfoActivity.f27245OooOo0O;
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    if (o00OOO00.OooO0O0(str)) {
                        userInfoActivity.OooOooO().f57993OooO0o.setVisibility(8);
                    } else {
                        userInfoActivity.OooOooO().f57993OooO0o.setVisibility(0);
                    }
                    String userName = com.code.android.util.OooOo00.OooO00o(userInfoModel3.getUserName()) ? ZegoConstants.ZegoVideoDataAuxPublishingStream : userInfoModel3.getUserName();
                    String memoName = com.code.android.util.OooOo00.OooO0O0(userInfoModel3.getMemoName()) ? userInfoModel3.getMemoName() : userName;
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57697OooOoO0.setText(memoName);
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57697OooOoO0.setFlash(userInfoModel3.getVipLevel() >= VipLevel.Vip4.getValue());
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57672OooO.OooOOOO(userInfoModel3.getVipLevel(), true, userInfoActivity);
                    UserWealthTagView userWealthTagView = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57678OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(userWealthTagView, "binding.head.details.clWealth");
                    UserInfoModel userInfoModel4 = userInfoActivity.f27246OooOo0o;
                    Integer numValueOf = userInfoModel4 != null ? Integer.valueOf(userInfoModel4.getWealthLevel()) : null;
                    UserInfoModel userInfoModel5 = userInfoActivity.f27246OooOo0o;
                    userWealthTagView.OooO0O0(userInfoActivity, numValueOf, userInfoModel5 != null ? userInfoModel5.getWealthBadgeWithBg() : null, 10.0f);
                    if (com.code.android.util.OooOo00.OooO0O0(userInfoModel3.getMemoName())) {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57701OooOooO.setText(o0000.OooO0OO(oO00OOo0.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + userName);
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57701OooOooO.setVisibility(0);
                    } else {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57701OooOooO.setVisibility(8);
                    }
                    userInfoActivity.OooOooO().f58002OooOOOO.setText(memoName);
                    o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(userInfoActivity);
                    oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
                    oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(userInfoModel3.getUserHeader());
                    oooO00o.f43909OooO00o = 0;
                    oooO00o.OooO0O0(2, o0000.OooO00o(oO00O0o.white));
                    oooO00o.OooO0Oo(userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo);
                    oO00O0oO oo00o0oo = userInfoActivity.f27243OooOo0;
                    if (oo00o0oo != null) {
                        oo00o0oo.OooO00o(userInfoModel3.getUserHeaderFrame());
                    }
                    if (com.code.android.util.OooOo00.OooO0O0(userInfoModel3.getBackground())) {
                        o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(userInfoActivity);
                        oooO00o2.f43911OooO0OO = userInfoModel3.getBackground();
                        oooO00o2.f43909OooO00o = 0;
                        oooO00o2.f43923OooOOOo = oOo00OO0.icon_userinfo_header_bg;
                        oooO00o2.OooO0Oo(userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO);
                    } else {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO.setBackground(o0000.OooO0O0(oOo00OO0.icon_userinfo_header_bg));
                    }
                    if (userInfoModel3.isOfficialRole()) {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57682OooOO0O.setVisibility(0);
                    } else {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57682OooOO0O.setVisibility(8);
                    }
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57685OooOOO0.OooO0Oo(userInfoModel3.getPremiumLevel(), userInfoModel3.isPremium());
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57681OooOO0.setUserPrettyId(userInfoModel3.getIdLevel());
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57700OooOoo0.setText("ID:" + userInfoModel3.getUserIdx());
                    int sex = userInfoModel3.getSex();
                    if (sex == 0) {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setVisibility(0);
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setImageResource(oOo00OO0.me_top_icon_female);
                    } else if (sex != 1) {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setVisibility(8);
                    } else {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setVisibility(0);
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setImageResource(oOo00OO0.me_top_icon_male);
                    }
                    TextView textView = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57699OooOoo;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    textView.setText(OooO0O0.OooO0O0.OooO00o(new Object[]{Integer.valueOf(userInfoModel3.getUserLevel())}, 1, "LV.%s", "format(format, *args)") + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    TextView textView2 = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57696OooOoO;
                    int age = userInfoModel3.getAge();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(age);
                    textView2.setText(sb2.toString());
                    try {
                        new SimpleDateFormat("yyyy-MM-dd").parse(userInfoModel3.getBirthday());
                    } catch (Exception unused) {
                        Calendar.getInstance().getTime();
                    }
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57692OooOo0.setVisibility(8);
                    if (com.code.android.util.OooOo00.OooO0O0(Integer.valueOf(userInfoModel3.getCountryId())) && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(Integer.valueOf(userInfoModel3.getCountryId()))) {
                        HashMap<String, CountryModel> map = com.yalla.yalla.app.golbalData.OooO00o.f22727OooO00o;
                        int countryId = userInfoModel3.getCountryId();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(countryId);
                        String id = sb3.toString();
                        Intrinsics.checkNotNullParameter(id, "id");
                        CountryModel countryModelOooO00o = com.yalla.yalla.app.golbalData.OooO00o.OooO00o(id);
                        if (countryModelOooO00o == null) {
                            name = "";
                        } else {
                            name = countryModelOooO00o.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "countryModel.name");
                        }
                        if (!TextUtils.isEmpty(name)) {
                            userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57692OooOo0.setText(name);
                            userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57692OooOo0.setVisibility(0);
                        }
                    }
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57702OooOooo.setText(p590o0oo0.OooOOOO.OooO0o(userInfoModel3.getVisitorNum(), false));
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57691OooOo.setText(p590o0oo0.OooOOOO.OooO0o(userInfoModel3.getFollowedNum(), false));
                    userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57694OooOo0O.setText(p590o0oo0.OooOOOO.OooO0o(userInfoModel3.getFansNum(), false));
                    if (userInfoModel3.getBio() == null) {
                        userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57698OooOoOO.setText(oO00OOo0.Userinfo_Sign_Hint);
                    } else {
                        String bio = userInfoModel3.getBio();
                        if (com.code.android.util.OooOo00.OooO0O0(bio != null ? StringsKt.trim((CharSequence) bio).toString() : null)) {
                            userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57698OooOoOO.setText(userInfoModel3.getBio());
                        } else {
                            userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57698OooOoOO.setText(oO00OOo0.Userinfo_Sign_Hint);
                        }
                    }
                    String str2 = userInfoActivity.f27245OooOo0O;
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    if (o00OOO00.OooO0O0(str2) && userInfoActivity.f27245OooOo0O != null) {
                        userInfoActivity.OooOooo().getNewFans().observe(userInfoActivity, new OooOOO0(new o0OO00o0(userInfoActivity)));
                    }
                    if (o00OOO00.OooO0O0(userInfoActivity.f27245OooOo0O)) {
                        userInfoActivity.OooOooo().getNewVisitor().observe(userInfoActivity, new OooOOO0(new o0OO0(userInfoActivity)));
                    }
                }
                UserInfoLeftFragment userInfoLeftFragment = userInfoActivity.f27251OooOoo0;
                if (userInfoLeftFragment != null) {
                    userInfoLeftFragment.updateInfo(userInfoActivity.f27246OooOo0o);
                }
                UserInfoRightFragment userInfoRightFragment = userInfoActivity.f27250OooOoo;
                if (userInfoRightFragment != null) {
                    userInfoRightFragment.updataInfo(userInfoActivity.f27246OooOo0o);
                }
                UserInfoModel userInfoModel6 = userInfoActivity.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel6);
                if (userInfoModel6.getInHeBlack()) {
                    userInfoActivity.OooOooO().f57988OooO.setVisibility(8);
                } else if (userInfoModel6.getPurview().getSeeInRoom() == 1 && userInfoModel6.getIsFriend()) {
                    userInfoActivity.OooOooO().f57988OooO.setVisibility(0);
                } else if (userInfoModel6.getPurview().getSeeInRoom() == 2) {
                    if (userInfoModel6.getIsFollow() || userInfoModel6.getIsFriend()) {
                        userInfoActivity.OooOooO().f57988OooO.setVisibility(0);
                    }
                } else if (userInfoModel6.getPurview().getSeeInRoom() == 0) {
                    userInfoActivity.OooOooO().f57988OooO.setVisibility(0);
                } else {
                    userInfoActivity.OooOooO().f57988OooO.setVisibility(8);
                }
                if (userInfoModel6.getInRoomId() == 0) {
                    oO000Oo.OooO00o(userInfoActivity.OooOooO().f58000OooOOO, o0000.OooO0O0(oOo00OO0.icon_profile_inroom_false), ViewLocation.top, p591o0oo000O.OooO.OooO0o0());
                } else {
                    oO000Oo.OooO00o(userInfoActivity.OooOooO().f58000OooOOO, o0000.OooO0O0(oOo00OO0.icon_profile_inroom), ViewLocation.top, p591o0oo000O.OooO.OooO0o0());
                }
                UserInfoLeftFragment userInfoLeftFragment2 = userInfoActivity.f27251OooOoo0;
                if (userInfoLeftFragment2 != null) {
                    Intrinsics.checkNotNull(userInfoLeftFragment2);
                    userInfoLeftFragment2.setIsFollow(userInfoModel6.getIsFollow() ? 1 : 0);
                }
                if (userInfoModel6.getIsFollow()) {
                    oO000Oo.OooO00o(userInfoActivity.OooOooO().f57999OooOO0o, o0000.OooO0O0(oOo00OO0.icon_profile_followed), ViewLocation.top, p591o0oo000O.OooO.OooO0o0());
                    userInfoActivity.OooOooO().f57999OooOO0o.setText(oO00OOo0.Following_user);
                } else {
                    oO000Oo.OooO00o(userInfoActivity.OooOooO().f57999OooOO0o, o0000.OooO0O0(oOo00OO0.icon_profile_follow), ViewLocation.top, p591o0oo000O.OooO.OooO0o0());
                    userInfoActivity.OooOooO().f57999OooOO0o.setText(oO00OOo0.Follow);
                }
                if (userInfoActivity.f27242OooOo) {
                    userInfoActivity.getIntent().putExtra("UserInfoActivityNew_Go_To_Add_Friend", false);
                    userInfoActivity.f27242OooOo = false;
                    userInfoActivity.OooOoO(userInfoModel6.getPurview().getIsVerify(), userInfoModel6.getIsBlack(), userInfoModel6.getInHeBlack());
                }
                UserInfoModel userInfoModel7 = userInfoActivity.f27246OooOo0o;
                if (Intrinsics.areEqual(userInfoModel7 != null ? Boolean.valueOf(userInfoModel7.getIsShowMomentPostDialog()) : null, Boolean.TRUE)) {
                    userInfoActivity.OooOooo().closeMark().observe(userInfoActivity, new o0000OO0(null, null, o0OO.f49089OooO0Oo, false, 11));
                    o0OO00O o0oo00o2 = new o0OO00O(userInfoActivity);
                    o0oo00o2.OooOoO0(oO00OOo0.user_info_first_post_title);
                    o0oo00o2.OooOOoo(oO00OOo0.user_info_first_post_content);
                    o0oo00o2.OooOo0O(new o0OOO0(userInfoActivity));
                    o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.user_info_first_post_post));
                    o0oo00o2.OooOo0(new o0OOOO00(userInfoActivity));
                    o0oo00o2.OooO0o(false);
                    o0oo00o2.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.user.UserInfoActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0328OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ boolean f27262OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Activity f27263OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f27264OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ String f27265OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ boolean f27266OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ boolean f27267OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0328OooO00o(Activity activity, String str, boolean z, boolean z2, boolean z3, boolean z4) {
                super(0);
                this.f27263OooO0Oo = activity;
                this.f27265OooO0o0 = str;
                this.f27264OooO0o = z;
                this.f27266OooO0oO = z2;
                this.f27267OooO0oo = z3;
                this.f27262OooO = z4;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Activity activity = this.f27263OooO0Oo;
                Intent intent = new Intent(activity, (Class<?>) UserInfoActivity.class);
                intent.putExtra("Id", this.f27265OooO0o0);
                intent.putExtra("UserInfoActivityNew_Go_To_Add_Friend", this.f27264OooO0o);
                intent.putExtra("UserInfoActivityNew_FROM_ROOM_KEY", this.f27266OooO0oO);
                intent.putExtra("UserInfoActivityNew_FROM_PRIVATE_CHAT", this.f27267OooO0oo);
                intent.putExtra("UserInfoActivityNew_From_Room_Page", this.f27262OooO);
                activity.startActivityForResult(intent, 1022);
                return Unit.INSTANCE;
            }
        }

        public static void OooO0O0(@Nullable Activity activity, @Nullable String str, boolean z, boolean z2, boolean z3, boolean z4) {
            if (activity != null) {
                C0328OooO00o onLogin = new C0328OooO00o(activity, str, z, z2, z3, z4);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
        }

        public static void OooO0OO(OooO00o oooO00o, Activity activity, String str, boolean z, int i) {
            if ((i & 8) != 0) {
                z = false;
            }
            oooO00o.getClass();
            OooO0O0(activity, str, false, false, false, z);
        }

        @JvmOverloads
        public final void OooO00o(@Nullable Activity activity, @Nullable String str) {
            OooO0OO(this, activity, str, false, 12);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27269OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(0);
            this.f27269OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            UserInfoActivity.OooOo(userInfoActivity, false);
            if (this.f27269OooO0o0) {
                userInfoActivity.Oooo0();
            } else {
                userInfoActivity.Oooo00o(o0000.OooO0OO(oO00OOo0.addbuddy));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO0OO() {
            super(UserInfoActivity.this);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            UserInBarModel userInBarModel = (UserInBarModel) p579o0oOoo.oOo00OO0.OooO00o(response, UserInBarModel.class);
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            if (userInfoActivity.isFinishing() || userInBarModel == null || userInBarModel.data == null) {
                return;
            }
            boolean z = true;
            if (userInBarModel.isinbar) {
                RoomModel roomModel = new RoomModel();
                roomModel.setRoomIp(userInBarModel.data.roomserverip);
                UserInBarModel.DataBean dataBean = userInBarModel.data;
                roomModel.websocketaddr = dataBean.websocketaddr;
                roomModel.setId(p590o0oo0.OooOOOO.OooOO0o(dataBean.barid));
                roomModel.setName(userInBarModel.data.barname);
                roomModel.setLevel(userInBarModel.data.barlevel);
                if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                    MutableState mutableState = o0OOO0o.f45698OooO00o;
                    o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Protile_lnRoom);
                    return;
                }
                return;
            }
            UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
            if (userInfoModel != null) {
                userInfoModel.setInRoomId(0L);
            }
            oO000Oo.OooO00o(userInfoActivity.OooOooO().f58000OooOOO, o0000.OooO0O0(oOo00OO0.icon_profile_inroom_false), ViewLocation.top, p591o0oo000O.OooO.OooO0o0());
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.notinroom);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {
        public OooO0o() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0058  */
        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0078  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Pair pair;
            int iIntValue;
            if (bool.booleanValue()) {
                UserInfoActivity userInfoActivity = UserInfoActivity.this;
                boolean z = false;
                if (userInfoActivity.f27258Oooo0O0 == 0) {
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Pair pair2 = (Pair) o000000O.OooOO0().getValue();
                    if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) {
                        pair = (Pair) o000000O.OooOO0().getValue();
                        if (pair != null) {
                            iIntValue = ((Number) pair.getSecond()).intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue >= VipLevel.Vip3.getValue()) {
                            z = true;
                        }
                    } else {
                        Pair pair3 = (Pair) o000000O.OooOO0().getValue();
                        if (pair3 != null && ((Number) pair3.getFirst()).intValue() == VipState.VipHide.getValue()) {
                            pair = (Pair) o000000O.OooOO0().getValue();
                            if (pair != null) {
                                iIntValue = ((Number) pair.getSecond()).intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue >= VipLevel.Vip3.getValue()) {
                                z = true;
                            }
                        }
                    }
                }
                o00O0OO.OooO0o.OooO0OO(userInfoActivity, 1.0f, 1.0f, z, false, new com.yalla.yalla.ui.activity.user.OooOOOO(userInfoActivity));
                userInfoActivity.f27254Oooo0 = true;
            }
            return Unit.INSTANCE;
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
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            UserInfoActivity.OooOoO0(userInfoActivity, false);
            int code = error.getCode();
            boolean z = true;
            if (code == 1 || code == 2) {
                if (userInfoActivity.f27257Oooo00o && !userInfoActivity.isFinishing() && !userInfoActivity.isDestroyed()) {
                    o0OO00O o0oo00o2 = new o0OO00O(userInfoActivity);
                    o0oo00o2.OooOOoo(oO00OOo0.Network_request_failed);
                    o0oo00o2.OooOO0(new OooOo00(userInfoActivity));
                    o0oo00o2.OooO(new OooOo(userInfoActivity));
                    o0oo00o2.OooOO0o();
                }
            } else if (code == 1057 || code == 1058) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.activity_delete_account);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
                userInfoActivity.OooOooO().f57990OooO0O0.setVisibility(8);
                userInfoActivity.OooOooO().f57991OooO0OO.f57671OooO0O0.setVisibility(0);
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
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
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            userInfoActivity.invalidateOptionsMenu();
            userInfoActivity.f27257Oooo00o = false;
            userInfoActivity.f27252OooOooO = false;
            O0000000 o0000000 = userInfoActivity.f27256Oooo00O;
            if (o0000000 != null) {
                o0000000.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f27274OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null && num2.intValue() == 1) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.send_successfully);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else if (num2 != null && num2.intValue() == 2) {
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Added_successfully);
                if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                    o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27275OooO0Oo;

        public OooOOO0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27275OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27275OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27275OooO0Oo;
        }

        public final int hashCode() {
            return this.f27275OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27275OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<String, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            UserInfoActivity.this.Oooo00o(it);
            return Unit.INSTANCE;
        }
    }

    public UserInfoActivity() {
        o0O00O0o.OooO00o().getClass();
        this.f27256Oooo00O = new O0000000();
        this.f27257Oooo00o = true;
        this.f27259Oooo0OO = new ArrayList<>();
    }

    public static final void OooOo(UserInfoActivity userInfoActivity, boolean z) {
        UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
        if (userInfoModel != null) {
            long userId = userInfoModel.getUserId();
            userInfoActivity.OooOooo().blockUser(userId, z).observe(userInfoActivity, new OooOOO0(new ooo0Oo0(userInfoActivity, z, userId)));
        }
    }

    public static final void OooOoO0(UserInfoActivity userInfoActivity, boolean z) {
        if (z) {
            String str = userInfoActivity.f27245OooOo0O;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (!o00OOO00.OooO0O0(str)) {
                userInfoActivity.OooOooO().f57994OooO0o0.setVisibility(0);
                return;
            }
        }
        userInfoActivity.OooOooO().f57994OooO0o0.setVisibility(8);
    }

    public final void OooOoO(boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z3) {
            String string = getString(oO00OOo0.On_His_Blacklist);
            if (string != null && !StringsKt.isBlank(string)) {
                z4 = false;
            }
            if (z4) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (!z2) {
            if (z) {
                Oooo0();
                return;
            } else {
                Oooo00o(o0000.OooO0OO(oO00OOo0.addbuddy));
                return;
            }
        }
        o0OO00O o0oo00o2 = new o0OO00O(this);
        o0oo00o2.OooOOoo(oO00OOo0.As_Block_Add_Friends);
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new OooO0O0(z));
        o0oo00o2.OooOO0o();
    }

    public final void OooOoOO() {
        UserInfoModel userInfoModel = this.f27246OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        String strValueOf = String.valueOf(userInfoModel.getUserId());
        OooO0OO oooO0OO = new OooO0OO();
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("touserid", strValueOf);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44131Oooooo0, linkedHashMapOooO00o, oooO0OO);
    }

    public final void OooOoo(boolean z, @Nullable o000O00O o000o00o2) {
        OooOooO().f57995OooO0oO.setClickable(false);
        UserInfoModel userInfoModel = this.f27246OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        String strValueOf = String.valueOf(userInfoModel.getUserId());
        String str = z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1";
        o0oO0Ooo o0oo0ooo2 = new o0oO0Ooo(this, o000o00o2, z);
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("fuserid", strValueOf);
        linkedHashMapOooO00o.put("type", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44173o00Ooo, linkedHashMapOooO00o, o0oo0ooo2);
    }

    public final void OooOoo0(int i) {
        this.f27258Oooo0O0 = i;
        com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32883OooO0o, null, new OooO0o());
    }

    public final ga OooOooO() {
        return (ga) this.f27241OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final UserInfoVM OooOooo() {
        return (UserInfoVM) this.f27244OooOo00.getValue();
    }

    public final void Oooo0() {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.UserInfo_Dialog_Friend_Request);
        String string = getResources().getString(oO00OOo0.import_verifymessage);
        String string2 = getString(oO00OOo0.iam);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0O00o00.OooO00o(this, strOooO0OO, string, string2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000000O.OooOOoo().getValue(), new OooOOOO());
    }

    public final void Oooo000(Intent intent) {
        if (intent != null) {
            this.f27245OooOo0O = intent.getStringExtra("Id");
            this.f27242OooOo = intent.getBooleanExtra("UserInfoActivityNew_Go_To_Add_Friend", false);
        }
        if (TextUtils.isEmpty(this.f27245OooOo0O)) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            this.f27245OooOo0O = androidx.compose.runtime.Oooo0.OooO00o();
        }
        String str = this.f27245OooOo0O;
        o000000O o000000o3 = o000000O.f46674OooO00o;
        if (!o00OOO00.OooO0O0(str) || OooOooO().f57993OooO0o == null) {
            return;
        }
        OooOooO().f57993OooO0o.setVisibility(8);
    }

    public final void Oooo00O() {
        O0000000 o0000000;
        if (this.f27252OooOooO) {
            return;
        }
        this.f27252OooOooO = true;
        if (this.f27257Oooo00o && (o0000000 = this.f27256Oooo00O) != null) {
            o0000000.OooO0O0(oO00OOo0.loading, this);
        }
        UserInfoVM userInfoVMOooOooo = OooOooo();
        String str = this.f27245OooOo0O;
        Intrinsics.checkNotNull(str);
        userInfoVMOooOooo.loadUserInfo(com.code.android.util.o0OoOo0.OooO(0L, str)).observe(this, new o0000OO0(new OooO(), new OooOO0(), new OooOO0O(), true));
    }

    public final void Oooo00o(String str) {
        UserInfoVM userInfoVMOooOooo = OooOooo();
        UserInfoModel userInfoModel = this.f27246OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        userInfoVMOooOooo.addFriend(userInfoModel.getUserId(), str).observe(this, new OooOOO0(OooOOO.f27274OooO0Oo));
    }

    public final void Oooo0O0() {
        String userHeader;
        String userIdx;
        UserInfoModel userInfoModel = this.f27246OooOo0o;
        if (userInfoModel == null || (userHeader = userInfoModel.getUserHeader()) == null) {
            return;
        }
        String strOooO0o0 = p139o00OOooO.OooO0o.OooO0o0(p139o00OOooO.OooO0o.OooO0Oo(userHeader));
        UserInfoModel userInfoModel2 = this.f27246OooOo0o;
        Intrinsics.checkNotNull(userInfoModel2);
        if (userInfoModel2.getPurview().getIsWaterMark()) {
            UserInfoModel userInfoModel3 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel3);
            userIdx = userInfoModel3.getUserIdx();
        } else {
            userIdx = null;
        }
        NetImageView netImageView = OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.head.details.nivUserinfoHead");
        ShowImageActivity.OooO00o.OooO00o(this, strOooO0o0, netImageView, userIdx, true);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("userid", this.f27245OooOo0O);
        UserInfoModel userInfoModel = this.f27246OooOo0o;
        if (userInfoModel != null) {
            Intrinsics.checkNotNull(userInfoModel);
            intent.putExtra("follow", userInfoModel.getIsFollow());
        }
        setResult(-1, intent);
        super.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f27246OooOo0o == null) {
            return;
        }
        int id = view.getId();
        boolean z = true;
        if (id == p584o0oOooO0.oO00O0oO.ll_friend) {
            UserInfoModel userInfoModel = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel);
            if (!userInfoModel.getIsFriend()) {
                o0OO000.OooO00o("105080");
                UserInfoModel userInfoModel2 = this.f27246OooOo0o;
                if (userInfoModel2 != null) {
                    OooOoO(userInfoModel2.getPurview().getIsVerify(), userInfoModel2.getIsBlack(), userInfoModel2.getInHeBlack());
                    return;
                }
                return;
            }
            o0OO000.OooO00o("105081");
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String userUrl = (String) o000000O.OooO().getValue();
            if (userUrl == null) {
                userUrl = "";
            }
            UserInfoModel userInfoModel3 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel3);
            String friendUrl = userInfoModel3.getUserHeader();
            o0OO0o00 onConfirmClick = new o0OO0o00(this);
            Intrinsics.checkNotNullParameter(this, "activity");
            Intrinsics.checkNotNullParameter(userUrl, "userUrl");
            Intrinsics.checkNotNullParameter(friendUrl, "friendUrl");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-219877355, true, new o0O000o0(onConfirmClick, userUrl, friendUrl)));
            return;
        }
        if (id == p584o0oOooO0.oO00O0oO.ll_inroom) {
            o0OO000.OooO00o("105082");
            UserInfoModel userInfoModel4 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel4);
            if (userInfoModel4.getInRoomId() == 0) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.notinroom);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            UserInfoModel userInfoModel5 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel5);
            if (userInfoModel5.getPurview().getSeeInRoom() == 1) {
                UserInfoModel userInfoModel6 = this.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel6);
                if (userInfoModel6.getIsFriend()) {
                    OooOoOO();
                    return;
                }
            }
            UserInfoModel userInfoModel7 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel7);
            if (userInfoModel7.getPurview().getSeeInRoom() != 2) {
                UserInfoModel userInfoModel8 = this.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel8);
                if (userInfoModel8.getPurview().getSeeInRoom() == 0) {
                    OooOoOO();
                    return;
                }
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.nopower);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    return;
                }
            }
            UserInfoModel userInfoModel9 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel9);
            if (!userInfoModel9.getIsFollow()) {
                UserInfoModel userInfoModel10 = this.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel10);
                if (!userInfoModel10.getIsFriend()) {
                    String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.nopower);
                    if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o3.run();
                        return;
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                        return;
                    }
                }
            }
            OooOoOO();
            return;
        }
        if (id == p584o0oOooO0.oO00O0oO.ll_message) {
            o0OO000.OooO00o("105083");
            UserInfoModel userInfoModel11 = this.f27246OooOo0o;
            if (userInfoModel11 == null || (lValueOf = Long.valueOf(userInfoModel11.getUserId())) == null) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) PrivateChatActivity.class);
            intent.putExtra(o00000O.f56211OooO00o, lValueOf.longValue());
            startActivity(intent);
            return;
        }
        if (id == p584o0oOooO0.oO00O0oO.ll_follow) {
            UserInfoModel userInfoModel12 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel12);
            if (userInfoModel12.getIsFollow()) {
                o0OO000.OooO00o("105085");
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
                showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-581127448, true, new o0oo0000(this)));
                return;
            }
            o0OO000.OooO00o("105084");
            UserInfoModel userInfoModel13 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel13);
            if (userInfoModel13.getIsBlack()) {
                o0OO00O o0oo00o2 = new o0OO00O(this);
                o0oo00o2.OooOOoo(oO00OOo0.As_Block_Add_Follow);
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOo0(new o0O00O(this));
                o0oo00o2.OooOO0o();
                return;
            }
            UserInfoModel userInfoModel14 = this.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel14);
            if (!userInfoModel14.getInHeBlack()) {
                OooOoo(true, null);
                return;
            }
            String string = getString(oO00OOo0.On_His_Blacklist);
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o4 = o000O00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o4.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o4);
                return;
            }
        }
        if (id != p584o0oOooO0.oO00O0oO.niv_userinfo_head) {
            if (id == p584o0oOooO0.oO00O0oO.ll_id) {
                o0OO000.OooO00o("105069");
                Object systemService = getSystemService("clipboard");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                UserInfoModel userInfoModel15 = this.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel15);
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Yalla", userInfoModel15.getUserIdx()));
                String strOooO0OO4 = o0000.OooO0OO(oO00OOo0.UserInfo_Clip_cpoied);
                if (strOooO0OO4 != null && !StringsKt.isBlank(strOooO0OO4)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o5 = o000O00.OooO00o(strOooO0OO4, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o5.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o5);
                    return;
                }
            }
            return;
        }
        String str = this.f27245OooOo0O;
        o000000O o000000o3 = o000000O.f46674OooO00o;
        if (!o00OOO00.OooO0O0(str)) {
            o0OO000.OooO00o("105099");
            Oooo0O0();
            return;
        }
        o0OO000.OooO00o("105100");
        ArrayList<SelectDialogModel<String>> arrayList = this.f27259Oooo0OO;
        arrayList.clear();
        SelectDialogModel<String> selectDialogModel = new SelectDialogModel<>();
        int i = oO00OOo0.user_info_header_show_header;
        selectDialogModel.setContent(0, getString(i));
        arrayList.add(selectDialogModel);
        SelectDialogModel<String> selectDialogModel2 = new SelectDialogModel<>();
        int i2 = oO00OOo0.user_info_header_change_header;
        selectDialogModel2.setContent(1, getString(i2));
        arrayList.add(selectDialogModel2);
        SelectDialogModel<String> selectDialogModel3 = new SelectDialogModel<>();
        int i3 = oO00OOo0.user_info_header_url_change_type_default_url;
        selectDialogModel3.setContent(3, getString(i3));
        arrayList.add(selectDialogModel3);
        SelectDialogModel<String> selectDialogModel4 = new SelectDialogModel<>();
        int i4 = oO00OOo0.user_info_header_select_header_frame;
        selectDialogModel4.setContent(2, getString(i4));
        arrayList.add(selectDialogModel4);
        p157o00OoOO0.o00O0O o00o0o2 = new p157o00OoOO0.o00O0O(this, null);
        o00o0o2.OooOOO0(o0000.OooO0OO(i));
        o00o0o2.OooOOO0(o0000.OooO0OO(i2));
        o00o0o2.OooOOO0(o0000.OooO0OO(i3));
        o00o0o2.OooOOO0(o0000.OooO0OO(i4));
        o00o0o2.OooOOo0(new o0OO0oO0(this));
        o00o0o2.OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f57989OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        Oooo000(getIntent());
        Toolbar toolbar = OooOooO().f57998OooOO0O;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        p370o0OOoO.OooOOO0.OooO00o(toolbar, true, 2);
        Toolbar toolbar2 = OooOooO().f57992OooO0Oo.f57612OooO0o;
        Intrinsics.checkNotNullExpressionValue(toolbar2, "binding.head.toolbarHolder");
        p370o0OOoO.OooOOO0.OooO00o(toolbar2, true, 2);
        CollapsingToolbarLayout unconsumeWindowInset = OooOooO().f57992OooO0Oo.f57610OooO0OO;
        Intrinsics.checkNotNullExpressionValue(unconsumeWindowInset, "binding.head.ctl");
        Intrinsics.checkNotNullParameter(unconsumeWindowInset, "$this$unconsumeWindowInset");
        unconsumeWindowInset.setOnApplyWindowInsetsListener(p370o0OOoO.OooOOO.f44034OooO00o);
        OooOooO().f57992OooO0Oo.f57609OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o00o.o0O00O0o
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
                UserInfoActivity this$0 = this.f49065OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                int iOooO0O0 = o0000O0.OooO0O0(i);
                if (this$0.f27255Oooo000 == null) {
                    this$0.f27255Oooo000 = new ArgbEvaluator();
                }
                int i2 = iOooO0O0 + Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
                if (i2 > 0) {
                    Toolbar toolbar3 = this$0.OooOooO().f57998OooOO0O;
                    int i3 = oO00O0o.transparent;
                    toolbar3.setBackgroundColor(o0000.OooO00o(i3));
                    this$0.OooOooO().f58002OooOOOO.setTextColor(o0000.OooO00o(i3));
                    return;
                }
                float fAbs = Math.abs(i2) / 100.0f;
                if (fAbs > 1.0f) {
                    fAbs = 1.0f;
                }
                ArgbEvaluator argbEvaluator = this$0.f27255Oooo000;
                Intrinsics.checkNotNull(argbEvaluator);
                int i4 = oO00O0o.transparent;
                Object objEvaluate = argbEvaluator.evaluate(fAbs, Integer.valueOf(o0000.OooO00o(i4)), Integer.valueOf(o0000.OooO00o(oO00O0o.color_00d8c9)));
                Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                ArgbEvaluator argbEvaluator2 = this$0.f27255Oooo000;
                Intrinsics.checkNotNull(argbEvaluator2);
                Object objEvaluate2 = argbEvaluator2.evaluate(fAbs, Integer.valueOf(o0000.OooO00o(i4)), Integer.valueOf(o0000.OooO00o(oO00O0o.color_white)));
                Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) objEvaluate2).intValue();
                this$0.OooOooO().f57998OooOO0O.setBackgroundColor(iIntValue);
                this$0.OooOooO().f58002OooOOOO.setTextColor(iIntValue2);
            }
        });
        this.f27243OooOo0 = new oO00O0oO(this, OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57689OooOOo0);
        OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO.setOnClickListener(new o0O0oo00(this));
        OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57676OooO0Oo.setOnClickListener(new o0O(this));
        OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57675OooO0OO.setOnClickListener(new p496o0o00o.o0OO000(this));
        OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57674OooO0O0.setOnClickListener(new o0OO000o(this));
        OooOO0o().OooOoO(OooOooO().f57998OooOO0O);
        ActionBar actionBarOooOO0 = OooOO0o().OooOO0();
        Intrinsics.checkNotNull(actionBarOooOO0);
        actionBarOooOO0.OooOOO0(false);
        OooOooO().f57998OooOO0O.setNavigationIcon(oOo00OO0.btn_return);
        OooOooO().f57998OooOO0O.setNavigationOnClickListener(new oo0oO0(this));
        String str = this.f27245OooOo0O;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(str)) {
            OooOooO().f58003OooOOOo.setVisibility(0);
            LinearLayout linearLayout = OooOooO().f58003OooOOOo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.userEditContainer");
            o000OO00.OooO(linearLayout, new o0O0o00O(this));
        } else {
            ImageView imageView = OooOooO().f57994OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivMore");
            o000OO00.OooO(imageView, new o0oOo0O0(this));
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
        oooO00o.f43911OooO0OO = "";
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0O0(1, o0000.OooO00o(oO00O0o.white));
        oooO00o.OooO0Oo(OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo);
        this.f27248OooOoO0 = new ArrayList();
        this.f27251OooOoo0 = UserInfoLeftFragment.newInstantce(this.f27245OooOo0O);
        this.f27250OooOoo = UserInfoRightFragment.newInstantce();
        ArrayList arrayList = this.f27248OooOoO0;
        if (arrayList != null) {
            UserInfoLeftFragment userInfoLeftFragment = this.f27251OooOoo0;
            Intrinsics.checkNotNull(userInfoLeftFragment);
            arrayList.add(userInfoLeftFragment);
        }
        ArrayList arrayList2 = this.f27248OooOoO0;
        if (arrayList2 != null) {
            UserInfoRightFragment userInfoRightFragment = this.f27250OooOoo;
            Intrinsics.checkNotNull(userInfoRightFragment);
            arrayList2.add(userInfoRightFragment);
        }
        this.f27247OooOoO = new oo0ooO(this, getSupportFragmentManager());
        OooOooO().f58004OooOOo.setAdapter(this.f27247OooOoO);
        ArrayList titleList = new ArrayList();
        titleList.add(o0000.OooO0OO(oO00OOo0.UserInfo_Track));
        titleList.add(o0000.OooO0OO(oO00OOo0.UserInfo_Profile));
        Intrinsics.checkNotNullParameter(this, "context");
        o0oO0O0o.OooO00o oooO00o2 = new o0oO0O0o.OooO00o(this);
        oooO00o2.f56019OooO0OO = 13.0f;
        oooO00o2.f56020OooO0Oo = 13.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o2.f56018OooO0O0 = titleList;
        oooO00o2.f56022OooO0o0 = o0000.OooO00o(oO00O0o.color_alpha_87);
        oooO00o2.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_alpha_54_A2);
        ViewPagerFixed viewPagerFixed = OooOooO().f58004OooOOo;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.vpUserinfo");
        oooO00o2.OooO0Oo(viewPagerFixed);
        oooO00o2.f56016OooO = 5.0f;
        oooO00o2.f56025OooOO0 = o0000.OooO00o(oO00O0o.color_00d8c9);
        oooO00o2.f56026OooOO0O = o0000O0.OooO00o(30);
        oooO00o2.f56027OooOO0o = o0000O0.OooO00o(3);
        oooO00o2.f56017OooO00o.setAdjustMode(true);
        YlTableLayout ylTableLayout = OooOooO().f57992OooO0Oo.f57613OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.head.magicIndicator");
        oooO00o2.OooO00o(ylTableLayout);
        OooOooO().f57991OooO0OO.f57671OooO0O0.setVisibility(8);
        OooOooO().f57996OooO0oo.setOnClickListener(this);
        OooOooO().f57988OooO.setOnClickListener(this);
        OooOooO().f57997OooOO0.setOnClickListener(this);
        OooOooO().f57995OooO0oO.setOnClickListener(this);
        OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo.setOnClickListener(this);
        ((LinearLayout) findViewById(p584o0oOooO0.oO00O0oO.ll_id)).setOnClickListener(this);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-450448260, true, new o0O00oO0(this)));
        if (o00OOO00.OooO0O0(this.f27245OooOo0O)) {
            p377o0OOoOo.o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            String str2 = this.f27245OooOo0O;
            Long lValueOf = str2 != null ? Long.valueOf(com.code.android.util.o0OoOo0.OooO(0L, str2)) : null;
            String str3 = (String) o000000O.OooOOOO().getValue();
            o0OOo000 o0ooo001 = new o0OOo000(this);
            boolean z = App.f22703OooO0o0;
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("token", str3);
            linkedHashMapOooO00o.put("userid", lValueOf + "");
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, "/Webservers/RankingList/UserSupportersRank", linkedHashMapOooO00o, o0ooo001);
            OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57684OooOOO.setOnClickListener(this);
        } else {
            LinearLayout linearLayout2 = OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57684OooOOO;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.head.details.llSupport");
            o000OO00.OooO0O0(linearLayout2);
            View view = OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57680OooO0oo;
            Intrinsics.checkNotNullExpressionValue(view, "binding.head.details.headLine");
            o000OO00.OooOOOO(view);
        }
        Class cls = Boolean.TYPE;
        LiveEventBus.get("RechargeFromUserInfo_Show", cls).observe(this, p496o0o00o.o0oO0O0o.f49114OooO0Oo);
        LiveEventBus.get("RechargeFromUserInfo_OK", cls).observe(this, o0O0oo0o.f49085OooO0Oo);
        LiveEventBus.get("UserInfoEditChange", cls).observe(this, new o0O0O0Oo(this));
        o000000O.OooO0oo().observe(this, new OooOOO0(new o0O0O0o0(this)));
        o000000O.OooO().observe(this, new OooOOO0(new o0O0OO0(this)));
        o000000O.OooOOoo().observe(this, new OooOOO0(new o0O0OOO0(this)));
        o000000O.OooOOO().observe(this, new OooOOO0(new o0O0OOOo(this)));
        ((MutableLiveData) o000000O.f46699OooOoOO.getValue()).observe(this, new OooOOO0(new oo0OOoo(this)));
        LiveEventBus.get("UserHeaderUrl").observe(this, new o0O0o000(this));
        String str4 = this.f27245OooOo0O;
        if (str4 != null) {
            OooOooo().getFriendState(com.code.android.util.o0OoOo0.OooO(0L, str4)).observe(this, new OooOOO0(new o0O0O0O(this)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> oooOo) {
        UserInfoModel userInfoModel;
        String string;
        super.onEventMainThread(oooOo);
        UserInfoModel userInfoModel2 = this.f27246OooOo0o;
        if (userInfoModel2 == null || com.code.android.util.OooOo00.OooO00o(Long.valueOf(userInfoModel2.getUserId()))) {
            return;
        }
        Integer numValueOf = oooOo != null ? Integer.valueOf(oooOo.f45532OooO00o) : null;
        boolean z = true;
        if (numValueOf != null && numValueOf.intValue() == 533) {
            T t = oooOo.f45534OooO0OO;
            if (t == 0 || (string = t.toString()) == null) {
                return;
            }
            long jOooO = com.code.android.util.o0OoOo0.OooO(0L, string);
            UserInfoModel userInfoModel3 = this.f27246OooOo0o;
            if ((userInfoModel3 != null && userInfoModel3.getUserId() == jOooO) && this.f27253OooOooo) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.Friends_Already);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 19) {
            T t2 = oooOo.f45534OooO0OO;
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) t2;
            if (com.code.android.util.OooOo00.OooO00o(str) || (userInfoModel = this.f27246OooOo0o) == null || !Intrinsics.areEqual(str, String.valueOf(Long.valueOf(userInfoModel.getUserId())))) {
                return;
            }
            int i = oooOo.f45533OooO0O0;
            UserInfoLeftFragment userInfoLeftFragment = this.f27251OooOoo0;
            if (userInfoLeftFragment != null) {
                Intrinsics.checkNotNull(userInfoLeftFragment);
                userInfoLeftFragment.setIsFollow(i);
            }
            if (isFinishing() && OooOooO().f57999OooOO0o == null) {
                return;
            }
            if (i == 1) {
                oO000Oo.OooO00o(OooOooO().f57999OooOO0o, o0000.OooO0O0(oOo00OO0.icon_profile_followed), ViewLocation.top, p591o0oo000O.OooO.OooO0o0());
                OooOooO().f57999OooOO0o.setText(oO00OOo0.Following_user);
            } else {
                oO000Oo.OooO00o(OooOooO().f57999OooOO0o, o0000.OooO0O0(oOo00OO0.icon_profile_follow), ViewLocation.top, p591o0oo000O.OooO.OooO0o0());
                OooOooO().f57999OooOO0o.setText(oO00OOo0.Follow);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Oooo000(intent);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f27253OooOooo = false;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f27253OooOooo = true;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOoOO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!this.f27254Oooo0) {
            Oooo00O();
        }
        this.f27254Oooo0 = false;
    }
}
