package p612o0oo0OoO;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import androidx.media3.ui.o00O0O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import io.agora.rtc.internal.RtcEngineEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00000O0;
import p612o0oo0OoO.r5;
import p613o0oo0Ooo.s5;
import p613o0oo0Ooo.w5;
import p613o0oo0Ooo.x5;
import p615o0oo0o0.o000oOoO;
import p616o0oo0o00.Oooo0;
import p618o0oo0o0o.o0oOo0O0;
import p619o0oo0oO.oO0O0Oo0;
import p619o0oo0oO.oOo0o0oO;
import p620o0oo0oO0.o00;
import p620o0oo0oO0.o000O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class r5 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f57459OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oOo0o0oO f57460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile int f57461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o000oOoO f57462OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public w5 f57463OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Integer f57464OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public oO0O0Oo0 f57465OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57466OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f57467OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f57468OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f57469OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f57470OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f57471OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f57472OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f57473OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public q5 f57474OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f57475OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f57476OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f57477OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f57478OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f57479OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f57480OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f57481OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final p5 f57482OooOo0o;

    public r5(@NotNull oOo0o0oO evaAnimView) {
        Intrinsics.checkNotNullParameter(evaAnimView, "evaAnimView");
        this.f57460OooO00o = evaAnimView;
        this.f57461OooO0O0 = -1;
        this.f57467OooO0oo = 30;
        this.f57468OooOO0 = 1.0f;
        this.f57472OooOOO0 = -1;
        this.f57482OooOo0o = new p5(this);
        this.f57478OooOo = new o0oOo0O0(this);
    }

    public final void OooO00o(final Oooo0 evaFileContainer) {
        oO0O0Oo0 oo0o0oo0;
        synchronized (r5.class) {
            if (this.f57473OooOOOO) {
                Log.i("AnimPlayer", "decoder start");
                this.f57476OooOOo0 = false;
                final w5 w5Var = this.f57463OooO0Oo;
                if (w5Var != null) {
                    Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
                    w5Var.f57483OooO = false;
                    w5Var.f57506OooOOo = false;
                    w5Var.f57503OooOOO0 = false;
                    w5Var.f57488OooO0oo = true;
                    Handler handler = w5Var.f57486OooO0o0.f57510OooO0O0;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: o0oo0Ooo.t5
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o0oo0o00.Oooo0] */
                            /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.Ref$ObjectRef] */
                            /* JADX WARN: Type inference failed for: r14v1 */
                            /* JADX WARN: Type inference failed for: r14v10 */
                            /* JADX WARN: Type inference failed for: r14v11 */
                            /* JADX WARN: Type inference failed for: r14v12 */
                            /* JADX WARN: Type inference failed for: r14v13 */
                            /* JADX WARN: Type inference failed for: r14v14 */
                            /* JADX WARN: Type inference failed for: r14v15 */
                            /* JADX WARN: Type inference failed for: r14v16 */
                            /* JADX WARN: Type inference failed for: r14v17 */
                            /* JADX WARN: Type inference failed for: r14v18 */
                            /* JADX WARN: Type inference failed for: r14v19 */
                            /* JADX WARN: Type inference failed for: r14v20 */
                            /* JADX WARN: Type inference failed for: r14v21 */
                            /* JADX WARN: Type inference failed for: r14v3 */
                            /* JADX WARN: Type inference failed for: r14v4 */
                            /* JADX WARN: Type inference failed for: r14v5 */
                            /* JADX WARN: Type inference failed for: r14v6 */
                            /* JADX WARN: Type inference failed for: r14v7 */
                            /* JADX WARN: Type inference failed for: r14v8 */
                            /* JADX WARN: Type inference failed for: r1v1 */
                            /* JADX WARN: Type inference failed for: r1v18 */
                            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r1v26 */
                            /* JADX WARN: Type inference failed for: r1v29 */
                            /* JADX WARN: Type inference failed for: r1v42, types: [T, android.media.MediaCodec] */
                            /* JADX WARN: Type inference failed for: r1v8, types: [T, android.media.MediaExtractor] */
                            /* JADX WARN: Type inference failed for: r20v0 */
                            /* JADX WARN: Type inference failed for: r20v1 */
                            /* JADX WARN: Type inference failed for: r20v10 */
                            /* JADX WARN: Type inference failed for: r20v2 */
                            /* JADX WARN: Type inference failed for: r20v3 */
                            /* JADX WARN: Type inference failed for: r20v4 */
                            /* JADX WARN: Type inference failed for: r20v5 */
                            /* JADX WARN: Type inference failed for: r20v6 */
                            /* JADX WARN: Type inference failed for: r20v7 */
                            /* JADX WARN: Type inference failed for: r20v8 */
                            /* JADX WARN: Type inference failed for: r20v9 */
                            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r5v1 */
                            /* JADX WARN: Type inference failed for: r5v10 */
                            /* JADX WARN: Type inference failed for: r5v11 */
                            /* JADX WARN: Type inference failed for: r5v19 */
                            /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.Ref$ObjectRef] */
                            /* JADX WARN: Type inference failed for: r5v27 */
                            /* JADX WARN: Type inference failed for: r5v28, types: [kotlin.jvm.internal.Ref$ObjectRef] */
                            /* JADX WARN: Type inference failed for: r5v31 */
                            /* JADX WARN: Type inference failed for: r5v32 */
                            /* JADX WARN: Type inference failed for: r5v33, types: [kotlin.jvm.internal.Ref$ObjectRef] */
                            /* JADX WARN: Type inference failed for: r5v34, types: [kotlin.jvm.internal.Ref$ObjectRef] */
                            /* JADX WARN: Type inference failed for: r5v40 */
                            /* JADX WARN: Type inference failed for: r5v5 */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ?? mediaExtractor;
                                long j;
                                String str;
                                ?? r20;
                                ?? r21;
                                ?? r14;
                                ?? r15;
                                String str2;
                                SurfaceTexture surfaceTexture;
                                ?? r16;
                                final ?? r5;
                                final w5 this$0 = w5Var;
                                ?? evaFile = evaFileContainer;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(evaFile, "$evaFileContainer");
                                this$0.getClass();
                                String str3 = "video/hevc";
                                ?? r6 = "tr";
                                String str4 = "msg";
                                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                ?? objectRef2 = new Ref.ObjectRef();
                                try {
                                    o000O00O o000o00o2 = o000O00O.f57581OooO00o;
                                    Intrinsics.checkNotNullParameter(evaFile, "evaFile");
                                    mediaExtractor = new MediaExtractor();
                                    evaFile.OooO0OO(mediaExtractor);
                                    objectRef.element = mediaExtractor;
                                    int iOooO0OO = o000O00O.OooO0OO(mediaExtractor);
                                    try {
                                        if (iOooO0OO < 0) {
                                            throw new RuntimeException("No video track found");
                                        }
                                        ((MediaExtractor) objectRef.element).selectTrack(iOooO0OO);
                                        MediaFormat videoFormat = ((MediaExtractor) objectRef.element).getTrackFormat(iOooO0OO);
                                        if (videoFormat == null) {
                                            throw new RuntimeException("format is null");
                                        }
                                        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
                                        String string = videoFormat.getString("mime");
                                        if (string == null) {
                                            string = "";
                                        }
                                        try {
                                            try {
                                                if (StringsKt__StringsKt.contains$default(string, "hevc", false, 2, (Object) null)) {
                                                    int i = Build.VERSION.SDK_INT;
                                                    if (!o000o00o2.OooO00o("video/hevc")) {
                                                        this$0.onFailed(10008, "0x8 hevc not support sdk:" + i + ",support hevc:" + o000o00o2.OooO00o("video/hevc"));
                                                        this$0.OooO0o(null, null);
                                                        objectRef2 = objectRef2;
                                                    }
                                                    return;
                                                }
                                                Intrinsics.checkNotNullParameter(str2, str3);
                                                int i2 = this$0.f57502OooOOO;
                                                str4 = null;
                                                boolean z = true;
                                                this$0.f57505OooOOOo = i2 % 16 != 0 && this$0.f57484OooO0Oo.f57470OooOO0o;
                                                this$0.OooO0OO(i2, this$0.f57504OooOOOO);
                                                EvaJniUtil evaJniUtil = EvaJniUtil.f32437OooO00o;
                                                if (evaJniUtil.getExternalTexture(this$0.f57484OooO0Oo.f57461OooO0O0) != -1) {
                                                    SurfaceTexture surface = this$0.f57484OooO0Oo.f57460OooO00o.getSurface();
                                                    if (surface != null) {
                                                        surface.setOnFrameAvailableListener(this$0);
                                                        int i3 = this$0.f57502OooOOO;
                                                        int i4 = this$0.f57504OooOOOO;
                                                        surface.setDefaultBufferSize(i3, i4);
                                                        surfaceTexture = surface;
                                                        r16 = i4;
                                                    } else {
                                                        surfaceTexture = null;
                                                        r16 = r15;
                                                    }
                                                    this$0.f57500OooOO0O = surfaceTexture;
                                                    evaJniUtil.renderClearFrame(this$0.f57484OooO0Oo.f57461OooO0O0);
                                                    try {
                                                        String string2 = videoFormat.getString("mime");
                                                        if (string2 == null) {
                                                            string2 = "";
                                                        }
                                                        String strConcat = "Video MIME is ".concat(string2);
                                                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                                        Intrinsics.checkNotNullParameter(strConcat, str3);
                                                        final ?? CreateDecoderByType = MediaCodec.createDecoderByType(string2);
                                                        if (this$0.f57505OooOOOo) {
                                                            videoFormat.setInteger("color-format", 19);
                                                            CreateDecoderByType.configure(videoFormat, null, null, 0);
                                                        } else {
                                                            CreateDecoderByType.configure(videoFormat, new Surface(this$0.f57500OooOO0O), null, 0);
                                                        }
                                                        long j2 = this$0.f57484OooO0Oo.f57477OooOOoo;
                                                        r16 = 1;
                                                        r16 = 1;
                                                        objectRef2 = 1;
                                                        if (1 > j2 || j2 > j) {
                                                            z = false;
                                                        }
                                                        if (z) {
                                                            ((MediaExtractor) objectRef.element).seekTo(j2, 0);
                                                            String str5 = "startPoint " + this$0.f57484OooO0Oo.f57477OooOOoo + ", sampleTime：" + ((MediaExtractor) objectRef.element).getSampleTime();
                                                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                                            Intrinsics.checkNotNullParameter(str5, str3);
                                                            this$0.f57484OooO0Oo.f57480OooOo00 = ((MediaExtractor) objectRef.element).getSampleTime();
                                                            ((MediaExtractor) objectRef.element).advance();
                                                        }
                                                        CreateDecoderByType.start();
                                                        Handler handler2 = this$0.f57485OooO0o.f57510OooO0O0;
                                                        if (handler2 != null) {
                                                            r5 = r20;
                                                            try {
                                                                handler2.post(new Runnable() { // from class: o0oo0Ooo.u5
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        w5 this$1 = this$0;
                                                                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                                                                        Ref.ObjectRef extractor = objectRef;
                                                                        Intrinsics.checkNotNullParameter(extractor, "$extractor");
                                                                        MediaCodec this_apply = CreateDecoderByType;
                                                                        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                                                        Ref.ObjectRef decoder = r5;
                                                                        Intrinsics.checkNotNullParameter(decoder, "$decoder");
                                                                        try {
                                                                            this$1.OooO0oo(this_apply, (MediaExtractor) extractor.element);
                                                                        } catch (Throwable tr) {
                                                                            String msg = "MediaCodec exception e=" + tr;
                                                                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                                                            Intrinsics.checkNotNullParameter(msg, "msg");
                                                                            Intrinsics.checkNotNullParameter(tr, "tr");
                                                                            this$1.onFailed(10002, "0x2 MediaCodec exception e=" + tr);
                                                                            this$1.OooO0o((MediaCodec) decoder.element, (MediaExtractor) extractor.element);
                                                                        }
                                                                    }
                                                                });
                                                                r5 = r5;
                                                            } catch (Throwable th) {
                                                                tr = th;
                                                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                                                Intrinsics.checkNotNullParameter("MediaCodec configure exception e=" + tr, str3);
                                                                Intrinsics.checkNotNullParameter(tr, "tr");
                                                                this$0.onFailed(10002, "0x2 MediaCodec exception e=" + tr);
                                                                this$0.OooO0o((MediaCodec) r5.element, (MediaExtractor) objectRef.element);
                                                                objectRef2 = r16;
                                                            }
                                                        } else {
                                                            r5 = r20;
                                                        }
                                                        r5.element = CreateDecoderByType;
                                                    } catch (Throwable th2) {
                                                        tr = th2;
                                                        r5 = r20;
                                                    }
                                                } else {
                                                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                                    Intrinsics.checkNotNullParameter("eva not init, can not get glTexture", str3);
                                                    objectRef2 = r15;
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                mediaExtractor = "tr";
                                                r6 = r20;
                                            }
                                            this$0.f57502OooOOO = videoFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                                            this$0.f57504OooOOOO = videoFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                                            j = videoFormat.getLong("durationUs");
                                            r5 r5Var = this$0.f57484OooO0Oo;
                                            if (r5Var.f57459OooO) {
                                                str = "msg";
                                                r20 = objectRef2;
                                                r15 = objectRef2;
                                            } else {
                                                try {
                                                    int integer = videoFormat.getInteger("frame-rate");
                                                    w5 w5Var2 = r5Var.f57463OooO0Oo;
                                                    if (w5Var2 != null) {
                                                        o00 o00Var = (o00) w5Var2.f57489OooOO0.getValue();
                                                        if (integer <= 0) {
                                                            o00Var.getClass();
                                                        } else {
                                                            try {
                                                                r20 = objectRef2;
                                                                str = "msg";
                                                                long j3 = integer;
                                                                try {
                                                                    o00Var.f57577OooO0Oo = o00Var.f57574OooO00o / j3;
                                                                    r14 = j3;
                                                                    r21 = r20;
                                                                    r5Var.f57466OooO0oO = integer;
                                                                    r15 = r14;
                                                                    r20 = r21;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    mediaExtractor = "tr";
                                                                    r6 = r20;
                                                                    str3 = str;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                r20 = objectRef2;
                                                                str = "msg";
                                                                mediaExtractor = "tr";
                                                                r6 = r20;
                                                                str3 = str;
                                                            }
                                                        }
                                                        mediaExtractor = "tr";
                                                        r6 = r20;
                                                        str3 = str;
                                                    }
                                                    str = "msg";
                                                    r21 = objectRef2;
                                                    r14 = objectRef2;
                                                    r5Var.f57466OooO0oO = integer;
                                                    r15 = r14;
                                                    r20 = r21;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    str = "msg";
                                                    r20 = objectRef2;
                                                }
                                            }
                                            str2 = "Video size is " + this$0.f57502OooOOO + " x " + this$0.f57504OooOOOO;
                                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                            str3 = str;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            str3 = str4;
                                            r6 = objectRef2;
                                            mediaExtractor = "tr";
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    mediaExtractor = "tr";
                                    str3 = "msg";
                                    r6 = objectRef2;
                                }
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("MediaExtractor exception e=" + th, str3);
                                Intrinsics.checkNotNullParameter(th, mediaExtractor);
                                this$0.onFailed(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS, "0x1 MediaExtractor exception e=" + th);
                                this$0.OooO0o((MediaCodec) r6.element, (MediaExtractor) objectRef.element);
                            }
                        });
                    }
                }
                if (!this.f57475OooOOo && (oo0o0oo0 = this.f57465OooO0o0) != null) {
                    oo0o0oo0.OooO0OO(evaFileContainer);
                }
            } else {
                this.f57474OooOOOo = new q5(this, evaFileContainer);
                this.f57460OooO00o.prepareTextureView();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean OooO0O0() {
        StringBuilder sb = new StringBuilder("isStartRunning ");
        sb.append(this.f57476OooOOo0);
        sb.append(", decoderRunning ");
        w5 w5Var = this.f57463OooO0Oo;
        sb.append(w5Var != null ? w5Var.f57488OooO0oo : false);
        String msg = sb.toString();
        Intrinsics.checkNotNullParameter("AnimPlayer", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!this.f57476OooOOo0) {
            w5 w5Var2 = this.f57463OooO0Oo;
            if (!(w5Var2 != null ? w5Var2.f57488OooO0oo : false)) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0OO() {
        Handler handler;
        this.f57473OooOOOO = false;
        this.f57476OooOOo0 = false;
        this.f57477OooOOoo = 0L;
        w5 w5Var = this.f57463OooO0Oo;
        int i = 1;
        if (w5Var != null) {
            if (w5Var.f57488OooO0oo) {
                w5Var.f57503OooOOO0 = true;
                Log.i("EvaAnimPlayer.Decoder", "stop true");
                w5Var.f57483OooO = true;
            } else {
                if (w5Var.f57484OooO0Oo.f57481OooOo0O && (handler = w5Var.f57486OooO0o0.f57510OooO0O0) != null) {
                    handler.post(new o00O0O(w5Var, i));
                }
                w5Var.OooO0Oo();
            }
        }
        oO0O0Oo0 oo0o0oo0 = this.f57465OooO0o0;
        if (oo0o0oo0 != null) {
            if (!oo0o0oo0.f57568OooO0o) {
                oo0o0oo0.OooO00o();
            } else {
                oo0o0oo0.f57563OooO = true;
                oo0o0oo0.f57571OooO0oo = true;
            }
        }
    }

    public final void OooO0Oo(int i, int i2) {
        w5 w5Var = this.f57463OooO0Oo;
        if (w5Var != null) {
            EvaJniUtil.f32437OooO00o.updateViewPoint(w5Var.f57484OooO0Oo.f57461OooO0O0, i, i2);
            Log.i("EvaAnimPlayer.Decoder", "updateViewPoint " + i + ", " + i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    public final void OooO0o(@NotNull Oooo0 evaFileContainer) {
        boolean z;
        x5 x5Var;
        Handler handler;
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        this.f57476OooOOo0 = true;
        if (this.f57463OooO0Oo == null) {
            w5 w5Var = new w5(this);
            w5Var.f57487OooO0oO = this.f57469OooOO0O;
            int i = this.f57466OooO0oO;
            o00 o00Var = (o00) w5Var.f57489OooOO0.getValue();
            if (i <= 0) {
                o00Var.getClass();
            } else {
                o00Var.f57577OooO0Oo = o00Var.f57574OooO00o / ((long) i);
            }
            this.f57463OooO0Oo = w5Var;
        }
        if (this.f57465OooO0o0 == null) {
            oO0O0Oo0 oo0o0oo0 = new oO0O0Oo0(this);
            oo0o0oo0.f57570OooO0oO = this.f57469OooOO0O;
            this.f57465OooO0o0 = oo0o0oo0;
        }
        w5 w5Var2 = this.f57463OooO0Oo;
        if (w5Var2 != null) {
            z = s5.OooO00o.OooO00o(w5Var2.f57486OooO0o0, "anim_render_thread") && s5.OooO00o.OooO00o(w5Var2.f57485OooO0o, "anim_decode_thread") ? false : true;
        }
        if (!z) {
            w5 w5Var3 = this.f57463OooO0Oo;
            if (w5Var3 == null || (x5Var = w5Var3.f57486OooO0o0) == null || (handler = x5Var.f57510OooO0O0) == null) {
                return;
            }
            handler.post(new o00000O0(2, this, evaFileContainer));
            return;
        }
        this.f57476OooOOo0 = false;
        w5 w5Var4 = this.f57463OooO0Oo;
        if (w5Var4 != null) {
            w5Var4.onFailed(10003, "0x3 thread create fail");
        }
        w5 w5Var5 = this.f57463OooO0Oo;
        if (w5Var5 != null) {
            w5Var5.onVideoComplete();
        }
    }

    public final void OooO0o0(int i) {
        w5 w5Var = this.f57463OooO0Oo;
        if (w5Var != null) {
            w5Var.f57487OooO0oO = i;
        }
        oO0O0Oo0 oo0o0oo0 = this.f57465OooO0o0;
        if (oo0o0oo0 != null) {
            oo0o0oo0.f57570OooO0oO = i;
        }
        this.f57469OooOO0O = i;
    }
}
