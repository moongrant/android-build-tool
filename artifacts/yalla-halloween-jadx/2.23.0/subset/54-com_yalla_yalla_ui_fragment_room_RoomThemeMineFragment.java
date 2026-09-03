package com.yalla.yalla.ui.fragment.room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MyThemeListModel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import com.yalla.yalla.ui.view.ThemeLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.store.ThemeStoreVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p466o0Oooo0o.oo00o;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.u8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomThemeMineFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/u8;", "", "initView", "loadData", "", "Lcom/yalla/yalla/model/ThemeModel;", "themeModelList", "addDefaultTheme", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm$delegate", "Lkotlin/Lazy;", "getStoreVm", "()Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm", "", "currentThemeId", "J", "Lo0oOo0OO/o000O;", "mAdapter", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "activity", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomThemeMineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeMineFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,112:1\n106#2,15:113\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeMineFragment\n*L\n33#1:113,15\n*E\n"})
public final class RoomThemeMineFragment extends p508o0o0O.OooOO0O<u8> {
    public static final int $stable = 8;
    private long currentThemeId;

    @Nullable
    private o000O<ThemeModel> mAdapter;

    /* JADX INFO: renamed from: storeVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storeVm;

    public static final class OooO extends Lambda implements Function1<ApiError, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            o000O o000o = RoomThemeMineFragment.this.mAdapter;
            if (o000o != null) {
                o000o.OooOoo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Boolean> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            RoomThemeMineFragment.this.loadData();
        }
    }

    public static final class OooO0O0 extends o000O<ThemeModel> {
        public OooO0O0(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            RoomThemeMineActivity activity;
            ViewHolder helper = (ViewHolder) baseViewHolder;
            ThemeModel item = (ThemeModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            ThemeLayout convert$lambda$0 = (ThemeLayout) helper.getView(oO00O0oO.tlTheme);
            convert$lambda$0.OooO00o(item);
            RoomThemeMineFragment roomThemeMineFragment = RoomThemeMineFragment.this;
            convert$lambda$0.OooO0O0(item, new o00Oo0(roomThemeMineFragment, item));
            Intrinsics.checkNotNullExpressionValue(convert$lambda$0, "convert$lambda$0");
            ThemeLayout.OooO0OO(convert$lambda$0, item, false, null, null, 26);
            convert$lambda$0.setSelectTheme(item.getShopId() == roomThemeMineFragment.currentThemeId);
            if (item.getShopId() != roomThemeMineFragment.currentThemeId || (activity = roomThemeMineFragment.getActivity()) == null) {
                return;
            }
            activity.f26674OooOo = RoomThemeMineActivity.ThemeType.Mine;
        }
    }

    public static final class OooO0OO extends oo00o {
        public OooO0OO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@Nullable View view) {
            RoomThemeMineFragment.this.loadData();
        }
    }

    public static final class OooO0o extends Lambda implements Function1<MyThemeListModel, Unit> {
        public OooO0o() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002c  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MyThemeListModel myThemeListModel) {
            o000O o000o;
            ArrayList<ThemeModel> data;
            MyThemeListModel myThemeListModel2 = myThemeListModel;
            long currentThemeId = myThemeListModel2 != null ? myThemeListModel2.getCurrentThemeId() : 0L;
            RoomThemeMineFragment roomThemeMineFragment = RoomThemeMineFragment.this;
            roomThemeMineFragment.currentThemeId = currentThemeId;
            o000O o000o2 = roomThemeMineFragment.mAdapter;
            if (o000o2 == null) {
                o000o = roomThemeMineFragment.mAdapter;
                if (o000o != null) {
                    o000o.Oooo00o();
                }
            } else if (myThemeListModel2 != null && (data = myThemeListModel2.getData()) != null) {
                o000o2.OooOoO0(roomThemeMineFragment.addDefaultTheme(data));
                o000o = roomThemeMineFragment.mAdapter;
                if (o000o != null) {
                    o000o.Oooo00o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment$special$$inlined$viewModels$default$1] */
    public RoomThemeMineFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.storeVm = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f29091OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f29091OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.currentThemeId = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ThemeModel> addDefaultTheme(List<ThemeModel> themeModelList) {
        Iterator<ThemeModel> it = themeModelList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getIsSelected()) {
                z = true;
            }
        }
        ThemeModel themeModel = new ThemeModel();
        String string = getString(oO00OOo0.Yalla_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Yalla_1)");
        ThemeModel defaultDrawable = themeModel.setDefaultDrawable(true, string);
        if (!z) {
            defaultDrawable.setSelected(true);
        }
        themeModelList.add(0, defaultDrawable);
        return themeModelList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomThemeMineActivity getActivity() {
        if (!(getContext() instanceof RoomThemeMineActivity)) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.room.RoomThemeMineActivity");
        return (RoomThemeMineActivity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeStoreVM getStoreVm() {
        return (ThemeStoreVM) this.storeVm.getValue();
    }

    private final void initView() {
        LiveEventBus.get("ROOM_THEME_UPDATE", Boolean.TYPE).observe(this, new OooO00o());
        OooO0O0 oooO0O0 = new OooO0O0(getContext(), oO00OO0O.room_item_theme_mine);
        this.mAdapter = oooO0O0;
        oooO0O0.Oooo0OO(new OooO0OO());
        o000O<ThemeModel> o000o = this.mAdapter;
        if (o000o != null) {
            o000o.OooOooo(oOo00OO0.ic_empty_message_system);
        }
        o000O<ThemeModel> o000o2 = this.mAdapter;
        if (o000o2 != null) {
            o000o2.Oooo000(oO00OOo0.no_data);
        }
        getBinding().f58978OooO0O0.setLayoutManager(new GridLayoutManager(getContext(), 2));
        getBinding().f58978OooO0O0.setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        Integer value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25003OooO0o0.getValue();
        if (value == null) {
            return;
        }
        getStoreVm().getThemeMineListData(value.intValue(), 2).observe(this, new o0000OO0(new OooO0o(), new OooO(), null, false, 12));
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData();
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public u8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        u8 u8VarInflate = u8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(u8VarInflate, "inflate(inflater, container, false)");
        return u8VarInflate;
    }
}
