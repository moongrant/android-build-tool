package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
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
import p029Oooo0oo.oo0ooO;
import p045Oooooo.o000O00O;
import p198o00o0OoO.o00O;
import p200o00o0o.o0O0ooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.u5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/JoinTopicListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJoinTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,178:1\n22#2,2:179\n75#3,13:181\n*S KotlinDebug\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity\n*L\n43#1:179,2\n84#1:181,13\n*E\n"})
public final class JoinTopicListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26043OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f26045OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public String f26048OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26044OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(u5.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f26047OooOo00 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26046OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.JoinTopicListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.JoinTopicListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.JoinTopicListActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26055OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26055OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f26049OooOo0o = 1;

    public static final class OooO00o implements Observer<Response<ArrayList<TopicInfoModel>>> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26051OooO0o0;

        public OooO00o(boolean z) {
            this.f26051OooO0o0 = z;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> response2 = response;
            boolean isSuccess = response2.getIsSuccess();
            boolean z = this.f26051OooO0o0;
            JoinTopicListActivity joinTopicListActivity = JoinTopicListActivity.this;
            if (isSuccess) {
                if (response2.getPage().getDateSort() != null) {
                    Long dateSort = response2.getPage().getDateSort();
                    Intrinsics.checkNotNull(dateSort);
                    joinTopicListActivity.f26045OooOo = dateSort.longValue();
                }
                joinTopicListActivity.f26049OooOo0o++;
                if (z) {
                    joinTopicListActivity.OooOoO0().OooOoO0(response2.getData());
                } else {
                    o000O<TopicInfoModel> o000oOooOoO0 = joinTopicListActivity.OooOoO0();
                    ArrayList<TopicInfoModel> data = response2.getData();
                    Intrinsics.checkNotNull(data);
                    o000oOooOoO0.OooO0O0(data);
                }
            }
            int i = JoinTopicListActivity.f26043OooOoO0;
            joinTopicListActivity.OooOo().f58950OooO0OO.OooOooo(z, response2.getIsSuccess(), response2.getNoMoreData());
            joinTopicListActivity.OooOoO0().Oooo0O0(response2.getIsSuccess());
        }
    }

    @SourceDebugExtension({"SMAP\nJoinTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity$mAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function0<OooOOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOOO0 invoke() {
            OooOOO0 oooOOO0 = new OooOOO0(JoinTopicListActivity.this, oO00OO0O.item_topic_join);
            oooOOO0.f10098OooO0o = new o000O00O(oooOOO0);
            return oooOOO0;
        }
    }

    public final u5 OooOo() {
        return (u5) this.f26044OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(boolean z) {
        if (z) {
            this.f26049OooOo0o = 1;
            this.f26045OooOo = 0L;
        }
        TopicInfoVM topicInfoVM = (TopicInfoVM) this.f26046OooOo0.getValue();
        String str = this.f26048OooOo0O;
        if (str == null) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        topicInfoVM.loadUserTopicListAll(str, oo0ooO.OooO00o(this.f26045OooOo), this.f26049OooOo0o).observe(this, new OooO00o(z));
    }

    public final o000O<TopicInfoModel> OooOoO0() {
        return (o000O) this.f26047OooOo00.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58948OooO00o);
        this.f26048OooOo0O = getIntent().getStringExtra("Id");
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(getString(oO00OOo0.Following_Topics));
        }
        OooOOo0(1);
        OooOo().f58950OooO0OO.setOnRefreshListener(new p022Oooo00O.Oooo000(this));
        OooOo().f58950OooO0OO.setOnLoadMoreListener(new o0O0ooO(this));
        OooOoO0().Oooo00O(true);
        OooOoO0().OooOooo(oOo00OO0.ic_empty_message_system);
        OooOoO0().Oooo000(oO00OOo0.null_topic);
        OooOoO0().Oooo0OO(new p485o0o00O0.o0OO00O(this));
        OooOo().f58949OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOo().f58949OooO0O0.setAdapter(OooOoO0());
        OooOoO0().f10098OooO0o = new o00O(this);
        OooOoO(true);
        LiveEventBus.get("TOPIC_FOLLOW_CHANGE", TopicFollowChange.class).observe(this, new p485o0o00O0.oo0o0Oo(this));
    }
}
