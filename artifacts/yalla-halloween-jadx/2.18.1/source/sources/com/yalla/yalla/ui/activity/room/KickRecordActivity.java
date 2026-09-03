package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.SearchView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.RoomKickUser;
import com.yalla.yalla.model.SearchKickRecordModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.KickRecordActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;
import p192o00o0O0.o00oO0o;
import p192o00o0O0.o0ooOOo;
import p254o00ooO0O.o0000O0O;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p466o0OooO0.o00000OO;
import p516o0o0O000.o00000;
import p544o0o0OoOO.i4;
import p544o0o0OoOO.j4;
import p544o0o0OoOO.k4;
import p544o0o0OoOO.l4;
import p607o0oo0O0.o00O0O;
import p607o0oo0O0.o00Oo0;
import p607o0oo0O0.o0OoOo0;
import p649o0ooOOoo.ke;
import p649o0ooOOoo.kg;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/KickRecordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class KickRecordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final /* synthetic */ int f22842Oooooo = 0;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<RoomKickUser> f22845Ooooo0o;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public long f22848OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public kg f22849Oooooo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22843OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ke.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22844Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o00Oo0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.KickRecordActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.KickRecordActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.KickRecordActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22852Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22852Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f22846OooooO0 = 1;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f22847OooooOO = 1;

    public final ke OooOoo() {
        return (ke) this.f22843OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO(final boolean z) {
        if (!z) {
            this.f22848OooooOo = 0L;
            this.f22846OooooO0 = 1;
        }
        o00Oo0 o00oo1 = (o00Oo0) this.f22844Ooooo00.getValue();
        long j = this.f22848OooooOo;
        int i = this.f22846OooooO0;
        Objects.requireNonNull(o00oo1);
        o0000O0O.OooO00o(new o0OoOo0(j, i, null)).observe(this, new Observer() { // from class: o0o0OoOO.g4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                KickRecordActivity this$0 = this.f44238OooO00o;
                boolean z2 = z;
                ApiResult apiResult = (ApiResult) obj;
                int i2 = KickRecordActivity.f22842Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0OO<RoomKickUser> oooO0OO = null;
                if (apiResult.isSuccess()) {
                    List<RoomKickUser> list = (List) apiResult.getData();
                    if (list != null) {
                        if (z2) {
                            OooO0OO<RoomKickUser> oooO0OO2 = this$0.f22845Ooooo0o;
                            if (oooO0OO2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                oooO0OO2 = null;
                            }
                            oooO0OO2.addData(list);
                        } else {
                            OooO0OO<RoomKickUser> oooO0OO3 = this$0.f22845Ooooo0o;
                            if (oooO0OO3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                oooO0OO3 = null;
                            }
                            oooO0OO3.setNewData(list);
                            if (list.isEmpty()) {
                                kg kgVar = this$0.f22849Oooooo0;
                                if (kgVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("header");
                                    kgVar = null;
                                }
                                SearchView searchView = kgVar.f49873OooO0O0;
                                Intrinsics.checkNotNullExpressionValue(searchView, "header.search");
                                oOO00O.OooO00o(searchView);
                            } else {
                                kg kgVar2 = this$0.f22849Oooooo0;
                                if (kgVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("header");
                                    kgVar2 = null;
                                }
                                SearchView searchView2 = kgVar2.f49873OooO0O0;
                                Intrinsics.checkNotNullExpressionValue(searchView2, "header.search");
                                oOO00O.OooO(searchView2);
                                kg kgVar3 = this$0.f22849Oooooo0;
                                if (kgVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("header");
                                    kgVar3 = null;
                                }
                                kgVar3.f49873OooO0O0.OooO0O0();
                            }
                        }
                    }
                    this$0.f22846OooooO0++;
                    Long dateSort = apiResult.getPage().getDateSort();
                    this$0.f22848OooooOo = dateSort != null ? dateSort.longValue() : 0L;
                    OooO0OO<RoomKickUser> oooO0OO4 = this$0.f22845Ooooo0o;
                    if (oooO0OO4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oooO0OO = oooO0OO4;
                    }
                    oooO0OO.setLoadComplete();
                } else {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                }
                XRefreshLayout xRefreshLayout = this$0.OooOoo().f49869OooO0OO;
                boolean z3 = !z2;
                boolean zIsSuccess = apiResult.isSuccess();
                List list2 = (List) apiResult.getData();
                xRefreshLayout.Oooo0o0(z3, zIsSuccess, (list2 != null ? list2.size() : 0) < 15);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooo(final boolean z) {
        if (!z) {
            this.f22847OooooOO = 1;
        }
        o00Oo0 o00oo1 = (o00Oo0) this.f22844Ooooo00.getValue();
        kg kgVar = this.f22849Oooooo0;
        if (kgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            kgVar = null;
        }
        String content = kgVar.f49873OooO0O0.getSearchText();
        int i = this.f22847OooooOO;
        Objects.requireNonNull(o00oo1);
        Intrinsics.checkNotNullParameter(content, "content");
        o0000O0O.OooO00o(new o00O0O(content, i, null)).observe(this, new Observer() { // from class: o0o0OoOO.h4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<RoomKickUser> data;
                List<RoomKickUser> data2;
                KickRecordActivity this$0 = this.f44243OooO00o;
                boolean z2 = z;
                ApiResult apiResult = (ApiResult) obj;
                int i2 = KickRecordActivity.f22842Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0OO<RoomKickUser> oooO0OO = null;
                if (apiResult.isSuccess()) {
                    SearchKickRecordModel searchKickRecordModel = (SearchKickRecordModel) apiResult.getData();
                    if (searchKickRecordModel != null && (data2 = searchKickRecordModel.getData()) != null) {
                        if (z2) {
                            OooO0OO<RoomKickUser> oooO0OO2 = this$0.f22845Ooooo0o;
                            if (oooO0OO2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                oooO0OO2 = null;
                            }
                            oooO0OO2.addData(data2);
                        } else {
                            OooO0OO<RoomKickUser> oooO0OO3 = this$0.f22845Ooooo0o;
                            if (oooO0OO3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                oooO0OO3 = null;
                            }
                            oooO0OO3.setNewData(data2);
                        }
                    }
                    this$0.f22847OooooOO++;
                    OooO0OO<RoomKickUser> oooO0OO4 = this$0.f22845Ooooo0o;
                    if (oooO0OO4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oooO0OO = oooO0OO4;
                    }
                    oooO0OO.setLoadComplete();
                } else {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                }
                XRefreshLayout xRefreshLayout = this$0.OooOoo().f49869OooO0OO;
                boolean z3 = !z2;
                boolean zIsSuccess = apiResult.isSuccess();
                SearchKickRecordModel searchKickRecordModel2 = (SearchKickRecordModel) apiResult.getData();
                xRefreshLayout.Oooo0o0(z3, zIsSuccess, ((searchKickRecordModel2 == null || (data = searchKickRecordModel2.getData()) == null) ? 0 : data.size()) < 15);
            }
        });
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49867OooO00o);
        OooOo(R.string.room_setting_kick_record);
        OooOoo().f49869OooO0OO.f12222o000O0Oo = new o00000OO(this);
        OooOoo().f49869OooO0OO.f12224o000OO0O = new o00oO0o(this);
        this.f22845Ooooo0o = new i4(this);
        kg kgVarInflate = kg.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(kgVarInflate, "inflate(layoutInflater)");
        this.f22849Oooooo0 = kgVarInflate;
        p188o00o00o0.OooO0OO<RoomKickUser> oooO0OO = this.f22845Ooooo0o;
        kg kgVar = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        kg kgVar2 = this.f22849Oooooo0;
        if (kgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            kgVar2 = null;
        }
        oooO0OO.addHeaderView(kgVar2.f49872OooO00o);
        p188o00o00o0.OooO0OO<RoomKickUser> oooO0OO2 = this.f22845Ooooo0o;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setEmptyText(R.string.room_kick_no_data);
        p188o00o00o0.OooO0OO<RoomKickUser> oooO0OO3 = this.f22845Ooooo0o;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setEmptyImageRes(R.drawable.ic_empty_delete);
        p188o00o00o0.OooO0OO<RoomKickUser> oooO0OO4 = this.f22845Ooooo0o;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setLoadErrorClickListener(new j4(this));
        OooOoo().f49868OooO0O0.setLayoutManager(new FixLinearLayoutManager(this, 1));
        RecyclerView recyclerView = OooOoo().f49868OooO0O0;
        p188o00o00o0.OooO0OO<RoomKickUser> oooO0OO5 = this.f22845Ooooo0o;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO5 = null;
        }
        recyclerView.setAdapter(oooO0OO5);
        RecyclerView recyclerView2 = OooOoo().f49868OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvList");
        o00000.OooO00o(recyclerView2);
        p188o00o00o0.OooO0OO<RoomKickUser> oooO0OO6 = this.f22845Ooooo0o;
        if (oooO0OO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO6 = null;
        }
        oooO0OO6.setOnItemChildClickListener(new o0ooOOo(this));
        p188o00o00o0.OooO0OO<RoomKickUser> oooO0OO7 = this.f22845Ooooo0o;
        if (oooO0OO7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO7 = null;
        }
        oooO0OO7.setLoadErrorClickListener(new k4(this));
        kg kgVar3 = this.f22849Oooooo0;
        if (kgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
        } else {
            kgVar = kgVar3;
        }
        kgVar.f49873OooO0O0.setSearchTextChangedListener(new l4(this));
        OooOooO(false);
    }
}
