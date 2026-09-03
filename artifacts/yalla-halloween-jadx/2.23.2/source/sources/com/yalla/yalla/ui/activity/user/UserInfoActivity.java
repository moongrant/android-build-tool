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
import com.code.android.util.o000O00O;
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
import p022Oooo00O.o0O0o000;
import p205o00o0o0o.o000O;
import p205o00o0o0o.o000O0o;
import p379o0OOoOOO.o00O00OO;
import p379o0OOoOOO.oOO00O;
import p384o0OOoo0O.o00oO0o;
import p405o0Oo0OOO.v1;
import p406o0Oo0OOo.v3;
import p473o0OoooOo.o0OOO0;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p506o0o00oOo.O0000000;
import p506o0o00oOo.O0O0;
import p506o0o00oOo.oO0Oo0o0;
import p506o0o00oOo.oO0o0000;
import p506o0o00oOo.oO0oO000;
import p506o0o00oOo.oOO;
import p506o0o00oOo.oOO0;
import p506o0o00oOo.oOO00;
import p506o0o00oOo.oOO000;
import p506o0o00oOo.oOO00000;
import p506o0o00oOo.oOO000o;
import p506o0o00oOo.oOO00O0;
import p506o0o00oOo.oOO00OO;
import p506o0o00oOo.oOO0O0;
import p506o0o00oOo.oOO0O000;
import p506o0o00oOo.oOO0O0O;
import p506o0o00oOo.oOO0O0O0;
import p506o0o00oOo.oOO0OO;
import p506o0o00oOo.oOO0OO0O;
import p506o0o00oOo.oOO0OOO;
import p506o0o00oOo.oOO0Oo00;
import p506o0o00oOo.oOOO0OO0;
import p506o0o00oOo.oOOOoo00;
import p506o0o00oOo.oOOo0000;
import p506o0o00oOo.oOo0o00;
import p506o0o00oOo.ooooO000;
import p506o0o00oOo.ooooO0O0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p563o0oOo00O.o0O0O00;
import p573o0oOoOO.o0O0o0;
import p590o0oOooo0.oOOO00;
import p590o0oOooo0.oOOO00Oo;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;
import p650o0ooo.a;
import p650o0ooo.o00O;
import p650o0ooo.o00O0O00;
import p650o0ooo.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClick", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1768:1\n22#2,2:1769\n75#3,13:1771\n1#4:1784\n1855#5,2:1785\n*S KotlinDebug\n*F\n+ 1 UserInfoActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoActivity\n*L\n128#1:1769,2\n129#1:1771,13\n239#1:1785,2\n*E\n"})
public final class UserInfoActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26775Oooo0o = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f26777OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public oOOO00Oo f26778OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public String f26780OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public UserInfoModel f26781OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public oOO0Oo00 f26782OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public ArrayList f26783OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public UserInfoRightFragment f26785OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public UserInfoLeftFragment f26786OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f26787OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f26788OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f26789Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public ArgbEvaluator f26790Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final a f26791Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f26792Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f26793Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList<SelectDialogModel<String>> f26794Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public o0OOO0 f26795Oooo0o0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26776OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(v1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26779OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26816OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26816OooO0Oo;
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
    public final int[] f26784OooOoOO = {o000000.UserInfo_Track, o000000.UserInfo_Profile};

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
            userInfoActivity.OooOooO().f45622OooO0o.setVisibility(0);
            userInfoActivity.OooOooO().f45634OooOOo0.setVisibility(0);
            userInfoActivity.OooOooO().f45619OooO0O0.setVisibility(0);
            if (userInfoModel2 != null) {
                userInfoActivity.f26781OooOo0o = userInfoModel2;
                MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel = new MomentChangeUserIsInRoomModel();
                long userId = userInfoModel2.getUserId();
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                momentChangeUserIsInRoomModel.setUserId(sb.toString());
                momentChangeUserIsInRoomModel.setInRoom(userInfoModel2.getInRoomId() != 0);
                LiveEventBus.get("POST_DETAIL_DATA_CHANGE_ISINROOM").post(momentChangeUserIsInRoomModel);
                UserInfoModel userInfoModel3 = userInfoActivity.f26781OooOo0o;
                if (userInfoModel3 != null) {
                    String str = userInfoActivity.f26780OooOo0O;
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (oOOO0O0o.OooO00o(str)) {
                        userInfoActivity.OooOooO().f45622OooO0o.setVisibility(8);
                    } else {
                        userInfoActivity.OooOooO().f45622OooO0o.setVisibility(0);
                    }
                    String userName = com.code.android.util.OooOo00.OooO00o(userInfoModel3.getUserName()) ? ZegoConstants.ZegoVideoDataAuxPublishingStream : userInfoModel3.getUserName();
                    String memoName = com.code.android.util.OooOo00.OooO0O0(userInfoModel3.getMemoName()) ? userInfoModel3.getMemoName() : userName;
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45461OooOoO0.setText(memoName);
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45461OooOoO0.setFlash(userInfoModel3.getVipLevel() >= VipLevel.Vip4.getValue());
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45436OooO.OooOOOO(userInfoModel3.getVipLevel(), true, userInfoActivity);
                    UserWealthTagView clWealth = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45442OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(clWealth, "clWealth");
                    UserInfoModel userInfoModel4 = userInfoActivity.f26781OooOo0o;
                    Integer numValueOf = userInfoModel4 != null ? Integer.valueOf(userInfoModel4.getWealthLevel()) : null;
                    UserInfoModel userInfoModel5 = userInfoActivity.f26781OooOo0o;
                    clWealth.OooO0O0(userInfoActivity, numValueOf, userInfoModel5 != null ? userInfoModel5.getWealthBadgeWithBg() : null, 10.0f);
                    if (com.code.android.util.OooOo00.OooO0O0(userInfoModel3.getMemoName())) {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45465OooOooO.setText(o0000.OooO0OO(o000000.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + userName);
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45465OooOooO.setVisibility(0);
                    } else {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45465OooOooO.setVisibility(8);
                    }
                    userInfoActivity.OooOooO().f45631OooOOOO.setText(memoName);
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(userInfoActivity);
                    oooO00o.OooO00o(d1.OooO00o());
                    oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(userInfoModel3.getUserHeader());
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO0O0(2, o0000.OooO00o(o0OOO0o.white));
                    oooO00o.OooO0Oo(userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo);
                    oOOO00Oo oooo00oo = userInfoActivity.f26778OooOo0;
                    if (oooo00oo != null) {
                        oooo00oo.OooO00o(userInfoModel3.getUserHeaderFrame());
                    }
                    if (com.code.android.util.OooOo00.OooO0O0(userInfoModel3.getBackground())) {
                        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(userInfoActivity);
                        oooO00o2.f43126OooO0OO = userInfoModel3.getBackground();
                        oooO00o2.f43124OooO00o = 0;
                        oooO00o2.f43138OooOOOo = o0Oo0oo.icon_userinfo_header_bg;
                        oooO00o2.OooO0Oo(userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45450OooOOOO);
                    } else {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45450OooOOOO.setBackground(o0000.OooO0O0(o0Oo0oo.icon_userinfo_header_bg));
                    }
                    if (userInfoModel3.isOfficialRole()) {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45446OooOO0O.setVisibility(0);
                    } else {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45446OooOO0O.setVisibility(8);
                    }
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45449OooOOO0.OooO0Oo(userInfoModel3.getPremiumLevel(), userInfoModel3.isPremium());
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45445OooOO0.setUserPrettyId(userInfoModel3.getIdLevel());
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45464OooOoo0.setText("ID:" + userInfoModel3.getUserIdx());
                    int sex = userInfoModel3.getSex();
                    if (sex == 0) {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setVisibility(0);
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setImageResource(o0Oo0oo.me_top_icon_female);
                    } else if (sex != 1) {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setVisibility(8);
                    } else {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setVisibility(0);
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setImageResource(o0Oo0oo.me_top_icon_male);
                    }
                    TextView textView = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45463OooOoo;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    textView.setText(OooO0O0.OooO0O0.OooO00o(new Object[]{Integer.valueOf(userInfoModel3.getUserLevel())}, 1, "LV.%s", "format(format, *args)") + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    TextView textView2 = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45460OooOoO;
                    int age = userInfoModel3.getAge();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(age);
                    textView2.setText(sb2.toString());
                    try {
                        new SimpleDateFormat("yyyy-MM-dd").parse(userInfoModel3.getBirthday());
                    } catch (Exception unused) {
                        Calendar.getInstance().getTime();
                    }
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45456OooOo0.setVisibility(8);
                    if (com.code.android.util.OooOo00.OooO0O0(Integer.valueOf(userInfoModel3.getCountryId())) && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(Integer.valueOf(userInfoModel3.getCountryId()))) {
                        HashMap<String, CountryModel> map = com.yalla.yalla.app.golbalData.OooO00o.f22254OooO00o;
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
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        }
                        if (!TextUtils.isEmpty(name)) {
                            userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45456OooOo0.setText(name);
                            userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45456OooOo0.setVisibility(0);
                        }
                    }
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45466OooOooo.setText(o0O0O0Oo.OooO0o(userInfoModel3.getVisitorNum(), false));
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45455OooOo.setText(o0O0O0Oo.OooO0o(userInfoModel3.getFollowedNum(), false));
                    userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45458OooOo0O.setText(o0O0O0Oo.OooO0o(userInfoModel3.getFansNum(), false));
                    if (userInfoModel3.getBio() == null) {
                        userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45462OooOoOO.setText(o000000.Userinfo_Sign_Hint);
                    } else {
                        String bio = userInfoModel3.getBio();
                        if (com.code.android.util.OooOo00.OooO0O0(bio != null ? StringsKt.trim((CharSequence) bio).toString() : null)) {
                            userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45462OooOoOO.setText(userInfoModel3.getBio());
                        } else {
                            userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45462OooOoOO.setText(o000000.Userinfo_Sign_Hint);
                        }
                    }
                    String str2 = userInfoActivity.f26780OooOo0O;
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    if (oOOO0O0o.OooO00o(str2) && userInfoActivity.f26780OooOo0O != null) {
                        userInfoActivity.OooOooo().getNewFans().observe(userInfoActivity, new OooOOO0(new ooooO0O0(userInfoActivity)));
                    }
                    if (oOOO0O0o.OooO00o(userInfoActivity.f26780OooOo0O)) {
                        userInfoActivity.OooOooo().getNewVisitor().observe(userInfoActivity, new OooOOO0(new oOO(userInfoActivity)));
                    }
                }
                UserInfoLeftFragment userInfoLeftFragment = userInfoActivity.f26786OooOoo0;
                if (userInfoLeftFragment != null) {
                    userInfoLeftFragment.updateInfo(userInfoActivity.f26781OooOo0o);
                }
                UserInfoRightFragment userInfoRightFragment = userInfoActivity.f26785OooOoo;
                if (userInfoRightFragment != null) {
                    userInfoRightFragment.updataInfo(userInfoActivity.f26781OooOo0o);
                }
                UserInfoModel userInfoModel6 = userInfoActivity.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel6);
                if (userInfoModel6.getInHeBlack()) {
                    userInfoActivity.OooOooO().f45617OooO.setVisibility(8);
                } else if (userInfoModel6.getPurview().getSeeInRoom() == 1 && userInfoModel6.getIsFriend()) {
                    userInfoActivity.OooOooO().f45617OooO.setVisibility(0);
                } else if (userInfoModel6.getPurview().getSeeInRoom() == 2) {
                    if (userInfoModel6.getIsFollow() || userInfoModel6.getIsFriend()) {
                        userInfoActivity.OooOooO().f45617OooO.setVisibility(0);
                    }
                } else if (userInfoModel6.getPurview().getSeeInRoom() == 0) {
                    userInfoActivity.OooOooO().f45617OooO.setVisibility(0);
                } else {
                    userInfoActivity.OooOooO().f45617OooO.setVisibility(8);
                }
                if (userInfoModel6.getInRoomId() == 0) {
                    o0O0o0.OooO00o(userInfoActivity.OooOooO().f45629OooOOO, o0000.OooO0O0(o0Oo0oo.icon_profile_inroom_false), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
                } else {
                    o0O0o0.OooO00o(userInfoActivity.OooOooO().f45629OooOOO, o0000.OooO0O0(o0Oo0oo.icon_profile_inroom), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
                }
                UserInfoLeftFragment userInfoLeftFragment2 = userInfoActivity.f26786OooOoo0;
                if (userInfoLeftFragment2 != null) {
                    Intrinsics.checkNotNull(userInfoLeftFragment2);
                    userInfoLeftFragment2.setIsFollow(userInfoModel6.getIsFollow() ? 1 : 0);
                }
                if (userInfoModel6.getIsFollow()) {
                    o0O0o0.OooO00o(userInfoActivity.OooOooO().f45628OooOO0o, o0000.OooO0O0(o0Oo0oo.icon_profile_followed), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
                    userInfoActivity.OooOooO().f45628OooOO0o.setText(o000000.Following_user);
                } else {
                    o0O0o0.OooO00o(userInfoActivity.OooOooO().f45628OooOO0o, o0000.OooO0O0(o0Oo0oo.icon_profile_follow), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
                    userInfoActivity.OooOooO().f45628OooOO0o.setText(o000000.Follow);
                }
                if (userInfoActivity.f26777OooOo) {
                    userInfoActivity.getIntent().putExtra("UserInfoActivityNew_Go_To_Add_Friend", false);
                    userInfoActivity.f26777OooOo = false;
                    userInfoActivity.OooOoO(userInfoModel6.getPurview().getIsVerify(), userInfoModel6.getIsBlack(), userInfoModel6.getInHeBlack());
                }
                UserInfoModel userInfoModel7 = userInfoActivity.f26781OooOo0o;
                if (Intrinsics.areEqual(userInfoModel7 != null ? Boolean.valueOf(userInfoModel7.getIsShowMomentPostDialog()) : null, Boolean.TRUE)) {
                    userInfoActivity.OooOooo().closeMark().observe(userInfoActivity, new p384o0OOoo0O.o000oOoO(null, null, oOOO0OO0.f50540OooO0Oo, false, 11));
                    o000O o000o = new o000O(userInfoActivity);
                    o000o.OooOoO0(o000000.user_info_first_post_title);
                    o000o.OooOOoo(o000000.user_info_first_post_content);
                    o000o.OooOo0O(new oOOOoo00(userInfoActivity));
                    o000o.OooOOOo(o0000.OooO0OO(o000000.user_info_first_post_post));
                    o000o.OooOo0(new oOOo0000(userInfoActivity));
                    o000o.OooO0o(false);
                    o000o.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.user.UserInfoActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0327OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ boolean f26797OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Activity f26798OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f26799OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ String f26800OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ boolean f26801OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ boolean f26802OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0327OooO00o(Activity activity, String str, boolean z, boolean z2, boolean z3, boolean z4) {
                super(0);
                this.f26798OooO0Oo = activity;
                this.f26800OooO0o0 = str;
                this.f26799OooO0o = z;
                this.f26801OooO0oO = z2;
                this.f26802OooO0oo = z3;
                this.f26797OooO = z4;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Activity activity = this.f26798OooO0Oo;
                Intent intent = new Intent(activity, (Class<?>) UserInfoActivity.class);
                intent.putExtra("Id", this.f26800OooO0o0);
                intent.putExtra("UserInfoActivityNew_Go_To_Add_Friend", this.f26799OooO0o);
                intent.putExtra("UserInfoActivityNew_FROM_ROOM_KEY", this.f26801OooO0oO);
                intent.putExtra("UserInfoActivityNew_FROM_PRIVATE_CHAT", this.f26802OooO0oo);
                intent.putExtra("UserInfoActivityNew_From_Room_Page", this.f26797OooO);
                activity.startActivityForResult(intent, 1022);
                return Unit.INSTANCE;
            }
        }

        public static void OooO0O0(@Nullable Activity activity, @Nullable String str, boolean z, boolean z2, boolean z3, boolean z4) {
            if (activity != null) {
                C0327OooO00o onLogin = new C0327OooO00o(activity, str, z, z2, z3, z4);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
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
        public final /* synthetic */ boolean f26804OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(0);
            this.f26804OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoActivity userInfoActivity = UserInfoActivity.this;
            UserInfoActivity.OooOo(userInfoActivity, false);
            if (this.f26804OooO0o0) {
                userInfoActivity.Oooo0();
            } else {
                userInfoActivity.Oooo00o(o0000.OooO0OO(o000000.addbuddy));
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
            UserInBarModel userInBarModel = (UserInBarModel) oOOO00.OooO00o(response, UserInBarModel.class);
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
                roomModel.setId(o0O0O0Oo.OooOO0o(dataBean.barid));
                roomModel.setName(userInBarModel.data.barname);
                roomModel.setLevel(userInBarModel.data.barlevel);
                if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                    MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
                    p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Protile_lnRoom);
                    return;
                }
                return;
            }
            UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
            if (userInfoModel != null) {
                userInfoModel.setInRoomId(0L);
            }
            o0O0o0.OooO00o(userInfoActivity.OooOooO().f45629OooOOO, o0000.OooO0O0(o0Oo0oo.icon_profile_inroom_false), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
            String strOooO0OO = o0000.OooO0OO(o000000.notinroom);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
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
                if (userInfoActivity.f26793Oooo0O0 == 0) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
                    if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.Vip.getValue()) {
                        pair = (Pair) o0O00oO0.OooOO0().getValue();
                        if (pair != null) {
                            iIntValue = ((Number) pair.getSecond()).intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue >= VipLevel.Vip3.getValue()) {
                            z = true;
                        }
                    } else {
                        Pair pair3 = (Pair) o0O00oO0.OooOO0().getValue();
                        if (pair3 != null && ((Number) pair3.getFirst()).intValue() == VipState.VipHide.getValue()) {
                            pair = (Pair) o0O00oO0.OooOO0().getValue();
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
                p139o00OOOo0.OooOO0O.OooO0OO(userInfoActivity, 1.0f, 1.0f, z, false, new com.yalla.yalla.ui.activity.user.OooOOOO(userInfoActivity));
                userInfoActivity.f26789Oooo0 = true;
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
                if (userInfoActivity.f26792Oooo00o && !userInfoActivity.isFinishing() && !userInfoActivity.isDestroyed()) {
                    o000O o000o = new o000O(userInfoActivity);
                    o000o.OooOOoo(o000000.Network_request_failed);
                    o000o.OooOO0(new OooOo00(userInfoActivity));
                    o000o.OooO(new OooOo(userInfoActivity));
                    o000o.OooOO0o();
                }
            } else if (code == 1057 || code == 1058) {
                String strOooO0OO = o0000.OooO0OO(o000000.activity_delete_account);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                userInfoActivity.OooOooO().f45619OooO0O0.setVisibility(8);
                userInfoActivity.OooOooO().f45620OooO0OO.f45435OooO0O0.setVisibility(0);
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error, null), 3, null);
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
            userInfoActivity.f26792Oooo00o = false;
            userInfoActivity.f26787OooOooO = false;
            a aVar = userInfoActivity.f26791Oooo00O;
            if (aVar != null) {
                aVar.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f26809OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null && num2.intValue() == 1) {
                String strOooO0OO = o0000.OooO0OO(o000000.send_successfully);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else if (num2 != null && num2.intValue() == 2) {
                String strOooO0OO2 = o0000.OooO0OO(o000000.Added_successfully);
                if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                    o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26810OooO0Oo;

        public OooOOO0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26810OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26810OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26810OooO0Oo;
        }

        public final int hashCode() {
            return this.f26810OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26810OooO0Oo.invoke(obj);
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
            OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            UserInfoActivity.this.Oooo00o(it);
            return Unit.INSTANCE;
        }
    }

    public UserInfoActivity() {
        o00O0OO0.OooO00o().getClass();
        this.f26791Oooo00O = new a();
        this.f26792Oooo00o = true;
        this.f26794Oooo0OO = new ArrayList<>();
    }

    public static final void OooOo(UserInfoActivity userInfoActivity, boolean z) {
        UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
        if (userInfoModel != null) {
            long userId = userInfoModel.getUserId();
            userInfoActivity.OooOooo().blockUser(userId, z).observe(userInfoActivity, new OooOOO0(new O0O0(userInfoActivity, z, userId)));
        }
    }

    public static final void OooOoO0(UserInfoActivity userInfoActivity, boolean z) {
        if (z) {
            String str = userInfoActivity.f26780OooOo0O;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (!oOOO0O0o.OooO00o(str)) {
                userInfoActivity.OooOooO().f45623OooO0o0.setVisibility(0);
                return;
            }
        }
        userInfoActivity.OooOooO().f45623OooO0o0.setVisibility(8);
    }

    public final void OooOoO(boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z3) {
            String string = getString(o000000.On_His_Blacklist);
            if (string != null && !StringsKt.isBlank(string)) {
                z4 = false;
            }
            if (z4) {
                return;
            }
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (!z2) {
            if (z) {
                Oooo0();
                return;
            } else {
                Oooo00o(o0000.OooO0OO(o000000.addbuddy));
                return;
            }
        }
        o000O o000o = new o000O(this);
        o000o.OooOOoo(o000000.As_Block_Add_Friends);
        o000o.OooOo(true);
        o000o.OooOo0(new OooO0O0(z));
        o000o.OooOO0o();
    }

    public final void OooOoOO() {
        UserInfoModel userInfoModel = this.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        String strValueOf = String.valueOf(userInfoModel.getUserId());
        OooO0OO oooO0OO = new OooO0OO();
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("touserid", strValueOf);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43390Oooooo0, linkedHashMapOooO00o, oooO0OO);
    }

    public final void OooOoo(boolean z, @Nullable o0O0o000 o0o0o000) {
        OooOooO().f45624OooO0oO.setClickable(false);
        UserInfoModel userInfoModel = this.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        String strValueOf = String.valueOf(userInfoModel.getUserId());
        String str = z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1";
        oOO00000 ooo00000 = new oOO00000(this, o0o0o000, z);
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("fuserid", strValueOf);
        linkedHashMapOooO00o.put("type", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43432o00Ooo, linkedHashMapOooO00o, ooo00000);
    }

    public final void OooOoo0(int i) {
        this.f26793Oooo0O0 = i;
        com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32339OooO0o, null, new OooO0o());
    }

    public final v1 OooOooO() {
        return (v1) this.f26776OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final UserInfoVM OooOooo() {
        return (UserInfoVM) this.f26779OooOo00.getValue();
    }

    public final void Oooo0() {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        String strOooO0OO = o0000.OooO0OO(o000000.UserInfo_Dialog_Friend_Request);
        String string = getResources().getString(o000000.import_verifymessage);
        String string2 = getString(o000000.iam);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o00O.OooO00o(this, strOooO0OO, string, string2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0O00oO0.OooOOoo().getValue(), new OooOOOO());
    }

    public final void Oooo000(Intent intent) {
        if (intent != null) {
            this.f26780OooOo0O = intent.getStringExtra("Id");
            this.f26777OooOo = intent.getBooleanExtra("UserInfoActivityNew_Go_To_Add_Friend", false);
        }
        if (TextUtils.isEmpty(this.f26780OooOo0O)) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            this.f26780OooOo0O = p004OooO0oO.o0OoOo0.OooO00o();
        }
        String str = this.f26780OooOo0O;
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        if (!oOOO0O0o.OooO00o(str) || OooOooO().f45622OooO0o == null) {
            return;
        }
        OooOooO().f45622OooO0o.setVisibility(8);
    }

    public final void Oooo00O() {
        a aVar;
        if (this.f26787OooOooO) {
            return;
        }
        this.f26787OooOooO = true;
        if (this.f26792Oooo00o && (aVar = this.f26791Oooo00O) != null) {
            aVar.OooO0O0(o000000.loading, this);
        }
        UserInfoVM userInfoVMOooOooo = OooOooo();
        String str = this.f26780OooOo0O;
        Intrinsics.checkNotNull(str);
        userInfoVMOooOooo.loadUserInfo(com.code.android.util.o0OoOo0.OooO(0L, str)).observe(this, new p384o0OOoo0O.o000oOoO(new OooO(), new OooOO0(), new OooOO0O(), true));
    }

    public final void Oooo00o(String str) {
        UserInfoVM userInfoVMOooOooo = OooOooo();
        UserInfoModel userInfoModel = this.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        userInfoVMOooOooo.addFriend(userInfoModel.getUserId(), str).observe(this, new OooOOO0(OooOOO.f26809OooO0Oo));
    }

    public final void Oooo0O0() {
        String userHeader;
        String userIdx;
        UserInfoModel userInfoModel = this.f26781OooOo0o;
        if (userInfoModel == null || (userHeader = userInfoModel.getUserHeader()) == null) {
            return;
        }
        String strOooO0o0 = p184o00o00O0.OooO0OO.OooO0o0(p184o00o00O0.OooO0OO.OooO0Oo(userHeader));
        UserInfoModel userInfoModel2 = this.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel2);
        if (userInfoModel2.getPurview().getIsWaterMark()) {
            UserInfoModel userInfoModel3 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel3);
            userIdx = userInfoModel3.getUserIdx();
        } else {
            userIdx = null;
        }
        NetImageView nivUserinfoHead = OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo;
        Intrinsics.checkNotNullExpressionValue(nivUserinfoHead, "nivUserinfoHead");
        ShowImageActivity.OooO00o.OooO00o(this, strOooO0o0, nivUserinfoHead, userIdx, true);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("userid", this.f26780OooOo0O);
        UserInfoModel userInfoModel = this.f26781OooOo0o;
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
        if (this.f26781OooOo0o == null) {
            return;
        }
        int id = view.getId();
        boolean z = true;
        if (id == o0OO00O.ll_friend) {
            UserInfoModel userInfoModel = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel);
            if (!userInfoModel.getIsFriend()) {
                o0oo0000.OooO00o.OooO0O0("105080");
                UserInfoModel userInfoModel2 = this.f26781OooOo0o;
                if (userInfoModel2 != null) {
                    OooOoO(userInfoModel2.getPurview().getIsVerify(), userInfoModel2.getIsBlack(), userInfoModel2.getInHeBlack());
                    return;
                }
                return;
            }
            o0oo0000.OooO00o.OooO0O0("105081");
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String userUrl = (String) o0O00oO0.OooO().getValue();
            if (userUrl == null) {
                userUrl = "";
            }
            UserInfoModel userInfoModel3 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel3);
            String friendUrl = userInfoModel3.getUserHeader();
            p506o0o00oOo.oOOO00Oo onConfirmClick = new p506o0o00oOo.oOOO00Oo(this);
            Intrinsics.checkNotNullParameter(this, "activity");
            Intrinsics.checkNotNullParameter(userUrl, "userUrl");
            Intrinsics.checkNotNullParameter(friendUrl, "friendUrl");
            Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
            showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-219877355, true, new o00O0O00(onConfirmClick, userUrl, friendUrl)));
            return;
        }
        if (id == o0OO00O.ll_inroom) {
            o0oo0000.OooO00o.OooO0O0("105082");
            UserInfoModel userInfoModel4 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel4);
            if (userInfoModel4.getInRoomId() == 0) {
                String strOooO0OO = o0000.OooO0OO(o000000.notinroom);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            UserInfoModel userInfoModel5 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel5);
            if (userInfoModel5.getPurview().getSeeInRoom() == 1) {
                UserInfoModel userInfoModel6 = this.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel6);
                if (userInfoModel6.getIsFriend()) {
                    OooOoOO();
                    return;
                }
            }
            UserInfoModel userInfoModel7 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel7);
            if (userInfoModel7.getPurview().getSeeInRoom() != 2) {
                UserInfoModel userInfoModel8 = this.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel8);
                if (userInfoModel8.getPurview().getSeeInRoom() == 0) {
                    OooOoOO();
                    return;
                }
                String strOooO0OO2 = o0000.OooO0OO(o000000.nopower);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                    return;
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                    return;
                }
            }
            UserInfoModel userInfoModel9 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel9);
            if (!userInfoModel9.getIsFollow()) {
                UserInfoModel userInfoModel10 = this.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel10);
                if (!userInfoModel10.getIsFriend()) {
                    String strOooO0OO3 = o0000.OooO0OO(o000000.nopower);
                    if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o3 = androidx.activity.OooOo00.OooO00o(strOooO0OO3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o3.run();
                        return;
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                        return;
                    }
                }
            }
            OooOoOO();
            return;
        }
        if (id == o0OO00O.ll_message) {
            o0oo0000.OooO00o.OooO0O0("105083");
            UserInfoModel userInfoModel11 = this.f26781OooOo0o;
            if (userInfoModel11 == null || (lValueOf = Long.valueOf(userInfoModel11.getUserId())) == null) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) PrivateChatActivity.class);
            intent.putExtra(v3.f45737OooO00o, lValueOf.longValue());
            startActivity(intent);
            return;
        }
        if (id == o0OO00O.ll_follow) {
            UserInfoModel userInfoModel12 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel12);
            if (userInfoModel12.getIsFollow()) {
                o0oo0000.OooO00o.OooO0O0("105085");
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
                showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-581127448, true, new O0000000(this)));
                return;
            }
            o0oo0000.OooO00o.OooO0O0("105084");
            UserInfoModel userInfoModel13 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel13);
            if (userInfoModel13.getIsBlack()) {
                o000O o000o = new o000O(this);
                o000o.OooOOoo(o000000.As_Block_Add_Follow);
                o000o.OooOo(true);
                o000o.OooOo0(new oO0oO000(this));
                o000o.OooOO0o();
                return;
            }
            UserInfoModel userInfoModel14 = this.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel14);
            if (!userInfoModel14.getInHeBlack()) {
                OooOoo(true, null);
                return;
            }
            String string = getString(o000000.On_His_Blacklist);
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o4 = androidx.activity.OooOo00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o4.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o4);
                return;
            }
        }
        if (id != o0OO00O.niv_userinfo_head) {
            if (id == o0OO00O.ll_id) {
                o0oo0000.OooO00o.OooO0O0("105069");
                Object systemService = getSystemService("clipboard");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                UserInfoModel userInfoModel15 = this.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel15);
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Yalla", userInfoModel15.getUserIdx()));
                String strOooO0OO4 = o0000.OooO0OO(o000000.UserInfo_Clip_cpoied);
                if (strOooO0OO4 != null && !StringsKt.isBlank(strOooO0OO4)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o5 = androidx.activity.OooOo00.OooO00o(strOooO0OO4, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o5.run();
                    return;
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o5);
                    return;
                }
            }
            return;
        }
        String str = this.f26780OooOo0O;
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        if (!oOOO0O0o.OooO00o(str)) {
            o0oo0000.OooO00o.OooO0O0("105099");
            Oooo0O0();
            return;
        }
        o0oo0000.OooO00o.OooO0O0("105100");
        ArrayList<SelectDialogModel<String>> arrayList = this.f26794Oooo0OO;
        arrayList.clear();
        SelectDialogModel<String> selectDialogModel = new SelectDialogModel<>();
        int i = o000000.user_info_header_show_header;
        selectDialogModel.setContent(0, getString(i));
        arrayList.add(selectDialogModel);
        SelectDialogModel<String> selectDialogModel2 = new SelectDialogModel<>();
        int i2 = o000000.user_info_header_change_header;
        selectDialogModel2.setContent(1, getString(i2));
        arrayList.add(selectDialogModel2);
        SelectDialogModel<String> selectDialogModel3 = new SelectDialogModel<>();
        int i3 = o000000.user_info_header_url_change_type_default_url;
        selectDialogModel3.setContent(3, getString(i3));
        arrayList.add(selectDialogModel3);
        SelectDialogModel<String> selectDialogModel4 = new SelectDialogModel<>();
        int i4 = o000000.user_info_header_select_header_frame;
        selectDialogModel4.setContent(2, getString(i4));
        arrayList.add(selectDialogModel4);
        o000O0o o000o0o2 = new o000O0o(this, null);
        o000o0o2.OooOOO0(o0000.OooO0OO(i));
        o000o0o2.OooOOO0(o0000.OooO0OO(i2));
        o000o0o2.OooOOO0(o0000.OooO0OO(i3));
        o000o0o2.OooOOO0(o0000.OooO0OO(i4));
        o000o0o2.OooOOo0(new p506o0o00oOo.oOOO0O0o(this));
        o000o0o2.OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f45618OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        Oooo000(getIntent());
        Toolbar toolbar = OooOooO().f45627OooOO0O;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        int i = 2;
        oOO00O.OooO00o(toolbar, true, 2);
        Toolbar toolbarHolder = OooOooO().f45621OooO0Oo.f45410OooO0o;
        Intrinsics.checkNotNullExpressionValue(toolbarHolder, "toolbarHolder");
        oOO00O.OooO00o(toolbarHolder, true, 2);
        CollapsingToolbarLayout unconsumeWindowInset = OooOooO().f45621OooO0Oo.f45408OooO0OO;
        Intrinsics.checkNotNullExpressionValue(unconsumeWindowInset, "ctl");
        Intrinsics.checkNotNullParameter(unconsumeWindowInset, "$this$unconsumeWindowInset");
        unconsumeWindowInset.setOnApplyWindowInsetsListener(o00O00OO.f43252OooO00o);
        OooOooO().f45621OooO0Oo.f45407OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o00oOo.oO0OO0O
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i2) {
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                UserInfoActivity this$0 = this.f50495OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                int iOooO0O0 = o0000O0.OooO0O0(i2);
                if (this$0.f26790Oooo000 == null) {
                    this$0.f26790Oooo000 = new ArgbEvaluator();
                }
                int i3 = iOooO0O0 + Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
                if (i3 > 0) {
                    Toolbar toolbar2 = this$0.OooOooO().f45627OooOO0O;
                    int i4 = o0OOO0o.transparent;
                    toolbar2.setBackgroundColor(o0000.OooO00o(i4));
                    this$0.OooOooO().f45631OooOOOO.setTextColor(o0000.OooO00o(i4));
                    return;
                }
                float fAbs = Math.abs(i3) / 100.0f;
                if (fAbs > 1.0f) {
                    fAbs = 1.0f;
                }
                ArgbEvaluator argbEvaluator = this$0.f26790Oooo000;
                Intrinsics.checkNotNull(argbEvaluator);
                int i5 = o0OOO0o.transparent;
                Object objEvaluate = argbEvaluator.evaluate(fAbs, Integer.valueOf(o0000.OooO00o(i5)), Integer.valueOf(o0000.OooO00o(o0OOO0o.color_00d8c9)));
                Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                ArgbEvaluator argbEvaluator2 = this$0.f26790Oooo000;
                Intrinsics.checkNotNull(argbEvaluator2);
                Object objEvaluate2 = argbEvaluator2.evaluate(fAbs, Integer.valueOf(o0000.OooO00o(i5)), Integer.valueOf(o0000.OooO00o(o0OOO0o.color_white)));
                Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) objEvaluate2).intValue();
                this$0.OooOooO().f45627OooOO0O.setBackgroundColor(iIntValue);
                this$0.OooOooO().f45631OooOOOO.setTextColor(iIntValue2);
            }
        });
        this.f26778OooOo0 = new oOOO00Oo(this, OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45453OooOOo0);
        OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45450OooOOOO.setOnClickListener(new oOO0O0O0(this));
        OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45440OooO0Oo.setOnClickListener(new oOO0O0O(this));
        OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45439OooO0OO.setOnClickListener(new oOO0OO0O(this));
        OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45438OooO0O0.setOnClickListener(new oOO0OO(this));
        OooOO0o().OooOoO(OooOooO().f45627OooOO0O);
        ActionBar actionBarOooOO0 = OooOO0o().OooOO0();
        Intrinsics.checkNotNull(actionBarOooOO0);
        actionBarOooOO0.OooOOO0(false);
        OooOooO().f45627OooOO0O.setNavigationIcon(o0Oo0oo.btn_return);
        OooOooO().f45627OooOO0O.setNavigationOnClickListener(new oOO0OOO(this));
        String str = this.f26780OooOo0O;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(str)) {
            OooOooO().f45632OooOOOo.setVisibility(0);
            LinearLayout userEditContainer = OooOooO().f45632OooOOOo;
            Intrinsics.checkNotNullExpressionValue(userEditContainer, "userEditContainer");
            com.code.android.util.o000O.OooO(userEditContainer, new oOO0O000(this));
        } else {
            ImageView ivMore = OooOooO().f45623OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ivMore, "ivMore");
            com.code.android.util.o000O.OooO(ivMore, new oOO0O0(this));
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = "";
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0O0(1, o0000.OooO00o(o0OOO0o.white));
        oooO00o.OooO0Oo(OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo);
        this.f26783OooOoO0 = new ArrayList();
        this.f26786OooOoo0 = UserInfoLeftFragment.newInstantce(this.f26780OooOo0O);
        this.f26785OooOoo = UserInfoRightFragment.newInstantce();
        ArrayList arrayList = this.f26783OooOoO0;
        if (arrayList != null) {
            UserInfoLeftFragment userInfoLeftFragment = this.f26786OooOoo0;
            Intrinsics.checkNotNull(userInfoLeftFragment);
            arrayList.add(userInfoLeftFragment);
        }
        ArrayList arrayList2 = this.f26783OooOoO0;
        if (arrayList2 != null) {
            UserInfoRightFragment userInfoRightFragment = this.f26785OooOoo;
            Intrinsics.checkNotNull(userInfoRightFragment);
            arrayList2.add(userInfoRightFragment);
        }
        this.f26782OooOoO = new oOO0Oo00(this, getSupportFragmentManager());
        OooOooO().f45633OooOOo.setAdapter(this.f26782OooOoO);
        ArrayList titleList = new ArrayList();
        titleList.add(o0000.OooO0OO(o000000.UserInfo_Track));
        titleList.add(o0000.OooO0OO(o000000.UserInfo_Profile));
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o2 = new o0O0O00.OooO00o(this);
        oooO00o2.f56259OooO0OO = 13.0f;
        oooO00o2.f56260OooO0Oo = 13.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o2.f56258OooO0O0 = titleList;
        oooO00o2.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.color_alpha_87);
        oooO00o2.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_alpha_54_A2);
        ViewPagerFixed vpUserinfo = OooOooO().f45633OooOOo;
        Intrinsics.checkNotNullExpressionValue(vpUserinfo, "vpUserinfo");
        oooO00o2.OooO0Oo(vpUserinfo);
        oooO00o2.f56256OooO = 5.0f;
        oooO00o2.f56265OooOO0 = o0000.OooO00o(o0OOO0o.color_00d8c9);
        oooO00o2.f56266OooOO0O = o0000O0.OooO00o(30);
        oooO00o2.f56267OooOO0o = o0000O0.OooO00o(3);
        oooO00o2.f56257OooO00o.setAdjustMode(true);
        YlTableLayout magicIndicator = OooOooO().f45621OooO0Oo.f45411OooO0o0;
        Intrinsics.checkNotNullExpressionValue(magicIndicator, "magicIndicator");
        oooO00o2.OooO00o(magicIndicator);
        OooOooO().f45620OooO0OO.f45435OooO0O0.setVisibility(8);
        OooOooO().f45625OooO0oo.setOnClickListener(this);
        OooOooO().f45617OooO.setOnClickListener(this);
        OooOooO().f45626OooOO0.setOnClickListener(this);
        OooOooO().f45624OooO0oO.setOnClickListener(this);
        OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo.setOnClickListener(this);
        ((LinearLayout) findViewById(o0OO00O.ll_id)).setOnClickListener(this);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-450448260, true, new oOO000(this)));
        if (oOOO0O0o.OooO00o(this.f26780OooOo0O)) {
            o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
            String str2 = this.f26780OooOo0O;
            Long lValueOf = str2 != null ? Long.valueOf(com.code.android.util.o0OoOo0.OooO(0L, str2)) : null;
            String str3 = (String) o0O00oO0.OooOOOO().getValue();
            oOo0o00 ooo0o00 = new oOo0o00(this);
            boolean z = App.f22233OooO0o0;
            LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("token", str3);
            linkedHashMapOooO00o.put("userid", lValueOf + "");
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, "/Webservers/RankingList/UserSupportersRank", linkedHashMapOooO00o, ooo0o00);
            OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45448OooOOO.setOnClickListener(this);
        } else {
            LinearLayout llSupport = OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45448OooOOO;
            Intrinsics.checkNotNullExpressionValue(llSupport, "llSupport");
            com.code.android.util.o000O.OooO0O0(llSupport);
            View headLine = OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45444OooO0oo;
            Intrinsics.checkNotNullExpressionValue(headLine, "headLine");
            com.code.android.util.o000O.OooOOOO(headLine);
        }
        Class cls = Boolean.TYPE;
        LiveEventBus.get("RechargeFromUserInfo_Show", cls).observe(this, new oO0Oo0o0());
        LiveEventBus.get("RechargeFromUserInfo_OK", cls).observe(this, new oO0o0000());
        LiveEventBus.get("UserInfoEditChange", cls).observe(this, new p491o0o00O0o.o0Oo0oo(this, i));
        o0O00oO0.OooO0oo().observe(this, new OooOOO0(new oOO00(this)));
        o0O00oO0.OooO().observe(this, new OooOOO0(new oOO00O0(this)));
        o0O00oO0.OooOOoo().observe(this, new OooOOO0(new oOO00OO(this)));
        o0O00oO0.OooOOO().observe(this, new OooOOO0(new ooooO000(this)));
        ((MutableLiveData) o0O00oO0.f47961OooOoOO.getValue()).observe(this, new OooOOO0(new oOO0(this)));
        LiveEventBus.get("UserHeaderUrl").observe(this, new p491o0o00O0o.o0OO00O(this, i));
        String str4 = this.f26780OooOo0O;
        if (str4 != null) {
            OooOooo().getFriendState(com.code.android.util.o0OoOo0.OooO(0L, str4)).observe(this, new OooOOO0(new oOO000o(this)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    public final void onEventMainThread(@Nullable p545o0oO0O00.OooOOO<?> oooOOO) {
        UserInfoModel userInfoModel;
        String string;
        super.onEventMainThread(oooOOO);
        UserInfoModel userInfoModel2 = this.f26781OooOo0o;
        if (userInfoModel2 == null || com.code.android.util.OooOo00.OooO00o(Long.valueOf(userInfoModel2.getUserId()))) {
            return;
        }
        Integer numValueOf = oooOOO != null ? Integer.valueOf(oooOOO.f55758OooO00o) : null;
        boolean z = true;
        if (numValueOf != null && numValueOf.intValue() == 533) {
            T t = oooOOO.f55760OooO0OO;
            if (t == 0 || (string = t.toString()) == null) {
                return;
            }
            long jOooO = com.code.android.util.o0OoOo0.OooO(0L, string);
            UserInfoModel userInfoModel3 = this.f26781OooOo0o;
            if ((userInfoModel3 != null && userInfoModel3.getUserId() == jOooO) && this.f26788OooOooo) {
                String strOooO0OO = o0000.OooO0OO(o000000.Friends_Already);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 19) {
            T t2 = oooOOO.f55760OooO0OO;
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) t2;
            if (com.code.android.util.OooOo00.OooO00o(str) || (userInfoModel = this.f26781OooOo0o) == null || !Intrinsics.areEqual(str, String.valueOf(Long.valueOf(userInfoModel.getUserId())))) {
                return;
            }
            int i = oooOOO.f55759OooO0O0;
            UserInfoLeftFragment userInfoLeftFragment = this.f26786OooOoo0;
            if (userInfoLeftFragment != null) {
                Intrinsics.checkNotNull(userInfoLeftFragment);
                userInfoLeftFragment.setIsFollow(i);
            }
            if (isFinishing() && OooOooO().f45628OooOO0o == null) {
                return;
            }
            if (i == 1) {
                o0O0o0.OooO00o(OooOooO().f45628OooOO0o, o0000.OooO0O0(o0Oo0oo.icon_profile_followed), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
                OooOooO().f45628OooOO0o.setText(o000000.Following_user);
            } else {
                o0O0o0.OooO00o(OooOooO().f45628OooOO0o, o0000.OooO0O0(o0Oo0oo.icon_profile_follow), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
                OooOooO().f45628OooOO0o.setText(o000000.Follow);
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
        this.f26788OooOooo = false;
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f26788OooOooo = true;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOoO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!this.f26789Oooo0) {
            Oooo00O();
        }
        this.f26789Oooo0 = false;
    }
}
