package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000Oo0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o000O000;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p464o0Oooo.o000000O;
import p496o0o00o.oO000;
import p496o0o00o.oO00000o;
import p496o0o00o.oO000O0;
import p496o0o00o.oO000O0O;
import p496o0o00o.oO000OOo;
import p496o0o00o.oO000Oo;
import p496o0o00o.oO000Oo0;
import p496o0o00o.oO000o00;
import p496o0o00o.oO00O0o0;
import p496o0o00o.oO00OOO;
import p496o0o00o.oO00o00;
import p496o0o00o.oO00o000;
import p496o0o00o.oO0O0OoO;
import p496o0o00o.oO0OOO00;
import p496o0o00o.oO0OOo0o;
import p496o0o00o.oO0Oo0oo;
import p496o0o00o.oO0OoOO0;
import p496o0o00o.oO0Ooooo;
import p496o0o00o.oO0o0o;
import p496o0o00o.oOOoOOO0;
import p496o0o00o.ooOOOOoo;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.ha;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserInfoEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,875:1\n22#2,2:876\n75#3,13:878\n1#4:891\n*S KotlinDebug\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity\n*L\n89#1:876,2\n96#1:878,13\n*E\n"})
public final class UserInfoEditActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ int f27283Oooo0oO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public String f27285OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public Date f27286OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public TextView f27287OooOo00;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public String f27290OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public String f27292OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public List<UserInfo.TagInfo> f27293OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public String f27294OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public UserInfoModel f27295OooOooO;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public Drawable f27297Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public Drawable f27300Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public Drawable f27301Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public String f27302Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public String f27304Oooo0o0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27284OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ha.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final Calendar f27288OooOo0O = Calendar.getInstance();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27289OooOo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27309OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27309OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f27291OooOoO0 = 1;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f27296OooOooo = new MutableLiveData<>();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f27298Oooo000 = new MutableLiveData<>();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f27299Oooo00O = new MutableLiveData<>();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList<SelectDialogModel<String>> f27303Oooo0o = new ArrayList<>();

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27305OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27305OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27305OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27305OooO0Oo;
        }

        public final int hashCode() {
            return this.f27305OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27305OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo(final UserInfoEditActivity userInfoEditActivity) {
        if (com.code.android.util.OooOo00.OooO00o(StringsKt.trim((CharSequence) userInfoEditActivity.OooOoO().f58077OooO0O0.getText().toString()).toString())) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_edit_username_empty);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
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
        BaseActivityK.OooOo0o(userInfoEditActivity, o0000.OooO0OO(oO00OOo0.setting), 0L, 2);
        if (userInfoEditActivity.f27285OooOo == null) {
            if (userInfoEditActivity.OooOoo0()) {
                userInfoEditActivity.OooOooO();
            }
        } else {
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String strOooO00o = androidx.compose.runtime.Oooo0.OooO00o();
            int i = userInfoEditActivity.f27291OooOoO0;
            String str = userInfoEditActivity.f27285OooOo;
            p377o0OOoOo.o000O0.OooO00o(userInfoEditActivity, strOooO00o, i, str != null ? p139o00OOooO.OooO0o.OooO0o(str) : null, new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$saveHeaderUrl$1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@Nullable String str2, @Nullable String str3) {
                    super.OooO0O0(str2, str3);
                    this.f27306OooO0o0.OooOo0();
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Profile_photo_upload_failed);
                    if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    }
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Object objOooO0O0 = oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$saveHeaderUrl$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(response, objec…aBeanApi<String?>?>() {})");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0O0;
                    if (TextUtils.isEmpty((CharSequence) absJavaBeanApi.getData())) {
                        return;
                    }
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    o000000O.OooO().postValue(absJavaBeanApi.getData());
                    LiveEventBus.get("UserHeaderUrl").post(absJavaBeanApi.getData());
                    UserInfoEditActivity userInfoEditActivity2 = this.f27306OooO0o0;
                    userInfoEditActivity2.f27285OooOo = null;
                    if (userInfoEditActivity2.OooOoo0()) {
                        userInfoEditActivity2.OooOooO();
                        return;
                    }
                    LiveEventBus.get("UserInfoEditChange").post(Boolean.TRUE);
                    userInfoEditActivity2.OooOo0();
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Userinfo_edit_success);
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                    userInfoEditActivity2.finish();
                }
            });
        }
    }

    public final ha OooOoO() {
        return (ha) this.f27284OooOOoo.getValue();
    }

    public final void OooOoO0() {
        OooOoo();
        if (!OooOoo0()) {
            finish();
            return;
        }
        o0OO00O o0oo00o2 = new o0OO00O(this);
        o0oo00o2.OooOOoo(oO00OOo0.Save_all_edits);
        o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Discard));
        o0oo00o2.OooOo0O(new oO00o00(this));
        o0oo00o2.OooOOOO(oO00OOo0.Save);
        o0oo00o2.OooOo0(new oO0OOO00(this));
        o0oo00o2.OooOO0o();
    }

    public final String OooOoOO(String str) {
        if (Intrinsics.areEqual(str, "1")) {
            String string = getString(oO00OOo0.male);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.male)");
            return string;
        }
        if (Intrinsics.areEqual(str, FeedbackType.Suggestions)) {
            String string2 = getString(oO00OOo0.sex);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sex)");
            return string2;
        }
        String string3 = getString(oO00OOo0.female);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.female)");
        return string3;
    }

    public final void OooOoo() {
        EditText view = OooOoO().f58077OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
        p367o0OOo0o0.OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
    }

    public final boolean OooOoo0() {
        return (this.f27290OooOoO == null && this.f27285OooOo == null && this.f27292OooOoOO == null && this.f27294OooOoo0 == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO() {
        o000O000.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) this.f27289OooOo0o.getValue(), this.f27290OooOoO, this.f27292OooOoOO, this.f27294OooOoo0, null, null, null, null, null, 248, null), this, false, new oOOoOOO0(this), null, new oO00o000(this), 10);
    }

    public final void OooOooo(List<UserInfo.TagInfo> list) {
        this.f27293OooOoo = list;
        OooOoO().f58078OooO0OO.removeAllViews();
        if (!com.code.android.util.OooOo00.OooO0O0(list)) {
            OooOoO().f58089OooOOOO.setVisibility(0);
            return;
        }
        OooOoO().f58089OooOOOO.setVisibility(8);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View viewInflate = View.inflate(this, oO00OO0O.item_flow_tag_userinfo, null);
            ((TextView) viewInflate.findViewById(oO00O0oO.tv_tag_flow_userinfo)).setText(list.get(i).getTagName());
            OooOoO().f58078OooO0OO.addView(viewInflate);
        }
    }

    public final void Oooo000() {
        if (OooOoo0()) {
            TextView textView = this.f27287OooOo00;
            if (textView != null) {
                textView.setEnabled(true);
            }
            TextView textView2 = this.f27287OooOo00;
            if (textView2 != null) {
                textView2.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
                return;
            }
            return;
        }
        TextView textView3 = this.f27287OooOo00;
        if (textView3 != null) {
            textView3.setEnabled(false);
        }
        TextView textView4 = this.f27287OooOo00;
        if (textView4 != null) {
            textView4.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        OooOoO0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Date time;
        String str;
        List<ProfileLimitModel> profileLimit;
        List<UserInfo.TagInfo> list;
        super.onCreate(bundle);
        setContentView(OooOoO().f58076OooO00o);
        Intent intent = getIntent();
        if (intent.hasExtra(ViewHierarchyConstants.TAG_KEY) && intent.getSerializableExtra(ViewHierarchyConstants.TAG_KEY) != null) {
            Serializable serializableExtra = intent.getSerializableExtra(ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.user.UserInfoModel");
            this.f27295OooOooO = (UserInfoModel) serializableExtra;
        }
        UserInfoModel userInfoModel = this.f27295OooOooO;
        if (userInfoModel != null) {
            p592o0oo00O.OooOOO0.OooO0o("loadIntent \nuserInfoModel = " + userInfoModel);
        }
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.profile);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo00(new oO000o00(this));
        }
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        TextView textViewOooOoO0 = headerLayout3 != null ? headerLayout3.OooOoO0(oO00OOo0.Save, new oO0O0OoO(this)) : null;
        this.f27287OooOo00 = textViewOooOoO0;
        if (textViewOooOoO0 != null) {
            textViewOooOoO0.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
        }
        OooOoO().f58083OooO0oo.setOnClickListener(new oO00O0o0(this));
        OooOoO().f58082OooO0oO.setOnClickListener(new p496o0o00o.oO00O0o(this));
        OooOoO().f58077OooO0O0.setOnLongClickListener(new oO00000o());
        OooOoO().f58077OooO0O0.setLongClickable(false);
        OooOoO().f58077OooO0O0.setTextIsSelectable(false);
        OooOoO().f58077OooO0O0.setCustomSelectionActionModeCallback(new p496o0o00o.oOo00OO0());
        OooOoO().f58077OooO0O0.addTextChangedListener(new p496o0o00o.oO00O0oO(this));
        findViewById(oO00O0oO.cl_userinfo_edit_gender).setOnClickListener(new p496o0o00o.oO00OO0O(this));
        findViewById(oO00O0oO.cl_userinfo_edit_birthday).setOnClickListener(new oO00OOO(this));
        findViewById(oO00O0oO.cl_userinfo_edit_country).setOnClickListener(new Oooo0(this));
        findViewById(oO00O0oO.cl_userinfo_edit_tag).setOnClickListener(new ooOOOOoo(this));
        findViewById(oO00O0oO.cl_userinfo_edit_sign).setOnClickListener(new oO0OOo0o(this));
        new p367o0OOo0o0.OooOO0(this).f43963OooO0o = new oO000Oo0(this);
        OooOoO().f58079OooO0Oo.setOnClickListener(new oO000Oo(this));
        this.f27300Oooo00o = o0000.OooO0O0(p584o0oOooO0.oOo00OO0.icon_userinfo_edit_photo);
        this.f27297Oooo0 = o0000.OooO0O0(p584o0oOooO0.oOo00OO0.icon_userinfo_edit_photo_gray);
        this.f27301Oooo0O0 = getResources().getDrawable(p584o0oOooO0.oOo00OO0.common_warning_tip);
        this.f27302Oooo0OO = getResources().getString(oO00OOo0.name);
        this.f27304Oooo0o0 = getResources().getString(oO00OOo0.Userinfo_edit_bio);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String str2 = (String) ((MutableLiveData) o000000O.f46699OooOoOO.getValue()).getValue();
        Intrinsics.checkNotNullParameter("yyyy-MM-dd", "fromFormat");
        try {
            time = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(str2);
        } catch (Exception e) {
            e.printStackTrace();
            time = Calendar.getInstance().getTime();
        }
        this.f27286OooOo0 = time;
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        o000000O o000000o3 = o000000O.f46674OooO00o;
        T value = o000000O.OooO().getValue();
        Intrinsics.checkNotNull(value);
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo((String) value);
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(OooOoO().f58083OooO0oo);
        OooOoO().f58077OooO0O0.setText((CharSequence) o000000O.OooOOoo().getValue());
        OooOoO().f58077OooO0O0.setSelection(OooOoO().f58077OooO0O0.length());
        OooOoO().f58077OooO0O0.clearFocus();
        TextView textView = OooOoO().f58085OooOO0O;
        Object value2 = o000000O.OooOOO().getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(value2);
        textView.setText(OooOoOO(sb.toString()));
        TextView textView2 = OooOoO().f58075OooO;
        Date date = this.f27286OooOo0;
        Intrinsics.checkNotNullParameter("dd-MM-yyyy", "formatString");
        if (date != null) {
            str = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format.format(value)");
        } else {
            str = "";
        }
        textView2.setText(str);
        Lazy lazy = o000000O.f46698OooOoO0;
        if (((MutableLiveData) lazy.getValue()).getValue() != 0 && (list = (List) ((MutableLiveData) lazy.getValue()).getValue()) != null) {
            OooOooo(list);
        }
        OooOoO().f58088OooOOO0.setText((CharSequence) ((MutableLiveData) o000000O.f46697OooOoO.getValue()).getValue());
        o000000O.OooO().observe(this, new OooO00o(new oO000(this)));
        ((MutableLiveData) lazy.getValue()).observe(this, new OooO00o(new oO000O0(this)));
        LiveEventBus.get("UserSign").observe(this, new oO000O0O(this));
        o000000O.OooO0OO().observe(this, new OooO00o(new oO0Ooooo(this)));
        LiveEventBus.get("UserHeaderUrl").observe(this, new oO0o0o(this));
        MutableLiveData<ProfileLimitModel> mutableLiveData = this.f27296OooOooo;
        mutableLiveData.observe(this, new OooO00o(new oO0OoOO0(this)));
        MutableLiveData<ProfileLimitModel> mutableLiveData2 = this.f27298Oooo000;
        mutableLiveData2.observe(this, new OooO00o(new oO0Oo0oo(this)));
        MutableLiveData<ProfileLimitModel> mutableLiveData3 = this.f27299Oooo00O;
        mutableLiveData3.observe(this, new OooO00o(new oO000OOo(this)));
        mutableLiveData.setValue(null);
        mutableLiveData2.setValue(null);
        mutableLiveData3.setValue(null);
        UserInfoModel userInfoModel2 = this.f27295OooOooO;
        if (userInfoModel2 == null || (profileLimit = userInfoModel2.getProfileLimit()) == null) {
            return;
        }
        for (ProfileLimitModel profileLimitModel : profileLimit) {
            int operationType = profileLimitModel.getOperationType();
            if (operationType == 1) {
                mutableLiveData.setValue(profileLimitModel);
            } else if (operationType == 2) {
                mutableLiveData2.setValue(profileLimitModel);
            } else if (operationType == 3) {
                mutableLiveData3.setValue(profileLimitModel);
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        OooOoo();
    }
}
