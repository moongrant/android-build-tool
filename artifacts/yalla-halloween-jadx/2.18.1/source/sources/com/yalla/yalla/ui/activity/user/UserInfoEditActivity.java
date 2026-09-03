package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.model.ProfileLimitModel;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.common.vm.UserInfoEditVM;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p142o00OOooO.o0000OO0;
import p142o00OOooO.o000O;
import p142o00OOooO.o000O000;
import p142o00OOooO.o000O0o;
import p142o00OOooO.o000OO0O;
import p142o00OOooO.o000Oo0;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o000OOo;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p193o00o0O00.Oooo0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p470o0Oooo0.o00;
import p470o0Oooo0.o00O000;
import p501o0o00o.o0ooOOo;
import p515o0o0O00.o00O00;
import p516o0o0O000.o000oOoO;
import p566o0oOo00O.o0O;
import p566o0oOo00O.o0O0oo00;
import p566o0oOo00O.o0OO0;
import p566o0oOo00O.o0OO000;
import p566o0oOo00O.o0OO000o;
import p566o0oOo00O.o0OO00OO;
import p566o0oOo00O.o0OO00o0;
import p566o0oOo00O.o0OO0O0;
import p566o0oOo00O.o0OO0o00;
import p566o0oOo00O.o0OOO0;
import p566o0oOo00O.o0OOO0OO;
import p566o0oOo00O.o0OOOO00;
import p566o0oOo00O.o0OOooO0;
import p566o0oOo00O.o0oOo0O0;
import p566o0oOo00O.oo0oO0;
import p566o0oOo00O.oo0ooO;
import p616o0oo0Ooo.oO0O00;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;
import p649o0ooOOoo.rh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserInfoEditActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoEditActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23493o0ooOOo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public TextView f23495Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public Date f23496Ooooo0o;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public String f23499OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public String f23500Oooooo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public String f23502OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public String f23503Ooooooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @Nullable
    public Drawable f23507o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @Nullable
    public String f23508o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @Nullable
    public String f23509o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @Nullable
    public Drawable f23510o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public List<UserInfo.TagInfo> f23511o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @Nullable
    public Drawable f23513oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public UserInfoModel f23514ooOO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23494OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(rh.class), this, null);

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final Calendar f23497OooooO0 = Calendar.getInstance();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23498OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoEditActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23520Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23520Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f23501Oooooo0 = 1;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f23504o00O0O = new MutableLiveData<>();

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f23505o00Oo0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f23506o00Ooo = new MutableLiveData<>();

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final ArrayList<SelectDialogModel<String>> f23512o0ooOO0 = new ArrayList<>();

    public static final class OooO00o {
        @JvmStatic
        public final void OooO00o(@NotNull Context context, @Nullable UserInfoModel userInfoModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserInfoEditActivity.class);
            if (userInfoModel != null) {
                intent.putExtra(ViewHierarchyConstants.TAG_KEY, userInfoModel);
            }
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends o00OO0O0.OooO0O0 {
        public OooO0O0(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            UserInfoEditActivity.this.OooOoO();
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            UserInfoEditActivity userInfoEditActivity = UserInfoEditActivity.this;
            if (userInfoEditActivity.f23500Oooooo != null) {
                MutableLiveData<String> mutableLiveDataOooOoO = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOoO();
                String str = userInfoEditActivity.f23500Oooooo;
                mutableLiveDataOooOoO.postValue(str != null ? StringsKt.trim((CharSequence) str).toString() : null);
            }
            String str2 = userInfoEditActivity.f23502OoooooO;
            if (str2 != null) {
                p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOOo().postValue(Integer.valueOf(str2));
            }
            if (userInfoEditActivity.f23503Ooooooo != null) {
                p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0O0().postValue(userInfoEditActivity.f23503Ooooooo);
            }
            LiveEventBus.get("UserInfoEditChange").post(Boolean.TRUE);
            UserInfoEditActivity.this.OooOoO();
            ToastUtil.f12567OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Userinfo_edit_success));
            UserInfoEditActivity.this.finish();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoEditActivity userInfoEditActivity = UserInfoEditActivity.this;
            OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
            userInfoEditActivity.OooOooo().f50499OooO0oo.setEnabled(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {
        public OooO0o() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0052  */
        /* JADX WARN: Code duplicated, block: B:20:0x005e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0069  */
        /* JADX WARN: Code duplicated, block: B:24:0x0072  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Pair<Integer, Integer> value;
            int iIntValue;
            if (bool.booleanValue()) {
                p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
                boolean z = false;
                if (value2 != null && value2.getFirst().intValue() == VipState.Vip.getValue()) {
                    value = oooOOO.OooO().getValue();
                    if (value != null) {
                        iIntValue = value.getSecond().intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= VipLevel.Vip3.getValue()) {
                        z = true;
                    }
                } else {
                    Pair<Integer, Integer> value3 = oooOOO.OooO().getValue();
                    if (value3 != null && value3.getFirst().intValue() == VipState.VipHide.getValue()) {
                        value = oooOOO.OooO().getValue();
                        if (value != null) {
                            iIntValue = value.getSecond().intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue >= VipLevel.Vip3.getValue()) {
                            z = true;
                        }
                    }
                }
                UserInfoEditActivity userInfoEditActivity = UserInfoEditActivity.this;
                Oooo0.f33130OooO00o.OooO0O0(userInfoEditActivity, 1.0f, 1.0f, z, false, new OooOO0O(userInfoEditActivity));
                UserInfoEditActivity userInfoEditActivity2 = UserInfoEditActivity.this;
                OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
                userInfoEditActivity2.OooOooo().f50499OooO0oo.setEnabled(true);
            } else {
                UserInfoEditActivity userInfoEditActivity3 = UserInfoEditActivity.this;
                OooO00o oooO00o2 = UserInfoEditActivity.f23493o0ooOOo;
                userInfoEditActivity3.OooOooo().f50499OooO0oo.setEnabled(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOoo(UserInfoEditActivity userInfoEditActivity) {
        if (com.yalla.support.common.util.OooO0OO.OooO00o(StringsKt.trim((CharSequence) userInfoEditActivity.OooOooo().f50493OooO0O0.getText().toString()).toString())) {
            ToastUtil.f12567OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Userinfo_edit_username_empty));
            return;
        }
        BaseActivityK.OooOoo0(userInfoEditActivity, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.setting), 0L, 2, null);
        if (userInfoEditActivity.f23499OooooOo == null) {
            if (userInfoEditActivity.Oooo00O()) {
                userInfoEditActivity.Oooo0();
            }
        } else {
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o000OOo o000ooo2 = o00000OO.f32209OooO0OO;
            String strOooO0O0 = kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o);
            int i = userInfoEditActivity.f23501Oooooo0;
            String str = userInfoEditActivity.f23499OooooOo;
            o000ooo2.OooO00o(userInfoEditActivity, strOooO0O0, i, str != null ? CloudImageUtilKt.imgRemoveHost(str) : null, new o0OOO0(userInfoEditActivity));
        }
    }

    public final void OooOooO() {
        Oooo00o();
        if (!Oooo00O()) {
            finish();
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOo0(R.string.Save_all_edits);
        oo0ooo0.OooOoO0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Discard));
        oo0ooo0.OooOo(new o0OOO0OO(this));
        oo0ooo0.OooOOOo(R.string.Save);
        oo0ooo0.OooOo0o(new o0OOOO00(this));
        oo0ooo0.OooOOO0();
    }

    public final rh OooOooo() {
        return (rh) this.f23494OoooOoo.getValue();
    }

    public final void Oooo0() {
        HashMap map = new HashMap();
        String str = this.f23500Oooooo;
        if (str != null) {
            String strOooO0O0 = o000oOoO.OooO0O0(str != null ? StringsKt.trim((CharSequence) str).toString() : null);
            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(newName?.trim())");
            map.put("nickname", strOooO0O0);
        }
        String str2 = this.f23502OoooooO;
        if (str2 != null) {
            map.put("sex", str2);
        }
        String str3 = this.f23503Ooooooo;
        if (str3 != null) {
            map.put("birthday", str3);
        }
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32209OooO0OO.OooO0O0(this, map, new OooO0O0(this));
    }

    public final String Oooo000(String str) {
        if (Intrinsics.areEqual(str, "1")) {
            String string = getString(R.string.male);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.male)");
            return string;
        }
        if (Intrinsics.areEqual(str, FeedbackType.Suggestions)) {
            String string2 = getString(R.string.sex);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sex)");
            return string2;
        }
        String string3 = getString(R.string.female);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.female)");
        return string3;
    }

    public final boolean Oooo00O() {
        return (this.f23500Oooooo == null && this.f23499OooooOo == null && this.f23502OoooooO == null && this.f23503Ooooooo == null) ? false : true;
    }

    public final void Oooo00o() {
        EditText view = OooOooo().f50493OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }

    public final void Oooo0O0(List<UserInfo.TagInfo> list) {
        this.f23511o0OoOo0 = list;
        OooOooo().f50494OooO0OO.removeAllViews();
        if (!com.yalla.support.common.util.OooO0OO.OooO0O0(list)) {
            OooOooo().f50505OooOOOO.setVisibility(0);
            return;
        }
        OooOooo().f50505OooOOOO.setVisibility(8);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View viewInflate = View.inflate(this, R.layout.item_flow_tag_userinfo, null);
            ((TextView) viewInflate.findViewById(R.id.tv_tag_flow_userinfo)).setText(list.get(i).getTagName());
            OooOooo().f50494OooO0OO.addView(viewInflate);
        }
    }

    public final void Oooo0OO() {
        OooOooo().f50499OooO0oo.setEnabled(false);
        o0O0O00.OooO0OO(this, oo0o0Oo.f48607OooO0O0, new OooO0OO(), new OooO0o());
    }

    public final void Oooo0o0() {
        if (Oooo00O()) {
            TextView textView = this.f23495Ooooo00;
            if (textView != null) {
                textView.setEnabled(true);
            }
            TextView textView2 = this.f23495Ooooo00;
            if (textView2 != null) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
                return;
            }
            return;
        }
        TextView textView3 = this.f23495Ooooo00;
        if (textView3 != null) {
            textView3.setEnabled(false);
        }
        TextView textView4 = this.f23495Ooooo00;
        if (textView4 != null) {
            textView4.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        OooOooO();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Date time;
        List<ProfileLimitModel> profileLimit;
        List<UserInfo.TagInfo> value;
        super.onCreate(bundle);
        setContentView(OooOooo().f50492OooO00o);
        Intent intent = getIntent();
        if (intent.hasExtra(ViewHierarchyConstants.TAG_KEY) && intent.getSerializableExtra(ViewHierarchyConstants.TAG_KEY) != null) {
            Serializable serializableExtra = intent.getSerializableExtra(ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.common.model.UserInfoModel");
            this.f23514ooOO = (UserInfoModel) serializableExtra;
        }
        if (this.f23514ooOO != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("loadIntent \nuserInfoModel = ");
            sbOooO0o0.append(this.f23514ooOO);
            o00O00.OooO0oO(sbOooO0o0.toString());
        }
        OooOo0O(1);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.profile);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoO0(new oo0oO0(this));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        TextView textViewOooOoo0 = headerLayout3 != null ? headerLayout3.OooOoo0(R.string.Save, new oo0ooO(this)) : null;
        this.f23495Ooooo00 = textViewOooOoo0;
        if (textViewOooOoo0 != null) {
            textViewOooOoo0.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
        }
        OooOooo().f50499OooO0oo.setOnClickListener(new o0OO00OO(this));
        OooOooo().f50498OooO0oO.setOnClickListener(new o0OO00o0(this));
        OooOooo().f50493OooO0O0.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oOo00O.o0O0o000
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                UserInfoEditActivity.OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
                return true;
            }
        });
        OooOooo().f50493OooO0O0.setLongClickable(false);
        OooOooo().f50493OooO0O0.setTextIsSelectable(false);
        OooOooo().f50493OooO0O0.setCustomSelectionActionModeCallback(new o0OO0());
        OooOooo().f50493OooO0O0.addTextChangedListener(new o0OO0O0(this));
        findViewById(R.id.cl_userinfo_edit_gender).setOnClickListener(new o0OOooO0(this));
        findViewById(R.id.cl_userinfo_edit_birthday).setOnClickListener(new o0OO0o00(this));
        findViewById(R.id.cl_userinfo_edit_country).setOnClickListener(new o0oOo0O0(this));
        findViewById(R.id.cl_userinfo_edit_tag).setOnClickListener(new o0O0oo00(this));
        findViewById(R.id.cl_userinfo_edit_sign).setOnClickListener(new o0O(this));
        new o00(this).f40619OooO0o0 = new o0OO000(this);
        OooOooo().f50495OooO0Oo.setOnClickListener(new o0OO000o(this));
        this.f23507o00o0O = o000O0O0.OooO0O0(R.drawable.icon_userinfo_edit_photo);
        this.f23510o00ooo = o000O0O0.OooO0O0(R.drawable.icon_userinfo_edit_photo_gray);
        this.f23513oo000o = getResources().getDrawable(R.drawable.common_warning_tip);
        this.f23509o00oO0o = getResources().getString(R.string.name);
        this.f23508o00oO0O = getResources().getString(R.string.Userinfo_edit_bio);
        String value2 = p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0O0().getValue();
        Intrinsics.checkNotNullParameter("yyyy-MM-dd", "fromFormat");
        try {
            time = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(value2);
        } catch (Exception e) {
            e.printStackTrace();
            time = Calendar.getInstance().getTime();
        }
        this.f23496Ooooo0o = time;
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        String value3 = oooOOO.OooO0oo().getValue();
        Intrinsics.checkNotNull(value3);
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(value3);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(OooOooo().f50499OooO0oo);
        OooOooo().f50493OooO0O0.setText(oooOOO.OooOoO().getValue());
        OooOooo().f50493OooO0O0.setSelection(OooOooo().f50493OooO0O0.length());
        OooOooo().f50493OooO0O0.clearFocus();
        TextView textView = OooOooo().f50501OooOO0O;
        StringBuilder sb = new StringBuilder();
        sb.append(oooOOO.OooOOOo().getValue());
        String str = "";
        sb.append("");
        textView.setText(Oooo000(sb.toString()));
        TextView textView2 = OooOooo().f50491OooO;
        Date date = this.f23496Ooooo0o;
        Intrinsics.checkNotNullParameter("dd-MM-yyyy", "formatString");
        if (date != null) {
            str = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format.format(value)");
        }
        textView2.setText(str);
        if (oooOOO.OooOOoo().getValue() != null && (value = oooOOO.OooOOoo().getValue()) != null) {
            Oooo0O0(value);
        }
        OooOooo().f50504OooOOO0.setText(oooOOO.OooOOo().getValue());
        int i = 5;
        oooOOO.OooO0oo().observe(this, new o0000OO0(this, i));
        int i2 = 3;
        oooOOO.OooOOoo().observe(this, new o000O0o(this, i2));
        LiveEventBus.get("UserSign").observe(this, new o000Oo0(this, 8));
        oooOOO.OooO0Oo().observe(this, new o000O000(this, i));
        LiveEventBus.get("UserHeaderUrl").observe(this, new o0ooOOo(this, i2));
        int i3 = 4;
        this.f23504o00O0O.observe(this, new o000O(this, i3));
        this.f23505o00Oo0.observe(this, new o000OO0O(this, i3));
        this.f23506o00Ooo.observe(this, new p142o00OOooO.o000O0O0(this, i));
        this.f23504o00O0O.setValue(null);
        this.f23505o00Oo0.setValue(null);
        this.f23506o00Ooo.setValue(null);
        UserInfoModel userInfoModel = this.f23514ooOO;
        if (userInfoModel == null || (profileLimit = userInfoModel.getProfileLimit()) == null) {
            return;
        }
        for (ProfileLimitModel profileLimitModel : profileLimit) {
            int operationType = profileLimitModel.getOperationType();
            if (operationType == 1) {
                this.f23504o00O0O.setValue(profileLimitModel);
            } else if (operationType == 2) {
                this.f23505o00Oo0.setValue(profileLimitModel);
            } else if (operationType == 3) {
                this.f23506o00Ooo.setValue(profileLimitModel);
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Oooo00o();
    }
}
