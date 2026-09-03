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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.c9;
import p641o0ooOOOO.m8;
import p641o0ooOOOO.p7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteHistoryDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVoteHistoryDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoteHistoryDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteHistoryDetailActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,169:1\n22#2,2:170\n75#3,13:172\n*S KotlinDebug\n*F\n+ 1 VoteHistoryDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteHistoryDetailActivity\n*L\n40#1:170,2\n41#1:172,13\n*E\n"})
public final class VoteHistoryDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o0OOO0 f26785OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f26790OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26791OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f26792OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f26784OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(p7.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26787OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VoteHistoryDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26797OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26797OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f26786OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f26788OooOo0O = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f26789OooOo0o = new ConcatAdapter(new RecyclerView.Adapter[0]);

    public static final class OooO00o extends Lambda implements Function0<m8> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final m8 invoke() {
            VoteHistoryDetailActivity voteHistoryDetailActivity = VoteHistoryDetailActivity.this;
            m8 m8VarInflate = m8.inflate(voteHistoryDetailActivity.getLayoutInflater(), voteHistoryDetailActivity.OooOo().f58605OooO0O0, false);
            Intrinsics.checkNotNullExpressionValue(m8VarInflate, "inflate(layoutInflater, …g.rvHistoryDetail, false)");
            return m8VarInflate;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<c9> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c9 invoke() {
            VoteHistoryDetailActivity voteHistoryDetailActivity = VoteHistoryDetailActivity.this;
            c9 c9VarInflate = c9.inflate(voteHistoryDetailActivity.getLayoutInflater(), voteHistoryDetailActivity.OooOo().f58605OooO0O0, false);
            Intrinsics.checkNotNullExpressionValue(c9VarInflate, "inflate(layoutInflater, …g.rvHistoryDetail, false)");
            return c9VarInflate;
        }
    }

    public final p7 OooOo() {
        return (p7) this.f26784OooOOoo.getValue();
    }

    public final m8 OooOoO0() {
        return (m8) this.f26788OooOo0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58604OooO00o);
        OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_vote_game_history_detail));
        this.f26785OooOo = new o0OOO0(this, oO00OO0O.room_item_vote_game_history_detail);
        OooOo().f58605OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        TextView textView = ((c9) this.f26786OooOo0.getValue()).f57669OooO00o;
        Intrinsics.checkNotNullExpressionValue(textView, "headerBinding.root");
        p400o0Oo0OO.OooOOOO oooOOOO = new p400o0Oo0OO.OooOOOO(textView);
        ConcatAdapter concatAdapter = this.f26789OooOo0o;
        concatAdapter.OooO0O0(oooOOOO);
        o0OOO0 o0ooo1 = this.f26785OooOo;
        if (o0ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0ooo1 = null;
        }
        concatAdapter.OooO0O0(o0ooo1);
        LinearLayoutCompat linearLayoutCompat = OooOoO0().f58418OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "footerBinding.root");
        concatAdapter.OooO0O0(new p400o0Oo0OO.OooOOOO(linearLayoutCompat));
        OooOo().f58605OooO0O0.setAdapter(concatAdapter);
        OooOoO0().f58419OooO0O0.setOnClickListener(new o0OOO0OO(this));
        ((VoteHistoryDetailVM) this.f26787OooOo00.getValue()).getVoteActivityDetail(getIntent().getLongExtra("VOTE_GAME_ROOM_ID", 0L), getIntent().getLongExtra("VOTE_GAME_VOTE_ID", 0L)).observe(this, new p377o0OOoOo.o0000OO0(new o0OO(this), null, new o0OOO00(this), false, 10));
    }
}
