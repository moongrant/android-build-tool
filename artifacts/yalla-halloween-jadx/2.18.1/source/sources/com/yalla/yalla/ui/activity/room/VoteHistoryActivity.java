package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.room.VoteHistoryVM;
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
import p143o00OOooo.o00O00;
import p143o00OOooo.o00O00O;
import p177o00Ooooo.oO0O000;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p464o0Ooo0oO.o0000OO0;
import p530o0o0OOO.o00OO00O;
import p544o0o0OoOO.t7;
import p649o0ooOOoo.af;
import p649o0ooOOoo.xf;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteHistoryActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VoteHistoryActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23083Oooooo = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<VoteModel> f23088OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o0000OO0 f23089OooooOo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23084OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(af.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f23085Ooooo00 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23086Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VoteHistoryVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23099Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23099Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f23087OooooO0 = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f23090Oooooo0 = 1;

    public static final class OooO extends Lambda implements Function1<ApiResult<List<VoteModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23092Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f23092Oooo0oO = z;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0040  */
        /* JADX WARN: Code duplicated, block: B:22:0x005c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0062  */
        /* JADX WARN: Code duplicated, block: B:27:0x0070  */
        /* JADX WARN: Code duplicated, block: B:29:0x0074  */
        /* JADX WARN: Code duplicated, block: B:31:0x007c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0081  */
        /* JADX WARN: Code duplicated, block: B:34:0x0084  */
        /* JADX WARN: Code duplicated, block: B:37:0x0089  */
        /* JADX WARN: Code duplicated, block: B:42:0x0095  */
        /* JADX WARN: Code duplicated, block: B:43:0x0099  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<VoteModel>> apiResult) {
            boolean z;
            p188o00o00o0.OooO0OO<VoteModel> oooO0OO;
            o0000OO0 o0000oo1;
            List<VoteModel> data;
            int size;
            ApiResult<List<VoteModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            p188o00o00o0.OooO0OO<VoteModel> oooO0OO2 = VoteHistoryActivity.this.f23088OooooOO;
            o0000OO0 o0000oo2 = null;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO2 = null;
            }
            oooO0OO2.setLoadComplete();
            RefreshLayout refreshLayout = VoteHistoryActivity.this.OooOoo().f48953OooO0O0;
            boolean z2 = this.f23092Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            if (it.getData() == null) {
                z = true;
            } else {
                List<VoteModel> data2 = it.getData();
                if ((data2 != null ? data2.size() : 0) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            refreshLayout.Oooo00o(z2, zIsSuccess, z);
            if (it.getData() == null) {
                oooO0OO = VoteHistoryActivity.this.f23088OooooOO;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO = null;
                }
                if (oooO0OO.getData().size() <= 0) {
                    if (this.f23092Oooo0oO) {
                        data = it.getData();
                        if (data != null) {
                            size = data.size();
                        } else {
                            size = 0;
                        }
                        if (1 > size && size < 11) {
                        }
                    }
                    VoteHistoryActivity voteHistoryActivity = VoteHistoryActivity.this;
                    ConcatAdapter concatAdapter = voteHistoryActivity.f23087OooooO0;
                    o0000oo1 = voteHistoryActivity.f23089OooooOo;
                    if (o0000oo1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
                    } else {
                        o0000oo2 = o0000oo1;
                    }
                    concatAdapter.OooO0Oo(o0000oo2);
                }
                VoteHistoryActivity.this.f23087OooooO0.notifyDataSetChanged();
                return Unit.INSTANCE;
            }
            List<VoteModel> data3 = it.getData();
            if ((data3 != null ? data3.size() : 0) <= 0) {
                oooO0OO = VoteHistoryActivity.this.f23088OooooOO;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO = null;
                }
                if (oooO0OO.getData().size() <= 0) {
                    if (this.f23092Oooo0oO) {
                        data = it.getData();
                        if (data != null) {
                            size = data.size();
                        } else {
                            size = 0;
                        }
                        if (1 > size && size < 11) {
                        }
                    }
                    VoteHistoryActivity voteHistoryActivity2 = VoteHistoryActivity.this;
                    ConcatAdapter concatAdapter2 = voteHistoryActivity2.f23087OooooO0;
                    o0000oo1 = voteHistoryActivity2.f23089OooooOo;
                    if (o0000oo1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
                    } else {
                        o0000oo2 = o0000oo1;
                    }
                    concatAdapter2.OooO0Oo(o0000oo2);
                }
            } else {
                if (this.f23092Oooo0oO) {
                    data = it.getData();
                    if (data != null) {
                        size = data.size();
                    } else {
                        size = 0;
                    }
                    if (1 > size && size < 11) {
                    }
                }
                VoteHistoryActivity voteHistoryActivity3 = VoteHistoryActivity.this;
                ConcatAdapter concatAdapter3 = voteHistoryActivity3.f23087OooooO0;
                o0000oo1 = voteHistoryActivity3.f23089OooooOo;
                if (o0000oo1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
                } else {
                    o0000oo2 = o0000oo1;
                }
                concatAdapter3.OooO0Oo(o0000oo2);
            }
            VoteHistoryActivity.this.f23087OooooO0.notifyDataSetChanged();
            return Unit.INSTANCE;
            VoteHistoryActivity voteHistoryActivity4 = VoteHistoryActivity.this;
            ConcatAdapter concatAdapter4 = voteHistoryActivity4.f23087OooooO0;
            o0000OO0 o0000oo3 = voteHistoryActivity4.f23089OooooOo;
            if (o0000oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
            } else {
                o0000oo2 = o0000oo3;
            }
            concatAdapter4.OooO0O0(o0000oo2);
            VoteHistoryActivity.this.f23087OooooO0.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<xf> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final xf invoke() {
            xf xfVarInflate = xf.inflate(VoteHistoryActivity.this.getLayoutInflater(), VoteHistoryActivity.this.OooOoo().f48954OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(xfVarInflate, "inflate(layoutInflater, binding.rvHistory, false)");
            return xfVarInflate;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<VoteModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23095Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f23095Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<VoteModel> list) {
            List<VoteModel> list2 = list;
            if (list2 == null || list2.size() <= 0) {
                VoteHistoryActivity voteHistoryActivity = VoteHistoryActivity.this;
                OooO00o oooO00o = VoteHistoryActivity.f23083Oooooo;
                voteHistoryActivity.OooOoo().f48953OooO0O0.OooOoOO(false);
            }
            if (list2 != null) {
                boolean z = this.f23095Oooo0oO;
                VoteHistoryActivity voteHistoryActivity2 = VoteHistoryActivity.this;
                p188o00o00o0.OooO0OO<VoteModel> oooO0OO = null;
                if (z) {
                    p188o00o00o0.OooO0OO<VoteModel> oooO0OO2 = voteHistoryActivity2.f23088OooooOO;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oooO0OO = oooO0OO2;
                    }
                    oooO0OO.setNewData(list2);
                } else {
                    p188o00o00o0.OooO0OO<VoteModel> oooO0OO3 = voteHistoryActivity2.f23088OooooOO;
                    if (oooO0OO3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oooO0OO = oooO0OO3;
                    }
                    oooO0OO.addData(list2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiError, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            VoteHistoryActivity voteHistoryActivity = VoteHistoryActivity.this;
            OooO00o oooO00o = VoteHistoryActivity.f23083Oooooo;
            voteHistoryActivity.OooOoo().f48953OooO0O0.OooOoOO(false);
            return Unit.INSTANCE;
        }
    }

    public final af OooOoo() {
        return (af) this.f23084OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO(boolean z) {
        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        if (value == null) {
            return;
        }
        long jLongValue = value.longValue();
        this.f23090Oooooo0 = z ? 1 : 1 + this.f23090Oooooo0;
        ((VoteHistoryVM) this.f23086Ooooo0o.getValue()).getVoteActivityHistory(jLongValue, this.f23090Oooooo0).observe(this, new o0o0000.OooOo(new OooO0OO(z), new OooO0o(), new OooO(z), false, 8));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f48952OooO00o);
        OooOoO0(o000O0O0.OooO0OO(R.string.room_vote_game_history_title));
        OooOoo().f48953OooO0O0.Oooo0O0(new o00O00O(this));
        OooOoo().f48953OooO0O0.Oooo0(new o00O00(this, 1));
        t7 t7Var = new t7(this);
        this.f23088OooooOO = t7Var;
        t7Var.setEmptyText(R.string.room_vote_game_no_history);
        p188o00o00o0.OooO0OO<VoteModel> oooO0OO = this.f23088OooooOO;
        p188o00o00o0.OooO0OO<VoteModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_room_record);
        p188o00o00o0.OooO0OO<VoteModel> oooO0OO3 = this.f23088OooooOO;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setOnItemClickListener(new oO0O000(this, 1));
        OooOoo().f48954OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        TextView textView = ((xf) this.f23085Ooooo00.getValue()).f50979OooO00o;
        Intrinsics.checkNotNullExpressionValue(textView, "footerBinding.root");
        this.f23089OooooOo = new o0000OO0(textView);
        ConcatAdapter concatAdapter = this.f23087OooooO0;
        p188o00o00o0.OooO0OO<VoteModel> oooO0OO4 = this.f23088OooooOO;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO4;
        }
        concatAdapter.OooO0O0(oooO0OO2);
        OooOoo().f48954OooO0OO.setAdapter(this.f23087OooooO0);
        OooOooO(true);
    }
}
