package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o0000Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0OO.o000O000;
import p405o0Oo0OOO.oOO00000;
import p405o0Oo0OOO.ooooO0O0;
import p492o0o00OO0.o0OO;
import p492o0o00OO0.o0OO0o;
import p492o0o00OO0.o0OO0o00;
import p492o0o00OO0.o0OO0oO0;
import p492o0o00OO0.o0OOO0;
import p492o0o00OO0.o0OOO00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicBlackListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicBlackListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n22#2,2:267\n75#3,13:269\n1#4:282\n1864#5,3:283\n*S KotlinDebug\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity\n*L\n39#1:267,2\n50#1:269,13\n236#1:283,3\n*E\n"})
public final class TopicBlackListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f25826OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0OOO00 f25828OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f25830OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ooooO0O0 f25831OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25827OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOO00000.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25829OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicBlackListVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicBlackListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicBlackListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicBlackListActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25834OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25834OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final oOO00000 OooOo() {
        return (oOO00000) this.f25827OooOOoo.getValue();
    }

    public final void OooOoO(boolean z) {
        TextView f29928OoooOOo;
        TextView f29928OoooOOo2;
        o0OOO00 o0ooo00 = this.f25828OooOo0;
        ooooO0O0 ooooo0o0 = null;
        if (o0ooo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo00 = null;
        }
        Collection collection = o0ooo00.f13189OooOOoo;
        if (!(collection == null || collection.isEmpty())) {
            HeaderLayout headerLayout = this.f22282OooOO0;
            if (headerLayout != null && (f29928OoooOOo = headerLayout.getF29928OoooOOo()) != null) {
                o000O.OooOOOO(f29928OoooOOo);
            }
            ooooO0O0 ooooo0o1 = this.f25831OooOo0o;
            if (ooooo0o1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                ooooo0o0 = ooooo0o1;
            }
            ooooo0o0.f45348OooO00o.setVisibility(0);
            return;
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null && (f29928OoooOOo2 = headerLayout2.getF29928OoooOOo()) != null) {
            o000O.OooO0O0(f29928OoooOOo2);
        }
        if (z) {
            ooooO0O0 ooooo0o2 = this.f25831OooOo0o;
            if (ooooo0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                ooooo0o0 = ooooo0o2;
            }
            ooooo0o0.f45348OooO00o.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0(final boolean z) {
        ((TopicBlackListVM) this.f25829OooOo00.getValue()).loadBlackListUser(z).observe(this, new Observer(this) { // from class: o0o00OO0.o0OO0

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ TopicBlackListActivity f49311OooO0o0;

            {
                this.f49311OooO0o0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TextView f29928OoooOOo;
                Response response = (Response) obj;
                int i = TopicBlackListActivity.f25826OooOo;
                TopicBlackListActivity this$0 = this.f49311OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean isSuccess = response.getIsSuccess();
                boolean z2 = z;
                o0OOO00 o0ooo00 = null;
                if (isSuccess) {
                    if (z2) {
                        o0OOO00 o0ooo01 = this$0.f25828OooOo0;
                        if (o0ooo01 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                            o0ooo01 = null;
                        }
                        o0ooo01.OooOoO0((List) response.getData());
                        Collection collection = (Collection) response.getData();
                        if (collection == null || collection.isEmpty()) {
                            HeaderLayout headerLayout = this$0.f22282OooOO0;
                            if (headerLayout != null && (f29928OoooOOo = headerLayout.getF29928OoooOOo()) != null) {
                                f29928OoooOOo.setText(o000000.Edit);
                            }
                            HeaderLayout headerLayout2 = this$0.f22282OooOO0;
                            TextView f29928OoooOOo2 = headerLayout2 != null ? headerLayout2.getF29928OoooOOo() : null;
                            if (f29928OoooOOo2 != null) {
                                f29928OoooOOo2.setEnabled(false);
                            }
                        } else {
                            HeaderLayout headerLayout3 = this$0.f22282OooOO0;
                            TextView f29928OoooOOo3 = headerLayout3 != null ? headerLayout3.getF29928OoooOOo() : null;
                            if (f29928OoooOOo3 != null) {
                                f29928OoooOOo3.setEnabled(true);
                            }
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) response.getData();
                        if (arrayList != null) {
                            o0OOO00 o0ooo02 = this$0.f25828OooOo0;
                            if (o0ooo02 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                o0ooo02 = null;
                            }
                            o0ooo02.OooO0O0(arrayList);
                        }
                    }
                }
                o0OOO00 o0ooo03 = this$0.f25828OooOo0;
                if (o0ooo03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    o0ooo03 = null;
                }
                o0ooo03.Oooo000(o000000.topic_black_list_No_Result);
                this$0.OooOo().f45030OooO0OO.OooOooo(z2, response.getIsSuccess(), response.getNoMoreData());
                o0OOO00 o0ooo04 = this$0.f25828OooOo0;
                if (o0ooo04 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                } else {
                    o0ooo00 = o0ooo04;
                }
                o0ooo00.Oooo0O0(response.getIsSuccess());
                this$0.OooOoO(true);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45028OooO00o);
        ((TopicBlackListVM) this.f25829OooOo00.getValue()).setTopicId(getIntent().getLongExtra("ID", 0L));
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.Blocked_List);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setNavigationOnClickListener(new o0OO0oO0(this));
        }
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOoO0(p562o0oOo000.o000000.Edit, new o0OO(this));
        }
        OooOo().f45030OooO0OO.setOnRefreshListener(new androidx.media3.session.o000O0(this));
        OooOo().f45030OooO0OO.setOnLoadMoreListener(new o0000Ooo(this, 3));
        OooOo().f45029OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        o0OOO00 o0ooo00 = new o0OOO00(this, p562o0oOo000.oo0o0Oo.item_black_list_topic);
        this.f25828OooOo0 = o0ooo00;
        o0ooo00.Oooo000(p562o0oOo000.o000000.no_blocked_user_topic);
        o0OOO00 o0ooo01 = this.f25828OooOo0;
        ooooO0O0 ooooo0o0 = null;
        if (o0ooo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo01 = null;
        }
        o0ooo01.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_delete);
        o0OOO00 o0ooo02 = this.f25828OooOo0;
        if (o0ooo02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo02 = null;
        }
        o0ooo02.Oooo0OO(new o0OOO0(this));
        o0OOO00 o0ooo03 = this.f25828OooOo0;
        if (o0ooo03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo03 = null;
        }
        o0ooo03.f13176OooO0o = new o000O000(this);
        o0OOO00 o0ooo04 = this.f25828OooOo0;
        if (o0ooo04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo04 = null;
        }
        o0ooo04.f13179OooO0oo = new o0000OO.OooO0o(this);
        RecyclerView recyclerView = OooOo().f45029OooO0O0;
        o0OOO00 o0ooo05 = this.f25828OooOo0;
        if (o0ooo05 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo05 = null;
        }
        recyclerView.setAdapter(o0ooo05);
        ooooO0O0 ooooo0o0Inflate = ooooO0O0.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ooooo0o0Inflate, "inflate(...)");
        this.f25831OooOo0o = ooooo0o0Inflate;
        if (ooooo0o0Inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooooo0o0Inflate = null;
        }
        View view = ooooo0o0Inflate.f45349OooO0O0.f30105OooO0oO;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setVisibility(0);
        ooooO0O0 ooooo0o1 = this.f25831OooOo0o;
        if (ooooo0o1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooooo0o1 = null;
        }
        ooooo0o1.f45349OooO0O0.getEditSearch().setHint(getString(p562o0oOo000.o000000.Search_user_name_or_id));
        ooooO0O0 ooooo0o2 = this.f25831OooOo0o;
        if (ooooo0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooooo0o2 = null;
        }
        ooooo0o2.f45349OooO0O0.setSearchTextChangedListener(new o0OO0o00(this));
        ooooO0O0 ooooo0o3 = this.f25831OooOo0o;
        if (ooooo0o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooooo0o3 = null;
        }
        ooooo0o3.f45349OooO0O0.setSearchClickListener(new o0OO0o(this));
        o0OOO00 o0ooo06 = this.f25828OooOo0;
        if (o0ooo06 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo06 = null;
        }
        ooooO0O0 ooooo0o4 = this.f25831OooOo0o;
        if (ooooo0o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
        } else {
            ooooo0o0 = ooooo0o4;
        }
        o0ooo06.OooOo(ooooo0o0.f45348OooO00o);
        OooOoO0(true);
        OooOoO(true);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ooooO0O0 ooooo0o0 = this.f25831OooOo0o;
        ooooO0O0 ooooo0o1 = null;
        if (ooooo0o0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooooo0o0 = null;
        }
        if (ooooo0o0.f45349OooO0O0 != null) {
            ooooO0O0 ooooo0o2 = this.f25831OooOo0o;
            if (ooooo0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                ooooo0o2 = null;
            }
            if (ooooo0o2.f45349OooO0O0.getEditSearch() != null) {
                ooooO0O0 ooooo0o3 = this.f25831OooOo0o;
                if (ooooo0o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    ooooo0o1 = ooooo0o3;
                }
                EditText editSearch = ooooo0o1.f45349OooO0O0.getEditSearch();
                kotlin.collections.OooO00o.OooO0O0(editSearch.getContext().getApplicationContext(), new Handler(), p371o0OOo0oO.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editSearch.getWindowToken(), 0);
            }
        }
    }
}
