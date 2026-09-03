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
import com.code.android.util.o000O00O;
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
import p205o00o0o0o.o000O;
import p371o0OOo0oO.o0OOO0o;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p384o0OOoo0O.o0ooOOo;
import p405o0Oo0OOO.w1;
import p475o0Ooooo0.o0O00oO0;
import p491o0o00O0o.o0000Ooo;
import p492o0o00OO0.oO0Ooooo;
import p506o0o00oOo.a;
import p506o0o00oOo.b0;
import p506o0o00oOo.c0;
import p506o0o00oOo.d0;
import p506o0o00oOo.e;
import p506o0o00oOo.e0;
import p506o0o00oOo.f;
import p506o0o00oOo.g;
import p506o0o00oOo.h;
import p506o0o00oOo.i;
import p506o0o00oOo.j;
import p506o0o00oOo.k;
import p506o0o00oOo.l;
import p506o0o00oOo.m;
import p506o0o00oOo.n;
import p506o0o00oOo.p;
import p506o0o00oOo.q;
import p506o0o00oOo.r;
import p506o0o00oOo.s;
import p506o0o00oOo.t;
import p506o0o00oOo.u;
import p506o0o00oOo.v;
import p506o0o00oOo.w;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.oOOO00;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserInfoEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,875:1\n22#2,2:876\n75#3,13:878\n1#4:891\n1855#5,2:892\n*S KotlinDebug\n*F\n+ 1 UserInfoEditActivity.kt\ncom/yalla/yalla/ui/activity/user/UserInfoEditActivity\n*L\n89#1:876,2\n96#1:878,13\n176#1:892,2\n*E\n"})
public final class UserInfoEditActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ int f26818Oooo0oO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public String f26820OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public Date f26821OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public TextView f26822OooOo00;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public String f26825OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public String f26827OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public List<UserInfo.TagInfo> f26828OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public String f26829OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public UserInfoModel f26830OooOooO;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public Drawable f26832Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public Drawable f26835Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public Drawable f26836Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public String f26837Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public String f26839Oooo0o0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26819OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(w1.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final Calendar f26823OooOo0O = Calendar.getInstance();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26824OooOo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26844OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26844OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26826OooOoO0 = 1;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f26831OooOooo = new MutableLiveData<>();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f26833Oooo000 = new MutableLiveData<>();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f26834Oooo00O = new MutableLiveData<>();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList<SelectDialogModel<String>> f26838Oooo0o = new ArrayList<>();

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26840OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26840OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26840OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26840OooO0Oo;
        }

        public final int hashCode() {
            return this.f26840OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26840OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo(final UserInfoEditActivity userInfoEditActivity) {
        if (com.code.android.util.OooOo00.OooO00o(StringsKt.trim((CharSequence) userInfoEditActivity.OooOoO().f45657OooO0O0.getText().toString()).toString())) {
            String strOooO0OO = o0000.OooO0OO(o000000.Userinfo_edit_username_empty);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
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
        BaseActivityK.OooOo0o(userInfoEditActivity, o0000.OooO0OO(o000000.setting), 0L, 2);
        if (userInfoEditActivity.f26820OooOo == null) {
            if (userInfoEditActivity.OooOoo0()) {
                userInfoEditActivity.OooOooO();
            }
        } else {
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strOooO00o = p004OooO0oO.o0OoOo0.OooO00o();
            int i = userInfoEditActivity.f26826OooOoO0;
            String str = userInfoEditActivity.f26820OooOo;
            o0ooOOo.OooO00o(userInfoEditActivity, strOooO00o, i, str != null ? p184o00o00O0.OooO0OO.OooO0o(str) : null, new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$saveHeaderUrl$1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@Nullable String str2, @Nullable String str3) {
                    super.OooO0O0(str2, str3);
                    this.f26841OooO0o0.OooOo0();
                    String strOooO0OO2 = o0000.OooO0OO(o000000.Profile_photo_upload_failed);
                    if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                    }
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Object objOooO0O0 = oOOO00.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$saveHeaderUrl$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(...)");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0O0;
                    if (TextUtils.isEmpty((CharSequence) absJavaBeanApi.getData())) {
                        return;
                    }
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    o0O00oO0.OooO().postValue(absJavaBeanApi.getData());
                    LiveEventBus.get("UserHeaderUrl").post(absJavaBeanApi.getData());
                    UserInfoEditActivity userInfoEditActivity2 = this.f26841OooO0o0;
                    userInfoEditActivity2.f26820OooOo = null;
                    if (userInfoEditActivity2.OooOoo0()) {
                        userInfoEditActivity2.OooOooO();
                        return;
                    }
                    LiveEventBus.get("UserInfoEditChange").post(Boolean.TRUE);
                    userInfoEditActivity2.OooOo0();
                    String strOooO0OO2 = o0000.OooO0OO(o000000.Userinfo_edit_success);
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                    userInfoEditActivity2.finish();
                }
            });
        }
    }

    public final w1 OooOoO() {
        return (w1) this.f26819OooOOoo.getValue();
    }

    public final void OooOoO0() {
        OooOoo();
        if (!OooOoo0()) {
            finish();
            return;
        }
        o000O o000o = new o000O(this);
        o000o.OooOOoo(o000000.Save_all_edits);
        o000o.OooOo0o(o0000.OooO0OO(o000000.Discard));
        o000o.OooOo0O(new d0(this));
        o000o.OooOOOO(o000000.Save);
        o000o.OooOo0(new e0(this));
        o000o.OooOO0o();
    }

    public final String OooOoOO(String str) {
        if (Intrinsics.areEqual(str, "1")) {
            String string = getString(o000000.male);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (Intrinsics.areEqual(str, FeedbackType.Suggestions)) {
            String string2 = getString(o000000.sex);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getString(o000000.female);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final void OooOoo() {
        EditText view = OooOoO().f45657OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "etName");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        kotlin.collections.OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
    }

    public final boolean OooOoo0() {
        return (this.f26825OooOoO == null && this.f26820OooOo == null && this.f26827OooOoOO == null && this.f26829OooOoo0 == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO() {
        p384o0OOoo0O.o00O0O.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) this.f26824OooOo0o.getValue(), this.f26825OooOoO, this.f26827OooOoOO, this.f26829OooOoo0, null, null, null, null, null, 248, null), this, false, new b0(this), null, new c0(this), 10);
    }

    public final void OooOooo(List<UserInfo.TagInfo> list) {
        this.f26828OooOoo = list;
        OooOoO().f45658OooO0OO.removeAllViews();
        if (!com.code.android.util.OooOo00.OooO0O0(list)) {
            OooOoO().f45669OooOOOO.setVisibility(0);
            return;
        }
        OooOoO().f45669OooOOOO.setVisibility(8);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View viewInflate = View.inflate(this, oo0o0Oo.item_flow_tag_userinfo, null);
            ((TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_tag_flow_userinfo)).setText(list.get(i).getTagName());
            OooOoO().f45658OooO0OO.addView(viewInflate);
        }
    }

    public final void Oooo000() {
        if (OooOoo0()) {
            TextView textView = this.f26822OooOo00;
            if (textView != null) {
                textView.setEnabled(true);
            }
            TextView textView2 = this.f26822OooOo00;
            if (textView2 != null) {
                textView2.setTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9));
                return;
            }
            return;
        }
        TextView textView3 = this.f26822OooOo00;
        if (textView3 != null) {
            textView3.setEnabled(false);
        }
        TextView textView4 = this.f26822OooOo00;
        if (textView4 != null) {
            textView4.setTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_999999));
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
        setContentView(OooOoO().f45656OooO00o);
        Intent intent = getIntent();
        if (intent.hasExtra(ViewHierarchyConstants.TAG_KEY) && intent.getSerializableExtra(ViewHierarchyConstants.TAG_KEY) != null) {
            Serializable serializableExtra = intent.getSerializableExtra(ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.user.UserInfoModel");
            this.f26830OooOooO = (UserInfoModel) serializableExtra;
        }
        UserInfoModel userInfoModel = this.f26830OooOooO;
        if (userInfoModel != null) {
            o0000O00.OooO0o("loadIntent \nuserInfoModel = " + userInfoModel);
        }
        int i = 1;
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(o000000.profile);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo00(new p(this));
        }
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        TextView textViewOooOoO0 = headerLayout3 != null ? headerLayout3.OooOoO0(o000000.Save, new q(this)) : null;
        this.f26822OooOo00 = textViewOooOoO0;
        if (textViewOooOoO0 != null) {
            textViewOooOoO0.setTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_999999));
        }
        OooOoO().f45663OooO0oo.setOnClickListener(new r(this));
        OooOoO().f45662OooO0oO.setOnClickListener(new s(this));
        OooOoO().f45657OooO0O0.setOnLongClickListener(new a());
        OooOoO().f45657OooO0O0.setLongClickable(false);
        OooOoO().f45657OooO0O0.setTextIsSelectable(false);
        OooOoO().f45657OooO0O0.setCustomSelectionActionModeCallback(new t());
        OooOoO().f45657OooO0O0.addTextChangedListener(new u(this));
        findViewById(p562o0oOo000.o0OO00O.cl_userinfo_edit_gender).setOnClickListener(new v(this));
        findViewById(p562o0oOo000.o0OO00O.cl_userinfo_edit_birthday).setOnClickListener(new w(this));
        findViewById(p562o0oOo000.o0OO00O.cl_userinfo_edit_country).setOnClickListener(new Oooo0(this));
        findViewById(p562o0oOo000.o0OO00O.cl_userinfo_edit_tag).setOnClickListener(new k(this));
        findViewById(p562o0oOo000.o0OO00O.cl_userinfo_edit_sign).setOnClickListener(new l(this));
        new p371o0OOo0oO.o0OoOo0(this).f43176OooO0o = new m(this);
        OooOoO().f45659OooO0Oo.setOnClickListener(new n(this));
        this.f26835Oooo00o = o0000.OooO0O0(o0Oo0oo.icon_userinfo_edit_photo);
        this.f26832Oooo0 = o0000.OooO0O0(o0Oo0oo.icon_userinfo_edit_photo_gray);
        this.f26836Oooo0O0 = getResources().getDrawable(o0Oo0oo.common_warning_tip);
        this.f26837Oooo0OO = getResources().getString(o000000.name);
        this.f26839Oooo0o0 = getResources().getString(o000000.Userinfo_edit_bio);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String str2 = (String) ((MutableLiveData) o0O00oO0.f47961OooOoOO.getValue()).getValue();
        Intrinsics.checkNotNullParameter("yyyy-MM-dd", "fromFormat");
        try {
            time = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(str2);
        } catch (Exception e) {
            e.printStackTrace();
            time = Calendar.getInstance().getTime();
        }
        this.f26821OooOo0 = time;
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
        oooO00o.OooO00o(d1.OooO0OO());
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        T value = o0O00oO0.OooO().getValue();
        Intrinsics.checkNotNull(value);
        oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo((String) value);
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(OooOoO().f45663OooO0oo);
        OooOoO().f45657OooO0O0.setText((CharSequence) o0O00oO0.OooOOoo().getValue());
        OooOoO().f45657OooO0O0.setSelection(OooOoO().f45657OooO0O0.length());
        OooOoO().f45657OooO0O0.clearFocus();
        TextView textView = OooOoO().f45665OooOO0O;
        Object value2 = o0O00oO0.OooOOO().getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(value2);
        textView.setText(OooOoOO(sb.toString()));
        TextView textView2 = OooOoO().f45655OooO;
        Date date = this.f26821OooOo0;
        Intrinsics.checkNotNullParameter("dd-MM-yyyy", "formatString");
        if (date != null) {
            str = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = "";
        }
        textView2.setText(str);
        Lazy lazy = o0O00oO0.f47960OooOoO0;
        if (((MutableLiveData) lazy.getValue()).getValue() != 0 && (list = (List) ((MutableLiveData) lazy.getValue()).getValue()) != null) {
            OooOooo(list);
        }
        OooOoO().f45668OooOOO0.setText((CharSequence) ((MutableLiveData) o0O00oO0.f47959OooOoO.getValue()).getValue());
        o0O00oO0.OooO().observe(this, new OooO00o(new e(this)));
        ((MutableLiveData) lazy.getValue()).observe(this, new OooO00o(new f(this)));
        LiveEventBus.get("UserSign").observe(this, new oO0Ooooo(this, i));
        o0O00oO0.OooO0OO().observe(this, new OooO00o(new g(this)));
        LiveEventBus.get("UserHeaderUrl").observe(this, new o0000Ooo(this, i));
        MutableLiveData<ProfileLimitModel> mutableLiveData = this.f26831OooOooo;
        mutableLiveData.observe(this, new OooO00o(new h(this)));
        MutableLiveData<ProfileLimitModel> mutableLiveData2 = this.f26833Oooo000;
        mutableLiveData2.observe(this, new OooO00o(new i(this)));
        MutableLiveData<ProfileLimitModel> mutableLiveData3 = this.f26834Oooo00O;
        mutableLiveData3.observe(this, new OooO00o(new j(this)));
        mutableLiveData.setValue(null);
        mutableLiveData2.setValue(null);
        mutableLiveData3.setValue(null);
        UserInfoModel userInfoModel2 = this.f26830OooOooO;
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
