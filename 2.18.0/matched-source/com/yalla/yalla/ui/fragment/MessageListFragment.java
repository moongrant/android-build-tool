package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.adapter.message.MessageModelHeadType;
import com.app.base.constants.StatusEnum$ChatServerStatus;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.ConversationWithUser;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.common.statistical.event.NetWorkMonitorEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.model.SystemConversationModel;
import com.yalla.yalla.service.im.socket.IMConnectState;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Objects;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0O0ooO;
import p256o00ooO0o.o00O0;
import p256o00ooO0o.oo0oOO0;
import p584o0oOoOoO.w1;
import p651o0ooOOoo.ac;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MessageListFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ac;", "", "initView", "Lcom/yalla/yalla/model/SystemConversationModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "toSystemConversationPage", "initObserver", "Lcom/app/base/constants/StatusEnum$ChatServerStatus;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "showMessageLoadingTab", "Lcom/yalla/yalla/common/db/table/Conversation;", "showDialog", "onLazyInit", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onPause", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lo0oo0/OooOOO0;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lo0oo0/OooOOO0;", "vm", "Landroidx/recyclerview/widget/ConcatAdapter;", "mConcatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MessageListFragment extends p505o0o00o00.OooO<ac> {
    public static final int $stable = 8;
    private p565o0oOo0.Oooo0 adapterMessageChat;
    private p565o0oOo0.o0OO00O adapterMessageHead;

    @NotNull
    private final ConcatAdapter mConcatAdapter;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO<T> implements Observer {
        public OooO() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            YallaTeamMessage yallaTeamMessage = (YallaTeamMessage) t;
            p565o0oOo0.o0OO00O o0oo00o2 = MessageListFragment.this.adapterMessageHead;
            if (o0oo00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                o0oo00o2 = null;
            }
            o0oo00o2.OooO0OO(yallaTeamMessage);
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            iArr[MessageModelHeadType.TypeSystem.ordinal()] = 1;
            iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IMConnectState.values().length];
            iArr2[IMConnectState.Connecting.ordinal()] = 1;
            iArr2[IMConnectState.ConnectSuccess.ordinal()] = 2;
            iArr2[IMConnectState.ConnectLost.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class OooO0O0<T> implements Observer {
        public OooO0O0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            IMConnectState iMConnectState = (IMConnectState) t;
            int i = iMConnectState == null ? -1 : OooO00o.$EnumSwitchMapping$1[iMConnectState.ordinal()];
            if (i == 1) {
                MessageListFragment.this.showMessageLoadingTab(StatusEnum$ChatServerStatus.CONNECTING);
            } else if (i == 2) {
                MessageListFragment.this.showMessageLoadingTab(StatusEnum$ChatServerStatus.CONNED);
            } else {
                if (i != 3) {
                    return;
                }
                MessageListFragment.this.showMessageLoadingTab(StatusEnum$ChatServerStatus.UNCONN);
            }
        }
    }

    public static final class OooO0OO<T> implements Observer {
        public OooO0OO() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            SystemMessage systemMessage = (SystemMessage) t;
            p565o0oOo0.o0OO00O o0oo00o2 = MessageListFragment.this.adapterMessageHead;
            if (o0oo00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                o0oo00o2 = null;
            }
            o0oo00o2.OooO00o(systemMessage);
        }
    }

    public static final class OooO0o<T> implements Observer {
        public OooO0o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            int iIntValue = ((Number) t).intValue();
            p565o0oOo0.o0OO00O o0oo00o2 = MessageListFragment.this.adapterMessageHead;
            if (o0oo00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                o0oo00o2 = null;
            }
            o0oo00o2.OooO0O0(MessageModelHeadType.TypeYallaTeam, iIntValue);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.MessageListFragment$initObserver$6", f = "MessageListFragment.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f24058Oooo;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.MessageListFragment$initObserver$6$1", f = "MessageListFragment.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<ConversationWithUser>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f24060Oooo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ MessageListFragment f24061OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public /* synthetic */ Object f24062OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MessageListFragment messageListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f24061OoooO0 = messageListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f24061OoooO0, continuation);
                oooO00o.f24062OoooO00 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0O0ooO<ConversationWithUser> o0o0ooo, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f24060Oooo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO o0o0ooo = (o0O0ooO) this.f24062OoooO00;
                    p565o0oOo0.Oooo0 oooo0 = this.f24061OoooO0.adapterMessageChat;
                    if (oooo0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
                        oooo0 = null;
                    }
                    this.f24060Oooo = 1;
                    if (oooo0.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MessageListFragment.this.new OooOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24058Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<o0O0ooO<ConversationWithUser>> flowOooO0O0 = MessageListFragment.this.getVm().OooO0O0();
                OooO00o oooO00o = new OooO00o(MessageListFragment.this, null);
                this.f24058Oooo = 1;
                if (FlowKt.collectLatest(flowOooO0O0, oooO00o, this) == coroutine_suspended) {
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

    public static final class OooOO0O extends Lambda implements Function3<p466o0Ooo0oO.o0000O0O<ConversationWithUser>, View, Integer, Unit> {
        public OooOO0O() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(p466o0Ooo0oO.o0000O0O<ConversationWithUser> o0000o0o2, View view, Integer num) {
            p466o0Ooo0oO.o0000O0O<ConversationWithUser> adapter = o0000o0o2;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            PrivateChatActivity.f22185o0ooOOo.OooO00o(MessageListFragment.this.requireContext(), Long.valueOf(adapter.getData(iIntValue).getConversation().getTargetId()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Integer, p252o00ooO.o000O00, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Conversation f24065OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Conversation conversation) {
            super(2);
            this.f24065OoooO00 = conversation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, p252o00ooO.o000O00 o000o01) {
            int iIntValue = num.intValue();
            p252o00ooO.o000O00 item = o000o01;
            Intrinsics.checkNotNullParameter(item, "item");
            if (iIntValue == 0) {
                MessageListFragment.this.getVm().OooO0OO(this.f24065OoooO00);
            } else if (this.f24065OoooO00.getTargetId() > 0) {
                Context contextRequireContext = MessageListFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                oo0oOO0 oo0ooo0 = new oo0oOO0(contextRequireContext);
                oo0ooo0.OooOo0(R.string.delete_item);
                oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                oo0ooo0.OooOo0o(new Oooo0(MessageListFragment.this, this.f24065OoooO00));
                oo0ooo0.OooOOO0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function3<p466o0Ooo0oO.o0000O0O<ConversationWithUser>, View, Integer, Boolean> {
        public OooOOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Boolean invoke(p466o0Ooo0oO.o0000O0O<ConversationWithUser> o0000o0o2, View view, Integer num) {
            p466o0Ooo0oO.o0000O0O<ConversationWithUser> adapter = o0000o0o2;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            MessageListFragment.this.showDialog(adapter.getData(iIntValue).getConversation());
            return Boolean.TRUE;
        }
    }

    public MessageListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.MessageListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.MessageListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000OO0.OooO0O0(this, Reflection.getOrCreateKotlinClass(p598o0oo0.OooOOO0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MessageListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MessageListFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Function0 f24070Oooo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24070Oooo;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000OO0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MessageListFragment$special$$inlined$viewModels$default$5
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
        this.mConcatAdapter = new ConcatAdapter(new RecyclerView.Adapter[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p598o0oo0.OooOOO0 getVm() {
        return (p598o0oo0.OooOOO0) this.vm.getValue();
    }

    private final void initObserver() {
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        MutableLiveData<IMConnectState> connectState = sharedMessageVM.getConnectState();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        connectState.observe(viewLifecycleOwner, new OooO0O0());
        LiveData<Integer> unreadSystemMessageCount = sharedMessageVM.getUnreadSystemMessageCount();
        if (unreadSystemMessageCount != null) {
            unreadSystemMessageCount.observe(getViewLifecycleOwner(), new p160o00OoOO.o0000Ooo(this, 5));
        }
        LiveData<SystemMessage> latestSystemMessage = sharedMessageVM.getLatestSystemMessage();
        if (latestSystemMessage != null) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
            latestSystemMessage.observe(viewLifecycleOwner2, new OooO0OO());
        }
        LiveData<Integer> unreadYallaTeamMessageCount = sharedMessageVM.getUnreadYallaTeamMessageCount();
        Intrinsics.checkNotNull(unreadYallaTeamMessageCount);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        unreadYallaTeamMessageCount.observe(viewLifecycleOwner3, new OooO0o());
        LiveData<YallaTeamMessage> latestYallaTeamMessage = sharedMessageVM.getLatestYallaTeamMessage();
        Intrinsics.checkNotNull(latestYallaTeamMessage);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        latestYallaTeamMessage.observe(viewLifecycleOwner4, new OooO());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOO0(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-4, reason: not valid java name */
    public static final void m383initObserver$lambda4(MessageListFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p565o0oOo0.o0OO00O o0oo00o2 = this$0.adapterMessageHead;
        if (o0oo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o2 = null;
        }
        o0oo00o2.OooO0O0(MessageModelHeadType.TypeSystem, num != null ? num.intValue() : 0);
    }

    private final void initView() {
        getBinding().f48964OooO0oo.f19564o00o0O = false;
        getBinding().f48962OooO0o0.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        Context context = getBinding().f48964OooO0oo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.xrlMessage.context");
        p565o0oOo0.o0OO00O o0oo00o2 = new p565o0oOo0.o0OO00O(context);
        this.adapterMessageHead = o0oo00o2;
        o0oo00o2.hindEmptyView(true);
        p565o0oOo0.o0OO00O o0oo00o3 = this.adapterMessageHead;
        p565o0oOo0.Oooo0 oooo0 = null;
        if (o0oo00o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o3 = null;
        }
        o0oo00o3.setOnItemClickListener(new p143o00OOooO.o000O0(this));
        this.adapterMessageChat = new p565o0oOo0.Oooo0(this);
        ConcatAdapter concatAdapter = this.mConcatAdapter;
        p565o0oOo0.o0OO00O o0oo00o4 = this.adapterMessageHead;
        if (o0oo00o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o4 = null;
        }
        concatAdapter.OooO0O0(o0oo00o4);
        ConcatAdapter concatAdapter2 = this.mConcatAdapter;
        p565o0oOo0.Oooo0 oooo1 = this.adapterMessageChat;
        if (oooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
            oooo1 = null;
        }
        concatAdapter2.OooO0O0(oooo1);
        getBinding().f48962OooO0o0.setAdapter(this.mConcatAdapter);
        FixedRecyclerView fixedRecyclerView = getBinding().f48962OooO0o0;
        Intrinsics.checkNotNullExpressionValue(fixedRecyclerView, "binding.rvMessage");
        p518o0o0O000.o00000.OooO00o(fixedRecyclerView);
        p565o0oOo0.Oooo0 oooo2 = this.adapterMessageChat;
        if (oooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
            oooo2 = null;
        }
        OooOO0O listener = new OooOO0O();
        Objects.requireNonNull(oooo2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooo2.f40475OooOO0O = listener;
        p565o0oOo0.Oooo0 oooo3 = this.adapterMessageChat;
        if (oooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
        } else {
            oooo0 = oooo3;
        }
        OooOOO0 listener2 = new OooOOO0();
        Objects.requireNonNull(oooo0);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        oooo0.f40478OooOOO0 = listener2;
        ComposeView composeView = getBinding().f48960OooO0Oo;
        w1 w1Var = w1.f46925OooO00o;
        composeView.setContent(w1.f46926OooO0O0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m384initView$lambda1(MessageListFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p565o0oOo0.o0OO00O o0oo00o2 = this$0.adapterMessageHead;
        if (o0oo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o2 = null;
        }
        SystemConversationModel item = o0oo00o2.getItem(i);
        if (item != null) {
            this$0.toSystemConversationPage(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog(Conversation model) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        o00O0 o00o1 = new o00O0(contextRequireContext);
        String[] strArr = new String[2];
        strArr[0] = model.getTopTime() > 0 ? p255o00ooO0O.o000O0O0.OooO0OO(R.string.message_list_Unpin) : p255o00ooO0O.o000O0O0.OooO0OO(R.string.message_list_Pin);
        strArr[1] = p255o00ooO0O.o000O0O0.OooO0OO(R.string.delete_item);
        o00o1.OooOOo(CollectionsKt.mutableListOf(strArr));
        o00o1.OooOOoo(new OooOOO(model));
        o00o1.OooOOO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessageLoadingTab(StatusEnum$ChatServerStatus status) {
        FLog.INSTANCE.networkMonitorLog(NetWorkMonitorEventType.NetworkMonitor_Changed, status.toString());
        if (status == StatusEnum$ChatServerStatus.CONNECTING) {
            getBinding().f48958OooO0O0.setVisibility(0);
            getBinding().f48963OooO0oO.setText(getResources().getString(R.string.title_connecting));
            getBinding().f48961OooO0o.setVisibility(0);
            getBinding().f48961OooO0o.OooO0OO();
            return;
        }
        if (status == StatusEnum$ChatServerStatus.UNCONN) {
            getBinding().f48958OooO0O0.setVisibility(0);
            if (getBinding().f48961OooO0o.getVisibility() == 0) {
                getBinding().f48961OooO0o.setVisibility(8);
                getBinding().f48961OooO0o.OooO0Oo();
            }
            getBinding().f48963OooO0oO.setText(getResources().getString(R.string.title_unconnected));
            return;
        }
        if (status == StatusEnum$ChatServerStatus.CONNED) {
            getBinding().f48958OooO0O0.setVisibility(8);
            if (getBinding().f48961OooO0o.getVisibility() == 0) {
                getBinding().f48961OooO0o.setVisibility(8);
                getBinding().f48961OooO0o.OooO0Oo();
            }
        }
    }

    private final void toSystemConversationPage(SystemConversationModel model) {
        Context context = getContext();
        if (context != null) {
            int i = OooO00o.$EnumSwitchMapping$0[model.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                YallaTeamMessageActivity.f22270ooOO.OooO00o(context);
            } else {
                SystemMessageActivity.OooO00o oooO00o = SystemMessageActivity.f22261Oooooo;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) SystemMessageActivity.class));
            }
        }
    }

    @Override // p464o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initObserver();
    }

    @Override // p505o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageStart("MessageFragment");
    }

    @Override // p505o0o00o00.OooO, p464o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageEnd("MessageFragment");
        if (p138o00OO0oo.OooO.f31665OooO00o > 0) {
            p138o00OO0oo.OooO.f31665OooO00o = 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        CollapsingToolbarLayout collapsingToolbarLayout = getBinding().f48959OooO0OO;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7885OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
    }

    @Override // p505o0o00o00.OooO
    @NotNull
    public ac getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ac acVarInflate = ac.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(acVarInflate, "inflate(layoutInflater)");
        return acVarInflate;
    }
}
