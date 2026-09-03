package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.constant.LucklyPacket$Action;
import com.yalla.yalla.common.constant.LucklyPacket$Type;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.PacketHistoryItemModel;
import com.yalla.yalla.model.PacketHistoryModel;
import com.yalla.yalla.ui.vm.room.PacketHistoryVM;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p175o00OooOo.o0OO0O0;
import p534o0o0OOo0.o0OO000;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.bg;
import p649o0ooOOoo.me;
import p649o0ooOOoo.oe;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0014R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/fragment/PacketHistoryListFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/bg;", "", "initView", "", "refresh", "loadData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/room/PacketHistoryVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/room/PacketHistoryVM;", "vm", "Lcom/yalla/yalla/common/constant/LucklyPacket$Type;", "packetType", "Lcom/yalla/yalla/common/constant/LucklyPacket$Type;", "Lcom/yalla/yalla/common/constant/LucklyPacket$Action;", "listType", "Lcom/yalla/yalla/common/constant/LucklyPacket$Action;", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PacketHistoryListFragment extends p503o0o00o00.OooO<bg> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String ListType = "list_type";

    @NotNull
    private static final String PacketType = "packet_type";
    private p188o00o00o0.OooO0OO<PacketHistoryItemModel> adapter;
    private oe footer;
    private me header;

    @NotNull
    private LucklyPacket$Action listType;

    @NotNull
    private LucklyPacket$Type packetType;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<ApiResult<PacketHistoryModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24074Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f24074Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<PacketHistoryModel> apiResult) {
            ApiResult<PacketHistoryModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            XRefreshLayout xRefreshLayout = PacketHistoryListFragment.this.getBinding().f49060OooO0Oo;
            boolean z = this.f24074Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            PacketHistoryModel data = it.getData();
            p188o00o00o0.OooO0OO oooO0OO = null;
            List<PacketHistoryItemModel> data2 = data != null ? data.getData() : null;
            xRefreshLayout.Oooo0o0(z, zIsSuccess, data2 == null || data2.isEmpty());
            p188o00o00o0.OooO0OO oooO0OO2 = PacketHistoryListFragment.this.adapter;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.setLoadComplete(it.isSuccess());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final PacketHistoryListFragment OooO00o(@NotNull LucklyPacket$Type packetType, @NotNull LucklyPacket$Action listType) {
            Intrinsics.checkNotNullParameter(packetType, "packetType");
            Intrinsics.checkNotNullParameter(listType, "listType");
            PacketHistoryListFragment packetHistoryListFragment = new PacketHistoryListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(PacketHistoryListFragment.PacketType, packetType.getValue());
            bundle.putInt(PacketHistoryListFragment.ListType, listType.getValue());
            packetHistoryListFragment.setArguments(bundle);
            return packetHistoryListFragment;
        }
    }

    public static final class OooO0O0 extends p188o00o00o0.OooO0OO<PacketHistoryItemModel> {
        public OooO0O0(Context context) {
            super(context, R.layout.room_activity_lucky_packet_detail_item_layout);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            StringBuilder sbOooO00o;
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            PacketHistoryItemModel packetHistoryItemModel = (PacketHistoryItemModel) obj;
            if (packetHistoryItemModel == null || oooO0o == null) {
                return;
            }
            oooO0o.OooOO0(R.id.name, packetHistoryItemModel.getNickName());
            oooO0o.OooOO0(R.id.time, o00O0.f48624OooO00o.OooO0Oo(packetHistoryItemModel.getSendtime(), System.currentTimeMillis()));
            oooO0o.OooO0oO(R.id.head, false);
            if (PacketHistoryListFragment.this.packetType == LucklyPacket$Type.Gift) {
                if (p168o00Ooo0.oo000o.OooO0o0()) {
                    sbOooO00o = new StringBuilder();
                    sbOooO00o.append(packetHistoryItemModel.getGiftNum());
                    sbOooO00o.append('x');
                } else {
                    sbOooO00o = o00O0O0O.OooO00o('x');
                    sbOooO00o.append(packetHistoryItemModel.getGiftNum());
                }
                oooO0o.OooOO0(R.id.number, sbOooO00o.toString());
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
                oooO00o2.f48429OooO0OO = packetHistoryItemModel.getGiftUrl();
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0Oo());
                oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.pic));
            } else {
                oooO0o.OooOO0(R.id.number, packetHistoryItemModel.getAmount());
                oooO0o.OooO0oo(R.id.pic, R.drawable.coin28_stroke);
            }
            if (PacketHistoryListFragment.this.listType != LucklyPacket$Action.Send) {
                oooO0o.OooOO0(R.id.name, packetHistoryItemModel.getNickName());
                oooO0o.OooOO0o(R.id.tvPacket, false);
                return;
            }
            oooO0o.OooOO0(R.id.name, p498o0o00Oo0.OooOOO.f41216OooO00o.OooOoO().getValue());
            oooO0o.OooOO0o(R.id.tvPacket, true);
            oooO0o.OooOO0(R.id.tvPacket, packetHistoryItemModel.getGetnum() + com.yalla.support.common.util.OooOOO.OooO0OO(R.string.packets));
            oooO0o.OooOO0O(R.id.tvPacket, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_999999));
        }
    }

    public static final class OooO0OO extends p654o0ooo.o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            p188o00o00o0.OooO0OO oooO0OO = PacketHistoryListFragment.this.adapter;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            oooO0OO.setFirstLoading(true);
            PacketHistoryListFragment.this.loadData(true);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<PacketHistoryModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24078Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f24078Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PacketHistoryModel packetHistoryModel) {
            PacketHistoryModel packetHistoryModel2 = packetHistoryModel;
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(PacketHistoryListFragment.this.getContext());
            Intrinsics.checkNotNull(packetHistoryModel2);
            oooO00o.f48429OooO0OO = packetHistoryModel2.getHeadhrl();
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            me meVar = PacketHistoryListFragment.this.header;
            p188o00o00o0.OooO0OO oooO0OO = null;
            me meVar2 = null;
            me meVar3 = null;
            if (meVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                meVar = null;
            }
            oooO00o.OooO0o(meVar.f50028OooO0O0);
            me meVar4 = PacketHistoryListFragment.this.header;
            if (meVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                meVar4 = null;
            }
            meVar4.f50030OooO0Oo.setText(String.valueOf(packetHistoryModel2.getAmountsum()));
            PacketHistoryListFragment.this.getBinding().f49059OooO0OO.setText(PacketHistoryListFragment.this.listType == LucklyPacket$Action.Receive ? com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Lucky_Bag_Received_Total), String.valueOf(packetHistoryModel2.getRedsum())) : com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Lucky_Bag_Send_Total), String.valueOf(packetHistoryModel2.getRedsum())));
            if (this.f24078Oooo0oO) {
                p188o00o00o0.OooO0OO oooO0OO2 = PacketHistoryListFragment.this.adapter;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO2 = null;
                }
                oooO0OO2.setNewData(packetHistoryModel2.getData());
                if (!packetHistoryModel2.getData().isEmpty()) {
                    me meVar5 = PacketHistoryListFragment.this.header;
                    if (meVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                    } else {
                        meVar2 = meVar5;
                    }
                    ConstraintLayout constraintLayout = meVar2.f50027OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "header.root");
                    com.yalla.support.common.util.o00O0O.OooO(constraintLayout);
                    AppCompatTextView appCompatTextView = PacketHistoryListFragment.this.getBinding().f49059OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvTotally");
                    com.yalla.support.common.util.o00O0O.OooO(appCompatTextView);
                } else {
                    me meVar6 = PacketHistoryListFragment.this.header;
                    if (meVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                    } else {
                        meVar3 = meVar6;
                    }
                    ConstraintLayout constraintLayout2 = meVar3.f50027OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "header.root");
                    com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout2);
                    AppCompatTextView appCompatTextView2 = PacketHistoryListFragment.this.getBinding().f49059OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvTotally");
                    com.yalla.support.common.util.o00O0O.OooO00o(appCompatTextView2);
                }
            } else {
                p188o00o00o0.OooO0OO oooO0OO3 = PacketHistoryListFragment.this.adapter;
                if (oooO0OO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO3;
                }
                oooO0OO.addData((Collection) packetHistoryModel2.getData());
            }
            return Unit.INSTANCE;
        }
    }

    public PacketHistoryListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(PacketHistoryVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24082Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24082Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.PacketHistoryListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.packetType = LucklyPacket$Type.Gift;
        this.listType = LucklyPacket$Action.Receive;
    }

    private final PacketHistoryVM getVm() {
        return (PacketHistoryVM) this.vm.getValue();
    }

    private final void initView() {
        getBinding().f49060OooO0Oo.setOnRefreshListener(new o0OO000(this, 4));
        getBinding().f49060OooO0Oo.setOnLoadMoreListener(new o0OO0O0(this, 3));
        this.adapter = new OooO0O0(getContext());
        me meVarInflate = me.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(meVarInflate, "inflate(layoutInflater)");
        this.header = meVarInflate;
        p188o00o00o0.OooO0OO<PacketHistoryItemModel> oooO0OO = null;
        if (meVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            meVarInflate = null;
        }
        ConstraintLayout constraintLayout = meVarInflate.f50027OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "header.root");
        com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout);
        if (this.listType == LucklyPacket$Action.Receive) {
            me meVar = this.header;
            if (meVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                meVar = null;
            }
            meVar.f50029OooO0OO.setText(R.string.Lucky_Bag_Received_lastMonth);
        } else {
            me meVar2 = this.header;
            if (meVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("header");
                meVar2 = null;
            }
            meVar2.f50029OooO0OO.setText(R.string.Lucky_Bag_Send_lastMonth);
        }
        p188o00o00o0.OooO0OO<PacketHistoryItemModel> oooO0OO2 = this.adapter;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setLoadErrorClickListener(new OooO0OO());
        p188o00o00o0.OooO0OO<PacketHistoryItemModel> oooO0OO3 = this.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        me meVar3 = this.header;
        if (meVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            meVar3 = null;
        }
        oooO0OO3.setHeaderView(meVar3.f50027OooO00o);
        p188o00o00o0.OooO0OO<PacketHistoryItemModel> oooO0OO4 = this.adapter;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setEmptyImageRes(R.drawable.ic_empty_message_system);
        getBinding().f49058OooO0O0.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView = getBinding().f49058OooO0O0;
        p188o00o00o0.OooO0OO<PacketHistoryItemModel> oooO0OO5 = this.adapter;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO5;
        }
        recyclerView.setAdapter(oooO0OO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m385initView$lambda0(PacketHistoryListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m386initView$lambda1(PacketHistoryListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean refresh) {
        getVm().loadPacketHistory(refresh, this.packetType, this.listType).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(refresh), null, new OooO(refresh), false, 10));
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        LucklyPacket$Action lucklyPacket$Action;
        super.onCreate(savedInstanceState);
        LucklyPacket$Type.Companion companion = LucklyPacket$Type.INSTANCE;
        Bundle arguments = getArguments();
        this.packetType = companion.OooO00o(arguments != null ? arguments.getInt(PacketType) : LucklyPacket$Type.Gift.getValue());
        LucklyPacket$Action.Companion companion2 = LucklyPacket$Action.INSTANCE;
        Bundle arguments2 = getArguments();
        int i = arguments2 != null ? arguments2.getInt(ListType) : LucklyPacket$Action.Receive.getValue();
        Objects.requireNonNull(companion2);
        LucklyPacket$Action[] lucklyPacket$ActionArrValues = LucklyPacket$Action.values();
        int length = lucklyPacket$ActionArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                lucklyPacket$Action = null;
                break;
            }
            lucklyPacket$Action = lucklyPacket$ActionArrValues[i2];
            if (lucklyPacket$Action.getValue() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (lucklyPacket$Action == null) {
            lucklyPacket$Action = LucklyPacket$Action.Receive;
        }
        this.listType = lucklyPacket$Action;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData(true);
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public bg getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        bg bgVarInflate = bg.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(bgVarInflate, "inflate(inflater, container, false)");
        return bgVarInflate;
    }
}
