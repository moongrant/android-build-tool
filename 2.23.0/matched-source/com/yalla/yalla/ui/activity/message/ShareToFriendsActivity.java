package com.yalla.yalla.ui.activity.message;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.model.GiveThemeModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.moment.MomentImageModel;
import com.yalla.yalla.model.moment.MomentPoll;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.share.ShareActivityModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareToFriendModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.SearchView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.ShareToFriendVM;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import io.agora.rtc.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.a5;
import p641o0ooOOOO.b5;
import p641o0ooOOOO.c5;
import p641o0ooOOOO.d5;
import p641o0ooOOOO.e5;
import p641o0ooOOOO.m5;
import p641o0ooOOOO.n5;
import p641o0ooOOOO.w4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/ShareToFriendsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShareToFriendsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareToFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/ShareToFriendsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,906:1\n22#2,2:907\n75#3,13:909\n75#3,13:922\n1864#4,3:935\n*S KotlinDebug\n*F\n+ 1 ShareToFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/ShareToFriendsActivity\n*L\n78#1:907,2\n94#1:909,13\n96#1:922,13\n535#1:935,3\n*E\n"})
public final class ShareToFriendsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ int f25730Oooo00o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public n5 f25733OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public m5 f25734OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public n5 f25735OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public TextView f25736OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.o000OO00 f25737OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public p400o0Oo0OO.OooOOOO f25738OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.o000OO00 f25739OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public ShareToFriendModel f25740OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public ShareContentType f25742OooOooO;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public Job f25744Oooo000;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f25731OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(w4.class), this, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f25732OooOo = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f25741OooOoo0 = new ArrayList();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25743OooOooo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareToFriendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25758OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25758OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25745Oooo00O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25762OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25762OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context, @NotNull ShareToFriendModel model) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(model, "model");
            Intent intent = new Intent(context, (Class<?>) ShareToFriendsActivity.class);
            intent.putExtra("SHARE_MODEL", model);
            context.startActivity(intent);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareContentType.values().length];
            try {
                iArr[ShareContentType.Room.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareContentType.Moment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareContentType.Topic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareContentType.User.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareContentType.Web.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShareContentType.Theme.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShareContentType.Events.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25746OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25746OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25746OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25746OooO0Oo;
        }

        public final int hashCode() {
            return this.f25746OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25746OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1", f = "ShareToFriendsActivity.kt", i = {}, l = {163, 171}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25747OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ShareToFriendsActivity f25748OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f25749OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1$1", f = "ShareToFriendsActivity.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25750OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ ShareToFriendsActivity f25751OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25752OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25751OooO0o = shareToFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f25751OooO0o, continuation);
                oooO00o.f25752OooO0o0 = obj;
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
                int i = this.f25750OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25752OooO0o0;
                    ShareToFriendsActivity shareToFriendsActivity = this.f25751OooO0o;
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = shareToFriendsActivity.f25737OooOoO;
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = null;
                    if (o000oo01 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        o000oo01 = null;
                    }
                    if (o000oo01.getItemCount() > 0) {
                        p400o0Oo0OO.OooOOOO oooOOOO = shareToFriendsActivity.f25738OooOoO0;
                        if (oooOOOO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                            oooOOOO = null;
                        }
                        ConcatAdapter concatAdapter = shareToFriendsActivity.f25732OooOo;
                        concatAdapter.OooO00o(1, oooOOOO);
                        com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = shareToFriendsActivity.f25737OooOoO;
                        if (o000oo03 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                            o000oo03 = null;
                        }
                        concatAdapter.OooO00o(2, o000oo03);
                    }
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo04 = shareToFriendsActivity.f25739OooOoOO;
                    if (o000oo04 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o000oo02 = o000oo04;
                    }
                    this.f25750OooO0Oo = 1;
                    if (o000oo02.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1$2", f = "ShareToFriendsActivity.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25753OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ ShareToFriendsActivity f25754OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25755OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f25754OooO0o = shareToFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f25754OooO0o, continuation);
                oooO0O0.f25755OooO0o0 = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(androidx.paging.o0OOO0o<FriendInfo> o0ooo0o2, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f25753OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25755OooO0o0;
                    ShareToFriendsActivity shareToFriendsActivity = this.f25754OooO0o;
                    ConcatAdapter concatAdapter = shareToFriendsActivity.f25732OooOo;
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = shareToFriendsActivity.f25737OooOoO;
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = null;
                    if (o000oo01 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        o000oo01 = null;
                    }
                    concatAdapter.OooO0Oo(o000oo01);
                    p400o0Oo0OO.OooOOOO oooOOOO = shareToFriendsActivity.f25738OooOoO0;
                    if (oooOOOO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                        oooOOOO = null;
                    }
                    shareToFriendsActivity.f25732OooOo.OooO0Oo(oooOOOO);
                    n5 n5Var = shareToFriendsActivity.f25735OooOo0O;
                    if (n5Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                        n5Var = null;
                    }
                    TextView textView = n5Var.f58452OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(textView, "allFriendBinding.tvTitle");
                    com.code.android.util.o000OO00.OooO0O0(textView);
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = shareToFriendsActivity.f25739OooOoOO;
                    if (o000oo03 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o000oo02 = o000oo03;
                    }
                    this.f25753OooO0Oo = 1;
                    if (o000oo02.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
        public OooO0o(String str, ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25749OooO0o0 = str;
            this.f25748OooO0o = shareToFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f25749OooO0o0, this.f25748OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25747OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f25749OooO0o0;
                boolean zIsBlank = StringsKt.isBlank(str);
                ShareToFriendsActivity shareToFriendsActivity = this.f25748OooO0o;
                if (zIsBlank) {
                    int i2 = ShareToFriendsActivity.f25730Oooo00o;
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> allFriends = shareToFriendsActivity.OooOoOO().getAllFriends();
                    OooO00o oooO00o = new OooO00o(shareToFriendsActivity, null);
                    this.f25747OooO0Oo = 1;
                    if (FlowKt.collectLatest(allFriends, oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    int i3 = ShareToFriendsActivity.f25730Oooo00o;
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> searchFriends = shareToFriendsActivity.OooOoOO().getSearchFriends(str);
                    OooO0O0 oooO0O0 = new OooO0O0(shareToFriendsActivity, null);
                    this.f25747OooO0Oo = 2;
                    if (FlowKt.collectLatest(searchFriends, oooO0O0, this) == coroutine_suspended) {
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

    public static final void OooOo(ShareToFriendsActivity shareToFriendsActivity) {
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = shareToFriendsActivity.f25739OooOoOO;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = null;
        if (o000oo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000oo01 = null;
        }
        if (!o000oo01.f27542OooOOo) {
            HeaderLayout headerLayout = shareToFriendsActivity.f22755OooOO0;
            if (headerLayout != null) {
                headerLayout.setNavigationIcon(oOo00OO0.btn_return);
            }
            TextView textView = shareToFriendsActivity.f25736OooOo0o;
            if (textView != null) {
                textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.multiple));
            }
            TextView textView2 = shareToFriendsActivity.f25736OooOo0o;
            if (textView2 != null) {
                textView2.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.white));
            }
            TextView textView3 = shareToFriendsActivity.f25736OooOo0o;
            if (textView3 == null) {
                return;
            }
            textView3.setClickable(true);
            return;
        }
        com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = shareToFriendsActivity.f25739OooOoOO;
        if (o000oo03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            o000oo02 = o000oo03;
        }
        int size = o000oo02.f27544OooOOoo.size();
        TextView textView4 = shareToFriendsActivity.f25736OooOo0o;
        if (textView4 != null) {
            textView4.setText(size > 0 ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.share_number), String.valueOf(size)) : com.code.android.util.o0000.OooO0OO(oO00OOo0.share));
        }
        TextView textView5 = shareToFriendsActivity.f25736OooOo0o;
        if (textView5 != null) {
            textView5.setTextColor(com.code.android.util.o0000.OooO00o(size > 0 ? oO00O0o.white : oO00O0o.color_FFFFFFF_70));
        }
        TextView textView6 = shareToFriendsActivity.f25736OooOo0o;
        if (textView6 == null) {
            return;
        }
        textView6.setClickable(size > 0);
    }

    public static final void OooOoO0(ShareToFriendsActivity shareToFriendsActivity, boolean z) {
        boolean z2 = true;
        if (!z) {
            shareToFriendsActivity.getClass();
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_most_7_member);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        m5 m5Var = shareToFriendsActivity.f25734OooOo00;
        m5 m5Var2 = null;
        if (m5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            m5Var = null;
        }
        if (m5Var.f58407OooO0O0.getSearchText().length() > 0) {
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Selected);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z2 = false;
            }
            if (!z2) {
                com.code.android.util.o000Oo0 o000oo0OooO00o2 = com.code.android.util.o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
            m5 m5Var3 = shareToFriendsActivity.f25734OooOo00;
            if (m5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                m5Var3 = null;
            }
            m5Var3.f58407OooO0O0.getEditSearch().setText((CharSequence) null);
            m5 m5Var4 = shareToFriendsActivity.f25734OooOo00;
            if (m5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                m5Var4 = null;
            }
            m5Var4.f58407OooO0O0.getEditSearch().clearFocus();
            m5 m5Var5 = shareToFriendsActivity.f25734OooOo00;
            if (m5Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            } else {
                m5Var2 = m5Var5;
            }
            EditText editSearch = m5Var2.f58407OooO0O0.getEditSearch();
            p367o0OOo0o0.OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), android.support.v4.media.session.OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context"), editSearch.getWindowToken(), 0);
        }
    }

    public final w4 OooOoO() {
        return (w4) this.f25731OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ShareToFriendVM OooOoOO() {
        return (ShareToFriendVM) this.f25743OooOooo.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:186:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:33:0x0133  */
    /* JADX WARN: Code duplicated, block: B:36:0x013b  */
    /* JADX WARN: Code duplicated, block: B:38:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x014a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v38, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v45, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v51, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v55, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v44, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [T] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    public final void OooOoo(long j, String str, String str2) {
        MomentDetailModel postDetailModel;
        ShareToFriendModel shareToFriendModel;
        MomentAdapterTag momentAdapterTag;
        Object obj;
        MomentPoll value;
        int size;
        String strOooO0OO;
        ?? r3;
        String content;
        int shareType;
        TopicInfoModel topicInfoModel;
        int size2;
        UserInfoModel userInfoModel;
        int size3;
        ShareActivityModel shareActivityModel;
        int size4;
        GiveThemeModel giveThemeModel;
        EventModel eventModel;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01;
        int size5;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02;
        ShareContentType shareContentType = this.f25742OooOooO;
        switch (shareContentType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[shareContentType.ordinal()]) {
            case 1:
                com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = null;
                d5 d5VarInflate = d5.inflate(getLayoutInflater());
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(d5VarInflate.f57725OooO00o.getContext());
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0o0());
                oooO00o.OooO0o0(6);
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o2 = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
                String value2 = oooO00o2.OooO00o().f24998OooO00o.getValue();
                int iOooO00o = com.code.android.util.o0000O0.OooO00o(60);
                oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, value2);
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo(d5VarInflate.f57727OooO0OO);
                d5VarInflate.f57729OooO0o0.setText(oooO00o2.OooO00o().f24999OooO0O0.getValue());
                d5VarInflate.f57728OooO0Oo.setText(p590o0oo0.OooOOOO.OooO0oO("ID:", String.valueOf(oooO00o2.OooO00o().f25000OooO0OO.getValue())));
                int size6 = 1;
                d5VarInflate.f57726OooO0O0.setFilters(new InputFilter[]{new p396o0Oo0O.OooOOOO(), new InputFilter.LengthFilter(300)});
                Intrinsics.checkNotNullExpressionValue(d5VarInflate, "inflate(layoutInflater).…gthFilter(300))\n        }");
                p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
                o0oo00o2.OooOoOO();
                String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_xxx_friends);
                String[] strArr = new String[1];
                com.yalla.yalla.ui.adapter.o000OO00 o000oo04 = this.f25739OooOoOO;
                if (o000oo04 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    o000oo04 = null;
                }
                if (o000oo04.f27542OooOOo) {
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo05 = this.f25739OooOoOO;
                    if (o000oo05 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o000oo03 = o000oo05;
                    }
                    size6 = o000oo03.f27544OooOOoo.size();
                }
                strArr[0] = String.valueOf(size6);
                o0oo00o2.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO2, strArr));
                ConstraintLayout constraintLayout = d5VarInflate.f57725OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "roomBinding.root");
                o0oo00o2.OooOOo(constraintLayout);
                o0oo00o2.OooOo0(new o0(this, j, d5VarInflate));
                o0oo00o2.OooOO0o();
                break;
            case 2:
                ShareToFriendModel shareToFriendModel2 = this.f25740OooOoo;
                if (shareToFriendModel2 != null && (postDetailModel = shareToFriendModel2.getPostDetailModel()) != null && (shareToFriendModel = this.f25740OooOoo) != null && (momentAdapterTag = shareToFriendModel.getMomentAdapterTag()) != null) {
                    long id = postDetailModel.getId();
                    MomentSendContentModel content2 = postDetailModel.getContent();
                    String content3 = content2 != null ? content2.getContent() : null;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = "";
                    if (!postDetailModel.getImageInfoList().isEmpty()) {
                        objectRef2.element = postDetailModel.getImageInfoList().get(0).getUrl();
                    }
                    MomentForwardContent forwardContent = postDetailModel.getForwardContent();
                    int type = postDetailModel.getType();
                    if (type == MomentType.Forward.getValue()) {
                        MomentDetailModel forward = postDetailModel.getForward();
                        if (forward != null) {
                            obj = "";
                            if (forward.getType() == MomentType.Poll.getValue()) {
                                MomentPoll value3 = forward.getMomentPollLiveData().getValue();
                                if (value3 != null) {
                                    objectRef2.element = value3.getShareDefaultImg();
                                }
                            } else {
                                forwardContent = forward.getForwardContent();
                                ArrayList<MomentImageModel> imageInfoList = forward.getImageInfoList();
                                if (!imageInfoList.isEmpty()) {
                                    objectRef2.element = imageInfoList.get(0).getUrl();
                                }
                            }
                        } else {
                            obj = "";
                        }
                    } else {
                        obj = "";
                        if (type == MomentType.Poll.getValue() && (value = postDetailModel.getMomentPollLiveData().getValue()) != null) {
                            objectRef2.element = value.getShareDefaultImg();
                        }
                    }
                    if (forwardContent != null) {
                        if ((((CharSequence) objectRef2.element).length() == 0) && ((shareType = forwardContent.getShareType()) == 1 || shareType == 2 || shareType == 3 || shareType == 4 || shareType == 20)) {
                            objectRef2.element = forwardContent.getImage();
                        }
                    }
                    int type2 = postDetailModel.getType();
                    MomentType momentType = MomentType.Video;
                    if (type2 == momentType.getValue()) {
                        objectRef2.element = postDetailModel.getCoverPic();
                    }
                    c5 c5VarInflate = c5.inflate(getLayoutInflater());
                    o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(c5VarInflate.f57653OooO00o.getContext());
                    oooO00o3.OooO00o(p543o0oO0O00.OooO.OooO0o0());
                    oooO00o3.f43923OooOOOo = oOo00OO0.icon_head_default;
                    oooO00o3.OooO0o0(6);
                    String str3 = (String) objectRef2.element;
                    int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o3.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o2, iOooO00o2, str3);
                    oooO00o3.f43909OooO00o = 0;
                    oooO00o3.OooO0Oo(c5VarInflate.f57655OooO0OO);
                    if (postDetailModel.getType() == momentType.getValue()) {
                        ImageView ivVideo = c5VarInflate.f57657OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(ivVideo, "ivVideo");
                        com.code.android.util.o000OO00.OooOOOO(ivVideo);
                    }
                    TextView textView = c5VarInflate.f57656OooO0Oo;
                    textView.setText(content3);
                    MomentSendContentModel content4 = postDetailModel.getContent();
                    LinearLayout linearLayout = c5VarInflate.f57653OooO00o;
                    if (content4 != null) {
                        MomentSendContentModel content5 = postDetailModel.getContent();
                        if (!TextUtils.isEmpty(content5 != null ? content5.getContent() : null)) {
                            TextView textView2 = new TextView(linearLayout.getContext());
                            p595o0oo00Oo.o00000OO.OooO00o(linearLayout.getContext(), postDetailModel.getContent(), textView2, oO00O0o.color_6D6D6D, null);
                            CharSequence text = textView2.getText();
                            Intrinsics.checkNotNullExpressionValue(text, "textView.text");
                            if (text.length() > 0) {
                                textView.setText(textView2.getText());
                            }
                            MomentSendContentModel content6 = postDetailModel.getContent();
                            if (content6 == null || (content = content6.getContent()) == null) {
                                r3 = content;
                                r3 = obj;
                            }
                            r3 = content;
                            MomentSendContentModel content7 = postDetailModel.getContent();
                            if (content7 != null) {
                                Iterator it = content7.getAt().iterator();
                                int i = 0;
                                r3 = r3;
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Iterator it2 = it;
                                    String strOooOoO = StringsKt.OooOoO(r3, OooO0OO.OooO00o.OooO00o("@{", i, "}"), "@" + ((MomentSendContentAtModel) next).getName());
                                    it = it2;
                                    i = i2;
                                    r3 = strOooOoO;
                                }
                            }
                            objectRef.element = r3;
                            textView.setMaxLines(2);
                        }
                    }
                    CharSequence text2 = textView.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "dialogPostShareTvName.text");
                    if (text2.length() == 0) {
                        if (((CharSequence) objectRef2.element).length() == 0) {
                            textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.share_post_content));
                        }
                        if (forwardContent != null && forwardContent.getShareType() == 20) {
                            textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.event_share_moment));
                        }
                        int type3 = postDetailModel.getType();
                        if (type3 == MomentType.Image.getValue()) {
                            strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0._photo_);
                        } else if (type3 == MomentType.Video.getValue()) {
                            strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0._Video_);
                        } else {
                            strOooO0OO = type3 == MomentType.Poll.getValue() ? com.code.android.util.o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", com.code.android.util.o0000.OooO0OO(oO00OOo0.Other), "]");
                        }
                        textView.setText(strOooO0OO);
                    }
                    c5VarInflate.f57654OooO0O0.setFilters(new InputFilter[]{new p396o0Oo0O.OooOOOO()});
                    Intrinsics.checkNotNullExpressionValue(c5VarInflate, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    p157o00OoOO0.o0OO00O o0oo00o3 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o3.OooOoOO();
                    String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_xxx_friends);
                    String[] strArr2 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo06 = this.f25739OooOoOO;
                    if (o000oo06 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000oo06 = null;
                    }
                    if (o000oo06.f27542OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OO00 o000oo07 = this.f25739OooOoOO;
                        if (o000oo07 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o000oo07 = null;
                        }
                        size = o000oo07.f27544OooOOoo.size();
                    } else {
                        size = 1;
                    }
                    strArr2[0] = String.valueOf(size);
                    o0oo00o3.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO3, strArr2));
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "postBinding.root");
                    o0oo00o3.OooOOo(linearLayout);
                    o0oo00o3.OooOo0(new o0oOOo(this, momentAdapterTag, j, postDetailModel, id, objectRef2, objectRef, c5VarInflate));
                    o0oo00o3.OooOO0o();
                    break;
                }
                break;
            case 3:
                com.yalla.yalla.ui.adapter.o000OO00 o000oo08 = null;
                ShareToFriendModel shareToFriendModel3 = this.f25740OooOoo;
                if (shareToFriendModel3 != null && (topicInfoModel = shareToFriendModel3.getTopicInfoModel()) != null) {
                    e5 e5VarInflate = e5.inflate(getLayoutInflater());
                    o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(e5VarInflate.f57814OooO00o.getContext());
                    oooO00o4.OooO00o(p543o0oO0O00.OooO.OooO0o0());
                    oooO00o4.OooO0o0(6);
                    String image = topicInfoModel.getImage();
                    int iOooO00o3 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o4.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o3, iOooO00o3, image);
                    oooO00o4.f43909OooO00o = 0;
                    oooO00o4.OooO0Oo(e5VarInflate.f57816OooO0OO);
                    e5VarInflate.f57818OooO0o0.setText(topicInfoModel.getName());
                    e5VarInflate.f57817OooO0Oo.OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), -1);
                    e5VarInflate.f57815OooO0O0.setFilters(new InputFilter[]{new p396o0Oo0O.OooOOOO()});
                    Intrinsics.checkNotNullExpressionValue(e5VarInflate, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    p157o00OoOO0.o0OO00O o0oo00o4 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o4.OooOoOO();
                    String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_xxx_friends);
                    String[] strArr3 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo09 = this.f25739OooOoOO;
                    if (o000oo09 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000oo09 = null;
                    }
                    if (o000oo09.f27542OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OO00 o000oo010 = this.f25739OooOoOO;
                        if (o000oo010 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        } else {
                            o000oo08 = o000oo010;
                        }
                        size2 = o000oo08.f27544OooOOoo.size();
                    } else {
                        size2 = 1;
                    }
                    strArr3[0] = String.valueOf(size2);
                    o0oo00o4.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO4, strArr3));
                    ConstraintLayout constraintLayout2 = e5VarInflate.f57814OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "topicBinding.root");
                    o0oo00o4.OooOOo(constraintLayout2);
                    o0oo00o4.OooOo0(new o0O0000O(this, j, topicInfoModel, e5VarInflate));
                    o0oo00o4.OooOO0o();
                    break;
                }
                break;
            case 4:
                com.yalla.yalla.ui.adapter.o000OO00 o000oo011 = null;
                ShareToFriendModel shareToFriendModel4 = this.f25740OooOoo;
                if (shareToFriendModel4 != null && (userInfoModel = shareToFriendModel4.getUserInfoModel()) != null) {
                    d5 d5VarInflate2 = d5.inflate(getLayoutInflater());
                    o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(d5VarInflate2.f57725OooO00o.getContext());
                    oooO00o5.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                    String userHeader = userInfoModel.getUserHeader();
                    int iOooO00o4 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o5.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o4, iOooO00o4, userHeader);
                    oooO00o5.f43909OooO00o = 0;
                    oooO00o5.OooO0Oo(d5VarInflate2.f57727OooO0OO);
                    d5VarInflate2.f57729OooO0o0.setText(userInfoModel.getUserName());
                    d5VarInflate2.f57728OooO0Oo.setText(p590o0oo0.OooOOOO.OooO0oO("ID:", userInfoModel.getUserIdx()));
                    d5VarInflate2.f57726OooO0O0.setFilters(new InputFilter[]{new p396o0Oo0O.OooOOOO()});
                    Intrinsics.checkNotNullExpressionValue(d5VarInflate2, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    p157o00OoOO0.o0OO00O o0oo00o5 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o5.OooOoOO();
                    String strOooO0OO5 = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_xxx_friends);
                    String[] strArr4 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo012 = this.f25739OooOoOO;
                    if (o000oo012 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000oo012 = null;
                    }
                    if (o000oo012.f27542OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OO00 o000oo013 = this.f25739OooOoOO;
                        if (o000oo013 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        } else {
                            o000oo011 = o000oo013;
                        }
                        size3 = o000oo011.f27544OooOOoo.size();
                    } else {
                        size3 = 1;
                    }
                    strArr4[0] = String.valueOf(size3);
                    o0oo00o5.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO5, strArr4));
                    ConstraintLayout constraintLayout3 = d5VarInflate2.f57725OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "roomBinding.root");
                    o0oo00o5.OooOOo(constraintLayout3);
                    o0oo00o5.OooOo0(new o0O000O(this, j, userInfoModel, d5VarInflate2));
                    o0oo00o5.OooOO0o();
                    break;
                }
                break;
            case 5:
                com.yalla.yalla.ui.adapter.o000OO00 o000oo014 = null;
                ShareToFriendModel shareToFriendModel5 = this.f25740OooOoo;
                if (shareToFriendModel5 != null && (shareActivityModel = shareToFriendModel5.getShareActivityModel()) != null) {
                    a5 a5VarInflate = a5.inflate(getLayoutInflater());
                    o0OOo0O.OooOO0.OooO00o oooO00o6 = new o0OOo0O.OooOO0.OooO00o(a5VarInflate.f57478OooO00o.getContext());
                    oooO00o6.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                    String image1 = shareActivityModel.getImage1();
                    int iOooO00o5 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o6.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o5, iOooO00o5, image1);
                    oooO00o6.f43909OooO00o = 0;
                    oooO00o6.OooO0Oo(a5VarInflate.f57480OooO0OO);
                    a5VarInflate.f57481OooO0Oo.setText(shareActivityModel.getText1());
                    a5VarInflate.f57482OooO0o0.setText(shareActivityModel.getText2());
                    a5VarInflate.f57479OooO0O0.setFilters(new InputFilter[]{new p396o0Oo0O.OooOOOO()});
                    Intrinsics.checkNotNullExpressionValue(a5VarInflate, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    p157o00OoOO0.o0OO00O o0oo00o6 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o6.OooOoOO();
                    String strOooO0OO6 = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_xxx_friends);
                    String[] strArr5 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OO00 o000oo015 = this.f25739OooOoOO;
                    if (o000oo015 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000oo015 = null;
                    }
                    if (o000oo015.f27542OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OO00 o000oo016 = this.f25739OooOoOO;
                        if (o000oo016 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        } else {
                            o000oo014 = o000oo016;
                        }
                        size4 = o000oo014.f27544OooOOoo.size();
                    } else {
                        size4 = 1;
                    }
                    strArr5[0] = String.valueOf(size4);
                    o0oo00o6.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO6, strArr5));
                    ConstraintLayout constraintLayout4 = a5VarInflate.f57478OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "activityBinding.root");
                    o0oo00o6.OooOOo(constraintLayout4);
                    o0oo00o6.OooOo0(new o0oOO(this, j, shareActivityModel, a5VarInflate));
                    o0oo00o6.OooOO0o();
                    break;
                }
                break;
            case 6:
                ShareToFriendModel shareToFriendModel6 = this.f25740OooOoo;
                if (shareToFriendModel6 != null && (giveThemeModel = shareToFriendModel6.getGiveThemeModel()) != null) {
                    BaseActivityK.OooOo0o(this, null, 0L, 3);
                    OooOoOO().getRoomThemeGivenInfo(j, giveThemeModel.getShopId()).observe(this, new OooO0OO(new o00OOOOo(this, str2, j, str, giveThemeModel)));
                    break;
                }
                break;
            case 7:
                ShareToFriendModel shareToFriendModel7 = this.f25740OooOoo;
                if (shareToFriendModel7 != null && (eventModel = shareToFriendModel7.getEventModel()) != null) {
                    b5 b5VarInflate = b5.inflate(getLayoutInflater());
                    o0OOo0O.OooOO0.OooO00o oooO00o7 = new o0OOo0O.OooOO0.OooO00o(b5VarInflate.f57578OooO00o.getContext());
                    oooO00o7.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                    oooO00o7.OooO0o(6, 6, 0, 0);
                    oooO00o7.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(com.code.android.util.o0000O0.OooO00o(228), com.code.android.util.o0000O0.OooO00o(Constants.ERR_WATERMARK_READ), eventModel.getEventImage());
                    oooO00o7.f43909OooO00o = 0;
                    oooO00o7.OooO0Oo(b5VarInflate.f57579OooO0O0);
                    b5VarInflate.f57584OooO0oO.setText(eventModel.getEventName());
                    b5VarInflate.f57583OooO0o0.setText(eventModel.getRoomName());
                    b5VarInflate.f57581OooO0Oo.setText(String.valueOf(eventModel.getRoomIdx()));
                    int eventState = eventModel.getEventState();
                    int deleted = EventModel.State.INSTANCE.getDeleted();
                    ImageView imageView = b5VarInflate.f57580OooO0OO;
                    AppCompatTextView appCompatTextView = b5VarInflate.f57582OooO0o;
                    if (eventState != deleted) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long eventStartTime = eventModel.getEventStartTime();
                        if (String.valueOf(eventStartTime).length() == 10) {
                            eventStartTime *= (long) 1000;
                        }
                        if (jCurrentTimeMillis > eventStartTime) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long eventEndTime = eventModel.getEventEndTime();
                            if (String.valueOf(eventEndTime).length() == 10) {
                                eventEndTime *= (long) 1000;
                            }
                            if (jCurrentTimeMillis2 < eventEndTime) {
                                appCompatTextView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Live_Now));
                                appCompatTextView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_FFA21F));
                                imageView.setImageResource(oOo00OO0.ic_explore_event_live);
                                imageView.setImageTintList(null);
                            }
                            Intrinsics.checkNotNullExpressionValue(b5VarInflate, "inflate(layoutInflater).…)\n            }\n        }");
                            p157o00OoOO0.o0OO00O o0oo00o7 = new p157o00OoOO0.o0OO00O(this);
                            o0oo00o7.OooOoOO();
                            String strOooO0OO7 = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_xxx_friends);
                            String[] strArr6 = new String[1];
                            o000oo01 = this.f25739OooOoOO;
                            if (o000oo01 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                                o000oo01 = null;
                            }
                            if (o000oo01.f27542OooOOo) {
                                o000oo02 = this.f25739OooOoOO;
                                if (o000oo02 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                                    o000oo02 = null;
                                }
                                size5 = o000oo02.f27544OooOOoo.size();
                            } else {
                                size5 = 1;
                            }
                            strArr6[0] = String.valueOf(size5);
                            o0oo00o7.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO7, strArr6));
                            ConstraintLayout constraintLayout5 = b5VarInflate.f57578OooO00o;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "eventBinding.root");
                            o0oo00o7.OooOOo(constraintLayout5);
                            o0oo00o7.OooOo0(new oo0O(this, j, eventModel, o0oo00o7));
                            o0oo00o7.OooOO0o();
                        }
                        break;
                    }
                    appCompatTextView.setText(p601o0oo0O0.o0000oo.OooO0o(eventModel.getEventStartTime()));
                    int i3 = oO00O0o.color_white_60;
                    appCompatTextView.setTextColor(com.code.android.util.o0000.OooO00o(i3));
                    imageView.setImageResource(oOo00OO0.ic_explore_event_time);
                    imageView.setImageTintList(ColorStateList.valueOf(com.code.android.util.o0000.OooO00o(i3)));
                    Intrinsics.checkNotNullExpressionValue(b5VarInflate, "inflate(layoutInflater).…)\n            }\n        }");
                    p157o00OoOO0.o0OO00O o0oo00o8 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o8.OooOoOO();
                    String strOooO0OO8 = com.code.android.util.o0000.OooO0OO(oO00OOo0.share_xxx_friends);
                    String[] strArr7 = new String[1];
                    o000oo01 = this.f25739OooOoOO;
                    if (o000oo01 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000oo01 = null;
                    }
                    if (o000oo01.f27542OooOOo) {
                        o000oo02 = this.f25739OooOoOO;
                        if (o000oo02 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o000oo02 = null;
                        }
                        size5 = o000oo02.f27544OooOOoo.size();
                    } else {
                        size5 = 1;
                    }
                    strArr7[0] = String.valueOf(size5);
                    o0oo00o8.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO8, strArr7));
                    ConstraintLayout constraintLayout6 = b5VarInflate.f57578OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout6, "eventBinding.root");
                    o0oo00o8.OooOOo(constraintLayout6);
                    o0oo00o8.OooOo0(new oo0O(this, j, eventModel, o0oo00o8));
                    o0oo00o8.OooOO0o();
                    break;
                }
                break;
        }
    }

    public final void OooOoo0(String searchText) {
        Job job = this.f25744Oooo000;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = this.f25737OooOoO;
        if (o000oo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000oo01 = null;
        }
        o000oo01.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        o000oo01.f27545OooOo00 = searchText;
        com.yalla.yalla.ui.adapter.o000OOo0.OooO00o oooO00o = com.yalla.yalla.ui.adapter.o000OOo0.f27549OooO00o;
        oooO00o.f27550OooO00o = !StringsKt.isBlank(searchText);
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = this.f25739OooOoOO;
        if (o000oo02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000oo02 = null;
        }
        o000oo02.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        o000oo02.f27545OooOo00 = searchText;
        oooO00o.f27550OooO00o = true ^ StringsKt.isBlank(searchText);
        this.f25744Oooo000 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0o(searchText, this, null), 3, null);
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
        setContentView(OooOoO().f59144OooO00o);
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = null;
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("SHARE_MODEL");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.share.ShareToFriendModel");
            ShareToFriendModel shareToFriendModel = (ShareToFriendModel) serializableExtra;
            this.f25740OooOoo = shareToFriendModel;
            this.f25742OooOooO = shareToFriendModel != null ? shareToFriendModel.getType() : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        OooOOoo(oO00OOo0.Contacts);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setNavigationOnClickListener(new o00O0OO(this));
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        TextView textViewOooOoO = headerLayout2 != null ? headerLayout2.OooOoO(com.code.android.util.o0000.OooO0OO(oO00OOo0.multiple), new o00O0OOO(this)) : null;
        this.f25736OooOo0o = textViewOooOoO;
        if (this.f25742OooOooO == ShareContentType.Theme) {
            if (textViewOooOoO != null) {
                com.code.android.util.o000OO00.OooO0O0(textViewOooOoO);
            }
        } else if (textViewOooOoO != null) {
            com.code.android.util.o000OO00.OooOOOO(textViewOooOoO);
        }
        OooOoO().f59146OooO0OO.setEmptyImage(oOo00OO0.ic_empty_friends);
        OooOoO().f59146OooO0OO.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.No_friends));
        OooOoO().f59145OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o00O0O0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = ShareToFriendsActivity.f25730Oooo00o;
                ShareToFriendsActivity activity = this.f25883OooO0Oo;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
                return false;
            }
        });
        n5 n5VarInflate = n5.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(n5VarInflate, "inflate(layoutInflater)");
        this.f25733OooOo0 = n5VarInflate;
        if (n5VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
            n5VarInflate = null;
        }
        n5VarInflate.f58452OooO0O0.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Recent_contacts));
        n5 n5Var = this.f25733OooOo0;
        if (n5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
            n5Var = null;
        }
        FrameLayout frameLayout = n5Var.f58451OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "recentFriendBinding.root");
        p400o0Oo0OO.OooOOOO oooOOOO = new p400o0Oo0OO.OooOOOO(frameLayout);
        this.f25738OooOoO0 = oooOOOO;
        ConcatAdapter concatAdapter = this.f25732OooOo;
        concatAdapter.OooO0O0(oooOOOO);
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = new com.yalla.yalla.ui.adapter.o000OO00(this);
        this.f25737OooOoO = o000oo02;
        concatAdapter.OooO0O0(o000oo02);
        n5 n5VarInflate2 = n5.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(n5VarInflate2, "inflate(layoutInflater)");
        this.f25735OooOo0O = n5VarInflate2;
        if (n5VarInflate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
            n5VarInflate2 = null;
        }
        n5VarInflate2.f58452OooO0O0.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.All_users));
        n5 n5Var2 = this.f25735OooOo0O;
        if (n5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
            n5Var2 = null;
        }
        FrameLayout frameLayout2 = n5Var2.f58451OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "allFriendBinding.root");
        concatAdapter.OooO0O0(new p400o0Oo0OO.OooOOOO(frameLayout2));
        com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = new com.yalla.yalla.ui.adapter.o000OO00(this);
        this.f25739OooOoOO = o000oo03;
        concatAdapter.OooO0O0(o000oo03);
        OooOoO().f59145OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO().f59145OooO0O0.setAdapter(concatAdapter);
        RecyclerView recyclerView = OooOoO().f59145OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvShareToFriends");
        oOO0OOO.OooO00o(recyclerView);
        m5 m5VarInflate = m5.inflate(getLayoutInflater(), OooOoO().f59145OooO0O0, false);
        Intrinsics.checkNotNullExpressionValue(m5VarInflate, "inflate(\n            lay…          false\n        )");
        this.f25734OooOo00 = m5VarInflate;
        if (m5VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            m5VarInflate = null;
        }
        View view = m5VarInflate.f58407OooO0O0.f30648OooO0o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLine");
            view = null;
        }
        view.setVisibility(0);
        m5 m5Var = this.f25734OooOo00;
        if (m5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            m5Var = null;
        }
        SearchView searchView = m5Var.f58406OooO00o;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchBinding.root");
        concatAdapter.OooO00o(0, new p400o0Oo0OO.OooOOOO(searchView));
        m5 m5Var2 = this.f25734OooOo00;
        if (m5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            m5Var2 = null;
        }
        m5Var2.f58407OooO0O0.setSearchTextChangedListener(new oo0oOO0(this));
        com.yalla.yalla.ui.adapter.o000OO00 o000oo04 = this.f25737OooOoO;
        if (o000oo04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000oo04 = null;
        }
        o00OO000 listener = new o00OO000(this);
        o000oo04.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oo04.f44446OooOO0O = listener;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo05 = this.f25739OooOoOO;
        if (o000oo05 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000oo05 = null;
        }
        o00OO0O0 listener2 = new o00OO0O0(this);
        o000oo05.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o000oo05.f44446OooOO0O = listener2;
        OooOoo0("");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o00O0O0O(this, null), 3, null);
        com.yalla.yalla.ui.adapter.o000OO00 o000oo06 = this.f25737OooOoO;
        if (o000oo06 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000oo06 = null;
        }
        o000oo06.OooO0o0(new o00O0OO0(this));
        com.yalla.yalla.ui.adapter.o000OO00 o000oo07 = this.f25739OooOoOO;
        if (o000oo07 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            o000oo01 = o000oo07;
        }
        o000oo01.OooO0o0(new oo0o0O0(this));
        ShareContentType shareContentType = this.f25742OooOooO;
        if (shareContentType == ShareContentType.Moment || shareContentType == ShareContentType.Topic) {
            ((BaseMomentDetailVM) this.f25745Oooo00O.getValue()).statisticalTime();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ShareContentType shareContentType = this.f25742OooOooO;
        if (shareContentType == ShareContentType.Moment || shareContentType == ShareContentType.Topic) {
            ((BaseMomentDetailVM) this.f25745Oooo00O.getValue()).statisticalTime();
        }
    }
}
