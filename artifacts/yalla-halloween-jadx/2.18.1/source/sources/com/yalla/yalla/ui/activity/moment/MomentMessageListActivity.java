package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.MomentMessageVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.util.Objects;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0000O0O;
import p089o000o000.o0O0ooO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p470o0Oooo0.o00O000;
import p470o0Oooo0.o00O0000;
import p478o0OooooO.oO0OoOO0;
import p487o0o000oO.o0OOO0o;
import p516o0o0O000.o00000;
import p538o0o0Oo0.o00000O0;
import p538o0o0Oo0.o0000O00;
import p538o0o0Oo0.o0000oo;
import p563o0oOo0.o0000Ooo;
import p649o0ooOOoo.qc;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0017¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentMessageListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Lo00OOOoO/OooO0OO;", "msg", "", "onEventMainThread", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentMessageListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22334OoooooO = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public TextView f22339OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public MomentMessage f22340OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public Job f22341Oooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22335OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(qc.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22336Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentMessageVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22354Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22354Oooo0o;
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
    public final ViewModelLazy f22337Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(YallaChatVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$special$$inlined$viewModels$default$5
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22358Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22358Oooo0o;
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
    public final Lazy f22338OooooO0 = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public OooO0o f22342Oooooo0 = new OooO0o();

    public static final class OooO00o {
        public final void OooO00o(@Nullable Context context) {
            if (context == null) {
                return;
            }
            context.startActivity(new Intent(context, (Class<?>) MomentMessageListActivity.class));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$loadData$1", f = "MomentMessageListActivity.kt", i = {}, l = {194, 195}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f22343Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f22345Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentMessageListActivity$loadData$1$1", f = "MomentMessageListActivity.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<MomentMessage>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f22346Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f22347Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ MomentMessageListActivity f22348Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentMessageListActivity momentMessageListActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f22348Oooo0oo = momentMessageListActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f22348Oooo0oo, continuation);
                oooO00o.f22347Oooo0oO = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0O0ooO<MomentMessage> o0o0ooo, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f22346Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO o0o0ooo = (o0O0ooO) this.f22347Oooo0oO;
                    MomentMessageListActivity momentMessageListActivity = this.f22348Oooo0oo;
                    OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
                    o0000Ooo o0000oooOooOooO = momentMessageListActivity.OooOooO();
                    this.f22346Oooo0o = 1;
                    if (o0000oooOooOooO.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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
            this.f22345Oooo0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentMessageListActivity.this.new OooO0O0(this.f22345Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f22343Oooo0o;
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
            MomentMessageListActivity momentMessageListActivity = MomentMessageListActivity.this;
            OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
            o0000Ooo o0000oooOooOooO = momentMessageListActivity.OooOooO();
            o0O0ooO o0o0ooo = new o0O0ooO(FlowKt.flowOf(new o0000O0O.OooO0o(CollectionsKt.emptyList())), o0O0ooO.f29064OooO0OO);
            this.f22343Oooo0o = 1;
            if (o0000oooOooOooO.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MomentMessageListActivity momentMessageListActivity2 = MomentMessageListActivity.this;
            OooO00o oooO00o2 = MomentMessageListActivity.f22334OoooooO;
            Flow<o0O0ooO<MomentMessage>> flowLoadDataPaging = momentMessageListActivity2.OooOooo().loadDataPaging(this.f22345Oooo0oo);
            OooO00o oooO00o3 = new OooO00o(MomentMessageListActivity.this, null);
            this.f22343Oooo0o = 2;
            if (FlowKt.collectLatest(flowLoadDataPaging, oooO00o3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0000Ooo> {
        public OooO0OO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final o0000Ooo invoke() {
            MomentMessageListActivity momentMessageListActivity = MomentMessageListActivity.this;
            OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
            return new o0000Ooo(momentMessageListActivity, momentMessageListActivity.OooOooo(), (YallaChatVM) MomentMessageListActivity.this.f22337Ooooo0o.getValue());
        }
    }

    public static final class OooO0o extends o00Oo0 {

        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ MomentMessageListActivity f22351Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentMessageListActivity momentMessageListActivity) {
                super(0);
                this.f22351Oooo0o = momentMessageListActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                MomentMessageListActivity momentMessageListActivity = this.f22351Oooo0o;
                OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
                momentMessageListActivity.OooOooo().deleteData(this.f22351Oooo0o.OooOoo().f50374OooO0o0.getSelectType());
                return Unit.INSTANCE;
            }
        }

        public OooO0o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentMessageListActivity momentMessageListActivity = MomentMessageListActivity.this;
            OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
            if (momentMessageListActivity.OooOooO().getItemCount() < 1 || MomentMessageListActivity.this.isDestroyed()) {
                return;
            }
            oo0oOO0 oo0ooo0 = new oo0oOO0(MomentMessageListActivity.this);
            MomentMessageListActivity momentMessageListActivity2 = MomentMessageListActivity.this;
            oo0ooo0.OooOo0(R.string.message_clear_comment_notice);
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            oo0ooo0.OooOo0o(new OooO00o(momentMessageListActivity2));
            oo0ooo0.OooOOO0();
        }
    }

    public final qc OooOoo() {
        return (qc) this.f22335OoooOoo.getValue();
    }

    public final o0000Ooo OooOooO() {
        return (o0000Ooo) this.f22338OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MomentMessageVM OooOooo() {
        return (MomentMessageVM) this.f22336Ooooo00.getValue();
    }

    public final void Oooo000(int i) {
        Job job = this.f22341Oooooo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f22341Oooooo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0O0(i, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        o00O0000 o00o0001 = OooOoo().f50370OooO0O0.f25003OoooO0;
        if (o00o0001 != null) {
            Intrinsics.checkNotNull(o00o0001);
            if (o00o0001.OooO0o0()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            super.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50369OooO00o);
        o0O00000.OooO0OO("Message_moment");
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        p168o00Ooo0.o0OoOo0.OooO();
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO0O0(headerLayout, true, 2);
        }
        TextView textView = OooOoo().f50372OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.titleContent");
        oO0OoOO0.OooO0O0(textView, false, 3);
        OooOoo().f50374OooO0o0.setListener(new o00000O0(this));
        OooOoo().f50374OooO0o0.setTitleContent(OooOoo().f50372OooO0Oo);
        o0O00000.OooO0OO("Moments_notice_all");
        HeaderLayout headerLayout2 = this.f11463OoooO;
        TextView textViewOooOoo = headerLayout2 != null ? headerLayout2.OooOoo(o000O0O0.OooO0OO(R.string.moment_message_clear), this.f22342Oooooo0) : null;
        this.f22339OooooOO = textViewOooOoo;
        if (textViewOooOoo != null) {
            oOO00O.OooO00o(textViewOooOoo);
        }
        OooOoo().f50370OooO0O0.setListener(new p538o0o0Oo0.o0000Ooo(this));
        if (!o0OOO0o.OooO0Oo()) {
            o0000Ooo o0000oooOooOooO = OooOooO();
            o0000O00 listener = new o0000O00(this);
            Objects.requireNonNull(o0000oooOooOooO);
            Intrinsics.checkNotNullParameter(listener, "listener");
            o0000oooOooOooO.f40458OooOOO = listener;
        }
        OooOoo().f50373OooO0o.setEmptyImage(R.drawable.ic_empty_moment);
        OooOoo().f50373OooO0o.setEmptyText(o000O0O0.OooO0OO(R.string.moments_comment_notice_none));
        RecyclerView recyclerView = OooOoo().f50371OooO0OO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        o00000.OooO00o(recyclerView);
        OooOoo().f50371OooO0OO.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoo().f50371OooO0OO.setAdapter(OooOooO());
        OooOooO().OooO0o0(new o0000oo(this));
        Oooo000(0);
        OooOooo().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOooo().statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> msg) {
        MomentMessage.CommentReply commentReply;
        MomentMessage.MomentComment momentComment;
        Integer numValueOf = msg != null ? Integer.valueOf(msg.f31885OooO00o) : null;
        if (numValueOf != null && numValueOf.intValue() == 553) {
            try {
                T t = msg.f31887OooO0OO;
                Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.yalla.yalla.common.db.table.MomentMessage");
                this.f22340OooooOo = (MomentMessage) t;
            } catch (Exception e) {
                e.printStackTrace();
            }
            OooOoo().f50370OooO0O0.setVisibility(8);
            if (this.f22340OooooOo != null) {
                OooOoo().f50370OooO0O0.setVisibility(0);
                MomentMessage momentMessage = this.f22340OooooOo;
                if (momentMessage != null && (momentComment = momentMessage.getMomentComment()) != null) {
                    MomentSendCommentModel momentSendCommentModel = new MomentSendCommentModel(String.valueOf(momentComment.getMomentId()));
                    momentSendCommentModel.setComment(String.valueOf(momentComment.getCommentId()), String.valueOf(momentComment.getUserId()), momentComment.getUserNickName());
                    OooOoo().f50370OooO0O0.setSendPostCommentModel(momentSendCommentModel);
                }
                MomentMessage momentMessage2 = this.f22340OooooOo;
                if (momentMessage2 == null || (commentReply = momentMessage2.getCommentReply()) == null) {
                    return;
                }
                MomentSendCommentModel momentSendCommentModel2 = new MomentSendCommentModel(String.valueOf(commentReply.getMomentId()));
                momentSendCommentModel2.setComment(String.valueOf(commentReply.getCommentId()), String.valueOf(commentReply.getUserId()), commentReply.getUserNickName());
                OooOoo().f50370OooO0O0.setSendPostCommentModel(momentSendCommentModel2);
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        OooOooo().updateCommentMsgReadState();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        MomentsMessagesEditView momentsMessagesEditView = OooOoo().f50370OooO0O0;
        Intrinsics.checkNotNullExpressionValue(momentsMessagesEditView, "binding.momentMessageEditView");
        if (momentsMessagesEditView.getVisibility() == 0) {
            MomentsMessagesEditView momentsMessagesEditView2 = OooOoo().f50370OooO0O0;
            EditTextSpan view = momentsMessagesEditView2.f25000Oooo0o.f49248OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view, "binding.editContent");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
            momentsMessagesEditView2.setVisibility(8);
        }
    }
}
