package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.TopicInfoVM;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p177o00Ooooo.oO0;
import p177o00Ooooo.oOo0000O;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o00O000o;
import p358o0OOOo0o.o0000O0O;
import p538o0o0Oo0.o000000O;
import p649o0ooOOoo.pc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/JoinTopicListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class JoinTopicListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22299Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public String f22303OooooO0;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public long f22305OooooOo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22300OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(pc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f22301Ooooo00 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22302Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.JoinTopicListActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22309Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22309Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f22304OooooOO = 1;

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO invoke() {
            return new OooO(JoinTopicListActivity.this);
        }
    }

    public final pc OooOoo() {
        return (pc) this.f22300OoooOoo.getValue();
    }

    public final p188o00o00o0.OooO0OO<TopicInfoModel> OooOooO() {
        return (p188o00o00o0.OooO0OO) this.f22301Ooooo00.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooo(final boolean z) {
        if (z) {
            this.f22304OooooOO = 1;
            this.f22305OooooOo = 0L;
        }
        TopicInfoVM topicInfoVM = (TopicInfoVM) this.f22302Ooooo0o.getValue();
        String str = this.f22303OooooO0;
        if (str == null) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        topicInfoVM.loadUserTopicListAll(str, android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), this.f22305OooooOo, ""), this.f22304OooooOO).observe(this, new Observer() { // from class: o0o0Oo0.o000000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                JoinTopicListActivity this$0 = this.f43908OooO00o;
                boolean z2 = z;
                Response response = (Response) obj;
                JoinTopicListActivity.OooO00o oooO00o = JoinTopicListActivity.f22299Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess()) {
                    if (response.getPage().getDateSort() != null) {
                        Long dateSort = response.getPage().getDateSort();
                        Intrinsics.checkNotNull(dateSort);
                        this$0.f22305OooooOo = dateSort.longValue();
                    }
                    this$0.f22304OooooOO++;
                    if (z2) {
                        this$0.OooOooO().setNewData((List) response.getData());
                    } else {
                        OooO0OO<TopicInfoModel> oooO0OOOooOooO = this$0.OooOooO();
                        Object data = response.getData();
                        Intrinsics.checkNotNull(data);
                        oooO0OOOooOooO.addData((Collection<? extends TopicInfoModel>) data);
                    }
                }
                this$0.OooOoo().f50285OooO0OO.Oooo0o0(z2, response.getIsSuccess(), response.getNoMoreData());
                this$0.OooOooO().setLoadComplete(response.getIsSuccess());
            }
        });
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50283OooO00o);
        this.f22303OooooO0 = getIntent().getStringExtra("Id");
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(getString(R.string.Following_Topics));
        }
        OooOoo().f50285OooO0OO.setOnRefreshListener(new oO0(this, 1));
        OooOoo().f50285OooO0OO.setOnLoadMoreListener(new oOo0000O(this));
        OooOooO().setFirstLoading(true);
        OooOooO().setEmptyImageRes(R.drawable.ic_empty_message_system);
        OooOooO().setEmptyText(R.string.null_topic);
        OooOooO().setLoadErrorClickListener(new o000000O(this));
        OooOoo().f50284OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoo().f50284OooO0O0.setAdapter(OooOooO());
        OooOooO().setOnItemClickListener(new o0000O0O(this));
        OooOooo(true);
    }
}
