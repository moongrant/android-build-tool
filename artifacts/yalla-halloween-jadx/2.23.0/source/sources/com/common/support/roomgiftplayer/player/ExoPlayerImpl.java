package com.common.support.roomgiftplayer.player;

import android.content.Context;
import android.util.Log;
import android.view.Surface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.OooOOO0;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.o0O0O00;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooO0o;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.trackselection.OooO;
import com.google.android.exoplayer2.upstream.OooO0O0;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o0OOO0O.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p209o00o0oo0.oo00o;
import p230o00oOoO0.o0000O0O;
import p245o00oo0o.o00O000o;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0011J\u001a\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/common/support/roomgiftplayer/player/ExoPlayerImpl;", "Lo0OOO0O/OooO00o;", "", "initMediaPlayer", "Landroid/view/Surface;", "surface", "setSurface", "", "path", "setDataSource", "prepareAsync", "start", "pause", "stop", "", "volume", "setVolume", "", "setDeviceVolume", "usage", "", "handleAudioFocus", "setAudioStreamType", "Lcom/google/android/exoplayer2/OooOOO0;", "getExoPlayer", "reset", "release", "looping", "setLooping", "onWhilePlaying", "setScreenOnWhilePlaying", "Lo0OOO0O0/OooO0O0;", "getVideoInfo", "getPlayerType", "Landroid/content/Context;", "context", "Landroid/content/Context;", "exoPlayer", "Lcom/google/android/exoplayer2/OooOOO0;", "Lcom/google/android/exoplayer2/upstream/OooO0O0$OooO00o;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/OooO0O0$OooO00o;", "Lcom/google/android/exoplayer2/source/OooO0o;", "mediaSourceFactory", "Lcom/google/android/exoplayer2/source/OooO0o;", "Lcom/google/android/exoplayer2/source/OooOOOO;", "videoSource", "Lcom/google/android/exoplayer2/source/OooOOOO;", "currVideoWidth", "I", "currVideoHeight", "isLooping", "Z", "Lcom/google/android/exoplayer2/Player$OooO0OO;", "exoPlayerListener", "Lcom/google/android/exoplayer2/Player$OooO0OO;", "<init>", "(Landroid/content/Context;)V", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0})
public final class ExoPlayerImpl extends OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final Context context;
    private int currVideoHeight;
    private int currVideoWidth;

    @NotNull
    private final OooO0O0.OooO00o dataSourceFactory;

    @NotNull
    private final OooOOO0 exoPlayer;

    @NotNull
    private final Player.OooO0OO exoPlayerListener;
    private boolean isLooping;

    @NotNull
    private final OooO0o mediaSourceFactory;

    @Nullable
    private OooOOOO videoSource;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$pause$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$pause$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.Oooo00O(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$release$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$release$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C08951(Continuation<? super C08951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08951(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.release();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$reset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$reset$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C08961(Continuation<? super C08961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08961(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.stop();
            ((OooO0OO) ExoPlayerImpl.this.exoPlayer).OoooO0O();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$setDeviceVolume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$setDeviceVolume$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08971(int i, Continuation<? super C08971> continuation) {
            super(2, continuation);
            this.$volume = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08971(this.$volume, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.OooOoOO();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$setSurface$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$setSurface$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Surface $surface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08981(Surface surface, Continuation<? super C08981> continuation) {
            super(2, continuation);
            this.$surface = surface;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08981(this.$surface, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.OooOoo0(this.$surface);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$setVolume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$setVolume$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08991(float f, Continuation<? super C08991> continuation) {
            super(2, continuation);
            this.$volume = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08991(this.$volume, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.OooOOOo(this.$volume);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$start$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C09001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C09001(Continuation<? super C09001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C09001(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.Oooo00O(true);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$stop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$stop$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C09011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C09011(Continuation<? super C09011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C09011(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ExoPlayerImpl.this.exoPlayer.stop();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerImpl(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        OooOOO0.OooO0O0 oooO0O0 = new OooOOO0.OooO0O0(context);
        o00O000o.OooO0Oo(!oooO0O0.f11164OooOo00);
        oooO0O0.f11164OooOo00 = true;
        OooOOO oooOOO = new OooOOO(oooO0O0, null);
        Intrinsics.checkNotNullExpressionValue(oooOOO, "Builder(context).build()");
        this.exoPlayer = oooOOO;
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(context);
        this.dataSourceFactory = oooO00o;
        this.mediaSourceFactory = new OooO0o(oooO00o, new oo00o());
        this.exoPlayerListener = new Player.OooO0OO() { // from class: com.common.support.roomgiftplayer.player.ExoPlayerImpl$exoPlayerListener$1
            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.OooO00o oooO00o2) {
            }

            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o2) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            }

            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O1) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
            }

            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onMediaItemTransition(@androidx.annotation.Nullable o000oOoO o000oooo2, int i) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(o00Ooo o00ooo2) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public void onPlayerError(@NotNull PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                System.out.println((Object) o00O00OO.OooO00o("AlphaVideoonPlayerError ", Log.getStackTraceString(error)));
                o0OOO0O.OooO0OO.OooO0O0 errorListener = this.this$0.getErrorListener();
                if (errorListener != null) {
                    Log.getStackTraceString(error);
                    errorListener.onError();
                }
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@androidx.annotation.Nullable PlaybackException playbackException) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            @Deprecated(message = "Deprecated in Java")
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                if (playbackState != 3) {
                    if (playbackState != 4) {
                        return;
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$2(this.this$0, null), 3, null);
                } else if (playWhenReady) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$1(this.this$0, null), 3, null);
                }
            }

            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public void onRenderedFirstFrame() {
                o0OOO0O.OooO0OO.InterfaceC0458OooO0OO firstFrameListener = this.this$0.getFirstFrameListener();
                if (firstFrameListener != null) {
                    firstFrameListener.OooO00o();
                }
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
            }

            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
            }

            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onTimelineChanged(oo0o0Oo oo0o0oo, int i) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(OooO oooO) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onTracksChanged(o0O0O00 o0o0o00) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public void onVideoSizeChanged(@NotNull o0oOOo videoSize) {
                Intrinsics.checkNotNullParameter(videoSize, "videoSize");
                this.this$0.currVideoWidth = videoSize.f40864OooO0Oo;
                this.this$0.currVideoHeight = videoSize.f40866OooO0o0;
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onCues(o0000O0O o0000o0o2) {
            }

            @Override // com.google.android.exoplayer2.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
            }
        };
    }

    public static /* synthetic */ void setAudioStreamType$default(ExoPlayerImpl exoPlayerImpl, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        exoPlayerImpl.setAudioStreamType(i, z);
    }

    @NotNull
    public final OooOOO0 getExoPlayer() {
        return this.exoPlayer;
    }

    @NotNull
    public String getPlayerType() {
        return "ExoPlayerImpl";
    }

    @Override // o0OOO0O.OooO0OO
    @NotNull
    public o0OOO0O0.OooO0O0 getVideoInfo() {
        return new o0OOO0O0.OooO0O0(this.currVideoWidth, this.currVideoHeight);
    }

    @Override // o0OOO0O.OooO0OO
    public void initMediaPlayer() {
        this.exoPlayer.Ooooo00(this.exoPlayerListener);
    }

    @Override // o0OOO0O.OooO0OO
    public void pause() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // o0OOO0O.OooO0OO
    public void prepareAsync() {
        OooOOOO oooOOOO = this.videoSource;
        if (oooOOOO != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new ExoPlayerImpl$prepareAsync$1$1(this, oooOOOO, null), 3, null);
        }
    }

    @Override // o0OOO0O.OooO0OO
    public void release() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08951(null), 3, null);
    }

    @Override // o0OOO0O.OooO0OO
    public void reset() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08961(null), 3, null);
    }

    public final void setAudioStreamType(int usage, boolean handleAudioFocus) {
        com.google.android.exoplayer2.audio.OooO00o oooO00oOoooOOo = this.exoPlayer.OoooOOo();
        Intrinsics.checkNotNullExpressionValue(oooO00oOoooOOo, "exoPlayer.audioAttributes");
        com.google.android.exoplayer2.audio.OooO00o oooO00o = new com.google.android.exoplayer2.audio.OooO00o(oooO00oOoooOOo.f11587OooO0Oo, oooO00oOoooOOo.f11589OooO0o0, usage, oooO00oOoooOOo.f11590OooO0oO, 0);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "Builder()\n            .s…age)\n            .build()");
        this.exoPlayer.Oooo0oO(oooO00o, handleAudioFocus);
    }

    @Override // o0OOO0O.OooO0OO
    public void setDataSource(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        o000oOoO o000ooooOooO00o = o000oOoO.OooO00o(path);
        Intrinsics.checkNotNullExpressionValue(o000ooooOooO00o, "fromUri(path)");
        OooOOOO oooOOOOOooO00o = this.mediaSourceFactory.OooO00o(o000ooooOooO00o);
        Intrinsics.checkNotNullExpressionValue(oooOOOOOooO00o, "mediaSourceFactory.createMediaSource(mediaItem)");
        this.videoSource = oooOOOOOooO00o;
        reset();
    }

    public final void setDeviceVolume(int volume) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08971(volume, null), 3, null);
    }

    @Override // o0OOO0O.OooO0OO
    public void setLooping(boolean looping) {
        this.isLooping = looping;
    }

    @Override // o0OOO0O.OooO0OO
    public void setScreenOnWhilePlaying(boolean onWhilePlaying) {
    }

    @Override // o0OOO0O.OooO0OO
    public void setSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08981(surface, null), 3, null);
    }

    public final void setVolume(float volume) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08991(volume, null), 3, null);
    }

    @Override // o0OOO0O.OooO0OO
    public void start() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C09001(null), 3, null);
    }

    @Override // o0OOO0O.OooO0OO
    public void stop() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C09011(null), 3, null);
    }
}
