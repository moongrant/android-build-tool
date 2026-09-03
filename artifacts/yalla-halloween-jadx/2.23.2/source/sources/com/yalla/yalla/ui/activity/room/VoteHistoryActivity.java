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
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.b0;
import p405o0Oo0OOO.d;
import p643o0ooOOOO.k3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/VoteHistoryActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVoteHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoteHistoryActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteHistoryActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,99:1\n22#2,2:100\n75#3,13:102\n*S KotlinDebug\n*F\n+ 1 VoteHistoryActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteHistoryActivity\n*L\n32#1:100,2\n36#1:102,13\n*E\n"})
public final class VoteHistoryActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f26312OooOoO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public k3 f26314OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0OO000 f26318OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26313OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(d.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f26316OooOo00 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26315OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VoteHistoryVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.VoteHistoryActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26328OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26328OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f26317OooOo0O = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26319OooOoO0 = 1;

    public static final class OooO00o extends Lambda implements Function0<b0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b0 invoke() {
            VoteHistoryActivity voteHistoryActivity = VoteHistoryActivity.this;
            b0 b0VarInflate = b0.inflate(voteHistoryActivity.getLayoutInflater(), voteHistoryActivity.OooOo().f43771OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(b0VarInflate, "inflate(...)");
            return b0VarInflate;
        }
    }

    @SourceDebugExtension({"SMAP\nVoteHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoteHistoryActivity.kt\ncom/yalla/yalla/ui/activity/room/VoteHistoryActivity$loadData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<List<VoteModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26322OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(1);
            this.f26322OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<VoteModel> list) {
            List<VoteModel> list2 = list;
            VoteHistoryActivity voteHistoryActivity = VoteHistoryActivity.this;
            if (list2 == null || list2.size() <= 0) {
                int i = VoteHistoryActivity.f26312OooOoO;
                voteHistoryActivity.OooOo().f43770OooO0O0.OooOo00(false);
            }
            if (list2 != null) {
                o0OO000 o0oo000 = null;
                if (this.f26322OooO0o0) {
                    o0OO000 o0oo001 = voteHistoryActivity.f26318OooOo0o;
                    if (o0oo001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        o0oo000 = o0oo001;
                    }
                    o0oo000.OooOoO0(list2);
                } else {
                    o0OO000 o0oo002 = voteHistoryActivity.f26318OooOo0o;
                    if (o0oo002 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        o0oo000 = o0oo002;
                    }
                    o0oo000.OooO0O0(list2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = VoteHistoryActivity.f26312OooOoO;
            VoteHistoryActivity.this.OooOo().f43770OooO0O0.OooOo00(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<VoteModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26325OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f26325OooO0o0 = z;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003c  */
        /* JADX WARN: Code duplicated, block: B:22:0x005c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060  */
        /* JADX WARN: Code duplicated, block: B:27:0x006c  */
        /* JADX WARN: Code duplicated, block: B:28:0x006e  */
        /* JADX WARN: Code duplicated, block: B:30:0x0076  */
        /* JADX WARN: Code duplicated, block: B:31:0x007b  */
        /* JADX WARN: Code duplicated, block: B:33:0x007e  */
        /* JADX WARN: Code duplicated, block: B:36:0x0083  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b  */
        /* JADX WARN: Code duplicated, block: B:42:0x008f  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<VoteModel>> apiResult) {
            boolean z;
            o0OO000 o0oo000;
            k3 k3Var;
            List<VoteModel> data;
            int size;
            ApiResult<List<VoteModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            VoteHistoryActivity voteHistoryActivity = VoteHistoryActivity.this;
            o0OO000 o0oo001 = voteHistoryActivity.f26318OooOo0o;
            k3 k3Var2 = null;
            if (o0oo001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o0oo001 = null;
            }
            o0oo001.Oooo00o();
            RefreshLayout refreshLayout = voteHistoryActivity.OooOo().f43770OooO0O0;
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
            boolean z2 = this.f26325OooO0o0;
            refreshLayout.OooOoOO(z2, zIsSuccess, z);
            List<VoteModel> data3 = it.getData();
            ConcatAdapter concatAdapter = voteHistoryActivity.f26317OooOo0O;
            if (data3 == null) {
                o0oo000 = voteHistoryActivity.f26318OooOo0o;
                if (o0oo000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o0oo000 = null;
                }
                if (o0oo000.f13189OooOOoo.size() <= 0) {
                    if (z2) {
                        data = it.getData();
                        if (data != null) {
                            size = data.size();
                        } else {
                            size = 0;
                        }
                        if (1 > size && size < 11) {
                        }
                    }
                    k3Var = voteHistoryActivity.f26314OooOo;
                    if (k3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
                    } else {
                        k3Var2 = k3Var;
                    }
                    concatAdapter.OooO0Oo(k3Var2);
                }
                concatAdapter.notifyDataSetChanged();
                return Unit.INSTANCE;
            }
            List<VoteModel> data4 = it.getData();
            if ((data4 != null ? data4.size() : 0) <= 0) {
                o0oo000 = voteHistoryActivity.f26318OooOo0o;
                if (o0oo000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o0oo000 = null;
                }
                if (o0oo000.f13189OooOOoo.size() <= 0) {
                    if (z2) {
                        data = it.getData();
                        if (data != null) {
                            size = data.size();
                        } else {
                            size = 0;
                        }
                        if (1 > size && size < 11) {
                        }
                    }
                    k3Var = voteHistoryActivity.f26314OooOo;
                    if (k3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
                    } else {
                        k3Var2 = k3Var;
                    }
                    concatAdapter.OooO0Oo(k3Var2);
                }
            } else {
                if (z2) {
                    data = it.getData();
                    if (data != null) {
                        size = data.size();
                    } else {
                        size = 0;
                    }
                    if (1 > size && size < 11) {
                    }
                }
                k3Var = voteHistoryActivity.f26314OooOo;
                if (k3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
                } else {
                    k3Var2 = k3Var;
                }
                concatAdapter.OooO0Oo(k3Var2);
            }
            concatAdapter.notifyDataSetChanged();
            return Unit.INSTANCE;
            k3 k3Var3 = voteHistoryActivity.f26314OooOo;
            if (k3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerAdapter");
            } else {
                k3Var2 = k3Var3;
            }
            concatAdapter.OooO0O0(k3Var2);
            concatAdapter.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    public final d OooOo() {
        return (d) this.f26313OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0(boolean z) {
        Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
        if (value == null) {
            return;
        }
        long jLongValue = value.longValue();
        this.f26319OooOoO0 = z ? 1 : 1 + this.f26319OooOoO0;
        ((VoteHistoryVM) this.f26315OooOo0.getValue()).getVoteActivityHistory(jLongValue, this.f26319OooOoO0).observe(this, new p384o0OOoo0O.o000oOoO(new OooO0O0(z), new OooO0OO(), new OooO0o(z), false, 8));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f43769OooO00o);
        OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_vote_game_history_title));
        RefreshLayout refreshLayout = OooOo().f43770OooO0O0;
        refreshLayout.f20877OoooOo0 = new p022Oooo00O.o0oOo0O0(this);
        refreshLayout.f20857OooOooO = true;
        OooOo().f43770OooO0O0.OooOoo0(new androidx.media3.session.o00Oo0(this));
        o0OO000 o0oo000 = new o0OO000(this, p562o0oOo000.oo0o0Oo.room_item_vote_history);
        this.f26318OooOo0o = o0oo000;
        o0oo000.Oooo000(p562o0oOo000.o000000.room_vote_game_no_history);
        o0OO000 o0oo001 = this.f26318OooOo0o;
        o0OO000 o0oo002 = null;
        if (o0oo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0oo001 = null;
        }
        o0oo001.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_room_record);
        o0OO000 o0oo003 = this.f26318OooOo0o;
        if (o0oo003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0oo003 = null;
        }
        o0oo003.f13176OooO0o = new p045Oooooo.o000O0O0(this);
        OooOo().f43771OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        TextView textView = ((b0) this.f26316OooOo00.getValue()).f43734OooO00o;
        Intrinsics.checkNotNullExpressionValue(textView, "getRoot(...)");
        this.f26314OooOo = new k3(textView);
        o0OO000 o0oo004 = this.f26318OooOo0o;
        if (o0oo004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0oo002 = o0oo004;
        }
        ConcatAdapter concatAdapter = this.f26317OooOo0O;
        concatAdapter.OooO0O0(o0oo002);
        OooOo().f43771OooO0OO.setAdapter(concatAdapter);
        OooOoO0(true);
    }
}
