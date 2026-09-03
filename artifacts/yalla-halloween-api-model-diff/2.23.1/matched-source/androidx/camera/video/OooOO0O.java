package androidx.camera.video;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00o0;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.OooOO0O.OooO0OO;
import androidx.camera.video.OooOO0O.OooO0o;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.auto.value.AutoValue;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import o000OO.OooO00o;
import p022Oooo00O.o0000O;
import p022Oooo00O.o00OOO00;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o00O0OOO;
import p030OoooO.OooOo;
import p030OoooO.o000oOoO;
import p030OoooO.o00Ooo;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.o0OO00O;
import p036OoooOOo.o0000;
import p039OoooOoo.o00;
import p039OoooOoo.o000O;
import p039OoooOoo.o000O00O;
import p039OoooOoo.o000OO00;
import p039OoooOoo.o000OO0O;
import p039OoooOoo.o00O000o;
import p039OoooOoo.o00O0OO0;
import p039OoooOoo.o00OO000;
import p039OoooOoo.o00OOO0;
import p039OoooOoo.o00OOO0O;
import p039OoooOoo.o00OOOO0;
import p039OoooOoo.o00OOOOo;
import p039OoooOoo.o00Oo00;
import p039OoooOoo.o00oOoo;
import p039OoooOoo.o0O00OOO;
import p039OoooOoo.o0O0ooO;
import p039OoooOoo.o0o0Oo;
import p041Ooooo0o.o000000;
import p041Ooooo0o.o00000O0;
import p041Ooooo0o.o00000OO;
import p041Ooooo0o.o000OOo;
import p042OooooO0.oOO00O;
import p042OooooO0.oo00o;
import p044OooooOo.o0O0OOO0;
import p044OooooOo.o0O0OOOo;
import p044OooooOo.o0OO000;
import p044OooooOo.oo0OOoo;
import p045Oooooo.Oooo0;
import p045Oooooo.Oooo000;
import p045Oooooo.o000000O;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o000OOo0;
import p045Oooooo.o00O0O;
import p045Oooooo.o00Oo0;
import p045Oooooo.o0OoOo0;
import p046Oooooo0.o0O0000O;
import p046Oooooo0.o0O0o;
import p046Oooooo0.o0oOOo;
import p046Oooooo0.oo00oO;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOO0O implements VideoOutput {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final Set<OooOOO> f3915Ooooo00 = Collections.unmodifiableSet(EnumSet.of(OooOOO.PENDING_RECORDING, OooOOO.PENDING_PAUSED));

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final Set<OooOOO> f3916Ooooo0o = Collections.unmodifiableSet(EnumSet.of(OooOOO.CONFIGURING, OooOOO.IDLING, OooOOO.RESETTING, OooOOO.STOPPING, OooOOO.ERROR));

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final OooOo f3917OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final androidx.camera.video.OooO0O0 f3918OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @VisibleForTesting
    public static final o00O0OO0 f3919OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final o0O0O00 f3920Oooooo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooOOO f3921OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00o0<androidx.camera.video.OooOOO> f3922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f3923OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00 f3924OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0OO0 f3925OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f3926OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0OO0 f3927OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f3928OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooOOO f3929OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3930OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooOOO0 f3931OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public androidx.camera.video.OooO0OO f3932OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooOOO0 f3933OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public long f3934OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f3935OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public SurfaceRequest.OooO0OO f3936OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o00000OO f3937OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public SurfaceRequest.OooO0OO f3938OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList f3939OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Surface f3940OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Integer f3941OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Integer f3942OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public SurfaceRequest f3943OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Timebase f3944OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public MediaMuxer f3945OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Surface f3946OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o00O00o0<MediaSpec> f3947OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o0000Ooo f3948OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public androidx.camera.video.internal.audio.OooO00o f3949OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o00OOO00 f3950OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public o0000Ooo f3951OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f3952Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f3953Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public o00OOO00 f3954Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public EnumC0017OooOO0O f3955Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NonNull
    public Uri f3956Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f3957Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @VisibleForTesting
    public long f3958Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f3959Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @VisibleForTesting
    public long f3960Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f3961Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f3962Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Throwable f3963OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Oooo0 f3964OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f3965OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NonNull
    public final o0000 f3966OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f3967OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ScheduledFuture<?> f3968OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f3969OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NonNull
    public o0O00OOO f3970OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public o0O00OOO f3971OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public double f3972OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public VideoOutput.SourceState f3973o000oOoO;

    public class OooO implements p030OoooO.OooOOO0<List<Void>> {
        public OooO() {
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            OooOO0O oooOO0O = OooOO0O.this;
            o000OO.OooOOO0.OooO0o("In-progress recording shouldn't be null", oooOO0O.f3933OooOOO != null);
            if (oooOO0O.f3933OooOOO.Oooo00O()) {
                return;
            }
            o00O0O0.OooO00o("Recorder", "Encodings end with error: " + th);
            oooOO0O.OooO0oO(oooOO0O.f3945OooOoO == null ? 8 : 6);
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable List<Void> list) {
            o00O0O0.OooO00o("Recorder", "Encodings end successfully.");
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.OooO0oO(oooOO0O.f3965OoooO00);
        }
    }

    public class OooO00o implements p030OoooO.OooOOO0<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.video.internal.audio.OooO00o f3975OooO00o;

        public OooO00o(androidx.camera.video.internal.audio.OooO00o oooO00o) {
            this.f3975OooO00o = oooO00o;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o00O0O0.OooO00o("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f3975OooO00o.hashCode())));
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable Void r3) {
            o00O0O0.OooO00o("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f3975OooO00o.hashCode())));
        }
    }

    public class OooO0O0 implements o00Oo0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO00o f3976OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f3977OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f3978OooO0Oo;

        public OooO0O0(OooOOO0 oooOOO0, OooOO0O oooOO0O, o000O0.OooO00o oooO00o) {
            this.f3978OooO0Oo = oooOO0O;
            this.f3976OooO0O0 = oooO00o;
            this.f3977OooO0OO = oooOOO0;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO00o() {
            this.f3976OooO0O0.OooO0O0(null);
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0O0(@NonNull o0OoOo0 o0oooo1) throws Exception {
            boolean z;
            OooOO0O oooOO0O = this.f3978OooO0Oo;
            MediaMuxer mediaMuxer = oooOO0O.f3945OooOoO;
            OooOOO0 oooOOO0 = this.f3977OooO0OO;
            if (mediaMuxer != null) {
                try {
                    oooOO0O.Oooo0OO(o0oooo1, oooOOO0);
                    o0oooo1.close();
                    return;
                } catch (Throwable th) {
                    if (o0oooo1 != null) {
                        try {
                            o0oooo1.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (oooOO0O.f3935OooOOOO) {
                o00O0O0.OooO00o("Recorder", "Drop video data since recording is stopping.");
                o0oooo1.close();
                return;
            }
            Oooo0 oooo0 = oooOO0O.f3964OoooO0;
            if (oooo0 != null) {
                oooo0.close();
                oooOO0O.f3964OoooO0 = null;
                z = true;
            } else {
                z = false;
            }
            if (!o0oooo1.OooO00o()) {
                if (z) {
                    o00O0O0.OooO00o("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                o00O0O0.OooO00o("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                o0000Ooo o0000ooo = oooOO0O.f3948OooOoo;
                o0000ooo.f1897OooO0oo.execute(new o0000O(o0000ooo, 2));
                o0oooo1.close();
                return;
            }
            oooOO0O.f3964OoooO0 = o0oooo1;
            if (!oooOO0O.OooOO0o() || !oooOO0O.f3966OoooO0O.OooO0OO()) {
                o00O0O0.OooO00o("Recorder", "Received video keyframe. Starting muxer...");
                oooOO0O.OooOoo(oooOOO0);
            } else if (z) {
                o00O0O0.OooO00o("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                o00O0O0.OooO00o("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // p045Oooooo.o00Oo0
        public final /* synthetic */ void OooO0OO() {
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0Oo() {
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0o(@NonNull o00OOO00 o00ooo00) {
            this.f3978OooO0Oo.f3950OooOooO = o00ooo00;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0o0(@NonNull EncodeException encodeException) {
            this.f3976OooO0O0.OooO0OO(encodeException);
        }
    }

    public class OooO0OO implements androidx.camera.video.internal.audio.OooO00o.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000OO.OooO00o f3979OooO00o;

        public OooO0OO(o00OO000 o00oo001) {
            this.f3979OooO00o = o00oo001;
        }
    }

    public class OooO0o implements o00Oo0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO00o f3981OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o000OO.OooO00o f3982OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f3983OooO0Oo;

        public OooO0o(o000O0.OooO00o oooO00o, o00OO000 o00oo001, OooOOO0 oooOOO0) {
            this.f3981OooO0O0 = oooO00o;
            this.f3982OooO0OO = o00oo001;
            this.f3983OooO0Oo = oooOOO0;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO00o() {
            this.f3981OooO0O0.OooO0O0(null);
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0O0(@NonNull o0OoOo0 o0oooo1) throws Exception {
            OooOO0O oooOO0O = OooOO0O.this;
            if (oooOO0O.f3955Oooo00O == EnumC0017OooOO0O.DISABLED) {
                o0oooo1.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            MediaMuxer mediaMuxer = oooOO0O.f3945OooOoO;
            OooOOO0 oooOOO0 = this.f3983OooO0Oo;
            if (mediaMuxer == null) {
                if (oooOO0O.f3935OooOOOO) {
                    o00O0O0.OooO00o("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    oooOO0O.f3966OoooO0O.OooO0O0(new Oooo000(o0oooo1));
                    if (oooOO0O.f3964OoooO0 != null) {
                        o00O0O0.OooO00o("Recorder", "Received audio data. Starting muxer...");
                        oooOO0O.OooOoo(oooOOO0);
                    } else {
                        o00O0O0.OooO00o("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                o0oooo1.close();
                return;
            }
            try {
                oooOO0O.Oooo0O0(o0oooo1, oooOOO0);
                o0oooo1.close();
            } catch (Throwable th) {
                if (o0oooo1 != null) {
                    try {
                        o0oooo1.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p045Oooooo.o00Oo0
        public final /* synthetic */ void OooO0OO() {
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0Oo() {
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0o(@NonNull o00OOO00 o00ooo00) {
            OooOO0O.this.f3954Oooo000 = o00ooo00;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0o0(@NonNull EncodeException encodeException) {
            if (OooOO0O.this.f3963OoooO == null) {
                this.f3982OooO0OO.accept(encodeException);
            }
        }
    }

    public static /* synthetic */ class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f3985OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f3986OooO0O0;

        static {
            int[] iArr = new int[EnumC0017OooOO0O.values().length];
            f3986OooO0O0 = iArr;
            try {
                iArr[EnumC0017OooOO0O.ERROR_ENCODER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3986OooO0O0[EnumC0017OooOO0O.ERROR_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3986OooO0O0[EnumC0017OooOO0O.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3986OooO0O0[EnumC0017OooOO0O.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3986OooO0O0[EnumC0017OooOO0O.IDLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3986OooO0O0[EnumC0017OooOO0O.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[OooOOO.values().length];
            f3985OooO00o = iArr2;
            try {
                iArr2[OooOOO.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3985OooO00o[OooOOO.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3985OooO00o[OooOOO.PENDING_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3985OooO00o[OooOOO.PENDING_RECORDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3985OooO00o[OooOOO.RESETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3985OooO00o[OooOOO.STOPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3985OooO00o[OooOOO.CONFIGURING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3985OooO00o[OooOOO.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3985OooO00o[OooOOO.IDLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.OooOO0O$OooOO0O, reason: collision with other inner class name */
    public enum EnumC0017OooOO0O {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public enum OooOOO {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    @AutoValue
    @RequiresApi(21)
    public static abstract class OooOOO0 implements AutoCloseable {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final AtomicBoolean f3987OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final p031OoooO0.Oooo000 f3988OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AtomicReference<OooO0o> f3989OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicBoolean f3990OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final AtomicReference<OooO0OO> f3991OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final AtomicReference<o000OO.OooO00o<Uri>> f3992OooO0oo;

        public class OooO00o implements OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ Context f3993OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ OooOOO0 f3994OooO0O0;

            public OooO00o(androidx.camera.video.OooO0OO oooO0OO, Context context) {
                this.f3994OooO0O0 = oooO0OO;
                this.f3993OooO00o = context;
            }

            @Override // androidx.camera.video.OooOO0O.OooOOO0.OooO0OO
            @NonNull
            @RequiresPermission("android.permission.RECORD_AUDIO")
            public final androidx.camera.video.internal.audio.OooO00o OooO00o(@NonNull oOO00O ooo00o, @NonNull o0O0O00 o0o0o00) throws AudioSourceAccessException {
                return new androidx.camera.video.internal.audio.OooO00o(ooo00o, o0o0o00, this.f3993OooO00o);
            }
        }

        public class OooO0O0 implements OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooOOO0 f3995OooO00o;

            public OooO0O0(androidx.camera.video.OooO0OO oooO0OO) {
                this.f3995OooO00o = oooO0OO;
            }

            @Override // androidx.camera.video.OooOO0O.OooOOO0.OooO0OO
            @NonNull
            @RequiresPermission("android.permission.RECORD_AUDIO")
            public final androidx.camera.video.internal.audio.OooO00o OooO00o(@NonNull oOO00O ooo00o, @NonNull o0O0O00 o0o0o00) throws AudioSourceAccessException {
                return new androidx.camera.video.internal.audio.OooO00o(ooo00o, o0o0o00, null);
            }
        }

        public interface OooO0OO {
            @NonNull
            @RequiresPermission("android.permission.RECORD_AUDIO")
            androidx.camera.video.internal.audio.OooO00o OooO00o(@NonNull oOO00O ooo00o, @NonNull o0O0O00 o0o0o00) throws AudioSourceAccessException;
        }

        public interface OooO0o {
            @NonNull
            MediaMuxer OooO00o(int i, @NonNull p039OoooOoo.o00O0O0 o00o0o0) throws IOException;
        }

        public OooOOO0() {
            this.f3988OooO0Oo = Build.VERSION.SDK_INT >= 30 ? new p031OoooO0.Oooo000(new OoooO0.Oooo000.OooO00o()) : new p031OoooO0.Oooo000(new OoooO0.Oooo000.OooO0OO());
            this.f3990OooO0o0 = new AtomicBoolean(false);
            this.f3989OooO0o = new AtomicReference<>(null);
            this.f3991OooO0oO = new AtomicReference<>(null);
            this.f3992OooO0oo = new AtomicReference<>(new o00OOO0O());
            this.f3987OooO = new AtomicBoolean(false);
        }

        public final void OooO00o(@NonNull Uri uri) {
            if (this.f3990OooO0o0.get()) {
                OooO0OO(this.f3992OooO0oo.getAndSet(null), uri);
            }
        }

        public final void OooO0OO(@Nullable o000OO.OooO00o<Uri> oooO00o, @NonNull Uri uri) {
            if (oooO00o != null) {
                this.f3988OooO0Oo.f1371OooO00o.close();
                oooO00o.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        @Nullable
        public abstract Executor OooO0oO();

        @Nullable
        public abstract o000OO.OooO00o<VideoRecordEvent> OooOOoo();

        @NonNull
        public abstract o00oOoo OooOo00();

        public abstract long OooOo0O();

        public abstract boolean OooOo0o();

        public final void OooOoO(@NonNull final Context context) throws IOException {
            o000OO.OooO00o<Uri> o00ooo00;
            if (this.f3990OooO0o0.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            androidx.camera.video.OooO0OO oooO0OO = (androidx.camera.video.OooO0OO) this;
            final o00oOoo o00oooo2 = oooO0OO.f3904OooOO0;
            boolean z = o00oooo2 instanceof o00;
            o000OO.OooO00o<Uri> oooO00o = null;
            if (z) {
                ((o00) o00oooo2).getClass();
                throw null;
            }
            this.f3988OooO0Oo.f1371OooO00o.OooO00o("finalizeRecording");
            this.f3989OooO0o.set(new OooO0o() { // from class: OoooOoo.o00OO0OO
                @Override // androidx.camera.video.OooOO0O.OooOOO0.OooO0o
                public final MediaMuxer OooO00o(int i, o00O0O0 o00o0o0) throws IOException {
                    boolean zIsDirectory;
                    Uri uri = Uri.EMPTY;
                    o00oOoo o00oooo3 = o00oooo2;
                    if (!(o00oooo3 instanceof o00O0000)) {
                        if (o00oooo3 instanceof o00) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                throw null;
                            }
                            throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                        }
                        if (!(o00oooo3 instanceof o0O0ooO)) {
                            throw new AssertionError("Invalid output options type: ".concat(o00oooo3.getClass().getSimpleName()));
                        }
                        ((o0O0ooO) o00oooo3).getClass();
                        throw null;
                    }
                    File fileOooO0Oo = ((o00O0000) o00oooo3).f1640OooO0O0.OooO0Oo();
                    File parentFile = fileOooO0Oo.getParentFile();
                    if (parentFile == null) {
                        zIsDirectory = false;
                    } else {
                        zIsDirectory = parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
                    }
                    if (!zIsDirectory) {
                        o00O0O0.OooO0oo("Recorder", "Failed to create folder for " + fileOooO0Oo.getAbsolutePath());
                    }
                    MediaMuxer mediaMuxer = new MediaMuxer(fileOooO0Oo.getAbsolutePath(), i);
                    o00o0o0.accept(Uri.fromFile(fileOooO0Oo));
                    return mediaMuxer;
                }
            });
            if (oooO0OO.f3908OooOOO0) {
                int i = Build.VERSION.SDK_INT;
                AtomicReference<OooO0OO> atomicReference = this.f3991OooO0oO;
                if (i >= 31) {
                    atomicReference.set(new OooO00o(oooO0OO, context));
                } else {
                    atomicReference.set(new OooO0O0(oooO0OO));
                }
            }
            if (o00oooo2 instanceof o0O0ooO) {
                final o0O0ooO o0o0ooo = (o0O0ooO) o00oooo2;
                if (Build.VERSION.SDK_INT >= 29) {
                    o00ooo00 = new o000OO.OooO00o() { // from class: OoooOoo.oo0O
                        @Override // o000OO.OooO00o
                        public final void accept(Object obj) {
                            if (((Uri) obj).equals(Uri.EMPTY)) {
                                return;
                            }
                            new ContentValues().put("is_pending", (Integer) 0);
                            o0o0ooo.getClass();
                            throw null;
                        }
                    };
                    oooO00o = o00ooo00;
                } else {
                    oooO00o = new o000OO.OooO00o(context) { // from class: OoooOoo.o00OO
                        @Override // o000OO.OooO00o
                        public final void accept(Object obj) {
                            if (((Uri) obj).equals(Uri.EMPTY)) {
                                return;
                            }
                            this.f1668OooO00o.getClass();
                            throw null;
                        }
                    };
                }
            } else if (z) {
                o00ooo00 = new p039OoooOoo.o00OOO00();
                oooO00o = o00ooo00;
            }
            if (oooO00o != null) {
                this.f3992OooO0oo.set(oooO00o);
            }
        }

        public abstract boolean Oooo00O();

        @NonNull
        public final MediaMuxer Oooo0O0(int i, @NonNull p039OoooOoo.o00O0O0 o00o0o0) throws IOException {
            if (!this.f3990OooO0o0.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            OooO0o andSet = this.f3989OooO0o.getAndSet(null);
            if (andSet != null) {
                return andSet.OooO00o(i, o00o0o0);
            }
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }

        public final void Oooo0OO(@NonNull VideoRecordEvent videoRecordEvent) {
            String strOooO00o;
            o00oOoo o00ooooOooOo00 = OooOo00();
            o00oOoo o00oooo2 = videoRecordEvent.f4031OooO00o;
            if (!Objects.equals(o00oooo2, o00ooooOooOo00)) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + o00oooo2 + ", Expected: " + OooOo00() + "]");
            }
            String strConcat = "Sending VideoRecordEvent ".concat(videoRecordEvent.getClass().getSimpleName());
            int i = 0;
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                int i2 = ((VideoRecordEvent.Finalize) videoRecordEvent).f4033OooO0OO;
                if (i2 != 0) {
                    StringBuilder sbOooO00o = o0o0Oo.OooO00o(strConcat);
                    Object[] objArr = new Object[1];
                    switch (i2) {
                        case 0:
                            strOooO00o = "ERROR_NONE";
                            break;
                        case 1:
                            strOooO00o = "ERROR_UNKNOWN";
                            break;
                        case 2:
                            strOooO00o = "ERROR_FILE_SIZE_LIMIT_REACHED";
                            break;
                        case 3:
                            strOooO00o = "ERROR_INSUFFICIENT_STORAGE";
                            break;
                        case 4:
                            strOooO00o = "ERROR_SOURCE_INACTIVE";
                            break;
                        case 5:
                            strOooO00o = "ERROR_INVALID_OUTPUT_OPTIONS";
                            break;
                        case 6:
                            strOooO00o = "ERROR_ENCODING_FAILED";
                            break;
                        case 7:
                            strOooO00o = "ERROR_RECORDER_ERROR";
                            break;
                        case 8:
                            strOooO00o = "ERROR_NO_VALID_DATA";
                            break;
                        case 9:
                            strOooO00o = "ERROR_DURATION_LIMIT_REACHED";
                            break;
                        case 10:
                            strOooO00o = "ERROR_RECORDING_GARBAGE_COLLECTED";
                            break;
                        default:
                            strOooO00o = OooO0OO.OooO00o.OooO00o("Unknown(", i2, ")");
                            break;
                    }
                    objArr[0] = strOooO00o;
                    sbOooO00o.append(String.format(" [error: %s]", objArr));
                    strConcat = sbOooO00o.toString();
                }
            }
            o00O0O0.OooO00o("Recorder", strConcat);
            if (OooO0oO() == null || OooOOoo() == null) {
                return;
            }
            try {
                OooO0oO().execute(new o00OOO0(i, this, videoRecordEvent));
            } catch (RejectedExecutionException e) {
                o00O0O0.OooO0OO("Recorder", "The callback executor is invalid.", e);
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            OooO00o(Uri.EMPTY);
        }

        public final void finalize() throws Throwable {
            try {
                this.f3988OooO0Oo.f1371OooO00o.OooO0O0();
                o000OO.OooO00o<Uri> andSet = this.f3992OooO0oo.getAndSet(null);
                if (andSet != null) {
                    OooO0OO(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }
    }

    static {
        o000O o000o = o00O000o.f1644OooO0OO;
        p039OoooOoo.oOO00O ooo00oOooO0O0 = p039OoooOoo.oOO00O.OooO0O0(Arrays.asList(o000o, o00O000o.f1643OooO0O0, o00O000o.f1642OooO00o), new p039OoooOoo.o000O0(o000o, 1));
        androidx.camera.video.OooO.OooO00o OooO00o2 = OooOo.OooO00o();
        OooO00o2.OooO0OO(ooo00oOooO0O0);
        OooO00o2.OooO0O0(-1);
        androidx.camera.video.OooO oooOOooO00o = OooO00o2.OooO00o();
        f3917OooooO0 = oooOOooO00o;
        androidx.camera.video.OooO0O0.OooO00o OooO00o3 = MediaSpec.OooO00o();
        OooO00o3.f3903OooO0OO = -1;
        OooO00o3.OooO0O0(oooOOooO00o);
        f3918OooooOO = OooO00o3.OooO00o();
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f3919OooooOo = new o00O0OO0();
        f3920Oooooo0 = new o0O0O00(o00oO0o.OooO0O0());
    }

    public OooOO0O(@NonNull androidx.camera.video.OooO0O0 oooO0O0, @NonNull o00O0OO0 o00o0oo1, @NonNull o00O0OO0 o00o0oo2) {
        this.f3928OooO0oO = o0O0OOOo.OooO00o(oo0OOoo.class) != null;
        this.f3929OooO0oo = OooOOO.CONFIGURING;
        this.f3921OooO = null;
        this.f3930OooOO0 = 0;
        this.f3931OooOO0O = null;
        this.f3932OooOO0o = null;
        this.f3934OooOOO0 = 0L;
        this.f3933OooOOO = null;
        this.f3935OooOOOO = false;
        this.f3936OooOOOo = null;
        this.f3938OooOOo0 = null;
        this.f3937OooOOo = null;
        this.f3939OooOOoo = new ArrayList();
        this.f3942OooOo00 = null;
        this.f3941OooOo0 = null;
        this.f3940OooOo = null;
        this.f3946OooOoO0 = null;
        this.f3945OooOoO = null;
        this.f3949OooOoo0 = null;
        this.f3948OooOoo = null;
        this.f3950OooOooO = null;
        this.f3951OooOooo = null;
        this.f3954Oooo000 = null;
        this.f3955Oooo00O = EnumC0017OooOO0O.INITIALIZING;
        this.f3956Oooo00o = Uri.EMPTY;
        this.f3953Oooo0 = 0L;
        this.f3957Oooo0O0 = 0L;
        this.f3958Oooo0OO = LongCompanionObject.MAX_VALUE;
        this.f3960Oooo0o0 = LongCompanionObject.MAX_VALUE;
        this.f3959Oooo0o = LongCompanionObject.MAX_VALUE;
        this.f3961Oooo0oO = LongCompanionObject.MAX_VALUE;
        this.f3962Oooo0oo = 0L;
        this.f3952Oooo = 0L;
        this.f3965OoooO00 = 1;
        this.f3964OoooO0 = null;
        this.f3966OoooO0O = new o0000(60, null);
        this.f3963OoooO = null;
        this.f3967OoooOO0 = false;
        this.f3973o000oOoO = VideoOutput.SourceState.INACTIVE;
        this.f3968OoooOOO = null;
        this.f3969OoooOOo = false;
        this.f3971OoooOoO = null;
        this.f3972OoooOoo = 0.0d;
        o0OO00O o0oo00oOooO0O0 = o00oO0o.OooO0O0();
        this.f3923OooO0O0 = o0oo00oOooO0O0;
        o0O0O00 o0o0o00 = new o0O0O00(o0oo00oOooO0O0);
        this.f3924OooO0OO = o0o0o00;
        androidx.camera.video.OooO0O0.OooO00o oooO00o = new androidx.camera.video.OooO0O0.OooO00o(oooO0O0);
        if (oooO0O0.f3898OooO00o.OooO0O0() == -1) {
            OooOo oooOo = oooO00o.f3901OooO00o;
            if (oooOo == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            androidx.camera.video.OooO.OooO00o oooO00oOooO0o = oooOo.OooO0o();
            oooO00oOooO0o.OooO0O0(f3917OooooO0.OooO0O0());
            oooO00o.OooO0O0(oooO00oOooO0o.OooO00o());
        }
        this.f3947OooOoOO = new o00O00o0<>(oooO00o.OooO00o());
        int i = this.f3930OooOO0;
        androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(this.f3929OooO0oo);
        androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3996OooO00o;
        this.f3922OooO00o = new o00O00o0<>(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, null));
        this.f3925OooO0Oo = o00o0oo1;
        this.f3927OooO0o0 = o00o0oo2;
        this.f3970OoooOo0 = new o0O00OOO(o00o0oo1, o0o0o00, o0oo00oOooO0O0);
    }

    public static Object OooOO0(@NonNull o00O00o0 o00o00o1) {
        try {
            return o00o00o1.OooO0O0().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    @NonNull
    public static androidx.camera.video.OooOOO.OooO00o OooOO0O(@NonNull OooOOO oooOOO) {
        return (oooOOO == OooOOO.RECORDING || (oooOOO == OooOOO.STOPPING && ((o0O0OOO0) o0O0OOOo.OooO00o(o0O0OOO0.class)) == null)) ? androidx.camera.video.OooOOO.OooO00o.ACTIVE : androidx.camera.video.OooOOO.OooO00o.INACTIVE;
    }

    public static boolean OooOOO(@NonNull androidx.camera.video.OooOOO0 oooOOO0, @Nullable OooOOO0 oooOOO1) {
        return oooOOO1 != null && oooOOO0.f4000OooO0o == oooOOO1.OooOo0O();
    }

    public static void OooOOOo(@NonNull o00O0O o00o0o2) {
        if (o00o0o2 instanceof o0000Ooo) {
            o0000Ooo o0000ooo = (o0000Ooo) o00o0o2;
            o0000ooo.f1897OooO0oo.execute(new o000000O(o0000ooo, 0));
        }
    }

    @NonNull
    public final o000OO00 OooO() {
        long j = this.f3957Oooo0O0;
        long j2 = this.f3953Oooo0;
        EnumC0017OooOO0O enumC0017OooOO0O = this.f3955Oooo00O;
        int i = OooOO0.f3986OooO0O0[enumC0017OooOO0O.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                OooOOO0 oooOOO0 = this.f3933OooOOO;
                if (oooOOO0 == null || !oooOOO0.f3987OooO.get()) {
                    i2 = this.f3967OoooOO0 ? 2 : 0;
                } else {
                    i2 = 5;
                }
            } else {
                if (i != 4 && i != 6) {
                    throw new AssertionError("Invalid internal audio state: " + enumC0017OooOO0O);
                }
                i2 = 1;
            }
        }
        Throwable th = this.f3963OoooO;
        double d = this.f3972OoooOoo;
        Set<Integer> set = AudioStats.f3879OooO00o;
        return o00OOOOo.OooO0Oo(j, j2, new o000O00O(d, i2, th));
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO00o(@NonNull final SurfaceRequest surfaceRequest, @NonNull final Timebase timebase) {
        synchronized (this.f3926OooO0o) {
            o00O0O0.OooO00o("Recorder", "Surface is requested in state: " + this.f3929OooO0oo + ", Current surface: " + this.f3930OooOO0);
            if (this.f3929OooO0oo == OooOOO.ERROR) {
                OooOoOO(OooOOO.CONFIGURING);
            }
        }
        this.f3924OooO0OO.execute(new Runnable() { // from class: OoooOoo.o00OO00O
            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O oooOO0O = this.f1671OooO0Oo;
                SurfaceRequest surfaceRequest2 = oooOO0O.f3943OooOo0O;
                if (surfaceRequest2 != null && !surfaceRequest2.OooO00o()) {
                    oooOO0O.f3943OooOo0O.OooO0Oo();
                }
                SurfaceRequest surfaceRequest3 = surfaceRequest;
                oooOO0O.f3943OooOo0O = surfaceRequest3;
                Timebase timebase2 = timebase;
                oooOO0O.f3944OooOo0o = timebase2;
                oooOO0O.OooO0o(surfaceRequest3, timebase2);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final o00O0<MediaSpec> OooO0O0() {
        return this.f3947OooOoOO;
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final o00O0<androidx.camera.video.OooOOO> OooO0OO() {
        return this.f3922OooO00o;
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO0Oo(@NonNull final VideoOutput.SourceState sourceState) {
        this.f3924OooO0OO.execute(new Runnable() { // from class: OoooOoo.o00O
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                ScheduledFuture<?> scheduledFuture;
                o0000Ooo o0000ooo;
                OooOO0O oooOO0O = this.f1636OooO0Oo;
                VideoOutput.SourceState sourceState2 = oooOO0O.f3973o000oOoO;
                VideoOutput.SourceState sourceState3 = sourceState;
                oooOO0O.f3973o000oOoO = sourceState3;
                if (sourceState2 == sourceState3) {
                    o00O0O0.OooO00o("Recorder", "Video source transitions to the same state: " + sourceState3);
                    return;
                }
                o00O0O0.OooO00o("Recorder", "Video source has transitioned to state: " + sourceState3);
                if (sourceState3 != VideoOutput.SourceState.INACTIVE) {
                    if (sourceState3 != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = oooOO0O.f3968OoooOOO) == null || !scheduledFuture.cancel(false) || (o0000ooo = oooOO0O.f3948OooOoo) == null) {
                        return;
                    }
                    OooOO0O.OooOOOo(o0000ooo);
                    return;
                }
                if (oooOO0O.f3946OooOoO0 == null) {
                    oooOO0O.OooOOoo(false);
                    return;
                }
                oooOO0O.f3969OoooOOo = true;
                OooOO0O.OooOOO0 oooOOO0 = oooOO0O.f3933OooOOO;
                if (oooOOO0 == null || oooOOO0.Oooo00O()) {
                    return;
                }
                oooOO0O.OooOOo0(oooOO0O.f3933OooOOO, 4, null);
            }
        });
    }

    public final void OooO0o(@NonNull final SurfaceRequest surfaceRequest, @NonNull final Timebase timebase) {
        if (surfaceRequest.OooO00o()) {
            o00O0O0.OooO0oo("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        SurfaceRequest.OooO0o oooO0o = new SurfaceRequest.OooO0o() { // from class: OoooOoo.oo0o0O0
            @Override // androidx.camera.core.SurfaceRequest.OooO0o
            public final void OooO00o(SurfaceRequest.OooO0OO oooO0OO) {
                this.f1746OooO0Oo.f3938OooOOo0 = oooO0OO;
            }
        };
        o0O0O00 o0o0o00 = this.f3924OooO0OO;
        surfaceRequest.OooO0OO(o0o0o00, oooO0o);
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) surfaceRequest.f3510OooO0o0.OooO00o();
        o000000 o000000Var = p041Ooooo0o.o000000O.f1752OooO0Oo;
        o00OOOO0 o00oooo1 = new o00OOOO0(o0oo0oo2);
        DynamicRange dynamicRange = surfaceRequest.f3507OooO0OO;
        o00OOOO0.OooO00o oooO00oOooO0Oo = o00oooo1.OooO0Oo(dynamicRange);
        Size size = surfaceRequest.f3506OooO0O0;
        o00O000o o00o000oOooO00o = oooO00oOooO0Oo == null ? o00O000o.f1648OooO0oO : oooO00oOooO0Oo.OooO00o(size);
        o00O0O0.OooO00o("Recorder", "Using supported quality of " + o00o000oOooO00o + " for surface size " + size);
        if (o00o000oOooO00o != o00O000o.f1648OooO0oO) {
            o00000OO o00000ooOooO0O0 = o00oooo1.OooO0O0(o00o000oOooO00o, dynamicRange);
            this.f3937OooOOo = o00000ooOooO0O0;
            if (o00000ooOooO0O0 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        OooOo0o().OooO0oo(new Runnable() { // from class: OoooOoo.o00O00o0
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                com.google.common.util.concurrent.OooOO0O oooOO0OOooO0o0;
                final Timebase timebase2 = timebase;
                OooOO0O oooOO0O = this.f1654OooO0Oo;
                oooOO0O.getClass();
                final SurfaceRequest surfaceRequest2 = surfaceRequest;
                if (!surfaceRequest2.OooO00o()) {
                    o0O00OOO o0o00ooo2 = oooOO0O.f3970OoooOo0;
                    o0o00ooo2.getClass();
                    int[] iArr = o0O00OOO.OooO00o.f1720OooO00o;
                    int i = iArr[o0o00ooo2.f1707OooO.ordinal()];
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            z = o0o00ooo2.f1712OooO0o == surfaceRequest2;
                        } else if (i != 4 && i != 5) {
                            throw new IllegalStateException("State " + o0o00ooo2.f1707OooO + " is not handled");
                        }
                    }
                    if (!z || oooOO0O.OooOOO0()) {
                        Executor executor = oooOO0O.f3923OooO0O0;
                        o00O0OO0 o00o0oo1 = oooOO0O.f3925OooO0Oo;
                        o0O0O00 o0o0o01 = oooOO0O.f3924OooO0OO;
                        final o0O00OOO o0o00ooo3 = new o0O00OOO(o00o0oo1, o0o0o01, executor);
                        final MediaSpec mediaSpec = (MediaSpec) OooOO0O.OooOO0(oooOO0O.f3947OooOoOO);
                        final o00000OO o00000oo2 = oooOO0O.f3937OooOOo;
                        if (iArr[o0o00ooo3.f1707OooO.ordinal()] != 1) {
                            oooOO0OOooO0o0 = new o000oOoO.OooO00o(new IllegalStateException("configure() shouldn't be called in " + o0o00ooo3.f1707OooO));
                        } else {
                            o0o00ooo3.f1707OooO = o0O00OOO.OooO0O0.INITIALIZING;
                            o0o00ooo3.f1712OooO0o = surfaceRequest2;
                            o00O0O0.OooO00o("VideoEncoderSession", "Create VideoEncoderSession: " + o0o00ooo3);
                            o0o00ooo3.f1716OooOO0 = o000O0.OooO00o(new o0O000Oo(o0o00ooo3));
                            o0o00ooo3.f1718OooOO0o = o000O0.OooO00o(new o0O000o0(o0o00ooo3));
                            o000O0.OooO0o oooO0oOooO00o = o000O0.OooO00o(new o000O0.OooO0OO() { // from class: OoooOoo.o0O00
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v5, types: [OoooOoo.o0OoO00O] */
                                @Override // o0ooOO0.o000O0.OooO0OO
                                public final Object OooO0O0(final o000O0.OooO00o oooO00o) {
                                    Timebase timebase3 = timebase2;
                                    final o0O00OOO o0o00ooo4 = o0o00ooo3;
                                    o0o00ooo4.getClass();
                                    final SurfaceRequest surfaceRequest3 = surfaceRequest2;
                                    DynamicRange dynamicRange2 = surfaceRequest3.f3507OooO0OO;
                                    o00000OO o00000oo3 = o00000oo2;
                                    MediaSpec mediaSpec2 = mediaSpec;
                                    o000OOo0 o000ooo0OooO0O0 = o0O0000O.OooO0O0(o0O0000O.OooO0OO(mediaSpec2, dynamicRange2, o00000oo3), timebase3, mediaSpec2.OooO0Oo(), surfaceRequest3.f3506OooO0O0, dynamicRange2, surfaceRequest3.f3508OooO0Oo);
                                    try {
                                        o00O0OO0 o00o0oo2 = o0o00ooo4.f1710OooO0OO;
                                        Executor executor2 = o0o00ooo4.f1708OooO00o;
                                        o00o0oo2.getClass();
                                        o0000Ooo o0000ooo = new o0000Ooo(executor2, o000ooo0OooO0O0);
                                        o0o00ooo4.f1711OooO0Oo = o0000ooo;
                                        o00O0O.OooO0O0 oooO0O0 = o0000ooo.f1894OooO0o;
                                        if (oooO0O0 instanceof o00O0O.OooO0OO) {
                                            ((o00O0O.OooO0OO) oooO0O0).OooO0o0(o0o00ooo4.f1709OooO0O0, new o00O0O.OooO0OO.OooO00o() { // from class: OoooOoo.o0OoO00O
                                                @Override // Oooooo.o00O0O.OooO0OO.OooO00o
                                                public final void OooO00o(Surface surface) {
                                                    Executor executor3;
                                                    final o0O00OOO o0o00ooo5 = o0o00ooo4;
                                                    o0o00ooo5.getClass();
                                                    int i2 = o0O00OOO.OooO00o.f1720OooO00o[o0o00ooo5.f1707OooO.ordinal()];
                                                    o000O0.OooO00o oooO00o2 = oooO00o;
                                                    if (i2 != 1) {
                                                        if (i2 == 2) {
                                                            SurfaceRequest surfaceRequest4 = surfaceRequest3;
                                                            if (surfaceRequest4.OooO00o()) {
                                                                o00O0O0.OooO00o("VideoEncoderSession", "Not provide surface, " + Objects.toString(surfaceRequest4, "EMPTY") + " is already serviced.");
                                                                oooO00o2.OooO0O0(null);
                                                                o0o00ooo5.OooO00o();
                                                                return;
                                                            }
                                                            o0o00ooo5.f1713OooO0o0 = surface;
                                                            o00O0O0.OooO00o("VideoEncoderSession", "provide surface: " + surface);
                                                            surfaceRequest4.OooO0O0(surface, o0o00ooo5.f1709OooO0O0, new OooO00o() { // from class: OoooOoo.o0O00O0o
                                                                @Override // o000OO.OooO00o
                                                                public final void accept(Object obj) {
                                                                    SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
                                                                    o0O00OOO o0o00ooo6 = o0o00ooo5;
                                                                    o0o00ooo6.getClass();
                                                                    o00O0O0.OooO00o("VideoEncoderSession", "Surface can be closed: " + result.OooO0O0().hashCode());
                                                                    Surface surfaceOooO0O0 = result.OooO0O0();
                                                                    if (surfaceOooO0O0 != o0o00ooo6.f1713OooO0o0) {
                                                                        surfaceOooO0O0.release();
                                                                        return;
                                                                    }
                                                                    o0o00ooo6.f1713OooO0o0 = null;
                                                                    o0o00ooo6.f1719OooOOO0.OooO0O0(o0o00ooo6.f1711OooO0Oo);
                                                                    o0o00ooo6.OooO00o();
                                                                }
                                                            });
                                                            o0o00ooo5.f1707OooO = o0O00OOO.OooO0O0.READY;
                                                            oooO00o2.OooO0O0(o0o00ooo5.f1711OooO0Oo);
                                                            return;
                                                        }
                                                        if (i2 == 3) {
                                                            if (o0o00ooo5.f1715OooO0oo != null && (executor3 = o0o00ooo5.f1714OooO0oO) != null) {
                                                                executor3.execute(new o0O00O(0, o0o00ooo5, surface));
                                                            }
                                                            o00O0O0.OooO0oo("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                                                            return;
                                                        }
                                                        if (i2 != 4 && i2 != 5) {
                                                            throw new IllegalStateException("State " + o0o00ooo5.f1707OooO + " is not handled");
                                                        }
                                                    }
                                                    o00O0O0.OooO00o("VideoEncoderSession", "Not provide surface in " + o0o00ooo5.f1707OooO);
                                                    oooO00o2.OooO0O0(null);
                                                }
                                            });
                                        } else {
                                            oooO00o.OooO0OO(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                                        }
                                    } catch (InvalidConfigException e) {
                                        o00O0O0.OooO0OO("VideoEncoderSession", "Unable to initialize video encoder.", e);
                                        oooO00o.OooO0OO(e);
                                    }
                                    return "ConfigureVideoEncoderFuture " + o0o00ooo4;
                                }
                            });
                            oooO0oOooO00o.OooO0oo(new OooOo.OooO0O0(oooO0oOooO00o, new o0O00OO(o0o00ooo3)), o0o00ooo3.f1709OooO0O0);
                            oooOO0OOooO0o0 = OooOo.OooO0o0(oooO0oOooO00o);
                        }
                        oooOO0O.f3970OoooOo0 = o0o00ooo3;
                        oooOO0OOooO0o0.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO0o0, new o00OO0O0(oooOO0O, o0o00ooo3)), o0o0o01);
                        return;
                    }
                }
                o00O0O0.OooO0oo("Recorder", "Ignore the SurfaceRequest " + surfaceRequest2 + " isServiced: " + surfaceRequest2.OooO00o() + " VideoEncoderSession: " + oooOO0O.f3970OoooOo0 + " has been configured with a persistent in-progress recording.");
            }
        }, o0o0o00);
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final o00Oo00 OooO0o0(@NonNull CameraInfo cameraInfo) {
        o000000 o000000Var = p041Ooooo0o.o000000O.f1752OooO0Oo;
        return new o00OOOO0((o0Oo0oo) cameraInfo);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0112 A[Catch: all -> 0x01bc, TryCatch #1 {, blocks: (B:42:0x00ea, B:44:0x00ee, B:46:0x00fe, B:79:0x0177, B:51:0x010c, B:53:0x0112, B:54:0x0120, B:56:0x0124, B:58:0x012a, B:62:0x0132, B:63:0x013a, B:65:0x013e, B:67:0x014c, B:69:0x0150, B:71:0x0156, B:75:0x015e, B:77:0x016e, B:93:0x01a0, B:94:0x01b3, B:95:0x01b4, B:96:0x01bb), top: B:104:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0120 A[Catch: all -> 0x01bc, TryCatch #1 {, blocks: (B:42:0x00ea, B:44:0x00ee, B:46:0x00fe, B:79:0x0177, B:51:0x010c, B:53:0x0112, B:54:0x0120, B:56:0x0124, B:58:0x012a, B:62:0x0132, B:63:0x013a, B:65:0x013e, B:67:0x014c, B:69:0x0150, B:71:0x0156, B:75:0x015e, B:77:0x016e, B:93:0x01a0, B:94:0x01b3, B:95:0x01b4, B:96:0x01bb), top: B:104:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0124 A[Catch: all -> 0x01bc, TryCatch #1 {, blocks: (B:42:0x00ea, B:44:0x00ee, B:46:0x00fe, B:79:0x0177, B:51:0x010c, B:53:0x0112, B:54:0x0120, B:56:0x0124, B:58:0x012a, B:62:0x0132, B:63:0x013a, B:65:0x013e, B:67:0x014c, B:69:0x0150, B:71:0x0156, B:75:0x015e, B:77:0x016e, B:93:0x01a0, B:94:0x01b3, B:95:0x01b4, B:96:0x01bb), top: B:104:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a A[Catch: all -> 0x01bc, TryCatch #1 {, blocks: (B:42:0x00ea, B:44:0x00ee, B:46:0x00fe, B:79:0x0177, B:51:0x010c, B:53:0x0112, B:54:0x0120, B:56:0x0124, B:58:0x012a, B:62:0x0132, B:63:0x013a, B:65:0x013e, B:67:0x014c, B:69:0x0150, B:71:0x0156, B:75:0x015e, B:77:0x016e, B:93:0x01a0, B:94:0x01b3, B:95:0x01b4, B:96:0x01bb), top: B:104:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013e A[Catch: all -> 0x01bc, TryCatch #1 {, blocks: (B:42:0x00ea, B:44:0x00ee, B:46:0x00fe, B:79:0x0177, B:51:0x010c, B:53:0x0112, B:54:0x0120, B:56:0x0124, B:58:0x012a, B:62:0x0132, B:63:0x013a, B:65:0x013e, B:67:0x014c, B:69:0x0150, B:71:0x0156, B:75:0x015e, B:77:0x016e, B:93:0x01a0, B:94:0x01b3, B:95:0x01b4, B:96:0x01bb), top: B:104:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00fe. Please report as an issue. */
    public final void OooO0oO(int i) {
        VideoRecordEvent.Finalize finalize;
        OooOOO0 oooOOO0OooOOOO;
        boolean z;
        boolean z2;
        boolean z3;
        androidx.camera.video.OooO0OO oooO0OO;
        int i2;
        SurfaceRequest surfaceRequest;
        if (this.f3933OooOOO == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.f3945OooOoO;
        boolean z4 = true;
        OooOOO0 oooOOO0 = null;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f3945OooOoO.release();
            } catch (IllegalStateException e) {
                o00O0O0.OooO0O0("Recorder", "MediaMuxer failed to stop or release with error: " + e.getMessage());
                if (i == 0) {
                    i = 1;
                }
            }
            this.f3945OooOoO = null;
        } else if (i == 0) {
            i = 8;
        }
        this.f3933OooOOO.OooO00o(this.f3956Oooo00o);
        o00oOoo o00ooooOooOo00 = this.f3933OooOOO.OooOo00();
        o000OO00 o000oo00OooO = OooO();
        Uri uri = this.f3956Oooo00o;
        o000OO.OooOOO0.OooO0o0(uri, "OutputUri cannot be null.");
        new o000OO0O(uri);
        OooOOO0 oooOOO1 = this.f3933OooOOO;
        boolean z5 = false;
        if (i == 0) {
            finalize = new VideoRecordEvent.Finalize(o00ooooOooOo00, o000oo00OooO, 0);
        } else {
            o000OO.OooOOO0.OooO0O0(i != 0, "An error type is required.");
            finalize = new VideoRecordEvent.Finalize(o00ooooOooOo00, o000oo00OooO, i);
        }
        oooOOO1.Oooo0OO(finalize);
        OooOOO0 oooOOO2 = this.f3933OooOOO;
        this.f3933OooOOO = null;
        this.f3935OooOOOO = false;
        this.f3942OooOo00 = null;
        this.f3941OooOo0 = null;
        this.f3939OooOOoo.clear();
        this.f3956Oooo00o = Uri.EMPTY;
        this.f3953Oooo0 = 0L;
        this.f3957Oooo0O0 = 0L;
        this.f3958Oooo0OO = LongCompanionObject.MAX_VALUE;
        this.f3960Oooo0o0 = LongCompanionObject.MAX_VALUE;
        this.f3959Oooo0o = LongCompanionObject.MAX_VALUE;
        this.f3961Oooo0oO = LongCompanionObject.MAX_VALUE;
        this.f3965OoooO00 = 1;
        this.f3963OoooO = null;
        this.f3972OoooOoo = 0.0d;
        while (true) {
            o0000 o0000Var = this.f3966OoooO0O;
            if (o0000Var.OooO0OO()) {
                break;
            } else {
                o0000Var.OooO00o();
            }
        }
        OooOoO0(null);
        int i3 = OooOO0.f3986OooO0O0[this.f3955Oooo00O.ordinal()];
        if (i3 == 1 || i3 == 2) {
            OooOo(EnumC0017OooOO0O.INITIALIZING);
        } else if (i3 == 3 || i3 == 4) {
            OooOo(EnumC0017OooOO0O.IDLING);
            final androidx.camera.video.internal.audio.OooO00o oooO00o = this.f3949OooOoo0;
            oooO00o.f4043OooO00o.execute(new Runnable() { // from class: OooooO0.o00O0O00
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.audio.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    int i4 = androidx.camera.video.internal.audio.OooO00o.OooO0OO.f4069OooO00o[oooO00o2.f4049OooO0oO.ordinal()];
                    if (i4 == 2) {
                        oooO00o2.OooO0OO(androidx.camera.video.internal.audio.OooO00o.OooOO0.CONFIGURED);
                        oooO00o2.OooO0o0();
                    } else {
                        if (i4 != 3) {
                            return;
                        }
                        o00O0O0.OooO0oo("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                    }
                }
            });
        } else if (i3 == 5) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        synchronized (this.f3926OooO0o) {
            if (this.f3931OooOO0O != oooOOO2) {
                throw new AssertionError("Active recording did not match finalized recording on finalize.");
            }
            this.f3931OooOO0O = null;
            int i4 = OooOO0.f3985OooO00o[this.f3929OooO0oo.ordinal()];
            if (i4 == 9) {
                throw new AssertionError("Unexpected state on finalize of recording: " + this.f3929OooO0oo);
            }
            switch (i4) {
                case 1:
                case 2:
                case 6:
                    if (!this.f3928OooO0oO) {
                        OooOoOO(OooOOO.IDLING);
                        oooO0OO = null;
                        i2 = 0;
                        z3 = false;
                        z2 = false;
                    } else {
                        this.f3946OooOoO0 = null;
                        SurfaceRequest surfaceRequest2 = this.f3943OooOo0O;
                        if (surfaceRequest2 == null || surfaceRequest2.OooO00o()) {
                            z4 = false;
                        }
                        OooOoOO(OooOOO.CONFIGURING);
                        oooOOO0OooOOOO = null;
                        z = false;
                        z2 = false;
                        boolean z6 = z4;
                        z3 = z;
                        i2 = 0;
                        z5 = z6;
                        oooOOO0 = oooOOO0OooOOOO;
                        oooO0OO = null;
                    }
                    break;
                case 3:
                    z = true;
                    if (this.f3973o000oOoO == VideoOutput.SourceState.INACTIVE) {
                        if (this.f3928OooO0oO) {
                            this.f3946OooOoO0 = null;
                            surfaceRequest = this.f3943OooOo0O;
                            if (surfaceRequest != null || surfaceRequest.OooO00o()) {
                                z4 = false;
                            }
                            Oooo0(OooOOO.CONFIGURING);
                            oooOOO0OooOOOO = null;
                            z2 = false;
                        } else if (this.f3948OooOoo != null) {
                            z3 = z;
                            oooO0OO = null;
                            i2 = 0;
                            z2 = false;
                        } else {
                            oooOOO0OooOOOO = OooOOOO(this.f3929OooO0oo);
                            z4 = false;
                            z2 = false;
                        }
                        boolean z7 = z4;
                        z3 = z;
                        i2 = 0;
                        z5 = z7;
                        oooOOO0 = oooOOO0OooOOOO;
                        oooO0OO = null;
                    } else {
                        oooO0OO = this.f3932OooOO0o;
                        this.f3932OooOO0o = null;
                        OooOoOO(OooOOO.CONFIGURING);
                        z3 = z;
                        i2 = 4;
                        z2 = false;
                    }
                    break;
                case 4:
                    z = false;
                    if (this.f3973o000oOoO == VideoOutput.SourceState.INACTIVE) {
                        if (this.f3928OooO0oO) {
                            this.f3946OooOoO0 = null;
                            surfaceRequest = this.f3943OooOo0O;
                            if (surfaceRequest != null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            Oooo0(OooOOO.CONFIGURING);
                            oooOOO0OooOOOO = null;
                            z2 = false;
                        } else if (this.f3948OooOoo != null) {
                            z3 = z;
                            oooO0OO = null;
                            i2 = 0;
                            z2 = false;
                        } else {
                            oooOOO0OooOOOO = OooOOOO(this.f3929OooO0oo);
                            z4 = false;
                            z2 = false;
                        }
                        boolean z8 = z4;
                        z3 = z;
                        i2 = 0;
                        z5 = z8;
                        oooOOO0 = oooOOO0OooOOOO;
                        oooO0OO = null;
                    } else {
                        oooO0OO = this.f3932OooOO0o;
                        this.f3932OooOO0o = null;
                        OooOoOO(OooOOO.CONFIGURING);
                        z3 = z;
                        i2 = 4;
                        z2 = false;
                    }
                    break;
                case 5:
                    z2 = true;
                    oooOOO0OooOOOO = null;
                    z = false;
                    z4 = false;
                    boolean z9 = z4;
                    z3 = z;
                    i2 = 0;
                    z5 = z9;
                    oooOOO0 = oooOOO0OooOOOO;
                    oooO0OO = null;
                    break;
                default:
                    oooO0OO = null;
                    i2 = 0;
                    z3 = false;
                    z2 = false;
                    break;
            }
        }
        if (z5) {
            OooO0o(this.f3943OooOo0O, this.f3944OooOo0o);
            return;
        }
        if (z2) {
            OooOo00();
            return;
        }
        if (oooOOO0 != null) {
            if (this.f3928OooO0oO) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            OooOooo(oooOOO0, z3);
        } else if (oooO0OO != null) {
            OooO0oo(oooO0OO, i2);
        }
    }

    public final void OooO0oo(@NonNull OooOOO0 oooOOO0, int i) {
        oooOOO0.OooO00o(Uri.EMPTY);
        o00oOoo o00ooooOooOo00 = oooOOO0.OooOo00();
        Throwable th = this.f3963OoooO;
        Set<Integer> set = AudioStats.f3879OooO00o;
        o000OO00 o000oo00OooO0Oo = o00OOOOo.OooO0Oo(0L, 0L, new o000O00O(0.0d, 1, th));
        Uri uri = Uri.EMPTY;
        o000OO.OooOOO0.OooO0o0(uri, "OutputUri cannot be null.");
        new o000OO0O(uri);
        o000OO.OooOOO0.OooO0O0(i != 0, "An error type is required.");
        oooOOO0.Oooo0OO(new VideoRecordEvent.Finalize(o00ooooOooOo00, o000oo00OooO0Oo, i));
    }

    public final boolean OooOO0o() {
        return this.f3955Oooo00O == EnumC0017OooOO0O.ENABLED;
    }

    public final boolean OooOOO0() {
        OooOOO0 oooOOO0 = this.f3933OooOOO;
        return oooOOO0 != null && oooOOO0.Oooo00O();
    }

    @NonNull
    @GuardedBy("mLock")
    public final OooOOO0 OooOOOO(@NonNull OooOOO oooOOO) {
        boolean z;
        if (oooOOO == OooOOO.PENDING_PAUSED) {
            z = true;
        } else {
            if (oooOOO != OooOOO.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.f3931OooOO0O != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        androidx.camera.video.OooO0OO oooO0OO = this.f3932OooOO0o;
        if (oooO0OO == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f3931OooOO0O = oooO0OO;
        this.f3932OooOO0o = null;
        if (z) {
            OooOoOO(OooOOO.PAUSED);
        } else {
            OooOoOO(OooOOO.RECORDING);
        }
        return oooO0OO;
    }

    public final void OooOOo() {
        androidx.camera.video.internal.audio.OooO00o oooO00o = this.f3949OooOoo0;
        if (oooO00o == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f3949OooOoo0 = null;
        o00O0O0.OooO00o("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(oooO00o.hashCode())));
        o000O0.OooO0o oooO0oOooO00o = o000O0.OooO00o(new oo00o(oooO00o));
        oooO0oOooO00o.OooO0oo(new OoooO.OooOo.OooO0O0(oooO0oOooO00o, new OooO00o(oooO00o)), o00oO0o.OooO00o());
    }

    public final void OooOOo0(@NonNull OooOOO0 oooOOO0, int i, @Nullable Exception exc) throws Exception {
        boolean z;
        if (oooOOO0 != this.f3933OooOOO) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f3926OooO0o) {
            z = false;
            switch (OooOO0.f3985OooO00o[this.f3929OooO0oo.ordinal()]) {
                case 1:
                case 2:
                    OooOoOO(OooOOO.STOPPING);
                    z = true;
                case 3:
                case 4:
                case 5:
                case 6:
                    if (oooOOO0 != this.f3931OooOO0O) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                    break;
                    break;
                case 7:
                case 8:
                case 9:
                    throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f3929OooO0oo);
                default:
                    break;
            }
        }
        if (z) {
            Oooo000(oooOOO0, -1L, i, exc);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void OooOOoo(boolean z) throws Exception {
        boolean z2;
        boolean z3;
        synchronized (this.f3926OooO0o) {
            z2 = true;
            z3 = false;
            switch (OooOO0.f3985OooO00o[this.f3929OooO0oo.ordinal()]) {
                case 1:
                case 2:
                    o000OO.OooOOO0.OooO0o("In-progress recording shouldn't be null when in state " + this.f3929OooO0oo, this.f3933OooOOO != null);
                    if (this.f3931OooOO0O != this.f3933OooOOO) {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    if (!OooOOO0()) {
                        OooOoOO(OooOOO.RESETTING);
                        z3 = true;
                        z2 = false;
                    }
                    break;
                    break;
                case 3:
                case 4:
                    Oooo0(OooOOO.RESETTING);
                    break;
                case 5:
                default:
                    z2 = false;
                    break;
                case 6:
                    OooOoOO(OooOOO.RESETTING);
                    z2 = false;
                    break;
                case 7:
                case 8:
                case 9:
                    break;
            }
        }
        if (!z2) {
            if (z3) {
                Oooo000(this.f3933OooOOO, -1L, 4, null);
            }
        } else if (z) {
            OooOo0();
        } else {
            OooOo00();
        }
    }

    public final void OooOo(@NonNull EnumC0017OooOO0O enumC0017OooOO0O) {
        o00O0O0.OooO00o("Recorder", "Transitioning audio state: " + this.f3955Oooo00O + " --> " + enumC0017OooOO0O);
        this.f3955Oooo00O = enumC0017OooOO0O;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:14:0x0048, B:15:0x0052, B:22:0x0069, B:17:0x0056, B:18:0x005c, B:21:0x0064), top: B:34:0x0048 }] */
    public final void OooOo0() {
        SurfaceRequest surfaceRequest;
        boolean z = true;
        if (this.f3948OooOoo != null) {
            o00O0O0.OooO00o("Recorder", "Releasing video encoder.");
            o0O00OOO o0o00ooo2 = this.f3971OoooOoO;
            if (o0o00ooo2 != null) {
                o000OO.OooOOO0.OooO0o(null, o0o00ooo2.f1711OooO0Oo == this.f3948OooOoo);
                o00O0O0.OooO00o("Recorder", "Releasing video encoder: " + this.f3948OooOoo);
                this.f3971OoooOoO.OooO0O0();
                this.f3971OoooOoO = null;
                this.f3948OooOoo = null;
                this.f3950OooOooO = null;
                OooOoO(null);
            } else {
                OooOo0o();
            }
        }
        synchronized (this.f3926OooO0o) {
            switch (OooOO0.f3985OooO00o[this.f3929OooO0oo.ordinal()]) {
                case 1:
                case 2:
                case 8:
                    if (!OooOOO0()) {
                        OooOoOO(OooOOO.CONFIGURING);
                    } else {
                        z = false;
                    }
                    break;
                case 3:
                case 4:
                    Oooo0(OooOOO.CONFIGURING);
                    break;
                case 5:
                case 6:
                case 9:
                    OooOoOO(OooOOO.CONFIGURING);
                    break;
            }
        }
        this.f3969OoooOOo = false;
        if (!z || (surfaceRequest = this.f3943OooOo0O) == null || surfaceRequest.OooO00o()) {
            return;
        }
        OooO0o(this.f3943OooOo0O, this.f3944OooOo0o);
    }

    public final void OooOo00() {
        if (this.f3951OooOooo != null) {
            o00O0O0.OooO00o("Recorder", "Releasing audio encoder.");
            this.f3951OooOooo.OooO0oO();
            this.f3951OooOooo = null;
            this.f3954Oooo000 = null;
        }
        if (this.f3949OooOoo0 != null) {
            OooOOo();
        }
        OooOo(EnumC0017OooOO0O.INITIALIZING);
        OooOo0();
    }

    @GuardedBy("mLock")
    public final void OooOo0O() {
        if (f3915Ooooo00.contains(this.f3929OooO0oo)) {
            OooOoOO(this.f3921OooO);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.f3929OooO0oo);
        }
    }

    @NonNull
    public final com.google.common.util.concurrent.OooOO0O<Void> OooOo0o() {
        o00O0O0.OooO00o("Recorder", "Try to safely release video encoder: " + this.f3948OooOoo);
        o0O00OOO o0o00ooo2 = this.f3970OoooOo0;
        o0o00ooo2.OooO00o();
        return p030OoooO.OooOo.OooO0o0(o0o00ooo2.f1716OooOO0);
    }

    public final void OooOoO(@Nullable Surface surface) {
        int iHashCode;
        if (this.f3940OooOo == surface) {
            return;
        }
        this.f3940OooOo = surface;
        synchronized (this.f3926OooO0o) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            OooOoo0(iHashCode);
        }
    }

    public final void OooOoO0(@Nullable SurfaceRequest.OooO0OO oooO0OO) {
        o00O0O0.OooO00o("Recorder", "Update stream transformation info: " + oooO0OO);
        this.f3936OooOOOo = oooO0OO;
        synchronized (this.f3926OooO0o) {
            o00O00o0<androidx.camera.video.OooOOO> o00o00o1 = this.f3922OooO00o;
            int i = this.f3930OooOO0;
            androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(this.f3929OooO0oo);
            androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3996OooO00o;
            o00o00o1.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
        }
    }

    @GuardedBy("mLock")
    public final void OooOoOO(@NonNull OooOOO oooOOO) {
        if (this.f3929OooO0oo == oooOOO) {
            throw new AssertionError("Attempted to transition to state " + oooOOO + ", but Recorder is already in state " + oooOOO);
        }
        o00O0O0.OooO00o("Recorder", "Transitioning Recorder internal state: " + this.f3929OooO0oo + " --> " + oooOOO);
        Set<OooOOO> set = f3915Ooooo00;
        androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = null;
        if (set.contains(oooOOO)) {
            if (!set.contains(this.f3929OooO0oo)) {
                if (!f3916Ooooo0o.contains(this.f3929OooO0oo)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f3929OooO0oo);
                }
                OooOOO oooOOO2 = this.f3929OooO0oo;
                this.f3921OooO = oooOOO2;
                oooO00oOooOO0O = OooOO0O(oooOOO2);
            }
        } else if (this.f3921OooO != null) {
            this.f3921OooO = null;
        }
        this.f3929OooO0oo = oooOOO;
        if (oooO00oOooOO0O == null) {
            oooO00oOooOO0O = OooOO0O(oooOOO);
        }
        int i = this.f3930OooOO0;
        SurfaceRequest.OooO0OO oooO0OO = this.f3936OooOOOo;
        androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3996OooO00o;
        this.f3922OooO00o.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    public final void OooOoo(@NonNull OooOOO0 oooOOO0) throws Exception {
        if (this.f3945OooOoO != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        boolean zOooOO0o = OooOO0o();
        o0000 o0000Var = this.f3966OoooO0O;
        if (zOooOO0o && o0000Var.OooO0OO()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        Oooo0 oooo0 = this.f3964OoooO0;
        if (oooo0 == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f3964OoooO0 = null;
            long jO000oOoO = oooo0.o000oOoO();
            ArrayList arrayList = new ArrayList();
            while (!o0000Var.OooO0OO()) {
                Oooo0 oooo1 = (Oooo0) o0000Var.OooO00o();
                if (oooo1.o000oOoO() >= jO000oOoO) {
                    arrayList.add(oooo1);
                }
            }
            long size = oooo0.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((Oooo0) it.next()).size();
            }
            long j = this.f3962Oooo0oo;
            int i = 2;
            if (j != 0 && size > j) {
                o00O0O0.OooO00o("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f3962Oooo0oo)));
                OooOOo0(oooOOO0, 2, null);
                oooo0.close();
                return;
            }
            try {
                MediaSpec mediaSpec = (MediaSpec) OooOO0(this.f3947OooOoOO);
                if (mediaSpec.OooO0OO() == -1) {
                    o00000OO o00000oo2 = this.f3937OooOOo;
                    int i2 = f3918OooooOO.f3900OooO0OO != 1 ? 0 : 1;
                    if (o00000oo2 == null) {
                        i = i2;
                    } else {
                        int i3 = ((o000OOo) o00000oo2).f1761OooO0O0;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 9) {
                                    i = i2;
                                } else {
                                    i = 1;
                                }
                            }
                        } else if (Build.VERSION.SDK_INT < 26) {
                        }
                        i = 0;
                    }
                } else if (mediaSpec.OooO0OO() != 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                MediaMuxer mediaMuxerOooo0O0 = oooOOO0.Oooo0O0(i, new p039OoooOoo.o00O0O0(this));
                SurfaceRequest.OooO0OO oooO0OO = this.f3938OooOOo0;
                if (oooO0OO != null) {
                    OooOoO0(oooO0OO);
                    mediaMuxerOooo0O0.setOrientationHint(oooO0OO.OooO0O0());
                }
                Location locationOooO0OO = oooOOO0.OooOo00().f1688OooO00o.OooO0OO();
                if (locationOooO0OO != null) {
                    try {
                        double latitude = locationOooO0OO.getLatitude();
                        double longitude = locationOooO0OO.getLongitude();
                        if (o0O0OOOo.OooO00o(o0OO000.class) != null) {
                            if (latitude < 0.0d) {
                                latitude = ((latitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                            if (longitude < 0.0d) {
                                longitude = ((longitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                        }
                        Pair pairCreate = Pair.create(Double.valueOf(latitude), Double.valueOf(longitude));
                        mediaMuxerOooo0O0.setLocation((float) ((Double) pairCreate.first).doubleValue(), (float) ((Double) pairCreate.second).doubleValue());
                    } catch (IllegalArgumentException e) {
                        mediaMuxerOooo0O0.release();
                        OooOOo0(oooOOO0, 5, e);
                        oooo0.close();
                        return;
                    }
                }
                MediaFormat mediaFormat = (MediaFormat) this.f3950OooOooO.f648OooO0o0;
                int i4 = o0000Ooo.OooO.f1918OooOO0O;
                this.f3941OooOo0 = Integer.valueOf(mediaMuxerOooo0O0.addTrack(mediaFormat));
                if (OooOO0o()) {
                    this.f3942OooOo00 = Integer.valueOf(mediaMuxerOooo0O0.addTrack((MediaFormat) this.f3954Oooo000.f648OooO0o0));
                }
                mediaMuxerOooo0O0.start();
                this.f3945OooOoO = mediaMuxerOooo0O0;
                Oooo0OO(oooo0, oooOOO0);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Oooo0O0((Oooo0) it2.next(), oooOOO0);
                }
                oooo0.close();
            } catch (IOException e2) {
                OooOOo0(oooOOO0, 5, e2);
                oooo0.close();
            }
        } catch (Throwable th) {
            try {
                oooo0.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @GuardedBy("mLock")
    public final void OooOoo0(int i) {
        if (this.f3930OooOO0 == i) {
            return;
        }
        o00O0O0.OooO00o("Recorder", "Transitioning streamId: " + this.f3930OooOO0 + " --> " + i);
        this.f3930OooOO0 = i;
        androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(this.f3929OooO0oo);
        SurfaceRequest.OooO0OO oooO0OO = this.f3936OooOOOo;
        androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3996OooO00o;
        this.f3922OooO00o.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public final void OooOooO(@NonNull OooOOO0 oooOOO0) throws InvalidConfigException, AudioSourceAccessException {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxyOooO0o0;
        MediaSpec mediaSpec = (MediaSpec) OooOO0(this.f3947OooOoOO);
        o00000OO o00000oo2 = this.f3937OooOOo;
        int i = 1;
        String str = mediaSpec.OooO0OO() != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i2 = (mediaSpec.OooO0OO() != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (o00000oo2 == null || o00000oo2.OooO0o0() == null) {
            audioProfileProxyOooO0o0 = null;
        } else {
            audioProfileProxyOooO0o0 = o00000oo2.OooO0o0();
            String strOooO0Oo = audioProfileProxyOooO0o0.OooO0Oo();
            int iOooO0o0 = audioProfileProxyOooO0o0.OooO0o0();
            if (Objects.equals(strOooO0Oo, "audio/none")) {
                o00O0O0.OooO00o("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + str + "(profile: " + i2 + ")]");
            } else if (mediaSpec.OooO0OO() == -1) {
                o00O0O0.OooO00o("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + strOooO0Oo + "(profile: " + iOooO0o0 + ")]");
                str = strOooO0Oo;
                i2 = iOooO0o0;
            } else if (str.equals(strOooO0Oo) && i2 == iOooO0o0) {
                o00O0O0.OooO00o("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + strOooO0Oo + "(profile: " + i2 + ")]");
                str = strOooO0Oo;
            } else {
                o00O0O0.OooO00o("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + strOooO0Oo + "(profile: " + iOooO0o0 + "), chosen mime type: " + str + "(profile: " + i2 + ")]");
            }
            audioProfileProxyOooO0o0 = null;
        }
        o0O0o.OooO00o oooO00o = new o0O0o.OooO00o();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00o.f2036OooO00o = str;
        oooO00o.f2037OooO0O0 = -1;
        oooO00o.f2037OooO0O0 = Integer.valueOf(i2);
        if (audioProfileProxyOooO0o0 != null) {
            oooO00o.f2038OooO0OO = audioProfileProxyOooO0o0;
        }
        o0O0o o0o0oOooO00o = oooO00o.OooO00o();
        Timebase timebase = Timebase.UPTIME;
        AudioSpec audioSpecOooO0O0 = mediaSpec.OooO0O0();
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = o0o0oOooO00o.f2035OooO0OO;
        oOO00O ooo00o = (oOO00O) (audioProfileProxy != null ? new oo00oO(audioSpecOooO0O0, audioProfileProxy) : new o0oOOo(audioSpecOooO0O0)).get();
        if (this.f3949OooOoo0 != null) {
            OooOOo();
        }
        if (!oooOOO0.OooOo0o()) {
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + oooOOO0);
        }
        OooOOO0.OooO0OO andSet = oooOOO0.f3991OooO0oO.getAndSet(null);
        if (andSet == null) {
            throw new AssertionError("One-time audio source creation has already occurred for recording " + oooOOO0);
        }
        androidx.camera.video.internal.audio.OooO00o OooO00o2 = andSet.OooO00o(ooo00o, f3920Oooooo0);
        this.f3949OooOoo0 = OooO00o2;
        o00O0O0.OooO00o("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(OooO00o2.hashCode())));
        AudioSpec audioSpecOooO0O1 = mediaSpec.OooO0O0();
        p045Oooooo.OooOO0O oooOO0O = (p045Oooooo.OooOO0O) (audioProfileProxy != null ? new p046Oooooo0.o00OOOOo(o0o0oOooO00o.f2033OooO00o, o0o0oOooO00o.f2034OooO0O0, timebase, audioSpecOooO0O1, ooo00o, audioProfileProxy) : new p046Oooooo0.o00Oo00(o0o0oOooO00o.f2033OooO00o, o0o0oOooO00o.f2034OooO0O0, timebase, audioSpecOooO0O1, ooo00o)).get();
        this.f3927OooO0o0.getClass();
        o0000Ooo o0000ooo = new o0000Ooo(this.f3923OooO0O0, oooOO0O);
        this.f3951OooOooo = o0000ooo;
        o00O0O.OooO0O0 oooO0O0 = o0000ooo.f1894OooO0o;
        if (!(oooO0O0 instanceof o00O0O.OooO00o)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        androidx.camera.video.internal.audio.OooO00o oooO00o2 = this.f3949OooOoo0;
        oooO00o2.f4043OooO00o.execute(new o00O0OOO(i, oooO00o2, (o00O0O.OooO00o) oooO0O0));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    public final void OooOooo(@NonNull OooOOO0 oooOOO0, boolean z) {
        EnumC0017OooOO0O enumC0017OooOO0O;
        if (this.f3933OooOOO != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        if (oooOOO0.OooOo00().f1688OooO00o.OooO0O0() > 0) {
            this.f3962Oooo0oo = Math.round(oooOOO0.OooOo00().f1688OooO00o.OooO0O0() * 0.95d);
            o00O0O0.OooO00o("Recorder", "File size limit in bytes: " + this.f3962Oooo0oo);
        } else {
            this.f3962Oooo0oo = 0L;
        }
        if (oooOOO0.OooOo00().f1688OooO00o.OooO00o() > 0) {
            this.f3952Oooo = TimeUnit.MILLISECONDS.toNanos(oooOOO0.OooOo00().f1688OooO00o.OooO00o());
            o00O0O0.OooO00o("Recorder", "Duration limit in nanoseconds: " + this.f3952Oooo);
        } else {
            this.f3952Oooo = 0L;
        }
        this.f3933OooOOO = oooOOO0;
        switch (OooOO0.f3986OooO0O0[this.f3955Oooo00O.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f3955Oooo00O);
            case 5:
                OooOo(oooOOO0.OooOo0o() ? EnumC0017OooOO0O.ENABLED : EnumC0017OooOO0O.DISABLED);
                break;
            case 6:
                if (oooOOO0.OooOo0o()) {
                    if (!(((MediaSpec) OooOO0(this.f3947OooOoOO)).OooO0O0().OooO0OO() != 0)) {
                        throw new AssertionError("The Recorder doesn't support recording with audio");
                    }
                    try {
                        if (!this.f3933OooOOO.Oooo00O() || this.f3951OooOooo == null) {
                            OooOooO(oooOOO0);
                        }
                        OooOo(EnumC0017OooOO0O.ENABLED);
                    } catch (AudioSourceAccessException e) {
                        e = e;
                        o00O0O0.OooO0OO("Recorder", "Unable to create audio resource with error: ", e);
                        if (e instanceof InvalidConfigException) {
                            enumC0017OooOO0O = EnumC0017OooOO0O.ERROR_ENCODER;
                        } else {
                            enumC0017OooOO0O = EnumC0017OooOO0O.ERROR_SOURCE;
                        }
                        OooOo(enumC0017OooOO0O);
                        this.f3963OoooO = e;
                    } catch (InvalidConfigException e2) {
                        e = e2;
                        o00O0O0.OooO0OO("Recorder", "Unable to create audio resource with error: ", e);
                        if (e instanceof InvalidConfigException) {
                            enumC0017OooOO0O = EnumC0017OooOO0O.ERROR_ENCODER;
                        } else {
                            enumC0017OooOO0O = EnumC0017OooOO0O.ERROR_SOURCE;
                        }
                        OooOo(enumC0017OooOO0O);
                        this.f3963OoooO = e;
                    }
                }
                break;
        }
        Oooo00O(oooOOO0, false);
        if (OooOO0o()) {
            final androidx.camera.video.internal.audio.OooO00o oooO00o = this.f3949OooOoo0;
            final boolean z2 = oooOOO0.f3987OooO.get();
            oooO00o.f4043OooO00o.execute(new Runnable() { // from class: OooooO0.o00O00OO
                @Override // java.lang.Runnable
                public final void run() {
                    final androidx.camera.video.internal.audio.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    int i = androidx.camera.video.internal.audio.OooO00o.OooO0OO.f4069OooO00o[oooO00o2.f4049OooO0oO.ordinal()];
                    if (i != 1) {
                        if (i == 3) {
                            throw new AssertionError("AudioSource is released");
                        }
                        return;
                    }
                    oooO00o2.f4044OooO0O0.set(null);
                    oooO00o2.f4045OooO0OO.set(false);
                    oooO00o2.OooO0OO(androidx.camera.video.internal.audio.OooO00o.OooOO0.STARTED);
                    final boolean z3 = z2;
                    oooO00o2.f4043OooO00o.execute(new Runnable() { // from class: OooooO0.o00O0OOO
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.video.internal.audio.OooO00o oooO00o3 = oooO00o2;
                            oooO00o3.getClass();
                            int i2 = androidx.camera.video.internal.audio.OooO00o.OooO0OO.f4069OooO00o[oooO00o3.f4049OooO0oO.ordinal()];
                            if (i2 != 1 && i2 != 2) {
                                if (i2 == 3) {
                                    throw new AssertionError("AudioSource is released");
                                }
                                return;
                            }
                            boolean z4 = oooO00o3.f4058OooOOo;
                            boolean z5 = z3;
                            if (z4 == z5) {
                                return;
                            }
                            oooO00o3.f4058OooOOo = z5;
                            if (oooO00o3.f4049OooO0oO == androidx.camera.video.internal.audio.OooO00o.OooOO0.STARTED) {
                                oooO00o3.OooO00o();
                            }
                        }
                    });
                    oooO00o2.OooO0o0();
                }
            });
            this.f3951OooOooo.OooOOO();
        }
        this.f3948OooOoo.OooOOO();
        OooOOO0 oooOOO1 = this.f3933OooOOO;
        oooOOO1.Oooo0OO(new VideoRecordEvent.OooO0O0(oooOOO1.OooOo00(), OooO()));
        if (z && this.f3933OooOOO == oooOOO0 && !this.f3935OooOOOO) {
            if (OooOO0o()) {
                this.f3951OooOooo.OooO0o();
            }
            this.f3948OooOoo.OooO0o();
            OooOOO0 oooOOO2 = this.f3933OooOOO;
            oooOOO2.Oooo0OO(new VideoRecordEvent.OooO00o(oooOOO2.OooOo00(), OooO()));
        }
    }

    @GuardedBy("mLock")
    public final void Oooo0(@NonNull OooOOO oooOOO) {
        if (!f3915Ooooo00.contains(this.f3929OooO0oo)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f3929OooO0oo);
        }
        if (!f3916Ooooo0o.contains(oooOOO)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + oooOOO);
        }
        if (this.f3921OooO != oooOOO) {
            this.f3921OooO = oooOOO;
            int i = this.f3930OooOO0;
            androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(oooOOO);
            SurfaceRequest.OooO0OO oooO0OO = this.f3936OooOOOo;
            androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3996OooO00o;
            this.f3922OooO00o.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
        }
    }

    public final void Oooo000(@NonNull OooOOO0 oooOOO0, long j, int i, @Nullable Throwable th) throws Exception {
        if (this.f3933OooOOO != oooOOO0 || this.f3935OooOOOO) {
            return;
        }
        this.f3935OooOOOO = true;
        this.f3965OoooO00 = i;
        if (OooOO0o()) {
            while (true) {
                o0000 o0000Var = this.f3966OoooO0O;
                if (o0000Var.OooO0OO()) {
                    break;
                } else {
                    o0000Var.OooO00o();
                }
            }
            this.f3951OooOooo.OooOOOO(j);
        }
        Oooo0 oooo0 = this.f3964OoooO0;
        if (oooo0 != null) {
            oooo0.close();
            this.f3964OoooO0 = null;
        }
        if (this.f3973o000oOoO != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            final o0000Ooo o0000ooo = this.f3948OooOoo;
            this.f3968OoooOOO = o00oO0o.OooO0OO().schedule(new Runnable() { // from class: OoooOoo.oo00o
                @Override // java.lang.Runnable
                public final void run() {
                    o0O0O00 o0o0o00 = this.f1738OooO0Oo.f3924OooO0OO;
                    final o00O0O o00o0o2 = o0000ooo;
                    o0o0o00.execute(new Runnable() { // from class: OoooOoo.o00O0O00
                        @Override // java.lang.Runnable
                        public final void run() {
                            o00O0O0.OooO00o("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                            if (o0O0OOOo.OooO00o(o0O0OOO0.class) != null) {
                                OooOO0O.OooOOOo(o00o0o2);
                            }
                        }
                    });
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        } else {
            OooOOOo(this.f3948OooOoo);
        }
        this.f3948OooOoo.OooOOOO(j);
    }

    public final void Oooo00O(@NonNull final OooOOO0 oooOOO0, boolean z) {
        ArrayList arrayList = this.f3939OooOOoo;
        if (!arrayList.isEmpty()) {
            o00Ooo o00oooOooO00o = p030OoooO.OooOo.OooO00o(arrayList);
            if (!o00oooOooO00o.isDone()) {
                o00oooOooO00o.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(o000O0.OooO00o(new p039OoooOoo.o00O0OOO(this, oooOOO0)));
        if (OooOO0o() && !z) {
            arrayList.add(o000O0.OooO00o(new o000O0.OooO0OO() { // from class: OoooOoo.oo0oOO0
                /* JADX WARN: Type inference failed for: r1v0, types: [OoooOoo.o00OO000] */
                @Override // o0ooOO0.o000O0.OooO0OO
                public final Object OooO0O0(final o000O0.OooO00o oooO00o) {
                    final OooOO0O oooOO0O = this.f1747OooO0Oo;
                    oooOO0O.getClass();
                    ?? r1 = new OooO00o() { // from class: OoooOoo.o00OO000
                        @Override // o000OO.OooO00o
                        public final void accept(Object obj) {
                            Throwable th = (Throwable) obj;
                            OooOO0O oooOO0O2 = oooOO0O;
                            if (oooOO0O2.f3963OoooO == null) {
                                if (th instanceof EncodeException) {
                                    oooOO0O2.OooOo(OooOO0O.EnumC0017OooOO0O.ERROR_ENCODER);
                                } else {
                                    oooOO0O2.OooOo(OooOO0O.EnumC0017OooOO0O.ERROR_SOURCE);
                                }
                                oooOO0O2.f3963OoooO = th;
                                oooOO0O2.Oooo00o();
                                oooO00o.OooO0O0(null);
                            }
                        }
                    };
                    final androidx.camera.video.internal.audio.OooO00o oooO00o2 = oooOO0O.f3949OooOoo0;
                    final OooOO0O.OooO0OO oooO0OO = oooOO0O.new OooO0OO(r1);
                    o0O0O00 o0o0o00 = oooO00o2.f4043OooO00o;
                    final o0O0O00 o0o0o01 = oooOO0O.f3924OooO0OO;
                    o0o0o00.execute(new Runnable() { // from class: OooooO0.o00O0O0O
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.video.internal.audio.OooO00o oooO00o3 = oooO00o2;
                            oooO00o3.getClass();
                            int i = androidx.camera.video.internal.audio.OooO00o.OooO0OO.f4069OooO00o[oooO00o3.f4049OooO0oO.ordinal()];
                            if (i == 1) {
                                oooO00o3.f4051OooOO0 = o0o0o01;
                                oooO00o3.f4052OooOO0O = oooO0OO;
                            } else if (i == 2 || i == 3) {
                                throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                            }
                        }
                    });
                    oooOO0O.f3951OooOooo.OooOO0O(oooOO0O.new OooO0o(oooO00o, r1, oooOOO0), o0o0o01);
                    return "audioEncodingFuture";
                }
            }));
        }
        o00Ooo o00oooOooO00o2 = p030OoooO.OooOo.OooO00o(arrayList);
        OooO oooO = new OooO();
        o00oooOooO00o2.OooO0oo(new OoooO.OooOo.OooO0O0(o00oooOooO00o2, oooO), o00oO0o.OooO00o());
    }

    public final void Oooo00o() {
        OooOOO0 oooOOO0 = this.f3933OooOOO;
        if (oooOOO0 != null) {
            oooOOO0.Oooo0OO(new VideoRecordEvent.OooO0OO(oooOOO0.OooOo00(), OooO()));
        }
    }

    public final void Oooo0O0(@NonNull Oooo0 oooo0, @NonNull OooOOO0 oooOOO0) throws Exception {
        long size = oooo0.size() + this.f3953Oooo0;
        long j = this.f3962Oooo0oo;
        if (j != 0 && size > j) {
            o00O0O0.OooO00o("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f3962Oooo0oo)));
            OooOOo0(oooOOO0, 2, null);
            return;
        }
        long jO000oOoO = oooo0.o000oOoO();
        long j2 = this.f3960Oooo0o0;
        if (j2 == LongCompanionObject.MAX_VALUE) {
            this.f3960Oooo0o0 = jO000oOoO;
            o00O0O0.OooO00o("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jO000oOoO), o00000O0.OooO0OO(this.f3960Oooo0o0)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jO000oOoO - Math.min(this.f3958Oooo0OO, j2));
            o000OO.OooOOO0.OooO0o("There should be a previous data for adjusting the duration.", this.f3961Oooo0oO != LongCompanionObject.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jO000oOoO - this.f3961Oooo0oO) + nanos;
            long j3 = this.f3952Oooo;
            if (j3 != 0 && nanos2 > j3) {
                o00O0O0.OooO00o("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f3952Oooo)));
                OooOOo0(oooOOO0, 9, null);
                return;
            }
        }
        this.f3945OooOoO.writeSampleData(this.f3942OooOo00.intValue(), oooo0.OooO0o(), oooo0.OooOooo());
        this.f3953Oooo0 = size;
        this.f3961Oooo0oO = jO000oOoO;
    }

    public final void Oooo0OO(@NonNull Oooo0 oooo0, @NonNull OooOOO0 oooOOO0) throws Exception {
        if (this.f3941OooOo0 == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = oooo0.size() + this.f3953Oooo0;
        long j = this.f3962Oooo0oo;
        long j2 = 0;
        if (j != 0 && size > j) {
            o00O0O0.OooO00o("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f3962Oooo0oo)));
            OooOOo0(oooOOO0, 2, null);
            return;
        }
        long jO000oOoO = oooo0.o000oOoO();
        long j3 = this.f3958Oooo0OO;
        if (j3 == LongCompanionObject.MAX_VALUE) {
            this.f3958Oooo0OO = jO000oOoO;
            o00O0O0.OooO00o("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jO000oOoO), o00000O0.OooO0OO(this.f3958Oooo0OO)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jO000oOoO - Math.min(j3, this.f3960Oooo0o0));
            o000OO.OooOOO0.OooO0o("There should be a previous data for adjusting the duration.", this.f3959Oooo0o != LongCompanionObject.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jO000oOoO - this.f3959Oooo0o) + nanos;
            long j4 = this.f3952Oooo;
            if (j4 != 0 && nanos2 > j4) {
                o00O0O0.OooO00o("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f3952Oooo)));
                OooOOo0(oooOOO0, 9, null);
                return;
            }
            j2 = nanos;
        }
        this.f3945OooOoO.writeSampleData(this.f3941OooOo0.intValue(), oooo0.OooO0o(), oooo0.OooOooo());
        this.f3953Oooo0 = size;
        this.f3957Oooo0O0 = j2;
        this.f3959Oooo0o = jO000oOoO;
        Oooo00o();
    }
}
