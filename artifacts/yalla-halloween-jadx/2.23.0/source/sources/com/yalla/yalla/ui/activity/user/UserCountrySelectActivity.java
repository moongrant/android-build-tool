package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0Oo;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.model.user.CountryItemList;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oO0OoOO0;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.i0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserCountrySelectActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserCountrySelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCountrySelectActivity.kt\ncom/yalla/yalla/ui/activity/user/UserCountrySelectActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,203:1\n22#2,2:204\n75#3,13:206\n*S KotlinDebug\n*F\n+ 1 UserCountrySelectActivity.kt\ncom/yalla/yalla/ui/activity/user/UserCountrySelectActivity\n*L\n39#1:204,2\n40#1:206,13\n*E\n"})
public final class UserCountrySelectActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f27200OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f27205OooOo0O;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f27208OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27201OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(i0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27204OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserCountrySelectActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserCountrySelectActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserCountrySelectActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27213OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27213OooO0Oo;
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
    public final Lazy f27203OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f27206OooOo0o = LazyKt.lazy(OooO0OO.f27210OooO0Oo);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f27202OooOo = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f27207OooOoO = -1;

    public static final class OooO00o {
        @JvmStatic
        public static void OooO00o(@Nullable Context context, boolean z, boolean z2) {
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) UserCountrySelectActivity.class);
                intent.putExtra("hot", z);
                intent.putExtra("KEY_ROOM", z2);
                context.startActivity(intent);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooO0o> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0o invoke() {
            return new OooO0o(UserCountrySelectActivity.this, oO00OO0O.item_country_select);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<List<CountryModel>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f27210OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<CountryModel> invoke() {
            return new ArrayList();
        }
    }

    public final OooO0o OooOo() {
        return (OooO0o) this.f27203OooOo0.getValue();
    }

    public final void OooOoO0() {
        List<CountryItemData> arrayList;
        if (this.f27202OooOo) {
            CountryItemList countryItemListOooO0OO = new oO0OoOO0().OooO0OO();
            if (countryItemListOooO0OO == null || (arrayList = countryItemListOooO0OO.getHot()) == null) {
                arrayList = new ArrayList<>();
            }
            if (com.code.android.util.OooOo00.OooO0O0(arrayList)) {
                this.f27205OooOo0O = arrayList.size();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        CountryModel countryModel = new CountryModel();
                        countryModel.setHotico("1");
                        countryModel.setCid(String.valueOf(arrayList.get(size).getId()));
                        countryModel.setName(arrayList.get(size).getCountryName());
                        OooOo().OooO00o(countryModel);
                        if (i < 0) {
                            break;
                        } else {
                            size = i;
                        }
                    }
                }
            }
            OooOo().Oooo00o();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000O0Oo o000o0oo2 = this.f27201OooOOoo;
        setContentView(((i0) o000o0oo2.getValue()).f58095OooO00o);
        this.f27202OooOo = getIntent().getBooleanExtra("hot", true);
        this.f27208OooOoO0 = getIntent().getBooleanExtra("KEY_ROOM", false);
        OooOOoo(oO00OOo0.countries);
        OooOOo0(1);
        ArrayList<CountryModel> arrayList = com.yalla.yalla.app.golbalData.OooO00o.f22728OooO0O0;
        if (com.code.android.util.OooOo00.OooO00o(arrayList)) {
            OooO listener = new OooO(this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            com.yalla.yalla.app.golbalData.OooO00o.OooO0O0(listener);
        } else {
            Lazy lazy = this.f27206OooOo0o;
            ((List) lazy.getValue()).addAll(arrayList);
            OooOo().OooOoO0((List) lazy.getValue());
            OooOoO0();
        }
        OooOo().Oooo000(oO00OOo0.no_data);
        OooOo().OooOooo(oOo00OO0.ic_empty_message_system);
        ((i0) o000o0oo2.getValue()).f58096OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        ((i0) o000o0oo2.getValue()).f58096OooO0O0.setAdapter(OooOo());
    }
}
