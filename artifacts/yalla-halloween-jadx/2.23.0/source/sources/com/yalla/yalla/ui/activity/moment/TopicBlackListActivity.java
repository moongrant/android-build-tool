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
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p485o0o00O0.o0OOO0;
import p485o0o00O0.o0OOO0OO;
import p485o0o00O0.o0OOOO00;
import p485o0o00O0.o0OOOO0o;
import p485o0o00O0.o0OOo000;
import p485o0o00O0.o0o0000;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.a6;
import p641o0ooOOOO.t6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicBlackListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicBlackListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,266:1\n22#2,2:267\n75#3,13:269\n*S KotlinDebug\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity\n*L\n39#1:267,2\n50#1:269,13\n*E\n"})
public final class TopicBlackListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26275OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0OOo000 f26277OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f26279OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public t6 f26280OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26276OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(a6.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26278OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicBlackListVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicBlackListActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26285OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26285OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    @SourceDebugExtension({"SMAP\nTopicBlackListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicBlackListActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicBlackListActivity$loadBlackList$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
    public static final class OooO00o implements Observer<Response<ArrayList<TopicBlackUserModel>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26281OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopicBlackListActivity f26282OooO0o0;

        public OooO00o(TopicBlackListActivity topicBlackListActivity, boolean z) {
            this.f26281OooO0Oo = z;
            this.f26282OooO0o0 = topicBlackListActivity;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<ArrayList<TopicBlackUserModel>> response) {
            TextView f30473OoooOOo;
            Response<ArrayList<TopicBlackUserModel>> response2 = response;
            boolean isSuccess = response2.getIsSuccess();
            boolean z = this.f26281OooO0Oo;
            o0OOo000 o0ooo001 = null;
            TopicBlackListActivity topicBlackListActivity = this.f26282OooO0o0;
            if (isSuccess) {
                if (z) {
                    o0OOo000 o0ooo002 = topicBlackListActivity.f26277OooOo0;
                    if (o0ooo002 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        o0ooo002 = null;
                    }
                    o0ooo002.OooOoO0(response2.getData());
                    ArrayList<TopicBlackUserModel> data = response2.getData();
                    if (data == null || data.isEmpty()) {
                        HeaderLayout headerLayout = topicBlackListActivity.f22755OooOO0;
                        if (headerLayout != null && (f30473OoooOOo = headerLayout.getF30473OoooOOo()) != null) {
                            f30473OoooOOo.setText(oO00OOo0.Edit);
                        }
                        HeaderLayout headerLayout2 = topicBlackListActivity.f22755OooOO0;
                        TextView f30473OoooOOo2 = headerLayout2 != null ? headerLayout2.getF30473OoooOOo() : null;
                        if (f30473OoooOOo2 != null) {
                            f30473OoooOOo2.setEnabled(false);
                        }
                    } else {
                        HeaderLayout headerLayout3 = topicBlackListActivity.f22755OooOO0;
                        TextView f30473OoooOOo3 = headerLayout3 != null ? headerLayout3.getF30473OoooOOo() : null;
                        if (f30473OoooOOo3 != null) {
                            f30473OoooOOo3.setEnabled(true);
                        }
                    }
                } else {
                    ArrayList<TopicBlackUserModel> data2 = response2.getData();
                    if (data2 != null) {
                        o0OOo000 o0ooo003 = topicBlackListActivity.f26277OooOo0;
                        if (o0ooo003 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                            o0ooo003 = null;
                        }
                        o0ooo003.OooO0O0(data2);
                    }
                }
            }
            o0OOo000 o0ooo004 = topicBlackListActivity.f26277OooOo0;
            if (o0ooo004 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                o0ooo004 = null;
            }
            o0ooo004.Oooo000(oO00OOo0.topic_black_list_No_Result);
            topicBlackListActivity.OooOo().f57485OooO0OO.OooOooo(z, response2.getIsSuccess(), response2.getNoMoreData());
            o0OOo000 o0ooo005 = topicBlackListActivity.f26277OooOo0;
            if (o0ooo005 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            } else {
                o0ooo001 = o0ooo005;
            }
            o0ooo001.Oooo0O0(response2.getIsSuccess());
            topicBlackListActivity.OooOoO(true);
        }
    }

    public final a6 OooOo() {
        return (a6) this.f26276OooOOoo.getValue();
    }

    public final void OooOoO(boolean z) {
        TextView f30473OoooOOo;
        TextView f30473OoooOOo2;
        o0OOo000 o0ooo001 = this.f26277OooOo0;
        t6 t6Var = null;
        if (o0ooo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo001 = null;
        }
        Collection collection = o0ooo001.f10111OooOOoo;
        if (!(collection == null || collection.isEmpty())) {
            HeaderLayout headerLayout = this.f22755OooOO0;
            if (headerLayout != null && (f30473OoooOOo = headerLayout.getF30473OoooOOo()) != null) {
                o000OO00.OooOOOO(f30473OoooOOo);
            }
            t6 t6Var2 = this.f26280OooOo0o;
            if (t6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                t6Var = t6Var2;
            }
            t6Var.f58868OooO00o.setVisibility(0);
            return;
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null && (f30473OoooOOo2 = headerLayout2.getF30473OoooOOo()) != null) {
            o000OO00.OooO0O0(f30473OoooOOo2);
        }
        if (z) {
            t6 t6Var3 = this.f26280OooOo0o;
            if (t6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                t6Var = t6Var3;
            }
            t6Var.f58868OooO00o.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0(boolean z) {
        ((TopicBlackListVM) this.f26278OooOo00.getValue()).loadBlackListUser(z).observe(this, new OooO00o(this, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57483OooO00o);
        ((TopicBlackListVM) this.f26278OooOo00.getValue()).setTopicId(getIntent().getLongExtra("ID", 0L));
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.Blocked_List);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setNavigationOnClickListener(new o0OOOO00(this));
        }
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOoO0(oO00OOo0.Edit, new o0OOOO0o(this));
        }
        OooOo().f57485OooO0OO.setOnRefreshListener(new p562o0oOo0O.o000oOoO() { // from class: o0o00O0.o0OO0o
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                int i = TopicBlackListActivity.f26275OooOo;
                TopicBlackListActivity this$0 = this.f47993OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0(true);
            }
        });
        OooOo().f57485OooO0OO.setOnLoadMoreListener(new p562o0oOo0O.o000oOoO() { // from class: o0o00O0.o0OO0oO0
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                int i = TopicBlackListActivity.f26275OooOo;
                TopicBlackListActivity this$0 = this.f47995OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0(false);
            }
        });
        OooOo().f57484OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        o0OOo000 o0ooo001 = new o0OOo000(this, oO00OO0O.item_black_list_topic);
        this.f26277OooOo0 = o0ooo001;
        o0ooo001.Oooo000(oO00OOo0.no_blocked_user_topic);
        o0OOo000 o0ooo002 = this.f26277OooOo0;
        t6 t6Var = null;
        if (o0ooo002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo002 = null;
        }
        o0ooo002.OooOooo(oOo00OO0.ic_empty_delete);
        o0OOo000 o0ooo003 = this.f26277OooOo0;
        if (o0ooo003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo003 = null;
        }
        o0ooo003.Oooo0OO(new o0o0000(this));
        o0OOo000 o0ooo004 = this.f26277OooOo0;
        if (o0ooo004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo004 = null;
        }
        o0ooo004.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o00O0.o0OO
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                int i2 = TopicBlackListActivity.f26275OooOo;
                TopicBlackListActivity this$0 = this.f47983OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
                o0OOo000 o0ooo005 = this$0.f26277OooOo0;
                if (o0ooo005 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    o0ooo005 = null;
                }
                UserInfoActivity.OooO00o.OooO0OO(oooO00o, this$0, String.valueOf(((TopicBlackUserModel) o0ooo005.f10111OooOOoo.get(i)).getUserId()), false, 12);
            }
        };
        o0OOo000 o0ooo005 = this.f26277OooOo0;
        if (o0ooo005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo005 = null;
        }
        o0ooo005.f10101OooO0oo = new BaseQuickAdapter.OooO0O0() { // from class: o0o00O0.o0OOO00
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
            public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                int i2 = TopicBlackListActivity.f26275OooOo;
                TopicBlackListActivity this$0 = this.f47997OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (view.getId() == oO00O0oO.ivDelete) {
                    o0OOo000 o0ooo006 = this$0.f26277OooOo0;
                    if (o0ooo006 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                        o0ooo006 = null;
                    }
                    TopicBlackUserModel topicBlackUserModel = (TopicBlackUserModel) o0ooo006.f10111OooOOoo.get(i);
                    if (topicBlackUserModel != null) {
                        o0OO00O o0oo00o2 = new o0OO00O(this$0);
                        o0oo00o2.OooOOoo(oO00OOo0.Unblock_this_user);
                        o0oo00o2.OooOo0(new ooo0Oo0(this$0, topicBlackUserModel));
                        o0oo00o2.OooOO0o();
                    }
                }
            }
        };
        RecyclerView recyclerView = OooOo().f57484OooO0O0;
        o0OOo000 o0ooo006 = this.f26277OooOo0;
        if (o0ooo006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo006 = null;
        }
        recyclerView.setAdapter(o0ooo006);
        t6 t6VarInflate = t6.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(t6VarInflate, "inflate(layoutInflater)");
        this.f26280OooOo0o = t6VarInflate;
        if (t6VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            t6VarInflate = null;
        }
        View view = t6VarInflate.f58869OooO0O0.f30650OooO0oO;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setVisibility(0);
        t6 t6Var2 = this.f26280OooOo0o;
        if (t6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            t6Var2 = null;
        }
        t6Var2.f58869OooO0O0.getEditSearch().setHint(getString(oO00OOo0.Search_user_name_or_id));
        t6 t6Var3 = this.f26280OooOo0o;
        if (t6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            t6Var3 = null;
        }
        t6Var3.f58869OooO0O0.setSearchTextChangedListener(new o0OOO0(this));
        t6 t6Var4 = this.f26280OooOo0o;
        if (t6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            t6Var4 = null;
        }
        t6Var4.f58869OooO0O0.setSearchClickListener(new o0OOO0OO(this));
        o0OOo000 o0ooo007 = this.f26277OooOo0;
        if (o0ooo007 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo007 = null;
        }
        t6 t6Var5 = this.f26280OooOo0o;
        if (t6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
        } else {
            t6Var = t6Var5;
        }
        o0ooo007.OooOo(t6Var.f58868OooO00o);
        OooOoO0(true);
        OooOoO(true);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        t6 t6Var = this.f26280OooOo0o;
        t6 t6Var2 = null;
        if (t6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            t6Var = null;
        }
        if (t6Var.f58869OooO0O0 != null) {
            t6 t6Var3 = this.f26280OooOo0o;
            if (t6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                t6Var3 = null;
            }
            if (t6Var3.f58869OooO0O0.getEditSearch() != null) {
                t6 t6Var4 = this.f26280OooOo0o;
                if (t6Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    t6Var2 = t6Var4;
                }
                EditText editSearch = t6Var2.f58869OooO0O0.getEditSearch();
                p367o0OOo0o0.OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), android.support.v4.media.session.OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context"), editSearch.getWindowToken(), 0);
            }
        }
    }
}
