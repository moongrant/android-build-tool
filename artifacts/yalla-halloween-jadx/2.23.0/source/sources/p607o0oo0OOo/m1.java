package p607o0oo0OOo;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import io.agora.rtc.internal.RtcEngineEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.o0OOo000;
import p045Oooooo.o000OO;
import p607o0oo0OOo.m1;
import p608o0oo0Oo.o00000O0;
import p608o0oo0Oo.o0000O00;
import p608o0oo0Oo.o0000oo;
import p609o0oo0OoO.p1;
import p610o0oo0Ooo.q1;
import p612o0oo0o0.o0000O;
import p614o0oo0o0O.o000O0O0;
import p614o0oo0o0O.o00O000;
import p615o0oo0o0o.o00O00OO;
import p615o0oo0o0o.oOO00O;

/* JADX INFO: loaded from: classes5.dex */
public final class m1 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f56942OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O00OO f56943OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile int f56944OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public q1 f56945OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0000O00 f56946OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Integer f56947OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public oOO00O f56948OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f56949OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f56950OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f56951OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f56952OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f56953OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f56954OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f56955OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f56956OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public o0OOo000 f56957OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f56958OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f56959OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f56960OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final o0000O f56961OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f56962OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f56963OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f56964OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final l1 f56965OooOo0o;

    public m1(@NotNull o00O00OO evaAnimView) {
        Intrinsics.checkNotNullParameter(evaAnimView, "evaAnimView");
        this.f56943OooO00o = evaAnimView;
        this.f56944OooO0O0 = -1;
        this.f56950OooO0oo = 30;
        this.f56951OooOO0 = 1.0f;
        this.f56955OooOOO0 = -1;
        this.f56965OooOo0o = new l1(this);
        this.f56961OooOo = new o0000O(this);
    }

    public final void OooO00o(final p1 evaFileContainer) {
        oOO00O ooo00o;
        synchronized (m1.class) {
            if (this.f56956OooOOOO) {
                Log.i("AnimPlayer", "decoder start");
                this.f56959OooOOo0 = false;
                final o0000O00 o0000o00 = this.f56946OooO0Oo;
                if (o0000o00 != null) {
                    Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
                    o0000o00.f56970OooO = false;
                    o0000o00.f56986OooOOo = false;
                    o0000o00.f56983OooOOO0 = false;
                    o0000o00.f56975OooO0oo = true;
                    Handler handler = o0000o00.f56973OooO0o0.f56994OooO0O0;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: o0oo0Oo.o00000OO
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o0oo0OoO.p1] */
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
                                final o0000O00 this$0 = o0000o00;
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
                                    o000O0O0 o000o0o1 = o000O0O0.f57020OooO00o;
                                    Intrinsics.checkNotNullParameter(evaFile, "evaFile");
                                    mediaExtractor = new MediaExtractor();
                                    evaFile.OooO0OO(mediaExtractor);
                                    objectRef.element = mediaExtractor;
                                    int iOooO0OO = o000O0O0.OooO0OO(mediaExtractor);
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
                                                if (StringsKt.OooO0o(string, "hevc")) {
                                                    int i = Build.VERSION.SDK_INT;
                                                    if (!o000o0o1.OooO00o("video/hevc")) {
                                                        this$0.onFailed(10008, "0x8 hevc not support sdk:" + i + ",support hevc:" + o000o0o1.OooO00o("video/hevc"));
                                                        this$0.OooO0oO(null, null);
                                                        objectRef2 = objectRef2;
                                                    }
                                                    return;
                                                }
                                                Intrinsics.checkNotNullParameter(str2, str3);
                                                int i2 = this$0.f56982OooOOO;
                                                str4 = null;
                                                boolean z = true;
                                                this$0.f56985OooOOOo = i2 % 16 != 0 && this$0.f56971OooO0Oo.f56953OooOO0o;
                                                this$0.OooO0OO(i2, this$0.f56984OooOOOO);
                                                EvaJniUtil evaJniUtil = EvaJniUtil.f32972OooO00o;
                                                if (evaJniUtil.getExternalTexture(this$0.f56971OooO0Oo.f56944OooO0O0) != -1) {
                                                    SurfaceTexture surface = this$0.f56971OooO0Oo.f56943OooO00o.getSurface();
                                                    if (surface != null) {
                                                        surface.setOnFrameAvailableListener(this$0);
                                                        int i3 = this$0.f56982OooOOO;
                                                        int i4 = this$0.f56984OooOOOO;
                                                        surface.setDefaultBufferSize(i3, i4);
                                                        surfaceTexture = surface;
                                                        r16 = i4;
                                                    } else {
                                                        surfaceTexture = null;
                                                        r16 = r15;
                                                    }
                                                    this$0.f56980OooOO0O = surfaceTexture;
                                                    evaJniUtil.renderClearFrame(this$0.f56971OooO0Oo.f56944OooO0O0);
                                                    try {
                                                        String string2 = videoFormat.getString("mime");
                                                        if (string2 == null) {
                                                            string2 = "";
                                                        }
                                                        String strConcat = "Video MIME is ".concat(string2);
                                                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                                        Intrinsics.checkNotNullParameter(strConcat, str3);
                                                        final ?? CreateDecoderByType = MediaCodec.createDecoderByType(string2);
                                                        if (this$0.f56985OooOOOo) {
                                                            videoFormat.setInteger("color-format", 19);
                                                            CreateDecoderByType.configure(videoFormat, null, null, 0);
                                                        } else {
                                                            CreateDecoderByType.configure(videoFormat, new Surface(this$0.f56980OooOO0O), null, 0);
                                                        }
                                                        long j2 = this$0.f56971OooO0Oo.f56960OooOOoo;
                                                        r16 = 1;
                                                        r16 = 1;
                                                        objectRef2 = 1;
                                                        if (1 > j2 || j2 > j) {
                                                            z = false;
                                                        }
                                                        if (z) {
                                                            ((MediaExtractor) objectRef.element).seekTo(j2, 0);
                                                            String str5 = "startPoint " + this$0.f56971OooO0Oo.f56960OooOOoo + ", sampleTime：" + ((MediaExtractor) objectRef.element).getSampleTime();
                                                            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                                            Intrinsics.checkNotNullParameter(str5, str3);
                                                            this$0.f56971OooO0Oo.f56963OooOo00 = ((MediaExtractor) objectRef.element).getSampleTime();
                                                            ((MediaExtractor) objectRef.element).advance();
                                                        }
                                                        CreateDecoderByType.start();
                                                        Handler handler2 = this$0.f56972OooO0o.f56994OooO0O0;
                                                        if (handler2 != null) {
                                                            r5 = r20;
                                                            try {
                                                                handler2.post(new Runnable() { // from class: o0oo0Oo.o0000Ooo
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        o0000O00 this$1 = this$0;
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
                                                                            this$1.OooO0oO((MediaCodec) decoder.element, (MediaExtractor) extractor.element);
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
                                                                this$0.OooO0oO((MediaCodec) r5.element, (MediaExtractor) objectRef.element);
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
                                            this$0.f56982OooOOO = videoFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                                            this$0.f56984OooOOOO = videoFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                                            j = videoFormat.getLong("durationUs");
                                            m1 m1Var = this$0.f56971OooO0Oo;
                                            if (m1Var.f56942OooO) {
                                                str = "msg";
                                                r20 = objectRef2;
                                                r15 = objectRef2;
                                            } else {
                                                try {
                                                    int integer = videoFormat.getInteger("frame-rate");
                                                    o0000O00 o0000o01 = m1Var.f56946OooO0Oo;
                                                    if (o0000o01 != null) {
                                                        o00O000 o00o001 = (o00O000) o0000o01.f56976OooOO0.getValue();
                                                        if (integer <= 0) {
                                                            o00o001.getClass();
                                                        } else {
                                                            try {
                                                                r20 = objectRef2;
                                                                str = "msg";
                                                                long j3 = integer;
                                                                try {
                                                                    o00o001.f57030OooO0Oo = o00o001.f57027OooO00o / j3;
                                                                    r14 = j3;
                                                                    r21 = r20;
                                                                    m1Var.f56949OooO0oO = integer;
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
                                                    m1Var.f56949OooO0oO = integer;
                                                    r15 = r14;
                                                    r20 = r21;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    str = "msg";
                                                    r20 = objectRef2;
                                                }
                                            }
                                            str2 = "Video size is " + this$0.f56982OooOOO + " x " + this$0.f56984OooOOOO;
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
                                this$0.OooO0oO((MediaCodec) r6.element, (MediaExtractor) objectRef.element);
                            }
                        });
                    }
                }
                if (!this.f56958OooOOo && (ooo00o = this.f56948OooO0o0) != null) {
                    ooo00o.OooO0OO(evaFileContainer);
                }
            } else {
                this.f56957OooOOOo = new o0OOo000(2, this, evaFileContainer);
                this.f56943OooO00o.prepareTextureView();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean OooO0O0() {
        StringBuilder sb = new StringBuilder("isStartRunning ");
        sb.append(this.f56959OooOOo0);
        sb.append(", decoderRunning ");
        o0000O00 o0000o00 = this.f56946OooO0Oo;
        sb.append(o0000o00 != null ? o0000o00.f56975OooO0oo : false);
        String msg = sb.toString();
        Intrinsics.checkNotNullParameter("AnimPlayer", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!this.f56959OooOOo0) {
            o0000O00 o0000o01 = this.f56946OooO0Oo;
            if (!(o0000o01 != null ? o0000o01.f56975OooO0oo : false)) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0OO() {
        Handler handler;
        this.f56956OooOOOO = false;
        this.f56959OooOOo0 = false;
        this.f56960OooOOoo = 0L;
        final o0000O00 o0000o00 = this.f56946OooO0Oo;
        if (o0000o00 != null) {
            if (o0000o00.f56975OooO0oo) {
                o0000o00.f56983OooOOO0 = true;
                Log.i("EvaAnimPlayer.Decoder", "stop true");
                o0000o00.f56970OooO = true;
            } else {
                if (o0000o00.f56971OooO0Oo.f56964OooOo0O && (handler = o0000o00.f56973OooO0o0.f56994OooO0O0) != null) {
                    handler.post(new Runnable() { // from class: o0oo0Oo.o00000O
                        @Override // java.lang.Runnable
                        public final void run() {
                            o0000O00 this$0 = o0000o00;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            EvaJniUtil evaJniUtil = EvaJniUtil.f32972OooO00o;
                            evaJniUtil.renderClearFrame(this$0.f56971OooO0Oo.f56944OooO0O0);
                            try {
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter("releaseLastFrame", "msg");
                                SurfaceTexture surfaceTexture = this$0.f56980OooOO0O;
                                if (surfaceTexture != null) {
                                    surfaceTexture.release();
                                }
                                this$0.f56980OooOO0O = null;
                                evaJniUtil.releaseTexture(this$0.f56971OooO0Oo.f56944OooO0O0);
                            } catch (Throwable tr) {
                                String msg = "release e=" + tr;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg, "msg");
                                Intrinsics.checkNotNullParameter(tr, "tr");
                            }
                            this$0.f56975OooO0oo = false;
                            this$0.onVideoComplete();
                            if (this$0.f56983OooOOO0) {
                                this$0.OooO0o0();
                            }
                            this$0.f56971OooO0Oo.f56964OooOo0O = false;
                        }
                    });
                }
                o0000o00.OooO0o0();
            }
        }
        oOO00O ooo00o = this.f56948OooO0o0;
        if (ooo00o != null) {
            if (!ooo00o.f57058OooO0o) {
                ooo00o.OooO00o();
            } else {
                ooo00o.f57053OooO = true;
                ooo00o.f57061OooO0oo = true;
            }
        }
    }

    public final void OooO0Oo(int i, int i2) {
        o0000O00 o0000o00 = this.f56946OooO0Oo;
        if (o0000o00 != null) {
            EvaJniUtil.f32972OooO00o.updateViewPoint(o0000o00.f56971OooO0Oo.f56944OooO0O0, i, i2);
            Log.i("EvaAnimPlayer.Decoder", "updateViewPoint " + i + ", " + i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    public final void OooO0o(@NotNull p1 evaFileContainer) {
        boolean z;
        o0000oo o0000ooVar;
        Handler handler;
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        int i = 1;
        this.f56959OooOOo0 = true;
        if (this.f56946OooO0Oo == null) {
            o0000O00 o0000o00 = new o0000O00(this);
            o0000o00.f56974OooO0oO = this.f56952OooOO0O;
            int i2 = this.f56949OooO0oO;
            o00O000 o00o001 = (o00O000) o0000o00.f56976OooOO0.getValue();
            if (i2 <= 0) {
                o00o001.getClass();
            } else {
                o00o001.f57030OooO0Oo = o00o001.f57027OooO00o / ((long) i2);
            }
            this.f56946OooO0Oo = o0000o00;
        }
        if (this.f56948OooO0o0 == null) {
            oOO00O ooo00o = new oOO00O(this);
            ooo00o.f57060OooO0oO = this.f56952OooOO0O;
            this.f56948OooO0o0 = ooo00o;
        }
        o0000O00 o0000o01 = this.f56946OooO0Oo;
        if (o0000o01 == null) {
            z = false;
        } else {
            if (o00000O0.OooO00o.OooO00o(o0000o01.f56973OooO0o0, "anim_render_thread") && o00000O0.OooO00o.OooO00o(o0000o01.f56972OooO0o, "anim_decode_thread")) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z) {
            o0000O00 o0000o02 = this.f56946OooO0Oo;
            if (o0000o02 == null || (o0000ooVar = o0000o02.f56973OooO0o0) == null || (handler = o0000ooVar.f56994OooO0O0) == null) {
                return;
            }
            handler.post(new o000OO(i, this, evaFileContainer));
            return;
        }
        this.f56959OooOOo0 = false;
        o0000O00 o0000o03 = this.f56946OooO0Oo;
        if (o0000o03 != null) {
            o0000o03.onFailed(10003, "0x3 thread create fail");
        }
        o0000O00 o0000o04 = this.f56946OooO0Oo;
        if (o0000o04 != null) {
            o0000o04.onVideoComplete();
        }
    }

    public final void OooO0o0(int i) {
        o0000O00 o0000o00 = this.f56946OooO0Oo;
        if (o0000o00 != null) {
            o0000o00.f56974OooO0oO = i;
        }
        oOO00O ooo00o = this.f56948OooO0o0;
        if (ooo00o != null) {
            ooo00o.f57060OooO0oO = i;
        }
        this.f56952OooOO0O = i;
    }
}
