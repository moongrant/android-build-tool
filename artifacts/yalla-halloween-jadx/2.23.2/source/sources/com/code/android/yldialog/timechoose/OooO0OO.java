package com.code.android.yldialog.timechoose;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.o00O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.easydialog.WindowAnim;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.code.android.yldialog.timechoose.OooO0OO;
import com.facebook.appevents.AppEventsConstants;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p185o00o00Oo.o0000oo;
import p206o00o0oO.o0O0o;
import p208o00o0oOO.o0O000o0;
import p208o00o0oOO.o0O00O;
import p208o00o0oOO.o0O00O0o;
import p208o00o0oOO.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDayHourMinuteChooseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayHourMinuteChooseDialog.kt\ncom/code/android/yldialog/timechoose/DayHourMinuteChooseDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,329:1\n23#2:330\n1864#3,3:331\n*S KotlinDebug\n*F\n+ 1 DayHourMinuteChooseDialog.kt\ncom/code/android/yldialog/timechoose/DayHourMinuteChooseDialog\n*L\n34#1:330\n147#1:331,3\n*E\n"})
public final class OooO0OO extends o0000oo<OooO0OO> implements DateScrollView.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f13540OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f13541OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final String f13542OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o000O0 f13543OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f13544OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f13545OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final int[] f13546OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f13547OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f13548OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList<o0O00O> f13549OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final int[] f13550OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Function1<? super Long, Unit> f13551OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(@NotNull AppCompatActivity activity, @NotNull String cancelString, @NotNull String confirmString, @NotNull ArrayList monthList, @NotNull String todayString, boolean z) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cancelString, "cancelString");
        Intrinsics.checkNotNullParameter(confirmString, "confirmString");
        Intrinsics.checkNotNullParameter("", "titleString");
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        Intrinsics.checkNotNullParameter(todayString, "todayString");
        this.f13541OooO0oO = monthList;
        this.f13542OooO0oo = todayString;
        this.f13540OooO = z;
        this.f13543OooOO0 = new o000O0(Reflection.getOrCreateKotlinClass(o0O0o.class), this.f38487OooO00o, new o0O00O0o(this));
        this.f13545OooOO0o = LongCompanionObject.MAX_VALUE;
        this.f13546OooOOO = new int[6];
        this.f13548OooOOOO = 3600000;
        this.f13549OooOOOo = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.f13550OooOOo = new int[]{calendar.get(1), calendar.get(2), calendar.get(5)};
        OooO0oo();
        OooOO0O(WindowAnim.BottomWithAlpha);
        OooOOO().f39401OooO0oO.setText("");
        OooOOO().f39396OooO0O0.setText(cancelString);
        OooOOO().f39397OooO0OO.setText(confirmString);
        ConstraintLayout constraintLayout = OooOOO().f39395OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.f13547OooOOO0 = o000O.OooO0Oo(constraintLayout);
        OooOOO().f39396OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o00o0oOO.o0O00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooO0OO this$0 = this.f39629OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
            }
        });
        OooOOO().f39397OooO0OO.setOnClickListener(new o0OoO00O(this, 0));
        OooOOO().f39398OooO0Oo.setOnItemSelectListener(this);
        OooOOO().f39400OooO0o0.setOnItemSelectListener(this);
        OooOOO().f39399OooO0o.setOnItemSelectListener(this);
    }

    @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
    @NotNull
    public final String OooO00o(int i, int i2) {
        if (i2 != 2) {
            String strValueOf = String.valueOf(i);
            return strValueOf.length() <= 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf) : strValueOf;
        }
        o0O00O o0o00o2 = this.f13549OooOOOo.get(i);
        Intrinsics.checkNotNullExpressionValue(o0o00o2, "get(...)");
        o0O00O o0o00o3 = o0o00o2;
        int[] iArr = this.f13550OooOOo;
        int i3 = iArr[0];
        int i4 = o0o00o3.f39635OooO00o;
        int i5 = o0o00o3.f39637OooO0OO;
        int i6 = o0o00o3.f39636OooO0O0;
        if (i3 == i4 && iArr[1] == i6 && iArr[2] == i5) {
            return this.f13542OooO0oo;
        }
        ArrayList<String> monthList = this.f13541OooO0oO;
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        if (this.f13547OooOOO0) {
            return ((Object) monthList.get(i6)) + ZegoConstants.ZegoVideoDataAuxPublishingStream + i5;
        }
        return i5 + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) monthList.get(i6));
    }

    @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
    public final void OooO0O0(int i, int i2, int i3) {
        int[] iArr = this.f13546OooOOO;
        if (i3 == 2) {
            ArrayList<o0O00O> arrayList = this.f13549OooOOOo;
            iArr[0] = arrayList.get(i2).f39635OooO00o;
            iArr[1] = arrayList.get(i2).f39636OooO0O0;
            iArr[2] = arrayList.get(i2).f39637OooO0OO;
        } else if (i3 == 3) {
            iArr[3] = i;
        } else if (i3 == 4) {
            iArr[4] = i;
        }
        if (!this.f13540OooO) {
            Lazy lazy = o0O000o0.f39631OooO00o;
            long j = 1000;
            long jOooO0O0 = o0O000o0.OooO0O0(iArr) / j;
            long j2 = this.f13544OooOO0O;
            if (jOooO0O0 - (j2 / j) < 0) {
                int[] iArrOooO00o = o0O000o0.OooO00o(j2);
                OooOOO0(iArrOooO00o[2], iArrOooO00o[3], iArrOooO00o[4]);
                return;
            }
            long j3 = this.f13545OooOO0o;
            if (jOooO0O0 - (j3 / j) > 0) {
                int[] iArrOooO00o2 = o0O000o0.OooO00o(j3);
                OooOOO0(iArrOooO00o2[2], iArrOooO00o2[3], iArrOooO00o2[4]);
                return;
            }
            return;
        }
        Lazy lazy2 = o0O000o0.f39631OooO00o;
        long jOooO0O1 = o0O000o0.OooO0O0(iArr);
        long j4 = this.f13544OooOO0O;
        long j5 = (jOooO0O1 - j4) / ((long) 1000);
        int i4 = this.f13548OooOOOO;
        if (j5 <= i4 / 1000) {
            long j6 = j4 + ((long) i4);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j6);
            calendar.add(12, 5 - (calendar.get(12) % 5));
            calendar.set(13, 0);
            int[] iArr2 = new int[3];
            for (int i5 = 0; i5 < 3; i5++) {
                iArr2[i5] = 0;
            }
            iArr2[0] = calendar.get(5);
            iArr2[1] = calendar.get(11);
            int i6 = calendar.get(12);
            iArr2[2] = i6;
            OooOOO0(iArr2[0], iArr2[1], i6);
        }
    }

    public final o0O0o OooOOO() {
        return (o0O0o) this.f13543OooOO0.getValue();
    }

    public final void OooOOO0(int i, int i2, int i3) {
        ArrayList<o0O00O> arrayList = this.f13549OooOOOo;
        Iterator<o0O00O> it = arrayList.iterator();
        int i4 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            int[] iArr = this.f13546OooOOO;
            if (!zHasNext) {
                OooOOO().f39400OooO0o0.OooO0o0(i2);
                iArr[3] = i2;
                OooOOO().f39399OooO0o.OooO0o0(i3 / 5);
                iArr[4] = i3;
                return;
            }
            o0O00O next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (next.f39637OooO0OO == i) {
                OooOOO().f39398OooO0Oo.OooO0o0(i4);
                iArr[0] = arrayList.get(i4).f39635OooO00o;
                iArr[1] = arrayList.get(i4).f39636OooO0O0;
                iArr[2] = arrayList.get(i4).f39637OooO0OO;
            }
            i4 = i5;
        }
    }

    public final void OooOOOO() {
        ArrayList arrayList = new ArrayList(24);
        for (int iOooO00o = 0; iOooO00o < 24; iOooO00o = o00O.OooO00o(iOooO00o, arrayList, iOooO00o, 1)) {
        }
        DateScrollView dateHour = OooOOO().f39400OooO0o0;
        Intrinsics.checkNotNullExpressionValue(dateHour, "dateHour");
        DateScrollView.OooO0Oo(dateHour, arrayList);
    }

    public final void OooOOOo() {
        ArrayList arrayList = new ArrayList(12);
        for (int i = 0; i < 12; i++) {
            arrayList.add(Integer.valueOf(i * 5));
        }
        DateScrollView dateMin = OooOOO().f39399OooO0o;
        Intrinsics.checkNotNullExpressionValue(dateMin, "dateMin");
        DateScrollView.OooO0Oo(dateMin, arrayList);
    }

    public final void OooOOo0(@NotNull Calendar calendar, @Nullable Calendar calendar2) {
        int i;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        ArrayList<o0O00O> arrayList = this.f13549OooOOOo;
        boolean z = this.f13540OooO;
        int[] iArr = this.f13546OooOOO;
        int i2 = 6;
        int i3 = 2;
        int i4 = 1;
        if (z) {
            Calendar calendar3 = Calendar.getInstance();
            this.f13544OooOO0O = calendar3.getTimeInMillis();
            ArrayList arrayList2 = new ArrayList();
            int i5 = iArr[3];
            if (i5 > 22 || (i5 == 22 && iArr[4] >= 55)) {
                calendar3.add(6, 1);
            }
            int i6 = 0;
            while (i6 < 7) {
                if (i6 != 0) {
                    calendar3.add(6, i4);
                }
                arrayList.add(new o0O00O(calendar3.get(i4), calendar3.get(i3), calendar3.get(5)));
                arrayList2.add(Integer.valueOf(i6));
                i6++;
                i3 = 2;
                i4 = 1;
            }
            DateScrollView dateDay = OooOOO().f39398OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(dateDay, "dateDay");
            DateScrollView.OooO0Oo(dateDay, arrayList2);
            OooOOOO();
            OooOOOo();
        } else {
            if (calendar2 != null) {
                Lazy lazy = o0O000o0.f39631OooO00o;
                long timeInMillis = calendar2.getTimeInMillis();
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTimeInMillis(timeInMillis);
                calendar4.add(11, 0);
                calendar4.add(12, 5);
                this.f13544OooOO0O = calendar4.getTimeInMillis();
                long timeInMillis2 = calendar2.getTimeInMillis();
                Calendar calendar5 = Calendar.getInstance();
                calendar5.setTimeInMillis(timeInMillis2);
                calendar5.add(11, 24);
                calendar5.add(12, 0);
                this.f13545OooOO0o = calendar5.getTimeInMillis();
            }
            ArrayList arrayList3 = new ArrayList();
            Lazy lazy2 = o0O000o0.f39631OooO00o;
            long j = this.f13544OooOO0O;
            Calendar calendar6 = Calendar.getInstance();
            calendar6.setTimeInMillis(j);
            Pair pair = new Pair(calendar6, new int[]{calendar6.get(1), calendar6.get(2), calendar6.get(5), calendar6.get(11), calendar6.get(12), calendar6.get(13)});
            int i7 = ((int[]) pair.getSecond())[3];
            int i8 = ((int[]) pair.getSecond())[4];
            if (i7 == 0 && i8 == 0) {
                arrayList.add(new o0O00O(((Calendar) pair.getFirst()).get(1), ((Calendar) pair.getFirst()).get(2), ((Calendar) pair.getFirst()).get(5)));
                arrayList3.add(0);
            } else {
                int i9 = 0;
                int i10 = 0;
                while (i9 < 2) {
                    if (i10 != 0) {
                        i = 1;
                        ((Calendar) pair.getFirst()).add(i2, 1);
                    } else {
                        i = 1;
                    }
                    arrayList.add(new o0O00O(((Calendar) pair.getFirst()).get(i), ((Calendar) pair.getFirst()).get(2), ((Calendar) pair.getFirst()).get(5)));
                    arrayList3.add(Integer.valueOf(i10));
                    i10++;
                    i9++;
                    i2 = 6;
                }
            }
            DateScrollView dateDay2 = OooOOO().f39398OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(dateDay2, "dateDay");
            DateScrollView.OooO0Oo(dateDay2, arrayList3);
            OooOOOO();
            OooOOOo();
        }
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        int i14 = calendar.get(11);
        int i15 = calendar.get(12);
        int i16 = calendar.get(13);
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        iArr[4] = i15;
        iArr[5] = i16;
        OooOOO0(i13, i14, i15);
    }
}
