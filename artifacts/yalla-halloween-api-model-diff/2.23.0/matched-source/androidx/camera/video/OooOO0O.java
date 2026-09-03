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
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.OooOO0O.OooO0OO;
import androidx.camera.video.OooOO0O.OooO0o;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.OooO00o;
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
import p023Oooo00o.oO0OOo0o;
import p023Oooo00o.oO0Oo0oo;
import p028Oooo0oO.o00O0O0;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.o0OO00O;
import p036OoooOOo.o0000;
import p039OoooOoo.o00;
import p039OoooOoo.o000O;
import p039OoooOoo.o000O0;
import p039OoooOoo.o000OO00;
import p039OoooOoo.o000OO0O;
import p039OoooOoo.o00O000o;
import p039OoooOoo.o00O0O00;
import p039OoooOoo.o00O0OO;
import p039OoooOoo.o00O0OO0;
import p039OoooOoo.o00OO;
import p039OoooOoo.o00OO0OO;
import p039OoooOoo.o00OOO0;
import p039OoooOoo.o00OOO00;
import p039OoooOoo.o00OOO0O;
import p039OoooOoo.o00oOoo;
import p039OoooOoo.o0O000Oo;
import p039OoooOoo.o0O0ooO;
import p039OoooOoo.oo00o;
import p039OoooOoo.oo0O;
import p041Ooooo0o.o000000;
import p041Ooooo0o.o000000O;
import p041Ooooo0o.o00000O0;
import p041Ooooo0o.o00000OO;
import p041Ooooo0o.o000OOo;
import p042OooooO0.o00O00o0;
import p042OooooO0.o00O0O0O;
import p044OooooOo.o0O00oO0;
import p044OooooOo.o0O0O0O;
import p044OooooOo.o0oO0O0o;
import p044OooooOo.oo0OOoo;
import p045Oooooo.Oooo0;
import p045Oooooo.Oooo000;
import p045Oooooo.o00000;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o000O00O;
import p045Oooooo.o00O0O;
import p045Oooooo.o00Oo0;
import p045Oooooo.o0OoOo0;
import p046Oooooo0.o00OOOOo;
import p046Oooooo0.o00Oo00;
import p046Oooooo0.o0O0o;
import p046Oooooo0.o0oOOo;
import p046Oooooo0.oo00oO;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOO0O implements VideoOutput {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final Set<OooOOO> f3912Ooooo00 = Collections.unmodifiableSet(EnumSet.of(OooOOO.PENDING_RECORDING, OooOOO.PENDING_PAUSED));

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final Set<OooOOO> f3913Ooooo0o = Collections.unmodifiableSet(EnumSet.of(OooOOO.CONFIGURING, OooOOO.IDLING, OooOOO.RESETTING, OooOOO.STOPPING, OooOOO.ERROR));

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final OooOo f3914OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final androidx.camera.video.OooO0O0 f3915OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @VisibleForTesting
    public static final o00O0O00 f3916OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final o0O0O00 f3917Oooooo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooOOO f3918OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOO00O<androidx.camera.video.OooOOO> f3919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f3920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00 f3921OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O00 f3922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f3923OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0O00 f3924OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f3925OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooOOO f3926OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3927OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooOOO0 f3928OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public androidx.camera.video.OooO0OO f3929OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooOOO0 f3930OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public long f3931OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f3932OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public SurfaceRequest.OooO0OO f3933OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o00000OO f3934OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public SurfaceRequest.OooO0OO f3935OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList f3936OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Surface f3937OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Integer f3938OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Integer f3939OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public SurfaceRequest f3940OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Timebase f3941OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public MediaMuxer f3942OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Surface f3943OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final oOO00O<MediaSpec> f3944OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o0000Ooo f3945OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public androidx.camera.video.internal.audio.OooO00o f3946OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o000O00O f3947OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public o0000Ooo f3948OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f3949Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f3950Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public o000O00O f3951Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public EnumC0016OooOO0O f3952Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NonNull
    public Uri f3953Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f3954Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @VisibleForTesting
    public long f3955Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f3956Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @VisibleForTesting
    public long f3957Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f3958Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f3959Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Throwable f3960OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Oooo0 f3961OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f3962OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NonNull
    public final o0000 f3963OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f3964OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ScheduledFuture<?> f3965OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f3966OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NonNull
    public o0O000Oo f3967OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public o0O000Oo f3968OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public double f3969OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public VideoOutput.SourceState f3970o000oOoO;

    public class OooO implements p030OoooO.OooOOO0<List<Void>> {
        public OooO() {
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            OooOO0O oooOO0O = OooOO0O.this;
            o000OO.OooOOO0.OooO0o("In-progress recording shouldn't be null", oooOO0O.f3930OooOOO != null);
            if (oooOO0O.f3930OooOOO.OooOooO()) {
                return;
            }
            o00O0O0.OooO00o("Recorder", "Encodings end with error: " + th);
            oooOO0O.OooO0oO(oooOO0O.f3942OooOoO == null ? 8 : 6);
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable List<Void> list) {
            o00O0O0.OooO00o("Recorder", "Encodings end successfully.");
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.OooO0oO(oooOO0O.f3962OoooO00);
        }
    }

    public class OooO00o implements p030OoooO.OooOOO0<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.video.internal.audio.OooO00o f3972OooO00o;

        public OooO00o(androidx.camera.video.internal.audio.OooO00o oooO00o) {
            this.f3972OooO00o = oooO00o;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o00O0O0.OooO00o("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f3972OooO00o.hashCode())));
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable Void r3) {
            o00O0O0.OooO00o("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f3972OooO00o.hashCode())));
        }
    }

    public class OooO0O0 implements o00Oo0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O000.OooO00o f3973OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f3974OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f3975OooO0Oo;

        public OooO0O0(OooOOO0 oooOOO0, OooOO0O oooOO0O, o00O000.OooO00o oooO00o) {
            this.f3975OooO0Oo = oooOO0O;
            this.f3973OooO0O0 = oooO00o;
            this.f3974OooO0OO = oooOOO0;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO00o() {
            this.f3973OooO0O0.OooO0O0(null);
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0O0(@NonNull o0OoOo0 o0oooo0) throws Exception {
            boolean z;
            OooOO0O oooOO0O = this.f3975OooO0Oo;
            MediaMuxer mediaMuxer = oooOO0O.f3942OooOoO;
            OooOOO0 oooOOO0 = this.f3974OooO0OO;
            if (mediaMuxer != null) {
                try {
                    oooOO0O.Oooo0OO(o0oooo0, oooOOO0);
                    o0oooo0.close();
                    return;
                } catch (Throwable th) {
                    if (o0oooo0 != null) {
                        try {
                            o0oooo0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (oooOO0O.f3932OooOOOO) {
                o00O0O0.OooO00o("Recorder", "Drop video data since recording is stopping.");
                o0oooo0.close();
                return;
            }
            Oooo0 oooo0 = oooOO0O.f3961OoooO0;
            int i = 1;
            if (oooo0 != null) {
                oooo0.close();
                oooOO0O.f3961OoooO0 = null;
                z = true;
            } else {
                z = false;
            }
            if (!o0oooo0.OooO00o()) {
                if (z) {
                    o00O0O0.OooO00o("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                o00O0O0.OooO00o("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                o0000Ooo o0000ooo = oooOO0O.f3945OooOoo;
                o0000ooo.f1905OooO0oo.execute(new androidx.appcompat.widget.o000O00O(o0000ooo, i));
                o0oooo0.close();
                return;
            }
            oooOO0O.f3961OoooO0 = o0oooo0;
            if (!oooOO0O.OooOO0o() || !oooOO0O.f3963OoooO0O.OooO0OO()) {
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
        public final void OooO0o(@NonNull o000O00O o000o00o2) {
            this.f3975OooO0Oo.f3947OooOooO = o000o00o2;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0o0(@NonNull EncodeException encodeException) {
            this.f3973OooO0O0.OooO0OO(encodeException);
        }
    }

    public class OooO0OO implements androidx.camera.video.internal.audio.OooO00o.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000OO.OooO00o f3976OooO00o;

        public OooO0OO(o00O0OO o00o0oo2) {
            this.f3976OooO00o = o00o0oo2;
        }
    }

    public class OooO0o implements o00Oo0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O000.OooO00o f3978OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o000OO.OooO00o f3979OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f3980OooO0Oo;

        public OooO0o(o00O000.OooO00o oooO00o, o00O0OO o00o0oo2, OooOOO0 oooOOO0) {
            this.f3978OooO0O0 = oooO00o;
            this.f3979OooO0OO = o00o0oo2;
            this.f3980OooO0Oo = oooOOO0;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO00o() {
            this.f3978OooO0O0.OooO0O0(null);
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0O0(@NonNull o0OoOo0 o0oooo0) throws Exception {
            OooOO0O oooOO0O = OooOO0O.this;
            if (oooOO0O.f3952Oooo00O == EnumC0016OooOO0O.DISABLED) {
                o0oooo0.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            MediaMuxer mediaMuxer = oooOO0O.f3942OooOoO;
            OooOOO0 oooOOO0 = this.f3980OooO0Oo;
            if (mediaMuxer == null) {
                if (oooOO0O.f3932OooOOOO) {
                    o00O0O0.OooO00o("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    oooOO0O.f3963OoooO0O.OooO0O0(new Oooo000(o0oooo0));
                    if (oooOO0O.f3961OoooO0 != null) {
                        o00O0O0.OooO00o("Recorder", "Received audio data. Starting muxer...");
                        oooOO0O.OooOoo(oooOOO0);
                    } else {
                        o00O0O0.OooO00o("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                o0oooo0.close();
                return;
            }
            try {
                oooOO0O.Oooo0O0(o0oooo0, oooOOO0);
                o0oooo0.close();
            } catch (Throwable th) {
                if (o0oooo0 != null) {
                    try {
                        o0oooo0.close();
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
        public final void OooO0o(@NonNull o000O00O o000o00o2) {
            OooOO0O.this.f3951Oooo000 = o000o00o2;
        }

        @Override // p045Oooooo.o00Oo0
        public final void OooO0o0(@NonNull EncodeException encodeException) {
            if (OooOO0O.this.f3960OoooO == null) {
                this.f3979OooO0OO.accept(encodeException);
            }
        }
    }

    public static /* synthetic */ class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f3982OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f3983OooO0O0;

        static {
            int[] iArr = new int[EnumC0016OooOO0O.values().length];
            f3983OooO0O0 = iArr;
            try {
                iArr[EnumC0016OooOO0O.ERROR_ENCODER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3983OooO0O0[EnumC0016OooOO0O.ERROR_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3983OooO0O0[EnumC0016OooOO0O.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3983OooO0O0[EnumC0016OooOO0O.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3983OooO0O0[EnumC0016OooOO0O.IDLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3983OooO0O0[EnumC0016OooOO0O.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[OooOOO.values().length];
            f3982OooO00o = iArr2;
            try {
                iArr2[OooOOO.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3982OooO00o[OooOOO.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3982OooO00o[OooOOO.PENDING_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3982OooO00o[OooOOO.PENDING_RECORDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3982OooO00o[OooOOO.RESETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3982OooO00o[OooOOO.STOPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3982OooO00o[OooOOO.CONFIGURING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3982OooO00o[OooOOO.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3982OooO00o[OooOOO.IDLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.OooOO0O$OooOO0O, reason: collision with other inner class name */
    public enum EnumC0016OooOO0O {
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
        public final AtomicBoolean f3984OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final p031OoooO0.Oooo000 f3985OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AtomicReference<OooO0o> f3986OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicBoolean f3987OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final AtomicReference<OooO0OO> f3988OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final AtomicReference<o000OO.OooO00o<Uri>> f3989OooO0oo;

        public class OooO00o implements OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ Context f3990OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ OooOOO0 f3991OooO0O0;

            public OooO00o(androidx.camera.video.OooO0OO oooO0OO, Context context) {
                this.f3991OooO0O0 = oooO0OO;
                this.f3990OooO00o = context;
            }

            @Override // androidx.camera.video.OooOO0O.OooOOO0.OooO0OO
            @NonNull
            @RequiresPermission("android.permission.RECORD_AUDIO")
            public final androidx.camera.video.internal.audio.OooO00o OooO00o(@NonNull o00O00o0 o00o00o1, @NonNull o0O0O00 o0o0o00) throws AudioSourceAccessException {
                return new androidx.camera.video.internal.audio.OooO00o(o00o00o1, o0o0o00, this.f3990OooO00o);
            }
        }

        public class OooO0O0 implements OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooOOO0 f3992OooO00o;

            public OooO0O0(androidx.camera.video.OooO0OO oooO0OO) {
                this.f3992OooO00o = oooO0OO;
            }

            @Override // androidx.camera.video.OooOO0O.OooOOO0.OooO0OO
            @NonNull
            @RequiresPermission("android.permission.RECORD_AUDIO")
            public final androidx.camera.video.internal.audio.OooO00o OooO00o(@NonNull o00O00o0 o00o00o1, @NonNull o0O0O00 o0o0o00) throws AudioSourceAccessException {
                return new androidx.camera.video.internal.audio.OooO00o(o00o00o1, o0o0o00, null);
            }
        }

        public interface OooO0OO {
            @NonNull
            @RequiresPermission("android.permission.RECORD_AUDIO")
            androidx.camera.video.internal.audio.OooO00o OooO00o(@NonNull o00O00o0 o00o00o1, @NonNull o0O0O00 o0o0o00) throws AudioSourceAccessException;
        }

        public interface OooO0o {
            @NonNull
            MediaMuxer OooO00o(int i, @NonNull oo00o oo00oVar) throws IOException;
        }

        public OooOOO0() {
            this.f3985OooO0Oo = Build.VERSION.SDK_INT >= 30 ? new p031OoooO0.Oooo000(new OoooO0.Oooo000.OooO00o()) : new p031OoooO0.Oooo000(new OoooO0.Oooo000.OooO0OO());
            this.f3987OooO0o0 = new AtomicBoolean(false);
            this.f3986OooO0o = new AtomicReference<>(null);
            this.f3988OooO0oO = new AtomicReference<>(null);
            this.f3989OooO0oo = new AtomicReference<>(new oo0O());
            this.f3984OooO = new AtomicBoolean(false);
        }

        public final void OooO00o(@NonNull Uri uri) {
            if (this.f3987OooO0o0.get()) {
                OooO0OO(this.f3989OooO0oo.getAndSet(null), uri);
            }
        }

        public final void OooO0OO(@Nullable o000OO.OooO00o<Uri> oooO00o, @NonNull Uri uri) {
            if (oooO00o != null) {
                this.f3985OooO0Oo.f1397OooO00o.close();
                oooO00o.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        @Nullable
        public abstract Executor OooO0oO();

        @NonNull
        public abstract o00oOoo OooOOo();

        @Nullable
        public abstract o000OO.OooO00o<VideoRecordEvent> OooOOo0();

        public final void OooOo(@NonNull final Context context) throws IOException {
            o000OO.OooO00o<Uri> o00oo0oo;
            if (this.f3987OooO0o0.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            androidx.camera.video.OooO0OO oooO0OO = (androidx.camera.video.OooO0OO) this;
            final o00oOoo o00oooo2 = oooO0OO.f3901OooOO0;
            boolean z = o00oooo2 instanceof o00;
            o000OO.OooO00o<Uri> oooO00o = null;
            if (z) {
                ((o00) o00oooo2).getClass();
                throw null;
            }
            this.f3985OooO0Oo.f1397OooO00o.OooO00o("finalizeRecording");
            this.f3986OooO0o.set(new OooO0o() { // from class: OoooOoo.o00OO000
                @Override // androidx.camera.video.OooOO0O.OooOOO0.OooO0o
                public final MediaMuxer OooO00o(int i, oo00o oo00oVar) throws IOException {
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
                    File fileOooO0Oo = ((o00O0000) o00oooo3).f1670OooO0O0.OooO0Oo();
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
                    oo00oVar.accept(Uri.fromFile(fileOooO0Oo));
                    return mediaMuxer;
                }
            });
            if (oooO0OO.f3905OooOOO0) {
                int i = Build.VERSION.SDK_INT;
                AtomicReference<OooO0OO> atomicReference = this.f3988OooO0oO;
                if (i >= 31) {
                    atomicReference.set(new OooO00o(oooO0OO, context));
                } else {
                    atomicReference.set(new OooO0O0(oooO0OO));
                }
            }
            if (o00oooo2 instanceof o0O0ooO) {
                final o0O0ooO o0o0ooo = (o0O0ooO) o00oooo2;
                if (Build.VERSION.SDK_INT >= 29) {
                    o00oo0oo = new o000OO.OooO00o() { // from class: OoooOoo.o00OO00O
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
                    oooO00o = o00oo0oo;
                } else {
                    oooO00o = new o000OO.OooO00o(context) { // from class: OoooOoo.o00OO0O0
                        @Override // o000OO.OooO00o
                        public final void accept(Object obj) {
                            if (((Uri) obj).equals(Uri.EMPTY)) {
                                return;
                            }
                            this.f1701OooO00o.getClass();
                            throw null;
                        }
                    };
                }
            } else if (z) {
                o00oo0oo = new o00OO0OO();
                oooO00o = o00oo0oo;
            }
            if (oooO00o != null) {
                this.f3989OooO0oo.set(oooO00o);
            }
        }

        public abstract boolean OooOo0();

        public abstract long OooOo00();

        public abstract boolean OooOooO();

        public final void Oooo0(@NonNull VideoRecordEvent videoRecordEvent) {
            String strOooO00o;
            o00oOoo o00ooooOooOOo = OooOOo();
            o00oOoo o00oooo2 = videoRecordEvent.f4028OooO00o;
            if (!Objects.equals(o00oooo2, o00ooooOooOOo)) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + o00oooo2 + ", Expected: " + OooOOo() + "]");
            }
            String strConcat = "Sending VideoRecordEvent ".concat(videoRecordEvent.getClass().getSimpleName());
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                int i = ((VideoRecordEvent.Finalize) videoRecordEvent).f4030OooO0OO;
                if (i != 0) {
                    StringBuilder sbOooO00o = o00OO.OooO00o(strConcat);
                    Object[] objArr = new Object[1];
                    switch (i) {
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
                            strOooO00o = OooO0OO.OooO00o.OooO00o("Unknown(", i, ")");
                            break;
                    }
                    objArr[0] = strOooO00o;
                    sbOooO00o.append(String.format(" [error: %s]", objArr));
                    strConcat = sbOooO00o.toString();
                }
            }
            o00O0O0.OooO00o("Recorder", strConcat);
            if (OooO0oO() == null || OooOOo0() == null) {
                return;
            }
            try {
                OooO0oO().execute(new p003OooO0o0.OooOo(1, this, videoRecordEvent));
            } catch (RejectedExecutionException e) {
                o00O0O0.OooO0OO("Recorder", "The callback executor is invalid.", e);
            }
        }

        @NonNull
        public final MediaMuxer Oooo00o(int i, @NonNull oo00o oo00oVar) throws IOException {
            if (!this.f3987OooO0o0.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            OooO0o andSet = this.f3986OooO0o.getAndSet(null);
            if (andSet != null) {
                return andSet.OooO00o(i, oo00oVar);
            }
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            OooO00o(Uri.EMPTY);
        }

        public final void finalize() throws Throwable {
            try {
                this.f3985OooO0Oo.f1397OooO00o.OooO0O0();
                o000OO.OooO00o<Uri> andSet = this.f3989OooO0oo.getAndSet(null);
                if (andSet != null) {
                    OooO0OO(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }
    }

    static {
        o000O o000o = o00O000o.f1674OooO0OO;
        p039OoooOoo.oOO00O ooo00oOooO0O0 = p039OoooOoo.oOO00O.OooO0O0(Arrays.asList(o000o, o00O000o.f1673OooO0O0, o00O000o.f1672OooO00o), new o000O0(o000o, 1));
        androidx.camera.video.OooO.OooO00o OooO00o2 = OooOo.OooO00o();
        OooO00o2.OooO0OO(ooo00oOooO0O0);
        OooO00o2.OooO0O0(-1);
        androidx.camera.video.OooO oooOOooO00o = OooO00o2.OooO00o();
        f3914OooooO0 = oooOOooO00o;
        androidx.camera.video.OooO0O0.OooO00o OooO00o3 = MediaSpec.OooO00o();
        OooO00o3.f3900OooO0OO = -1;
        OooO00o3.OooO0O0(oooOOooO00o);
        f3915OooooOO = OooO00o3.OooO00o();
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f3916OooooOo = new o00O0O00();
        f3917Oooooo0 = new o0O0O00(o00oO0o.OooO0O0());
    }

    public OooOO0O(@NonNull androidx.camera.video.OooO0O0 oooO0O0, @NonNull o00O0O00 o00o0o01, @NonNull o00O0O00 o00o0o02) {
        this.f3925OooO0oO = o0O0O0O.OooO00o(o0oO0O0o.class) != null;
        this.f3926OooO0oo = OooOOO.CONFIGURING;
        this.f3918OooO = null;
        this.f3927OooOO0 = 0;
        this.f3928OooOO0O = null;
        this.f3929OooOO0o = null;
        this.f3931OooOOO0 = 0L;
        this.f3930OooOOO = null;
        this.f3932OooOOOO = false;
        this.f3933OooOOOo = null;
        this.f3935OooOOo0 = null;
        this.f3934OooOOo = null;
        this.f3936OooOOoo = new ArrayList();
        this.f3939OooOo00 = null;
        this.f3938OooOo0 = null;
        this.f3937OooOo = null;
        this.f3943OooOoO0 = null;
        this.f3942OooOoO = null;
        this.f3946OooOoo0 = null;
        this.f3945OooOoo = null;
        this.f3947OooOooO = null;
        this.f3948OooOooo = null;
        this.f3951Oooo000 = null;
        this.f3952Oooo00O = EnumC0016OooOO0O.INITIALIZING;
        this.f3953Oooo00o = Uri.EMPTY;
        this.f3950Oooo0 = 0L;
        this.f3954Oooo0O0 = 0L;
        this.f3955Oooo0OO = LongCompanionObject.MAX_VALUE;
        this.f3957Oooo0o0 = LongCompanionObject.MAX_VALUE;
        this.f3956Oooo0o = LongCompanionObject.MAX_VALUE;
        this.f3958Oooo0oO = LongCompanionObject.MAX_VALUE;
        this.f3959Oooo0oo = 0L;
        this.f3949Oooo = 0L;
        this.f3962OoooO00 = 1;
        this.f3961OoooO0 = null;
        this.f3963OoooO0O = new o0000(60, null);
        this.f3960OoooO = null;
        this.f3964OoooOO0 = false;
        this.f3970o000oOoO = VideoOutput.SourceState.INACTIVE;
        this.f3965OoooOOO = null;
        this.f3966OoooOOo = false;
        this.f3968OoooOoO = null;
        this.f3969OoooOoo = 0.0d;
        o0OO00O o0oo00oOooO0O0 = o00oO0o.OooO0O0();
        this.f3920OooO0O0 = o0oo00oOooO0O0;
        o0O0O00 o0o0o00 = new o0O0O00(o0oo00oOooO0O0);
        this.f3921OooO0OO = o0o0o00;
        androidx.camera.video.OooO0O0.OooO00o oooO00o = new androidx.camera.video.OooO0O0.OooO00o(oooO0O0);
        if (oooO0O0.f3895OooO00o.OooO0O0() == -1) {
            OooOo oooOo = oooO00o.f3898OooO00o;
            if (oooOo == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            androidx.camera.video.OooO.OooO00o oooO00oOooO0o = oooOo.OooO0o();
            oooO00oOooO0o.OooO0O0(f3914OooooO0.OooO0O0());
            oooO00o.OooO0O0(oooO00oOooO0o.OooO00o());
        }
        this.f3944OooOoOO = new oOO00O<>(oooO00o.OooO00o());
        int i = this.f3927OooOO0;
        androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(this.f3926OooO0oo);
        androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3993OooO00o;
        this.f3919OooO00o = new oOO00O<>(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, null));
        this.f3922OooO0Oo = o00o0o01;
        this.f3924OooO0o0 = o00o0o02;
        this.f3967OoooOo0 = new o0O000Oo(o00o0o01, o0o0o00, o0oo00oOooO0O0);
    }

    public static Object OooOO0(@NonNull oOO00O ooo00o) {
        try {
            return ooo00o.OooO0O0().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    @NonNull
    public static androidx.camera.video.OooOOO.OooO00o OooOO0O(@NonNull OooOOO oooOOO) {
        return (oooOOO == OooOOO.RECORDING || (oooOOO == OooOOO.STOPPING && ((o0O00oO0) o0O0O0O.OooO00o(o0O00oO0.class)) == null)) ? androidx.camera.video.OooOOO.OooO00o.ACTIVE : androidx.camera.video.OooOOO.OooO00o.INACTIVE;
    }

    public static boolean OooOOO(@NonNull androidx.camera.video.OooOOO0 oooOOO0, @Nullable OooOOO0 oooOOO1) {
        return oooOOO1 != null && oooOOO0.f3997OooO0o == oooOOO1.OooOo00();
    }

    public static void OooOOOo(@NonNull o00O0O o00o0o2) {
        if (o00o0o2 instanceof o0000Ooo) {
            o0000Ooo o0000ooo = (o0000Ooo) o00o0o2;
            o0000ooo.f1905OooO0oo.execute(new o00000(o0000ooo, 0));
        }
    }

    @NonNull
    public final o000OO00 OooO() {
        long j = this.f3954Oooo0O0;
        long j2 = this.f3950Oooo0;
        EnumC0016OooOO0O enumC0016OooOO0O = this.f3952Oooo00O;
        int i = OooOO0.f3983OooO0O0[enumC0016OooOO0O.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                OooOOO0 oooOOO0 = this.f3930OooOOO;
                if (oooOOO0 == null || !oooOOO0.f3984OooO.get()) {
                    i2 = this.f3964OoooOO0 ? 2 : 0;
                } else {
                    i2 = 5;
                }
            } else {
                if (i != 4 && i != 6) {
                    throw new AssertionError("Invalid internal audio state: " + enumC0016OooOO0O);
                }
                i2 = 1;
            }
        }
        Throwable th = this.f3960OoooO;
        double d = this.f3969OoooOoo;
        Set<Integer> set = AudioStats.f3876OooO00o;
        return o00OOO0.OooO0Oo(j, j2, new p039OoooOoo.o000O00O(d, i2, th));
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO00o(@NonNull final SurfaceRequest surfaceRequest, @NonNull final Timebase timebase) {
        synchronized (this.f3923OooO0o) {
            o00O0O0.OooO00o("Recorder", "Surface is requested in state: " + this.f3926OooO0oo + ", Current surface: " + this.f3927OooOO0);
            if (this.f3926OooO0oo == OooOOO.ERROR) {
                OooOoOO(OooOOO.CONFIGURING);
            }
        }
        this.f3921OooO0OO.execute(new Runnable() { // from class: OoooOoo.o00O0OOO
            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O oooOO0O = this.f1696OooO0Oo;
                SurfaceRequest surfaceRequest2 = oooOO0O.f3940OooOo0O;
                if (surfaceRequest2 != null && !surfaceRequest2.OooO00o()) {
                    oooOO0O.f3940OooOo0O.OooO0Oo();
                }
                SurfaceRequest surfaceRequest3 = surfaceRequest;
                oooOO0O.f3940OooOo0O = surfaceRequest3;
                Timebase timebase2 = timebase;
                oooOO0O.f3941OooOo0o = timebase2;
                oooOO0O.OooO0o(surfaceRequest3, timebase2);
            }
        });
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final androidx.camera.core.impl.o00O00o0<MediaSpec> OooO0O0() {
        return this.f3944OooOoOO;
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final androidx.camera.core.impl.o00O00o0<androidx.camera.video.OooOOO> OooO0OO() {
        return this.f3919OooO00o;
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO0Oo(@NonNull VideoOutput.SourceState sourceState) {
        this.f3921OooO0OO.execute(new oO0Oo0oo(1, this, sourceState));
    }

    public final void OooO0o(@NonNull SurfaceRequest surfaceRequest, @NonNull Timebase timebase) {
        if (surfaceRequest.OooO00o()) {
            o00O0O0.OooO0oo("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        p039OoooOoo.o00O0O0 o00o0o0 = new p039OoooOoo.o00O0O0(this);
        o0O0O00 o0o0o00 = this.f3921OooO0OO;
        surfaceRequest.OooO0OO(o0o0o00, o00o0o0);
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) surfaceRequest.f3509OooO0o0.OooO00o();
        o000000 o000000Var = o000000O.f1761OooO0Oo;
        o00OOO00 o00ooo01 = new o00OOO00(o0oo0oo2);
        DynamicRange dynamicRange = surfaceRequest.f3506OooO0OO;
        o00OOO00.OooO00o oooO00oOooO0Oo = o00ooo01.OooO0Oo(dynamicRange);
        Size size = surfaceRequest.f3505OooO0O0;
        o00O000o o00o000oOooO00o = oooO00oOooO0Oo == null ? o00O000o.f1678OooO0oO : oooO00oOooO0Oo.OooO00o(size);
        o00O0O0.OooO00o("Recorder", "Using supported quality of " + o00o000oOooO00o + " for surface size " + size);
        if (o00o000oOooO00o != o00O000o.f1678OooO0oO) {
            o00000OO o00000ooOooO0O0 = o00ooo01.OooO0O0(o00o000oOooO00o, dynamicRange);
            this.f3934OooOOo = o00000ooOooO0O0;
            if (o00000ooOooO0O0 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        OooOo0o().OooO(new oO0OOo0o(1, this, surfaceRequest, timebase), o0o0o00);
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final o00OOO0O OooO0o0(@NonNull CameraInfo cameraInfo) {
        o000000 o000000Var = o000000O.f1761OooO0Oo;
        return new o00OOO00((o0Oo0oo) cameraInfo);
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
        if (this.f3930OooOOO == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.f3942OooOoO;
        boolean z4 = true;
        OooOOO0 oooOOO0 = null;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f3942OooOoO.release();
            } catch (IllegalStateException e) {
                o00O0O0.OooO0O0("Recorder", "MediaMuxer failed to stop or release with error: " + e.getMessage());
                if (i == 0) {
                    i = 1;
                }
            }
            this.f3942OooOoO = null;
        } else if (i == 0) {
            i = 8;
        }
        this.f3930OooOOO.OooO00o(this.f3953Oooo00o);
        o00oOoo o00ooooOooOOo = this.f3930OooOOO.OooOOo();
        o000OO00 o000oo00OooO = OooO();
        Uri uri = this.f3953Oooo00o;
        o000OO.OooOOO0.OooO0o0(uri, "OutputUri cannot be null.");
        new o000OO0O(uri);
        OooOOO0 oooOOO1 = this.f3930OooOOO;
        boolean z5 = false;
        if (i == 0) {
            finalize = new VideoRecordEvent.Finalize(o00ooooOooOOo, o000oo00OooO, 0);
        } else {
            o000OO.OooOOO0.OooO0O0(i != 0, "An error type is required.");
            finalize = new VideoRecordEvent.Finalize(o00ooooOooOOo, o000oo00OooO, i);
        }
        oooOOO1.Oooo0(finalize);
        OooOOO0 oooOOO2 = this.f3930OooOOO;
        this.f3930OooOOO = null;
        this.f3932OooOOOO = false;
        this.f3939OooOo00 = null;
        this.f3938OooOo0 = null;
        this.f3936OooOOoo.clear();
        this.f3953Oooo00o = Uri.EMPTY;
        this.f3950Oooo0 = 0L;
        this.f3954Oooo0O0 = 0L;
        this.f3955Oooo0OO = LongCompanionObject.MAX_VALUE;
        this.f3957Oooo0o0 = LongCompanionObject.MAX_VALUE;
        this.f3956Oooo0o = LongCompanionObject.MAX_VALUE;
        this.f3958Oooo0oO = LongCompanionObject.MAX_VALUE;
        this.f3962OoooO00 = 1;
        this.f3960OoooO = null;
        this.f3969OoooOoo = 0.0d;
        while (true) {
            o0000 o0000Var = this.f3963OoooO0O;
            if (o0000Var.OooO0OO()) {
                break;
            } else {
                o0000Var.OooO00o();
            }
        }
        OooOoO0(null);
        int i3 = OooOO0.f3983OooO0O0[this.f3952Oooo00O.ordinal()];
        if (i3 == 1 || i3 == 2) {
            OooOo(EnumC0016OooOO0O.INITIALIZING);
        } else if (i3 == 3 || i3 == 4) {
            OooOo(EnumC0016OooOO0O.IDLING);
            androidx.camera.video.internal.audio.OooO00o oooO00o = this.f3946OooOoo0;
            oooO00o.f4040OooO00o.execute(new o00O0O0O(oooO00o, 0));
        } else if (i3 == 5) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        synchronized (this.f3923OooO0o) {
            if (this.f3928OooOO0O != oooOOO2) {
                throw new AssertionError("Active recording did not match finalized recording on finalize.");
            }
            this.f3928OooOO0O = null;
            int i4 = OooOO0.f3982OooO00o[this.f3926OooO0oo.ordinal()];
            if (i4 == 9) {
                throw new AssertionError("Unexpected state on finalize of recording: " + this.f3926OooO0oo);
            }
            switch (i4) {
                case 1:
                case 2:
                case 6:
                    if (!this.f3925OooO0oO) {
                        OooOoOO(OooOOO.IDLING);
                        oooO0OO = null;
                        i2 = 0;
                        z3 = false;
                        z2 = false;
                    } else {
                        this.f3943OooOoO0 = null;
                        SurfaceRequest surfaceRequest2 = this.f3940OooOo0O;
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
                    if (this.f3970o000oOoO == VideoOutput.SourceState.INACTIVE) {
                        if (this.f3925OooO0oO) {
                            this.f3943OooOoO0 = null;
                            surfaceRequest = this.f3940OooOo0O;
                            if (surfaceRequest != null || surfaceRequest.OooO00o()) {
                                z4 = false;
                            }
                            Oooo0(OooOOO.CONFIGURING);
                            oooOOO0OooOOOO = null;
                            z2 = false;
                        } else if (this.f3945OooOoo != null) {
                            z3 = z;
                            oooO0OO = null;
                            i2 = 0;
                            z2 = false;
                        } else {
                            oooOOO0OooOOOO = OooOOOO(this.f3926OooO0oo);
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
                        oooO0OO = this.f3929OooOO0o;
                        this.f3929OooOO0o = null;
                        OooOoOO(OooOOO.CONFIGURING);
                        z3 = z;
                        i2 = 4;
                        z2 = false;
                    }
                    break;
                case 4:
                    z = false;
                    if (this.f3970o000oOoO == VideoOutput.SourceState.INACTIVE) {
                        if (this.f3925OooO0oO) {
                            this.f3943OooOoO0 = null;
                            surfaceRequest = this.f3940OooOo0O;
                            if (surfaceRequest != null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            Oooo0(OooOOO.CONFIGURING);
                            oooOOO0OooOOOO = null;
                            z2 = false;
                        } else if (this.f3945OooOoo != null) {
                            z3 = z;
                            oooO0OO = null;
                            i2 = 0;
                            z2 = false;
                        } else {
                            oooOOO0OooOOOO = OooOOOO(this.f3926OooO0oo);
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
                        oooO0OO = this.f3929OooOO0o;
                        this.f3929OooOO0o = null;
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
            OooO0o(this.f3940OooOo0O, this.f3941OooOo0o);
            return;
        }
        if (z2) {
            OooOo00();
            return;
        }
        if (oooOOO0 != null) {
            if (this.f3925OooO0oO) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            OooOooo(oooOOO0, z3);
        } else if (oooO0OO != null) {
            OooO0oo(oooO0OO, i2);
        }
    }

    public final void OooO0oo(@NonNull OooOOO0 oooOOO0, int i) {
        oooOOO0.OooO00o(Uri.EMPTY);
        o00oOoo o00ooooOooOOo = oooOOO0.OooOOo();
        Throwable th = this.f3960OoooO;
        Set<Integer> set = AudioStats.f3876OooO00o;
        o000OO00 o000oo00OooO0Oo = o00OOO0.OooO0Oo(0L, 0L, new p039OoooOoo.o000O00O(0.0d, 1, th));
        Uri uri = Uri.EMPTY;
        o000OO.OooOOO0.OooO0o0(uri, "OutputUri cannot be null.");
        new o000OO0O(uri);
        o000OO.OooOOO0.OooO0O0(i != 0, "An error type is required.");
        oooOOO0.Oooo0(new VideoRecordEvent.Finalize(o00ooooOooOOo, o000oo00OooO0Oo, i));
    }

    public final boolean OooOO0o() {
        return this.f3952Oooo00O == EnumC0016OooOO0O.ENABLED;
    }

    public final boolean OooOOO0() {
        OooOOO0 oooOOO0 = this.f3930OooOOO;
        return oooOOO0 != null && oooOOO0.OooOooO();
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
        if (this.f3928OooOO0O != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        androidx.camera.video.OooO0OO oooO0OO = this.f3929OooOO0o;
        if (oooO0OO == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f3928OooOO0O = oooO0OO;
        this.f3929OooOO0o = null;
        if (z) {
            OooOoOO(OooOOO.PAUSED);
        } else {
            OooOoOO(OooOOO.RECORDING);
        }
        return oooO0OO;
    }

    public final void OooOOo() {
        final androidx.camera.video.internal.audio.OooO00o oooO00o = this.f3946OooOoo0;
        if (oooO00o == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f3946OooOoo0 = null;
        o00O0O0.OooO00o("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(oooO00o.hashCode())));
        o00O000.OooO0o oooO0oOooO00o = o00O000.OooO00o(new o00O000.OooO0OO() { // from class: OooooO0.o00O0O0
            @Override // o0ooOO0.o00O000.OooO0OO
            public final Object OooO0o0(final o00O000.OooO00o oooO00o2) {
                final OooO00o oooO00o3 = oooO00o;
                oooO00o3.f4040OooO00o.execute(new Runnable() { // from class: OooooO0.o00O0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O000.OooO00o oooO00o4 = oooO00o2;
                        OooO00o oooO00o5 = oooO00o3;
                        oooO00o5.getClass();
                        try {
                            int i = OooO00o.OooO0OO.f4066OooO00o[oooO00o5.f4046OooO0oO.ordinal()];
                            if (i == 1 || i == 2) {
                                oooO00o5.OooO0O0(null);
                                oooO00o5.f4045OooO0o0.release();
                                oooO00o5.f4043OooO0Oo.release();
                                oooO00o5.OooO0Oo();
                                oooO00o5.OooO0OO(OooO00o.OooOO0.RELEASED);
                            }
                            oooO00o4.OooO0O0(null);
                        } catch (Throwable th) {
                            oooO00o4.OooO0OO(th);
                        }
                    }
                });
                return "AudioSource-release";
            }
        });
        oooO0oOooO00o.OooO(new OoooO.OooOo00.OooO0O0(oooO0oOooO00o, new OooO00o(oooO00o)), o00oO0o.OooO00o());
    }

    public final void OooOOo0(@NonNull OooOOO0 oooOOO0, int i, @Nullable Exception exc) throws Exception {
        boolean z;
        if (oooOOO0 != this.f3930OooOOO) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f3923OooO0o) {
            z = false;
            switch (OooOO0.f3982OooO00o[this.f3926OooO0oo.ordinal()]) {
                case 1:
                case 2:
                    OooOoOO(OooOOO.STOPPING);
                    z = true;
                case 3:
                case 4:
                case 5:
                case 6:
                    if (oooOOO0 != this.f3928OooOO0O) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                    break;
                    break;
                case 7:
                case 8:
                case 9:
                    throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f3926OooO0oo);
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
        synchronized (this.f3923OooO0o) {
            z2 = true;
            z3 = false;
            switch (OooOO0.f3982OooO00o[this.f3926OooO0oo.ordinal()]) {
                case 1:
                case 2:
                    o000OO.OooOOO0.OooO0o("In-progress recording shouldn't be null when in state " + this.f3926OooO0oo, this.f3930OooOOO != null);
                    if (this.f3928OooOO0O != this.f3930OooOOO) {
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
                Oooo000(this.f3930OooOOO, -1L, 4, null);
            }
        } else if (z) {
            OooOo0();
        } else {
            OooOo00();
        }
    }

    public final void OooOo(@NonNull EnumC0016OooOO0O enumC0016OooOO0O) {
        o00O0O0.OooO00o("Recorder", "Transitioning audio state: " + this.f3952Oooo00O + " --> " + enumC0016OooOO0O);
        this.f3952Oooo00O = enumC0016OooOO0O;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:14:0x0048, B:15:0x0052, B:22:0x0069, B:17:0x0056, B:18:0x005c, B:21:0x0064), top: B:34:0x0048 }] */
    public final void OooOo0() {
        SurfaceRequest surfaceRequest;
        boolean z = true;
        if (this.f3945OooOoo != null) {
            o00O0O0.OooO00o("Recorder", "Releasing video encoder.");
            o0O000Oo o0o000oo2 = this.f3968OoooOoO;
            if (o0o000oo2 != null) {
                o000OO.OooOOO0.OooO0o(null, o0o000oo2.f1732OooO0Oo == this.f3945OooOoo);
                o00O0O0.OooO00o("Recorder", "Releasing video encoder: " + this.f3945OooOoo);
                this.f3968OoooOoO.OooO0O0();
                this.f3968OoooOoO = null;
                this.f3945OooOoo = null;
                this.f3947OooOooO = null;
                OooOoO(null);
            } else {
                OooOo0o();
            }
        }
        synchronized (this.f3923OooO0o) {
            switch (OooOO0.f3982OooO00o[this.f3926OooO0oo.ordinal()]) {
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
        this.f3966OoooOOo = false;
        if (!z || (surfaceRequest = this.f3940OooOo0O) == null || surfaceRequest.OooO00o()) {
            return;
        }
        OooO0o(this.f3940OooOo0O, this.f3941OooOo0o);
    }

    public final void OooOo00() {
        if (this.f3948OooOooo != null) {
            o00O0O0.OooO00o("Recorder", "Releasing audio encoder.");
            this.f3948OooOooo.OooO0oO();
            this.f3948OooOooo = null;
            this.f3951Oooo000 = null;
        }
        if (this.f3946OooOoo0 != null) {
            OooOOo();
        }
        OooOo(EnumC0016OooOO0O.INITIALIZING);
        OooOo0();
    }

    @GuardedBy("mLock")
    public final void OooOo0O() {
        if (f3912Ooooo00.contains(this.f3926OooO0oo)) {
            OooOoOO(this.f3918OooO);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.f3926OooO0oo);
        }
    }

    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooOo0o() {
        o00O0O0.OooO00o("Recorder", "Try to safely release video encoder: " + this.f3945OooOoo);
        o0O000Oo o0o000oo2 = this.f3967OoooOo0;
        o0o000oo2.OooO00o();
        return p030OoooO.OooOo00.OooO0o0(o0o000oo2.f1737OooOO0);
    }

    public final void OooOoO(@Nullable Surface surface) {
        int iHashCode;
        if (this.f3937OooOo == surface) {
            return;
        }
        this.f3937OooOo = surface;
        synchronized (this.f3923OooO0o) {
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
        this.f3933OooOOOo = oooO0OO;
        synchronized (this.f3923OooO0o) {
            oOO00O<androidx.camera.video.OooOOO> ooo00o = this.f3919OooO00o;
            int i = this.f3927OooOO0;
            androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(this.f3926OooO0oo);
            androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3993OooO00o;
            ooo00o.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
        }
    }

    @GuardedBy("mLock")
    public final void OooOoOO(@NonNull OooOOO oooOOO) {
        if (this.f3926OooO0oo == oooOOO) {
            throw new AssertionError("Attempted to transition to state " + oooOOO + ", but Recorder is already in state " + oooOOO);
        }
        o00O0O0.OooO00o("Recorder", "Transitioning Recorder internal state: " + this.f3926OooO0oo + " --> " + oooOOO);
        Set<OooOOO> set = f3912Ooooo00;
        androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = null;
        if (set.contains(oooOOO)) {
            if (!set.contains(this.f3926OooO0oo)) {
                if (!f3913Ooooo0o.contains(this.f3926OooO0oo)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f3926OooO0oo);
                }
                OooOOO oooOOO2 = this.f3926OooO0oo;
                this.f3918OooO = oooOOO2;
                oooO00oOooOO0O = OooOO0O(oooOOO2);
            }
        } else if (this.f3918OooO != null) {
            this.f3918OooO = null;
        }
        this.f3926OooO0oo = oooOOO;
        if (oooO00oOooOO0O == null) {
            oooO00oOooOO0O = OooOO0O(oooOOO);
        }
        int i = this.f3927OooOO0;
        SurfaceRequest.OooO0OO oooO0OO = this.f3933OooOOOo;
        androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3993OooO00o;
        this.f3919OooO00o.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    public final void OooOoo(@NonNull OooOOO0 oooOOO0) throws Exception {
        if (this.f3942OooOoO != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        boolean zOooOO0o = OooOO0o();
        o0000 o0000Var = this.f3963OoooO0O;
        if (zOooOO0o && o0000Var.OooO0OO()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        Oooo0 oooo0 = this.f3961OoooO0;
        if (oooo0 == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f3961OoooO0 = null;
            long jOoooO0O = oooo0.OoooO0O();
            ArrayList arrayList = new ArrayList();
            while (!o0000Var.OooO0OO()) {
                Oooo0 oooo1 = (Oooo0) o0000Var.OooO00o();
                if (oooo1.OoooO0O() >= jOoooO0O) {
                    arrayList.add(oooo1);
                }
            }
            long size = oooo0.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((Oooo0) it.next()).size();
            }
            long j = this.f3959Oooo0oo;
            int i = 2;
            if (j != 0 && size > j) {
                o00O0O0.OooO00o("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f3959Oooo0oo)));
                OooOOo0(oooOOO0, 2, null);
                oooo0.close();
                return;
            }
            try {
                MediaSpec mediaSpec = (MediaSpec) OooOO0(this.f3944OooOoOO);
                if (mediaSpec.OooO0OO() == -1) {
                    o00000OO o00000oo2 = this.f3934OooOOo;
                    int i2 = f3915OooooOO.f3897OooO0OO != 1 ? 0 : 1;
                    if (o00000oo2 == null) {
                        i = i2;
                    } else {
                        int i3 = ((o000OOo) o00000oo2).f1770OooO0O0;
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
                MediaMuxer mediaMuxerOooo00o = oooOOO0.Oooo00o(i, new oo00o(this));
                SurfaceRequest.OooO0OO oooO0OO = this.f3935OooOOo0;
                if (oooO0OO != null) {
                    OooOoO0(oooO0OO);
                    mediaMuxerOooo00o.setOrientationHint(oooO0OO.OooO0O0());
                }
                Location locationOooO0OO = oooOOO0.OooOOo().f1717OooO00o.OooO0OO();
                if (locationOooO0OO != null) {
                    try {
                        double latitude = locationOooO0OO.getLatitude();
                        double longitude = locationOooO0OO.getLongitude();
                        if (o0O0O0O.OooO00o(oo0OOoo.class) != null) {
                            if (latitude < 0.0d) {
                                latitude = ((latitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                            if (longitude < 0.0d) {
                                longitude = ((longitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                        }
                        Pair pairCreate = Pair.create(Double.valueOf(latitude), Double.valueOf(longitude));
                        mediaMuxerOooo00o.setLocation((float) ((Double) pairCreate.first).doubleValue(), (float) ((Double) pairCreate.second).doubleValue());
                    } catch (IllegalArgumentException e) {
                        mediaMuxerOooo00o.release();
                        OooOOo0(oooOOO0, 5, e);
                        oooo0.close();
                        return;
                    }
                }
                this.f3938OooOo0 = Integer.valueOf(mediaMuxerOooo00o.addTrack((MediaFormat) this.f3947OooOooO.f1969OooO0Oo));
                if (OooOO0o()) {
                    this.f3939OooOo00 = Integer.valueOf(mediaMuxerOooo00o.addTrack((MediaFormat) this.f3951Oooo000.f1969OooO0Oo));
                }
                mediaMuxerOooo00o.start();
                this.f3942OooOoO = mediaMuxerOooo00o;
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
        if (this.f3927OooOO0 == i) {
            return;
        }
        o00O0O0.OooO00o("Recorder", "Transitioning streamId: " + this.f3927OooOO0 + " --> " + i);
        this.f3927OooOO0 = i;
        androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(this.f3926OooO0oo);
        SurfaceRequest.OooO0OO oooO0OO = this.f3933OooOOOo;
        androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3993OooO00o;
        this.f3919OooO00o.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public final void OooOooO(@NonNull OooOOO0 oooOOO0) throws InvalidConfigException, AudioSourceAccessException {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxyOooO0o0;
        MediaSpec mediaSpec = (MediaSpec) OooOO0(this.f3944OooOoOO);
        o00000OO o00000oo2 = this.f3934OooOOo;
        String str = mediaSpec.OooO0OO() != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i = (mediaSpec.OooO0OO() != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (o00000oo2 == null || o00000oo2.OooO0o0() == null) {
            audioProfileProxyOooO0o0 = null;
        } else {
            audioProfileProxyOooO0o0 = o00000oo2.OooO0o0();
            String strOooO0Oo = audioProfileProxyOooO0o0.OooO0Oo();
            int iOooO0o0 = audioProfileProxyOooO0o0.OooO0o0();
            if (Objects.equals(strOooO0Oo, "audio/none")) {
                o00O0O0.OooO00o("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + str + "(profile: " + i + ")]");
            } else if (mediaSpec.OooO0OO() == -1) {
                o00O0O0.OooO00o("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + strOooO0Oo + "(profile: " + iOooO0o0 + ")]");
                str = strOooO0Oo;
                i = iOooO0o0;
            } else if (str.equals(strOooO0Oo) && i == iOooO0o0) {
                o00O0O0.OooO00o("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + strOooO0Oo + "(profile: " + i + ")]");
                str = strOooO0Oo;
            } else {
                o00O0O0.OooO00o("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + strOooO0Oo + "(profile: " + iOooO0o0 + "), chosen mime type: " + str + "(profile: " + i + ")]");
            }
            audioProfileProxyOooO0o0 = null;
        }
        o0O0o.OooO00o oooO00o = new o0O0o.OooO00o();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00o.f2043OooO00o = str;
        oooO00o.f2044OooO0O0 = -1;
        oooO00o.f2044OooO0O0 = Integer.valueOf(i);
        if (audioProfileProxyOooO0o0 != null) {
            oooO00o.f2045OooO0OO = audioProfileProxyOooO0o0;
        }
        o0O0o o0o0oOooO00o = oooO00o.OooO00o();
        Timebase timebase = Timebase.UPTIME;
        AudioSpec audioSpecOooO0O0 = mediaSpec.OooO0O0();
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = o0o0oOooO00o.f2042OooO0OO;
        o00O00o0 o00o00o1 = (o00O00o0) (audioProfileProxy != null ? new oo00oO(audioSpecOooO0O0, audioProfileProxy) : new o0oOOo(audioSpecOooO0O0)).get();
        if (this.f3946OooOoo0 != null) {
            OooOOo();
        }
        if (!oooOOO0.OooOo0()) {
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + oooOOO0);
        }
        OooOOO0.OooO0OO andSet = oooOOO0.f3988OooO0oO.getAndSet(null);
        if (andSet == null) {
            throw new AssertionError("One-time audio source creation has already occurred for recording " + oooOOO0);
        }
        androidx.camera.video.internal.audio.OooO00o OooO00o2 = andSet.OooO00o(o00o00o1, f3917Oooooo0);
        this.f3946OooOoo0 = OooO00o2;
        int i2 = 0;
        o00O0O0.OooO00o("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(OooO00o2.hashCode())));
        AudioSpec audioSpecOooO0O1 = mediaSpec.OooO0O0();
        p045Oooooo.OooOO0O oooOO0O = (p045Oooooo.OooOO0O) (audioProfileProxy != null ? new o00OOOOo(o0o0oOooO00o.f2040OooO00o, o0o0oOooO00o.f2041OooO0O0, timebase, audioSpecOooO0O1, o00o00o1, audioProfileProxy) : new o00Oo00(o0o0oOooO00o.f2040OooO00o, o0o0oOooO00o.f2041OooO0O0, timebase, audioSpecOooO0O1, o00o00o1)).get();
        this.f3924OooO0o0.getClass();
        o0000Ooo o0000ooo = new o0000Ooo(this.f3920OooO0O0, oooOO0O);
        this.f3948OooOooo = o0000ooo;
        o00O0O.OooO0O0 oooO0O0 = o0000ooo.f1902OooO0o;
        if (!(oooO0O0 instanceof o00O0O.OooO00o)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        androidx.camera.video.internal.audio.OooO00o oooO00o2 = this.f3946OooOoo0;
        oooO00o2.f4040OooO00o.execute(new p042OooooO0.oo00o(i2, oooO00o2, (o00O0O.OooO00o) oooO0O0));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    public final void OooOooo(@NonNull OooOOO0 oooOOO0, boolean z) {
        EnumC0016OooOO0O enumC0016OooOO0O;
        if (this.f3930OooOOO != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        if (oooOOO0.OooOOo().f1717OooO00o.OooO0O0() > 0) {
            this.f3959Oooo0oo = Math.round(oooOOO0.OooOOo().f1717OooO00o.OooO0O0() * 0.95d);
            o00O0O0.OooO00o("Recorder", "File size limit in bytes: " + this.f3959Oooo0oo);
        } else {
            this.f3959Oooo0oo = 0L;
        }
        if (oooOOO0.OooOOo().f1717OooO00o.OooO00o() > 0) {
            this.f3949Oooo = TimeUnit.MILLISECONDS.toNanos(oooOOO0.OooOOo().f1717OooO00o.OooO00o());
            o00O0O0.OooO00o("Recorder", "Duration limit in nanoseconds: " + this.f3949Oooo);
        } else {
            this.f3949Oooo = 0L;
        }
        this.f3930OooOOO = oooOOO0;
        switch (OooOO0.f3983OooO0O0[this.f3952Oooo00O.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f3952Oooo00O);
            case 5:
                OooOo(oooOOO0.OooOo0() ? EnumC0016OooOO0O.ENABLED : EnumC0016OooOO0O.DISABLED);
                break;
            case 6:
                if (oooOOO0.OooOo0()) {
                    if (!(((MediaSpec) OooOO0(this.f3944OooOoOO)).OooO0O0().OooO0OO() != 0)) {
                        throw new AssertionError("The Recorder doesn't support recording with audio");
                    }
                    try {
                        if (!this.f3930OooOOO.OooOooO() || this.f3948OooOooo == null) {
                            OooOooO(oooOOO0);
                        }
                        OooOo(EnumC0016OooOO0O.ENABLED);
                    } catch (AudioSourceAccessException e) {
                        e = e;
                        o00O0O0.OooO0OO("Recorder", "Unable to create audio resource with error: ", e);
                        if (e instanceof InvalidConfigException) {
                            enumC0016OooOO0O = EnumC0016OooOO0O.ERROR_ENCODER;
                        } else {
                            enumC0016OooOO0O = EnumC0016OooOO0O.ERROR_SOURCE;
                        }
                        OooOo(enumC0016OooOO0O);
                        this.f3960OoooO = e;
                    } catch (InvalidConfigException e2) {
                        e = e2;
                        o00O0O0.OooO0OO("Recorder", "Unable to create audio resource with error: ", e);
                        if (e instanceof InvalidConfigException) {
                            enumC0016OooOO0O = EnumC0016OooOO0O.ERROR_ENCODER;
                        } else {
                            enumC0016OooOO0O = EnumC0016OooOO0O.ERROR_SOURCE;
                        }
                        OooOo(enumC0016OooOO0O);
                        this.f3960OoooO = e;
                    }
                }
                break;
        }
        Oooo00O(oooOOO0, false);
        if (OooOO0o()) {
            final androidx.camera.video.internal.audio.OooO00o oooO00o = this.f3946OooOoo0;
            final boolean z2 = oooOOO0.f3984OooO.get();
            oooO00o.f4040OooO00o.execute(new Runnable() { // from class: OooooO0.o00O0O00
                @Override // java.lang.Runnable
                public final void run() {
                    final OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    int i = OooO00o.OooO0OO.f4066OooO00o[oooO00o2.f4046OooO0oO.ordinal()];
                    if (i != 1) {
                        if (i == 3) {
                            throw new AssertionError("AudioSource is released");
                        }
                        return;
                    }
                    oooO00o2.f4041OooO0O0.set(null);
                    oooO00o2.f4042OooO0OO.set(false);
                    oooO00o2.OooO0OO(OooO00o.OooOO0.STARTED);
                    final boolean z3 = z2;
                    oooO00o2.f4040OooO00o.execute(new Runnable() { // from class: OooooO0.o00O
                        @Override // java.lang.Runnable
                        public final void run() {
                            OooO00o oooO00o3 = oooO00o2;
                            oooO00o3.getClass();
                            int i2 = OooO00o.OooO0OO.f4066OooO00o[oooO00o3.f4046OooO0oO.ordinal()];
                            if (i2 != 1 && i2 != 2) {
                                if (i2 == 3) {
                                    throw new AssertionError("AudioSource is released");
                                }
                                return;
                            }
                            boolean z4 = oooO00o3.f4055OooOOo;
                            boolean z5 = z3;
                            if (z4 == z5) {
                                return;
                            }
                            oooO00o3.f4055OooOOo = z5;
                            if (oooO00o3.f4046OooO0oO == OooO00o.OooOO0.STARTED) {
                                oooO00o3.OooO00o();
                            }
                        }
                    });
                    oooO00o2.OooO0o0();
                }
            });
            this.f3948OooOooo.OooOOO();
        }
        this.f3945OooOoo.OooOOO();
        OooOOO0 oooOOO1 = this.f3930OooOOO;
        oooOOO1.Oooo0(new VideoRecordEvent.OooO0O0(oooOOO1.OooOOo(), OooO()));
        if (z && this.f3930OooOOO == oooOOO0 && !this.f3932OooOOOO) {
            if (OooOO0o()) {
                this.f3948OooOooo.OooO0o();
            }
            this.f3945OooOoo.OooO0o();
            OooOOO0 oooOOO2 = this.f3930OooOOO;
            oooOOO2.Oooo0(new VideoRecordEvent.OooO00o(oooOOO2.OooOOo(), OooO()));
        }
    }

    @GuardedBy("mLock")
    public final void Oooo0(@NonNull OooOOO oooOOO) {
        if (!f3912Ooooo00.contains(this.f3926OooO0oo)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f3926OooO0oo);
        }
        if (!f3913Ooooo0o.contains(oooOOO)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + oooOOO);
        }
        if (this.f3918OooO != oooOOO) {
            this.f3918OooO = oooOOO;
            int i = this.f3927OooOO0;
            androidx.camera.video.OooOOO.OooO00o oooO00oOooOO0O = OooOO0O(oooOOO);
            SurfaceRequest.OooO0OO oooO0OO = this.f3933OooOOOo;
            androidx.camera.video.OooO0o oooO0o = androidx.camera.video.OooOOO.f3993OooO00o;
            this.f3919OooO00o.OooO0o0(new androidx.camera.video.OooO0o(i, oooO00oOooOO0O, oooO0OO));
        }
    }

    public final void Oooo000(@NonNull OooOOO0 oooOOO0, long j, int i, @Nullable Throwable th) throws Exception {
        if (this.f3930OooOOO != oooOOO0 || this.f3932OooOOOO) {
            return;
        }
        this.f3932OooOOOO = true;
        this.f3962OoooO00 = i;
        if (OooOO0o()) {
            while (true) {
                o0000 o0000Var = this.f3963OoooO0O;
                if (o0000Var.OooO0OO()) {
                    break;
                } else {
                    o0000Var.OooO00o();
                }
            }
            this.f3948OooOooo.OooOOOO(j);
        }
        Oooo0 oooo0 = this.f3961OoooO0;
        if (oooo0 != null) {
            oooo0.close();
            this.f3961OoooO0 = null;
        }
        if (this.f3970o000oOoO != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            this.f3965OoooOOO = o00oO0o.OooO0OO().schedule(new OooO0O0.OooOO0O(2, this, this.f3945OooOoo), 1000L, TimeUnit.MILLISECONDS);
        } else {
            OooOOOo(this.f3945OooOoo);
        }
        this.f3945OooOoo.OooOOOO(j);
    }

    public final void Oooo00O(@NonNull final OooOOO0 oooOOO0, boolean z) {
        ArrayList arrayList = this.f3936OooOOoo;
        if (!arrayList.isEmpty()) {
            p030OoooO.o00Oo0 o00oo0OooO00o = p030OoooO.OooOo00.OooO00o(arrayList);
            if (!o00oo0OooO00o.isDone()) {
                o00oo0OooO00o.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(o00O000.OooO00o(new o00O0OO0(this, oooOOO0)));
        if (OooOO0o() && !z) {
            arrayList.add(o00O000.OooO00o(new o00O000.OooO0OO() { // from class: OoooOoo.oo0o0O0
                /* JADX WARN: Type inference failed for: r1v0, types: [OoooOoo.o00O0OO] */
                @Override // o0ooOO0.o00O000.OooO0OO
                public final Object OooO0o0(final o00O000.OooO00o oooO00o) {
                    final OooOO0O oooOO0O = this.f1755OooO0Oo;
                    oooOO0O.getClass();
                    ?? r1 = new o000OO.OooO00o() { // from class: OoooOoo.o00O0OO
                        @Override // o000OO.OooO00o
                        public final void accept(Object obj) {
                            Throwable th = (Throwable) obj;
                            OooOO0O oooOO0O2 = oooOO0O;
                            if (oooOO0O2.f3960OoooO == null) {
                                if (th instanceof EncodeException) {
                                    oooOO0O2.OooOo(OooOO0O.EnumC0016OooOO0O.ERROR_ENCODER);
                                } else {
                                    oooOO0O2.OooOo(OooOO0O.EnumC0016OooOO0O.ERROR_SOURCE);
                                }
                                oooOO0O2.f3960OoooO = th;
                                oooOO0O2.Oooo00o();
                                oooO00o.OooO0O0(null);
                            }
                        }
                    };
                    final OooO00o oooO00o2 = oooOO0O.f3946OooOoo0;
                    final OooOO0O.OooO0OO oooO0OO = oooOO0O.new OooO0OO(r1);
                    o0O0O00 o0o0o00 = oooO00o2.f4040OooO00o;
                    final o0O0O00 o0o0o01 = oooOO0O.f3921OooO0OO;
                    o0o0o00.execute(new Runnable() { // from class: OooooO0.oo0o0O0
                        @Override // java.lang.Runnable
                        public final void run() {
                            OooO00o oooO00o3 = oooO00o2;
                            oooO00o3.getClass();
                            int i = OooO00o.OooO0OO.f4066OooO00o[oooO00o3.f4046OooO0oO.ordinal()];
                            if (i == 1) {
                                oooO00o3.f4048OooOO0 = o0o0o01;
                                oooO00o3.f4049OooOO0O = oooO0OO;
                            } else if (i == 2 || i == 3) {
                                throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                            }
                        }
                    });
                    oooOO0O.f3948OooOooo.OooOO0O(oooOO0O.new OooO0o(oooO00o, r1, oooOOO0), o0o0o01);
                    return "audioEncodingFuture";
                }
            }));
        }
        p030OoooO.o00Oo0 o00oo0OooO00o2 = p030OoooO.OooOo00.OooO00o(arrayList);
        OooO oooO = new OooO();
        o00oo0OooO00o2.OooO(new OoooO.OooOo00.OooO0O0(o00oo0OooO00o2, oooO), o00oO0o.OooO00o());
    }

    public final void Oooo00o() {
        OooOOO0 oooOOO0 = this.f3930OooOOO;
        if (oooOOO0 != null) {
            oooOOO0.Oooo0(new VideoRecordEvent.OooO0OO(oooOOO0.OooOOo(), OooO()));
        }
    }

    public final void Oooo0O0(@NonNull Oooo0 oooo0, @NonNull OooOOO0 oooOOO0) throws Exception {
        long size = oooo0.size() + this.f3950Oooo0;
        long j = this.f3959Oooo0oo;
        if (j != 0 && size > j) {
            o00O0O0.OooO00o("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f3959Oooo0oo)));
            OooOOo0(oooOOO0, 2, null);
            return;
        }
        long jOoooO0O = oooo0.OoooO0O();
        long j2 = this.f3957Oooo0o0;
        if (j2 == LongCompanionObject.MAX_VALUE) {
            this.f3957Oooo0o0 = jOoooO0O;
            o00O0O0.OooO00o("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jOoooO0O), o00000O0.OooO0OO(this.f3957Oooo0o0)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jOoooO0O - Math.min(this.f3955Oooo0OO, j2));
            o000OO.OooOOO0.OooO0o("There should be a previous data for adjusting the duration.", this.f3958Oooo0oO != LongCompanionObject.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jOoooO0O - this.f3958Oooo0oO) + nanos;
            long j3 = this.f3949Oooo;
            if (j3 != 0 && nanos2 > j3) {
                o00O0O0.OooO00o("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f3949Oooo)));
                OooOOo0(oooOOO0, 9, null);
                return;
            }
        }
        this.f3942OooOoO.writeSampleData(this.f3939OooOo00.intValue(), oooo0.OooO0o(), oooo0.OooOoOO());
        this.f3950Oooo0 = size;
        this.f3958Oooo0oO = jOoooO0O;
    }

    public final void Oooo0OO(@NonNull Oooo0 oooo0, @NonNull OooOOO0 oooOOO0) throws Exception {
        if (this.f3938OooOo0 == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = oooo0.size() + this.f3950Oooo0;
        long j = this.f3959Oooo0oo;
        long j2 = 0;
        if (j != 0 && size > j) {
            o00O0O0.OooO00o("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f3959Oooo0oo)));
            OooOOo0(oooOOO0, 2, null);
            return;
        }
        long jOoooO0O = oooo0.OoooO0O();
        long j3 = this.f3955Oooo0OO;
        if (j3 == LongCompanionObject.MAX_VALUE) {
            this.f3955Oooo0OO = jOoooO0O;
            o00O0O0.OooO00o("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jOoooO0O), o00000O0.OooO0OO(this.f3955Oooo0OO)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jOoooO0O - Math.min(j3, this.f3957Oooo0o0));
            o000OO.OooOOO0.OooO0o("There should be a previous data for adjusting the duration.", this.f3956Oooo0o != LongCompanionObject.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jOoooO0O - this.f3956Oooo0o) + nanos;
            long j4 = this.f3949Oooo;
            if (j4 != 0 && nanos2 > j4) {
                o00O0O0.OooO00o("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f3949Oooo)));
                OooOOo0(oooOOO0, 9, null);
                return;
            }
            j2 = nanos;
        }
        this.f3942OooOoO.writeSampleData(this.f3938OooOo0.intValue(), oooo0.OooO0o(), oooo0.OooOoOO());
        this.f3950Oooo0 = size;
        this.f3954Oooo0O0 = j2;
        this.f3956Oooo0o = jOoooO0O;
        Oooo00o();
    }
}
