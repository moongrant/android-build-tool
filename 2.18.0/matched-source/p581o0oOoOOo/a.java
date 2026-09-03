package p581o0oOoOOo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.activity.room.MusicActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Collection;
import java.util.HashMap;
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
import p074o000O0oo.OooOOO;
import p143o00OOooO.o000O0O0;
import p143o00OOooO.o00O0000;
import p169o00Ooo0.oo000o;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p448o0OoOo0o.o0O0o000;
import p503o0o00o.o0000O0O;
import p503o0o00o.o000OO;
import p504o0o00o0.o00000O;
import p532o0o0OOO.o00OO0O0;
import p619o0oo0o.o00;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;
import p651o0ooOOoo.z7;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class a extends o00000O {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final z7 f45896OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public Job f45897OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f45898OoooOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MusicState.State.values().length];
            iArr[MusicState.State.Playing.ordinal()] = 1;
            iArr[MusicState.State.Pause.ordinal()] = 2;
            iArr[MusicState.State.Stop.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicState.LoopMode.values().length];
            iArr2[MusicState.LoopMode.LoopAll.ordinal()] = 1;
            iArr2[MusicState.LoopMode.LoopSingle.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                Activity activity = (Activity) a.this.f41561Oooo;
                int i = MusicActivity.f22922Ooooooo;
                Intent intent = new Intent(activity, (Class<?>) MusicActivity.class);
                intent.putExtra("MusicActivity_IsAddMusic", true);
                activity.startActivityForResult(intent, 114);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.MusicDialog$startProgressLoopJob$1", f = "MusicDialog.kt", i = {0}, l = {295}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f45900Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f45902OoooO00;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = a.this.new OooO0OO(continuation);
            oooO0OO.f45902OoooO00 = obj;
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
                int r1 = r5.f45900Oooo
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r5.f45902OoooO00
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
                java.lang.Object r6 = r5.f45902OoooO00
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                r1 = r6
                r6 = r5
            L25:
                com.yalla.yalla.data.manager.MusicState r3 = com.yalla.yalla.data.manager.MusicState.f21421OooO00o
                androidx.lifecycle.MutableLiveData<com.yalla.yalla.data.manager.MusicState$State> r3 = com.yalla.yalla.data.manager.MusicState.f21423OooO0OO
                java.lang.Object r3 = r3.getValue()
                com.yalla.yalla.data.manager.MusicState$State r4 = com.yalla.yalla.data.manager.MusicState.State.Playing
                if (r3 != r4) goto L46
                o0OoOo0o.o0O0o000 r3 = p448o0OoOo0o.o0O0o000.OooO0O0()
                o0OoOo0o.o0O0o0 r3 = r3.OooO00o()
                int r3 = r3.OooO()
                o0oOoOOo.a r4 = p581o0oOoOOo.a.this
                o0ooOOoo.z7 r4 = r4.f45896OoooOOO
                android.widget.SeekBar r4 = r4.f51079OooOOO0
                r4.setProgress(r3)
            L46:
                r3 = 1000(0x3e8, double:4.94E-321)
                r6.f45902OoooO00 = r1
                r6.f45900Oooo = r2
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r6)
                if (r3 != r0) goto L53
                return r0
            L53:
                boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r3 != 0) goto L25
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o0oOoOOo.a.OooO0OO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        z7 z7VarInflate = z7.inflate(this.f41564OoooO00.getLayoutInflater(), this.f41563OoooO0, true);
        Intrinsics.checkNotNullExpressionValue(z7VarInflate, "inflate(getDialog().layo…ter, getRootView(), true)");
        this.f45896OoooOOO = z7VarInflate;
        MusicState musicState = MusicState.f21421OooO00o;
        Collection collection = (Collection) MusicState.OooO00o().getValue();
        this.f45898OoooOo0 = !(collection == null || collection.isEmpty());
        if (oo000o.OooO0o0()) {
            z7VarInflate.f51072OooO0o0.setRotationY(180.0f);
            z7VarInflate.f51074OooO0oo.setRotationY(180.0f);
        }
        OooO0oo(81);
        Window window = this.f41565OoooO0O;
        if (window != null) {
            window.setDimAmount(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        Window window2 = this.f41565OoooO0O;
        if (window2 != null) {
            window2.setWindowAnimations(R.style.anim_room_menu);
        }
        ConstraintLayout constraintLayout = z7VarInflate.f51067OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o00O0O.OooO00o(constraintLayout);
        z7VarInflate.f51074OooO0oo.setOnClickListener(this);
        z7VarInflate.f51072OooO0o0.setOnClickListener(this);
        z7VarInflate.f51066OooO.setOnClickListener(this);
        z7VarInflate.f51075OooOO0.setOnClickListener(this);
        z7VarInflate.f51076OooOO0O.setOnClickListener(this);
        z7VarInflate.f51077OooOO0o.setOnClickListener(this);
        z7VarInflate.f51073OooO0oO.setOnClickListener(this);
        z7VarInflate.f51071OooO0o.setOnClickListener(this);
        z7VarInflate.f51080OooOOOO.setOnClickListener(this);
        z7VarInflate.f51085OooOo00.setOnClickListener(this);
        SeekBar seekBar = z7VarInflate.f51078OooOOO;
        o00 o00Var = o00.f48478OooO00o;
        seekBar.setProgress(o00.f48482OooO0o);
        z7VarInflate.f51078OooOOO.setOnSeekBarChangeListener(new b());
        z7VarInflate.f51079OooOOO0.setOnSeekBarChangeListener(new c(this));
        MusicState.f21422OooO0O0.observe(this.f41564OoooO00, new o000O0O0(this, 6));
        int i = 5;
        MusicState.f21425OooO0o0.observe(this.f41564OoooO00, new p143o00OOooO.o00(this, i));
        MutableLiveData<MusicState.State> mutableLiveData = MusicState.f21423OooO0OO;
        mutableLiveData.observe(this.f41564OoooO00, new o00O0000(this, i));
        MusicState.OooO00o().observe(this.f41564OoooO00, new o000OO(this, 3));
        LiveEventBus.get("MUSIC_NEXT_DELETED").observe(this.f41564OoooO00, new o0000O0O(this, i));
        this.f41564OoooO00.f20893Oooo.addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.ui.dialog.MusicDialog$initObserver$6
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO0O0.OooO0O0(this, owner);
                Job job = this.f23758Oooo.f45897OoooOOo;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.f23758Oooo.f45897OoooOOo = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0O0.OooO0o(this, lifecycleOwner);
            }
        });
        MusicState.State value = mutableLiveData.getValue();
        if ((value == null ? -1 : OooO00o.$EnumSwitchMapping$0[value.ordinal()]) == 1) {
            OooOO0o();
        }
    }

    @Override // p504o0o00o0.o00000O
    public final void OooO0Oo() {
        o00OO0O0.f43338OooooOo.OooO00o().f43370OooOooo.setValue(Boolean.valueOf(this.f45898OoooOo0));
    }

    @Override // p504o0o00o0.o00000O
    public final void OooO0o0(@NotNull View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51074OooO0oo)) {
            Context context = this.f41561Oooo;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            o0O0O00.OooO0OO((Activity) context, oo0o0Oo.f48625OooO0OO, null, new f(this));
            return;
        }
        if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51072OooO0o0)) {
            Context context2 = this.f41561Oooo;
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
            o0O0O00.OooO0OO((Activity) context2, oo0o0Oo.f48625OooO0OO, null, new e(this));
            return;
        }
        boolean z = true;
        if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51066OooO)) {
            MusicState musicState = MusicState.f21421OooO00o;
            MutableLiveData<MusicState.State> mutableLiveData = MusicState.f21423OooO0OO;
            MusicState.State value = mutableLiveData.getValue();
            i = value != null ? OooO00o.$EnumSwitchMapping$0[value.ordinal()] : -1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    Context context3 = this.f41561Oooo;
                    Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type android.app.Activity");
                    o0O0O00.OooO0OO((Activity) context3, oo0o0Oo.f48625OooO0OO, null, new d(this));
                    return;
                }
                o00 o00Var = o00.f48478OooO00o;
                o00.f48483OooO0o0 = System.currentTimeMillis();
                o0O0o000.OooO0O0().OooO00o().OooOo();
                mutableLiveData.setValue(MusicState.State.Playing);
                OooOO0o();
                return;
            }
            o00 o00Var2 = o00.f48478OooO00o;
            if (mutableLiveData.getValue() == MusicState.State.Playing) {
                long jCurrentTimeMillis = System.currentTimeMillis() - o00.f48483OooO0o0;
                HashMap map = new HashMap();
                map.put("playState", "pause");
                o0O00000.OooO0o("InRoom_music_continued", map, (int) jCurrentTimeMillis);
            }
            o0O0o000.OooO0O0().OooO00o().OooOO0o();
            mutableLiveData.postValue(MusicState.State.Pause);
            Job job = this.f45897OoooOOo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51075OooOO0)) {
            OooO0O0();
            return;
        }
        if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51076OooOO0O)) {
            Job job2 = this.f45897OoooOOo;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            o00.f48478OooO00o.OooO0o();
            this.f45898OoooOo0 = false;
            OooO0O0();
            return;
        }
        if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51077OooOO0o)) {
            Group group = this.f45896OoooOOO.f51068OooO0O0;
            Intrinsics.checkNotNullExpressionValue(group, "binding.groupControl");
            o00O0O.OooO0O0(group);
            this.f45896OoooOOO.f51068OooO0O0.setEnabled(false);
            Group group2 = this.f45896OoooOOO.f51070OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(group2, "binding.groupSound");
            o00O0O.OooO(group2);
            return;
        }
        if (!Intrinsics.areEqual(view, this.f45896OoooOOO.f51073OooO0oO)) {
            if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51071OooO0o)) {
                Activity activity = (Activity) this.f41561Oooo;
                int i2 = MusicActivity.f22922Ooooooo;
                Intent intent = new Intent(activity, (Class<?>) MusicActivity.class);
                intent.putExtra("MusicActivity_IsAddMusic", false);
                activity.startActivityForResult(intent, 114);
                return;
            }
            if (!Intrinsics.areEqual(view, this.f45896OoooOOO.f51085OooOo00)) {
                if (Intrinsics.areEqual(view, this.f45896OoooOOO.f51080OooOOOO)) {
                    o0O00000.OooO0OO("InRoom_music_local");
                    Context context4 = this.f41561Oooo;
                    Intrinsics.checkNotNull(context4, "null cannot be cast to non-null type android.app.Activity");
                    o0O0O00.OooO0OO((Activity) context4, oo0o0Oo.f48625OooO0OO, null, new OooO0O0());
                    return;
                }
                return;
            }
            Group group3 = this.f45896OoooOOO.f51070OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(group3, "binding.groupSound");
            o00O0O.OooO00o(group3);
            this.f45896OoooOOO.f51068OooO0O0.setEnabled(true);
            Group group4 = this.f45896OoooOOO.f51068OooO0O0;
            Intrinsics.checkNotNullExpressionValue(group4, "binding.groupControl");
            o00O0O.OooO(group4);
            return;
        }
        MusicState musicState2 = MusicState.f21421OooO00o;
        MutableLiveData<MusicState.LoopMode> mutableLiveData2 = MusicState.f21425OooO0o0;
        MusicState.LoopMode value2 = mutableLiveData2.getValue();
        i = value2 != null ? OooO00o.$EnumSwitchMapping$1[value2.ordinal()] : -1;
        if (i == 1) {
            mutableLiveData2.setValue(MusicState.LoopMode.LoopSingle);
            String strOooO0OO = p255o00ooO0O.o000O0O0.OooO0OO(R.string.music_loop_mode_single);
            ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
                return;
            } else {
                o00O000 o00o001 = o00O000.f34368OooO00o;
                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        mutableLiveData2.setValue(MusicState.LoopMode.LoopAll);
        String strOooO0OO2 = p255o00ooO0O.o000O0O0.OooO0OO(R.string.music_loop_mode_all);
        ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
            z = false;
        }
        if (z) {
            return;
        }
        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o0o0oooOooO0O1.run();
        } else {
            o00O000 o00o002 = o00O000.f34368OooO00o;
            o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
        }
    }

    @Override // p504o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        o00OO0O0.f43338OooooOo.OooO00o().f43370OooOooo.setValue(Boolean.FALSE);
    }

    public final String OooOO0O(int i) {
        int i2 = i / 1000;
        String strValueOf = String.valueOf(i2 / 60);
        String strValueOf2 = String.valueOf(i2 % 60);
        if (strValueOf.length() == 1) {
            strValueOf = '0' + strValueOf;
        }
        if (strValueOf2.length() == 1) {
            strValueOf2 = '0' + strValueOf2;
        }
        return strValueOf + ':' + strValueOf2;
    }

    public final void OooOO0o() {
        Job job = this.f45897OoooOOo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f45897OoooOOo = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(null), 3, null);
    }
}
