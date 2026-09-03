package com.yalla.yalla.ui.activity.message;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.cache.SharedGifFaceManager;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.UserBlackVM;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.oO0O0;
import p408o0Oo0OOo.w3;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p587o0oOooO.oOO0O00O;
import p587o0oOooO.oOO0O0O;
import p587o0oOooO.oOo00ooO;
import p593o0oOoooO.h0;
import p646o0ooOOOO.p0;
import p675oO0Oo.s5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/PrivateChatActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View$OnClickListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/view/View;", "v", "", "onClick", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPrivateChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatActivity.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,792:1\n22#2,2:793\n*S KotlinDebug\n*F\n+ 1 PrivateChatActivity.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatActivity\n*L\n104#1:793,2\n*E\n"})
public final class PrivateChatActivity extends BaseFragmentActivity implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final /* synthetic */ int f25240Oooo000 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f25241OooOOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public s5 f25249OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f25251OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public p436o0OoOOOO.oo0oOO0 f25254OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public MutableState<Oooo000> f25255OooOooo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f25242OooOOo0 = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oO0O0.class), this, null);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f25243OooOOoo = true;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f25246OooOo00 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25245OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25247OooOo0O = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25248OooOo0o = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25244OooOo = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f25250OooOoO0 = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final p436o0OoOOOO.o00OOO0 f25253OooOoo0 = new p436o0OoOOOO.o00OOO0(this);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final p436o0OoOOOO.o0 f25252OooOoo = new p436o0OoOOOO.o0(this);

    public static final class OooO extends Lambda implements Function0<p205o00o0o0o.o000O> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p205o00o0o0o.o000O invoke() {
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(PrivateChatActivity.this);
            o000o.OooOo(true);
            return o000o;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@Nullable Context context, @Nullable Long l) {
            if (context == null || l == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PrivateChatActivity.class);
            intent.putExtra(w3.f45736OooO00o, l.longValue());
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<PrivateChatAdapter> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrivateChatAdapter invoke() {
            return new PrivateChatAdapter(PrivateChatActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<BaseMomentDetailVM> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseMomentDetailVM invoke() {
            return (BaseMomentDetailVM) new ViewModelProvider(PrivateChatActivity.this).get(BaseMomentDetailVM.class);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<PrivateChatVM> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrivateChatVM invoke() {
            return (PrivateChatVM) new ViewModelProvider(PrivateChatActivity.this).get(PrivateChatVM.class);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<UserBlackVM> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserBlackVM invoke() {
            return (UserBlackVM) new ViewModelProvider(PrivateChatActivity.this).get(UserBlackVM.class);
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                int i = PrivateChatActivity.f25240Oooo000;
                PrivateChatActivity privateChatActivity = PrivateChatActivity.this;
                privateChatActivity.OooOo0().f44837OooO0o0.f45266OooO0O0.setVisibility(8);
                privateChatActivity.OooOo0().f44838OooO0oO.f45307OooO0O0.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25262OooO0Oo;

        public OooOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25262OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25262OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25262OooO0Oo;
        }

        public final int hashCode() {
            return this.f25262OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25262OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.PrivateChatActivity$onResume$4", f = "PrivateChatActivity.kt", i = {}, l = {652}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25263OooO0Oo;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25263OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedGifFaceManager sharedGifFaceManager = SharedGifFaceManager.f22308OooO00o;
                this.f25263OooO0Oo = 1;
                if (sharedGifFaceManager.OooO00o(this) == coroutine_suspended) {
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

    public static final class OooOOOO extends Lambda implements Function0<YallaChatVM> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatVM invoke() {
            return (YallaChatVM) new ViewModelProvider(PrivateChatActivity.this).get(YallaChatVM.class);
        }
    }

    public final PrivateChatVM OooOo() {
        return (PrivateChatVM) this.f25248OooOo0o.getValue();
    }

    public final oO0O0 OooOo0() {
        return (oO0O0) this.f25242OooOOo0.getValue();
    }

    public final PrivateChatAdapter OooOo0O() {
        return (PrivateChatAdapter) this.f25245OooOo0.getValue();
    }

    public final BaseMomentDetailVM OooOo0o() {
        return (BaseMomentDetailVM) this.f25244OooOo.getValue();
    }

    public final void OooOoO0(Intent intent) {
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        long j = extras.getLong(w3.f45736OooO00o, 0L);
        if (j != OooOo().getTargetId()) {
            MutableState<Oooo000> mutableState = this.f25255OooOooo;
            if (mutableState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState = null;
            }
            mutableState.getValue().OooO00o().setText((CharSequence) null);
        }
        OooOo().setTargetId(j);
        if (OooOo().getChatMessage() != null) {
            PrivateChatAdapter privateChatAdapterOooOo0O = OooOo0O();
            p188o00o00oO.o000O0o<Integer, ChatMessage> pagerSource = OooOo().getChatMessage();
            Intrinsics.checkNotNull(pagerSource);
            privateChatAdapterOooOo0O.getClass();
            Intrinsics.checkNotNullParameter(pagerSource, "pagerSource");
            BuildersKt__Builders_commonKt.launch$default(pagerSource.f38505OooO00o, Dispatchers.getIO(), null, new p0(pagerSource, privateChatAdapterOooOo0O, null), 2, null);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        MutableState<Oooo000> mutableState = this.f25255OooOooo;
        MutableState<Oooo000> mutableState2 = null;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        if (mutableState.getValue().f25224OooO.getValue() != null) {
            MutableState<Oooo000> mutableState3 = this.f25255OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            } else {
                mutableState2 = mutableState3;
            }
            p373o0OOo0oO.o00oO0o value = mutableState2.getValue().f25224OooO.getValue();
            Intrinsics.checkNotNull(value);
            p373o0OOo0oO.o00oO0o o00oo0o2 = value;
            if (o00oo0o2.f43172OooO0o == 2) {
                o00oo0o2.OooO0O0();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        if (id == p565o0oOo000.o0Oo0oo.btInRoom) {
            String strValueOf = String.valueOf(OooOo().getTargetId());
            o00000O0 o00000o1 = new o00000O0(this, true);
            LinkedHashMap linkedHashMapOooO00o = p428o0OoO0o0.OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("touserid", strValueOf);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p386o0OOoo0O.o000oOoO.f43359OooOoo, p386o0OOoo0O.o000oOoO.f43390Oooooo0, linkedHashMapOooO00o, o00000o1);
            return;
        }
        if (id == p565o0oOo000.o0Oo0oo.ivInRoomClose) {
            this.f25241OooOOo = true;
            OooOo0().f44837OooO0o0.f45266OooO0O0.setVisibility(8);
        } else if (id == p565o0oOo000.o0Oo0oo.ivWarnClose) {
            OooOo().updateRiskFriend();
            OooOo0().f44838OooO0oO.f45307OooO0O0.setVisibility(8);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(@NotNull MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        OooOo0O().OooOOOO();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        MutableState<Oooo000> chatBottomState;
        super.onCreate(bundle);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        p381o0OOoOOO.o00O00o0.OooO0OO(window, 0);
        setContentView(OooOo0().f44832OooO00o);
        com.code.android.util.o0000O0O.OooO0o(this, -1, false);
        androidx.core.view.o0 o0Var = new androidx.core.view.o0(getWindow().getDecorView(), getWindow());
        Intrinsics.checkNotNullExpressionValue(o0Var, "getInsetsController(...)");
        o0Var.OooO00o(true);
        h0.OooO0O0("204007");
        PrivateChatVM privateChatVMOooOo = OooOo();
        oO0O0 oo0o0OooOo0 = OooOo0();
        final p436o0OoOOOO.o0 o0Var2 = this.f25252OooOoo;
        p436o0OoOOOO.oo0oOO0 oo0ooo0 = new p436o0OoOOOO.oo0oOO0(this, o0Var2, privateChatVMOooOo, oo0o0OooOo0);
        BaseMomentDetailVM baseMomentDetailVMOooOo0o = OooOo0o();
        Intrinsics.checkNotNullParameter(baseMomentDetailVMOooOo0o, "<set-?>");
        oo0ooo0.f46997OooO0Oo = baseMomentDetailVMOooOo0o;
        this.f25254OooOooO = oo0ooo0;
        this.f25255OooOooo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Oooo000(this, oo0ooo0, o0Var2), null, 2, null);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-605407946, true, new o0000(this)));
        oO0O0 mBinding = OooOo0();
        UserBlackVM userBlackVM = (UserBlackVM) this.f25250OooOoO0.getValue();
        PrivateChatVM privateChatVM = OooOo();
        PrivateChatAdapter chatAdapter = OooOo0O();
        MutableState<Oooo000> mutableState = this.f25255OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            chatBottomState = null;
        } else {
            chatBottomState = mutableState;
        }
        final p436o0OoOOOO.o00OOO0 o00ooo1 = this.f25253OooOoo0;
        o00ooo1.getClass();
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(userBlackVM, "userBlackVM");
        Intrinsics.checkNotNullParameter(privateChatVM, "privateChatVM");
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        HeaderLayout fitTopInset = mBinding.f44833OooO0O0.f44250OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fitTopInset, "headerLayout");
        Intrinsics.checkNotNullParameter(fitTopInset, "$this$fitTopInset");
        p381o0OOoOOO.o00O00OO o00o00oo2 = new p381o0OOoOOO.o00O00OO(fitTopInset, true, true);
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        ViewCompat.OooOOO.OooOo0(fitTopInset, o00o00oo2);
        fitTopInset.OooOo0O();
        fitTopInset.setNavigationOnClickListener(new View.OnClickListener() { // from class: o0OoOOOO.o00OO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00OOO0 this$0 = o00ooo1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f46952OooO00o.onBackPressed();
            }
        });
        privateChatVM.isFriendLiveData().observe(o00ooo1.f46952OooO00o, new o0OoOOOO.o00OOO0.OooO0O0(new p436o0OoOOOO.o00OOO00(chatBottomState, o00ooo1, chatAdapter, fitTopInset, userBlackVM, privateChatVM)));
        this.f22289OooOO0 = fitTopInset;
        OooOo0().f44837OooO0o0.f45266OooO0O0.setVisibility(8);
        Button button = (Button) findViewById(p565o0oOo000.o0Oo0oo.btInRoom);
        ImageView imageView = (ImageView) findViewById(p565o0oOo000.o0Oo0oo.ivInRoomClose);
        button.setOnClickListener(this);
        imageView.setOnClickListener(this);
        OooOo0().f44838OooO0oO.f45307OooO0O0.setVisibility(8);
        TextView textView = (TextView) findViewById(p565o0oOo000.o0Oo0oo.tvWarn);
        String string = getString(p565o0oOo000.o000OOo.private_chat_warning);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(p565o0oOo000.o000OOo.Report);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(androidx.camera.core.impl.OooOOOO.OooO00o(string, string2));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) androidx.camera.core.impl.OooOOOO.OooO00o(string, string2), string2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new o000O0O0(this), iIndexOf$default, string2.length() + iIndexOf$default, 33);
        textView.setText(spannableStringBuilder);
        if (oOo00ooO.f56853OooO0O0 == null) {
            oOo00ooO.f56853OooO0O0 = new oOo00ooO();
        }
        textView.setMovementMethod(oOo00ooO.f56853OooO0O0);
        textView.setHighlightColor(getResources().getColor(R.color.transparent));
        ((ImageView) findViewById(p565o0oOo000.o0Oo0oo.ivWarnClose)).setOnClickListener(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(p565o0oOo000.o0Oo0oo.flChat);
        OooOo0().f44835OooO0Oo.setOnClickListener(new o0Oo0oo(this, 0));
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this);
        fixLinearLayoutManager.setReverseLayout(true);
        OooOo0().f44831OooO.setLayoutManager(fixLinearLayoutManager);
        OooOo0O().f26972OooOo = new o0000O0O(this);
        OooOo0().f44831OooO.setAdapter(OooOo0O());
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o0OO00O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = PrivateChatActivity.f25240Oooo000;
                PrivateChatActivity this$0 = this.f25527OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p436o0OoOOOO.oo0oOO0 oo0ooo1 = this$0.f25254OooOooO;
                MutableState<Oooo000> mutableState2 = null;
                if (oo0ooo1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatGiftSendManager");
                    oo0ooo1 = null;
                }
                MutableState<Oooo000> mutableState3 = this$0.f25255OooOooo;
                if (mutableState3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                    mutableState3 = null;
                }
                oo0ooo1.OooO00o(mutableState3.getValue());
                MutableState<Oooo000> mutableState4 = this$0.f25255OooOooo;
                if (mutableState4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                } else {
                    mutableState2 = mutableState4;
                }
                p373o0OOo0oO.o00oO0o value = mutableState2.getValue().f25224OooO.getValue();
                if (value == null) {
                    return false;
                }
                value.OooO00o();
                return false;
            }
        });
        RecyclerView rvChat = OooOo0().f44831OooO;
        Intrinsics.checkNotNullExpressionValue(rvChat, "rvChat");
        oOO0O0O.OooO0O0(rvChat, 100L, 0L, 100L, 100L);
        OooOo0O().OooO0o0(new o000OO(this));
        OooOo0().f44831OooO.addOnScrollListener(new o0000O(this));
        PrivateChatAdapter privateChatAdapterOooOo0O = OooOo0O();
        o000O000 listener = new o000O000(this);
        privateChatAdapterOooOo0O.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        privateChatAdapterOooOo0O.f57586OooOO0o = listener;
        PrivateChatAdapter privateChatAdapterOooOo0O2 = OooOo0O();
        o000Oo0 listener2 = new o000Oo0(this);
        privateChatAdapterOooOo0O2.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        privateChatAdapterOooOo0O2.f57587OooOOO = listener2;
        PrivateChatAdapter privateChatAdapterOooOo0O3 = OooOo0O();
        o000O00 listener3 = new o000O00(this);
        privateChatAdapterOooOo0O3.getClass();
        Intrinsics.checkNotNullParameter(listener3, "listener");
        privateChatAdapterOooOo0O3.f26973OooOo0 = listener3;
        PrivateChatAdapter privateChatAdapterOooOo0O4 = OooOo0O();
        o000O00O listener4 = new o000O00O(this);
        privateChatAdapterOooOo0O4.getClass();
        Intrinsics.checkNotNullParameter(listener4, "listener");
        privateChatAdapterOooOo0O4.f26975OooOo0O = listener4;
        MutableState<Oooo000> mutableState2 = this.f25255OooOooo;
        if (mutableState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState2 = null;
        }
        Oooo000 value = mutableState2.getValue();
        LinearLayout layoutYallaChat = OooOo0().f44835OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(layoutYallaChat, "layoutYallaChat");
        value.getClass();
        Intrinsics.checkNotNullParameter(layoutYallaChat, "<set-?>");
        value.f25238OooOOOO = layoutYallaChat;
        PrivateChatVM privateChatVMOooOo2 = OooOo();
        Intrinsics.checkNotNullParameter(privateChatVMOooOo2, "<set-?>");
        value.f25236OooOOO = privateChatVMOooOo2;
        Intrinsics.checkNotNullParameter(o0Var2, "<set-?>");
        value.f25237OooOOO0 = o0Var2;
        ComposeView privateChatBottomCompose = OooOo0().f44839OooO0oo;
        Intrinsics.checkNotNullExpressionValue(privateChatBottomCompose, "privateChatBottomCompose");
        p193o00o0O0O.o0000oo.OooO0Oo(privateChatBottomCompose, ComposableLambdaKt.composableLambdaInstance(-977081340, true, new o00000OO(this)));
        oO0O0 binding = OooOo0();
        final PrivateChatVM privateChatVM2 = OooOo();
        o0Var2.getClass();
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(privateChatVM2, "privateChatVM");
        o0Var2.f46927OooO0O0 = binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            binding = null;
        }
        binding.f44836OooO0o.f45313OooO0o.setOnTouchListener(new View.OnTouchListener() { // from class: o0OoOOOO.o00Oo00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o0 this$0 = o0Var2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PrivateChatVM privateChatVM3 = privateChatVM2;
                Intrinsics.checkNotNullParameter(privateChatVM3, "$privateChatVM");
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                int action = motionEvent.getAction();
                oO0O0 oo0o0 = null;
                if (action == 0) {
                    oO0O0 oo0o1 = this$0.f46927OooO0O0;
                    if (oo0o1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o1 = null;
                    }
                    oo0o1.f44836OooO0o.f45315OooO0oO.setVisibility(0);
                    oO0O0 oo0o2 = this$0.f46927OooO0O0;
                    if (oo0o2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o2 = null;
                    }
                    oo0o2.f44836OooO0o.f45310OooO0O0.setVisibility(8);
                    oO0O0 oo0o3 = this$0.f46927OooO0O0;
                    if (oo0o3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o3 = null;
                    }
                    oo0o3.f44836OooO0o.f45313OooO0o.setImageResource(o0OOO0o.icon_voice_recording);
                    oO0O0 oo0o4 = this$0.f46927OooO0O0;
                    if (oo0o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o4 = null;
                    }
                    oo0o4.f44836OooO0o.f45317OooOO0.setText(o000000.OooO0Oo(Float.valueOf(30.0f)) + "\"");
                    o0oOOo o0oooo = this$0.f46935OooOO0O;
                    if (o0oooo != null) {
                        Intrinsics.checkNotNull(o0oooo);
                        o0oooo.cancel();
                        this$0.f46935OooOO0O = null;
                    }
                    Timer timer = this$0.f46934OooOO0;
                    if (timer != null) {
                        Intrinsics.checkNotNull(timer);
                        timer.cancel();
                        Timer timer2 = this$0.f46934OooOO0;
                        Intrinsics.checkNotNull(timer2);
                        timer2.purge();
                        this$0.f46934OooOO0 = null;
                    }
                    this$0.f46934OooOO0 = new Timer();
                    this$0.f46935OooOO0O = new o0oOOo(this$0, motionEvent, privateChatVM3);
                    Timer timer3 = this$0.f46934OooOO0;
                    Intrinsics.checkNotNull(timer3);
                    timer3.schedule(this$0.f46935OooOO0O, 600L);
                } else if (action == 1) {
                    oO0O0 oo0o5 = this$0.f46927OooO0O0;
                    if (oo0o5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        oo0o0 = oo0o5;
                    }
                    if (oo0o0.f44836OooO0o.f45315OooO0oO.getVisibility() == 0) {
                        this$0.f46926OooO00o.runOnUiThread(new o0oOO(this$0, motionEvent, privateChatVM3));
                    }
                } else if (action == 2) {
                    int[] iArr = new int[2];
                    oO0O0 oo0o6 = this$0.f46927OooO0O0;
                    if (oo0o6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o6 = null;
                    }
                    oo0o6.f44836OooO0o.f45317OooOO0.getLocationOnScreen(iArr);
                    this$0.f46931OooO0o0 = iArr[1];
                    if (motionEvent.getRawY() < this$0.f46931OooO0o0) {
                        oO0O0 oo0o7 = this$0.f46927OooO0O0;
                        if (oo0o7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o7 = null;
                        }
                        oo0o7.f44836OooO0o.f45308OooO.setText(o0000.OooO0OO(o000OOo.release_to_cancel));
                        oO0O0 oo0o8 = this$0.f46927OooO0O0;
                        if (oo0o8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o8 = null;
                        }
                        oo0o8.f44836OooO0o.f45310OooO0O0.setVisibility(0);
                        oO0O0 oo0o9 = this$0.f46927OooO0O0;
                        if (oo0o9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            oo0o0 = oo0o9;
                        }
                        oo0o0.f44836OooO0o.f45311OooO0OO.setVisibility(4);
                    } else {
                        oO0O0 oo0o10 = this$0.f46927OooO0O0;
                        if (oo0o10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o10 = null;
                        }
                        oo0o10.f44836OooO0o.f45308OooO.setText(o0000.OooO0OO(o000OOo.slide_up_to_cancel));
                        oO0O0 oo0o11 = this$0.f46927OooO0O0;
                        if (oo0o11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o11 = null;
                        }
                        oo0o11.f44836OooO0o.f45310OooO0O0.setVisibility(8);
                        oO0O0 oo0o12 = this$0.f46927OooO0O0;
                        if (oo0o12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            oo0o0 = oo0o12;
                        }
                        oo0o0.f44836OooO0o.f45311OooO0OO.setVisibility(0);
                    }
                }
                return true;
            }
        });
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        OooOoO0(intent);
        OooOo().getChatUserInfo().observe(this, new o000000O(0, this));
        OooOo().getFriendRemarkLiveData().observe(this, new OooOOO(new o0000O00(this)));
        OooOo().loadConversation().observe(this, new o00000(this, 0));
        OooOo().isFriendLiveData().observe(this, new OooOOO(new o0000O0(this)));
        Class cls = Boolean.TYPE;
        int i = 0;
        LiveEventBus.get("GiftBackpackFrozen_IM", cls).observe(this, new oo0o0Oo(this, i));
        LiveEventBus.get("WealthLevelInsufficient_IM", cls).observe(this, new o0O0O00(this, i));
        LiveEventBus.get("MOMENT_DETAIL_DATA_REFRESH_FOR_PRIVATE_CHAT", String.class).observe(this, new o000OOo(i, this));
        LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT", MessageIM.SendGiftReply.class).observe(this, new o000000(i, this));
        OooOo().getRoomThemeGiveState().observe(this, new OooOOO(new o000O0Oo(this)));
        OooOo().getRoomThemeAccept().observe(this, new OooOOO(new o000OO0O(this)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        oOO0O00O ooo0o00o = this.f25252OooOoo.f46929OooO0Oo;
        MediaPlayer mediaPlayer = ooo0o00o.f56799OooO00o;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        ooo0o00o.f56799OooO00o.stop();
        ooo0o00o.f56799OooO00o.release();
        ooo0o00o.f56799OooO00o = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        OooOoO0(intent);
        if (com.code.android.util.OooOo00.OooO00o(OooOo().userInfo()) && com.code.android.util.OooOo00.OooO0O0(this)) {
            finish();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        PrivateChatVM privateChatVMOooOo = OooOo();
        MutableState<Oooo000> mutableState = this.f25255OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        privateChatVMOooOo.saveDraftMessage(String.valueOf(mutableState.getValue().OooO00o().getText()));
        if (OooOo().userInfo() != null) {
            PrivateChatVM privateChatVMOooOo2 = OooOo();
            UserInfo userInfo = OooOo().userInfo();
            Intrinsics.checkNotNull(userInfo);
            privateChatVMOooOo2.updateConversationCount(userInfo.getUserId());
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (OooOo().userInfo() != null) {
            PrivateChatVM privateChatVMOooOo = OooOo();
            UserInfo userInfo = OooOo().userInfo();
            Intrinsics.checkNotNull(userInfo);
            privateChatVMOooOo.updateConversationCount(userInfo.getUserId());
        }
        MutableState mutableState = p431o0OoOO.o0Oo0oo.f46817OooO00o;
        if (p431o0OoOO.o0Oo0oo.OooO0oO() != RoomState.Close) {
            MutableState<Oooo000> mutableState2 = this.f25255OooOooo;
            if (mutableState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState2 = null;
            }
            mutableState2.getValue().f25232OooO0oo.setValue(Boolean.FALSE);
            MutableState<Oooo000> mutableState3 = this.f25255OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState3 = null;
            }
            this.f25252OooOoo.OooO00o(mutableState3.getValue());
        } else {
            MutableState<Oooo000> mutableState4 = this.f25255OooOooo;
            if (mutableState4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState4 = null;
            }
            mutableState4.getValue().f25232OooO0oo.setValue(Boolean.TRUE);
        }
        OooOo().checkUserRisk().observe(this, new OooOOO(new OooOO0O()));
        App.f22238OooO0oO.postDelayed(new androidx.camera.core.impl.oo0o0Oo(this, 2), 5000L);
        UserInfo userInfo2 = OooOo().userInfo();
        if (userInfo2 != null) {
            ((UserBlackVM) this.f25250OooOoO0.getValue()).checkIsFriendAndBlock(userInfo2.getUserId());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOOO0(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        MutableState<Oooo000> mutableState = this.f25255OooOooo;
        MutableState<Oooo000> mutableState2 = null;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        EmojiEditText view = mutableState.getValue().OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p373o0OOo0oO.o00Oo0.OooO00o(view.getContext().getApplicationContext(), new Handler(), p373o0OOo0oO.o0OOO0o.OooO00o(context), view.getWindowToken(), 0);
        MutableState<Oooo000> mutableState3 = this.f25255OooOooo;
        if (mutableState3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState3 = null;
        }
        mutableState3.getValue().OooO00o().clearFocus();
        MutableState<Oooo000> mutableState4 = this.f25255OooOooo;
        if (mutableState4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
        } else {
            mutableState2 = mutableState4;
        }
        p373o0OOo0oO.o00oO0o value = mutableState2.getValue().f25224OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        this.f25252OooOoo.f46929OooO0Oo.OooO0O0();
    }
}
