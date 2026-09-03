package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.session.o0000O00;
import com.code.android.util.o000O0;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0OO00OO;
import p405o0Oo0OOO.oO0OO0O;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/JoinTopicListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJoinTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n22#2,2:179\n75#3,13:181\n1864#4,3:194\n*S KotlinDebug\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity\n*L\n43#1:179,2\n84#1:181,13\n101#1:194,3\n*E\n"})
public final class JoinTopicListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f25596OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f25598OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public String f25601OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25597OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO0OO0O.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f25600OooOo00 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25599OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.JoinTopicListActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25606OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25606OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f25602OooOo0o = 1;

    @SourceDebugExtension({"SMAP\nJoinTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity$mAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<OooOOO0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOOO0 invoke() {
            OooOOO0 oooOOO0 = new OooOOO0(JoinTopicListActivity.this, p562o0oOo000.oo0o0Oo.item_topic_join);
            oooOOO0.f13176OooO0o = new androidx.media3.session.o00oO0o(oooOOO0);
            return oooOOO0;
        }
    }

    public final oO0OO0O OooOo() {
        return (oO0OO0O) this.f25597OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(final boolean z) {
        if (z) {
            this.f25602OooOo0o = 1;
            this.f25598OooOo = 0L;
        }
        TopicInfoVM topicInfoVM = (TopicInfoVM) this.f25599OooOo0.getValue();
        String str = this.f25601OooOo0O;
        if (str == null) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        topicInfoVM.loadUserTopicListAll(str, o0000O00.OooO00o(this.f25598OooOo), this.f25602OooOo0o).observe(this, new Observer() { // from class: o0o00OO0.o0Oo0oo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Response response = (Response) obj;
                int i = JoinTopicListActivity.f25596OooOoO0;
                JoinTopicListActivity this$0 = this.f49334OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean isSuccess = response.getIsSuccess();
                boolean z2 = z;
                if (isSuccess) {
                    if (response.getPage().getDateSort() != null) {
                        Long dateSort = response.getPage().getDateSort();
                        Intrinsics.checkNotNull(dateSort);
                        this$0.f25598OooOo = dateSort.longValue();
                    }
                    this$0.f25602OooOo0o++;
                    if (z2) {
                        this$0.OooOoO0().OooOoO0((List) response.getData());
                    } else {
                        o0000oo<TopicInfoModel> o0000ooVarOooOoO0 = this$0.OooOoO0();
                        Object data = response.getData();
                        Intrinsics.checkNotNull(data);
                        o0000ooVarOooOoO0.OooO0O0((Collection) data);
                    }
                }
                this$0.OooOo().f44918OooO0OO.OooOooo(z2, response.getIsSuccess(), response.getNoMoreData());
                this$0.OooOoO0().Oooo0O0(response.getIsSuccess());
            }
        });
    }

    public final o0000oo<TopicInfoModel> OooOoO0() {
        return (o0000oo) this.f25600OooOo00.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44916OooO00o);
        this.f25601OooOo0O = getIntent().getStringExtra("Id");
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(getString(p562o0oOo000.o000000.Following_Topics));
        }
        OooOOo0(1);
        OooOo().f44918OooO0OO.setOnRefreshListener(new androidx.media3.session.o00Ooo(this));
        OooOo().f44918OooO0OO.setOnLoadMoreListener(new o0OO00OO(this));
        OooOoO0().Oooo00O(true);
        OooOoO0().OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_message_system);
        OooOoO0().Oooo000(p562o0oOo000.o000000.null_topic);
        OooOoO0().Oooo0OO(new p492o0o00OO0.o0OO00O(this));
        OooOo().f44917OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOo().f44917OooO0O0.setAdapter(OooOoO0());
        OooOoO0().f13176OooO0o = new androidx.media3.session.oo000o(this);
        OooOoO(true);
        LiveEventBus.get("TOPIC_FOLLOW_CHANGE", TopicFollowChange.class).observe(this, new Observer() { // from class: o0o00OO0.o0OOO0o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TopicFollowChange topicFollowChange = (TopicFollowChange) obj;
                int i = JoinTopicListActivity.f25596OooOoO0;
                JoinTopicListActivity this$0 = this.f49327OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                List<TopicInfoModel> list = this$0.OooOoO0().f13189OooOOoo;
                Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
                int i2 = 0;
                int i3 = -1;
                for (Object obj2 : list) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (((TopicInfoModel) obj2).getId() == topicFollowChange.getTopicId()) {
                        i3 = i2;
                    }
                    i2 = i4;
                }
                if (i3 != -1) {
                    this$0.OooOoO0().OooOOo(i3);
                }
            }
        });
    }
}
