package com.yalla.yalla.ui.activity.message;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.SearchView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.AfFriendVM;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO0OO00;
import p405o0Oo0OOO.oOO0Oo00;
import p405o0Oo0OOO.oOO0OoO0;
import p590o0oOooo0.l0;
import p643o0ooOOOO.k3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/AtFriendsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAtFriendsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/AtFriendsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,203:1\n22#2,2:204\n75#3,13:206\n75#3,13:219\n*S KotlinDebug\n*F\n+ 1 AtFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/AtFriendsActivity\n*L\n56#1:204,2\n57#1:206,13\n58#1:219,13\n*E\n"})
public final class AtFriendsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f25165OooOooO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public k3 f25167OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.OooO00o f25171OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public oOO0OoO0 f25172OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.OooO00o f25173OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public oOO0Oo00 f25174OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Job f25175OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public oOO0Oo00 f25176OooOoo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f25166OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oO0OO00.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25169OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AfFriendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25189OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25189OooO0Oo;
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
    public final ViewModelLazy f25168OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25193OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25193OooO0Oo;
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
    public final ConcatAdapter f25170OooOo0O = new ConcatAdapter(new RecyclerView.Adapter[0]);

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.message.AtFriendsActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0322OooO00o extends Lambda implements Function2<Integer, Intent, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function1<UserInfo, Unit> f25177OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0322OooO00o(Function1<? super UserInfo, Unit> function1) {
                super(2);
                this.f25177OooO0Oo = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Integer num, Intent intent) {
                Intent intent2 = intent;
                Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("Data") : null;
                FriendInfo friendInfo = serializableExtra instanceof FriendInfo ? (FriendInfo) serializableExtra : null;
                this.f25177OooO0Oo.invoke(friendInfo != null ? friendInfo.getUserInfo() : null);
                return Unit.INSTANCE;
            }
        }

        public static void OooO00o(@NotNull Function1 onAt) {
            Intrinsics.checkNotNullParameter(onAt, "onAt");
            Context context = com.code.android.util.o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                p604o0oo0O0.Oooo0 oooo0 = new p604o0oo0O0.Oooo0(fragmentActivity);
                oooo0.f57393OooO0O0 = AtFriendsActivity.class;
                oooo0.OooO00o(new C0322OooO00o(onAt));
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1", f = "AtFriendsActivity.kt", i = {}, l = {185, 193}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25178OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AtFriendsActivity f25179OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f25180OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1$1", f = "AtFriendsActivity.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25181OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ AtFriendsActivity f25182OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25183OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AtFriendsActivity atFriendsActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25182OooO0o = atFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f25182OooO0o, continuation);
                oooO00o.f25183OooO0o0 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(androidx.paging.o0OOO0o<FriendInfo> o0ooo0o2, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f25181OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25183OooO0o0;
                    AtFriendsActivity atFriendsActivity = this.f25182OooO0o;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25171OooOo0o;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = null;
                    if (oooO00o == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        oooO00o = null;
                    }
                    if (oooO00o.getItemCount() > 0) {
                        k3 k3Var = atFriendsActivity.f25167OooOo;
                        if (k3Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                            k3Var = null;
                        }
                        ConcatAdapter concatAdapter = atFriendsActivity.f25170OooOo0O;
                        concatAdapter.OooO00o(1, k3Var);
                        com.yalla.yalla.ui.adapter.OooO00o oooO00o3 = atFriendsActivity.f25171OooOo0o;
                        if (oooO00o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                            oooO00o3 = null;
                        }
                        concatAdapter.OooO00o(2, oooO00o3);
                    }
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o4 = atFriendsActivity.f25173OooOoO0;
                    if (oooO00o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        oooO00o2 = oooO00o4;
                    }
                    this.f25181OooO0Oo = 1;
                    if (oooO00o2.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.message.AtFriendsActivity$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1$2", f = "AtFriendsActivity.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0323OooO0O0 extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25184OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ AtFriendsActivity f25185OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25186OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0323OooO0O0(AtFriendsActivity atFriendsActivity, Continuation<? super C0323OooO0O0> continuation) {
                super(2, continuation);
                this.f25185OooO0o = atFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0323OooO0O0 c0323OooO0O0 = new C0323OooO0O0(this.f25185OooO0o, continuation);
                c0323OooO0O0.f25186OooO0o0 = obj;
                return c0323OooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(androidx.paging.o0OOO0o<FriendInfo> o0ooo0o2, Continuation<? super Unit> continuation) {
                return ((C0323OooO0O0) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f25184OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25186OooO0o0;
                    AtFriendsActivity atFriendsActivity = this.f25185OooO0o;
                    ConcatAdapter concatAdapter = atFriendsActivity.f25170OooOo0O;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25171OooOo0o;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = null;
                    if (oooO00o == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        oooO00o = null;
                    }
                    concatAdapter.OooO0Oo(oooO00o);
                    k3 k3Var = atFriendsActivity.f25167OooOo;
                    if (k3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                        k3Var = null;
                    }
                    atFriendsActivity.f25170OooOo0O.OooO0Oo(k3Var);
                    oOO0Oo00 ooo0oo00 = atFriendsActivity.f25176OooOoo0;
                    if (ooo0oo00 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                        ooo0oo00 = null;
                    }
                    TextView tvTitle = ooo0oo00.f45119OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                    com.code.android.util.o000O.OooO0O0(tvTitle);
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o3 = atFriendsActivity.f25173OooOoO0;
                    if (oooO00o3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        oooO00o2 = oooO00o3;
                    }
                    this.f25184OooO0Oo = 1;
                    if (oooO00o2.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, AtFriendsActivity atFriendsActivity, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25180OooO0o0 = str;
            this.f25179OooO0o = atFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25180OooO0o0, this.f25179OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25178OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f25180OooO0o0;
                boolean zIsBlank = StringsKt.isBlank(str);
                AtFriendsActivity atFriendsActivity = this.f25179OooO0o;
                if (zIsBlank) {
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> allFriends = ((AfFriendVM) atFriendsActivity.f25169OooOo00.getValue()).getAllFriends();
                    OooO00o oooO00o = new OooO00o(atFriendsActivity, null);
                    this.f25178OooO0Oo = 1;
                    if (FlowKt.collectLatest(allFriends, oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> searchFriends = ((AfFriendVM) atFriendsActivity.f25169OooOo00.getValue()).getSearchFriends(str);
                    C0323OooO0O0 c0323OooO0O0 = new C0323OooO0O0(atFriendsActivity, null);
                    this.f25178OooO0Oo = 2;
                    if (FlowKt.collectLatest(searchFriends, c0323OooO0O0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo(AtFriendsActivity atFriendsActivity, FriendInfo friendInfo, int i) {
        atFriendsActivity.getClass();
        if (friendInfo != null) {
            if (i == 0) {
                UserInfo userInfo = friendInfo.getUserInfo();
                Long lValueOf = userInfo != null ? Long.valueOf(userInfo.getUserId()) : null;
                Intrinsics.checkNotNull(lValueOf);
                if (lValueOf.longValue() < 1) {
                    return;
                }
            }
            Intent intent = new Intent();
            intent.putExtra("Data", friendInfo);
            atFriendsActivity.setResult(-1, intent);
            atFriendsActivity.finish();
        }
    }

    public final void OooOoO(String searchText) {
        Job job = this.f25175OooOoo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        com.yalla.yalla.ui.adapter.OooO00o oooO00o = this.f25171OooOo0o;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooO00o = null;
        }
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        oooO00o.f26945OooOOo0 = searchText;
        com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = this.f25173OooOoO0;
        if (oooO00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            oooO00o2 = null;
        }
        oooO00o2.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        oooO00o2.f26945OooOOo0 = searchText;
        this.f25175OooOoo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0O0(searchText, this, null), 3, null);
    }

    public final oO0OO00 OooOoO0() {
        return (oO0OO00) this.f25166OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f44899OooO00o);
        OooOOoo(p562o0oOo000.o000000.Contacts);
        OooOoO0().f44901OooO0OO.setEmptyImage(p562o0oOo000.o0Oo0oo.ic_empty_friends);
        OooOoO0().f44901OooO0OO.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.No_friends));
        oOO0Oo00 ooo0oo00Inflate = oOO0Oo00.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ooo0oo00Inflate, "inflate(...)");
        this.f25174OooOoOO = ooo0oo00Inflate;
        com.yalla.yalla.ui.adapter.OooO00o oooO00o = null;
        if (ooo0oo00Inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
            ooo0oo00Inflate = null;
        }
        ooo0oo00Inflate.f45119OooO0O0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Recent_contacts));
        oOO0Oo00 ooo0oo00 = this.f25174OooOoOO;
        if (ooo0oo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
            ooo0oo00 = null;
        }
        FrameLayout frameLayout = ooo0oo00.f45118OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        k3 k3Var = new k3(frameLayout);
        this.f25167OooOo = k3Var;
        ConcatAdapter concatAdapter = this.f25170OooOo0O;
        concatAdapter.OooO0O0(k3Var);
        com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = new com.yalla.yalla.ui.adapter.OooO00o();
        this.f25171OooOo0o = oooO00o2;
        concatAdapter.OooO0O0(oooO00o2);
        oOO0Oo00 ooo0oo00Inflate2 = oOO0Oo00.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ooo0oo00Inflate2, "inflate(...)");
        this.f25176OooOoo0 = ooo0oo00Inflate2;
        if (ooo0oo00Inflate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
            ooo0oo00Inflate2 = null;
        }
        ooo0oo00Inflate2.f45119OooO0O0.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.All_users));
        oOO0Oo00 ooo0oo01 = this.f25176OooOoo0;
        if (ooo0oo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
            ooo0oo01 = null;
        }
        FrameLayout frameLayout2 = ooo0oo01.f45118OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "getRoot(...)");
        concatAdapter.OooO0O0(new k3(frameLayout2));
        com.yalla.yalla.ui.adapter.OooO00o oooO00o3 = new com.yalla.yalla.ui.adapter.OooO00o();
        this.f25173OooOoO0 = oooO00o3;
        concatAdapter.OooO0O0(oooO00o3);
        OooOoO0().f44900OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO0().f44900OooO0O0.setAdapter(concatAdapter);
        RecyclerView friendList = OooOoO0().f44900OooO0O0;
        Intrinsics.checkNotNullExpressionValue(friendList, "friendList");
        l0.OooO00o(friendList);
        oOO0OoO0 ooo0ooo0Inflate = oOO0OoO0.inflate(getLayoutInflater(), OooOoO0().f44900OooO0O0, false);
        Intrinsics.checkNotNullExpressionValue(ooo0ooo0Inflate, "inflate(...)");
        this.f25172OooOoO = ooo0ooo0Inflate;
        if (ooo0ooo0Inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooo0ooo0Inflate = null;
        }
        View view = ooo0ooo0Inflate.f45121OooO0O0.f30105OooO0oO;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setVisibility(0);
        oOO0OoO0 ooo0ooo0 = this.f25172OooOoO;
        if (ooo0ooo0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooo0ooo0 = null;
        }
        ooo0ooo0.f45121OooO0O0.setEditLineColor(-16721719);
        oOO0OoO0 ooo0ooo1 = this.f25172OooOoO;
        if (ooo0ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooo0ooo1 = null;
        }
        SearchView searchView = ooo0ooo1.f45120OooO00o;
        Intrinsics.checkNotNullExpressionValue(searchView, "getRoot(...)");
        concatAdapter.OooO00o(0, new k3(searchView));
        oOO0OoO0 ooo0ooo2 = this.f25172OooOoO;
        if (ooo0ooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooo0ooo2 = null;
        }
        ooo0ooo2.f45121OooO0O0.setSearchTextChangedListener(new OooOOO0(this));
        com.yalla.yalla.ui.adapter.OooO00o oooO00o4 = this.f25171OooOo0o;
        if (oooO00o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooO00o4 = null;
        }
        OooOOO listener = new OooOOO(this);
        oooO00o4.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO00o4.f58005OooOO0O = listener;
        com.yalla.yalla.ui.adapter.OooO00o oooO00o5 = this.f25173OooOoO0;
        if (oooO00o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            oooO00o5 = null;
        }
        OooOOOO listener2 = new OooOOOO(this);
        oooO00o5.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        oooO00o5.f58005OooOO0O = listener2;
        OooOoO("");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO(this, null), 3, null);
        com.yalla.yalla.ui.adapter.OooO00o oooO00o6 = this.f25171OooOo0o;
        if (oooO00o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooO00o6 = null;
        }
        oooO00o6.OooO0o0(new OooOO0(this));
        com.yalla.yalla.ui.adapter.OooO00o oooO00o7 = this.f25173OooOoO0;
        if (oooO00o7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            oooO00o = oooO00o7;
        }
        oooO00o.OooO0o0(new OooOO0O(this));
        o0oo0000.OooO00o.OooO0O0("103015");
        ((BaseMomentDetailVM) this.f25168OooOo0.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((BaseMomentDetailVM) this.f25168OooOo0.getValue()).statisticalTime();
    }
}
