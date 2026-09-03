package com.yalla.yalla.ui.fragment.message;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.ui.adapter.Oooo000;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p522o0o0OO0.OooOo00;
import p522o0o0OO0.Oooo0;
import p522o0o0OO0.o000oOoO;
import p522o0o0OO0.o00O0O;
import p522o0o0OO0.o00Oo0;
import p522o0o0OO0.o0OoOo0;
import p574o0oOoOOo.oO0Oo0o0;
import p579o0oOoo.oOO0OOO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p641o0ooOOOO.i5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/fragment/message/MessageBoxFragment;", "LoO0OO/OooO00o;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMessageBoxFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBoxFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageBoxFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n106#2,15:165\n1#3:180\n*S KotlinDebug\n*F\n+ 1 MessageBoxFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageBoxFragment\n*L\n47#1:165,15\n*E\n"})
public final class MessageBoxFragment extends oO0OO.OooO00o {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f28501OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f28502OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Oooo000 f28503OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f28504OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.OooO0OO f28505OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public i5 f28506OooOOoo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            try {
                iArr[MessageModelHeadType.TypeMoment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageModelHeadType.TypeSystem.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageModelHeadType.TypeActivity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageModelHeadType.TypeFriends.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28507OooO0Oo;

        public OooO0O0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28507OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28507OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28507OooO0Oo;
        }

        public final int hashCode() {
            return this.f28507OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28507OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$1] */
    public MessageBoxFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.f28502OooOOOO = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(oO0Oo0o0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28511OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28511OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$5
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
        this.f28504OooOOo = new ConcatAdapter(new RecyclerView.Adapter[0]);
    }

    @Override // oO0OO.OooO00o
    public final int OooO0Oo() {
        return oO00OO0O.message_fragment_message_list;
    }

    @Override // oO0OO.OooO00o
    public final void OooO0o(int i, @NotNull View bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i == 5) {
            this.f60359OooOO0O.Oooo0O0(4);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO0OO.OooO00o
    public final void OooO0o0() {
        View splitLine = this.f60354OooO;
        Intrinsics.checkNotNullExpressionValue(splitLine, "splitLine");
        o000OO00.OooO0O0(splitLine);
        this.f60361OooOOO.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
        this.f60361OooOOO.getPaint().setFakeBoldText(true);
        i5 i5VarOooO00o = i5.OooO00o(this.f60357OooO0oo);
        Intrinsics.checkNotNullExpressionValue(i5VarOooO00o, "bind(viewRoot)");
        this.f28506OooOOoo = i5VarOooO00o;
        LinearLayout linearLayout = i5VarOooO00o.f58113OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.clChatServerConnStatus");
        o000OO00.OooO0O0(linearLayout);
        i5 i5Var = this.f28506OooOOoo;
        if (i5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i5Var = null;
        }
        i5Var.f58119OooO0oo.f21330OooOooO = false;
        i5 i5Var2 = this.f28506OooOOoo;
        if (i5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i5Var2 = null;
        }
        i5Var2.f58117OooO0o0.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        i5 i5Var3 = this.f28506OooOOoo;
        if (i5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i5Var3 = null;
        }
        Context context = i5Var3.f58119OooO0oo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.xrlMessage.context");
        Oooo000 oooo000 = new Oooo000(context);
        this.f28503OooOOOo = oooo000;
        oooo000.OooOoOO(true);
        Oooo000 oooo001 = this.f28503OooOOOo;
        if (oooo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo001 = null;
        }
        oooo001.f10098OooO0o = new p196o00o0Oo.o000OO00(this);
        Oooo000 oooo002 = this.f28503OooOOOo;
        if (oooo002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo002 = null;
        }
        ConcatAdapter concatAdapter = this.f28504OooOOo;
        concatAdapter.OooO0O0(oooo002);
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO = new com.yalla.yalla.ui.adapter.OooO0OO(this);
        this.f28505OooOOo0 = oooO0OO;
        concatAdapter.OooO0O0(oooO0OO);
        i5 i5Var4 = this.f28506OooOOoo;
        if (i5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i5Var4 = null;
        }
        i5Var4.f58117OooO0o0.setAdapter(concatAdapter);
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO2 = this.f28505OooOOo0;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
            oooO0OO2 = null;
        }
        o00Oo0 listener = new o00Oo0(this);
        oooO0OO2.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO0OO2.f44446OooOO0O = listener;
        i5 i5Var5 = this.f28506OooOOoo;
        if (i5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i5Var5 = null;
        }
        FixedRecyclerView fixedRecyclerView = i5Var5.f58117OooO0o0;
        Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMessage");
        oOO0OOO.OooO00o(fixedRecyclerView);
        i5 i5Var6 = this.f28506OooOOoo;
        if (i5Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i5Var6 = null;
        }
        ComposeView composeView = i5Var6.f58115OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.myRoomCV");
        o000OOo.OooO0Oo(composeView, OooOo00.f53428OooO00o);
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        LiveData<Integer> unreadSystemMessageCount = sharedMessageVM.getUnreadSystemMessageCount();
        if (unreadSystemMessageCount != null) {
            unreadSystemMessageCount.observe(this, new p522o0o0OO0.Oooo000(this));
        }
        LiveData<SystemMessage> latestSystemMessage = sharedMessageVM.getLatestSystemMessage();
        if (latestSystemMessage != null) {
            latestSystemMessage.observe(this, new OooO0O0(new Oooo0(this)));
        }
        LiveData<Integer> unreadYallaTeamMessageCount = sharedMessageVM.getUnreadYallaTeamMessageCount();
        Intrinsics.checkNotNull(unreadYallaTeamMessageCount);
        unreadYallaTeamMessageCount.observe(this, new OooO0O0(new o000oOoO(this)));
        LiveData<YallaTeamMessage> latestYallaTeamMessage = sharedMessageVM.getLatestYallaTeamMessage();
        Intrinsics.checkNotNull(latestYallaTeamMessage);
        latestYallaTeamMessage.observe(this, new OooO0O0(new o0OoOo0(this)));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o00O0O(this, null), 3, null);
    }

    @Override // oO0OO.OooO00o
    public final void initData() {
    }

    @Override // androidx.fragment.app.OooOo, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        LiveEventBus.get("ROOM_MESSAGE_BOX_HIND").post(Boolean.TRUE);
    }
}
