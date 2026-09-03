package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.session.o000O0O0;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.adapter.o00O00OO;
import com.yalla.yalla.ui.adapter.oOO00O;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0OO;
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.q1;
import p475o0Ooooo0.o0O00oO0;
import p506o0o00oOo.oO0O0O00;
import p506o0o00oOo.oO0O0O0o;
import p506o0o00oOo.oOo0o0oO;
import p506o0o00oOo.oOo0oooO;
import p506o0o00oOo.ooOOO0Oo;
import p562o0oOo000.o000000;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserDefaultHeadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDefaultHeadActivity.kt\ncom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n22#2,2:186\n75#3,13:188\n1#4:201\n*S KotlinDebug\n*F\n+ 1 UserDefaultHeadActivity.kt\ncom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity\n*L\n42#1:186,2\n43#1:188,13\n*E\n"})
public final class UserDefaultHeadActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26750OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public UserDefaultHeadListModel.UserDefaultHeadItemModel f26755OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26751OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(q1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26754OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26762OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26762OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f26753OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f26756OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f26752OooOo = -1;

    public static final class OooO00o extends Lambda implements Function1<UserEditResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserDefaultHeadListModel.UserDefaultHeadItemModel f26757OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserDefaultHeadActivity f26758OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel, UserDefaultHeadActivity userDefaultHeadActivity) {
            super(1);
            this.f26757OooO0Oo = userDefaultHeadItemModel;
            this.f26758OooO0o0 = userDefaultHeadActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UserEditResult userEditResult) {
            if (userEditResult != null) {
                o0oo0000.OooO00o.OooO0O0("105068");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                MutableLiveData mutableLiveDataOooO = o0O00oO0.OooO();
                UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = this.f26757OooO0Oo;
                mutableLiveDataOooO.postValue(userDefaultHeadItemModel.getUrl());
                LiveEventBus.get("UserHeaderUrl").post(userDefaultHeadItemModel.getUrl());
                String strOooO0OO = o0000.OooO0OO(o000000.Userinfo_edit_success);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                this.f26758OooO0o0.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oOO00O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOO00O invoke() {
            final UserDefaultHeadActivity userDefaultHeadActivity = UserDefaultHeadActivity.this;
            final oOO00O ooo00o = new oOO00O(userDefaultHeadActivity, userDefaultHeadActivity.f26756OooOo0o);
            ooo00o.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o00oOo.oO0O0Oo0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    TextView f29928OoooOOo;
                    TextView f29928OoooOOo2;
                    TextView f29928OoooOOo3;
                    UserDefaultHeadActivity this$0 = userDefaultHeadActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    oOO00O this_apply = ooo00o;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    Object objOooOOO = baseQuickAdapter.OooOOO(i);
                    Intrinsics.checkNotNull(objOooOOO, "null cannot be cast to non-null type com.yalla.yalla.ui.adapter.UserDefaultHeadAdapterItem");
                    UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = ((o00O00OO) objOooOOO).f27129OooO0O0;
                    if (userDefaultHeadItemModel != null) {
                        this$0.f26752OooOo = i;
                        this_apply.f27230OooOoO = i;
                        this$0.f26755OooOo0O = userDefaultHeadItemModel;
                        String strOooO0Oo = OooO0OO.OooO0Oo(userDefaultHeadItemModel.getUrl());
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        if (Intrinsics.areEqual(strOooO0Oo, OooO0OO.OooO0Oo((String) o0O00oO0.OooO().getValue()))) {
                            HeaderLayout headerLayout = this$0.f22282OooOO0;
                            f29928OoooOOo = headerLayout != null ? headerLayout.getF29928OoooOOo() : null;
                            if (f29928OoooOOo != null) {
                                f29928OoooOOo.setClickable(false);
                            }
                            HeaderLayout headerLayout2 = this$0.f22282OooOO0;
                            if (headerLayout2 != null && (f29928OoooOOo2 = headerLayout2.getF29928OoooOOo()) != null) {
                                f29928OoooOOo2.setTextColor(-1962934273);
                            }
                        } else {
                            HeaderLayout headerLayout3 = this$0.f22282OooOO0;
                            f29928OoooOOo = headerLayout3 != null ? headerLayout3.getF29928OoooOOo() : null;
                            if (f29928OoooOOo != null) {
                                f29928OoooOOo.setClickable(true);
                            }
                            HeaderLayout headerLayout4 = this$0.f22282OooOO0;
                            if (headerLayout4 != null && (f29928OoooOOo3 = headerLayout4.getF29928OoooOOo()) != null) {
                                f29928OoooOOo3.setTextColor(-1);
                            }
                            this$0.OooOoO(userDefaultHeadItemModel.getUrl());
                        }
                        ((oOO00O) this$0.f26753OooOo0.getValue()).notifyDataSetChanged();
                    }
                }
            };
            userDefaultHeadActivity.OooOoO0().f45404OooO0OO.setAdapter(ooo00o);
            ooo00o.f13190OooOo0 = new o000O0O0(ooo00o);
            return ooo00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOo(UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel) {
        p384o0OOoo0O.o00O0O.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) this.f26754OooOo00.getValue(), null, null, null, null, null, null, Long.valueOf(userDefaultHeadItemModel.getId()), null, 191, null), this, false, null, null, new OooO00o(userDefaultHeadItemModel, this), 14);
    }

    public final void OooOoO(String str) {
        if (str != null) {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(str);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(OooOoO0().f45403OooO0O0);
        }
    }

    public final q1 OooOoO0() {
        return (q1) this.f26751OooOOoo.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        TextView f29928OoooOOo;
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null && (f29928OoooOOo = headerLayout.getF29928OoooOOo()) != null) {
            z = f29928OoooOOo.isClickable();
        }
        if (!z) {
            finish();
            return;
        }
        o000O o000o = new o000O(this);
        o000o.OooOOoo(o000000.UserInfoTag_ChangeTag_HintContent);
        int i = o000000.Save;
        o000o.OooOOOO(i);
        o000o.OooOo0o(o0000.OooO0OO(o000000.Discard));
        o000o.OooOOOO(i);
        o000o.OooOo0(new oOo0o0oO(this));
        o000o.OooOo0O(new ooOOO0Oo(this));
        o000o.OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TextView f29928OoooOOo;
        super.onCreate(bundle);
        setContentView(OooOoO0().f45402OooO00o);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(o000000.header_default_url_title);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOoO0(o000000.Save, new View.OnClickListener() { // from class: o0o00oOo.oO0O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = UserDefaultHeadActivity.f26750OooOoO0;
                    UserDefaultHeadActivity this$0 = this.f50471OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = this$0.f26755OooOo0O;
                    if (userDefaultHeadItemModel != null) {
                        this$0.OooOo(userDefaultHeadItemModel);
                    }
                }
            });
        }
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        TextView f29928OoooOOo2 = headerLayout3 != null ? headerLayout3.getF29928OoooOOo() : null;
        if (f29928OoooOOo2 != null) {
            f29928OoooOOo2.setClickable(false);
        }
        HeaderLayout headerLayout4 = this.f22282OooOO0;
        if (headerLayout4 != null && (f29928OoooOOo = headerLayout4.getF29928OoooOOo()) != null) {
            f29928OoooOOo.setTextColor(-1962934273);
        }
        OooOoO0().f45404OooO0OO.setLayoutManager(new GridLayoutManager(this, 4));
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooOoO((String) o0O00oO0.OooO().getValue());
        OooOoO0().f45405OooO0Oo.OooO0oo();
        ((UserInfoEditVM) this.f26754OooOo00.getValue()).getAvatarList().observe(this, new p384o0OOoo0O.o000oOoO(new oO0O0O00(this), new oO0O0O0o(this), new oOo0oooO(this), false, 8));
    }
}
