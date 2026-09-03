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
import p405o0Oo0OOO.a0;
import p405o0Oo0OOO.c;
import p405o0Oo0OOO.r0;
import p643o0ooOOOO.k3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteHistoryDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVoteHistoryDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoteHistoryDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteHistoryDetailActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,169:1\n22#2,2:170\n75#3,13:172\n*S KotlinDebug\n*F\n+ 1 VoteHistoryDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteHistoryDetailActivity\n*L\n40#1:170,2\n41#1:172,13\n*E\n"})
public final class VoteHistoryDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oo0ooO f26331OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f26336OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26337OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f26338OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26330OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(c.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26333OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VoteHistoryDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26343OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26343OooO0Oo;
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
    public final Lazy f26332OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f26334OooOo0O = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f26335OooOo0o = new ConcatAdapter(new RecyclerView.Adapter[0]);

    public static final class OooO00o extends Lambda implements Function0<a0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final a0 invoke() {
            VoteHistoryDetailActivity voteHistoryDetailActivity = VoteHistoryDetailActivity.this;
            a0 a0VarInflate = a0.inflate(voteHistoryDetailActivity.getLayoutInflater(), voteHistoryDetailActivity.OooOo().f43746OooO0O0, false);
            Intrinsics.checkNotNullExpressionValue(a0VarInflate, "inflate(...)");
            return a0VarInflate;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<r0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r0 invoke() {
            VoteHistoryDetailActivity voteHistoryDetailActivity = VoteHistoryDetailActivity.this;
            r0 r0VarInflate = r0.inflate(voteHistoryDetailActivity.getLayoutInflater(), voteHistoryDetailActivity.OooOo().f43746OooO0O0, false);
            Intrinsics.checkNotNullExpressionValue(r0VarInflate, "inflate(...)");
            return r0VarInflate;
        }
    }

    public final c OooOo() {
        return (c) this.f26330OooOOoo.getValue();
    }

    public final a0 OooOoO0() {
        return (a0) this.f26334OooOo0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f43745OooO00o);
        OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_vote_game_history_detail));
        this.f26331OooOo = new oo0ooO(this, p562o0oOo000.oo0o0Oo.room_item_vote_game_history_detail);
        OooOo().f43746OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        TextView textView = ((r0) this.f26332OooOo0.getValue()).f45433OooO00o;
        Intrinsics.checkNotNullExpressionValue(textView, "getRoot(...)");
        k3 k3Var = new k3(textView);
        ConcatAdapter concatAdapter = this.f26335OooOo0o;
        concatAdapter.OooO0O0(k3Var);
        oo0ooO oo0ooo = this.f26331OooOo;
        if (oo0ooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0ooo = null;
        }
        concatAdapter.OooO0O0(oo0ooo);
        LinearLayoutCompat linearLayoutCompat = OooOoO0().f43707OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "getRoot(...)");
        concatAdapter.OooO0O0(new k3(linearLayoutCompat));
        OooOo().f43746OooO0O0.setAdapter(concatAdapter);
        OooOoO0().f43708OooO0O0.setOnClickListener(new o0OO00OO(this));
        ((VoteHistoryDetailVM) this.f26333OooOo00.getValue()).getVoteActivityDetail(getIntent().getLongExtra("VOTE_GAME_ROOM_ID", 0L), getIntent().getLongExtra("VOTE_GAME_VOTE_ID", 0L)).observe(this, new p384o0OOoo0O.o000oOoO(new o0OO000o(this), null, new oo0oO0(this), false, 10));
    }
}
