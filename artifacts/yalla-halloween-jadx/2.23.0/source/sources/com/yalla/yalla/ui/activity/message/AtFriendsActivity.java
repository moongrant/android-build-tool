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
import p579o0oOoo.oOO0OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.r6;
import p641o0ooOOOO.s6;
import p641o0ooOOOO.t5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/AtFriendsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAtFriendsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/AtFriendsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,203:1\n22#2,2:204\n75#3,13:206\n75#3,13:219\n*S KotlinDebug\n*F\n+ 1 AtFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/AtFriendsActivity\n*L\n56#1:204,2\n57#1:206,13\n58#1:219,13\n*E\n"})
public final class AtFriendsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f25620OooOooO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public p400o0Oo0OO.OooOOOO f25622OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.OooO00o f25626OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public s6 f25627OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.OooO00o f25628OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public r6 f25629OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Job f25630OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public r6 f25631OooOoo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f25621OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(t5.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25624OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AfFriendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25644OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25644OooO0Oo;
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
    public final ViewModelLazy f25623OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$5
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
        public final /* synthetic */ Function0 f25648OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25648OooO0Oo;
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
    public final ConcatAdapter f25625OooOo0O = new ConcatAdapter(new RecyclerView.Adapter[0]);

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.message.AtFriendsActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0323OooO00o extends Lambda implements Function2<Integer, Intent, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function1<UserInfo, Unit> f25632OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0323OooO00o(Function1<? super UserInfo, Unit> function1) {
                super(2);
                this.f25632OooO0Oo = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Integer num, Intent intent) {
                Intent intent2 = intent;
                Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("Data") : null;
                FriendInfo friendInfo = serializableExtra instanceof FriendInfo ? (FriendInfo) serializableExtra : null;
                this.f25632OooO0Oo.invoke(friendInfo != null ? friendInfo.getUserInfo() : null);
                return Unit.INSTANCE;
            }
        }

        public static void OooO00o(@NotNull Function1 onAt) {
            Intrinsics.checkNotNullParameter(onAt, "onAt");
            Context context = com.code.android.util.o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                p599o0oo00oo.o0000OO0 o0000oo1 = new p599o0oo00oo.o0000OO0(fragmentActivity);
                o0000oo1.f56862OooO0O0 = AtFriendsActivity.class;
                o0000oo1.OooO00o(new C0323OooO00o(onAt));
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1", f = "AtFriendsActivity.kt", i = {}, l = {185, 193}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25633OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AtFriendsActivity f25634OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f25635OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1$1", f = "AtFriendsActivity.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25636OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ AtFriendsActivity f25637OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25638OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AtFriendsActivity atFriendsActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25637OooO0o = atFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f25637OooO0o, continuation);
                oooO00o.f25638OooO0o0 = obj;
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
                int i = this.f25636OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25638OooO0o0;
                    AtFriendsActivity atFriendsActivity = this.f25637OooO0o;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25626OooOo0o;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = null;
                    if (oooO00o == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        oooO00o = null;
                    }
                    if (oooO00o.getItemCount() > 0) {
                        p400o0Oo0OO.OooOOOO oooOOOO = atFriendsActivity.f25622OooOo;
                        if (oooOOOO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                            oooOOOO = null;
                        }
                        ConcatAdapter concatAdapter = atFriendsActivity.f25625OooOo0O;
                        concatAdapter.OooO00o(1, oooOOOO);
                        com.yalla.yalla.ui.adapter.OooO00o oooO00o3 = atFriendsActivity.f25626OooOo0o;
                        if (oooO00o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                            oooO00o3 = null;
                        }
                        concatAdapter.OooO00o(2, oooO00o3);
                    }
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o4 = atFriendsActivity.f25628OooOoO0;
                    if (oooO00o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        oooO00o2 = oooO00o4;
                    }
                    this.f25636OooO0Oo = 1;
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
        public static final class C0324OooO0O0 extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25639OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ AtFriendsActivity f25640OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25641OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0324OooO0O0(AtFriendsActivity atFriendsActivity, Continuation<? super C0324OooO0O0> continuation) {
                super(2, continuation);
                this.f25640OooO0o = atFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0324OooO0O0 c0324OooO0O0 = new C0324OooO0O0(this.f25640OooO0o, continuation);
                c0324OooO0O0.f25641OooO0o0 = obj;
                return c0324OooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(androidx.paging.o0OOO0o<FriendInfo> o0ooo0o2, Continuation<? super Unit> continuation) {
                return ((C0324OooO0O0) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f25639OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25641OooO0o0;
                    AtFriendsActivity atFriendsActivity = this.f25640OooO0o;
                    ConcatAdapter concatAdapter = atFriendsActivity.f25625OooOo0O;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25626OooOo0o;
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = null;
                    if (oooO00o == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        oooO00o = null;
                    }
                    concatAdapter.OooO0Oo(oooO00o);
                    p400o0Oo0OO.OooOOOO oooOOOO = atFriendsActivity.f25622OooOo;
                    if (oooOOOO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                        oooOOOO = null;
                    }
                    atFriendsActivity.f25625OooOo0O.OooO0Oo(oooOOOO);
                    r6 r6Var = atFriendsActivity.f25631OooOoo0;
                    if (r6Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                        r6Var = null;
                    }
                    TextView textView = r6Var.f58737OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(textView, "allFriendHeader.tvTitle");
                    com.code.android.util.o000OO00.OooO0O0(textView);
                    com.yalla.yalla.ui.adapter.OooO00o oooO00o3 = atFriendsActivity.f25628OooOoO0;
                    if (oooO00o3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        oooO00o2 = oooO00o3;
                    }
                    this.f25639OooO0Oo = 1;
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
            this.f25635OooO0o0 = str;
            this.f25634OooO0o = atFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25635OooO0o0, this.f25634OooO0o, continuation);
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
            int i = this.f25633OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f25635OooO0o0;
                boolean zIsBlank = StringsKt.isBlank(str);
                AtFriendsActivity atFriendsActivity = this.f25634OooO0o;
                if (zIsBlank) {
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> allFriends = ((AfFriendVM) atFriendsActivity.f25624OooOo00.getValue()).getAllFriends();
                    OooO00o oooO00o = new OooO00o(atFriendsActivity, null);
                    this.f25633OooO0Oo = 1;
                    if (FlowKt.collectLatest(allFriends, oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> searchFriends = ((AfFriendVM) atFriendsActivity.f25624OooOo00.getValue()).getSearchFriends(str);
                    C0324OooO0O0 c0324OooO0O0 = new C0324OooO0O0(atFriendsActivity, null);
                    this.f25633OooO0Oo = 2;
                    if (FlowKt.collectLatest(searchFriends, c0324OooO0O0, this) == coroutine_suspended) {
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
        Job job = this.f25630OooOoo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        com.yalla.yalla.ui.adapter.OooO00o oooO00o = this.f25626OooOo0o;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooO00o = null;
        }
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        oooO00o.f27410OooOOo0 = searchText;
        com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = this.f25628OooOoO0;
        if (oooO00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            oooO00o2 = null;
        }
        oooO00o2.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        oooO00o2.f27410OooOOo0 = searchText;
        this.f25630OooOoo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0O0(searchText, this, null), 3, null);
    }

    public final t5 OooOoO0() {
        return (t5) this.f25621OooOOoo.getValue();
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
        setContentView(OooOoO0().f58865OooO00o);
        OooOOoo(oO00OOo0.Contacts);
        OooOoO0().f58867OooO0OO.setEmptyImage(oOo00OO0.ic_empty_friends);
        OooOoO0().f58867OooO0OO.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.No_friends));
        r6 r6VarInflate = r6.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(r6VarInflate, "inflate(layoutInflater)");
        this.f25629OooOoOO = r6VarInflate;
        com.yalla.yalla.ui.adapter.OooO00o oooO00o = null;
        if (r6VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
            r6VarInflate = null;
        }
        r6VarInflate.f58737OooO0O0.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Recent_contacts));
        r6 r6Var = this.f25629OooOoOO;
        if (r6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
            r6Var = null;
        }
        FrameLayout frameLayout = r6Var.f58736OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "recentFriendHeader.root");
        p400o0Oo0OO.OooOOOO oooOOOO = new p400o0Oo0OO.OooOOOO(frameLayout);
        this.f25622OooOo = oooOOOO;
        ConcatAdapter concatAdapter = this.f25625OooOo0O;
        concatAdapter.OooO0O0(oooOOOO);
        com.yalla.yalla.ui.adapter.OooO00o oooO00o2 = new com.yalla.yalla.ui.adapter.OooO00o();
        this.f25626OooOo0o = oooO00o2;
        concatAdapter.OooO0O0(oooO00o2);
        r6 r6VarInflate2 = r6.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(r6VarInflate2, "inflate(layoutInflater)");
        this.f25631OooOoo0 = r6VarInflate2;
        if (r6VarInflate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
            r6VarInflate2 = null;
        }
        r6VarInflate2.f58737OooO0O0.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.All_users));
        r6 r6Var2 = this.f25631OooOoo0;
        if (r6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
            r6Var2 = null;
        }
        FrameLayout frameLayout2 = r6Var2.f58736OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "allFriendHeader.root");
        concatAdapter.OooO0O0(new p400o0Oo0OO.OooOOOO(frameLayout2));
        com.yalla.yalla.ui.adapter.OooO00o oooO00o3 = new com.yalla.yalla.ui.adapter.OooO00o();
        this.f25628OooOoO0 = oooO00o3;
        concatAdapter.OooO0O0(oooO00o3);
        OooOoO0().f58866OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO0().f58866OooO0O0.setAdapter(concatAdapter);
        RecyclerView recyclerView = OooOoO0().f58866OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.friendList");
        oOO0OOO.OooO00o(recyclerView);
        s6 s6VarInflate = s6.inflate(getLayoutInflater(), OooOoO0().f58866OooO0O0, false);
        Intrinsics.checkNotNullExpressionValue(s6VarInflate, "inflate(\n               …      false\n            )");
        this.f25627OooOoO = s6VarInflate;
        if (s6VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            s6VarInflate = null;
        }
        View view = s6VarInflate.f58804OooO0O0.f30650OooO0oO;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setVisibility(0);
        s6 s6Var = this.f25627OooOoO;
        if (s6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            s6Var = null;
        }
        s6Var.f58804OooO0O0.setEditLineColor(-16721719);
        s6 s6Var2 = this.f25627OooOoO;
        if (s6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            s6Var2 = null;
        }
        SearchView searchView = s6Var2.f58803OooO00o;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchHeader.root");
        concatAdapter.OooO00o(0, new p400o0Oo0OO.OooOOOO(searchView));
        s6 s6Var3 = this.f25627OooOoO;
        if (s6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            s6Var3 = null;
        }
        s6Var3.f58804OooO0O0.setSearchTextChangedListener(new OooOOO0(this));
        com.yalla.yalla.ui.adapter.OooO00o oooO00o4 = this.f25626OooOo0o;
        if (oooO00o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooO00o4 = null;
        }
        OooOOO listener = new OooOOO(this);
        oooO00o4.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO00o4.f44446OooOO0O = listener;
        com.yalla.yalla.ui.adapter.OooO00o oooO00o5 = this.f25628OooOoO0;
        if (oooO00o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            oooO00o5 = null;
        }
        OooOOOO listener2 = new OooOOOO(this);
        oooO00o5.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        oooO00o5.f44446OooOO0O = listener2;
        OooOoO("");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO(this, null), 3, null);
        com.yalla.yalla.ui.adapter.OooO00o oooO00o6 = this.f25626OooOo0o;
        if (oooO00o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooO00o6 = null;
        }
        oooO00o6.OooO0o0(new OooOO0(this));
        com.yalla.yalla.ui.adapter.OooO00o oooO00o7 = this.f25628OooOoO0;
        if (oooO00o7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            oooO00o = oooO00o7;
        }
        oooO00o.OooO0o0(new OooOO0O(this));
        p587o0oOooo.o0OO000.OooO00o("103015");
        ((BaseMomentDetailVM) this.f25623OooOo0.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((BaseMomentDetailVM) this.f25623OooOo0.getValue()).statisticalTime();
    }
}
