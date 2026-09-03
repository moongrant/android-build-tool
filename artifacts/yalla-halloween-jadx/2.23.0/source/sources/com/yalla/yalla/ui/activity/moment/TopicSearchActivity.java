package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.core.view.o000OO00;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicSearchVM;
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
import p022Oooo00O.o00OOO00;
import p485o0o00O0.Oo0000;
import p485o0o00O0.b;
import p485o0o00O0.d;
import p485o0o00O0.oOOOOo0O;
import p485o0o00O0.oOOo0000;
import p485o0o00O0.oOOo0O00;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.x5;
import p641o0ooOOOO.y2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicSearchActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicSearchActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSearchActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,295:1\n22#2,2:296\n75#3,13:298\n81#4:311\n107#4,2:312\n*S KotlinDebug\n*F\n+ 1 TopicSearchActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSearchActivity\n*L\n53#1:296,2\n100#1:298,13\n127#1:311\n127#1:312,2\n*E\n"})
public final class TopicSearchActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f26398OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f26405OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public SoftwareKeyboardController f26406OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f26407OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26399OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(x5.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f26402OooOo00 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f26401OooOo0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26403OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicSearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSearchActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSearchActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSearchActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26413OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26413OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f26404OooOo0o = true;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f26400OooOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public static final class OooO00o extends Lambda implements Function0<o000000O> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000O invoke() {
            return new o000000O(TopicSearchActivity.this, oO00OO0O.item_topic_recommend);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<y2> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final y2 invoke() {
            y2 y2VarInflate = y2.inflate(TopicSearchActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(y2VarInflate, "inflate(layoutInflater)");
            return y2VarInflate;
        }
    }

    public static final class OooO0OO implements Observer<Response<ArrayList<TopicInfoModel>>> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> response2 = response;
            TopicSearchActivity topicSearchActivity = TopicSearchActivity.this;
            if (topicSearchActivity.f26404OooOo0o) {
                if (response2.getIsSuccess()) {
                    topicSearchActivity.OooOoO().OooOoO0(response2.getData());
                    if (topicSearchActivity.OooOoo0().f59375OooO00o.getParent() == null) {
                        topicSearchActivity.OooOoO().OooOo(topicSearchActivity.OooOoo0().f59375OooO00o);
                    }
                }
                topicSearchActivity.OooOoO().Oooo0O0(response2.getIsSuccess());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String OooOo(TopicSearchActivity topicSearchActivity) {
        return (String) topicSearchActivity.f26400OooOo.getValue();
    }

    public static final void OooOoO0(TopicSearchActivity topicSearchActivity, String str) {
        topicSearchActivity.getClass();
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        topicSearchActivity.f26404OooOo0o = false;
        topicSearchActivity.OooOoo().saveSearchHistory(str);
        if (topicSearchActivity.OooOoo0().f59375OooO00o.getParent() != null) {
            topicSearchActivity.OooOoO().OooOOoo();
        }
        topicSearchActivity.OooOoO().OooOoO0(new ArrayList());
        topicSearchActivity.OooOoO().Oooo00O(true);
        topicSearchActivity.OooOoo().searchTopic(str).observe(topicSearchActivity, new d(topicSearchActivity));
    }

    public final o000O<TopicInfoModel> OooOoO() {
        return (o000O) this.f26401OooOo0.getValue();
    }

    public final x5 OooOoOO() {
        return (x5) this.f26399OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicSearchVM OooOoo() {
        return (TopicSearchVM) this.f26403OooOo0O.getValue();
    }

    public final y2 OooOoo0() {
        return (y2) this.f26402OooOo00.getValue();
    }

    public final void OooOooO() {
        p592o0oo00O.OooOOO0.OooO0O0("showRecommendTopicshowRecommendTopicshowRecommendTopic");
        this.f26404OooOo0o = true;
        OooOoo().getRecommendList().observe(this, new OooO0OO());
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.f26405OooOoO) {
            super.onBackPressed();
            return;
        }
        SoftwareKeyboardController softwareKeyboardController = this.f26406OooOoO0;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == oO00O0oO.ivClearHistory) {
            OooOoo().clearSearchHistory();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoOO().f59272OooO00o);
        o000OO00.OooO00o(getWindow(), false);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(o0000.OooO00o(oO00O0o.transparent));
        }
        ComposeView composeView = OooOoOO().f59273OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeView");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-62190353, true, new Oo0000(this)));
        OooOoOO().f59274OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO().f10098OooO0o = new oOOOOo0O(this);
        OooOoO().f10101OooO0oo = new o00OOO00(this);
        OooOoO().Oooo0OO(new b(this));
        OooOoO().OooOooo(oOo00OO0.ic_empty_search);
        OooOoO().Oooo000(oO00OOo0.No_search_results);
        OooOoOO().f59274OooO0OO.setAdapter(OooOoO());
        OooOoo0().f59378OooO0Oo.setOnClickListener(this);
        OooOoOO().f59275OooO0Oo.setOnTouchDownListener(new oOOo0000(this));
        OooOooO();
        OooOoo().loadSearchRecommendTopic();
        OooOoo().getSearchHistory().observe(this, new oOOo0O00(this));
        OooOoo().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOoo().statisticalTime();
    }
}
