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
import androidx.core.view.o00oOoo;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
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
import p405o0Oo0OOO.o0OO0o00;
import p405o0Oo0OOO.oO0oO000;
import p491o0o00O0o.o0;
import p491o0o00O0o.o00OOOO0;
import p492o0o00OO0.oOO0OO0O;
import p492o0o00OO0.oOO0OOO;
import p571o0oOoO0.o0000oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicSearchActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicSearchActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSearchActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,295:1\n22#2,2:296\n75#3,13:298\n81#4:311\n107#4,2:312\n*S KotlinDebug\n*F\n+ 1 TopicSearchActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicSearchActivity\n*L\n53#1:296,2\n100#1:298,13\n127#1:311\n127#1:312,2\n*E\n"})
public final class TopicSearchActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f25947OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f25954OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public SoftwareKeyboardController f25955OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f25956OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25948OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO0oO000.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f25951OooOo00 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25950OooOo0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25952OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicSearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicSearchActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25961OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25961OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f25953OooOo0o = true;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f25949OooOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public static final class OooO00o extends Lambda implements Function0<o000000O> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000O invoke() {
            return new o000000O(TopicSearchActivity.this, p562o0oOo000.oo0o0Oo.item_topic_recommend);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0OO0o00> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OO0o00 invoke() {
            o0OO0o00 o0oo0o00Inflate = o0OO0o00.inflate(TopicSearchActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(o0oo0o00Inflate, "inflate(...)");
            return o0oo0o00Inflate;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String OooOo(TopicSearchActivity topicSearchActivity) {
        return (String) topicSearchActivity.f25949OooOo.getValue();
    }

    public static final void OooOoO0(TopicSearchActivity topicSearchActivity, String str) {
        topicSearchActivity.getClass();
        int i = 1;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        topicSearchActivity.f25953OooOo0o = false;
        topicSearchActivity.OooOoo().saveSearchHistory(str);
        if (topicSearchActivity.OooOoo0().f44601OooO00o.getParent() != null) {
            topicSearchActivity.OooOoO().OooOOoo();
        }
        topicSearchActivity.OooOoO().OooOoO0(new ArrayList());
        topicSearchActivity.OooOoO().Oooo00O(true);
        topicSearchActivity.OooOoo().searchTopic(str).observe(topicSearchActivity, new o0(topicSearchActivity, i));
    }

    public final o0000oo<TopicInfoModel> OooOoO() {
        return (o0000oo) this.f25950OooOo0.getValue();
    }

    public final oO0oO000 OooOoOO() {
        return (oO0oO000) this.f25948OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicSearchVM OooOoo() {
        return (TopicSearchVM) this.f25952OooOo0O.getValue();
    }

    public final o0OO0o00 OooOoo0() {
        return (o0OO0o00) this.f25951OooOo00.getValue();
    }

    public final void OooOooO() {
        o0000O00.OooO0O0("showRecommendTopicshowRecommendTopicshowRecommendTopic");
        this.f25953OooOo0o = true;
        OooOoo().getRecommendList().observe(this, new com.yalla.yalla.mixedroom.OooOO0O(this, 2));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.f25954OooOoO) {
            super.onBackPressed();
            return;
        }
        SoftwareKeyboardController softwareKeyboardController = this.f25955OooOoO0;
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (view.getId() == p562o0oOo000.o0OO00O.ivClearHistory) {
            OooOoo().clearSearchHistory();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoOO().f44997OooO00o);
        o00oOoo.OooO00o(getWindow(), false);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.transparent));
        }
        ComposeView composeView = OooOoOO().f44998OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        p193o00o0O0O.o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-62190353, true, new oOO0OO0O(this)));
        OooOoOO().f44999OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO().f13176OooO0o = new o00OOOO0(this);
        int i = 2;
        OooOoO().f13179OooO0oo = new o000O0.OooO0OO(this, i);
        OooOoO().Oooo0OO(new oOO0OOO(this));
        OooOoO().OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_search);
        OooOoO().Oooo000(p562o0oOo000.o000000.No_search_results);
        OooOoOO().f44999OooO0OO.setAdapter(OooOoO());
        OooOoo0().f44604OooO0Oo.setOnClickListener(this);
        OooOoOO().f45000OooO0Oo.setOnTouchDownListener(new com.google.android.material.search.OooO0O0(this));
        OooOooO();
        OooOoo().loadSearchRecommendTopic();
        OooOoo().getSearchHistory().observe(this, new com.yalla.yalla.mixedroom.OooOO0(this, i));
        OooOoo().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOoo().statisticalTime();
    }
}
