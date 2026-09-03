package com.common.support.imagepicker.preview.component.image.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.RequiresPermission;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/common/support/imagepicker/preview/component/image/utils/PreviewVibrateUtil;", "", "()V", "Companion", "VibrateType", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PreviewVibrateUtil {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static Context mContext;

    @Nullable
    private static Vibrator vibrator;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final long[] lightShortVibrateTimings = {0, 50};

    @NotNull
    private static final long[] mediumShortVibrateTimings = {0, 75};

    @NotNull
    private static final long[] longVibrateTimings = {0, 100};

    @NotNull
    private static final long[] longQuickVibrateTimings = {0, 3200, 600, 3000, 1200, 3200, 600};

    @NotNull
    private static final long[] selectionChangedVibrateTimings = {0, 35};

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\fJ\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0019\u0010\u001b\u001a\u00020\u00142\u000e\b\u0004\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001dH\u0082\bJ&\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/common/support/imagepicker/preview/component/image/utils/PreviewVibrateUtil$Companion;", "", "()V", "lightShortVibrateTimings", "", "getLightShortVibrateTimings", "()[J", "longQuickVibrateTimings", "getLongQuickVibrateTimings", "longVibrateTimings", "getLongVibrateTimings", "mContext", "Landroid/content/Context;", "mediumShortVibrateTimings", "getMediumShortVibrateTimings", "selectionChangedVibrateTimings", "getSelectionChangedVibrateTimings", "vibrator", "Landroid/os/Vibrator;", "cancel", "", "getVibrator", "init", "context", "quickVibrate", "type", "Lcom/common/support/imagepicker/preview/component/image/utils/PreviewVibrateUtil$VibrateType;", "runInCoroutine", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "vibrate", "timings", "repeat", "", "audioAttributes", "Landroid/media/AudioAttributes;", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VibrateType.values().length];
                iArr[VibrateType.LIGHT_SHORT.ordinal()] = 1;
                iArr[VibrateType.MEDIUM_SHORT.ordinal()] = 2;
                iArr[VibrateType.LONG.ordinal()] = 3;
                iArr[VibrateType.LONG_QUICK.ordinal()] = 4;
                iArr[VibrateType.SELECTION_CHANGED.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Vibrator getVibrator() {
            if (PreviewVibrateUtil.vibrator == null) {
                Context context = PreviewVibrateUtil.mContext;
                Object systemService = context != null ? context.getSystemService("vibrator") : null;
                PreviewVibrateUtil.vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            }
            return PreviewVibrateUtil.vibrator;
        }

        private final void runInCoroutine(Function0<Unit> block) {
            if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new PreviewVibrateUtil$Companion$runInCoroutine$1(block, null), 2, null);
            } else {
                block.invoke();
            }
        }

        public static /* synthetic */ void vibrate$default(Companion companion, long[] jArr, int i, AudioAttributes audioAttributes, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            if ((i2 & 4) != 0) {
                audioAttributes = null;
            }
            companion.vibrate(jArr, i, audioAttributes);
        }

        @RequiresPermission("android.permission.VIBRATE")
        public final void cancel() {
            Vibrator vibrator = PreviewVibrateUtil.vibrator;
            if (vibrator != null) {
                vibrator.cancel();
            }
            PreviewVibrateUtil.vibrator = null;
        }

        @NotNull
        public final long[] getLightShortVibrateTimings() {
            return PreviewVibrateUtil.lightShortVibrateTimings;
        }

        @NotNull
        public final long[] getLongQuickVibrateTimings() {
            return PreviewVibrateUtil.longQuickVibrateTimings;
        }

        @NotNull
        public final long[] getLongVibrateTimings() {
            return PreviewVibrateUtil.longVibrateTimings;
        }

        @NotNull
        public final long[] getMediumShortVibrateTimings() {
            return PreviewVibrateUtil.mediumShortVibrateTimings;
        }

        @NotNull
        public final long[] getSelectionChangedVibrateTimings() {
            return PreviewVibrateUtil.selectionChangedVibrateTimings;
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PreviewVibrateUtil.mContext = context.getApplicationContext();
        }

        @JvmStatic
        @RequiresPermission("android.permission.VIBRATE")
        public final void quickVibrate(@NotNull VibrateType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                vibrate$default(this, getLightShortVibrateTimings(), 0, null, 6, null);
                return;
            }
            if (i == 2) {
                vibrate$default(this, getMediumShortVibrateTimings(), 0, null, 6, null);
                return;
            }
            if (i == 3) {
                vibrate$default(this, getLongVibrateTimings(), 0, null, 6, null);
                return;
            }
            if (i == 4) {
                vibrate(getLongQuickVibrateTimings(), 0, new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
            } else {
                if (i != 5) {
                    return;
                }
                vibrate$default(this, getSelectionChangedVibrateTimings(), 0, null, 6, null);
            }
        }

        @RequiresPermission("android.permission.VIBRATE")
        public final void vibrate(@NotNull long[] timings, int repeat, @Nullable AudioAttributes audioAttributes) {
            Intrinsics.checkNotNullParameter(timings, "timings");
            if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new PreviewVibrateUtil$Companion$vibrate$$inlined$runInCoroutine$1(null, timings, repeat, audioAttributes), 2, null);
                return;
            }
            PreviewVibrateUtil.vibrator = PreviewVibrateUtil.INSTANCE.getVibrator();
            if (Build.VERSION.SDK_INT < 26) {
                Vibrator vibrator = PreviewVibrateUtil.vibrator;
                if (vibrator != null) {
                    vibrator.vibrate(timings, repeat, audioAttributes);
                    return;
                }
                return;
            }
            VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(timings, repeat);
            Vibrator vibrator2 = PreviewVibrateUtil.vibrator;
            if (vibrator2 != null) {
                vibrator2.vibrate(vibrationEffectCreateWaveform, audioAttributes);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/common/support/imagepicker/preview/component/image/utils/PreviewVibrateUtil$VibrateType;", "", "(Ljava/lang/String;I)V", "LIGHT_SHORT", "MEDIUM_SHORT", "LONG", "LONG_QUICK", "SELECTION_CHANGED", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum VibrateType {
        LIGHT_SHORT,
        MEDIUM_SHORT,
        LONG,
        LONG_QUICK,
        SELECTION_CHANGED
    }

    @JvmStatic
    @RequiresPermission("android.permission.VIBRATE")
    public static final void quickVibrate(@NotNull VibrateType vibrateType) {
        INSTANCE.quickVibrate(vibrateType);
    }
}
