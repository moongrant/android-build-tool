package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.view.HeaderLayout;
import com.app.base.view.SearchView;
import com.code.android.util.ToastUtil;
import com.common.videoplayer.view.VideoView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.manager.data.SharedThemeVideoManager;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.ShareToFriendModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.GiveThemeModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.RoomThemeGiveInfo;
import com.yalla.yalla.model.ShareActivityModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.ShareToFriendVM;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.util.netimage.NetImageView;
import io.agora.rtc.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o00OOO.OooO00o;
import o0O00O0o.OooO0O0;
import o0O00O0o.OooO0o;
import o0o0000.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p027Oooo0o.OooOOO0;
import p089o000o000.o0O0ooO;
import p140o00OOOo0.o0OOO0o;
import p160o00OoOO.o000O00O;
import p169o00Ooo0.o0O0O00;
import p174o00OooO0.o0o0Oo;
import p177o00OoooO.oO000O0O;
import p190o00o00oO.oo0o0Oo;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p256o00ooO0o.oo0oOO0;
import p393o0OOooOo.o0O00000;
import p465o0Ooo0o0.o000OO;
import p466o0Ooo0oO.o0000OO0;
import p472o0Oooo0.o00O000;
import p503o0o00o.o0000O0O;
import p504o0o00o0.o00000O;
import p518o0o0O000.o00000;
import p522o0o0O0O0.o00Ooo;
import p538o0o0OOoo.c1;
import p538o0o0OOoo.d1;
import p538o0o0OOoo.e1;
import p538o0o0OOoo.f1;
import p538o0o0OOoo.g1;
import p538o0o0OOoo.h1;
import p538o0o0OOoo.j1;
import p538o0o0OOoo.l1;
import p538o0o0OOoo.m1;
import p538o0o0OOoo.o1;
import p538o0o0OOoo.p1;
import p538o0o0OOoo.q1;
import p538o0o0OOoo.r1;
import p538o0o0OOoo.s1;
import p565o0oOo0.o00O0000;
import p618o0oo0Ooo.oO0O000o;
import p623o0oo0o0o.oo00o;
import p651o0ooOOoo.ec;
import p651o0ooOOoo.fc;
import p651o0ooOOoo.ob;
import p651o0ooOOoo.rb;
import p651o0ooOOoo.sb;
import p651o0ooOOoo.tb;
import p651o0ooOOoo.ub;
import p651o0ooOOoo.vb;
import p651o0ooOOoo.wb;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/ShareToFriendsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ShareToFriendsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22228o00oO0o = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ec f22230OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public fc f22231OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public TextView f22232Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public fc f22233Oooooo0;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o0000OO0 f22235Ooooooo;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public ShareToFriendModel f22237o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @Nullable
    public ShareType f22238o00Ooo;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @Nullable
    public Job f22240o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public o00O0000 f22241o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public o00O0000 f22243ooOO;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22229OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(ob.class), this, null);

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f22234OoooooO = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final List<o0O00O0o.OooO0O0> f22236o00O0O = new ArrayList();

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22239o00o0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareToFriendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22255Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22255Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22242oo000o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$special$$inlined$viewModels$default$5
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22259Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22259Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @NotNull ShareToFriendModel model) {
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
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.Room.ordinal()] = 1;
            iArr[ShareType.Moment.ordinal()] = 2;
            iArr[ShareType.Topic.ordinal()] = 3;
            iArr[ShareType.User.ordinal()] = 4;
            iArr[ShareType.Web.ordinal()] = 5;
            iArr[ShareType.Theme.ordinal()] = 6;
            iArr[ShareType.Events.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1", f = "ShareToFriendsActivity.kt", i = {}, l = {164, 172}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f22244Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ ShareToFriendsActivity f22245OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f22246OoooO00;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1$1", f = "ShareToFriendsActivity.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f22247Oooo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ ShareToFriendsActivity f22248OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public /* synthetic */ Object f22249OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f22248OoooO0 = shareToFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f22248OoooO0, continuation);
                oooO00o.f22249OoooO00 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0O0ooO<FriendInfo> o0o0ooo, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f22247Oooo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO o0o0ooo = (o0O0ooO) this.f22249OoooO00;
                    o00O0000 o00o0001 = this.f22248OoooO0.f22241o0OoOo0;
                    o00O0000 o00o0002 = null;
                    if (o00o0001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        o00o0001 = null;
                    }
                    if (o00o0001.getItemCount() > 0) {
                        ShareToFriendsActivity shareToFriendsActivity = this.f22248OoooO0;
                        ConcatAdapter concatAdapter = shareToFriendsActivity.f22234OoooooO;
                        o0000OO0 o0000oo1 = shareToFriendsActivity.f22235Ooooooo;
                        if (o0000oo1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                            o0000oo1 = null;
                        }
                        concatAdapter.OooO00o(1, o0000oo1);
                        ShareToFriendsActivity shareToFriendsActivity2 = this.f22248OoooO0;
                        ConcatAdapter concatAdapter2 = shareToFriendsActivity2.f22234OoooooO;
                        o00O0000 o00o0003 = shareToFriendsActivity2.f22241o0OoOo0;
                        if (o00o0003 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                            o00o0003 = null;
                        }
                        concatAdapter2.OooO00o(2, o00o0003);
                    }
                    o00O0000 o00o0004 = this.f22248OoooO0.f22243ooOO;
                    if (o00o0004 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o00o0002 = o00o0004;
                    }
                    this.f22247Oooo = 1;
                    if (o00o0002.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$searchFriend$1$2", f = "ShareToFriendsActivity.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<o0O0ooO<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f22250Oooo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ ShareToFriendsActivity f22251OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public /* synthetic */ Object f22252OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f22251OoooO0 = shareToFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f22251OoooO0, continuation);
                oooO0O0.f22252OoooO00 = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0O0ooO<FriendInfo> o0o0ooo, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f22250Oooo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO o0o0ooo = (o0O0ooO) this.f22252OoooO00;
                    ShareToFriendsActivity shareToFriendsActivity = this.f22251OoooO0;
                    ConcatAdapter concatAdapter = shareToFriendsActivity.f22234OoooooO;
                    o00O0000 o00o0001 = shareToFriendsActivity.f22241o0OoOo0;
                    o00O0000 o00o0002 = null;
                    if (o00o0001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        o00o0001 = null;
                    }
                    concatAdapter.OooO0Oo(o00o0001);
                    ShareToFriendsActivity shareToFriendsActivity2 = this.f22251OoooO0;
                    ConcatAdapter concatAdapter2 = shareToFriendsActivity2.f22234OoooooO;
                    o0000OO0 o0000oo1 = shareToFriendsActivity2.f22235Ooooooo;
                    if (o0000oo1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                        o0000oo1 = null;
                    }
                    concatAdapter2.OooO0Oo(o0000oo1);
                    fc fcVar = this.f22251OoooO0.f22233Oooooo0;
                    if (fcVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                        fcVar = null;
                    }
                    TextView textView = fcVar.f49388OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(textView, "allFriendBinding.tvTitle");
                    o00O0O.OooO00o(textView);
                    o00O0000 o00o0003 = this.f22251OoooO0.f22243ooOO;
                    if (o00o0003 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o00o0002 = o00o0003;
                    }
                    this.f22250Oooo = 1;
                    if (o00o0002.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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
        public OooO0OO(String str, ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f22246OoooO00 = str;
            this.f22245OoooO0 = shareToFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f22246OoooO00, this.f22245OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f22244Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(this.f22246OoooO00)) {
                    Flow<o0O0ooO<FriendInfo>> allFriends = ShareToFriendsActivity.OooOoo(this.f22245OoooO0).getAllFriends();
                    OooO00o oooO00o = new OooO00o(this.f22245OoooO0, null);
                    this.f22244Oooo = 1;
                    if (FlowKt.collectLatest(allFriends, oooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Flow<o0O0ooO<FriendInfo>> searchFriends = ShareToFriendsActivity.OooOoo(this.f22245OoooO0).getSearchFriends(this.f22246OoooO00);
                    OooO0O0 oooO0O0 = new OooO0O0(this.f22245OoooO0, null);
                    this.f22244Oooo = 2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final ShareToFriendVM OooOoo(ShareToFriendsActivity shareToFriendsActivity) {
        return (ShareToFriendVM) shareToFriendsActivity.f22239o00o0O.getValue();
    }

    public static final void OooOooO(ShareToFriendsActivity shareToFriendsActivity) {
        o00O0000 o00o0001 = shareToFriendsActivity.f22243ooOO;
        o00O0000 o00o0002 = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        boolean z = o00o0001.f45087OooOOo0;
        int i = R.color.white;
        if (!z) {
            HeaderLayout headerLayout = shareToFriendsActivity.f11480OoooOOO;
            if (headerLayout != null) {
                headerLayout.setNavigationIcon(R.drawable.btn_return);
            }
            TextView textView = shareToFriendsActivity.f22232Oooooo;
            if (textView != null) {
                textView.setText(OooOOO.OooO0OO(R.string.multiple));
            }
            TextView textView2 = shareToFriendsActivity.f22232Oooooo;
            if (textView2 != null) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.white));
            }
            TextView textView3 = shareToFriendsActivity.f22232Oooooo;
            if (textView3 == null) {
                return;
            }
            textView3.setClickable(true);
            return;
        }
        o00O0000 o00o0003 = shareToFriendsActivity.f22243ooOO;
        if (o00o0003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            o00o0002 = o00o0003;
        }
        int size = o00o0002.f45086OooOOo.size();
        TextView textView4 = shareToFriendsActivity.f22232Oooooo;
        if (textView4 != null) {
            textView4.setText(size > 0 ? OooOo.OooO00o(OooOOO.OooO0OO(R.string.share_number), String.valueOf(size)) : OooOOO.OooO0OO(R.string.share));
        }
        TextView textView5 = shareToFriendsActivity.f22232Oooooo;
        if (textView5 != null) {
            if (size <= 0) {
                i = R.color.color_FFFFFFF_70;
            }
            textView5.setTextColor(o000O0O0.OooO00o(i));
        }
        TextView textView6 = shareToFriendsActivity.f22232Oooooo;
        if (textView6 == null) {
            return;
        }
        textView6.setClickable(size > 0);
    }

    public static final void OooOooo(ShareToFriendsActivity shareToFriendsActivity, boolean z) {
        Objects.requireNonNull(shareToFriendsActivity);
        if (!z) {
            ToastUtil.f12582OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.share_most_7_member));
            return;
        }
        ec ecVar = shareToFriendsActivity.f22230OooooOO;
        ec ecVar2 = null;
        if (ecVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ecVar = null;
        }
        if (ecVar.f49299OooO0O0.getSearchText().length() > 0) {
            ToastUtil.f12582OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.Selected));
            ec ecVar3 = shareToFriendsActivity.f22230OooooOO;
            if (ecVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                ecVar3 = null;
            }
            ecVar3.f49299OooO0O0.getEditSearch().setText((CharSequence) null);
            ec ecVar4 = shareToFriendsActivity.f22230OooooOO;
            if (ecVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                ecVar4 = null;
            }
            ecVar4.f49299OooO0O0.getEditSearch().clearFocus();
            ec ecVar5 = shareToFriendsActivity.f22230OooooOO;
            if (ecVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            } else {
                ecVar2 = ecVar5;
            }
            EditText editSearch = ecVar2.f49299OooO0O0.getEditSearch();
            o0OOO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editSearch, "view.context"), new Handler()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:135:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:136:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x053d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0543  */
    /* JADX WARN: Code duplicated, block: B:155:0x0548  */
    /* JADX WARN: Code duplicated, block: B:158:0x054f  */
    /* JADX WARN: Code duplicated, block: B:160:0x057a  */
    /* JADX WARN: Code duplicated, block: B:161:0x057c  */
    /* JADX WARN: Code duplicated, block: B:163:0x057f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0594  */
    /* JADX WARN: Code duplicated, block: B:171:0x059f  */
    /* JADX WARN: Code duplicated, block: B:174:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:176:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:181:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:182:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:184:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:186:0x060e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0610  */
    /* JADX WARN: Code duplicated, block: B:189:0x0613  */
    /* JADX WARN: Code duplicated, block: B:196:0x065d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0665  */
    /* JADX WARN: Code duplicated, block: B:201:0x0669  */
    /* JADX WARN: Code duplicated, block: B:203:0x0674  */
    /* JADX WARN: Code duplicated, block: B:220:0x05b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v42, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v51, types: [T, java.lang.Object, java.lang.String] */
    public final void Oooo0(final long j, final String str, final String str2) {
        int size;
        MomentDetailModel postDetailModel;
        ShareToFriendModel shareToFriendModel;
        MomentAdapterTag momentAdapterTag;
        MomentForwardContent momentForwardContent;
        MomentPoll momentPoll;
        MomentForwardContent forwardContent;
        ub ubVarInflate;
        CharSequence text;
        boolean z;
        o00O0000 o00o0001;
        int size2;
        o00O0000 o00o0002;
        boolean z2;
        MomentSendContentModel content;
        String content2;
        TextView textView;
        CharSequence text2;
        boolean z3;
        MomentSendContentModel content3;
        String content4;
        MomentSendContentModel content5;
        T tOooO00o;
        int i;
        boolean z4;
        int shareType;
        TopicInfoModel topicInfoModel;
        int size3;
        UserInfoModel userInfoModel;
        int size4;
        ShareActivityModel shareActivityModel;
        int size5;
        final GiveThemeModel giveThemeModel;
        EventModel eventModel;
        int size6;
        ShareType shareType2 = this.f22238o00Ooo;
        o00O0000 o00o0003 = null;
        o00O0000 o00o0004 = null;
        o00O0000 o00o0005 = null;
        o00O0000 o00o0006 = null;
        switch (shareType2 == null ? -1 : OooO0O0.$EnumSwitchMapping$0[shareType2.ordinal()]) {
            case 1:
                RoomConfiguration roomConfiguration = o000O00O.OooO().f32453OoooO0O;
                vb vbVarInflate = vb.inflate(getLayoutInflater());
                oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(vbVarInflate.f50819OooO00o.getContext());
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0oO());
                oooO00o.OooO0oO(6);
                o00O0000 o00o0007 = null;
                oooO00o.f48447OooO0OO = CloudImageUtilKt.imgSize$default(roomConfiguration.getBarimage(), OooOo00.OooO00o(60), false, 2, null);
                oooO00o.f48445OooO00o = 0;
                oooO00o.OooO0o(vbVarInflate.f50821OooO0OO);
                vbVarInflate.f50823OooO0o0.setText(roomConfiguration.getBarname());
                vbVarInflate.f50822OooO0Oo.setText(o0O0O00.OooO0oo("ID:", roomConfiguration.getBaridx()));
                vbVarInflate.f50820OooO0O0.setFilters(new InputFilter[]{new o000OO(), new InputFilter.LengthFilter(ShopVehicleListModel.VehicleTagType_Vip300)});
                Intrinsics.checkNotNullExpressionValue(vbVarInflate, "inflate(layoutInflater).…gthFilter(300))\n        }");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this);
                oo0ooo0.OooOooo();
                String strOooO0OO = OooOOO.OooO0OO(R.string.share_xxx_friends);
                String[] strArr = new String[1];
                o00O0000 o00o0008 = this.f22243ooOO;
                if (o00o0008 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    o00o0008 = null;
                }
                if (o00o0008.f45087OooOOo0) {
                    o00O0000 o00o0009 = this.f22243ooOO;
                    if (o00o0009 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        o00o0007 = o00o0009;
                    }
                    size = o00o0007.f45086OooOOo.size();
                } else {
                    size = 1;
                }
                strArr[0] = String.valueOf(size);
                oo0ooo0.OooOooO(OooOo.OooO00o(strOooO0OO, strArr));
                ConstraintLayout constraintLayout = vbVarInflate.f50819OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "roomBinding.root");
                oo0ooo0.OooOo00(constraintLayout);
                oo0ooo0.OooOo0o(new q1(this, j, roomConfiguration, vbVarInflate));
                oo0ooo0.OooOOO0();
                break;
            case 2:
                ShareToFriendModel shareToFriendModel2 = this.f22237o00Oo0;
                if (shareToFriendModel2 != null && (postDetailModel = shareToFriendModel2.getPostDetailModel()) != null && (shareToFriendModel = this.f22237o00Oo0) != null && (momentAdapterTag = shareToFriendModel.getMomentAdapterTag()) != null) {
                    long id = postDetailModel.getId();
                    MomentSendContentModel content6 = postDetailModel.getContent();
                    String content7 = content6 != null ? content6.getContent() : null;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = "";
                    if (!postDetailModel.getImageInfoList().isEmpty()) {
                        ?? url = postDetailModel.getImageInfoList().get(0).getUrl();
                        Intrinsics.checkNotNullExpressionValue(url, "postDetailModel.getImageInfoList()[0].url");
                        objectRef2.element = url;
                    }
                    MomentForwardContent forwardContent2 = postDetailModel.getForwardContent();
                    int type = postDetailModel.getType();
                    if (type == MomentType.Forward.getValue()) {
                        MomentDetailModel forward = postDetailModel.getForward();
                        if (forward != null) {
                            momentForwardContent = forwardContent2;
                            if (forward.getType() == MomentType.Poll.getValue()) {
                                MomentPoll momentPoll2 = forward.getMomentPoll();
                                if (momentPoll2 != null) {
                                    objectRef2.element = momentPoll2.getShareDefaultImg();
                                }
                            } else {
                                forwardContent = forward.getForwardContent();
                                ArrayList<ImageView9GridModel> imageInfoList = forward.getImageInfoList();
                                if (!imageInfoList.isEmpty()) {
                                    ?? url2 = imageInfoList.get(0).getUrl();
                                    Intrinsics.checkNotNullExpressionValue(url2, "imageInfoList[0].url");
                                    objectRef2.element = url2;
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
                            ubVarInflate = ub.inflate(getLayoutInflater());
                            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(ubVarInflate.f50739OooO00o.getContext());
                            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0oO());
                            oooO00o2.f48459OooOOOo = R.drawable.icon_head_default;
                            oooO00o2.OooO0oO(6);
                            oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize$default((String) objectRef2.element, OooOo00.OooO00o(60), false, 2, null);
                            oooO00o2.f48445OooO00o = 0;
                            oooO00o2.OooO0o(ubVarInflate.f50741OooO0OO);
                            ubVarInflate.f50742OooO0Oo.setText(content7);
                            if (postDetailModel.getContent() != null) {
                                content = postDetailModel.getContent();
                                if (content != null) {
                                    content2 = content.getContent();
                                } else {
                                    content2 = null;
                                }
                                if (!TextUtils.isEmpty(content2)) {
                                    textView = new TextView(ubVarInflate.f50739OooO00o.getContext());
                                    o0o0Oo.OooO00o(ubVarInflate.f50739OooO00o.getContext(), postDetailModel.getContent(), textView, R.color.color_6D6D6D, null);
                                    text2 = textView.getText();
                                    Intrinsics.checkNotNullExpressionValue(text2, "textView.text");
                                    if (text2.length() > 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        ubVarInflate.f50742OooO0Oo.setText(textView.getText());
                                    }
                                    content3 = postDetailModel.getContent();
                                    if (content3 != null || (content4 = content3.getContent()) == null) {
                                        content4 = "";
                                    }
                                    content5 = postDetailModel.getContent();
                                    tOooO00o = p016OooOoO0.OooOo00.OooO00o(content4, "");
                                    if (content5 != null) {
                                        i = 0;
                                        tOooO00o = tOooO00o;
                                        for (Object obj : content5.getAt()) {
                                            int i2 = i + 1;
                                            if (i < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            String strOooO00o = OooOOO0.OooO00o("@{", i, '}');
                                            StringBuilder sbOooO0O0 = OooO00o.OooO0OO.OooO0O0('@');
                                            sbOooO0O0.append(((MomentSendContentAtModel) obj).getName());
                                            String strReplace$default = StringsKt__StringsJVMKt.replace$default((String) tOooO00o, strOooO00o, sbOooO0O0.toString(), false, 4, (Object) null);
                                            i = i2;
                                            tOooO00o = strReplace$default;
                                        }
                                    }
                                    objectRef.element = tOooO00o;
                                    ubVarInflate.f50742OooO0Oo.setMaxLines(2);
                                }
                            }
                            text = ubVarInflate.f50742OooO0Oo.getText();
                            Intrinsics.checkNotNullExpressionValue(text, "dialogPostShareTvName.text");
                            if (text.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                ubVarInflate.f50742OooO0Oo.setText(OooOOO.OooO0OO(R.string.share_post_photo));
                                if (((CharSequence) objectRef2.element).length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    ubVarInflate.f50742OooO0Oo.setText(OooOOO.OooO0OO(R.string.share_post_content));
                                }
                                if (forwardContent != null && forwardContent.getShareType() == 20) {
                                    ubVarInflate.f50742OooO0Oo.setText(OooOOO.OooO0OO(R.string.event_share_moment));
                                }
                            }
                            ubVarInflate.f50740OooO0O0.setFilters(new InputFilter[]{new o000OO()});
                            Intrinsics.checkNotNullExpressionValue(ubVarInflate, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                            oo0oOO0 oo0ooo1 = new oo0oOO0(this);
                            oo0ooo1.OooOooo();
                            String strOooO0OO2 = OooOOO.OooO0OO(R.string.share_xxx_friends);
                            String[] strArr2 = new String[1];
                            o00o0001 = this.f22243ooOO;
                            if (o00o0001 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                                o00o0001 = null;
                            }
                            if (o00o0001.f45087OooOOo0) {
                                o00o0002 = this.f22243ooOO;
                                if (o00o0002 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                                    o00o0002 = null;
                                }
                                size2 = o00o0002.f45086OooOOo.size();
                            } else {
                                size2 = 1;
                            }
                            strArr2[0] = String.valueOf(size2);
                            oo0ooo1.OooOooO(OooOo.OooO00o(strOooO0OO2, strArr2));
                            LinearLayout linearLayout = ubVarInflate.f50739OooO00o;
                            Intrinsics.checkNotNullExpressionValue(linearLayout, "postBinding.root");
                            oo0ooo1.OooOo00(linearLayout);
                            oo0ooo1.OooOo0o(new p1(this, momentAdapterTag, j, postDetailModel, id, objectRef2, objectRef, ubVarInflate));
                            oo0ooo1.OooOOO0();
                        } else {
                            momentForwardContent = forwardContent2;
                        }
                    } else {
                        momentForwardContent = forwardContent2;
                        if (type == MomentType.Poll.getValue() && (momentPoll = postDetailModel.getMomentPoll()) != null) {
                            objectRef2.element = momentPoll.getShareDefaultImg();
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
                    ubVarInflate = ub.inflate(getLayoutInflater());
                    oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(ubVarInflate.f50739OooO00o.getContext());
                    oooO00o3.OooO00o(o00OOO.OooO00o.OooO0oO());
                    oooO00o3.f48459OooOOOo = R.drawable.icon_head_default;
                    oooO00o3.OooO0oO(6);
                    oooO00o3.f48447OooO0OO = CloudImageUtilKt.imgSize$default((String) objectRef2.element, OooOo00.OooO00o(60), false, 2, null);
                    oooO00o3.f48445OooO00o = 0;
                    oooO00o3.OooO0o(ubVarInflate.f50741OooO0OO);
                    ubVarInflate.f50742OooO0Oo.setText(content7);
                    if (postDetailModel.getContent() != null) {
                        content = postDetailModel.getContent();
                        if (content != null) {
                            content2 = content.getContent();
                        } else {
                            content2 = null;
                        }
                        if (!TextUtils.isEmpty(content2)) {
                            textView = new TextView(ubVarInflate.f50739OooO00o.getContext());
                            o0o0Oo.OooO00o(ubVarInflate.f50739OooO00o.getContext(), postDetailModel.getContent(), textView, R.color.color_6D6D6D, null);
                            text2 = textView.getText();
                            Intrinsics.checkNotNullExpressionValue(text2, "textView.text");
                            if (text2.length() > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                ubVarInflate.f50742OooO0Oo.setText(textView.getText());
                            }
                            content3 = postDetailModel.getContent();
                            if (content3 != null) {
                                content4 = "";
                            } else {
                                content4 = "";
                            }
                            content5 = postDetailModel.getContent();
                            tOooO00o = p016OooOoO0.OooOo00.OooO00o(content4, "");
                            if (content5 != null) {
                                i = 0;
                                tOooO00o = tOooO00o;
                                while (r2.hasNext()) {
                                    int i3 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    String strOooO00o2 = OooOOO0.OooO00o("@{", i, '}');
                                    StringBuilder sbOooO0O1 = OooO00o.OooO0OO.OooO0O0('@');
                                    sbOooO0O1.append(((MomentSendContentAtModel) obj).getName());
                                    String strReplace$default2 = StringsKt__StringsJVMKt.replace$default((String) tOooO00o, strOooO00o2, sbOooO0O1.toString(), false, 4, (Object) null);
                                    i = i3;
                                    tOooO00o = strReplace$default2;
                                }
                            }
                            objectRef.element = tOooO00o;
                            ubVarInflate.f50742OooO0Oo.setMaxLines(2);
                        }
                    }
                    text = ubVarInflate.f50742OooO0Oo.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "dialogPostShareTvName.text");
                    if (text.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ubVarInflate.f50742OooO0Oo.setText(OooOOO.OooO0OO(R.string.share_post_photo));
                        if (((CharSequence) objectRef2.element).length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            ubVarInflate.f50742OooO0Oo.setText(OooOOO.OooO0OO(R.string.share_post_content));
                        }
                        if (forwardContent != null) {
                            ubVarInflate.f50742OooO0Oo.setText(OooOOO.OooO0OO(R.string.event_share_moment));
                        }
                    }
                    ubVarInflate.f50740OooO0O0.setFilters(new InputFilter[]{new o000OO()});
                    Intrinsics.checkNotNullExpressionValue(ubVarInflate, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    oo0oOO0 oo0ooo2 = new oo0oOO0(this);
                    oo0ooo2.OooOooo();
                    String strOooO0OO3 = OooOOO.OooO0OO(R.string.share_xxx_friends);
                    String[] strArr3 = new String[1];
                    o00o0001 = this.f22243ooOO;
                    if (o00o0001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o00o0001 = null;
                    }
                    if (o00o0001.f45087OooOOo0) {
                        o00o0002 = this.f22243ooOO;
                        if (o00o0002 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                            o00o0002 = null;
                        }
                        size2 = o00o0002.f45086OooOOo.size();
                    } else {
                        size2 = 1;
                    }
                    strArr3[0] = String.valueOf(size2);
                    oo0ooo2.OooOooO(OooOo.OooO00o(strOooO0OO3, strArr3));
                    LinearLayout linearLayout2 = ubVarInflate.f50739OooO00o;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "postBinding.root");
                    oo0ooo2.OooOo00(linearLayout2);
                    oo0ooo2.OooOo0o(new p1(this, momentAdapterTag, j, postDetailModel, id, objectRef2, objectRef, ubVarInflate));
                    oo0ooo2.OooOOO0();
                    break;
                }
                break;
            case 3:
                ShareToFriendModel shareToFriendModel3 = this.f22237o00Oo0;
                if (shareToFriendModel3 != null && (topicInfoModel = shareToFriendModel3.getTopicInfoModel()) != null) {
                    wb wbVarInflate = wb.inflate(getLayoutInflater());
                    oO0O000o.OooO00o oooO00o4 = new oO0O000o.OooO00o(wbVarInflate.f50895OooO00o.getContext());
                    oooO00o4.OooO00o(o00OOO.OooO00o.OooO0oO());
                    oooO00o4.OooO0oO(6);
                    oooO00o4.f48447OooO0OO = CloudImageUtilKt.imgSize$default(topicInfoModel.getImage(), OooOo00.OooO00o(60), false, 2, null);
                    oooO00o4.f48445OooO00o = 0;
                    oooO00o4.OooO0o(wbVarInflate.f50897OooO0OO);
                    wbVarInflate.f50899OooO0o0.setText(topicInfoModel.getName());
                    wbVarInflate.f50898OooO0Oo.OooO00o(topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), -1);
                    wbVarInflate.f50896OooO0O0.setFilters(new InputFilter[]{new o000OO()});
                    Intrinsics.checkNotNullExpressionValue(wbVarInflate, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    oo0oOO0 oo0ooo3 = new oo0oOO0(this);
                    oo0ooo3.OooOooo();
                    String strOooO0OO4 = OooOOO.OooO0OO(R.string.share_xxx_friends);
                    String[] strArr4 = new String[1];
                    o00O0000 o00o00010 = this.f22243ooOO;
                    if (o00o00010 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o00o00010 = null;
                    }
                    if (o00o00010.f45087OooOOo0) {
                        o00O0000 o00o00011 = this.f22243ooOO;
                        if (o00o00011 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        } else {
                            o00o0006 = o00o00011;
                        }
                        size3 = o00o0006.f45086OooOOo.size();
                    } else {
                        size3 = 1;
                    }
                    strArr4[0] = String.valueOf(size3);
                    oo0ooo3.OooOooO(OooOo.OooO00o(strOooO0OO4, strArr4));
                    ConstraintLayout constraintLayout2 = wbVarInflate.f50895OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "topicBinding.root");
                    oo0ooo3.OooOo00(constraintLayout2);
                    oo0ooo3.OooOo0o(new r1(this, j, topicInfoModel, wbVarInflate));
                    oo0ooo3.OooOOO0();
                    break;
                }
                break;
            case 4:
                ShareToFriendModel shareToFriendModel4 = this.f22237o00Oo0;
                if (shareToFriendModel4 != null && (userInfoModel = shareToFriendModel4.getUserInfoModel()) != null) {
                    vb vbVarInflate2 = vb.inflate(getLayoutInflater());
                    oO0O000o.OooO00o oooO00o5 = new oO0O000o.OooO00o(vbVarInflate2.f50819OooO00o.getContext());
                    oooO00o5.OooO00o(o00OOO.OooO00o.OooO0o0());
                    oooO00o5.f48447OooO0OO = CloudImageUtilKt.imgSize$default(userInfoModel.getUserHeader(), OooOo00.OooO00o(60), false, 2, null);
                    oooO00o5.f48445OooO00o = 0;
                    oooO00o5.OooO0o(vbVarInflate2.f50821OooO0OO);
                    vbVarInflate2.f50823OooO0o0.setText(userInfoModel.getUserName());
                    vbVarInflate2.f50822OooO0Oo.setText(o0O0O00.OooO0oo("ID:", userInfoModel.getUserIdx()));
                    vbVarInflate2.f50820OooO0O0.setFilters(new InputFilter[]{new o000OO()});
                    Intrinsics.checkNotNullExpressionValue(vbVarInflate2, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    oo0oOO0 oo0ooo4 = new oo0oOO0(this);
                    oo0ooo4.OooOooo();
                    String strOooO0OO5 = OooOOO.OooO0OO(R.string.share_xxx_friends);
                    String[] strArr5 = new String[1];
                    o00O0000 o00o00012 = this.f22243ooOO;
                    if (o00o00012 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o00o00012 = null;
                    }
                    if (o00o00012.f45087OooOOo0) {
                        o00O0000 o00o00013 = this.f22243ooOO;
                        if (o00o00013 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        } else {
                            o00o0005 = o00o00013;
                        }
                        size4 = o00o0005.f45086OooOOo.size();
                    } else {
                        size4 = 1;
                    }
                    strArr5[0] = String.valueOf(size4);
                    oo0ooo4.OooOooO(OooOo.OooO00o(strOooO0OO5, strArr5));
                    ConstraintLayout constraintLayout3 = vbVarInflate2.f50819OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "roomBinding.root");
                    oo0ooo4.OooOo00(constraintLayout3);
                    oo0ooo4.OooOo0o(new s1(this, j, userInfoModel, vbVarInflate2));
                    oo0ooo4.OooOOO0();
                    break;
                }
                break;
            case 5:
                ShareToFriendModel shareToFriendModel5 = this.f22237o00Oo0;
                if (shareToFriendModel5 != null && (shareActivityModel = shareToFriendModel5.getShareActivityModel()) != null) {
                    sb sbVarInflate = sb.inflate(getLayoutInflater());
                    oO0O000o.OooO00o oooO00o6 = new oO0O000o.OooO00o(sbVarInflate.f50581OooO00o.getContext());
                    oooO00o6.OooO00o(o00OOO.OooO00o.OooO0o());
                    oooO00o6.f48447OooO0OO = CloudImageUtilKt.imgSize$default(shareActivityModel.getImage1(), OooOo00.OooO00o(60), false, 2, null);
                    oooO00o6.f48445OooO00o = 0;
                    oooO00o6.OooO0o(sbVarInflate.f50583OooO0OO);
                    sbVarInflate.f50584OooO0Oo.setText(shareActivityModel.getText1());
                    sbVarInflate.f50585OooO0o0.setText(shareActivityModel.getText2());
                    sbVarInflate.f50582OooO0O0.setFilters(new InputFilter[]{new o000OO()});
                    Intrinsics.checkNotNullExpressionValue(sbVarInflate, "inflate(layoutInflater).…r>(RowFilter())\n        }");
                    oo0oOO0 oo0ooo5 = new oo0oOO0(this);
                    oo0ooo5.OooOooo();
                    String strOooO0OO6 = OooOOO.OooO0OO(R.string.share_xxx_friends);
                    String[] strArr6 = new String[1];
                    o00O0000 o00o00014 = this.f22243ooOO;
                    if (o00o00014 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o00o00014 = null;
                    }
                    if (o00o00014.f45087OooOOo0) {
                        o00O0000 o00o00015 = this.f22243ooOO;
                        if (o00o00015 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        } else {
                            o00o0004 = o00o00015;
                        }
                        size5 = o00o0004.f45086OooOOo.size();
                    } else {
                        size5 = 1;
                    }
                    strArr6[0] = String.valueOf(size5);
                    oo0ooo5.OooOooO(OooOo.OooO00o(strOooO0OO6, strArr6));
                    ConstraintLayout constraintLayout4 = sbVarInflate.f50581OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "activityBinding.root");
                    oo0ooo5.OooOo00(constraintLayout4);
                    oo0ooo5.OooOo0o(new o1(this, j, shareActivityModel, sbVarInflate));
                    oo0ooo5.OooOOO0();
                    break;
                }
                break;
            case 6:
                ShareToFriendModel shareToFriendModel6 = this.f22237o00Oo0;
                if (shareToFriendModel6 != null && (giveThemeModel = shareToFriendModel6.getGiveThemeModel()) != null) {
                    BaseActivityK.OooOoo0(this, null, 0L, 3, null);
                    ((ShareToFriendVM) this.f22239o00o0O.getValue()).getRoomThemeGivenInfo(j, giveThemeModel.getShopId()).observe(this, new Observer() { // from class: o0o0OOoo.a1
                        /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList, java.util.List<o0O00O0o.OooO0O0>] */
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            String dynamicUrl;
                            String picUrl;
                            final ShareToFriendsActivity this$0 = this.f43763OooO00o;
                            String targetImage = str2;
                            final long j2 = j;
                            String targetName = str;
                            final GiveThemeModel giveThemeModel2 = giveThemeModel;
                            ApiResult apiResult = (ApiResult) obj2;
                            ShareToFriendsActivity.OooO00o oooO00o7 = ShareToFriendsActivity.f22228o00oO0o;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(targetImage, "$targetImage");
                            Intrinsics.checkNotNullParameter(targetName, "$targetName");
                            Intrinsics.checkNotNullParameter(giveThemeModel2, "$giveThemeModel");
                            this$0.OooOoO();
                            if (!apiResult.isSuccess()) {
                                int code2 = apiResult.getError().getCode();
                                if (code2 == 1062) {
                                    oo0o0Oo.OooO0O0(CommonError.He_Is_Not_Your_Friend, null, 2, null, CommonErrorHandler.INSTANCE);
                                    return;
                                } else {
                                    if (code2 == 2050) {
                                        oo0o0Oo.OooO0O0(CommonError.Friend_Has_This_Theme, null, 2, null, CommonErrorHandler.INSTANCE);
                                        return;
                                    }
                                    ApiError error = apiResult.getError();
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                                    return;
                                }
                            }
                            RoomThemeGiveInfo roomThemeGiveInfo = (RoomThemeGiveInfo) apiResult.getData();
                            if (roomThemeGiveInfo == null) {
                                return;
                            }
                            final o00000O o00000o = new o00000O(this$0, 0);
                            final rb rbVarInflate = rb.inflate(LayoutInflater.from(o00000o.f41561Oooo), o00000o.f41563OoooO0, true);
                            Intrinsics.checkNotNullExpressionValue(rbVarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
                            rbVarInflate.f50499OooO00o.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0OOoo.z0
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    rb binding = rbVarInflate;
                                    ShareToFriendsActivity.OooO00o oooO00o8 = ShareToFriendsActivity.f22228o00oO0o;
                                    Intrinsics.checkNotNullParameter(binding, "$binding");
                                    EditText view2 = binding.f50501OooO0OO;
                                    Intrinsics.checkNotNullExpressionValue(view2, "binding.etMessage");
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    Context context = view2.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                                    o00O000.OooO00o(context).hideSoftInputFromWindow(view2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(view2, "view.context"), new Handler()));
                                    return false;
                                }
                            });
                            oO0O000o.OooO00o oooO00o8 = new oO0O000o.OooO00o(this$0);
                            oooO00o8.OooO00o(OooO00o.OooO0o0());
                            p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
                            float f = 46;
                            oooO00o8.f48447OooO0OO = CloudImageUtilKt.imgSize$default(oooOOO.OooO0oo().getValue(), OooOo00.OooO00o(f), false, 2, null);
                            oooO00o8.f48445OooO00o = 0;
                            oooO00o8.OooO0o(rbVarInflate.f50504OooO0o0);
                            rbVarInflate.f50506OooO0oo.setText(oooOOO.OooOoO().getValue());
                            oO0O000o.OooO00o oooO00o9 = new oO0O000o.OooO00o(this$0);
                            oooO00o9.OooO00o(OooO00o.OooO0o0());
                            oooO00o9.f48447OooO0OO = CloudImageUtilKt.imgSize$default(targetImage, OooOo00.OooO00o(f), false, 2, null);
                            oooO00o9.f48445OooO00o = 0;
                            oooO00o9.OooO0o(rbVarInflate.f50505OooO0oO);
                            rbVarInflate.f50511OooOOO0.setText(o00Ooo.f42780OooO00o.OooO0O0(j2, targetName));
                            RoomThemeGiveInfo roomThemeGiveInfo2 = (RoomThemeGiveInfo) apiResult.getData();
                            if (roomThemeGiveInfo2 == null || (dynamicUrl = roomThemeGiveInfo2.getDynamicUrl()) == null) {
                                dynamicUrl = "";
                            }
                            if (!StringsKt.isBlank(dynamicUrl)) {
                                VideoView videoView = rbVarInflate.f50510OooOOO;
                                Intrinsics.checkNotNullExpressionValue(videoView, "binding.videoView");
                                o00O0O.OooO(videoView);
                                NetImageView netImageView = rbVarInflate.f50503OooO0o;
                                Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShop");
                                o00O0O.OooO00o(netImageView);
                                final OooO0O0 oooO0O0 = new OooO0O0();
                                this$0.f22236o00O0O.add(oooO0O0);
                                VideoView videoView2 = rbVarInflate.f50510OooOOO;
                                Intrinsics.checkNotNullExpressionValue(videoView2, "binding.videoView");
                                oooO0O0.OooO0Oo(videoView2);
                                SharedThemeVideoManager.INSTANCE.loadVideo(dynamicUrl).observe(o00000o.f41564OoooO00, new Observer() { // from class: o0o0OOoo.b1
                                    @Override // androidx.lifecycle.Observer
                                    public final void onChanged(Object obj3) {
                                        o00000O this_apply = o00000o;
                                        OooO0O0 playController = oooO0O0;
                                        String path = (String) obj3;
                                        ShareToFriendsActivity.OooO00o oooO00o10 = ShareToFriendsActivity.f22228o00oO0o;
                                        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                        Intrinsics.checkNotNullParameter(playController, "$playController");
                                        if (this_apply.OooO0OO()) {
                                            Intrinsics.checkNotNullExpressionValue(path, "path");
                                            playController.OooO0OO(new OooO0o(path, Integer.MAX_VALUE));
                                            playController.OooO00o();
                                        }
                                    }
                                });
                                rbVarInflate.f50510OooOOO.setStateChangedListener(new n1(rbVarInflate));
                            } else {
                                VideoView videoView3 = rbVarInflate.f50510OooOOO;
                                Intrinsics.checkNotNullExpressionValue(videoView3, "binding.videoView");
                                o00O0O.OooO00o(videoView3);
                                NetImageView netImageView2 = rbVarInflate.f50503OooO0o;
                                Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivShop");
                                o00O0O.OooO(netImageView2);
                                oO0O000o.OooO00o oooO00o10 = new oO0O000o.OooO00o(this$0);
                                RoomThemeGiveInfo roomThemeGiveInfo3 = (RoomThemeGiveInfo) apiResult.getData();
                                oooO00o10.f48447OooO0OO = (roomThemeGiveInfo3 == null || (picUrl = roomThemeGiveInfo3.getPicUrl()) == null) ? null : CloudImageUtilKt.imgSize(picUrl, OooOo00.OooO00o(92), OooOo00.OooO00o(115));
                                oooO00o10.f48445OooO00o = 0;
                                oooO00o10.f48472OooOoo0 = 2;
                                oooO00o10.f48462OooOOoo = 3;
                                oooO00o10.f48459OooOOOo = R.drawable.icon_room_theme_placeholder;
                                oooO00o10.OooO0oO(6);
                                oooO00o10.OooO0o(rbVarInflate.f50503OooO0o);
                            }
                            rbVarInflate.f50508OooOO0O.setText(roomThemeGiveInfo.getThemeName());
                            rbVarInflate.f50498OooO.setText(String.valueOf(roomThemeGiveInfo.getPrice()));
                            o00000o.OooO0o(false);
                            if (roomThemeGiveInfo.getTimeLong() > 0) {
                                rbVarInflate.f50509OooOO0o.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.message_send_theme_limit_day), String.valueOf(roomThemeGiveInfo.getTimeLong())));
                            } else {
                                rbVarInflate.f50509OooOO0o.setText(OooOOO.OooO0OO(R.string.message_send_theme_permanent));
                            }
                            rbVarInflate.f50507OooOO0.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.message_send_theme_limit_count), String.valueOf(roomThemeGiveInfo.getGiveCount())));
                            rbVarInflate.f50502OooO0Oo.setOnClickListener(new oO000O0O(o00000o, 1));
                            rbVarInflate.f50500OooO0O0.setText(OooOOO.OooO0OO(R.string.message_send_theme_confirm));
                            rbVarInflate.f50500OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o0OOoo.x0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    long j3 = j2;
                                    GiveThemeModel giveThemeModel3 = giveThemeModel2;
                                    rb binding = rbVarInflate;
                                    ShareToFriendsActivity this$1 = this$0;
                                    o00000O this_apply = o00000o;
                                    ShareToFriendsActivity.OooO00o oooO00o11 = ShareToFriendsActivity.f22228o00oO0o;
                                    Intrinsics.checkNotNullParameter(giveThemeModel3, "$giveThemeModel");
                                    Intrinsics.checkNotNullParameter(binding, "$binding");
                                    Intrinsics.checkNotNullParameter(this$1, "this$0");
                                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                    o0O00000.OooO0OO("Me_store_Theme_PopupOK_success");
                                    String message = binding.f50501OooO0OO.getText().toString();
                                    Intrinsics.checkNotNullParameter(giveThemeModel3, "giveThemeModel");
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    long shopId = giveThemeModel3.getShopId();
                                    String themeBgName = giveThemeModel3.getThemeName();
                                    String themeBgImgUrl = giveThemeModel3.getImageUrl();
                                    String themeVideoUrl = giveThemeModel3.getVideoUrl();
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    Intrinsics.checkNotNullParameter(themeBgName, "themeBgName");
                                    Intrinsics.checkNotNullParameter(themeBgImgUrl, "themeBgImgUrl");
                                    Intrinsics.checkNotNullParameter(themeVideoUrl, "themeVideoUrl");
                                    MutableLiveData mutableLiveData = new MutableLiveData();
                                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new p522o0o0O0O0.o00000O(j3, shopId, message, mutableLiveData, themeBgName, themeBgImgUrl, themeVideoUrl, null), 2, null);
                                    mutableLiveData.observe(this$1, new o0000O0O(this$1, 2));
                                    this_apply.OooO0O0();
                                }
                            });
                            o00000o.OooOO0();
                        }
                    });
                    break;
                }
                break;
            case 7:
                ShareToFriendModel shareToFriendModel7 = this.f22237o00Oo0;
                if (shareToFriendModel7 != null && (eventModel = shareToFriendModel7.getEventModel()) != null) {
                    tb tbVarInflate = tb.inflate(getLayoutInflater());
                    oO0O000o.OooO00o oooO00o7 = new oO0O000o.OooO00o(tbVarInflate.f50634OooO00o.getContext());
                    oooO00o7.OooO00o(o00OOO.OooO00o.OooO0o());
                    oooO00o7.OooO0oo(6, 6, 0, 0);
                    oooO00o7.f48447OooO0OO = CloudImageUtilKt.imgSize(eventModel.getEventImage(), OooOo00.OooO00o(228), OooOo00.OooO00o(Constants.ERR_WATERMARK_READ));
                    oooO00o7.f48445OooO00o = 0;
                    oooO00o7.OooO0o(tbVarInflate.f50635OooO0O0);
                    tbVarInflate.f50640OooO0oO.setText(eventModel.getEventName());
                    tbVarInflate.f50639OooO0o0.setText(eventModel.getRoomName());
                    tbVarInflate.f50637OooO0Oo.setText(String.valueOf(eventModel.getRoomIdx()));
                    if (eventModel.getEventState() != EventModel.State.INSTANCE.getDeleted()) {
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
                                tbVarInflate.f50638OooO0o.setText(OooOOO.OooO0OO(R.string.Event_Live_Now));
                                tbVarInflate.f50638OooO0o.setTextColor(o000O0O0.OooO00o(R.color.color_FFA21F));
                                tbVarInflate.f50636OooO0OO.setImageResource(R.drawable.ic_explore_event_live);
                                tbVarInflate.f50636OooO0OO.setImageTintList(null);
                            } else {
                                tbVarInflate.f50638OooO0o.setText(oo00o.f48643OooO00o.OooO0oO(eventModel.getEventStartTime()));
                                tbVarInflate.f50638OooO0o.setTextColor(o000O0O0.OooO00o(R.color.color_white_60));
                                tbVarInflate.f50636OooO0OO.setImageResource(R.drawable.ic_explore_event_time);
                                tbVarInflate.f50636OooO0OO.setImageTintList(ColorStateList.valueOf(o000O0O0.OooO00o(R.color.color_white_60)));
                            }
                        } else {
                            tbVarInflate.f50638OooO0o.setText(oo00o.f48643OooO00o.OooO0oO(eventModel.getEventStartTime()));
                            tbVarInflate.f50638OooO0o.setTextColor(o000O0O0.OooO00o(R.color.color_white_60));
                            tbVarInflate.f50636OooO0OO.setImageResource(R.drawable.ic_explore_event_time);
                            tbVarInflate.f50636OooO0OO.setImageTintList(ColorStateList.valueOf(o000O0O0.OooO00o(R.color.color_white_60)));
                        }
                    } else {
                        tbVarInflate.f50638OooO0o.setText(oo00o.f48643OooO00o.OooO0oO(eventModel.getEventStartTime()));
                        tbVarInflate.f50638OooO0o.setTextColor(o000O0O0.OooO00o(R.color.color_white_60));
                        tbVarInflate.f50636OooO0OO.setImageResource(R.drawable.ic_explore_event_time);
                        tbVarInflate.f50636OooO0OO.setImageTintList(ColorStateList.valueOf(o000O0O0.OooO00o(R.color.color_white_60)));
                    }
                    Intrinsics.checkNotNullExpressionValue(tbVarInflate, "inflate(layoutInflater).…)\n            }\n        }");
                    oo0oOO0 oo0ooo6 = new oo0oOO0(this);
                    oo0ooo6.OooOooo();
                    String strOooO0OO7 = OooOOO.OooO0OO(R.string.share_xxx_friends);
                    String[] strArr7 = new String[1];
                    o00O0000 o00o00016 = this.f22243ooOO;
                    if (o00o00016 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o00o00016 = null;
                    }
                    if (o00o00016.f45087OooOOo0) {
                        o00O0000 o00o00017 = this.f22243ooOO;
                        if (o00o00017 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        } else {
                            o00o0003 = o00o00017;
                        }
                        size6 = o00o0003.f45086OooOOo.size();
                    } else {
                        size6 = 1;
                    }
                    strArr7[0] = String.valueOf(size6);
                    oo0ooo6.OooOooO(OooOo.OooO00o(strOooO0OO7, strArr7));
                    ConstraintLayout constraintLayout5 = tbVarInflate.f50634OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout5, "eventBinding.root");
                    oo0ooo6.OooOo00(constraintLayout5);
                    oo0ooo6.OooOo0o(new m1(this, j, eventModel, oo0ooo6));
                    oo0ooo6.OooOOO0();
                    break;
                }
                break;
        }
    }

    public final ob Oooo000() {
        return (ob) this.f22229OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo00O() {
        ShareType shareType = this.f22238o00Ooo;
        if (shareType == ShareType.Moment || shareType == ShareType.Topic) {
            ((MomentVM) this.f22242oo000o.getValue()).statisticalTime();
        }
    }

    public final void Oooo00o(String searchText) {
        Job job = this.f22240o00ooo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        o00O0000 o00o0001 = this.f22241o0OoOo0;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o00o0001 = null;
        }
        Objects.requireNonNull(o00o0001);
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        o00o0001.f45088OooOOoo = searchText;
        o0oOo0.o0O0ooO.OooO00o oooO00o = p565o0oOo0.o0O0ooO.f45113OooO00o;
        oooO00o.f45114OooO00o = !StringsKt.isBlank(searchText);
        o00O0000 o00o0002 = this.f22243ooOO;
        if (o00o0002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0002 = null;
        }
        Objects.requireNonNull(o00o0002);
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        o00o0002.f45088OooOOoo = searchText;
        oooO00o.f45114OooO00o = true ^ StringsKt.isBlank(searchText);
        this.f22240o00ooo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0OO(searchText, this, null), 3, null);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Oooo000().f50217OooO00o);
        o00O0000 o00o0001 = null;
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("SHARE_MODEL");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.common.model.ShareToFriendModel");
            ShareToFriendModel shareToFriendModel = (ShareToFriendModel) serializableExtra;
            this.f22237o00Oo0 = shareToFriendModel;
            this.f22238o00Ooo = shareToFriendModel != null ? shareToFriendModel.getType() : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        OooOo(R.string.Contacts);
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            headerLayout.setNavigationOnClickListener(new f1(this));
        }
        HeaderLayout headerLayout2 = this.f11480OoooOOO;
        TextView textViewOooOoo = headerLayout2 != null ? headerLayout2.OooOoo(OooOOO.OooO0OO(R.string.multiple), new g1(this)) : null;
        this.f22232Oooooo = textViewOooOoo;
        if (this.f22238o00Ooo == ShareType.Theme) {
            if (textViewOooOoo != null) {
                o00O0O.OooO00o(textViewOooOoo);
            }
        } else if (textViewOooOoo != null) {
            o00O0O.OooO(textViewOooOoo);
        }
        Oooo000().f50219OooO0OO.setEmptyImage(R.drawable.ic_empty_friends);
        Oooo000().f50219OooO0OO.setEmptyText(OooOOO.OooO0OO(R.string.No_friends));
        Oooo000().f50218OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0OOoo.y0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ShareToFriendsActivity activity = this.f43909Oooo;
                ShareToFriendsActivity.OooO00o oooO00o = ShareToFriendsActivity.f22228o00oO0o;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                View viewFindViewById = activity.findViewById(android.R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
                return false;
            }
        });
        fc fcVarInflate = fc.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fcVarInflate, "inflate(layoutInflater)");
        this.f22231OooooOo = fcVarInflate;
        if (fcVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
            fcVarInflate = null;
        }
        fcVarInflate.f49388OooO0O0.setText(OooOOO.OooO0OO(R.string.Recent_contacts));
        fc fcVar = this.f22231OooooOo;
        if (fcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
            fcVar = null;
        }
        FrameLayout frameLayout = fcVar.f49387OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "recentFriendBinding.root");
        o0000OO0 o0000oo1 = new o0000OO0(frameLayout);
        this.f22235Ooooooo = o0000oo1;
        this.f22234OoooooO.OooO0O0(o0000oo1);
        o00O0000 o00o0002 = new o00O0000();
        this.f22241o0OoOo0 = o00o0002;
        this.f22234OoooooO.OooO0O0(o00o0002);
        fc fcVarInflate2 = fc.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fcVarInflate2, "inflate(layoutInflater)");
        this.f22233Oooooo0 = fcVarInflate2;
        if (fcVarInflate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
            fcVarInflate2 = null;
        }
        fcVarInflate2.f49388OooO0O0.setText(OooOOO.OooO0OO(R.string.All_users));
        fc fcVar2 = this.f22233Oooooo0;
        if (fcVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
            fcVar2 = null;
        }
        FrameLayout frameLayout2 = fcVar2.f49387OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "allFriendBinding.root");
        this.f22234OoooooO.OooO0O0(new o0000OO0(frameLayout2));
        o00O0000 o00o0003 = new o00O0000();
        this.f22243ooOO = o00o0003;
        this.f22234OoooooO.OooO0O0(o00o0003);
        Oooo000().f50218OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        Oooo000().f50218OooO0O0.setAdapter(this.f22234OoooooO);
        RecyclerView recyclerView = Oooo000().f50218OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvShareToFriends");
        o00000.OooO00o(recyclerView);
        ec ecVarInflate = ec.inflate(getLayoutInflater(), Oooo000().f50218OooO0O0, false);
        Intrinsics.checkNotNullExpressionValue(ecVarInflate, "inflate(\n            lay…          false\n        )");
        this.f22230OooooOO = ecVarInflate;
        if (ecVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ecVarInflate = null;
        }
        ecVarInflate.f49299OooO0O0.OooO0O0();
        ec ecVar = this.f22230OooooOO;
        if (ecVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ecVar = null;
        }
        SearchView searchView = ecVar.f49298OooO00o;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchBinding.root");
        this.f22234OoooooO.OooO00o(0, new o0000OO0(searchView));
        ec ecVar2 = this.f22230OooooOO;
        if (ecVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            ecVar2 = null;
        }
        ecVar2.f49299OooO0O0.setSearchTextChangedListener(new h1(this));
        o00O0000 o00o0004 = this.f22241o0OoOo0;
        if (o00o0004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o00o0004 = null;
        }
        j1 listener = new j1(this);
        Objects.requireNonNull(o00o0004);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0004.f40475OooOO0O = listener;
        o00O0000 o00o0005 = this.f22243ooOO;
        if (o00o0005 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0005 = null;
        }
        l1 listener2 = new l1(this);
        Objects.requireNonNull(o00o0005);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o00o0005.f40475OooOO0O = listener2;
        Oooo00o("");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c1(this, null), 3, null);
        o00O0000 o00o0006 = this.f22241o0OoOo0;
        if (o00o0006 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o00o0006 = null;
        }
        o00o0006.OooO0o0(new d1(this));
        o00O0000 o00o0007 = this.f22243ooOO;
        if (o00o0007 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            o00o0001 = o00o0007;
        }
        o00o0001.OooO0o0(new e1(this));
        Oooo00O();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo00O();
    }
}
