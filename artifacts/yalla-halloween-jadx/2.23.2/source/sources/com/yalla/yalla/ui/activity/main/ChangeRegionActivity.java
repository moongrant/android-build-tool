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
import p429o0OoOO.o0Oo0oo;
import p475o0Ooooo0.o0O00oO0;
import p487o0o00O.o00000O0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;
import p650o0ooo.a;
import p650o0ooo.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/ChangeRegionActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nChangeRegionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeRegionActivity.kt\ncom/yalla/yalla/ui/activity/main/ChangeRegionActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,155:1\n75#2,13:156\n*S KotlinDebug\n*F\n+ 1 ChangeRegionActivity.kt\ncom/yalla/yalla/ui/activity/main/ChangeRegionActivity\n*L\n48#1:156,13\n*E\n"})
public final class ChangeRegionActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f24923OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RecyclerView f24926OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public TextView f24927OooOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f24929OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public com.yalla.yalla.ui.activity.main.OooO00o f24930OooOo0O;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f24925OooOOo0 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24924OooOOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoEditVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.ChangeRegionActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24938OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24938OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f24928OooOo0 = -1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f24931OooOo0o = LazyKt.lazy(OooO0O0.f24934OooO0Oo);

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f24932OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f24933OooO0O0;

        public OooO00o(@NotNull String name, int i) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f24932OooO00o = name;
            this.f24933OooO0O0 = i;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<a> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f24934OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final a invoke() {
            o00O0OO0.OooO00o().getClass();
            return new a();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ArrayList<OooO00o>> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<OooO00o> invoke() {
            ArrayList<OooO00o> arrayList = new ArrayList<>();
            int i = o000000.single_language_English;
            ChangeRegionActivity changeRegionActivity = ChangeRegionActivity.this;
            String string = changeRegionActivity.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new OooO00o(string, 0));
            String string2 = changeRegionActivity.getString(o000000.single_language_Arabic);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new OooO00o(string2, 1));
            String string3 = changeRegionActivity.getString(o000000.single_language_Turkish);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            arrayList.add(new OooO00o(string3, 2));
            String string4 = changeRegionActivity.getString(o000000.single_language_Indonesia);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList.add(new OooO00o(string4, 3));
            String string5 = changeRegionActivity.getString(o000000.single_language_Portugal);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            arrayList.add(new OooO00o(string5, 5));
            String string6 = changeRegionActivity.getString(o000000.single_language_Espana);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            arrayList.add(new OooO00o(string6, 6));
            String string7 = changeRegionActivity.getString(o000000.single_language_Hindi);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            arrayList.add(new OooO00o(string7, 7));
            String string8 = changeRegionActivity.getString(o000000.single_language_Urdu);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            arrayList.add(new OooO00o(string8, 8));
            return arrayList;
        }
    }

    public final void OooOo0() {
        int i = this.f24928OooOo0;
        if (i == -1 || this.f24929OooOo00 == i) {
            TextView textView = this.f24927OooOo;
            Intrinsics.checkNotNull(textView);
            textView.setEnabled(false);
            TextView textView2 = this.f24927OooOo;
            Intrinsics.checkNotNull(textView2);
            textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_alpha_38));
            return;
        }
        TextView textView3 = this.f24927OooOo;
        Intrinsics.checkNotNull(textView3);
        textView3.setEnabled(true);
        TextView textView4 = this.f24927OooOo;
        Intrinsics.checkNotNull(textView4);
        textView4.setTextColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_change_regoin);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Integer num = (Integer) o0O00oO0.OooOOO0().getValue();
        this.f24929OooOo00 = num == null ? 0 : num.intValue();
        OooOOoo(o000000.Change_Language);
        OooOOo0(1);
        HeaderLayout headerLayout = this.f22282OooOO0;
        com.yalla.yalla.ui.activity.main.OooO00o oooO00o = null;
        this.f24927OooOo = headerLayout != null ? headerLayout.OooOoO0(o000000.Save, new o00000O0(this)) : null;
        OooOo0();
        View viewFindViewById = findViewById(o0OO00O.rvChangeRegion);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f24926OooOOoo = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvChangeRegion");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        this.f24930OooOo0O = new com.yalla.yalla.ui.activity.main.OooO00o(this, oo0o0Oo.item_change_region, (ArrayList) this.f24925OooOOo0.getValue());
        MutableState mutableState = o0Oo0oo.f46817OooO00o;
        if (o0Oo0oo.OooO0oO() == RoomState.Hook) {
            View viewInflate = View.inflate(this, oo0o0Oo.change_region_hookroon_tips, null);
            com.yalla.yalla.ui.activity.main.OooO00o oooO00o2 = this.f24930OooOo0O;
            if (oooO00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                oooO00o2 = null;
            }
            oooO00o2.OooOo(viewInflate);
        }
        com.yalla.yalla.ui.activity.main.OooO00o oooO00o3 = this.f24930OooOo0O;
        if (oooO00o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO00o3 = null;
        }
        oooO00o3.f13176OooO0o = new p350o0OOOOoo.o0OOO0o(this);
        RecyclerView recyclerView2 = this.f24926OooOOoo;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvChangeRegion");
            recyclerView2 = null;
        }
        com.yalla.yalla.ui.activity.main.OooO00o oooO00o4 = this.f24930OooOo0O;
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
