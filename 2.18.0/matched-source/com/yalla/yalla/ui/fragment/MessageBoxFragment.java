package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.adapter.message.MessageModelHeadType;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import p178o00Ooooo.oOo000Oo;
import p255o00ooO0O.oOO00O;
import p546o0o0OoOO.n5;
import p584o0oOoOoO.e2;
import p584o0oOoOoO.f2;
import p584o0oOoOoO.g2;
import p584o0oOoOoO.h2;
import p584o0oOoOoO.i2;
import p584o0oOoOoO.v1;
import p651o0ooOOoo.ac;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MessageBoxFragment;", "Lo00Ooooo/oOo000Oo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MessageBoxFragment extends oOo000Oo {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f24031OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24032OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public p565o0oOo0.o0OO00O f24033OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public p565o0oOo0.Oooo0 f24034OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public ConcatAdapter f24035Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ac f24036Ooooo0o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            iArr[MessageModelHeadType.TypeMoment.ordinal()] = 1;
            iArr[MessageModelHeadType.TypeSystem.ordinal()] = 2;
            iArr[MessageModelHeadType.TypeActivity.ordinal()] = 3;
            iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 4;
            iArr[MessageModelHeadType.TypeFriends.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MessageBoxFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.MessageBoxFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.MessageBoxFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.f24032OoooOo0 = (ViewModelLazy) androidx.fragment.app.o0000OO0.OooO0O0(this, Reflection.getOrCreateKotlinClass(p598o0oo0.OooOOO0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MessageBoxFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MessageBoxFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Function0 f24040Oooo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24040Oooo;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000OO0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MessageBoxFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000OO0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f24035Ooooo00 = new ConcatAdapter(new RecyclerView.Adapter[0]);
    }

    @Override // p178o00Ooooo.oOo000Oo
    public final int OooO0O0() {
        return R.layout.message_fragment_message_list;
    }

    @Override // p178o00Ooooo.oOo000Oo
    public final void OooO0OO() {
        View splitLine = this.f32945OoooO0O;
        Intrinsics.checkNotNullExpressionValue(splitLine, "splitLine");
        oOO00O.OooO00o(splitLine);
        this.f32948OoooOOo.setTextColor(p255o00ooO0O.o000O0O0.OooO00o(R.color.color_333333));
        this.f32948OoooOOo.getPaint().setFakeBoldText(true);
        ac acVarOooO00o = ac.OooO00o(this.f32943OoooO0);
        Intrinsics.checkNotNullExpressionValue(acVarOooO00o, "bind(viewRoot)");
        this.f24036Ooooo0o = acVarOooO00o;
        LinearLayout linearLayout = acVarOooO00o.f48958OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.clChatServerConnStatus");
        oOO00O.OooO00o(linearLayout);
        ac acVar = this.f24036Ooooo0o;
        if (acVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            acVar = null;
        }
        acVar.f48964OooO0oo.f19564o00o0O = false;
        ac acVar2 = this.f24036Ooooo0o;
        if (acVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            acVar2 = null;
        }
        acVar2.f48962OooO0o0.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        ac acVar3 = this.f24036Ooooo0o;
        if (acVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            acVar3 = null;
        }
        Context context = acVar3.f48964OooO0oo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.xrlMessage.context");
        p565o0oOo0.o0OO00O o0oo00o2 = new p565o0oOo0.o0OO00O(context);
        this.f24033OoooOoO = o0oo00o2;
        o0oo00o2.hindEmptyView(true);
        p565o0oOo0.o0OO00O o0oo00o3 = this.f24033OoooOoO;
        if (o0oo00o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o3 = null;
        }
        o0oo00o3.setOnItemClickListener(new n5(this));
        ConcatAdapter concatAdapter = this.f24035Ooooo00;
        p565o0oOo0.o0OO00O o0oo00o4 = this.f24033OoooOoO;
        if (o0oo00o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o4 = null;
        }
        concatAdapter.OooO0O0(o0oo00o4);
        p565o0oOo0.Oooo0 oooo0 = new p565o0oOo0.Oooo0(this);
        this.f24034OoooOoo = oooo0;
        this.f24035Ooooo00.OooO0O0(oooo0);
        ac acVar4 = this.f24036Ooooo0o;
        if (acVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            acVar4 = null;
        }
        acVar4.f48962OooO0o0.setAdapter(this.f24035Ooooo00);
        p565o0oOo0.Oooo0 oooo1 = this.f24034OoooOoo;
        if (oooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
            oooo1 = null;
        }
        i2 listener = new i2(this);
        Objects.requireNonNull(oooo1);
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooo1.f40475OooOO0O = listener;
        ac acVar5 = this.f24036Ooooo0o;
        if (acVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            acVar5 = null;
        }
        FixedRecyclerView fixedRecyclerView = acVar5.f48962OooO0o0;
        Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMessage");
        p518o0o0O000.o00000.OooO00o(fixedRecyclerView);
        ac acVar6 = this.f24036Ooooo0o;
        if (acVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            acVar6 = null;
        }
        ComposeView composeView = acVar6.f48960OooO0Oo;
        v1 v1Var = v1.f46921OooO00o;
        composeView.setContent(v1.f46922OooO0O0);
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        LiveData<Integer> unreadSystemMessageCount = sharedMessageVM.getUnreadSystemMessageCount();
        if (unreadSystemMessageCount != null) {
            unreadSystemMessageCount.observe(this, new p160o00OoOO.o00000OO(this, 6));
        }
        LiveData<SystemMessage> latestSystemMessage = sharedMessageVM.getLatestSystemMessage();
        if (latestSystemMessage != null) {
            latestSystemMessage.observe(this, new e2(this));
        }
        LiveData<Integer> unreadYallaTeamMessageCount = sharedMessageVM.getUnreadYallaTeamMessageCount();
        Intrinsics.checkNotNull(unreadYallaTeamMessageCount);
        unreadYallaTeamMessageCount.observe(this, new f2(this));
        LiveData<YallaTeamMessage> latestYallaTeamMessage = sharedMessageVM.getLatestYallaTeamMessage();
        Intrinsics.checkNotNull(latestYallaTeamMessage);
        latestYallaTeamMessage.observe(this, new g2(this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h2(this, null), 3, null);
    }

    @Override // p178o00Ooooo.oOo000Oo
    public final void OooO0Oo(@NotNull View bottomSheet, int i) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i == 5) {
            this.f32946OoooOO0.Oooo00O(4);
        }
    }

    @Override // p178o00Ooooo.oOo000Oo
    public final void initData() {
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        LiveEventBus.get("ROOM_MESSAGE_BOX_HIND").post(Boolean.TRUE);
    }
}
