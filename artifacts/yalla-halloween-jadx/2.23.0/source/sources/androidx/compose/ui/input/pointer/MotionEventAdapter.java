package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ(\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0010J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010(\u001a\u00020\u001f*\u00020\u00152\u0006\u0010!\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "()V", "canHover", "Landroid/util/SparseBooleanArray;", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "nextId", "", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "previousSource", "", "previousToolType", "addFreshIds", "", "motionEvent", "Landroid/view/MotionEvent;", "clearOnDeviceChange", "convertToPointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "convertToPointerInputEvent$ui_release", "createPointerInputEventData", "index", "pressed", "", "endStream", "pointerId", "getComposePointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "motionEventPointerId", "getComposePointerId-_I2yYro", "(I)J", "removeStaleIds", "hasPointerId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MotionEventAdapter {
    private long nextId;

    @NotNull
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    @NotNull
    private final SparseBooleanArray canHover = new SparseBooleanArray();

    @NotNull
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.canHover.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.canHover.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00db A[SYNTHETIC] */
    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int index, boolean pressed) {
        long j;
        long jMo2756localToScreenMKHz9U;
        long jM2621toRawOffsetdBAh8RU;
        long jMo2757screenToLocalMKHz9U;
        int toolType;
        int iM2755getUnknownT8wyACA;
        ArrayList arrayList;
        int historySize;
        int i;
        long jM1452getZeroF1C5BW0;
        float historicalX;
        float historicalY;
        boolean z;
        boolean z2;
        long jM2620getComposePointerId_I2yYro = m2620getComposePointerId_I2yYro(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        long jOffset = OffsetKt.Offset(motionEvent.getX(index), motionEvent.getY(index));
        if (index != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                jM2621toRawOffsetdBAh8RU = MotionEventHelper.INSTANCE.m2621toRawOffsetdBAh8RU(motionEvent, index);
                jMo2757screenToLocalMKHz9U = positionCalculator.mo2757screenToLocalMKHz9U(jM2621toRawOffsetdBAh8RU);
            } else {
                j = jOffset;
                jMo2756localToScreenMKHz9U = positionCalculator.mo2756localToScreenMKHz9U(jOffset);
            }
            toolType = motionEvent.getToolType(index);
            if (toolType != 0) {
                iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2755getUnknownT8wyACA();
            } else if (toolType != 1) {
                iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2754getTouchT8wyACA();
            } else if (toolType != 2) {
                iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2753getStylusT8wyACA();
            } else if (toolType != 3) {
                iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2752getMouseT8wyACA();
            } else if (toolType != 4) {
                iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2755getUnknownT8wyACA();
            } else {
                iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2751getEraserT8wyACA();
            }
            int i2 = iM2755getUnknownT8wyACA;
            arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            for (i = 0; i < historySize; i++) {
                historicalX = motionEvent.getHistoricalX(index, i);
                historicalY = motionEvent.getHistoricalY(index, i);
                if (!Float.isInfinite(historicalX) || Float.isNaN(historicalX)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (!Float.isInfinite(historicalY) || Float.isNaN(historicalY)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i), OffsetKt.Offset(historicalX, historicalY), null));
                    }
                }
            }
            if (motionEvent.getActionMasked() == 8) {
                jM1452getZeroF1C5BW0 = OffsetKt.Offset(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                jM1452getZeroF1C5BW0 = Offset.INSTANCE.m1452getZeroF1C5BW0();
            }
            long j2 = jM1452getZeroF1C5BW0;
            return new PointerInputEventData(jM2620getComposePointerId_I2yYro, motionEvent.getEventTime(), jMo2756localToScreenMKHz9U, j, pressed, pressure, i2, this.canHover.get(motionEvent.getPointerId(index), false), arrayList, j2, null);
        }
        jM2621toRawOffsetdBAh8RU = OffsetKt.Offset(motionEvent.getRawX(), motionEvent.getRawY());
        jMo2757screenToLocalMKHz9U = positionCalculator.mo2757screenToLocalMKHz9U(jM2621toRawOffsetdBAh8RU);
        jMo2756localToScreenMKHz9U = jM2621toRawOffsetdBAh8RU;
        j = jMo2757screenToLocalMKHz9U;
        toolType = motionEvent.getToolType(index);
        if (toolType != 0) {
            iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2755getUnknownT8wyACA();
        } else if (toolType != 1) {
            iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2754getTouchT8wyACA();
        } else if (toolType != 2) {
            iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2753getStylusT8wyACA();
        } else if (toolType != 3) {
            iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2752getMouseT8wyACA();
        } else if (toolType != 4) {
            iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2755getUnknownT8wyACA();
        } else {
            iM2755getUnknownT8wyACA = PointerType.INSTANCE.m2751getEraserT8wyACA();
        }
        int i3 = iM2755getUnknownT8wyACA;
        arrayList = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        while (i < historySize) {
            historicalX = motionEvent.getHistoricalX(index, i);
            historicalY = motionEvent.getHistoricalY(index, i);
            if (Float.isInfinite(historicalX)) {
                z = false;
            } else {
                z = false;
            }
            if (!z) {
                if (Float.isInfinite(historicalY)) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i), OffsetKt.Offset(historicalX, historicalY), null));
                }
            }
        }
        if (motionEvent.getActionMasked() == 8) {
            jM1452getZeroF1C5BW0 = OffsetKt.Offset(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
        } else {
            jM1452getZeroF1C5BW0 = Offset.INSTANCE.m1452getZeroF1C5BW0();
        }
        long j3 = jM1452getZeroF1C5BW0;
        return new PointerInputEventData(jM2620getComposePointerId_I2yYro, motionEvent.getEventTime(), jMo2756localToScreenMKHz9U, j, pressed, pressure, i3, this.canHover.get(motionEvent.getPointerId(index), false), arrayList, j3, null);
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m2620getComposePointerId_I2yYro(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return PointerId.m2670constructorimpl(jValueAt);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(iKeyAt);
                }
            }
        }
    }

    @Nullable
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@NotNull MotionEvent motionEvent, @NotNull PositionCalculator positionCalculator) {
        int actionIndex;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int pointerId) {
        this.canHover.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    @NotNull
    /* JADX INFO: renamed from: getMotionEventToComposePointerIdMap$ui_release, reason: from getter */
    public final SparseLongArray getMotionEventToComposePointerIdMap() {
        return this.motionEventToComposePointerIdMap;
    }
}
