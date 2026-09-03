package com.yalla.yalla.ui.activity.message;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.SearchView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.AfFriendVM;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0O0ooO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p464o0Ooo0oO.o0000OO0;
import p516o0o0O000.o00000;
import p536o0o0OOoo.Oo0000;
import p536o0o0OOoo.a;
import p536o0o0OOoo.b;
import p536o0o0OOoo.c;
import p536o0o0OOoo.d;
import p536o0o0OOoo.e;
import p563o0oOo0.OooOo;
import p649o0ooOOoo.nc;
import p649o0ooOOoo.ud;
import p649o0ooOOoo.vd;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/AtFriendsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AtFriendsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final /* synthetic */ int f22128ooOO = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22129OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(nc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22130Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AfFriendVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22151Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22151Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22131Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.AtFriendsActivity$special$$inlined$viewModels$default$5
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22155Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22155Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ConcatAdapter f22132OooooO0 = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public OooOo f22133OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o0000OO0 f22134OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public vd f22135Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public OooOo f22136Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public ud f22137OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public ud f22138Ooooooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public Job f22139o0OoOo0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1", f = "AtFriendsActivity.kt", i = {}, l = {161, 169}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f22140Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f22141Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ AtFriendsActivity f22142Oooo0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.message.AtFriendsActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1$1", f = "AtFriendsActivity.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0252OooO00o extends SuspendLambda implements Function2<o0O0ooO<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f22143Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f22144Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ AtFriendsActivity f22145Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0252OooO00o(AtFriendsActivity atFriendsActivity, Continuation<? super C0252OooO00o> continuation) {
                super(2, continuation);
                this.f22145Oooo0oo = atFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0252OooO00o c0252OooO00o = new C0252OooO00o(this.f22145Oooo0oo, continuation);
                c0252OooO00o.f22144Oooo0oO = obj;
                return c0252OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0O0ooO<FriendInfo> o0o0ooo, Continuation<? super Unit> continuation) {
                return ((C0252OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f22143Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO o0o0ooo = (o0O0ooO) this.f22144Oooo0oO;
                    OooOo oooOo = this.f22145Oooo0oo.f22133OooooOO;
                    OooOo oooOo2 = null;
                    if (oooOo == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        oooOo = null;
                    }
                    if (oooOo.getItemCount() > 0) {
                        AtFriendsActivity atFriendsActivity = this.f22145Oooo0oo;
                        ConcatAdapter concatAdapter = atFriendsActivity.f22132OooooO0;
                        o0000OO0 o0000oo1 = atFriendsActivity.f22134OooooOo;
                        if (o0000oo1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                            o0000oo1 = null;
                        }
                        concatAdapter.OooO00o(1, o0000oo1);
                        AtFriendsActivity atFriendsActivity2 = this.f22145Oooo0oo;
                        ConcatAdapter concatAdapter2 = atFriendsActivity2.f22132OooooO0;
                        OooOo oooOo3 = atFriendsActivity2.f22133OooooOO;
                        if (oooOo3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                            oooOo3 = null;
                        }
                        concatAdapter2.OooO00o(2, oooOo3);
                    }
                    OooOo oooOo4 = this.f22145Oooo0oo.f22136Oooooo0;
                    if (oooOo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        oooOo2 = oooOo4;
                    }
                    this.f22143Oooo0o = 1;
                    if (oooOo2.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$searchFriend$1$2", f = "AtFriendsActivity.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<o0O0ooO<FriendInfo>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f22146Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f22147Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ AtFriendsActivity f22148Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(AtFriendsActivity atFriendsActivity, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f22148Oooo0oo = atFriendsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f22148Oooo0oo, continuation);
                oooO0O0.f22147Oooo0oO = obj;
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
                int i = this.f22146Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO o0o0ooo = (o0O0ooO) this.f22147Oooo0oO;
                    AtFriendsActivity atFriendsActivity = this.f22148Oooo0oo;
                    ConcatAdapter concatAdapter = atFriendsActivity.f22132OooooO0;
                    OooOo oooOo = atFriendsActivity.f22133OooooOO;
                    OooOo oooOo2 = null;
                    if (oooOo == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                        oooOo = null;
                    }
                    concatAdapter.OooO0Oo(oooOo);
                    AtFriendsActivity atFriendsActivity2 = this.f22148Oooo0oo;
                    ConcatAdapter concatAdapter2 = atFriendsActivity2.f22132OooooO0;
                    o0000OO0 o0000oo1 = atFriendsActivity2.f22134OooooOo;
                    if (o0000oo1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeaderAdapter");
                        o0000oo1 = null;
                    }
                    concatAdapter2.OooO0Oo(o0000oo1);
                    ud udVar = this.f22148Oooo0oo.f22138Ooooooo;
                    if (udVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                        udVar = null;
                    }
                    TextView textView = udVar.f50710OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(textView, "allFriendHeader.tvTitle");
                    oOO00O.OooO00o(textView);
                    OooOo oooOo3 = this.f22148Oooo0oo.f22136Oooooo0;
                    if (oooOo3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    } else {
                        oooOo2 = oooOo3;
                    }
                    this.f22146Oooo0o = 1;
                    if (oooOo2.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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
        public OooO00o(String str, AtFriendsActivity atFriendsActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f22141Oooo0oO = str;
            this.f22142Oooo0oo = atFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f22141Oooo0oO, this.f22142Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f22140Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(this.f22141Oooo0oO)) {
                    Flow<o0O0ooO<FriendInfo>> allFriends = AtFriendsActivity.OooOoo(this.f22142Oooo0oo).getAllFriends();
                    C0252OooO00o c0252OooO00o = new C0252OooO00o(this.f22142Oooo0oo, null);
                    this.f22140Oooo0o = 1;
                    if (FlowKt.collectLatest(allFriends, c0252OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Flow<o0O0ooO<FriendInfo>> searchFriends = AtFriendsActivity.OooOoo(this.f22142Oooo0oo).getSearchFriends(this.f22141Oooo0oO);
                    OooO0O0 oooO0O0 = new OooO0O0(this.f22142Oooo0oo, null);
                    this.f22140Oooo0o = 2;
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
    public static final AfFriendVM OooOoo(AtFriendsActivity atFriendsActivity) {
        return (AfFriendVM) atFriendsActivity.f22130Ooooo00.getValue();
    }

    public static final void OooOooO(AtFriendsActivity atFriendsActivity, FriendInfo friendInfo, int i) {
        Objects.requireNonNull(atFriendsActivity);
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

    public final nc OooOooo() {
        return (nc) this.f22129OoooOoo.getValue();
    }

    public final void Oooo000(String searchText) {
        Job job = this.f22139o0OoOo0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        OooOo oooOo = this.f22133OooooOO;
        if (oooOo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooOo = null;
        }
        Objects.requireNonNull(oooOo);
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        oooOo.f44955OooOOo0 = searchText;
        OooOo oooOo2 = this.f22136Oooooo0;
        if (oooOo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            oooOo2 = null;
        }
        Objects.requireNonNull(oooOo2);
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        oooOo2.f44955OooOOo0 = searchText;
        this.f22139o0OoOo0 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO00o(searchText, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooo().f50103OooO00o);
        OooOo(R.string.Contacts);
        OooOooo().f50105OooO0OO.setEmptyImage(R.drawable.ic_empty_friends);
        OooOooo().f50105OooO0OO.setEmptyText(o000O0O0.OooO0OO(R.string.No_friends));
        ud udVarInflate = ud.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(udVarInflate, "inflate(layoutInflater)");
        this.f22137OoooooO = udVarInflate;
        OooOo oooOo = null;
        if (udVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
            udVarInflate = null;
        }
        udVarInflate.f50710OooO0O0.setText(o000O0O0.OooO0OO(R.string.Recent_contacts));
        ud udVar = this.f22137OoooooO;
        if (udVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
            udVar = null;
        }
        FrameLayout frameLayout = udVar.f50709OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "recentFriendHeader.root");
        o0000OO0 o0000oo1 = new o0000OO0(frameLayout);
        this.f22134OooooOo = o0000oo1;
        this.f22132OooooO0.OooO0O0(o0000oo1);
        OooOo oooOo2 = new OooOo();
        this.f22133OooooOO = oooOo2;
        this.f22132OooooO0.OooO0O0(oooOo2);
        ud udVarInflate2 = ud.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(udVarInflate2, "inflate(layoutInflater)");
        this.f22138Ooooooo = udVarInflate2;
        if (udVarInflate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
            udVarInflate2 = null;
        }
        udVarInflate2.f50710OooO0O0.setText(o000O0O0.OooO0OO(R.string.All_users));
        ud udVar2 = this.f22138Ooooooo;
        if (udVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
            udVar2 = null;
        }
        FrameLayout frameLayout2 = udVar2.f50709OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "allFriendHeader.root");
        this.f22132OooooO0.OooO0O0(new o0000OO0(frameLayout2));
        OooOo oooOo3 = new OooOo();
        this.f22136Oooooo0 = oooOo3;
        this.f22132OooooO0.OooO0O0(oooOo3);
        OooOooo().f50104OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOooo().f50104OooO0O0.setAdapter(this.f22132OooooO0);
        RecyclerView recyclerView = OooOooo().f50104OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.friendList");
        o00000.OooO00o(recyclerView);
        vd vdVarInflate = vd.inflate(getLayoutInflater(), OooOooo().f50104OooO0O0, false);
        Intrinsics.checkNotNullExpressionValue(vdVarInflate, "inflate(layoutInflater, binding.friendList, false)");
        this.f22135Oooooo = vdVarInflate;
        if (vdVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            vdVarInflate = null;
        }
        View view = vdVarInflate.f50810OooO0O0.f12075Oooo;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setVisibility(0);
        vd vdVar = this.f22135Oooooo;
        if (vdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            vdVar = null;
        }
        vdVar.f50810OooO0O0.setEditLineColor(-16721719);
        vd vdVar2 = this.f22135Oooooo;
        if (vdVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            vdVar2 = null;
        }
        SearchView searchView = vdVar2.f50809OooO00o;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchHeader.root");
        this.f22132OooooO0.OooO00o(0, new o0000OO0(searchView));
        vd vdVar3 = this.f22135Oooooo;
        if (vdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            vdVar3 = null;
        }
        vdVar3.f50810OooO0O0.setSearchTextChangedListener(new c(this));
        OooOo oooOo4 = this.f22133OooooOO;
        if (oooOo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooOo4 = null;
        }
        d listener = new d(this);
        Objects.requireNonNull(oooOo4);
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooOo4.f40456OooOO0O = listener;
        OooOo oooOo5 = this.f22136Oooooo0;
        if (oooOo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            oooOo5 = null;
        }
        e listener2 = new e(this);
        Objects.requireNonNull(oooOo5);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        oooOo5.f40456OooOO0O = listener2;
        Oooo000("");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new Oo0000(this, null), 3, null);
        OooOo oooOo6 = this.f22133OooooOO;
        if (oooOo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            oooOo6 = null;
        }
        oooOo6.OooO0o0(new a(this));
        OooOo oooOo7 = this.f22136Oooooo0;
        if (oooOo7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
        } else {
            oooOo = oooOo7;
        }
        oooOo.OooO0o0(new b(this));
        o0O00000.OooO0OO("Moments_post_At");
        ((MomentVM) this.f22131Ooooo0o.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((MomentVM) this.f22131Ooooo0o.getValue()).statisticalTime();
    }
}
