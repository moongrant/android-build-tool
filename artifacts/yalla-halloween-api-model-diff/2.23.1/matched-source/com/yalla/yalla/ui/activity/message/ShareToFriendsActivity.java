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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.oO0;
import p407o0Oo0OOO.oO0O000;
import p407o0Oo0OOO.oO0O000o;
import p407o0Oo0OOO.oO0O0Oo0;
import p407o0Oo0OOO.oOo0000O;
import p407o0Oo0OOO.oOo000o0;
import p407o0Oo0OOO.oOo00o0o;
import p407o0Oo0OOO.oOo0oooO;
import p587o0oOooO.oOO0O0O;
import p646o0ooOOOO.r0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/ShareToFriendsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShareToFriendsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareToFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/ShareToFriendsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,906:1\n22#2,2:907\n75#3,13:909\n75#3,13:922\n1864#4,3:935\n*S KotlinDebug\n*F\n+ 1 ShareToFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/ShareToFriendsActivity\n*L\n78#1:907,2\n94#1:909,13\n96#1:922,13\n535#1:935,3\n*E\n"})
public final class ShareToFriendsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ int f25276Oooo00o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oO0O0Oo0 f25279OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public oOo0oooO f25280OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public oO0O0Oo0 f25281OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public TextView f25282OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.o000OOo0 f25283OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public r0 f25284OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.o000OOo0 f25285OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public ShareToFriendModel f25286OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public ShareContentType f25288OooOooO;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public Job f25290Oooo000;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f25277OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oOo00o0o.class), this, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f25278OooOo = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f25287OooOoo0 = new ArrayList();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25289OooOooo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareToFriendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25304OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25304OooO0Oo;
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
    public final ViewModelLazy f25291Oooo00O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$5
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
        public final /* synthetic */ Function0 f25308OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25308OooO0Oo;
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
        public final /* synthetic */ Function1 f25292OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25292OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25292OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25292OooO0Oo;
        }

        public final int hashCode() {
            return this.f25292OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25292OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1", f = "ShareToFriendsActivity.kt", i = {}, l = {163, 171}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25293OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ShareToFriendsActivity f25294OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f25295OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1$1", f = "ShareToFriendsActivity.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25296OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ ShareToFriendsActivity f25297OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25298OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25297OooO0o = shareToFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f25297OooO0o, continuation);
                oooO00o.f25298OooO0o0 = obj;
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
                int i = this.f25296OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25298OooO0o0;
                    ShareToFriendsActivity shareToFriendsActivity = this.f25297OooO0o;
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = shareToFriendsActivity.f25283OooOoO;
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = null;
                    if (o000ooo1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        o000ooo1 = null;
                    }
                    if (o000ooo1.getItemCount() > 0) {
                        r0 r0Var = shareToFriendsActivity.f25284OooOoO0;
                        if (r0Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                            r0Var = null;
                        }
                        ConcatAdapter concatAdapter = shareToFriendsActivity.f25278OooOo;
                        concatAdapter.OooO00o(1, r0Var);
                        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = shareToFriendsActivity.f25283OooOoO;
                        if (o000ooo3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                            o000ooo3 = null;
                        }
                        concatAdapter.OooO00o(2, o000ooo3);
                    }
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo4 = shareToFriendsActivity.f25285OooOoOO;
                    if (o000ooo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o000ooo2 = o000ooo4;
                    }
                    this.f25296OooO0Oo = 1;
                    if (o000ooo2.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
            public int f25299OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ ShareToFriendsActivity f25300OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f25301OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f25300OooO0o = shareToFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f25300OooO0o, continuation);
                oooO0O0.f25301OooO0o0 = obj;
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
                int i = this.f25299OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25301OooO0o0;
                    ShareToFriendsActivity shareToFriendsActivity = this.f25300OooO0o;
                    ConcatAdapter concatAdapter = shareToFriendsActivity.f25278OooOo;
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = shareToFriendsActivity.f25283OooOoO;
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = null;
                    if (o000ooo1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        o000ooo1 = null;
                    }
                    concatAdapter.OooO0Oo(o000ooo1);
                    r0 r0Var = shareToFriendsActivity.f25284OooOoO0;
                    if (r0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                        r0Var = null;
                    }
                    shareToFriendsActivity.f25278OooOo.OooO0Oo(r0Var);
                    oO0O0Oo0 oo0o0oo0 = shareToFriendsActivity.f25281OooOo0O;
                    if (oo0o0oo0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                        oo0o0oo0 = null;
                    }
                    TextView tvTitle = oo0o0oo0.f44892OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                    com.code.android.util.o000O.OooO0O0(tvTitle);
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = shareToFriendsActivity.f25285OooOoOO;
                    if (o000ooo3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o000ooo2 = o000ooo3;
                    }
                    this.f25299OooO0Oo = 1;
                    if (o000ooo2.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
            this.f25295OooO0o0 = str;
            this.f25294OooO0o = shareToFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f25295OooO0o0, this.f25294OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25293OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f25295OooO0o0;
                boolean zIsBlank = StringsKt.isBlank(str);
                ShareToFriendsActivity shareToFriendsActivity = this.f25294OooO0o;
                if (zIsBlank) {
                    int i2 = ShareToFriendsActivity.f25276Oooo00o;
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> allFriends = shareToFriendsActivity.OooOoOO().getAllFriends();
                    OooO00o oooO00o = new OooO00o(shareToFriendsActivity, null);
                    this.f25293OooO0Oo = 1;
                    if (FlowKt.collectLatest(allFriends, oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    int i3 = ShareToFriendsActivity.f25276Oooo00o;
                    Flow<androidx.paging.o0OOO0o<FriendInfo>> searchFriends = shareToFriendsActivity.OooOoOO().getSearchFriends(str);
                    OooO0O0 oooO0O0 = new OooO0O0(shareToFriendsActivity, null);
                    this.f25293OooO0Oo = 2;
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
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = shareToFriendsActivity.f25285OooOoOO;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = null;
        if (o000ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo1 = null;
        }
        if (!o000ooo1.f27085OooOOo) {
            HeaderLayout headerLayout = shareToFriendsActivity.f22289OooOO0;
            if (headerLayout != null) {
                headerLayout.setNavigationIcon(p565o0oOo000.o0OOO0o.btn_return);
            }
            TextView textView = shareToFriendsActivity.f25282OooOo0o;
            if (textView != null) {
                textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.multiple));
            }
            TextView textView2 = shareToFriendsActivity.f25282OooOo0o;
            if (textView2 != null) {
                textView2.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.white));
            }
            TextView textView3 = shareToFriendsActivity.f25282OooOo0o;
            if (textView3 == null) {
                return;
            }
            textView3.setClickable(true);
            return;
        }
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = shareToFriendsActivity.f25285OooOoOO;
        if (o000ooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            o000ooo2 = o000ooo3;
        }
        int size = o000ooo2.f27087OooOOoo.size();
        TextView textView4 = shareToFriendsActivity.f25282OooOo0o;
        if (textView4 != null) {
            textView4.setText(size > 0 ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_number), String.valueOf(size)) : com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share));
        }
        TextView textView5 = shareToFriendsActivity.f25282OooOo0o;
        if (textView5 != null) {
            textView5.setTextColor(com.code.android.util.o0000.OooO00o(size > 0 ? p565o0oOo000.o0ooOOo.white : p565o0oOo000.o0ooOOo.color_FFFFFFF_70));
        }
        TextView textView6 = shareToFriendsActivity.f25282OooOo0o;
        if (textView6 == null) {
            return;
        }
        textView6.setClickable(size > 0);
    }

    public static final void OooOoO0(ShareToFriendsActivity shareToFriendsActivity, boolean z) {
        boolean z2 = true;
        if (!z) {
            shareToFriendsActivity.getClass();
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_most_7_member);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        oOo0oooO ooo0oooo = shareToFriendsActivity.f25280OooOo00;
        oOo0oooO ooo0oooo2 = null;
        if (ooo0oooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ooo0oooo = null;
        }
        if (ooo0oooo.f45268OooO0O0.getSearchText().length() > 0) {
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Selected);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z2 = false;
            }
            if (!z2) {
                com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o2);
                }
            }
            oOo0oooO ooo0oooo3 = shareToFriendsActivity.f25280OooOo00;
            if (ooo0oooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                ooo0oooo3 = null;
            }
            ooo0oooo3.f45268OooO0O0.getEditSearch().setText((CharSequence) null);
            oOo0oooO ooo0oooo4 = shareToFriendsActivity.f25280OooOo00;
            if (ooo0oooo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                ooo0oooo4 = null;
            }
            ooo0oooo4.f45268OooO0O0.getEditSearch().clearFocus();
            oOo0oooO ooo0oooo5 = shareToFriendsActivity.f25280OooOo00;
            if (ooo0oooo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            } else {
                ooo0oooo2 = ooo0oooo5;
            }
            EditText editSearch = ooo0oooo2.f45268OooO0O0.getEditSearch();
            p373o0OOo0oO.o00Oo0.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), p373o0OOo0oO.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editSearch.getWindowToken(), 0);
        }
    }

    public final oOo00o0o OooOoO() {
        return (oOo00o0o) this.f25277OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ShareToFriendVM OooOoOO() {
        return (ShareToFriendVM) this.f25289OooOooo.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:130:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:132:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x052e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0547  */
    /* JADX WARN: Code duplicated, block: B:157:0x054d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0552  */
    /* JADX WARN: Code duplicated, block: B:161:0x0559  */
    /* JADX WARN: Code duplicated, block: B:163:0x0581  */
    /* JADX WARN: Code duplicated, block: B:164:0x0583  */
    /* JADX WARN: Code duplicated, block: B:166:0x0586  */
    /* JADX WARN: Code duplicated, block: B:171:0x0599  */
    /* JADX WARN: Code duplicated, block: B:174:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:177:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:179:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:182:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:185:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:186:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:188:0x0602  */
    /* JADX WARN: Code duplicated, block: B:190:0x060c  */
    /* JADX WARN: Code duplicated, block: B:191:0x060e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0611  */
    /* JADX WARN: Code duplicated, block: B:200:0x0639  */
    /* JADX WARN: Code duplicated, block: B:201:0x0640  */
    /* JADX WARN: Code duplicated, block: B:203:0x0648  */
    /* JADX WARN: Code duplicated, block: B:204:0x064f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0657  */
    /* JADX WARN: Code duplicated, block: B:207:0x065e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0697  */
    /* JADX WARN: Code duplicated, block: B:214:0x069f  */
    /* JADX WARN: Code duplicated, block: B:216:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:218:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:233:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [T] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v43, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v45, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v54, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v58, types: [T, java.lang.String] */
    public final void OooOoo(long j, String str, String str2) {
        MomentDetailModel postDetailModel;
        ShareToFriendModel shareToFriendModel;
        MomentAdapterTag momentAdapterTag;
        MomentForwardContent momentForwardContent;
        MomentPoll value;
        MomentForwardContent forwardContent;
        int type;
        MomentType momentType;
        oO0 oo0Inflate;
        TextView textView;
        MomentSendContentModel content;
        LinearLayout linearLayout;
        CharSequence text;
        boolean z;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1;
        int size;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2;
        boolean z2;
        int type2;
        String strOooO00o;
        MomentSendContentModel content2;
        String content3;
        TextView textView2;
        CharSequence text2;
        boolean z3;
        MomentSendContentModel content4;
        ?? r0;
        MomentSendContentModel content5;
        Iterator it;
        int i;
        String content6;
        boolean z4;
        int shareType;
        TopicInfoModel topicInfoModel;
        int size2;
        UserInfoModel userInfoModel;
        int size3;
        ShareActivityModel shareActivityModel;
        int size4;
        GiveThemeModel giveThemeModel;
        EventModel eventModel;
        int size5;
        ShareContentType shareContentType = this.f25288OooOooO;
        switch (shareContentType == null ? -1 : OooO0O0.$EnumSwitchMapping$0[shareContentType.ordinal()]) {
            case 1:
                oO0O000 oo0o000Inflate = oO0O000.inflate(getLayoutInflater());
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(oo0o000Inflate.f44852OooO00o.getContext());
                oooO00o.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0o0());
                oooO00o.OooO0o0(6);
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o2 = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
                String value2 = oooO00o2.OooO00o().f24544OooO00o.getValue();
                int iOooO00o = com.code.android.util.o0000O0.OooO00o(60);
                oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, value2);
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(oo0o000Inflate.f44854OooO0OO);
                oo0o000Inflate.f44856OooO0o0.setText(oooO00o2.OooO00o().f24545OooO0O0.getValue());
                oo0o000Inflate.f44855OooO0Oo.setText(p595o0oo0.OooOo00.OooO0oO("ID:", String.valueOf(oooO00o2.OooO00o().f24546OooO0OO.getValue())));
                int size6 = 1;
                oo0o000Inflate.f44853OooO0O0.setFilters(new InputFilter[]{new p405o0Oo0OO.OooO0o(), new InputFilter.LengthFilter(300)});
                Intrinsics.checkNotNullExpressionValue(oo0o000Inflate, "apply(...)");
                p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this);
                o000o.OooOoOO();
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_xxx_friends);
                String[] strArr = new String[1];
                com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = this.f25285OooOoOO;
                if (o000ooo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    o000ooo3 = null;
                }
                if (o000ooo3.f27085OooOOo) {
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo4 = this.f25285OooOoOO;
                    if (o000ooo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000ooo4 = null;
                    }
                    size6 = o000ooo4.f27087OooOOoo.size();
                }
                strArr[0] = String.valueOf(size6);
                o000o.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
                ConstraintLayout constraintLayout = oo0o000Inflate.f44852OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                o000o.OooOOo(constraintLayout);
                o000o.OooOo0(new o0O0o(this, j, oo0o000Inflate));
                o000o.OooOO0o();
                break;
            case 2:
                ShareToFriendModel shareToFriendModel2 = this.f25286OooOoo;
                if (shareToFriendModel2 != null && (postDetailModel = shareToFriendModel2.getPostDetailModel()) != null && (shareToFriendModel = this.f25286OooOoo) != null && (momentAdapterTag = shareToFriendModel.getMomentAdapterTag()) != null) {
                    long id = postDetailModel.getId();
                    MomentSendContentModel content7 = postDetailModel.getContent();
                    String content8 = content7 != null ? content7.getContent() : null;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = "";
                    if (!postDetailModel.getImageInfoList().isEmpty()) {
                        objectRef2.element = postDetailModel.getImageInfoList().get(0).getUrl();
                    }
                    MomentForwardContent forwardContent2 = postDetailModel.getForwardContent();
                    int type3 = postDetailModel.getType();
                    if (type3 == MomentType.Forward.getValue()) {
                        MomentDetailModel forward = postDetailModel.getForward();
                        if (forward != null) {
                            momentForwardContent = forwardContent2;
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
                            if (forwardContent != null) {
                                if (((CharSequence) objectRef2.element).length() == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 && ((shareType = forwardContent.getShareType()) == 1 || shareType == 2 || shareType == 3 || shareType == 4 || shareType == 20)) {
                                    objectRef2.element = forwardContent.getImage();
                                }
                            }
                            type = postDetailModel.getType();
                            momentType = MomentType.Video;
                            if (type == momentType.getValue()) {
                                objectRef2.element = postDetailModel.getCoverPic();
                            }
                            oo0Inflate = oO0.inflate(getLayoutInflater());
                            o0OOo0Oo.Oooo000.OooO00o oooO00o3 = new o0OOo0Oo.Oooo000.OooO00o(oo0Inflate.f44723OooO00o.getContext());
                            oooO00o3.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0o0());
                            oooO00o3.f43139OooOOOo = p565o0oOo000.o0OOO0o.icon_head_default;
                            oooO00o3.OooO0o0(6);
                            String str3 = (String) objectRef2.element;
                            int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(60);
                            oooO00o3.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o2, iOooO00o2, str3);
                            oooO00o3.f43125OooO00o = 0;
                            oooO00o3.OooO0Oo(oo0Inflate.f44725OooO0OO);
                            if (postDetailModel.getType() == momentType.getValue()) {
                                ImageView ivVideo = oo0Inflate.f44727OooO0o0;
                                Intrinsics.checkNotNullExpressionValue(ivVideo, "ivVideo");
                                com.code.android.util.o000O.OooOOOO(ivVideo);
                            }
                            textView = oo0Inflate.f44726OooO0Oo;
                            textView.setText(content8);
                            content = postDetailModel.getContent();
                            linearLayout = oo0Inflate.f44723OooO00o;
                            if (content == null) {
                                content2 = postDetailModel.getContent();
                                if (content2 != null) {
                                    content3 = content2.getContent();
                                } else {
                                    content3 = null;
                                }
                                if (!TextUtils.isEmpty(content3)) {
                                    textView2 = new TextView(linearLayout.getContext());
                                    p600o0oo00Oo.o0000O00.OooO00o(linearLayout.getContext(), postDetailModel.getContent(), textView2, p565o0oOo000.o0ooOOo.color_6D6D6D, null);
                                    text2 = textView2.getText();
                                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                                    if (text2.length() > 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        textView.setText(textView2.getText());
                                    }
                                    content4 = postDetailModel.getContent();
                                    if (content4 != null || (content6 = content4.getContent()) == null) {
                                        r0 = content6;
                                        r0 = "";
                                    }
                                    r0 = content6;
                                    content5 = postDetailModel.getContent();
                                    if (content5 != null) {
                                        it = content5.getAt().iterator();
                                        i = 0;
                                        r0 = r0;
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            int i2 = i + 1;
                                            if (i < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            Iterator it2 = it;
                                            String strReplace$default = StringsKt__StringsJVMKt.replace$default((String) r0, OooO0OO.OooO00o.OooO00o("@{", i, "}"), "@" + ((MomentSendContentAtModel) next).getName(), false, 4, (Object) null);
                                            it = it2;
                                            i = i2;
                                            r0 = strReplace$default;
                                        }
                                    }
                                    objectRef.element = r0;
                                    textView.setMaxLines(2);
                                }
                            }
                            text = textView.getText();
                            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                            if (text.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (((CharSequence) objectRef2.element).length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_post_content));
                                }
                                if (forwardContent != null && forwardContent.getShareType() == 20) {
                                    textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.event_share_moment));
                                }
                                type2 = postDetailModel.getType();
                                if (type2 == MomentType.Image.getValue()) {
                                    strOooO00o = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo._photo_);
                                } else if (type2 == MomentType.Video.getValue()) {
                                    strOooO00o = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo._Video_);
                                } else if (type2 == MomentType.Poll.getValue()) {
                                    strOooO00o = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo._Poll_);
                                } else {
                                    strOooO00o = p004OooO0oO.o000oOoO.OooO00o("[", com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Other), "]");
                                }
                                textView.setText(strOooO00o);
                            }
                            oo0Inflate.f44724OooO0O0.setFilters(new InputFilter[]{new p405o0Oo0OO.OooO0o()});
                            Intrinsics.checkNotNullExpressionValue(oo0Inflate, "apply(...)");
                            p205o00o0o0o.o000O o000o2 = new p205o00o0o0o.o000O(this);
                            o000o2.OooOoOO();
                            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_xxx_friends);
                            String[] strArr2 = new String[1];
                            o000ooo1 = this.f25285OooOoOO;
                            if (o000ooo1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                                o000ooo1 = null;
                            }
                            if (o000ooo1.f27085OooOOo) {
                                o000ooo2 = this.f25285OooOoOO;
                                if (o000ooo2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                                    o000ooo2 = null;
                                }
                                size = o000ooo2.f27087OooOOoo.size();
                            } else {
                                size = 1;
                            }
                            strArr2[0] = String.valueOf(size);
                            o000o2.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO2, strArr2));
                            Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
                            o000o2.OooOOo(linearLayout);
                            o000o2.OooOo0(new oo00oO(this, momentAdapterTag, j, postDetailModel, id, objectRef2, objectRef, oo0Inflate));
                            o000o2.OooOO0o();
                        } else {
                            momentForwardContent = forwardContent2;
                        }
                    } else {
                        momentForwardContent = forwardContent2;
                        if (type3 == MomentType.Poll.getValue() && (value = postDetailModel.getMomentPollLiveData().getValue()) != null) {
                            objectRef2.element = value.getShareDefaultImg();
                        }
                    }
                    forwardContent = momentForwardContent;
                    if (forwardContent != null) {
                        if (((CharSequence) objectRef2.element).length() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            objectRef2.element = forwardContent.getImage();
                        }
                    }
                    type = postDetailModel.getType();
                    momentType = MomentType.Video;
                    if (type == momentType.getValue()) {
                        objectRef2.element = postDetailModel.getCoverPic();
                    }
                    oo0Inflate = oO0.inflate(getLayoutInflater());
                    o0OOo0Oo.Oooo000.OooO00o oooO00o4 = new o0OOo0Oo.Oooo000.OooO00o(oo0Inflate.f44723OooO00o.getContext());
                    oooO00o4.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0o0());
                    oooO00o4.f43139OooOOOo = p565o0oOo000.o0OOO0o.icon_head_default;
                    oooO00o4.OooO0o0(6);
                    String str4 = (String) objectRef2.element;
                    int iOooO00o3 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o4.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o3, iOooO00o3, str4);
                    oooO00o4.f43125OooO00o = 0;
                    oooO00o4.OooO0Oo(oo0Inflate.f44725OooO0OO);
                    if (postDetailModel.getType() == momentType.getValue()) {
                        ImageView ivVideo2 = oo0Inflate.f44727OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(ivVideo2, "ivVideo");
                        com.code.android.util.o000O.OooOOOO(ivVideo2);
                    }
                    textView = oo0Inflate.f44726OooO0Oo;
                    textView.setText(content8);
                    content = postDetailModel.getContent();
                    linearLayout = oo0Inflate.f44723OooO00o;
                    if (content == null) {
                        content2 = postDetailModel.getContent();
                        if (content2 != null) {
                            content3 = content2.getContent();
                        } else {
                            content3 = null;
                        }
                        if (!TextUtils.isEmpty(content3)) {
                            textView2 = new TextView(linearLayout.getContext());
                            p600o0oo00Oo.o0000O00.OooO00o(linearLayout.getContext(), postDetailModel.getContent(), textView2, p565o0oOo000.o0ooOOo.color_6D6D6D, null);
                            text2 = textView2.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            if (text2.length() > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                textView.setText(textView2.getText());
                            }
                            content4 = postDetailModel.getContent();
                            if (content4 != null) {
                                r0 = content6;
                                r0 = "";
                            } else {
                                r0 = content6;
                                r0 = "";
                            }
                            r0 = content6;
                            content5 = postDetailModel.getContent();
                            if (content5 != null) {
                                it = content5.getAt().iterator();
                                i = 0;
                                r0 = r0;
                                while (it.hasNext()) {
                                    Object next2 = it.next();
                                    int i3 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    Iterator it3 = it;
                                    String strReplace$default2 = StringsKt__StringsJVMKt.replace$default((String) r0, OooO0OO.OooO00o.OooO00o("@{", i, "}"), "@" + ((MomentSendContentAtModel) next2).getName(), false, 4, (Object) null);
                                    it = it3;
                                    i = i3;
                                    r0 = strReplace$default2;
                                }
                            }
                            objectRef.element = r0;
                            textView.setMaxLines(2);
                        }
                    }
                    text = textView.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    if (text.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (((CharSequence) objectRef2.element).length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_post_content));
                        }
                        if (forwardContent != null) {
                            textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.event_share_moment));
                        }
                        type2 = postDetailModel.getType();
                        if (type2 == MomentType.Image.getValue()) {
                            strOooO00o = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo._photo_);
                        } else if (type2 == MomentType.Video.getValue()) {
                            strOooO00o = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo._Video_);
                        } else if (type2 == MomentType.Poll.getValue()) {
                            strOooO00o = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo._Poll_);
                        } else {
                            strOooO00o = p004OooO0oO.o000oOoO.OooO00o("[", com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Other), "]");
                        }
                        textView.setText(strOooO00o);
                    }
                    oo0Inflate.f44724OooO0O0.setFilters(new InputFilter[]{new p405o0Oo0OO.OooO0o()});
                    Intrinsics.checkNotNullExpressionValue(oo0Inflate, "apply(...)");
                    p205o00o0o0o.o000O o000o3 = new p205o00o0o0o.o000O(this);
                    o000o3.OooOoOO();
                    String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_xxx_friends);
                    String[] strArr3 = new String[1];
                    o000ooo1 = this.f25285OooOoOO;
                    if (o000ooo1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000ooo1 = null;
                    }
                    if (o000ooo1.f27085OooOOo) {
                        o000ooo2 = this.f25285OooOoOO;
                        if (o000ooo2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o000ooo2 = null;
                        }
                        size = o000ooo2.f27087OooOOoo.size();
                    } else {
                        size = 1;
                    }
                    strArr3[0] = String.valueOf(size);
                    o000o3.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO3, strArr3));
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
                    o000o3.OooOOo(linearLayout);
                    o000o3.OooOo0(new oo00oO(this, momentAdapterTag, j, postDetailModel, id, objectRef2, objectRef, oo0Inflate));
                    o000o3.OooOO0o();
                    break;
                }
                break;
            case 3:
                ShareToFriendModel shareToFriendModel3 = this.f25286OooOoo;
                if (shareToFriendModel3 != null && (topicInfoModel = shareToFriendModel3.getTopicInfoModel()) != null) {
                    oO0O000o oo0o000oInflate = oO0O000o.inflate(getLayoutInflater());
                    o0OOo0Oo.Oooo000.OooO00o oooO00o5 = new o0OOo0Oo.Oooo000.OooO00o(oo0o000oInflate.f44857OooO00o.getContext());
                    oooO00o5.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0o0());
                    oooO00o5.OooO0o0(6);
                    String image = topicInfoModel.getImage();
                    int iOooO00o4 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o5.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o4, iOooO00o4, image);
                    oooO00o5.f43125OooO00o = 0;
                    oooO00o5.OooO0Oo(oo0o000oInflate.f44859OooO0OO);
                    oo0o000oInflate.f44861OooO0o0.setText(topicInfoModel.getName());
                    oo0o000oInflate.f44860OooO0Oo.OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), -1);
                    oo0o000oInflate.f44858OooO0O0.setFilters(new InputFilter[]{new p405o0Oo0OO.OooO0o()});
                    Intrinsics.checkNotNullExpressionValue(oo0o000oInflate, "apply(...)");
                    p205o00o0o0o.o000O o000o4 = new p205o00o0o0o.o000O(this);
                    o000o4.OooOoOO();
                    String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_xxx_friends);
                    String[] strArr4 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo5 = this.f25285OooOoOO;
                    if (o000ooo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000ooo5 = null;
                    }
                    if (o000ooo5.f27085OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo6 = this.f25285OooOoOO;
                        if (o000ooo6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o000ooo6 = null;
                        }
                        size2 = o000ooo6.f27087OooOOoo.size();
                    } else {
                        size2 = 1;
                    }
                    strArr4[0] = String.valueOf(size2);
                    o000o4.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO4, strArr4));
                    ConstraintLayout constraintLayout2 = oo0o000oInflate.f44857OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                    o000o4.OooOOo(constraintLayout2);
                    o000o4.OooOo0(new o0O00000(this, j, topicInfoModel, oo0o000oInflate));
                    o000o4.OooOO0o();
                    break;
                }
                break;
            case 4:
                ShareToFriendModel shareToFriendModel4 = this.f25286OooOoo;
                if (shareToFriendModel4 != null && (userInfoModel = shareToFriendModel4.getUserInfoModel()) != null) {
                    oO0O000 oo0o000Inflate2 = oO0O000.inflate(getLayoutInflater());
                    o0OOo0Oo.Oooo000.OooO00o oooO00o6 = new o0OOo0Oo.Oooo000.OooO00o(oo0o000Inflate2.f44852OooO00o.getContext());
                    oooO00o6.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0OO());
                    String userHeader = userInfoModel.getUserHeader();
                    int iOooO00o5 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o6.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o5, iOooO00o5, userHeader);
                    oooO00o6.f43125OooO00o = 0;
                    oooO00o6.OooO0Oo(oo0o000Inflate2.f44854OooO0OO);
                    oo0o000Inflate2.f44856OooO0o0.setText(userInfoModel.getUserName());
                    oo0o000Inflate2.f44855OooO0Oo.setText(p595o0oo0.OooOo00.OooO0oO("ID:", userInfoModel.getUserIdx()));
                    oo0o000Inflate2.f44853OooO0O0.setFilters(new InputFilter[]{new p405o0Oo0OO.OooO0o()});
                    Intrinsics.checkNotNullExpressionValue(oo0o000Inflate2, "apply(...)");
                    p205o00o0o0o.o000O o000o5 = new p205o00o0o0o.o000O(this);
                    o000o5.OooOoOO();
                    String strOooO0OO5 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_xxx_friends);
                    String[] strArr5 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo7 = this.f25285OooOoOO;
                    if (o000ooo7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000ooo7 = null;
                    }
                    if (o000ooo7.f27085OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo8 = this.f25285OooOoOO;
                        if (o000ooo8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o000ooo8 = null;
                        }
                        size3 = o000ooo8.f27087OooOOoo.size();
                    } else {
                        size3 = 1;
                    }
                    strArr5[0] = String.valueOf(size3);
                    o000o5.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO5, strArr5));
                    ConstraintLayout constraintLayout3 = oo0o000Inflate2.f44852OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
                    o000o5.OooOOo(constraintLayout3);
                    o000o5.OooOo0(new o0O000(this, j, userInfoModel, oo0o000Inflate2));
                    o000o5.OooOO0o();
                    break;
                }
                break;
            case 5:
                ShareToFriendModel shareToFriendModel5 = this.f25286OooOoo;
                if (shareToFriendModel5 != null && (shareActivityModel = shareToFriendModel5.getShareActivityModel()) != null) {
                    oOo0000O ooo0000oInflate = oOo0000O.inflate(getLayoutInflater());
                    o0OOo0Oo.Oooo000.OooO00o oooO00o7 = new o0OOo0Oo.Oooo000.OooO00o(ooo0000oInflate.f45222OooO00o.getContext());
                    oooO00o7.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0Oo());
                    String image1 = shareActivityModel.getImage1();
                    int iOooO00o6 = com.code.android.util.o0000O0.OooO00o(60);
                    oooO00o7.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o6, iOooO00o6, image1);
                    oooO00o7.f43125OooO00o = 0;
                    oooO00o7.OooO0Oo(ooo0000oInflate.f45224OooO0OO);
                    ooo0000oInflate.f45225OooO0Oo.setText(shareActivityModel.getText1());
                    ooo0000oInflate.f45226OooO0o0.setText(shareActivityModel.getText2());
                    ooo0000oInflate.f45223OooO0O0.setFilters(new InputFilter[]{new p405o0Oo0OO.OooO0o()});
                    Intrinsics.checkNotNullExpressionValue(ooo0000oInflate, "apply(...)");
                    p205o00o0o0o.o000O o000o6 = new p205o00o0o0o.o000O(this);
                    o000o6.OooOoOO();
                    String strOooO0OO6 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_xxx_friends);
                    String[] strArr6 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo9 = this.f25285OooOoOO;
                    if (o000ooo9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000ooo9 = null;
                    }
                    if (o000ooo9.f27085OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo10 = this.f25285OooOoOO;
                        if (o000ooo10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o000ooo10 = null;
                        }
                        size4 = o000ooo10.f27087OooOOoo.size();
                    } else {
                        size4 = 1;
                    }
                    strArr6[0] = String.valueOf(size4);
                    o000o6.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO6, strArr6));
                    ConstraintLayout constraintLayout4 = ooo0000oInflate.f45222OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "getRoot(...)");
                    o000o6.OooOOo(constraintLayout4);
                    o000o6.OooOo0(new o00OOOOo(this, j, shareActivityModel, ooo0000oInflate));
                    o000o6.OooOO0o();
                    break;
                }
                break;
            case 6:
                ShareToFriendModel shareToFriendModel6 = this.f25286OooOoo;
                if (shareToFriendModel6 != null && (giveThemeModel = shareToFriendModel6.getGiveThemeModel()) != null) {
                    BaseActivityK.OooOo0o(this, null, 0L, 3);
                    OooOoOO().getRoomThemeGivenInfo(j, giveThemeModel.getShopId()).observe(this, new OooO0OO(new o0o0Oo(this, str2, j, str, giveThemeModel)));
                    break;
                }
                break;
            case 7:
                ShareToFriendModel shareToFriendModel7 = this.f25286OooOoo;
                if (shareToFriendModel7 != null && (eventModel = shareToFriendModel7.getEventModel()) != null) {
                    oOo000o0 ooo000o0Inflate = oOo000o0.inflate(getLayoutInflater());
                    o0OOo0Oo.Oooo000.OooO00o oooO00o8 = new o0OOo0Oo.Oooo000.OooO00o(ooo000o0Inflate.f45241OooO00o.getContext());
                    oooO00o8.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0Oo());
                    oooO00o8.OooO0o(6, 6, 0, 0);
                    oooO00o8.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(com.code.android.util.o0000O0.OooO00o(228), com.code.android.util.o0000O0.OooO00o(Constants.ERR_WATERMARK_READ), eventModel.getEventImage());
                    oooO00o8.f43125OooO00o = 0;
                    oooO00o8.OooO0Oo(ooo000o0Inflate.f45242OooO0O0);
                    ooo000o0Inflate.f45247OooO0oO.setText(eventModel.getEventName());
                    ooo000o0Inflate.f45246OooO0o0.setText(eventModel.getRoomName());
                    ooo000o0Inflate.f45244OooO0Oo.setText(String.valueOf(eventModel.getRoomIdx()));
                    int eventState = eventModel.getEventState();
                    int deleted = EventModel.State.INSTANCE.getDeleted();
                    ImageView imageView = ooo000o0Inflate.f45243OooO0OO;
                    AppCompatTextView appCompatTextView = ooo000o0Inflate.f45245OooO0o;
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
                                appCompatTextView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Event_Live_Now));
                                appCompatTextView.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_FFA21F));
                                imageView.setImageResource(p565o0oOo000.o0OOO0o.ic_explore_event_live);
                                imageView.setImageTintList(null);
                            } else {
                                appCompatTextView.setText(p606o0oo0O0.OooOOOO.OooO0o(eventModel.getEventStartTime()));
                                int i4 = p565o0oOo000.o0ooOOo.color_white_60;
                                appCompatTextView.setTextColor(com.code.android.util.o0000.OooO00o(i4));
                                imageView.setImageResource(p565o0oOo000.o0OOO0o.ic_explore_event_time);
                                imageView.setImageTintList(ColorStateList.valueOf(com.code.android.util.o0000.OooO00o(i4)));
                            }
                        } else {
                            appCompatTextView.setText(p606o0oo0O0.OooOOOO.OooO0o(eventModel.getEventStartTime()));
                            int i5 = p565o0oOo000.o0ooOOo.color_white_60;
                            appCompatTextView.setTextColor(com.code.android.util.o0000.OooO00o(i5));
                            imageView.setImageResource(p565o0oOo000.o0OOO0o.ic_explore_event_time);
                            imageView.setImageTintList(ColorStateList.valueOf(com.code.android.util.o0000.OooO00o(i5)));
                        }
                    } else {
                        appCompatTextView.setText(p606o0oo0O0.OooOOOO.OooO0o(eventModel.getEventStartTime()));
                        int i6 = p565o0oOo000.o0ooOOo.color_white_60;
                        appCompatTextView.setTextColor(com.code.android.util.o0000.OooO00o(i6));
                        imageView.setImageResource(p565o0oOo000.o0OOO0o.ic_explore_event_time);
                        imageView.setImageTintList(ColorStateList.valueOf(com.code.android.util.o0000.OooO00o(i6)));
                    }
                    Intrinsics.checkNotNullExpressionValue(ooo000o0Inflate, "apply(...)");
                    p205o00o0o0o.o000O o000o7 = new p205o00o0o0o.o000O(this);
                    o000o7.OooOoOO();
                    String strOooO0OO7 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.share_xxx_friends);
                    String[] strArr7 = new String[1];
                    com.yalla.yalla.ui.adapter.o000OOo0 o000ooo11 = this.f25285OooOoOO;
                    if (o000ooo11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o000ooo11 = null;
                    }
                    if (o000ooo11.f27085OooOOo) {
                        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo12 = this.f25285OooOoOO;
                        if (o000ooo12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o000ooo12 = null;
                        }
                        size5 = o000ooo12.f27087OooOOoo.size();
                    } else {
                        size5 = 1;
                    }
                    strArr7[0] = String.valueOf(size5);
                    o000o7.OooOoO(com.code.android.util.o0000O.OooO00o(strOooO0OO7, strArr7));
                    ConstraintLayout constraintLayout5 = ooo000o0Inflate.f45241OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout5, "getRoot(...)");
                    o000o7.OooOOo(constraintLayout5);
                    o000o7.OooOo0(new o00OO0OO(this, j, eventModel, o000o7));
                    o000o7.OooOO0o();
                    break;
                }
                break;
        }
    }

    public final void OooOoo0(String searchText) {
        Job job = this.f25290Oooo000;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = this.f25283OooOoO;
        if (o000ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000ooo1 = null;
        }
        o000ooo1.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        o000ooo1.f27088OooOo00 = searchText;
        com.yalla.yalla.ui.adapter.o00.OooO00o oooO00o = com.yalla.yalla.ui.adapter.o00.f26995OooO00o;
        oooO00o.f26996OooO00o = !StringsKt.isBlank(searchText);
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = this.f25285OooOoOO;
        if (o000ooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo2 = null;
        }
        o000ooo2.getClass();
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        o000ooo2.f27088OooOo00 = searchText;
        oooO00o.f26996OooO00o = true ^ StringsKt.isBlank(searchText);
        this.f25290Oooo000 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0o(searchText, this, null), 3, null);
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
        setContentView(OooOoO().f45258OooO00o);
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = null;
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("SHARE_MODEL");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.share.ShareToFriendModel");
            ShareToFriendModel shareToFriendModel = (ShareToFriendModel) serializableExtra;
            this.f25286OooOoo = shareToFriendModel;
            this.f25288OooOooO = shareToFriendModel != null ? shareToFriendModel.getType() : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        OooOOoo(p565o0oOo000.o000OOo.Contacts);
        HeaderLayout headerLayout = this.f22289OooOO0;
        if (headerLayout != null) {
            headerLayout.setNavigationOnClickListener(new oo0o0O0(this));
        }
        HeaderLayout headerLayout2 = this.f22289OooOO0;
        TextView textViewOooOoO = headerLayout2 != null ? headerLayout2.OooOoO(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.multiple), new o00O0OO(this)) : null;
        this.f25282OooOo0o = textViewOooOoO;
        if (this.f25288OooOooO == ShareContentType.Theme) {
            if (textViewOooOoO != null) {
                com.code.android.util.o000O.OooO0O0(textViewOooOoO);
            }
        } else if (textViewOooOoO != null) {
            com.code.android.util.o000O.OooOOOO(textViewOooOoO);
        }
        OooOoO().f45260OooO0OO.setEmptyImage(p565o0oOo000.o0OOO0o.ic_empty_friends);
        OooOoO().f45260OooO0OO.setEmptyText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.No_friends));
        OooOoO().f45259OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o00O0O00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = ShareToFriendsActivity.f25276Oooo00o;
                ShareToFriendsActivity activity = this.f25439OooO0Oo;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
                return false;
            }
        });
        oO0O0Oo0 oo0o0oo0Inflate = oO0O0Oo0.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(oo0o0oo0Inflate, "inflate(...)");
        this.f25279OooOo0 = oo0o0oo0Inflate;
        if (oo0o0oo0Inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
            oo0o0oo0Inflate = null;
        }
        oo0o0oo0Inflate.f44892OooO0O0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Recent_contacts));
        oO0O0Oo0 oo0o0oo0 = this.f25279OooOo0;
        if (oo0o0oo0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
            oo0o0oo0 = null;
        }
        FrameLayout frameLayout = oo0o0oo0.f44891OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        r0 r0Var = new r0(frameLayout);
        this.f25284OooOoO0 = r0Var;
        ConcatAdapter concatAdapter = this.f25278OooOo;
        concatAdapter.OooO0O0(r0Var);
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = new com.yalla.yalla.ui.adapter.o000OOo0(this);
        this.f25283OooOoO = o000ooo2;
        concatAdapter.OooO0O0(o000ooo2);
        oO0O0Oo0 oo0o0oo0Inflate2 = oO0O0Oo0.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(oo0o0oo0Inflate2, "inflate(...)");
        this.f25281OooOo0O = oo0o0oo0Inflate2;
        if (oo0o0oo0Inflate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
            oo0o0oo0Inflate2 = null;
        }
        oo0o0oo0Inflate2.f44892OooO0O0.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.All_users));
        oO0O0Oo0 oo0o0oo1 = this.f25281OooOo0O;
        if (oo0o0oo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
            oo0o0oo1 = null;
        }
        FrameLayout frameLayout2 = oo0o0oo1.f44891OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "getRoot(...)");
        concatAdapter.OooO0O0(new r0(frameLayout2));
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = new com.yalla.yalla.ui.adapter.o000OOo0(this);
        this.f25285OooOoOO = o000ooo3;
        concatAdapter.OooO0O0(o000ooo3);
        OooOoO().f45259OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoO().f45259OooO0O0.setAdapter(concatAdapter);
        RecyclerView rvShareToFriends = OooOoO().f45259OooO0O0;
        Intrinsics.checkNotNullExpressionValue(rvShareToFriends, "rvShareToFriends");
        oOO0O0O.OooO00o(rvShareToFriends);
        oOo0oooO ooo0ooooInflate = oOo0oooO.inflate(getLayoutInflater(), OooOoO().f45259OooO0O0, false);
        Intrinsics.checkNotNullExpressionValue(ooo0ooooInflate, "inflate(...)");
        this.f25280OooOo00 = ooo0ooooInflate;
        if (ooo0ooooInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ooo0ooooInflate = null;
        }
        View view = ooo0ooooInflate.f45268OooO0O0.f30113OooO0o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLine");
            view = null;
        }
        view.setVisibility(0);
        oOo0oooO ooo0oooo = this.f25280OooOo00;
        if (ooo0oooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ooo0oooo = null;
        }
        SearchView searchView = ooo0oooo.f45267OooO00o;
        Intrinsics.checkNotNullExpressionValue(searchView, "getRoot(...)");
        concatAdapter.OooO00o(0, new r0(searchView));
        oOo0oooO ooo0oooo2 = this.f25280OooOo00;
        if (ooo0oooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ooo0oooo2 = null;
        }
        ooo0oooo2.f45268OooO0O0.setSearchTextChangedListener(new o00O0OOO(this));
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo4 = this.f25283OooOoO;
        if (o000ooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000ooo4 = null;
        }
        o00O listener = new o00O(this);
        o000ooo4.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000ooo4.f57585OooOO0O = listener;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo5 = this.f25285OooOoOO;
        if (o000ooo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo5 = null;
        }
        o00OO00O listener2 = new o00OO00O(this);
        o000ooo5.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o000ooo5.f57585OooOO0O = listener2;
        OooOoo0("");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o00O0O0(this, null), 3, null);
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo6 = this.f25283OooOoO;
        if (o000ooo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000ooo6 = null;
        }
        o000ooo6.OooO0o0(new o00O0O0O(this));
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo7 = this.f25285OooOoOO;
        if (o000ooo7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            o000ooo1 = o000ooo7;
        }
        o000ooo1.OooO0o0(new o00O0OO0(this));
        ShareContentType shareContentType = this.f25288OooOooO;
        if (shareContentType == ShareContentType.Moment || shareContentType == ShareContentType.Topic) {
            ((BaseMomentDetailVM) this.f25291Oooo00O.getValue()).statisticalTime();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ShareContentType shareContentType = this.f25288OooOooO;
        if (shareContentType == ShareContentType.Moment || shareContentType == ShareContentType.Topic) {
            ((BaseMomentDetailVM) this.f25291Oooo00O.getValue()).statisticalTime();
        }
    }
}
