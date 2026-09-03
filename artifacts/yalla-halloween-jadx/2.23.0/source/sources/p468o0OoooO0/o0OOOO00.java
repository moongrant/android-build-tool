package p468o0OoooO0;

import Jni.FFmpegCmd;
import VideoHandle.CmdList;
import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0000O;
import com.yalla.yalla.model.media.MediaVideoItemModel;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import java.io.File;
import java.io.FileOutputStream;
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
import p181o00o000o.oo000o;
import p453o0Ooo00o.o00Ooo;
import p455o0Ooo0O0.o0OO00O;
import p455o0Ooo0O0.o0OOO0o;
import p455o0Ooo0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFFmpegCmdUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FFmpegCmdUtils.kt\ncom/yalla/yalla/module/media/utils/FFmpegCmdUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,402:1\n1864#2,3:403\n37#3,2:406\n*S KotlinDebug\n*F\n+ 1 FFmpegCmdUtils.kt\ncom/yalla/yalla/module/media/utils/FFmpegCmdUtils\n*L\n219#1:403,3\n263#1:406,2\n*E\n"})
public final class o0OOOO00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static String f46931OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOOO00 f46930OooO00o = new o0OOOO00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableState<Float> f46932OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.module.media.utils.FFmpegCmdUtils", f = "FFmpegCmdUtils.kt", i = {0}, l = {235}, m = "mergeCurrentRecordingVideos2One", n = {"mergeVideoFilePath"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f46933OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f46935OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f46936OooO0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46935OooO0o0 = obj;
            this.f46936OooO0oO |= Integer.MIN_VALUE;
            return o0OOOO00.this.OooO0o0(null, null, this);
        }
    }

    static {
        new ArrayList();
    }

    public static Object OooO0Oo(CmdList cmdList, long j, ContinuationImpl continuationImpl) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuationImpl));
        MutableState<Float> mutableState = f46932OooO0OO;
        if (j > 0) {
            mutableState.setValue(Boxing.boxFloat(0.0f));
        } else {
            mutableState.setValue(null);
        }
        FFmpegCmd.exec((String[]) cmdList.toArray(new String[0]), j, new o0OOO0OO(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return orThrow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @Nullable String str2, long j, @Nullable String str3, float f, float f2, @NotNull o0OOO0o o0ooo0o2, @NotNull Continuation continuation) throws Throwable {
        o0OO o0oo;
        CmdList command;
        String str4;
        long j2;
        if (continuation instanceof o0OO) {
            o0oo = (o0OO) continuation;
            int i = o0oo.f46905OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo.f46905OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o0oo = new o0OO(this, continuation);
            }
        } else {
            o0oo = new o0OO(this, continuation);
        }
        Object objOooO0Oo = o0oo.f46902OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0oo.f46905OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return new o0OO0oO0(FFmpegCmdResult.Failure, null);
            }
            Intrinsics.checkNotNull(str2);
            if (!new File(str2).exists()) {
                return new o0OO0oO0(FFmpegCmdResult.Failure, null);
            }
            if (new File(str).exists()) {
                o0OO0O0.OooO00o("_VideoCompressUtil", "compressVideo file exit");
                new File(str).delete();
            }
            o0000O.OooO0Oo("videoFilePath : " + str2);
            o0000O.OooO0Oo("backgroundMusicFilePath : " + str3);
            LinkedHashMap<String, Object> linkedHashMapOooO0Oo = oo000o.OooO0Oo(str2);
            if (str3 == null || str3.length() == 0) {
                command = new CmdList();
                command.OooO0O0("ffmpeg -i");
                command.add(str2);
                Intrinsics.checkNotNullExpressionValue(command, "CmdList().appendStringBy….append(srcVideoFilePath)");
                o0000O.OooO0OO(command, linkedHashMapOooO0Oo);
                o0000O.OooO0O0(command, linkedHashMapOooO0Oo);
                command.OooO0O0("-movflags faststart -af volume=" + f);
                command.add(str);
            } else {
                CmdList cmdList = new CmdList();
                cmdList.OooO0O0("ffmpeg -i");
                cmdList.add(str2);
                cmdList.add("-i");
                cmdList.add(str3);
                Intrinsics.checkNotNullExpressionValue(cmdList, "CmdList().appendStringBy…(backgroundMusicFilePath)");
                o0000O.OooO0OO(cmdList, linkedHashMapOooO0Oo);
                o0000O.OooO0O0(cmdList, linkedHashMapOooO0Oo);
                cmdList.OooO0O0("-filter_complex [0:a]volume=" + f + "[a];[1:a]volume=" + f2 + "[b];[a][b]amix=inputs=2:duration=longest[out] -map 0:v -map [out] -movflags faststart -shortest");
                cmdList.add(str);
                command = cmdList;
            }
            o0000O.OooO0Oo("compressVideo : " + command);
            o0ooo0o2.invoke();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullExpressionValue(command, "command");
            long j3 = j > 0 ? ((long) 1000) * j : 0L;
            o0oo.f46901OooO0Oo = str;
            o0oo.f46903OooO0o0 = jCurrentTimeMillis;
            o0oo.f46905OooO0oo = 1;
            objOooO0Oo = OooO0Oo(command, j3, o0oo);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            str4 = str;
            j2 = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = o0oo.f46903OooO0o0;
            str4 = o0oo.f46901OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        FFmpegCmdResult fFmpegCmdResult = (FFmpegCmdResult) objOooO0Oo;
        o0000O.OooO0Oo("compressVideo cost time :" + (System.currentTimeMillis() - j2) + "   " + fFmpegCmdResult);
        return new o0OO0oO0(fFmpegCmdResult, str4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0O0(@NotNull o00Ooo o00ooo2, @NotNull String str, @NotNull o0Oo0oo.OooO00o oooO00o, @NotNull Continuation continuation) {
        o0OOO00 o0ooo00;
        String str2;
        long j;
        if (continuation instanceof o0OOO00) {
            o0ooo00 = (o0OOO00) continuation;
            int i = o0ooo00.f46928OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0ooo00.f46928OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o0ooo00 = new o0OOO00(this, continuation);
            }
        } else {
            o0ooo00 = new o0OOO00(this, continuation);
        }
        Object obj = o0ooo00.f46925OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0ooo00.f46928OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!TextUtils.isEmpty(o00ooo2.f46491OooO00o) && !TextUtils.isEmpty(str)) {
                String str3 = o00ooo2.f46491OooO00o;
                if (new File(str3).exists()) {
                    if (new File(str).exists()) {
                        o0OO0O0.OooO00o("_VideoCompressUtil", "cut up video exit");
                        new File(str).delete();
                    }
                    oooO00o.invoke();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    CmdList command = new CmdList();
                    command.OooO0O0("ffmpeg -i");
                    command.add(str3);
                    float f = o00ooo2.f46493OooO0OO;
                    float f2 = o00ooo2.f46492OooO0O0;
                    command.OooO0O0("-vn -acodec aac -ss " + f2 + " -t " + (f - f2));
                    command.add(str);
                    StringBuilder sb = new StringBuilder("command:  ");
                    sb.append(command);
                    o0000O.OooO0Oo(sb.toString());
                    Intrinsics.checkNotNullExpressionValue(command, "command");
                    o0ooo00.f46924OooO0Oo = str;
                    o0ooo00.f46926OooO0o0 = jCurrentTimeMillis;
                    o0ooo00.f46928OooO0oo = 1;
                    Object objOooO0Oo = OooO0Oo(command, 0L, o0ooo00);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objOooO0Oo;
                    str2 = str;
                    j = jCurrentTimeMillis;
                }
            }
            return new o0OO0oO0(FFmpegCmdResult.Failure, null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = o0ooo00.f46926OooO0o0;
        str2 = o0ooo00.f46924OooO0Oo;
        ResultKt.throwOnFailure(obj);
        FFmpegCmdResult fFmpegCmdResult = (FFmpegCmdResult) obj;
        o0000O.OooO0Oo("cut up audio cost time :" + (System.currentTimeMillis() - j) + "   " + fFmpegCmdResult);
        return new o0OO0oO0(fFmpegCmdResult, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull o00Ooo o00ooo2, @NotNull String str, @NotNull o0OO00O.OooO00o oooO00o, @NotNull Continuation continuation) {
        o0OOO0 o0ooo1;
        String str2;
        long j;
        if (continuation instanceof o0OOO0) {
            o0ooo1 = (o0OOO0) continuation;
            int i = o0ooo1.f46923OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0ooo1.f46923OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o0ooo1 = new o0OOO0(this, continuation);
            }
        } else {
            o0ooo1 = new o0OOO0(this, continuation);
        }
        Object objOooO0Oo = o0ooo1.f46920OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0ooo1.f46923OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (!TextUtils.isEmpty(o00ooo2.f46491OooO00o) && !TextUtils.isEmpty(str)) {
                String str3 = o00ooo2.f46491OooO00o;
                if (new File(str3).exists()) {
                    if (new File(str).exists()) {
                        o0OO0O0.OooO00o("_VideoCompressUtil", "cut up video exit");
                        new File(str).delete();
                    }
                    LinkedHashMap<String, Object> linkedHashMapOooO0Oo = oo000o.OooO0Oo(str3);
                    CmdList command = new CmdList();
                    command.OooO0O0("ffmpeg -i");
                    command.add(str3);
                    Intrinsics.checkNotNullExpressionValue(command, "CmdList().appendStringBy…  .append(model.filePath)");
                    String str4 = f46931OooO0O0;
                    if (!(str4 == null || str4.length() == 0)) {
                        command.OooO0O0("-c:v h264_mediacodec -vf format=" + f46931OooO0O0);
                    }
                    o0000O.OooO0O0(command, linkedHashMapOooO0Oo);
                    float f = o00ooo2.f46493OooO0OO;
                    float f2 = o00ooo2.f46492OooO0O0;
                    float f3 = f - f2;
                    command.OooO0O0("-ss " + f2 + " -t " + f3);
                    command.add(str);
                    StringBuilder sb = new StringBuilder("videoCutCommand:  ");
                    sb.append(command);
                    o0000O.OooO0Oo(sb.toString());
                    oooO00o.invoke();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Intrinsics.checkNotNullExpressionValue(command, "command");
                    o0ooo1.f46919OooO0Oo = str;
                    o0ooo1.f46921OooO0o0 = jCurrentTimeMillis;
                    o0ooo1.f46923OooO0oo = 1;
                    objOooO0Oo = OooO0Oo(command, ((long) f3) * ((long) 1000), o0ooo1);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    j = jCurrentTimeMillis;
                }
            }
            return new o0OO0oO0(FFmpegCmdResult.Failure, null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = o0ooo1.f46921OooO0o0;
        str2 = o0ooo1.f46919OooO0Oo;
        ResultKt.throwOnFailure(objOooO0Oo);
        o0000O.OooO0Oo("cut up video cost time :" + (System.currentTimeMillis() - j));
        return new o0OO0oO0((FFmpegCmdResult) objOooO0Oo, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o0(@NotNull ArrayList<MediaVideoItemModel> arrayList, @NotNull String str, @NotNull Continuation<? super o0OO0oO0> continuation) throws Throwable {
        OooO00o oooO00o;
        String absolutePath;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f46936OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f46936OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f46935OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f46936OooO0oO;
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
                o0000O.OooO0Oo("current item: " + i3 + "  " + mediaVideoItemModel2);
                sb.append("file '" + mediaVideoItemModel2.getFilePath() + "'\n");
                i3 = i4;
            }
            o0000O.OooO0Oo("mergeVideoFilePath:  " + str);
            o0000O.OooO0Oo("mergeText:  " + ((Object) sb));
            Lazy lazy = o0OO0.f46906OooO00o;
            String text = sb.toString();
            Intrinsics.checkNotNullExpressionValue(text, "mergeText.toString()");
            Intrinsics.checkNotNullParameter(text, "text");
            File file = new File(o0OO0.OooO0OO(), "mergeVideo.txt");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bytes = text.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                o0OO0O0.OooO00o("_FileUtils", "create mergeVideo.txt success");
                absolutePath = file.getAbsolutePath();
            } catch (Exception e) {
                e.printStackTrace();
                o0OO0O0.OooO00o("_FileUtils", "create mergeVideo.txt error");
                absolutePath = null;
            }
            if (TextUtils.isEmpty(absolutePath)) {
                return new o0OO0oO0(FFmpegCmdResult.Failure, null);
            }
            CmdList command = new CmdList();
            command.OooO0O0("ffmpeg -f concat -safe 0 -i " + absolutePath + " -c copy " + str);
            StringBuilder sb2 = new StringBuilder("merge command:  ");
            sb2.append(command);
            sb2.append("  ");
            o0000O.OooO0Oo(sb2.toString());
            Intrinsics.checkNotNullExpressionValue(command, "command");
            oooO00o.f46933OooO0Oo = str;
            oooO00o.f46936OooO0oO = 1;
            objOooO0Oo = OooO0Oo(command, 0L, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oooO00o.f46933OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        return new o0OO0oO0((FFmpegCmdResult) objOooO0Oo, str);
    }
}
