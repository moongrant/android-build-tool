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
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.adapter.o00O00O;
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
import p157o00OoOO0.o0OO00O;
import p200o00o0o.o00O00;
import p377o0OOoOo.o0000OO0;
import p377o0OOoOo.o000O000;
import p464o0Oooo.o000000O;
import p496o0o00o.o0O000;
import p496o0o00o.o0O00000;
import p496o0o00o.o0O0000O;
import p496o0o00o.o0O000Oo;
import p496o0o00o.o0OoOoOo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.ba;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserDefaultHeadActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDefaultHeadActivity.kt\ncom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n22#2,2:186\n75#3,13:188\n1#4:201\n*S KotlinDebug\n*F\n+ 1 UserDefaultHeadActivity.kt\ncom/yalla/yalla/ui/activity/user/UserDefaultHeadActivity\n*L\n42#1:186,2\n43#1:188,13\n*E\n"})
public final class UserDefaultHeadActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f27215OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public UserDefaultHeadListModel.UserDefaultHeadItemModel f27220OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27216OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ba.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27219OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f27227OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27227OooO0Oo;
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
    public final Lazy f27218OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f27221OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f27217OooOo = -1;

    public static final class OooO00o extends Lambda implements Function1<UserEditResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserDefaultHeadListModel.UserDefaultHeadItemModel f27222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserDefaultHeadActivity f27223OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel, UserDefaultHeadActivity userDefaultHeadActivity) {
            super(1);
            this.f27222OooO0Oo = userDefaultHeadItemModel;
            this.f27223OooO0o0 = userDefaultHeadActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UserEditResult userEditResult) {
            if (userEditResult != null) {
                o0OO000.OooO00o("105068");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                MutableLiveData mutableLiveDataOooO = o000000O.OooO();
                UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = this.f27222OooO0Oo;
                mutableLiveDataOooO.postValue(userDefaultHeadItemModel.getUrl());
                LiveEventBus.get("UserHeaderUrl").post(userDefaultHeadItemModel.getUrl());
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_edit_success);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
                this.f27223OooO0o0.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O00O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00O invoke() {
            UserDefaultHeadActivity userDefaultHeadActivity = UserDefaultHeadActivity.this;
            final o00O00O o00o00o2 = new o00O00O(userDefaultHeadActivity, userDefaultHeadActivity.f27221OooOo0o);
            o00o00o2.f10098OooO0o = new o00O00(userDefaultHeadActivity, o00o00o2);
            userDefaultHeadActivity.OooOoO0().f57606OooO0OO.setAdapter(o00o00o2);
            o00o00o2.f10112OooOo0 = new BaseQuickAdapter.OooOO0O() { // from class: o0o00o.o0O000O
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0O
                public final int OooO00o(GridLayoutManager gridLayoutManager, int i) {
                    o00O00O this_apply = o00o00o2;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    return ((oOO00O) this_apply.f10111OooOOoo.get(i)).f27691OooO0Oo;
                }
            };
            return o00o00o2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOo(UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel) {
        o000O000.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) this.f27219OooOo00.getValue(), null, null, null, null, null, null, Long.valueOf(userDefaultHeadItemModel.getId()), null, 191, null), this, false, null, null, new OooO00o(userDefaultHeadItemModel, this), 14);
    }

    public final void OooOoO(String str) {
        if (str != null) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(str);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(OooOoO0().f57605OooO0O0);
        }
    }

    public final ba OooOoO0() {
        return (ba) this.f27216OooOOoo.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        TextView f30473OoooOOo;
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null && (f30473OoooOOo = headerLayout.getF30473OoooOOo()) != null) {
            z = f30473OoooOOo.isClickable();
        }
        if (!z) {
            finish();
            return;
        }
        o0OO00O o0oo00o2 = new o0OO00O(this);
        o0oo00o2.OooOOoo(oO00OOo0.UserInfoTag_ChangeTag_HintContent);
        int i = oO00OOo0.Save;
        o0oo00o2.OooOOOO(i);
        o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Discard));
        o0oo00o2.OooOOOO(i);
        o0oo00o2.OooOo0(new o0OoOoOo(this));
        o0oo00o2.OooOo0O(new o0O000Oo(this));
        o0oo00o2.OooOO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TextView f30473OoooOOo;
        super.onCreate(bundle);
        setContentView(OooOoO0().f57604OooO00o);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.header_default_url_title);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOoO0(oO00OOo0.Save, new View.OnClickListener() { // from class: o0o00o.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = UserDefaultHeadActivity.f27215OooOoO0;
                    UserDefaultHeadActivity this$0 = this.f48978OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = this$0.f27220OooOo0O;
                    if (userDefaultHeadItemModel != null) {
                        this$0.OooOo(userDefaultHeadItemModel);
                    }
                }
            });
        }
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        TextView f30473OoooOOo2 = headerLayout3 != null ? headerLayout3.getF30473OoooOOo() : null;
        if (f30473OoooOOo2 != null) {
            f30473OoooOOo2.setClickable(false);
        }
        HeaderLayout headerLayout4 = this.f22755OooOO0;
        if (headerLayout4 != null && (f30473OoooOOo = headerLayout4.getF30473OoooOOo()) != null) {
            f30473OoooOOo.setTextColor(-1962934273);
        }
        OooOoO0().f57606OooO0OO.setLayoutManager(new GridLayoutManager(this, 4));
        o000000O o000000o2 = o000000O.f46674OooO00o;
        OooOoO((String) o000000O.OooO().getValue());
        OooOoO0().f57607OooO0Oo.OooO0oo();
        ((UserInfoEditVM) this.f27219OooOo00.getValue()).getAvatarList().observe(this, new o0000OO0(new o0O00000(this), new o0O0000O(this), new o0O000(this), false, 8));
    }
}
