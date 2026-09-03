package com.common.support.roomgiftplayer.player;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.Oooo0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00O0O;
import androidx.media3.common.o00Oo0;
import androidx.media3.common.o00Ooo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.OooO0O0;
import androidx.media3.exoplayer.AudioFocusManager;
import androidx.media3.exoplayer.OooO;
import androidx.media3.exoplayer.OooO0o;
import androidx.media3.exoplayer.source.OooOOOO;
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
import o000OOoO.OooOOO;
import o0OOO0OO.OooO00o;
import o0OOO0OO.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p080o000OoO.o00000;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0011J\u001a\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/common/support/roomgiftplayer/player/ExoPlayerImpl;", "Lo0OOO0OO/OooO00o;", "", "initMediaPlayer", "Landroid/view/Surface;", "surface", "setSurface", "", "dataPath", "setDataSource", "prepareAsync", "start", "pause", "stop", "", "volume", "setVolume", "", "setDeviceVolume", "usage", "", "handleAudioFocus", "setAudioStreamType", "Landroidx/media3/exoplayer/OooO0o;", "getExoPlayer", "reset", "release", "looping", "setLooping", "onWhilePlaying", "setScreenOnWhilePlaying", "Lo0OOO0O/OooO0O0;", "getVideoInfo", "getPlayerType", "Landroid/content/Context;", "context", "Landroid/content/Context;", "exoPlayer", "Landroidx/media3/exoplayer/OooO0o;", "Landroidx/media3/datasource/OooO0O0$OooO00o;", "dataSourceFactory", "Landroidx/media3/datasource/OooO0O0$OooO00o;", "Landroidx/media3/exoplayer/source/OooO0o;", "mediaSourceFactory", "Landroidx/media3/exoplayer/source/OooO0o;", "Landroidx/media3/exoplayer/source/OooOOOO;", "videoSource", "Landroidx/media3/exoplayer/source/OooOOOO;", "currVideoWidth", "I", "currVideoHeight", "isLooping", "Z", "Landroidx/media3/common/Player$OooO0OO;", "exoPlayerListener", "Landroidx/media3/common/Player$OooO0OO;", "<init>", "(Landroid/content/Context;)V", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0})
public final class ExoPlayerImpl extends OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final Context context;
    private int currVideoHeight;
    private int currVideoWidth;

    @NotNull
    private final OooO0O0.OooO00o dataSourceFactory;

    @NotNull
    private final OooO0o exoPlayer;

    @NotNull
    private final Player.OooO0OO exoPlayerListener;
    private boolean isLooping;

    @NotNull
    private final androidx.media3.exoplayer.source.OooO0o mediaSourceFactory;

    @Nullable
    private OooOOOO videoSource;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$pause$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
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
            ((OooO) ExoPlayerImpl.this.exoPlayer).o0OOO0o(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$release$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$release$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C08751(Continuation<? super C08751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08751(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((OooO) ExoPlayerImpl.this.exoPlayer).release();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$reset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$reset$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C08761(Continuation<? super C08761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08761(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((OooO) ExoPlayerImpl.this.exoPlayer).oo0o0Oo();
            ((androidx.media3.common.OooO0O0) ExoPlayerImpl.this.exoPlayer).OooO0OO();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$setDeviceVolume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$setDeviceVolume$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08771(int i, Continuation<? super C08771> continuation) {
            super(2, continuation);
            this.$volume = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08771(this.$volume, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((OooO) ExoPlayerImpl.this.exoPlayer).o00000();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$setSurface$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$setSurface$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Surface $surface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08781(Surface surface, Continuation<? super C08781> continuation) {
            super(2, continuation);
            this.$surface = surface;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08781(this.$surface, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OooO0o oooO0o = ExoPlayerImpl.this.exoPlayer;
            Surface surface = this.$surface;
            OooO oooO = (OooO) oooO0o;
            oooO.o00000();
            oooO.o00oO0o();
            oooO.o0Oo0oo(surface);
            int i = surface == null ? 0 : -1;
            oooO.oo000o(i, i);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$setVolume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$setVolume$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08791(float f, Continuation<? super C08791> continuation) {
            super(2, continuation);
            this.$volume = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08791(this.$volume, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((OooO) ExoPlayerImpl.this.exoPlayer).o0OO00O(this.$volume);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$start$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C08801(Continuation<? super C08801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08801(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((OooO) ExoPlayerImpl.this.exoPlayer).o0OOO0o(true);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.player.ExoPlayerImpl$stop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$stop$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C08811(Continuation<? super C08811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExoPlayerImpl.this.new C08811(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((OooO) ExoPlayerImpl.this.exoPlayer).oo0o0Oo();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerImpl(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        OooO oooOOooO00o = new OooO0o.OooO0O0(context).OooO00o();
        Intrinsics.checkNotNullExpressionValue(oooOOooO00o, "build(...)");
        this.exoPlayer = oooOOooO00o;
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(context);
        this.dataSourceFactory = oooO00o;
        this.mediaSourceFactory = new androidx.media3.exoplayer.source.OooO0o(oooO00o, new OooOOO());
        this.exoPlayerListener = new Player.OooO0OO() { // from class: com.common.support.roomgiftplayer.player.ExoPlayerImpl$exoPlayerListener$1
            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(androidx.media3.common.OooO00o oooO00o2) {
            }

            @UnstableApi
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o2) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            @UnstableApi
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O0) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            @UnstableApi
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
            }

            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onMediaItemTransition(@androidx.annotation.Nullable OooOOO0 oooOOO0, int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            @UnstableApi
            public /* bridge */ /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(androidx.media3.common.OooOOOO oooOOOO) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public void onPlayerError(@NotNull PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                System.out.println((Object) o00O00OO.OooO00o("AlphaVideoonPlayerError ", Log.getStackTraceString(error)));
                OooO0OO.OooO0O0 errorListener = this.this$0.getErrorListener();
                if (errorListener != null) {
                    Log.getStackTraceString(error);
                    errorListener.onError();
                }
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@androidx.annotation.Nullable PlaybackException playbackException) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
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

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            @UnstableApi
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public void onRenderedFirstFrame() {
                OooO0OO.InterfaceC0449OooO0OO firstFrameListener = this.this$0.getFirstFrameListener();
                if (firstFrameListener != null) {
                    firstFrameListener.OooO00o();
                }
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onTimelineChanged(Oooo0 oooo0, int i) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(o00O0O o00o0o2) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onTracksChanged(o00Oo0 o00oo1) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public void onVideoSizeChanged(@NotNull o00Ooo videoSize) {
                Intrinsics.checkNotNullParameter(videoSize, "videoSize");
                this.this$0.currVideoWidth = videoSize.f6874OooO0Oo;
                this.this$0.currVideoHeight = videoSize.f6876OooO0o0;
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
            public /* bridge */ /* synthetic */ void onCues(o000O000.OooO0O0 oooO0O0) {
            }

            @Override // androidx.media3.common.Player.OooO0OO
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
    public final OooO0o getExoPlayer() {
        return this.exoPlayer;
    }

    @NotNull
    public String getPlayerType() {
        return "ExoPlayerImpl";
    }

    @Override // o0OOO0OO.OooO0OO
    @NotNull
    public o0OOO0O.OooO0O0 getVideoInfo() {
        return new o0OOO0O.OooO0O0(this.currVideoWidth, this.currVideoHeight);
    }

    @Override // o0OOO0OO.OooO0OO
    public void initMediaPlayer() {
        ((OooO) this.exoPlayer).OooOOoo(this.exoPlayerListener);
    }

    @Override // o0OOO0OO.OooO0OO
    public void pause() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // o0OOO0OO.OooO0OO
    public void prepareAsync() {
        OooOOOO oooOOOO = this.videoSource;
        if (oooOOOO != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new ExoPlayerImpl$prepareAsync$1$1(this, oooOOOO, null), 3, null);
        }
    }

    @Override // o0OOO0OO.OooO0OO
    public void release() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08751(null), 3, null);
    }

    @Override // o0OOO0OO.OooO0OO
    public void reset() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08761(null), 3, null);
    }

    public final void setAudioStreamType(int usage, boolean handleAudioFocus) {
        OooO oooO = (OooO) this.exoPlayer;
        oooO.o00000();
        androidx.media3.common.OooO00o oooO00o = oooO.f7174OoooOOo;
        Intrinsics.checkNotNullExpressionValue(oooO00o, "getAudioAttributes(...)");
        final androidx.media3.common.OooO00o oooO00o2 = new androidx.media3.common.OooO00o(oooO00o.f6354OooO0Oo, oooO00o.f6356OooO0o0, usage, oooO00o.f6357OooO0oO, 0);
        Intrinsics.checkNotNullExpressionValue(oooO00o2, "build(...)");
        OooO oooO2 = (OooO) this.exoPlayer;
        oooO2.o00000();
        if (oooO2.f7180OooooO0) {
            return;
        }
        boolean zOooO00o = o000OO00.OooO00o(oooO2.f7174OoooOOo, oooO00o2);
        int i = 1;
        o00000<Player.OooO0OO> o00000Var = oooO2.f7137OooOO0o;
        if (!zOooO00o) {
            oooO2.f7174OoooOOo = oooO00o2;
            oooO2.o00oO0O(1, 3, oooO00o2);
            final int i2 = 0;
            o00000Var.OooO0OO(20, new o00000.OooO00o() { // from class: o000O00O.o000000
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj) {
                    int i3 = i2;
                    Object obj2 = oooO00o2;
                    switch (i3) {
                        case 0:
                            ((Player.OooO0OO) obj).onAudioAttributesChanged((androidx.media3.common.OooO00o) obj2);
                            return;
                        default:
                            ((androidx.media3.session.o000O0Oo.OooO0OO) obj2).getClass();
                            throw null;
                    }
                }
            });
        }
        androidx.media3.common.OooO00o oooO00o3 = handleAudioFocus ? oooO00o2 : null;
        AudioFocusManager audioFocusManager = oooO2.f7152OooOoOO;
        audioFocusManager.OooO0OO(oooO00o3);
        oooO2.f7134OooO0oo.OooO0o(oooO00o2);
        boolean zOooOoOO = oooO2.OooOoOO();
        int iOooO0o0 = audioFocusManager.OooO0o0(oooO2.Oooo0o(), zOooOoOO);
        if (zOooOoOO && iOooO0o0 != 1) {
            i = 2;
        }
        oooO2.o000000(iOooO0o0, i, zOooOoOO);
        o00000Var.OooO0O0();
    }

    @Override // o0OOO0OO.OooO0OO
    public void setDataSource(@NotNull String dataPath) {
        Intrinsics.checkNotNullParameter(dataPath, "dataPath");
        OooOOO0 oooOOO0 = OooOOO0.f6480OooOO0;
        OooOOO0.OooO0O0 oooO0O0 = new OooOOO0.OooO0O0();
        oooO0O0.f6525OooO0O0 = dataPath == null ? null : Uri.parse(dataPath);
        OooOOO0 oooOOO0OooO00o = oooO0O0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(oooOOO0OooO00o, "fromUri(...)");
        OooOOOO oooOOOOOooO00o = this.mediaSourceFactory.OooO00o(oooOOO0OooO00o);
        Intrinsics.checkNotNullExpressionValue(oooOOOOOooO00o, "createMediaSource(...)");
        this.videoSource = oooOOOOOooO00o;
        reset();
    }

    public final void setDeviceVolume(int volume) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08771(volume, null), 3, null);
    }

    @Override // o0OOO0OO.OooO0OO
    public void setLooping(boolean looping) {
        this.isLooping = looping;
    }

    @Override // o0OOO0OO.OooO0OO
    public void setScreenOnWhilePlaying(boolean onWhilePlaying) {
    }

    @Override // o0OOO0OO.OooO0OO
    public void setSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08781(surface, null), 3, null);
    }

    public final void setVolume(float volume) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08791(volume, null), 3, null);
    }

    @Override // o0OOO0OO.OooO0OO
    public void start() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08801(null), 3, null);
    }

    @Override // o0OOO0OO.OooO0OO
    public void stop() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C08811(null), 3, null);
    }
}
