package com.yalla.yalla.ui.fragment.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.o0OOO0o;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.data.constant.StatusEnum$ChatServerStatus;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.ConversationWithUser;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.model.SystemConversationModel;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.service.im.socket.IMConnectState;
import com.yalla.yalla.statistical.event.NetWorkMonitorEventType;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.adapter.Oooo000;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p156o00OoOO.OooOo;
import p157o00OoOO0.o00O0O;
import p157o00OoOO0.o0OO00O;
import p482o0o000oO.o0Oo0oo;
import p574o0oOoOOo.oO0Oo0o0;
import p579o0oOoo.oOO0OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.i5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/fragment/message/MessageListFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/i5;", "", "initView", "Lcom/yalla/yalla/model/SystemConversationModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "toSystemConversationPage", "initObserver", "Lcom/yalla/yalla/data/constant/StatusEnum$ChatServerStatus;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "showMessageLoadingTab", "Lcom/yalla/yalla/data/db/table/Conversation;", "showDialog", "onLazyInit", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lo0oOoOOo/oO0Oo0o0;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lo0oOoOOo/oO0Oo0o0;", "vm", "Lcom/yalla/yalla/ui/adapter/Oooo000;", "adapterMessageHead", "Lcom/yalla/yalla/ui/adapter/Oooo000;", "Lcom/yalla/yalla/ui/adapter/OooO0OO;", "adapterMessageChat", "Lcom/yalla/yalla/ui/adapter/OooO0OO;", "Landroidx/recyclerview/widget/ConcatAdapter;", "mConcatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMessageListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageListFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,388:1\n106#2,15:389\n1#3:404\n*S KotlinDebug\n*F\n+ 1 MessageListFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageListFragment\n*L\n81#1:389,15\n*E\n"})
public final class MessageListFragment extends p508o0o0O.OooOO0O<i5> {
    public static final int $stable = 8;
    private com.yalla.yalla.ui.adapter.OooO0OO adapterMessageChat;
    private Oooo000 adapterMessageHead;

    @NotNull
    private final ConcatAdapter mConcatAdapter;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            Oooo000 oooo000 = MessageListFragment.this.adapterMessageHead;
            if (oooo000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                oooo000 = null;
            }
            oooo000.Oooo0o(MessageModelHeadType.TypeYallaTeam, num2 == null ? 0 : num2.intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            try {
                iArr[MessageModelHeadType.TypeSystem.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<IMConnectState, Unit> {

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IMConnectState.values().length];
                try {
                    iArr[IMConnectState.Connecting.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IMConnectState.ConnectSuccess.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IMConnectState.ConnectLost.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IMConnectState iMConnectState) {
            IMConnectState iMConnectState2 = iMConnectState;
            int i = iMConnectState2 == null ? -1 : OooO00o.$EnumSwitchMapping$0[iMConnectState2.ordinal()];
            MessageListFragment messageListFragment = MessageListFragment.this;
            if (i == 1) {
                messageListFragment.showMessageLoadingTab(StatusEnum$ChatServerStatus.CONNECTING);
            } else if (i == 2) {
                messageListFragment.showMessageLoadingTab(StatusEnum$ChatServerStatus.CONNED);
            } else if (i == 3) {
                messageListFragment.showMessageLoadingTab(StatusEnum$ChatServerStatus.UNCONN);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer<Integer> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Integer num) {
            Integer num2 = num;
            Oooo000 oooo000 = MessageListFragment.this.adapterMessageHead;
            if (oooo000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                oooo000 = null;
            }
            oooo000.Oooo0o(MessageModelHeadType.TypeSystem, num2 != null ? num2.intValue() : 0);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<SystemMessage, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SystemMessage systemMessage) {
            SystemMessage systemMessage2 = systemMessage;
            Oooo000 oooo000 = MessageListFragment.this.adapterMessageHead;
            if (oooo000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                oooo000 = null;
            }
            oooo000.Oooo0o0(systemMessage2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<YallaTeamMessage, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(YallaTeamMessage yallaTeamMessage) {
            YallaTeamMessage yallaTeamMessage2 = yallaTeamMessage;
            Oooo000 oooo000 = MessageListFragment.this.adapterMessageHead;
            if (oooo000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                oooo000 = null;
            }
            oooo000.Oooo0oO(yallaTeamMessage2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.message.MessageListFragment$initObserver$6", f = "MessageListFragment.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f28533OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.message.MessageListFragment$initObserver$6$1", f = "MessageListFragment.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<o0OOO0o<ConversationWithUser>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f28535OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MessageListFragment f28536OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f28537OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MessageListFragment messageListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f28536OooO0o = messageListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f28536OooO0o, continuation);
                oooO00o.f28537OooO0o0 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0OOO0o<ConversationWithUser> o0ooo0o2, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f28535OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0OOO0o o0ooo0o2 = (o0OOO0o) this.f28537OooO0o0;
                    com.yalla.yalla.ui.adapter.OooO0OO oooO0OO = this.f28536OooO0o.adapterMessageChat;
                    if (oooO0OO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
                        oooO0OO = null;
                    }
                    this.f28535OooO0Oo = 1;
                    if (oooO0OO.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MessageListFragment.this.new OooOO0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28533OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MessageListFragment messageListFragment = MessageListFragment.this;
                SharedFlow sharedFlowOooO0O0 = messageListFragment.getVm().OooO0O0();
                OooO00o oooO00o = new OooO00o(messageListFragment, null);
                this.f28533OooO0Oo = 1;
                if (FlowKt.collectLatest(sharedFlowOooO0O0, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<ConversationWithUser>, View, Integer, Boolean> {
        public OooOOO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Boolean invoke(p400o0Oo0OO.OooOO0O<ConversationWithUser> oooOO0O, View view, Integer num) {
            p400o0Oo0OO.OooOO0O<ConversationWithUser> adapter = oooOO0O;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            o0OO000.OooO00o("104020");
            MessageListFragment.this.showDialog(adapter.getData(iIntValue).getConversation());
            return Boolean.TRUE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<ConversationWithUser>, View, Integer, Unit> {
        public OooOOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(p400o0Oo0OO.OooOO0O<ConversationWithUser> oooOO0O, View view, Integer num) {
            p400o0Oo0OO.OooOO0O<ConversationWithUser> adapter = oooOO0O;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            ConversationWithUser data = adapter.getData(iIntValue);
            int i = PrivateChatActivity.f25694Oooo000;
            PrivateChatActivity.OooO00o.OooO00o(MessageListFragment.this.requireContext(), Long.valueOf(data.getConversation().getTargetId()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Integer, OooOo, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Conversation f28541OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(Conversation conversation) {
            super(2);
            this.f28541OooO0o0 = conversation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, OooOo oooOo) {
            int iIntValue = num.intValue();
            OooOo item = oooOo;
            Intrinsics.checkNotNullParameter(item, "item");
            MessageListFragment messageListFragment = MessageListFragment.this;
            Conversation conversation = this.f28541OooO0o0;
            if (iIntValue == 0) {
                messageListFragment.getVm().getClass();
                oO0Oo0o0.OooO0OO(conversation);
            } else if (conversation.getTargetId() > 0) {
                o0OO000.OooO00o("104021");
                Context contextRequireContext = messageListFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                o0OO00O o0oo00o2 = new o0OO00O(contextRequireContext);
                o0oo00o2.OooOOoo(oO00OOo0.delete_item);
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOo0(new com.yalla.yalla.ui.fragment.message.OooO(messageListFragment, conversation));
                o0oo00o2.OooOO0o();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.message.MessageListFragment$special$$inlined$viewModels$default$1] */
    public MessageListFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.message.MessageListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.message.MessageListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(oO0Oo0o0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.message.MessageListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.message.MessageListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28545OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28545OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.message.MessageListFragment$special$$inlined$viewModels$default$5
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
        this.mConcatAdapter = new ConcatAdapter(new RecyclerView.Adapter[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oO0Oo0o0 getVm() {
        return (oO0Oo0o0) this.vm.getValue();
    }

    private final void initObserver() {
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        sharedMessageVM.getConnectState().observe(getViewLifecycleOwner(), new com.yalla.yalla.ui.fragment.message.OooOO0.OooO0OO(new OooO0O0()));
        LiveData<Integer> unreadSystemMessageCount = sharedMessageVM.getUnreadSystemMessageCount();
        if (unreadSystemMessageCount != null) {
            unreadSystemMessageCount.observe(getViewLifecycleOwner(), new OooO0OO());
        }
        LiveData<SystemMessage> latestSystemMessage = sharedMessageVM.getLatestSystemMessage();
        if (latestSystemMessage != null) {
            latestSystemMessage.observe(getViewLifecycleOwner(), new com.yalla.yalla.ui.fragment.message.OooOO0.OooO0OO(new OooO0o()));
        }
        LiveData<Integer> unreadYallaTeamMessageCount = sharedMessageVM.getUnreadYallaTeamMessageCount();
        Intrinsics.checkNotNull(unreadYallaTeamMessageCount);
        unreadYallaTeamMessageCount.observe(getViewLifecycleOwner(), new com.yalla.yalla.ui.fragment.message.OooOO0.OooO0OO(new OooO()));
        LiveData<YallaTeamMessage> latestYallaTeamMessage = sharedMessageVM.getLatestYallaTeamMessage();
        Intrinsics.checkNotNull(latestYallaTeamMessage);
        latestYallaTeamMessage.observe(getViewLifecycleOwner(), new com.yalla.yalla.ui.fragment.message.OooOO0.OooO0OO(new OooOO0()));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOO0O(null), 3, null);
    }

    private final void initView() {
        getBinding().f58119OooO0oo.f21330OooOooO = false;
        getBinding().f58117OooO0o0.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        Context context = getBinding().f58119OooO0oo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.xrlMessage.context");
        Oooo000 oooo000 = new Oooo000(context);
        this.adapterMessageHead = oooo000;
        oooo000.OooOoOO(true);
        Oooo000 oooo001 = this.adapterMessageHead;
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO = null;
        if (oooo001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo001 = null;
        }
        oooo001.f10098OooO0o = new p045Oooooo.o0OOO0o(this);
        this.adapterMessageChat = new com.yalla.yalla.ui.adapter.OooO0OO(this);
        ConcatAdapter concatAdapter = this.mConcatAdapter;
        Oooo000 oooo002 = this.adapterMessageHead;
        if (oooo002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo002 = null;
        }
        concatAdapter.OooO0O0(oooo002);
        ConcatAdapter concatAdapter2 = this.mConcatAdapter;
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO2 = this.adapterMessageChat;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
            oooO0OO2 = null;
        }
        concatAdapter2.OooO0O0(oooO0OO2);
        getBinding().f58117OooO0o0.setAdapter(this.mConcatAdapter);
        FixedRecyclerView fixedRecyclerView = getBinding().f58117OooO0o0;
        Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMessage");
        oOO0OOO.OooO00o(fixedRecyclerView);
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO3 = this.adapterMessageChat;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
            oooO0OO3 = null;
        }
        OooOOO0 listener = new OooOOO0();
        oooO0OO3.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO0OO3.f44446OooOO0O = listener;
        com.yalla.yalla.ui.adapter.OooO0OO oooO0OO4 = this.adapterMessageChat;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
        } else {
            oooO0OO = oooO0OO4;
        }
        OooOOO listener2 = new OooOOO();
        oooO0OO.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        oooO0OO.f44449OooOOO0 = listener2;
        ComposeView composeView = getBinding().f58115OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.myRoomCV");
        o000OOo.OooO0Oo(composeView, p522o0o0OO0.OooOo.f53426OooO00o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MessageListFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Oooo000 oooo000 = this$0.adapterMessageHead;
        if (oooo000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo000 = null;
        }
        SystemConversationModel systemConversationModelOooOOO = oooo000.OooOOO(i);
        if (systemConversationModelOooOOO != null) {
            this$0.toSystemConversationPage(systemConversationModelOooOOO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog(Conversation model) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        o00O0O o00o0o2 = new o00O0O(contextRequireContext, null);
        String[] strArr = new String[2];
        strArr[0] = model.getTopTime() > 0 ? o0000.OooO0OO(oO00OOo0.message_list_Unpin) : o0000.OooO0OO(oO00OOo0.message_list_Pin);
        strArr[1] = o0000.OooO0OO(oO00OOo0.delete_item);
        o00o0o2.OooOOOO(CollectionsKt.mutableListOf(strArr));
        o00o0o2.OooOOo0(new OooOOOO(model));
        o00o0o2.OooOO0o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessageLoadingTab(StatusEnum$ChatServerStatus status) {
        Lazy lazy = o0Oo0oo.f47701OooO00o;
        NetWorkMonitorEventType tag = NetWorkMonitorEventType.NetworkMonitor_Changed;
        String string = status.toString();
        Intrinsics.checkNotNullParameter(tag, "tag");
        CustomLogModel customLogModel = new CustomLogModel();
        customLogModel.setLevel("ERROR");
        customLogModel.setTag(tag.toString());
        if (string == null) {
            string = "";
        }
        customLogModel.setMessage(string);
        o0Oo0oo.OooO00o(customLogModel);
        if (status == StatusEnum$ChatServerStatus.CONNECTING) {
            getBinding().f58113OooO0O0.setVisibility(0);
            getBinding().f58118OooO0oO.setText(getResources().getString(oO00OOo0.title_connecting));
            getBinding().f58116OooO0o.setVisibility(0);
            getBinding().f58116OooO0o.OooO0Oo();
            return;
        }
        if (status == StatusEnum$ChatServerStatus.UNCONN) {
            getBinding().f58113OooO0O0.setVisibility(0);
            if (getBinding().f58116OooO0o.getVisibility() == 0) {
                getBinding().f58116OooO0o.setVisibility(8);
                getBinding().f58116OooO0o.OooO0o();
            }
            getBinding().f58118OooO0oO.setText(getResources().getString(oO00OOo0.title_unconnected));
            return;
        }
        if (status == StatusEnum$ChatServerStatus.CONNED) {
            getBinding().f58113OooO0O0.setVisibility(8);
            if (getBinding().f58116OooO0o.getVisibility() == 0) {
                getBinding().f58116OooO0o.setVisibility(8);
                getBinding().f58116OooO0o.OooO0o();
            }
        }
    }

    private final void toSystemConversationPage(SystemConversationModel model) {
        Context context = getContext();
        if (context != null) {
            int i = OooO00o.$EnumSwitchMapping$0[model.getType().ordinal()];
            if (i == 1) {
                int i2 = SystemMessageActivity.f25764OooOo0o;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) SystemMessageActivity.class));
            } else {
                if (i != 2) {
                    return;
                }
                int i3 = YallaTeamMessageActivity.f25774OooOoo0;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) YallaTeamMessageActivity.class));
            }
        }
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initObserver();
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        IMMessageService iMMessageService = IMMessageService.f24939OooO0o;
        if (iMMessageService != null) {
            iMMessageService.OooO00o();
        }
        if (p379o0OOoo.OooOOOO.f44246OooO0oO > 0) {
            p379o0OOoo.OooOOOO.f44246OooO0oO = 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        CollapsingToolbarLayout collapsingToolbarLayout = getBinding().f58114OooO0OO;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public i5 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        i5 i5VarInflate = i5.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(i5VarInflate, "inflate(layoutInflater)");
        return i5VarInflate;
    }
}
