package p471o0OoooO0;

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
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
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
import p405o0Oo0OOO.o0O000o0;
import p471o0OoooO0.o0O000Oo;
import p535o0o0Oo0.oO0O00;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O000Oo extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o0O000o0 f47877OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Job f47878OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f47879OooOOO0;

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
        public static final OooO0O0 f47880OooO0Oo = new OooO0O0();

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
        public int f47881OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f47883OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = o0O000Oo.this.new OooO0OO(continuation);
            oooO0OO.f47883OooO0o0 = obj;
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
                int r1 = r5.f47881OooO0Oo
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r5.f47883OooO0o0
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
                java.lang.Object r6 = r5.f47883OooO0o0
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                r1 = r6
                r6 = r5
            L25:
                androidx.lifecycle.MutableLiveData<com.yalla.yalla.data.db.model.MusicTable> r3 = com.yalla.yalla.data.manager.MusicState.f22362OooO00o
                androidx.lifecycle.MutableLiveData<com.yalla.yalla.data.manager.MusicState$State> r3 = com.yalla.yalla.data.manager.MusicState.f22363OooO0O0
                java.lang.Object r3 = r3.getValue()
                com.yalla.yalla.data.manager.MusicState$State r4 = com.yalla.yalla.data.manager.MusicState.State.Playing
                if (r3 != r4) goto L46
                o0OOOo0o.OooO0o r3 = p355o0OOOo0o.OooO0o.OooO0O0()
                o0OOOo0o.OooO r3 = r3.OooO00o()
                int r3 = r3.OooO0O0()
                o0OoooO0.o0O000Oo r4 = p471o0OoooO0.o0O000Oo.this
                o0Oo0OOO.o0O000o0 r4 = r4.f47877OooOO0O
                android.widget.SeekBar r4 = r4.f44427OooOOO0
                r4.setProgress(r3)
            L46:
                r6.f47883OooO0o0 = r1
                r6.f47881OooO0Oo = r2
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
            throw new UnsupportedOperationException("Method not decompiled: o0OoooO0.o0O000Oo.OooO0OO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(@NotNull MixedRoomActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        int i = 0;
        o0O000o0 o0o000o0Inflate = o0O000o0.inflate(this.f58509OooO0o0.getLayoutInflater(), this.f58508OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(o0o000o0Inflate, "inflate(...)");
        this.f47877OooOO0O = o0o000o0Inflate;
        Collection collection = (Collection) MusicState.OooO00o().getValue();
        this.f47879OooOOO0 = !(collection == null || collection.isEmpty());
        if (OooOo00.OooO0o0()) {
            o0o000o0Inflate.f44420OooO0o0.setRotationY(180.0f);
            o0o000o0Inflate.f44422OooO0oo.setRotationY(180.0f);
        }
        OooO0oo(81);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Window window2 = this.f58510OooO0oO;
        if (window2 != null) {
            window2.setWindowAnimations(o000000O.anim_room_menu);
        }
        ConstraintLayout constraintLayout = o0o000o0Inflate.f44415OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        o000O.OooO0O0(constraintLayout);
        o0o000o0Inflate.f44422OooO0oo.setOnClickListener(this);
        o0o000o0Inflate.f44420OooO0o0.setOnClickListener(this);
        o0o000o0Inflate.f44414OooO.setOnClickListener(this);
        o0o000o0Inflate.f44423OooOO0.setOnClickListener(this);
        o0o000o0Inflate.f44424OooOO0O.setOnClickListener(this);
        o0o000o0Inflate.f44425OooOO0o.setOnClickListener(this);
        o0o000o0Inflate.f44421OooO0oO.setOnClickListener(this);
        o0o000o0Inflate.f44419OooO0o.setOnClickListener(this);
        o0o000o0Inflate.f44428OooOOOO.setOnClickListener(this);
        o0o000o0Inflate.f44433OooOo00.setOnClickListener(this);
        int i2 = oO0O00.f53975OooO0o0;
        SeekBar seekBar = o0o000o0Inflate.f44426OooOOO;
        seekBar.setProgress(i2);
        seekBar.setOnSeekBarChangeListener(new o0O000o0());
        o0o000o0Inflate.f44427OooOOO0.setOnSeekBarChangeListener(new o0O00(this));
        MutableLiveData<MusicTable> mutableLiveData = MusicState.f22362OooO00o;
        LifeCycleDialog lifeCycleDialog = this.f58509OooO0o0;
        mutableLiveData.observe(lifeCycleDialog, new o0O00000(this, i));
        MusicState.f22365OooO0Oo.observe(lifeCycleDialog, new Observer() { // from class: o0OoooO0.o0O0000O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicState.LoopMode loopMode = (MusicState.LoopMode) obj;
                o0O000Oo this$0 = this.f47874OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = loopMode == null ? -1 : o0O000Oo.OooO00o.$EnumSwitchMapping$1[loopMode.ordinal()];
                if (i3 == 1) {
                    this$0.f47877OooOO0O.f44421OooO0oO.setImageResource(o0Oo0oo.ic_music_dialog_loop_all);
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    this$0.f47877OooOO0O.f44421OooO0oO.setImageResource(o0Oo0oo.ic_dialog_muisc_loop_single);
                }
            }
        });
        MutableLiveData<MusicState.State> mutableLiveData2 = MusicState.f22363OooO0O0;
        mutableLiveData2.observe(lifeCycleDialog, new o0O000(i, this));
        MusicState.OooO00o().observe(lifeCycleDialog, new o0O000O(i, this));
        LiveEventBus.get("MUSIC_NEXT_DELETED").observe(lifeCycleDialog, new o0OoOoOo(0, this));
        lifeCycleDialog.f27379OooO0Oo.addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.module.media.music.MusicDialog$initObserver$6
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO0OO.OooO0O0(this, owner);
                o0O000Oo o0o000oo2 = this.f23951OooO0Oo;
                Job job = o0o000oo2.f47878OooOO0o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                o0o000oo2.f47878OooOO0o = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
        MusicState.State value = mutableLiveData2.getValue();
        if ((value == null ? -1 : OooO00o.$EnumSwitchMapping$0[value.ordinal()]) == 1) {
            OooOO0();
        }
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO() {
        super.OooO();
        o0oo0000.OooO00o.OooO0O0("102140");
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24560OooOoO0.setValue(Boolean.FALSE);
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0Oo() {
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24560OooOoO0.setValue(Boolean.valueOf(this.f47879OooOOO0));
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0o0(@NotNull View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        o0O000o0 o0o000o1 = this.f47877OooOO0O;
        boolean zAreEqual = Intrinsics.areEqual(view, o0o000o1.f44422OooO0oo);
        Context context = this.f58507OooO0Oo;
        if (zAreEqual) {
            o0oo0000.OooO00o.OooO0O0("102301");
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32338OooO0Oo, null, new o0O00O(this));
            return;
        }
        if (Intrinsics.areEqual(view, o0o000o1.f44420OooO0o0)) {
            o0oo0000.OooO00o.OooO0O0("102302");
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32338OooO0Oo, null, new o0O00O0o(this));
            return;
        }
        boolean z = true;
        if (Intrinsics.areEqual(view, o0o000o1.f44414OooO)) {
            o0oo0000.OooO00o.OooO0O0("102300");
            MusicState.State value = MusicState.f22363OooO0O0.getValue();
            i = value != null ? OooO00o.$EnumSwitchMapping$0[value.ordinal()] : -1;
            if (i == 1) {
                boolean z2 = oO0O00.f53970OooO00o;
                oO0O00.OooO0Oo(false);
                Job job = this.f47878OooOO0o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    return;
                }
                return;
            }
            if (i == 2) {
                boolean z3 = oO0O00.f53970OooO00o;
                oO0O00.OooO0oo(false);
                OooOO0();
                return;
            } else {
                if (i != 3) {
                    return;
                }
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32338OooO0Oo, null, new o0OoO00O(this));
                return;
            }
        }
        if (Intrinsics.areEqual(view, o0o000o1.f44423OooOO0)) {
            o0oo0000.OooO00o.OooO0O0("102307");
            OooO0O0();
            return;
        }
        if (Intrinsics.areEqual(view, o0o000o1.f44424OooOO0O)) {
            o0oo0000.OooO00o.OooO0O0("102308");
            Job job2 = this.f47878OooOO0o;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            boolean z4 = oO0O00.f53970OooO00o;
            oO0O00.OooO();
            this.f47879OooOOO0 = false;
            OooO0O0();
            return;
        }
        boolean zAreEqual2 = Intrinsics.areEqual(view, o0o000o1.f44425OooOO0o);
        Group groupSound = o0o000o1.f44418OooO0Oo;
        Group groupControl = o0o000o1.f44416OooO0O0;
        if (zAreEqual2) {
            o0oo0000.OooO00o.OooO0O0("102304");
            Intrinsics.checkNotNullExpressionValue(groupControl, "groupControl");
            o000O.OooO0OO(groupControl);
            groupControl.setEnabled(false);
            Intrinsics.checkNotNullExpressionValue(groupSound, "groupSound");
            o000O.OooOOOO(groupSound);
            return;
        }
        if (!Intrinsics.areEqual(view, o0o000o1.f44421OooO0oO)) {
            if (Intrinsics.areEqual(view, o0o000o1.f44419OooO0o)) {
                o0oo0000.OooO00o.OooO0O0("102306");
                MusicScreen.navigate$default(MusicScreen.INSTANCE, false, false, null, 0L, null, 31, null);
                return;
            }
            if (Intrinsics.areEqual(view, o0o000o1.f44433OooOo00)) {
                Intrinsics.checkNotNullExpressionValue(groupSound, "groupSound");
                o000O.OooO0O0(groupSound);
                groupControl.setEnabled(true);
                Intrinsics.checkNotNullExpressionValue(groupControl, "groupControl");
                o000O.OooOOOO(groupControl);
                return;
            }
            if (Intrinsics.areEqual(view, o0o000o1.f44428OooOOOO)) {
                o0oo0000.OooO00o.OooO0O0("102299");
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32338OooO0Oo, null, OooO0O0.f47880OooO0Oo);
                return;
            }
            return;
        }
        o0oo0000.OooO00o.OooO0O0("102303");
        MutableLiveData<MusicState.LoopMode> mutableLiveData = MusicState.f22365OooO0Oo;
        MusicState.LoopMode value2 = mutableLiveData.getValue();
        i = value2 != null ? OooO00o.$EnumSwitchMapping$1[value2.ordinal()] : -1;
        if (i == 1) {
            mutableLiveData.setValue(MusicState.LoopMode.LoopSingle);
            String strOooO0OO = o0000.OooO0OO(o000000.music_loop_mode_single);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        mutableLiveData.setValue(MusicState.LoopMode.LoopAll);
        String strOooO0OO2 = o0000.OooO0OO(o000000.music_loop_mode_all);
        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o2.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
        }
    }

    public final void OooOO0() {
        Job job = this.f47878OooOO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f47878OooOO0o = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(null), 3, null);
    }
}
