package com.yalla.yalla.ui.activity.moment;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.o0oOOo;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.MomentMessageVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;
import p485o0o00O0.o00O000o;
import p485o0o00O0.o00O00o0;
import p485o0o00O0.o00OOOOo;
import p485o0o00O0.oOO00O;
import p579o0oOoo.oO00O0o0;
import p579o0oOoo.oOO0OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.w5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0017¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentMessageListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Lo0OoO000/OooOo;", "msg", "", "onEventMainThread", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentMessageListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentMessageListActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentMessageListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,257:1\n22#2,2:258\n75#3,13:260\n75#3,13:273\n*S KotlinDebug\n*F\n+ 1 MomentMessageListActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentMessageListActivity\n*L\n49#1:258,2\n51#1:260,13\n52#1:273,13\n*E\n"})
public final class MomentMessageListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26116OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public MomentMessage f26118OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public TextView f26122OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Job f26123OooOoO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26117OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(w5.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26120OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentMessageVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26136OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26136OooO0Oo;
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
    public final ViewModelLazy f26119OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(YallaChatVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26140OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26140OooO0Oo;
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
    public final Lazy f26121OooOo0O = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final OooO0o f26124OooOoO0 = new OooO0o();

    public static final class OooO00o {
        public static void OooO00o(@Nullable Context context) {
            if (context == null) {
                return;
            }
            context.startActivity(new Intent(context, (Class<?>) MomentMessageListActivity.class));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$loadData$1", f = "MomentMessageListActivity.kt", i = {}, l = {200, 201}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f26125OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f26126OooO0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$loadData$1$1", f = "MomentMessageListActivity.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<MomentMessage>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f26128OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MomentMessageListActivity f26129OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f26130OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentMessageListActivity momentMessageListActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f26129OooO0o = momentMessageListActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f26129OooO0o, continuation);
                oooO00o.f26130OooO0o0 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(androidx.paging.o0OOO0o<MomentMessage> o0ooo0o2, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f26128OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f26130OooO0o0;
                    int i2 = MomentMessageListActivity.f26116OooOoOO;
                    com.yalla.yalla.ui.adapter.o00oO0o o00oo0oOooOoO0 = this.f26129OooO0o.OooOoO0();
                    this.f26128OooO0Oo = 1;
                    if (o00oo0oOooOoO0.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
        public OooO0O0(int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26126OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentMessageListActivity.this.new OooO0O0(this.f26126OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26125OooO0Oo;
            MomentMessageListActivity momentMessageListActivity = MomentMessageListActivity.this;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            int i2 = MomentMessageListActivity.f26116OooOoOO;
            com.yalla.yalla.ui.adapter.o00oO0o o00oo0oOooOoO0 = momentMessageListActivity.OooOoO0();
            androidx.paging.o0OOO0o o0ooo0o2 = new androidx.paging.o0OOO0o(FlowKt.flowOf(new androidx.paging.Oooo000.OooO0o(CollectionsKt.emptyList(), null, null)), androidx.paging.o0OOO0o.f7365OooO0o0, androidx.paging.o0OOO0o.f7364OooO0o);
            this.f26125OooO0Oo = 1;
            if (o00oo0oOooOoO0.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            int i3 = MomentMessageListActivity.f26116OooOoOO;
            Flow<androidx.paging.o0OOO0o<MomentMessage>> flowLoadDataPaging = momentMessageListActivity.OooOoO().loadDataPaging(this.f26126OooO0o);
            OooO00o oooO00o = new OooO00o(momentMessageListActivity, null);
            this.f26125OooO0Oo = 2;
            if (FlowKt.collectLatest(flowLoadDataPaging, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<com.yalla.yalla.ui.adapter.o00oO0o> {
        public OooO0OO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.adapter.o00oO0o invoke() {
            int i = MomentMessageListActivity.f26116OooOoOO;
            MomentMessageListActivity momentMessageListActivity = MomentMessageListActivity.this;
            return new com.yalla.yalla.ui.adapter.o00oO0o(momentMessageListActivity, momentMessageListActivity.OooOoO(), (YallaChatVM) momentMessageListActivity.f26119OooOo0.getValue());
        }
    }

    public static final class OooO0o extends oo00o {

        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentMessageListActivity f26133OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentMessageListActivity momentMessageListActivity) {
                super(0);
                this.f26133OooO0Oo = momentMessageListActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                int i = MomentMessageListActivity.f26116OooOoOO;
                MomentMessageListActivity momentMessageListActivity = this.f26133OooO0Oo;
                momentMessageListActivity.OooOoO().deleteData(momentMessageListActivity.OooOo().f59152OooO0o0.getSelectType());
                return Unit.INSTANCE;
            }
        }

        public OooO0o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            int i = MomentMessageListActivity.f26116OooOoOO;
            MomentMessageListActivity momentMessageListActivity = MomentMessageListActivity.this;
            if (momentMessageListActivity.OooOoO0().getItemCount() < 1 || momentMessageListActivity.isDestroyed()) {
                return;
            }
            p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(momentMessageListActivity);
            o0oo00o2.OooOOoo(oO00OOo0.message_clear_comment_notice);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new OooO00o(momentMessageListActivity));
            o0oo00o2.OooOO0o();
        }
    }

    public final w5 OooOo() {
        return (w5) this.f26117OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentMessageVM OooOoO() {
        return (MomentMessageVM) this.f26120OooOo00.getValue();
    }

    public final com.yalla.yalla.ui.adapter.o00oO0o OooOoO0() {
        return (com.yalla.yalla.ui.adapter.o00oO0o) this.f26121OooOo0O.getValue();
    }

    public final void OooOoOO(int i) {
        Job job = this.f26123OooOoO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f26123OooOoO = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0O0(i, null), 3, null);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        o00OOOOo o00ooooo2 = OooOo().f59148OooO0O0.f31156OooO0oO;
        boolean z2 = false;
        if (o00ooooo2.f47865OooO0o.getValue() != null) {
            p367o0OOo0o0.OooOOOO value = o00ooooo2.f47865OooO0o.getValue();
            Intrinsics.checkNotNull(value);
            p367o0OOo0o0.OooOOOO oooOOOO = value;
            if (oooOOOO.f43973OooO0o == 2) {
                oooOOOO.OooO0O0();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            super.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59147OooO00o);
        o0OO000.OooO00o("104010");
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        o0oOOo o0oooo = new o0oOOo(getWindow().getDecorView(), getWindow());
        Intrinsics.checkNotNullExpressionValue(o0oooo, "getInsetsController(window, window.decorView)");
        o0oooo.OooO00o(true);
        oO00O0o0.OooO0oO();
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            p370o0OOoO.OooOOO0.OooO00o(headerLayout, true, 2);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo0O();
        }
        TextView textView = OooOo().f59150OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.titleContent");
        p370o0OOoO.OooOOO0.OooO00o(textView, false, 3);
        OooOo().f59152OooO0o0.setListener(new o00O000o(this));
        OooOo().f59152OooO0o0.setTitleContent(OooOo().f59150OooO0Oo);
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        TextView textViewOooOoO = headerLayout3 != null ? headerLayout3.OooOoO(o0000.OooO0OO(oO00OOo0.moment_message_clear), this.f26124OooOoO0) : null;
        this.f26122OooOo0o = textViewOooOoO;
        if (textViewOooOoO != null) {
            o000OO00.OooO0O0(textViewOooOoO);
        }
        OooOo().f59148OooO0O0.setListener(new oOO00O(this));
        if (!p382o0OOoo0o.o00Ooo.OooO0o()) {
            com.yalla.yalla.ui.adapter.o00oO0o o00oo0oOooOoO0 = OooOoO0();
            o00O00o0 listener = new o00O00o0(this);
            o00oo0oOooOoO0.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            o00oo0oOooOoO0.f44448OooOOO = listener;
        }
        OooOo().f59151OooO0o.setEmptyImage(oOo00OO0.ic_empty_moment);
        OooOo().f59151OooO0o.setEmptyText(o0000.OooO0OO(oO00OOo0.moments_comment_notice_none));
        RecyclerView recyclerView = OooOo().f59149OooO0OO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        oOO0OOO.OooO00o(recyclerView);
        OooOo().f59149OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        OooOo().f59149OooO0OO.setAdapter(OooOoO0());
        OooOoO0().OooO0o0(new p485o0o00O0.oo00o(this));
        OooOoOO(0);
        OooOoO().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOoO().statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> msg) {
        MomentMessage.CommentReply commentReply;
        MomentMessage.MomentComment momentComment;
        Integer numValueOf = msg != null ? Integer.valueOf(msg.f45532OooO00o) : null;
        if (numValueOf != null && numValueOf.intValue() == 553) {
            try {
                T t = msg.f45534OooO0OO;
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.yalla.yalla.data.db.table.MomentMessage");
                this.f26118OooOo = (MomentMessage) t;
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (msg.f45534OooO0OO != 0) {
                OooOo().f59148OooO0O0.setVisibility(8);
                if (this.f26118OooOo != null) {
                    OooOo().f59148OooO0O0.setVisibility(0);
                    MomentMessage momentMessage = this.f26118OooOo;
                    if (momentMessage != null && (momentComment = momentMessage.getMomentComment()) != null) {
                        MomentSendCommentModel momentSendCommentModel = new MomentSendCommentModel(String.valueOf(momentComment.getMomentId()));
                        momentSendCommentModel.setReply(String.valueOf(momentComment.getCommentId()), String.valueOf(momentComment.getUserId()), momentComment.getUserNickName());
                        OooOo().f59148OooO0O0.setSendPostCommentModel(momentSendCommentModel);
                    }
                    MomentMessage momentMessage2 = this.f26118OooOo;
                    if (momentMessage2 == null || (commentReply = momentMessage2.getCommentReply()) == null) {
                        return;
                    }
                    MomentSendCommentModel momentSendCommentModel2 = new MomentSendCommentModel(String.valueOf(commentReply.getMomentId()));
                    momentSendCommentModel2.setReply(String.valueOf(commentReply.getCommentId()), String.valueOf(commentReply.getUserId()), commentReply.getUserNickName());
                    OooOo().f59148OooO0O0.setSendPostCommentModel(momentSendCommentModel2);
                }
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        OooOoO().updateCommentMsgReadState();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter(this, "activity");
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(findViewById(R.id.content).getWindowToken(), 0);
    }
}
