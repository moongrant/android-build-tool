package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.room.VoteHistoryDetailVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p464o0Ooo0oO.o0000OO0;
import p544o0o0OoOO.u7;
import p544o0o0OoOO.v7;
import p544o0o0OoOO.w7;
import p544o0o0OoOO.x7;
import p649o0ooOOoo.mg;
import p649o0ooOOoo.wf;
import p649o0ooOOoo.ze;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteHistoryDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VoteHistoryDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23101OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ze.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23102Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VoteHistoryDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23114Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23114Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f23103Ooooo0o = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f23104OooooO0 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f23105OooooOO = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<VoteRankModel> f23106OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f23107Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f23108Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f23109OoooooO;

    public static final class OooO00o extends Lambda implements Function0<wf> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final wf invoke() {
            wf wfVarInflate = wf.inflate(VoteHistoryDetailActivity.this.getLayoutInflater(), VoteHistoryDetailActivity.this.OooOoo().f51096OooO0O0, false);
            Intrinsics.checkNotNullExpressionValue(wfVarInflate, "inflate(layoutInflater, …g.rvHistoryDetail, false)");
            return wfVarInflate;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<mg> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final mg invoke() {
            mg mgVarInflate = mg.inflate(VoteHistoryDetailActivity.this.getLayoutInflater(), VoteHistoryDetailActivity.this.OooOoo().f51096OooO0O0, false);
            Intrinsics.checkNotNullExpressionValue(mgVarInflate, "inflate(layoutInflater, …g.rvHistoryDetail, false)");
            return mgVarInflate;
        }
    }

    public final ze OooOoo() {
        return (ze) this.f23101OoooOoo.getValue();
    }

    public final wf OooOooO() {
        return (wf) this.f23104OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f51095OooO00o);
        OooOoO0(o000O0O0.OooO0OO(R.string.room_vote_game_history_detail));
        this.f23106OooooOo = new w7(this);
        OooOoo().f51096OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        ConcatAdapter concatAdapter = this.f23105OooooOO;
        TextView textView = ((mg) this.f23103Ooooo0o.getValue()).f50034OooO00o;
        Intrinsics.checkNotNullExpressionValue(textView, "headerBinding.root");
        concatAdapter.OooO0O0(new o0000OO0(textView));
        ConcatAdapter concatAdapter2 = this.f23105OooooOO;
        p188o00o00o0.OooO0OO<VoteRankModel> oooO0OO = this.f23106OooooOo;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        concatAdapter2.OooO0O0(oooO0OO);
        ConcatAdapter concatAdapter3 = this.f23105OooooOO;
        LinearLayoutCompat linearLayoutCompat = OooOooO().f50896OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "footerBinding.root");
        concatAdapter3.OooO0O0(new o0000OO0(linearLayoutCompat));
        OooOoo().f51096OooO0O0.setAdapter(this.f23105OooooOO);
        OooOooO().f50897OooO0O0.setOnClickListener(new x7(this));
        ((VoteHistoryDetailVM) this.f23102Ooooo00.getValue()).getVoteActivityDetail(getIntent().getLongExtra("VOTE_GAME_ROOM_ID", 0L), getIntent().getLongExtra("VOTE_GAME_VOTE_ID", 0L)).observe(this, new o0o0000.OooOo(new u7(this), null, new v7(this), false, 10));
    }
}
