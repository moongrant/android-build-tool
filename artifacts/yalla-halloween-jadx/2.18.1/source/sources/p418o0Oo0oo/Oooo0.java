package p418o0Oo0oo;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f39659OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final SparseLongArray f39660OooO0O0 = new SparseLongArray();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SparseBooleanArray f39661OooO0OO = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<o0O0O00> f39662OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f39664OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39663OooO0o = -1;

    /* JADX WARN: Code duplicated, block: B:100:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x016c  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x017d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0194  */
    /* JADX WARN: Code duplicated, block: B:93:0x0198  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a7  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList, java.util.List<o0Oo0oo.o0O0O00>] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList, java.util.List<o0Oo0oo.o0O0O00>] */
    @Nullable
    public final oo0o0Oo OooO00o(@NotNull MotionEvent motionEvent, @NotNull o0000oo positionCalculator) {
        int i;
        boolean z;
        long jValueAt;
        long j;
        long jOooOO0;
        long jOooO00o;
        long jOooOOOO;
        int toolType;
        int i2;
        ArrayList arrayList;
        int historySize;
        int i3;
        long jOooO00o2;
        float historicalX;
        float historicalY;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 3;
        if (actionMasked == 3) {
            this.f39660OooO0O0.clear();
            this.f39661OooO0OO.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f39664OooO0o0 || source != this.f39663OooO0o) {
                this.f39664OooO0o0 = toolType2;
                this.f39663OooO0o = source;
                this.f39661OooO0OO.clear();
                this.f39660OooO0O0.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j2 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f39660OooO0O0.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f39660OooO0O0;
                long j3 = this.f39659OooO00o;
                this.f39659OooO00o = 1 + j3;
                sparseLongArray.put(pointerId, j3);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f39661OooO0OO.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f39660OooO0O0.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f39660OooO0O0;
                long j4 = this.f39659OooO00o;
                this.f39659OooO00o = j4 + 1;
                sparseLongArray2.put(pointerId2, j4);
            }
        }
        boolean z4 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z5 = actionMasked == 8;
        if (z4) {
            i = 1;
            this.f39661OooO0OO.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i = 1;
        }
        int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f39662OooO0Oo.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i5 = 0;
        while (i5 < pointerCount) {
            ?? r13 = this.f39662OooO0Oo;
            boolean z6 = (z4 || i5 == actionIndex2 || (z5 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i5);
            int iIndexOfKey = this.f39660OooO0O0.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = this.f39660OooO0O0.valueAt(iIndexOfKey);
            } else {
                long j5 = this.f39659OooO00o;
                this.f39659OooO00o = j5 + j2;
                this.f39660OooO0O0.put(pointerId3, j5);
                jValueAt = j5;
            }
            long jOooO00o3 = OooOO0.OooO00o(motionEvent.getX(i5), motionEvent.getY(i5));
            if (i5 == 0) {
                jOooO00o = OooOO0.OooO00o(motionEvent.getRawX(), motionEvent.getRawY());
                jOooOOOO = positionCalculator.OooOOOO(jOooO00o);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jOooO00o = o000oOoO.f39721OooO00o.OooO00o(motionEvent, i5);
                    jOooOOOO = positionCalculator.OooOOOO(jOooO00o);
                } else {
                    j = jOooO00o3;
                    jOooOO0 = positionCalculator.OooOO0(jOooO00o3);
                }
                toolType = motionEvent.getToolType(i5);
                if (toolType == 0) {
                    i2 = 0;
                } else if (toolType != 1) {
                    i2 = 1;
                } else if (toolType != 2) {
                    i2 = 3;
                } else if (toolType != i4) {
                    i2 = 2;
                } else if (toolType != 4) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                arrayList = new ArrayList();
                historySize = motionEvent.getHistorySize();
                for (i3 = 0; i3 < historySize; i3++) {
                    historicalX = motionEvent.getHistoricalX(i5, i3);
                    historicalY = motionEvent.getHistoricalY(i5, i3);
                    if (!Float.isInfinite(historicalX) || Float.isNaN(historicalX)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        if (!Float.isInfinite(historicalY) || Float.isNaN(historicalY)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            arrayList.add(new OooOo00(motionEvent.getHistoricalEventTime(i3), OooOO0.OooO00o(historicalX, historicalY)));
                        }
                    }
                }
                if (motionEvent.getActionMasked() == 8) {
                    jOooO00o2 = OooOO0.OooO00o(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
                } else {
                    OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
                    jOooO00o2 = OooO.f30392OooO0OO;
                }
                r13.add(new o0O0O00(jValueAt, motionEvent.getEventTime(), jOooOO0, j, z6, i2, this.f39661OooO0OO.get(motionEvent.getPointerId(i5), false), arrayList, jOooO00o2, null));
                i5++;
                z4 = z4;
                z5 = z5;
                i4 = 3;
                j2 = 1;
            }
            jOooOO0 = jOooO00o;
            j = jOooOOOO;
            toolType = motionEvent.getToolType(i5);
            if (toolType == 0) {
                i2 = 0;
            } else if (toolType != 1) {
                i2 = 1;
            } else if (toolType != 2) {
                i2 = 3;
            } else if (toolType != i4) {
                i2 = 2;
            } else if (toolType != 4) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            arrayList = new ArrayList();
            historySize = motionEvent.getHistorySize();
            while (i3 < historySize) {
                historicalX = motionEvent.getHistoricalX(i5, i3);
                historicalY = motionEvent.getHistoricalY(i5, i3);
                if (Float.isInfinite(historicalX)) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (Float.isInfinite(historicalY)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        arrayList.add(new OooOo00(motionEvent.getHistoricalEventTime(i3), OooOO0.OooO00o(historicalX, historicalY)));
                    }
                }
            }
            if (motionEvent.getActionMasked() == 8) {
                jOooO00o2 = OooOO0.OooO00o(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
            } else {
                OooO.OooO00o oooO00o2 = OooO.f30391OooO0O0;
                jOooO00o2 = OooO.f30392OooO0OO;
            }
            r13.add(new o0O0O00(jValueAt, motionEvent.getEventTime(), jOooOO0, j, z6, i2, this.f39661OooO0OO.get(motionEvent.getPointerId(i5), false), arrayList, jOooO00o2, null));
            i5++;
            z4 = z4;
            z5 = z5;
            i4 = 3;
            j2 = 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f39661OooO0OO.get(pointerId4, false)) {
                this.f39660OooO0O0.delete(pointerId4);
                this.f39661OooO0OO.delete(pointerId4);
            }
        }
        if (this.f39660OooO0O0.size() > motionEvent.getPointerCount()) {
            for (int size = this.f39660OooO0O0.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f39660OooO0O0.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= pointerCount2) {
                        z = false;
                        break;
                    }
                    if (motionEvent.getPointerId(i6) == iKeyAt) {
                        z = true;
                        break;
                    }
                    i6++;
                }
                if (!z) {
                    this.f39660OooO0O0.removeAt(size);
                    this.f39661OooO0OO.delete(iKeyAt);
                }
            }
        }
        motionEvent.getEventTime();
        return new oo0o0Oo(this.f39662OooO0Oo, motionEvent);
    }
}
