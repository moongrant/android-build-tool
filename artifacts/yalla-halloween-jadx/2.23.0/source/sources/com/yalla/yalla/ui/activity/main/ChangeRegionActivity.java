package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p486o0o00O00.o000000;
import p519o0o0O0oO.O0000000;
import p519o0o0O0oO.o0O00O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/ChangeRegionActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChangeRegionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeRegionActivity.kt\ncom/yalla/yalla/ui/activity/main/ChangeRegionActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,155:1\n75#2,13:156\n*S KotlinDebug\n*F\n+ 1 ChangeRegionActivity.kt\ncom/yalla/yalla/ui/activity/main/ChangeRegionActivity\n*L\n48#1:156,13\n*E\n"})
public final class ChangeRegionActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f25377OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RecyclerView f25380OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public TextView f25381OooOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f25383OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public com.yalla.yalla.ui.activity.main.OooO00o f25384OooOo0O;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25379OooOOo0 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25378OooOOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.ChangeRegionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.ChangeRegionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.ChangeRegionActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25392OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25392OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f25382OooOo0 = -1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25385OooOo0o = LazyKt.lazy(OooO0O0.f25388OooO0Oo);

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f25386OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f25387OooO0O0;

        public OooO00o(@NotNull String name, int i) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f25386OooO00o = name;
            this.f25387OooO0O0 = i;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<O0000000> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f25388OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final O0000000 invoke() {
            o0O00O0o.OooO00o().getClass();
            return new O0000000();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ArrayList<OooO00o>> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<OooO00o> invoke() {
            ArrayList<OooO00o> arrayList = new ArrayList<>();
            int i = oO00OOo0.single_language_English;
            ChangeRegionActivity changeRegionActivity = ChangeRegionActivity.this;
            String string = changeRegionActivity.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.single_language_English)");
            arrayList.add(new OooO00o(string, 0));
            String string2 = changeRegionActivity.getString(oO00OOo0.single_language_Arabic);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.single_language_Arabic)");
            arrayList.add(new OooO00o(string2, 1));
            String string3 = changeRegionActivity.getString(oO00OOo0.single_language_Turkish);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.single_language_Turkish)");
            arrayList.add(new OooO00o(string3, 2));
            String string4 = changeRegionActivity.getString(oO00OOo0.single_language_Indonesia);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.single_language_Indonesia)");
            arrayList.add(new OooO00o(string4, 3));
            String string5 = changeRegionActivity.getString(oO00OOo0.single_language_Portugal);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.single_language_Portugal)");
            arrayList.add(new OooO00o(string5, 5));
            String string6 = changeRegionActivity.getString(oO00OOo0.single_language_Espana);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.single_language_Espana)");
            arrayList.add(new OooO00o(string6, 6));
            String string7 = changeRegionActivity.getString(oO00OOo0.single_language_Hindi);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.single_language_Hindi)");
            arrayList.add(new OooO00o(string7, 7));
            String string8 = changeRegionActivity.getString(oO00OOo0.single_language_Urdu);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.single_language_Urdu)");
            arrayList.add(new OooO00o(string8, 8));
            return arrayList;
        }
    }

    public final void OooOo0() {
        int i = this.f25382OooOo0;
        if (i == -1 || this.f25383OooOo00 == i) {
            TextView textView = this.f25381OooOo;
            Intrinsics.checkNotNull(textView);
            textView.setEnabled(false);
            TextView textView2 = this.f25381OooOo;
            Intrinsics.checkNotNull(textView2);
            textView2.setTextColor(o0000.OooO00o(oO00O0o.color_alpha_38));
            return;
        }
        TextView textView3 = this.f25381OooOo;
        Intrinsics.checkNotNull(textView3);
        textView3.setEnabled(true);
        TextView textView4 = this.f25381OooOo;
        Intrinsics.checkNotNull(textView4);
        textView4.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_change_regoin);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Integer num = (Integer) o000000O.OooOOO0().getValue();
        this.f25383OooOo00 = num == null ? 0 : num.intValue();
        OooOOoo(oO00OOo0.Change_Language);
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22755OooOO0;
        com.yalla.yalla.ui.activity.main.OooO00o oooO00o = null;
        this.f25381OooOo = headerLayout != null ? headerLayout.OooOoO0(oO00OOo0.Save, new p486o0o00O00.o000000O(this)) : null;
        OooOo0();
        View viewFindViewById = findViewById(oO00O0oO.rvChangeRegion);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.rvChangeRegion)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f25380OooOOoo = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvChangeRegion");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        this.f25384OooOo0O = new com.yalla.yalla.ui.activity.main.OooO00o(this, oO00OO0O.item_change_region, (ArrayList) this.f25379OooOOo0.getValue());
        MutableState mutableState = o0OOO0o.f45698OooO00o;
        if (o0OOO0o.OooO0oO() == RoomState.Hook) {
            View viewInflate = View.inflate(this, oO00OO0O.change_region_hookroon_tips, null);
            com.yalla.yalla.ui.activity.main.OooO00o oooO00o2 = this.f25384OooOo0O;
            if (oooO00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                oooO00o2 = null;
            }
            oooO00o2.OooOo(viewInflate);
        }
        com.yalla.yalla.ui.activity.main.OooO00o oooO00o3 = this.f25384OooOo0O;
        if (oooO00o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO00o3 = null;
        }
        oooO00o3.f10098OooO0o = new o000000(this);
        RecyclerView recyclerView2 = this.f25380OooOOoo;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvChangeRegion");
            recyclerView2 = null;
        }
        com.yalla.yalla.ui.activity.main.OooO00o oooO00o4 = this.f25384OooOo0O;
        if (oooO00o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
        } else {
            oooO00o = oooO00o4;
        }
        recyclerView2.setAdapter(oooO00o);
    }

    @Override // android.app.Activity
    public final void recreate() {
    }
}
