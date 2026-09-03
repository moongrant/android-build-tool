package p483o0o000Oo;

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
public final class o0000Ooo extends p483o0o000Oo.o0ooOOo {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Job f48534OooOOo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public Job f48546OooOoo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48519OooO00o = p483o0o000Oo.o0ooOOo.OooO0OO(o0OOO0o.f48567OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f48520OooO0O0 = p483o0o000Oo.o0ooOOo.OooO0OO(OooOO0.f48552OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f48521OooO0OO = p483o0o000Oo.o0ooOOo.OooO0OO(OooO0O0.f48549OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f48522OooO0Oo = p483o0o000Oo.o0ooOOo.OooO0OO(OooOO0O.f48553OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f48524OooO0o0 = p483o0o000Oo.o0ooOOo.OooO0OO(OooO0o.f48551OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f48523OooO0o = p483o0o000Oo.o0ooOOo.OooO0OO(OooO.f48547OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f48525OooO0oO = p483o0o000Oo.o0ooOOo.OooO0OO(OooO0OO.f48550OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f48526OooO0oo = p483o0o000Oo.o0ooOOo.OooO0OO(Oooo000.f48560OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState f48518OooO = p483o0o000Oo.o0ooOOo.OooO0OO(OooOo.f48557OooO0Oo);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48527OooOO0 = p483o0o000Oo.o0ooOOo.OooO0OO(o0ooOOo.f48572OooO0Oo);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48528OooOO0O = p483o0o000Oo.o0ooOOo.OooO0OO(o0Oo0oo.f48568OooO0Oo);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Pair<String, String>> f48529OooOO0o = p483o0o000Oo.o0ooOOo.OooO0OO(o00Oo0.f48563OooO0Oo);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f48531OooOOO0 = p483o0o000Oo.o0ooOOo.OooO0OO(oo000o.f48573OooO0Oo);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f48530OooOOO = p483o0o000Oo.o0ooOOo.OooO0OO(OooOOO.f48554OooO0Oo);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f48532OooOOOO = p483o0o000Oo.o0ooOOo.OooO0OO(OooOOO0.f48555OooO0Oo);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableState f48533OooOOOo = p483o0o000Oo.o0ooOOo.OooO0OO(OooOOOO.f48556OooO0Oo);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f48535OooOOo0 = 14400000;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48536OooOOoo = p483o0o000Oo.o0ooOOo.OooO0OO(Oooo0.f48559OooO0Oo);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48539OooOo00 = p483o0o000Oo.o0ooOOo.OooO0OO(oo0o0Oo.f48574OooO0Oo);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48538OooOo0 = p483o0o000Oo.o0ooOOo.OooO0OO(o00oO0o.f48565OooO0Oo);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final MutableState f48540OooOo0O = p483o0o000Oo.o0ooOOo.OooO0OO(OooOo00.f48558OooO0Oo);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48541OooOo0o = p483o0o000Oo.o0ooOOo.OooO0OO(o00O0O.f48562OooO0Oo);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f48537OooOo = p483o0o000Oo.o0ooOOo.OooO0OO(OooO00o.f48548OooO0Oo);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final MutableState f48543OooOoO0 = p483o0o000Oo.o0ooOOo.OooO0OO(o00Ooo.f48564OooO0Oo);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48542OooOoO = p483o0o000Oo.o0ooOOo.OooO0OO(o0OO00O.f48566OooO0Oo);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48544OooOoOO = p483o0o000Oo.o0ooOOo.OooO0OO(o000oOoO.f48561OooO0Oo);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final com.yalla.yalla.util.eventlivedata.OooO00o<Long> f48545OooOoo = new com.yalla.yalla.util.eventlivedata.OooO00o<>();

    public static final class OooO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f48547OooO0Oo = new OooO();

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
        public static final OooO00o f48548OooO0Oo = new OooO00o();

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
        public static final OooO0O0 f48549OooO0Oo = new OooO0O0();

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
        public static final OooO0OO f48550OooO0Oo = new OooO0OO();

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
        public static final OooO0o f48551OooO0Oo = new OooO0o();

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
        public static final OooOO0 f48552OooO0Oo = new OooOO0();

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
        public static final OooOO0O f48553OooO0Oo = new OooOO0O();

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
        public static final OooOOO f48554OooO0Oo = new OooOOO();

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
        public static final OooOOO0 f48555OooO0Oo = new OooOOO0();

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
        public static final OooOOOO f48556OooO0Oo = new OooOOOO();

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
        public static final OooOo f48557OooO0Oo = new OooOo();

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
        public static final OooOo00 f48558OooO0Oo = new OooOo00();

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
        public static final Oooo0 f48559OooO0Oo = new Oooo0();

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
        public static final Oooo000 f48560OooO0Oo = new Oooo000();

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
        public static final o000oOoO f48561OooO0Oo = new o000oOoO();

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
        public static final o00O0O f48562OooO0Oo = new o00O0O();

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
        public static final o00Oo0 f48563OooO0Oo = new o00Oo0();

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
        public static final o00Ooo f48564OooO0Oo = new o00Ooo();

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
        public static final o00oO0o f48565OooO0Oo = new o00oO0o();

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
        public static final o0OO00O f48566OooO0Oo = new o0OO00O();

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
        public static final o0OOO0o f48567OooO0Oo = new o0OOO0o();

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
        public static final o0Oo0oo f48568OooO0Oo = new o0Oo0oo();

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
        public int f48569OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.service.room.data.RoomMemberData$showJoinRoomDialogTask$1$1", f = "RoomMemberData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000Ooo f48571OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0000Ooo o0000ooo, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f48571OooO0Oo = o0000ooo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f48571OooO0Oo, continuation);
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
                this.f48571OooO0Oo.f48544OooOoOO.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        }

        public o0OoOo0(Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0000Ooo.this.new o0OoOo0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48569OooO0Oo;
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
            this.f48569OooO0Oo = 1;
            if (DelayKt.delay(300000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o(o0000Ooo.this, null);
            this.f48569OooO0Oo = 2;
            if (com.code.android.util.OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0ooOOo f48572OooO0Oo = new o0ooOOo();

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
        public static final oo000o f48573OooO0Oo = new oo000o();

        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo0o0Oo f48574OooO0Oo = new oo0o0Oo();

        public oo0o0Oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0Oo() {
        return ((Number) this.f48520OooO0O0.getValue()).intValue();
    }

    public final void OooO0o(int i) {
        this.f48518OooO.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0o0() {
        return ((Number) this.f48518OooO.getValue()).intValue();
    }

    public final void OooO0oO(boolean z) {
        Job job = this.f48546OooOoo0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f48546OooOoo0 = null;
        if (z) {
            this.f48546OooOoo0 = com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o0OoOo0(null));
        }
    }
}
