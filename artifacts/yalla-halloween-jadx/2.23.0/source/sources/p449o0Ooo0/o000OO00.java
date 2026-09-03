package p449o0Ooo0;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.module.media.music.MusicScreen;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p449o0Ooo0.o000OO00;
import p519o0o0O0oO.o00O00OO;
import p528o0o0OOOo.oOO0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;
import p641o0ooOOOO.o1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO00 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o1 f46408OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Job f46409OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f46410OooOOO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MusicState.State.values().length];
            try {
                iArr[MusicState.State.Playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicState.State.Pause.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicState.State.Stop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicState.LoopMode.values().length];
            try {
                iArr2[MusicState.LoopMode.LoopAll.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MusicState.LoopMode.LoopSingle.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f46411OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                MusicScreen.navigate$default(MusicScreen.INSTANCE, true, false, null, 0L, null, 30, null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.music.MusicDialog$startProgressLoopJob$1", f = "MusicDialog.kt", i = {0}, l = {318}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46412OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f46414OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = o000OO00.this.new OooO0OO(continuation);
            oooO0OO.f46414OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        /* JADX WARN: Code duplicated, block: B:14:0x0052 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:15:0x0053). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f46412OooO0Oo
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r5.f46414OooO0o0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r6)
                r6 = r5
                goto L53
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.f46414OooO0o0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                r1 = r6
                r6 = r5
            L25:
                androidx.lifecycle.MutableLiveData<com.yalla.yalla.data.db.model.MusicTable> r3 = com.yalla.yalla.data.manager.MusicState.f22835OooO00o
                androidx.lifecycle.MutableLiveData<com.yalla.yalla.data.manager.MusicState$State> r3 = com.yalla.yalla.data.manager.MusicState.f22836OooO0O0
                java.lang.Object r3 = r3.getValue()
                com.yalla.yalla.data.manager.MusicState$State r4 = com.yalla.yalla.data.manager.MusicState.State.Playing
                if (r3 != r4) goto L46
                o0OOOo0O.OooO r3 = p351o0OOOo0O.OooO.OooO0O0()
                o0OOOo0O.OooOO0 r3 = r3.OooO00o()
                int r3 = r3.OooO0O0()
                o0Ooo0.o000OO00 r4 = p449o0Ooo0.o000OO00.this
                o0ooOOOO.o1 r4 = r4.f46408OooOO0O
                android.widget.SeekBar r4 = r4.f58492OooOOO0
                r4.setProgress(r3)
            L46:
                r6.f46414OooO0o0 = r1
                r6.f46412OooO0Oo = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r6)
                if (r3 != r0) goto L53
                return r0
            L53:
                boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r3 != 0) goto L25
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Ooo0.o000OO00.OooO0OO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(@NotNull MixedRoomActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        o1 o1VarInflate = o1.inflate(this.f52534OooO0o0.getLayoutInflater(), this.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(o1VarInflate, "inflate(getDialog().layo…ter, getRootView(), true)");
        this.f46408OooOO0O = o1VarInflate;
        Collection collection = (Collection) MusicState.OooO00o().getValue();
        this.f46410OooOOO0 = !(collection == null || collection.isEmpty());
        if (OooO.OooO0o0()) {
            o1VarInflate.f58485OooO0o0.setRotationY(180.0f);
            o1VarInflate.f58487OooO0oo.setRotationY(180.0f);
        }
        OooO0oo(81);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Window window2 = this.f52535OooO0oO;
        if (window2 != null) {
            window2.setWindowAnimations(oO00Oo00.anim_room_menu);
        }
        ConstraintLayout constraintLayout = o1VarInflate.f58480OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        com.code.android.util.o000OO00.OooO0O0(constraintLayout);
        o1VarInflate.f58487OooO0oo.setOnClickListener(this);
        o1VarInflate.f58485OooO0o0.setOnClickListener(this);
        o1VarInflate.f58479OooO.setOnClickListener(this);
        o1VarInflate.f58488OooOO0.setOnClickListener(this);
        o1VarInflate.f58489OooOO0O.setOnClickListener(this);
        o1VarInflate.f58490OooOO0o.setOnClickListener(this);
        o1VarInflate.f58486OooO0oO.setOnClickListener(this);
        o1VarInflate.f58484OooO0o.setOnClickListener(this);
        o1VarInflate.f58493OooOOOO.setOnClickListener(this);
        o1VarInflate.f58498OooOo00.setOnClickListener(this);
        int i = oOO0.f54103OooO0o0;
        SeekBar seekBar = o1VarInflate.f58491OooOOO;
        seekBar.setProgress(i);
        seekBar.setOnSeekBarChangeListener(new o00O000());
        o1VarInflate.f58492OooOOO0.setOnSeekBarChangeListener(new o00O000o(this));
        MutableLiveData<MusicTable> mutableLiveData = MusicState.f22835OooO00o;
        LifeCycleDialog lifeCycleDialog = this.f52534OooO0o0;
        mutableLiveData.observe(lifeCycleDialog, new o000OOo0(this));
        MusicState.f22838OooO0Oo.observe(lifeCycleDialog, new o00(this));
        MutableLiveData<MusicState.State> mutableLiveData2 = MusicState.f22836OooO0O0;
        mutableLiveData2.observe(lifeCycleDialog, new o00O0000(this));
        MusicState.OooO00o().observe(lifeCycleDialog, new o0O0ooO(this));
        LiveEventBus.get("MUSIC_NEXT_DELETED").observe(lifeCycleDialog, new o00oOoo(this));
        lifeCycleDialog.f27841OooO0Oo.addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.module.media.music.MusicDialog$initObserver$6
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0O0(this, owner);
                o000OO00 o000oo01 = this.f24418OooO0Oo;
                Job job = o000oo01.f46409OooOO0o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                o000oo01.f46409OooOO0o = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o(this, lifecycleOwner);
            }
        });
        MusicState.State value = mutableLiveData2.getValue();
        if ((value == null ? -1 : OooO00o.$EnumSwitchMapping$0[value.ordinal()]) == 1) {
            OooOO0();
        }
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO() {
        super.OooO();
        o0OO000.OooO00o("102140");
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25022OooOoO0.setValue(Boolean.FALSE);
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0Oo() {
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25022OooOoO0.setValue(Boolean.valueOf(this.f46410OooOOO0));
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0o0(@NotNull View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        o1 o1Var = this.f46408OooOO0O;
        boolean zAreEqual = Intrinsics.areEqual(view, o1Var.f58487OooO0oo);
        Context context = this.f52532OooO0Oo;
        if (zAreEqual) {
            o0OO000.OooO00o("102301");
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32882OooO0Oo, null, new oOO00O(this));
            return;
        }
        if (Intrinsics.areEqual(view, o1Var.f58485OooO0o0)) {
            o0OO000.OooO00o("102302");
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32882OooO0Oo, null, new o00O00O(this));
            return;
        }
        boolean z = true;
        if (Intrinsics.areEqual(view, o1Var.f58479OooO)) {
            o0OO000.OooO00o("102300");
            MusicState.State value = MusicState.f22836OooO0O0.getValue();
            i = value != null ? OooO00o.$EnumSwitchMapping$0[value.ordinal()] : -1;
            if (i == 1) {
                boolean z2 = oOO0.f54098OooO00o;
                oOO0.OooO0Oo(false);
                Job job = this.f46409OooOO0o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    return;
                }
                return;
            }
            if (i == 2) {
                boolean z3 = oOO0.f54098OooO00o;
                oOO0.OooO0oo(false);
                OooOO0();
                return;
            } else {
                if (i != 3) {
                    return;
                }
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32882OooO0Oo, null, new o00O00(this));
                return;
            }
        }
        if (Intrinsics.areEqual(view, o1Var.f58488OooOO0)) {
            o0OO000.OooO00o("102307");
            OooO0O0();
            return;
        }
        if (Intrinsics.areEqual(view, o1Var.f58489OooOO0O)) {
            o0OO000.OooO00o("102308");
            Job job2 = this.f46409OooOO0o;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            boolean z4 = oOO0.f54098OooO00o;
            oOO0.OooO();
            this.f46410OooOOO0 = false;
            OooO0O0();
            return;
        }
        boolean zAreEqual2 = Intrinsics.areEqual(view, o1Var.f58490OooOO0o);
        Group group = o1Var.f58483OooO0Oo;
        Group group2 = o1Var.f58481OooO0O0;
        if (zAreEqual2) {
            o0OO000.OooO00o("102304");
            Intrinsics.checkNotNullExpressionValue(group2, "binding.groupControl");
            com.code.android.util.o000OO00.OooO0OO(group2);
            group2.setEnabled(false);
            Intrinsics.checkNotNullExpressionValue(group, "binding.groupSound");
            com.code.android.util.o000OO00.OooOOOO(group);
            return;
        }
        if (!Intrinsics.areEqual(view, o1Var.f58486OooO0oO)) {
            if (Intrinsics.areEqual(view, o1Var.f58484OooO0o)) {
                o0OO000.OooO00o("102306");
                MusicScreen.navigate$default(MusicScreen.INSTANCE, false, false, null, 0L, null, 31, null);
                return;
            }
            if (Intrinsics.areEqual(view, o1Var.f58498OooOo00)) {
                Intrinsics.checkNotNullExpressionValue(group, "binding.groupSound");
                com.code.android.util.o000OO00.OooO0O0(group);
                group2.setEnabled(true);
                Intrinsics.checkNotNullExpressionValue(group2, "binding.groupControl");
                com.code.android.util.o000OO00.OooOOOO(group2);
                return;
            }
            if (Intrinsics.areEqual(view, o1Var.f58493OooOOOO)) {
                o0OO000.OooO00o("102299");
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32882OooO0Oo, null, OooO0O0.f46411OooO0Oo);
                return;
            }
            return;
        }
        o0OO000.OooO00o("102303");
        MutableLiveData<MusicState.LoopMode> mutableLiveData = MusicState.f22838OooO0Oo;
        MusicState.LoopMode value2 = mutableLiveData.getValue();
        i = value2 != null ? OooO00o.$EnumSwitchMapping$1[value2.ordinal()] : -1;
        if (i == 1) {
            mutableLiveData.setValue(MusicState.LoopMode.LoopSingle);
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.music_loop_mode_single);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        mutableLiveData.setValue(MusicState.LoopMode.LoopAll);
        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.music_loop_mode_all);
        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o2.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
        }
    }

    public final void OooOO0() {
        Job job = this.f46409OooOO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f46409OooOO0o = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(null), 3, null);
    }
}
