package com.yalla.yalla.ui.fragment.message;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o000Oo0;
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
import com.code.android.util.o000O;
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
import p193o00o0O0O.o0000oo;
import p407o0Oo0OOO.oO0O00oO;
import p452o0OoOooO.o0O0o000;
import p529o0o0OO0o.o000;
import p529o0o0OO0o.o0000O;
import p529o0o0OO0o.o0000O0;
import p529o0o0OO0o.o0000OO0;
import p529o0o0OO0o.o000O000;
import p529o0o0OO0o.o000OO;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0ooOOo;
import p579o0oOoOo.o0o0000;
import p587o0oOooO.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/fragment/message/MessageBoxFragment;", "Lo0o0O/OooO0O0;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMessageBoxFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBoxFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageBoxFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n106#2,15:165\n1#3:180\n*S KotlinDebug\n*F\n+ 1 MessageBoxFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageBoxFragment\n*L\n47#1:165,15\n*E\n"})
public final class MessageBoxFragment extends p513o0o0O.OooO0O0 {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f28004OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f28005OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Oooo000 f28006OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f28007OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.OooO0OO f28008OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public oO0O00oO f28009OooOOoo;

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
        public final /* synthetic */ Function1 f28010OooO0Oo;

        public OooO0O0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28010OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28010OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28010OooO0Oo;
        }

        public final int hashCode() {
            return this.f28010OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28010OooO0Oo.invoke(obj);
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
        this.f28005OooOOOO = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(o0o0000.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.message.MessageBoxFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28014OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28014OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
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
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f28007OooOOo = new ConcatAdapter(new RecyclerView.Adapter[0]);
    }

    @Override // p513o0o0O.OooO0O0
    public final int OooO0Oo() {
        return o0OO00O.message_fragment_message_list;
    }

    @Override // p513o0o0O.OooO0O0
    public final void OooO0o(int i, @NotNull View bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i == 5) {
            this.f50903OooOO0O.Oooo0O0(4);
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
    @Override // p513o0o0O.OooO0O0
    public final void OooO0o0() {
        View splitLine = this.f50898OooO;
        Intrinsics.checkNotNullExpressionValue(splitLine, "splitLine");
        o000O.OooO0O0(splitLine);
        this.f50905OooOOO.setTextColor(o0000.OooO00o(o0ooOOo.color_333333));
        this.f50905OooOOO.getPaint().setFakeBoldText(true);
        oO0O00oO oo0o00ooOooO00o = oO0O00oO.OooO00o(this.f50901OooO0oo);
        Intrinsics.checkNotNullExpressionValue(oo0o00ooOooO00o, "bind(...)");
        this.f28009OooOOoo = oo0o00ooOooO00o;
        LinearLayout clChatServerConnStatus = oo0o00ooOooO00o.f44871OooO0O0;
        Intrinsics.checkNotNullExpressionValue(clChatServerConnStatus, "clChatServerConnStatus");
        o000O.OooO0O0(clChatServerConnStatus);
        oO0O00oO oo0o00oo = this.f28009OooOOoo;
        if (oo0o00oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oo0o00oo = null;
        }
        oo0o00oo.f44877OooO0oo.f20862OooOooO = false;
        oO0O00oO oo0o00oo2 = this.f28009OooOOoo;
        if (oo0o00oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oo0o00oo2 = null;
        }
        oo0o00oo2.f44875OooO0o0.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        oO0O00oO oo0o00oo3 = this.f28009OooOOoo;
        if (oo0o00oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oo0o00oo3 = null;
        }
        Context context = oo0o00oo3.f44877OooO0oo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Oooo000 oooo000 = new Oooo000(context);
        this.f28006OooOOOo = oooo000;
        oooo000.OooOoOO(true);
        Oooo000 oooo001 = this.f28006OooOOOo;
        if (oooo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo001 = null;
        }
        int i = 2;
        oooo001.f13187OooO0o = new o000O00O.o000Oo0(this, i);
        Oooo000 oooo002 = this.f28006OooOOOo;
        if (oooo002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo002 = null;
        }
        ConcatAdapter concatAdapter = this.f28007OooOOo;
        concatAdapter.OooO0O0(oooo002);
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO = new com.yalla.yalla.ui.adapter.OooO0OO(this);
        this.f28008OooOOo0 = oooO0OO;
        concatAdapter.OooO0O0(oooO0OO);
        oO0O00oO oo0o00oo4 = this.f28009OooOOoo;
        if (oo0o00oo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oo0o00oo4 = null;
        }
        oo0o00oo4.f44875OooO0o0.setAdapter(concatAdapter);
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO2 = this.f28008OooOOo0;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
            oooO0OO2 = null;
        }
        o000O000 listener = new o000O000(this);
        oooO0OO2.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO0OO2.f57585OooOO0O = listener;
        oO0O00oO oo0o00oo5 = this.f28009OooOOoo;
        if (oo0o00oo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oo0o00oo5 = null;
        }
        FixedRecyclerView rvMessage = oo0o00oo5.f44875OooO0o0;
        Intrinsics.checkNotNullExpressionValue(rvMessage, "rvMessage");
        oOO0O0O.OooO00o(rvMessage);
        oO0O00oO oo0o00oo6 = this.f28009OooOOoo;
        if (oo0o00oo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oo0o00oo6 = null;
        }
        ComposeView myRoomCV = oo0o00oo6.f44873OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(myRoomCV, "myRoomCV");
        o0000oo.OooO0Oo(myRoomCV, o0000O0.f53289OooO00o);
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        LiveData<Integer> unreadSystemMessageCount = sharedMessageVM.getUnreadSystemMessageCount();
        if (unreadSystemMessageCount != null) {
            unreadSystemMessageCount.observe(this, new o0O0o000(this, i));
        }
        LiveData<SystemMessage> latestSystemMessage = sharedMessageVM.getLatestSystemMessage();
        if (latestSystemMessage != null) {
            latestSystemMessage.observe(this, new OooO0O0(new o000OO(this)));
        }
        LiveData<Integer> unreadYallaTeamMessageCount = sharedMessageVM.getUnreadYallaTeamMessageCount();
        Intrinsics.checkNotNull(unreadYallaTeamMessageCount);
        unreadYallaTeamMessageCount.observe(this, new OooO0O0(new o0000O(this)));
        LiveData<YallaTeamMessage> latestYallaTeamMessage = sharedMessageVM.getLatestYallaTeamMessage();
        Intrinsics.checkNotNull(latestYallaTeamMessage);
        latestYallaTeamMessage.observe(this, new OooO0O0(new o0000OO0(this)));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o000(this, null), 3, null);
    }

    @Override // p513o0o0O.OooO0O0
    public final void initData() {
    }

    @Override // androidx.fragment.app.Oooo0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        LiveEventBus.get("ROOM_MESSAGE_BOX_HIND").post(Boolean.TRUE);
    }
}
