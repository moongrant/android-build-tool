package p460o0Ooo0o;

import Jni.FFmpegCmd;
import VideoHandle.CmdList;
import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0000O0;
import com.yalla.yalla.model.media.MediaVideoItemModel;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p223o00oOOOo.o00OOO0O;
import p550o0oOOO0o.o00O00;
import p550o0oOOO0o.o00O00O;
import p550o0oOOO0o.oOO00O;
import p551o0oOOOoo.o0oo0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFFmpegCmdUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FFmpegCmdUtils.kt\ncom/yalla/yalla/module/media/utils/FFmpegCmdUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,402:1\n1864#2,3:403\n37#3,2:406\n*S KotlinDebug\n*F\n+ 1 FFmpegCmdUtils.kt\ncom/yalla/yalla/module/media/utils/FFmpegCmdUtils\n*L\n219#1:403,3\n263#1:406,2\n*E\n"})
public final class oo0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static String f47808OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0O f47807OooO00o = new oo0O();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableState<Float> f47809OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.module.media.utils.FFmpegCmdUtils", f = "FFmpegCmdUtils.kt", i = {0}, l = {235}, m = "mergeCurrentRecordingVideos2One", n = {"mergeVideoFilePath"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f47810OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f47812OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f47813OooO0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47812OooO0o0 = obj;
            this.f47813OooO0oO |= Integer.MIN_VALUE;
            return oo0O.this.OooO0o0(null, null, this);
        }
    }

    static {
        new ArrayList();
    }

    public static Object OooO0Oo(CmdList cmdList, long j, ContinuationImpl continuationImpl) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuationImpl));
        MutableState<Float> mutableState = f47809OooO0OO;
        if (j > 0) {
            mutableState.setValue(Boxing.boxFloat(0.0f));
        } else {
            mutableState.setValue(null);
        }
        FFmpegCmd.exec((String[]) cmdList.toArray(new String[0]), j, new o00OO0OO(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return orThrow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @Nullable String str2, long j, @Nullable String str3, float f, float f2, @NotNull o00O00 o00o01, @NotNull Continuation continuation) throws IOException {
        o00OO000 o00oo001;
        CmdList cmdList;
        String str4;
        long j2;
        if (continuation instanceof o00OO000) {
            o00oo001 = (o00OO000) continuation;
            int i = o00oo001.f47791OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo001.f47791OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o00oo001 = new o00OO000(this, continuation);
            }
        } else {
            o00oo001 = new o00OO000(this, continuation);
        }
        Object objOooO0Oo = o00oo001.f47788OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00oo001.f47791OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return new o00O(FFmpegCmdResult.Failure, null);
            }
            Intrinsics.checkNotNull(str2);
            if (!new File(str2).exists()) {
                return new o00O(FFmpegCmdResult.Failure, null);
            }
            if (new File(str).exists()) {
                oo0o0O0.OooO00o("_VideoCompressUtil", "compressVideo file exit");
                new File(str).delete();
            }
            o0000O0.OooO0OO("videoFilePath : " + str2);
            o0000O0.OooO0OO("backgroundMusicFilePath : " + str3);
            LinkedHashMap<String, Object> linkedHashMapOooO0Oo = o00OOO0O.OooO0Oo(str2);
            if (str3 == null || str3.length() == 0) {
                cmdList = new CmdList();
                cmdList.OooO0O0("ffmpeg -i");
                cmdList.add(str2);
                Intrinsics.checkNotNullExpressionValue(cmdList, "append(...)");
                o0000O0.OooO0O0(cmdList, linkedHashMapOooO0Oo);
                o0000O0.OooO00o(cmdList, linkedHashMapOooO0Oo);
                cmdList.OooO0O0("-movflags faststart -af volume=" + f);
                cmdList.add(str);
            } else {
                CmdList cmdList2 = new CmdList();
                cmdList2.OooO0O0("ffmpeg -i");
                cmdList2.add(str2);
                cmdList2.add("-i");
                cmdList2.add(str3);
                Intrinsics.checkNotNullExpressionValue(cmdList2, "append(...)");
                o0000O0.OooO0O0(cmdList2, linkedHashMapOooO0Oo);
                o0000O0.OooO00o(cmdList2, linkedHashMapOooO0Oo);
                cmdList2.OooO0O0("-filter_complex [0:a]volume=" + f + "[a];[1:a]volume=" + f2 + "[b];[a][b]amix=inputs=2:duration=longest[out] -map 0:v -map [out] -movflags faststart -shortest");
                cmdList2.add(str);
                cmdList = cmdList2;
            }
            o0000O0.OooO0OO("compressVideo : " + cmdList);
            o00o01.invoke();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNull(cmdList);
            long j3 = j > 0 ? ((long) 1000) * j : 0L;
            o00oo001.f47787OooO0Oo = str;
            o00oo001.f47789OooO0o0 = jCurrentTimeMillis;
            o00oo001.f47791OooO0oo = 1;
            objOooO0Oo = OooO0Oo(cmdList, j3, o00oo001);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            str4 = str;
            j2 = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = o00oo001.f47789OooO0o0;
            str4 = o00oo001.f47787OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        FFmpegCmdResult fFmpegCmdResult = (FFmpegCmdResult) objOooO0Oo;
        o0000O0.OooO0OO("compressVideo cost time :" + (System.currentTimeMillis() - j2) + "   " + fFmpegCmdResult);
        return new o00O(fFmpegCmdResult, str4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0O0(@NotNull o0oo0000 o0oo0000Var, @NotNull String str, @NotNull o00O00O.OooO00o oooO00o, @NotNull Continuation continuation) {
        o00OO00O o00oo00o;
        String str2;
        long j;
        if (continuation instanceof o00OO00O) {
            o00oo00o = (o00OO00O) continuation;
            int i = o00oo00o.f47796OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo00o.f47796OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o00oo00o = new o00OO00O(this, continuation);
            }
        } else {
            o00oo00o = new o00OO00O(this, continuation);
        }
        Object obj = o00oo00o.f47793OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00oo00o.f47796OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!TextUtils.isEmpty(o0oo0000Var.f56012OooO00o) && !TextUtils.isEmpty(str)) {
                String str3 = o0oo0000Var.f56012OooO00o;
                if (new File(str3).exists()) {
                    if (new File(str).exists()) {
                        oo0o0O0.OooO00o("_VideoCompressUtil", "cut up video exit");
                        new File(str).delete();
                    }
                    oooO00o.invoke();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    CmdList cmdList = new CmdList();
                    cmdList.OooO0O0("ffmpeg -i");
                    cmdList.add(str3);
                    float f = o0oo0000Var.f56014OooO0OO;
                    float f2 = o0oo0000Var.f56013OooO0O0;
                    cmdList.OooO0O0("-vn -acodec aac -ss " + f2 + " -t " + (f - f2));
                    cmdList.add(str);
                    StringBuilder sb = new StringBuilder("command:  ");
                    sb.append(cmdList);
                    o0000O0.OooO0OO(sb.toString());
                    Intrinsics.checkNotNull(cmdList);
                    o00oo00o.f47792OooO0Oo = str;
                    o00oo00o.f47794OooO0o0 = jCurrentTimeMillis;
                    o00oo00o.f47796OooO0oo = 1;
                    Object objOooO0Oo = OooO0Oo(cmdList, 0L, o00oo00o);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objOooO0Oo;
                    str2 = str;
                    j = jCurrentTimeMillis;
                }
            }
            return new o00O(FFmpegCmdResult.Failure, null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = o00oo00o.f47794OooO0o0;
        str2 = o00oo00o.f47792OooO0Oo;
        ResultKt.throwOnFailure(obj);
        FFmpegCmdResult fFmpegCmdResult = (FFmpegCmdResult) obj;
        o0000O0.OooO0OO("cut up audio cost time :" + (System.currentTimeMillis() - j) + "   " + fFmpegCmdResult);
        return new o00O(fFmpegCmdResult, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull o0oo0000 o0oo0000Var, @NotNull String str, @NotNull oOO00O.OooO00o oooO00o, @NotNull Continuation continuation) throws IOException {
        o00OO0O0 o00oo0o1;
        String str2;
        long j;
        if (continuation instanceof o00OO0O0) {
            o00oo0o1 = (o00OO0O0) continuation;
            int i = o00oo0o1.f47801OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo0o1.f47801OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o00oo0o1 = new o00OO0O0(this, continuation);
            }
        } else {
            o00oo0o1 = new o00OO0O0(this, continuation);
        }
        Object objOooO0Oo = o00oo0o1.f47798OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00oo0o1.f47801OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (!TextUtils.isEmpty(o0oo0000Var.f56012OooO00o) && !TextUtils.isEmpty(str)) {
                String str3 = o0oo0000Var.f56012OooO00o;
                if (new File(str3).exists()) {
                    if (new File(str).exists()) {
                        oo0o0O0.OooO00o("_VideoCompressUtil", "cut up video exit");
                        new File(str).delete();
                    }
                    LinkedHashMap<String, Object> linkedHashMapOooO0Oo = o00OOO0O.OooO0Oo(str3);
                    CmdList cmdList = new CmdList();
                    cmdList.OooO0O0("ffmpeg -i");
                    cmdList.add(str3);
                    Intrinsics.checkNotNullExpressionValue(cmdList, "append(...)");
                    String str4 = f47808OooO0O0;
                    if (!(str4 == null || str4.length() == 0)) {
                        cmdList.OooO0O0("-c:v h264_mediacodec -vf format=" + f47808OooO0O0);
                    }
                    o0000O0.OooO00o(cmdList, linkedHashMapOooO0Oo);
                    float f = o0oo0000Var.f56014OooO0OO;
                    float f2 = o0oo0000Var.f56013OooO0O0;
                    float f3 = f - f2;
                    cmdList.OooO0O0("-ss " + f2 + " -t " + f3);
                    cmdList.add(str);
                    StringBuilder sb = new StringBuilder("videoCutCommand:  ");
                    sb.append(cmdList);
                    o0000O0.OooO0OO(sb.toString());
                    oooO00o.invoke();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Intrinsics.checkNotNull(cmdList);
                    o00oo0o1.f47797OooO0Oo = str;
                    o00oo0o1.f47799OooO0o0 = jCurrentTimeMillis;
                    o00oo0o1.f47801OooO0oo = 1;
                    objOooO0Oo = OooO0Oo(cmdList, ((long) f3) * ((long) 1000), o00oo0o1);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    j = jCurrentTimeMillis;
                }
            }
            return new o00O(FFmpegCmdResult.Failure, null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = o00oo0o1.f47799OooO0o0;
        str2 = o00oo0o1.f47797OooO0Oo;
        ResultKt.throwOnFailure(objOooO0Oo);
        o0000O0.OooO0OO("cut up video cost time :" + (System.currentTimeMillis() - j));
        return new o00O((FFmpegCmdResult) objOooO0Oo, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o0(@NotNull ArrayList<MediaVideoItemModel> arrayList, @NotNull String str, @NotNull Continuation<? super o00O> continuation) {
        OooO00o oooO00o;
        String absolutePath;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f47813OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f47813OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f47812OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f47813OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            for (MediaVideoItemModel mediaVideoItemModel : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                MediaVideoItemModel mediaVideoItemModel2 = mediaVideoItemModel;
                o0000O0.OooO0OO("current item: " + i3 + "  " + mediaVideoItemModel2);
                sb.append("file '" + mediaVideoItemModel2.getFilePath() + "'\n");
                i3 = i4;
            }
            o0000O0.OooO0OO("mergeVideoFilePath:  " + str);
            o0000O0.OooO0OO("mergeText:  " + ((Object) sb));
            Lazy lazy = o00O0OO0.f47783OooO00o;
            String text = sb.toString();
            Intrinsics.checkNotNullExpressionValue(text, "toString(...)");
            Intrinsics.checkNotNullParameter(text, "text");
            File file = new File(o00O0OO0.OooO0OO(), "mergeVideo.txt");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bytes = text.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                oo0o0O0.OooO00o("_FileUtils", "create mergeVideo.txt success");
                absolutePath = file.getAbsolutePath();
            } catch (Exception e) {
                e.printStackTrace();
                oo0o0O0.OooO00o("_FileUtils", "create mergeVideo.txt error");
                absolutePath = null;
            }
            if (TextUtils.isEmpty(absolutePath)) {
                return new o00O(FFmpegCmdResult.Failure, null);
            }
            CmdList cmdList = new CmdList();
            cmdList.OooO0O0("ffmpeg -f concat -safe 0 -i " + absolutePath + " -c copy " + str);
            StringBuilder sb2 = new StringBuilder("merge command:  ");
            sb2.append(cmdList);
            sb2.append("  ");
            o0000O0.OooO0OO(sb2.toString());
            Intrinsics.checkNotNull(cmdList);
            oooO00o.f47810OooO0Oo = str;
            oooO00o.f47813OooO0oO = 1;
            objOooO0Oo = OooO0Oo(cmdList, 0L, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oooO00o.f47810OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        return new o00O((FFmpegCmdResult) objOooO0Oo, str);
    }
}
