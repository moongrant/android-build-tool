package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.impl.PostGifPlayControl;
import com.app.base.view.HeaderLayout;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.MomentEditRecordHeadView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p522o0o0O0o.oOO00O;
import p538o0o0Oo0.o00000;
import p563o0oOo0.o00000OO;
import p649o0ooOOoo.oc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentEditRecordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentEditRecordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22315OoooooO = new OooO00o();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public long f22322Oooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22316OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(oc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f22317Ooooo00 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22318Ooooo0o = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22319OooooO0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22320OooooOO = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22321OooooOo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentEditRecordActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentEditRecordActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentEditRecordActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22332Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22332Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f22323Oooooo0 = 1;

    public static final class OooO extends Lambda implements Function0<Long> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(MomentEditRecordActivity.this.getIntent().getLongExtra("Data", 0L));
        }
    }

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00000OO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            return new o00000OO(MomentEditRecordActivity.this, MomentAdapterTag.MomentEditRecord);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MomentEditRecordHeadView> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentEditRecordHeadView invoke() {
            return new MomentEditRecordHeadView(MomentEditRecordActivity.this, null, 0, 6, null);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<MomentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f22328Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f22328Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentDetailModel>> apiResult) {
            ApiResult<List<MomentDetailModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                List<MomentDetailModel> data = it.getData();
                if (data != null) {
                    boolean z = this.f22328Oooo0oO;
                    MomentEditRecordActivity momentEditRecordActivity = MomentEditRecordActivity.this;
                    if (z) {
                        OooO00o oooO00o = MomentEditRecordActivity.f22315OoooooO;
                        momentEditRecordActivity.OooOoo().setNewData(data);
                        ((PostGifPlayControl) momentEditRecordActivity.f22318Ooooo0o.getValue()).OooO0O0();
                    } else {
                        OooO00o oooO00o2 = MomentEditRecordActivity.f22315OoooooO;
                        momentEditRecordActivity.OooOoo().addData((Collection) data);
                    }
                }
            } else {
                MomentEditRecordActivity momentEditRecordActivity2 = MomentEditRecordActivity.this;
                OooO00o oooO00o3 = MomentEditRecordActivity.f22315OoooooO;
                momentEditRecordActivity2.OooOoo().loadError();
            }
            MomentEditRecordActivity.this.f22322Oooooo = oOO00O.OooO0o(it.getPage().getDateSort());
            MomentEditRecordActivity momentEditRecordActivity3 = MomentEditRecordActivity.this;
            momentEditRecordActivity3.f22323Oooooo0++;
            List<MomentDetailModel> data2 = momentEditRecordActivity3.OooOoo().getData();
            Intrinsics.checkNotNullExpressionValue(data2, "adapter.data");
            if (!data2.isEmpty()) {
                MomentEditRecordActivity.this.OooOooo().setData(o000O0O0.OooO0OO(R.string.Moment_Edit_Record_Tips));
                MomentEditRecordActivity.this.OooOooo().setVisibility(0);
            }
            o00000OO o00000ooOooOoo = MomentEditRecordActivity.this.OooOoo();
            Boolean boolValueOf = Boolean.valueOf(this.f22328Oooo0oO);
            Boolean bool = Boolean.TRUE;
            List<MomentDetailModel> data3 = it.getData();
            o00000ooOooOoo.setLoadComplete(boolValueOf, bool, Boolean.valueOf(data3 == null || data3.isEmpty()));
            XRefreshLayout xRefreshLayout = MomentEditRecordActivity.this.OooOooO().f50183OooO0OO;
            boolean z2 = this.f22328Oooo0oO;
            List<MomentDetailModel> data4 = it.getData();
            xRefreshLayout.Oooo0o0(z2, true, data4 == null || data4.isEmpty());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<PostGifPlayControl> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PostGifPlayControl invoke() {
            MomentEditRecordActivity momentEditRecordActivity = MomentEditRecordActivity.this;
            OooO00o oooO00o = MomentEditRecordActivity.f22315OoooooO;
            return new PostGifPlayControl(momentEditRecordActivity, momentEditRecordActivity.OooOooO().f50182OooO0O0);
        }
    }

    public final o00000OO OooOoo() {
        return (o00000OO) this.f22319OooooO0.getValue();
    }

    public final oc OooOooO() {
        return (oc) this.f22316OoooOoo.getValue();
    }

    public final MomentEditRecordHeadView OooOooo() {
        return (MomentEditRecordHeadView) this.f22317Ooooo00.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentVM Oooo000() {
        return (MomentVM) this.f22321OooooOo.getValue();
    }

    public final void Oooo00O(boolean z) {
        if (z) {
            this.f22323Oooooo0 = 1;
            this.f22322Oooooo = 0L;
        }
        Oooo000().momentEditHistory(((Number) this.f22320OooooOO.getValue()).longValue(), this.f22323Oooooo0, this.f22322Oooooo).observe(this, new o0o0000.OooOo(null, null, new OooO0o(z), false, 11));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f50181OooO00o);
        OooOooO().f50183OooO0OO.setOnRefreshListener(new com.facebook.OooOO0(this, 2));
        OooOooO().f50183OooO0OO.setOnLoadMoreListener(new o0O0O0o0.OooO0OO(this, 5));
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Moment_Edit_Record_Title);
        }
        OooOoo().f44994OooO0o = EnterRoomParentPage.Moments_Other_SharedRoom;
        OooOoo().setLoadErrorClickListener(new o00000(this));
        OooOoo().setEmptyText(R.string.moments_none);
        OooOoo().setEmptyImageRes(R.drawable.ic_empty_moment);
        OooOooO().f50182OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOooO().f50182OooO0O0.setAdapter(OooOoo());
        OooOooo().setVisibility(8);
        OooOoo().setHeaderView(OooOooo());
        Oooo00O(true);
        Oooo000().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo000().statisticalTime();
    }
}
