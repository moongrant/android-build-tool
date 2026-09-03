package p475o0o000;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberData.kt\ncom/yalla/yalla/service/room/data/RoomMemberData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,128:1\n81#2:129\n107#2,2:130\n81#2:132\n107#2,2:133\n81#2:135\n107#2,2:136\n81#2:138\n107#2,2:139\n81#2:141\n107#2,2:142\n81#2:144\n107#2,2:145\n81#2:147\n107#2,2:148\n81#2:150\n107#2,2:151\n81#2:153\n107#2,2:154\n81#2:156\n107#2,2:157\n81#2:159\n107#2,2:160\n81#2:162\n107#2,2:163\n81#2:165\n107#2,2:166\n81#2:168\n107#2,2:169\n81#2:171\n107#2,2:172\n*S KotlinDebug\n*F\n+ 1 RoomMemberData.kt\ncom/yalla/yalla/service/room/data/RoomMemberData\n*L\n19#1:129\n19#1:130,2\n22#1:132\n22#1:133,2\n25#1:135\n25#1:136,2\n28#1:138\n28#1:139,2\n31#1:141\n31#1:142,2\n34#1:144\n34#1:145,2\n37#1:147\n37#1:148,2\n40#1:150\n40#1:151,2\n53#1:153\n53#1:154,2\n56#1:156\n56#1:157,2\n59#1:159\n59#1:160,2\n62#1:162\n62#1:163,2\n90#1:165\n90#1:166,2\n96#1:168\n96#1:169,2\n99#1:171\n99#1:172,2\n*E\n"})
public final class oo0o0Oo extends p475o0o000.Oooo000 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Job f47521OooOOo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public Job f47533OooOoo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47506OooO00o = p475o0o000.Oooo000.OooO0OO(o0OOO0o.f47554OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f47507OooO0O0 = p475o0o000.Oooo000.OooO0OO(OooOO0.f47539OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f47508OooO0OO = p475o0o000.Oooo000.OooO0OO(OooO0O0.f47536OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f47509OooO0Oo = p475o0o000.Oooo000.OooO0OO(OooOO0O.f47540OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f47511OooO0o0 = p475o0o000.Oooo000.OooO0OO(OooO0o.f47538OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f47510OooO0o = p475o0o000.Oooo000.OooO0OO(OooO.f47534OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f47512OooO0oO = p475o0o000.Oooo000.OooO0OO(OooO0OO.f47537OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f47513OooO0oo = p475o0o000.Oooo000.OooO0OO(Oooo000.f47547OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState f47505OooO = p475o0o000.Oooo000.OooO0OO(OooOo.f47544OooO0Oo);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47514OooOO0 = p475o0o000.Oooo000.OooO0OO(o0ooOOo.f47559OooO0Oo);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47515OooOO0O = p475o0o000.Oooo000.OooO0OO(o0Oo0oo.f47555OooO0Oo);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Pair<String, String>> f47516OooOO0o = p475o0o000.Oooo000.OooO0OO(o00Oo0.f47550OooO0Oo);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f47518OooOOO0 = p475o0o000.Oooo000.OooO0OO(oo000o.f47560OooO0Oo);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f47517OooOOO = p475o0o000.Oooo000.OooO0OO(OooOOO.f47541OooO0Oo);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f47519OooOOOO = p475o0o000.Oooo000.OooO0OO(OooOOO0.f47542OooO0Oo);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableState f47520OooOOOo = p475o0o000.Oooo000.OooO0OO(OooOOOO.f47543OooO0Oo);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f47522OooOOo0 = 14400000;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47523OooOOoo = p475o0o000.Oooo000.OooO0OO(Oooo0.f47546OooO0Oo);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47526OooOo00 = p475o0o000.Oooo000.OooO0OO(C0479oo0o0Oo.f47561OooO0Oo);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47525OooOo0 = p475o0o000.Oooo000.OooO0OO(o00oO0o.f47552OooO0Oo);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final MutableState f47527OooOo0O = p475o0o000.Oooo000.OooO0OO(OooOo00.f47545OooO0Oo);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47528OooOo0o = p475o0o000.Oooo000.OooO0OO(o00O0O.f47549OooO0Oo);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f47524OooOo = p475o0o000.Oooo000.OooO0OO(OooO00o.f47535OooO0Oo);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final MutableState f47530OooOoO0 = p475o0o000.Oooo000.OooO0OO(o00Ooo.f47551OooO0Oo);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47529OooOoO = p475o0o000.Oooo000.OooO0OO(o0OO00O.f47553OooO0Oo);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47531OooOoOO = p475o0o000.Oooo000.OooO0OO(o000oOoO.f47548OooO0Oo);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final com.yalla.yalla.util.eventlivedata.OooO00o<Long> f47532OooOoo = new com.yalla.yalla.util.eventlivedata.OooO00o<>();

    public static final class OooO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f47534OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47535OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47536OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f47537OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f47538OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f47539OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 0;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f47540OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f47541OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 6;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f47542OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 0;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f47543OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 0L;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f47544OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 0;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f47545OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 0L;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f47546OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f47547OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f47548OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f47549OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Pair<? extends String, ? extends String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f47550OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Pair<? extends String, ? extends String> invoke() {
            return null;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Ooo f47551OooO0Oo = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00oO0o f47552OooO0Oo = new o00oO0o();

        public o00oO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OO00O f47553OooO0Oo = new o0OO00O();

        public o0OO00O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OOO0o f47554OooO0Oo = new o0OOO0o();

        public o0OOO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0Oo0oo f47555OooO0Oo = new o0Oo0oo();

        public o0Oo0oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.data.RoomMemberData$showJoinRoomDialogTask$1", f = "RoomMemberData.kt", i = {}, l = {116, 117}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f47556OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.service.room.data.RoomMemberData$showJoinRoomDialogTask$1$1", f = "RoomMemberData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ oo0o0Oo f47558OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(oo0o0Oo oo0o0oo, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f47558OooO0Oo = oo0o0oo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f47558OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f47558OooO0Oo.f47531OooOoOO.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        }

        public o0OoOo0(Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return oo0o0Oo.this.new o0OoOo0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f47556OooO0Oo;
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
            this.f47556OooO0Oo = 1;
            if (DelayKt.delay(300000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o(oo0o0Oo.this, null);
            this.f47556OooO0Oo = 2;
            if (com.code.android.util.OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0ooOOo f47559OooO0Oo = new o0ooOOo();

        public o0ooOOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo000o f47560OooO0Oo = new oo000o();

        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: o0o000.oo0o0Oo$oo0o0Oo, reason: collision with other inner class name */
    public static final class C0479oo0o0Oo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C0479oo0o0Oo f47561OooO0Oo = new C0479oo0o0Oo();

        public C0479oo0o0Oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0Oo() {
        return ((Number) this.f47507OooO0O0.getValue()).intValue();
    }

    public final void OooO0o(int i) {
        this.f47505OooO.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0o0() {
        return ((Number) this.f47505OooO.getValue()).intValue();
    }

    public final void OooO0oO(boolean z) {
        Job job = this.f47533OooOoo0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f47533OooOoo0 = null;
        if (z) {
            this.f47533OooOoo0 = com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o0OoOo0(null));
        }
    }
}
