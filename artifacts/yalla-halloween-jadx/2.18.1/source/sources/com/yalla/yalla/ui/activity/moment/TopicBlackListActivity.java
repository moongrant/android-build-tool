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
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicBlackListVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p439o0OoOOo0.o00000O0;
import p535o0o0OOoO.oO0OO00o;
import p538o0o0Oo0.o0O00;
import p538o0o0Oo0.o0O0000O;
import p538o0o0Oo0.o0O000O;
import p538o0o0Oo0.o0O000Oo;
import p538o0o0Oo0.o0O000o0;
import p538o0o0Oo0.o0O00O0o;
import p538o0o0Oo0.o0OoO00O;
import p538o0o0Oo0.o0OoOoOo;
import p649o0ooOOoo.vc;
import p649o0ooOOoo.wd;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicBlackListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicBlackListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final /* synthetic */ int f22539OooooOo = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22540OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(vc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22541Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicBlackListVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicBlackListActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22547Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22547Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<TopicBlackUserModel> f22542Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f22543OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public wd f22544OooooOO;

    public static void Oooo000(final TopicBlackListActivity topicBlackListActivity, String str) {
        final boolean z = true;
        topicBlackListActivity.OooOooO().searchTopicBlackList(str, true).observe(topicBlackListActivity, new Observer() { // from class: o0o0Oo0.o0O000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TextView f12044o000000;
                boolean z2 = z;
                TopicBlackListActivity this$0 = topicBlackListActivity;
                Response response = (Response) obj;
                int i = TopicBlackListActivity.f22539OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0OO<TopicBlackUserModel> oooO0OO = null;
                if (response.getIsSuccess()) {
                    if (z2) {
                        OooO0OO<TopicBlackUserModel> oooO0OO2 = this$0.f22542Ooooo0o;
                        if (oooO0OO2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                            oooO0OO2 = null;
                        }
                        oooO0OO2.setNewData((List) response.getData());
                        Collection collection = (Collection) response.getData();
                        if (collection == null || collection.isEmpty()) {
                            HeaderLayout headerLayout = this$0.f11463OoooO;
                            if (headerLayout != null && (f12044o000000 = headerLayout.getF12044o000000()) != null) {
                                f12044o000000.setText(R.string.Edit);
                            }
                            HeaderLayout headerLayout2 = this$0.f11463OoooO;
                            TextView f12044o000001 = headerLayout2 != null ? headerLayout2.getF12044o000000() : null;
                            if (f12044o000001 != null) {
                                f12044o000001.setEnabled(false);
                            }
                        } else {
                            HeaderLayout headerLayout3 = this$0.f11463OoooO;
                            TextView f12044o000002 = headerLayout3 != null ? headerLayout3.getF12044o000000() : null;
                            if (f12044o000002 != null) {
                                f12044o000002.setEnabled(true);
                            }
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) response.getData();
                        if (arrayList != null) {
                            OooO0OO<TopicBlackUserModel> oooO0OO3 = this$0.f22542Ooooo0o;
                            if (oooO0OO3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                                oooO0OO3 = null;
                            }
                            oooO0OO3.addData(arrayList);
                        }
                    }
                }
                OooO0OO<TopicBlackUserModel> oooO0OO4 = this$0.f22542Ooooo0o;
                if (oooO0OO4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                    oooO0OO4 = null;
                }
                oooO0OO4.setEmptyText(R.string.topic_black_list_No_Result);
                this$0.OooOoo().f50808OooO0OO.Oooo0o0(z2, response.getIsSuccess(), response.getNoMoreData());
                OooO0OO<TopicBlackUserModel> oooO0OO5 = this$0.f22542Ooooo0o;
                if (oooO0OO5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                } else {
                    oooO0OO = oooO0OO5;
                }
                oooO0OO.setLoadComplete(response.getIsSuccess());
                this$0.Oooo00O(false);
            }
        });
    }

    public final vc OooOoo() {
        return (vc) this.f22540OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicBlackListVM OooOooO() {
        return (TopicBlackListVM) this.f22541Ooooo00.getValue();
    }

    public final void OooOooo(boolean z) {
        OooOooO().loadBlackListUser(z).observe(this, new o0O0000O(z, this, 0));
    }

    public final void Oooo00O(boolean z) {
        TextView f12044o000000;
        TextView f12044o000001;
        p188o00o00o0.OooO0OO<TopicBlackUserModel> oooO0OO = this.f22542Ooooo0o;
        wd wdVar = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        List<TopicBlackUserModel> data = oooO0OO.getData();
        if (!(data == null || data.isEmpty())) {
            HeaderLayout headerLayout = this.f11463OoooO;
            if (headerLayout != null && (f12044o000000 = headerLayout.getF12044o000000()) != null) {
                oOO00O.OooO(f12044o000000);
            }
            wd wdVar2 = this.f22544OooooOO;
            if (wdVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                wdVar = wdVar2;
            }
            wdVar.f50890OooO00o.setVisibility(0);
            return;
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null && (f12044o000001 = headerLayout2.getF12044o000000()) != null) {
            oOO00O.OooO00o(f12044o000001);
        }
        if (z) {
            wd wdVar3 = this.f22544OooooOO;
            if (wdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            } else {
                wdVar = wdVar3;
            }
            wdVar.f50890OooO00o.setVisibility(8);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50806OooO00o);
        OooOooO().setTopicId(getIntent().getLongExtra("ID", 0L));
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Blocked_List);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setNavigationOnClickListener(new o0O000o0(this));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        if (headerLayout3 != null) {
            headerLayout3.OooOoo0(R.string.Edit, new o0O00(this));
        }
        OooOoo().f50808OooO0OO.setOnRefreshListener(new o0O000O(this, 0));
        OooOoo().f50808OooO0OO.setOnLoadMoreListener(new com.facebook.appevents.ml.OooO(this, 4));
        OooOoo().f50807OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        o0OoO00O o0ooo00o2 = new o0OoO00O(this);
        this.f22542Ooooo0o = o0ooo00o2;
        o0ooo00o2.setEmptyText(R.string.no_blocked_user_topic);
        p188o00o00o0.OooO0OO<TopicBlackUserModel> oooO0OO = this.f22542Ooooo0o;
        wd wdVar = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_delete);
        p188o00o00o0.OooO0OO<TopicBlackUserModel> oooO0OO2 = this.f22542Ooooo0o;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setLoadErrorClickListener(new o0O00O0o(this));
        p188o00o00o0.OooO0OO<TopicBlackUserModel> oooO0OO3 = this.f22542Ooooo0o;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO3 = null;
        }
        int i = 1;
        oooO0OO3.setOnItemClickListener(new o00000O0(this, i));
        p188o00o00o0.OooO0OO<TopicBlackUserModel> oooO0OO4 = this.f22542Ooooo0o;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setOnItemChildClickListener(new oO0OO00o(this, i));
        RecyclerView recyclerView = OooOoo().f50807OooO0O0;
        p188o00o00o0.OooO0OO<TopicBlackUserModel> oooO0OO5 = this.f22542Ooooo0o;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO5 = null;
        }
        recyclerView.setAdapter(oooO0OO5);
        wd wdVarInflate = wd.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wdVarInflate, "inflate(layoutInflater)");
        this.f22544OooooOO = wdVarInflate;
        if (wdVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            wdVarInflate = null;
        }
        View view = wdVarInflate.f50891OooO0O0.f12075Oooo;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setVisibility(0);
        wd wdVar2 = this.f22544OooooOO;
        if (wdVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            wdVar2 = null;
        }
        wdVar2.f50891OooO0O0.getEditSearch().setHint(getString(R.string.Search_user_name_or_id));
        wd wdVar3 = this.f22544OooooOO;
        if (wdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            wdVar3 = null;
        }
        wdVar3.f50891OooO0O0.setSearchTextChangedListener(new o0OoOoOo(this));
        wd wdVar4 = this.f22544OooooOO;
        if (wdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            wdVar4 = null;
        }
        wdVar4.f50891OooO0O0.setSearchClickListener(new o0O000Oo(this));
        p188o00o00o0.OooO0OO<TopicBlackUserModel> oooO0OO6 = this.f22542Ooooo0o;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO6 = null;
        }
        wd wdVar5 = this.f22544OooooOO;
        if (wdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
        } else {
            wdVar = wdVar5;
        }
        oooO0OO6.setHeaderView(wdVar.f50890OooO00o);
        OooOooo(true);
        Oooo00O(true);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        wd wdVar = this.f22544OooooOO;
        wd wdVar2 = null;
        if (wdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            wdVar = null;
        }
        if (wdVar.f50891OooO0O0 != null) {
            wd wdVar3 = this.f22544OooooOO;
            if (wdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                wdVar3 = null;
            }
            if (wdVar3.f50891OooO0O0.getEditSearch() != null) {
                wd wdVar4 = this.f22544OooooOO;
                if (wdVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    wdVar2 = wdVar4;
                }
                EditText editSearch = wdVar2.f50891OooO0O0.getEditSearch();
                Oooo000.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editSearch, "view.context"), new Handler()));
            }
        }
    }
}
