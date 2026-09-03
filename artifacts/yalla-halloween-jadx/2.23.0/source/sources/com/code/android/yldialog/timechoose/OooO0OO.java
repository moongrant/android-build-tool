package com.code.android.yldialog.timechoose;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.easydialog.OooO;
import com.code.android.easydialog.WindowAnim;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
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
import p003OooO0o0.o0O0O00;
import p159o00OoOOo.oo0o0Oo;
import p161o00OoOo0.o00000;
import p161o00OoOo0.o000000O;
import p161o00OoOo0.o00000O0;
import p161o00OoOo0.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDayHourMinuteChooseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayHourMinuteChooseDialog.kt\ncom/code/android/yldialog/timechoose/DayHourMinuteChooseDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,329:1\n23#2:330\n1864#3,3:331\n*S KotlinDebug\n*F\n+ 1 DayHourMinuteChooseDialog.kt\ncom/code/android/yldialog/timechoose/DayHourMinuteChooseDialog\n*L\n34#1:330\n147#1:331,3\n*E\n"})
public final class OooO0OO extends OooO<OooO0OO> implements DateScrollView.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f10479OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f10480OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final String f10481OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f10482OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f10483OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f10484OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final int[] f10485OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f10486OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f10487OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList<o00000O0> f10488OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final int[] f10489OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Function1<? super Long, Unit> f10490OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(@NotNull AppCompatActivity activity, @NotNull String cancelString, @NotNull String confirmString, @NotNull ArrayList monthList, @NotNull String todayString, boolean z) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cancelString, "cancelString");
        Intrinsics.checkNotNullParameter(confirmString, "confirmString");
        Intrinsics.checkNotNullParameter("", "titleString");
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        Intrinsics.checkNotNullParameter(todayString, "todayString");
        this.f10480OooO0oO = monthList;
        this.f10481OooO0oo = todayString;
        this.f10479OooO = z;
        this.f10482OooOO0 = new o000O0Oo(Reflection.getOrCreateKotlinClass(oo0o0Oo.class), this.f10133OooO00o, new o00000(this));
        this.f10484OooOO0o = LongCompanionObject.MAX_VALUE;
        this.f10485OooOOO = new int[6];
        this.f10487OooOOOO = 3600000;
        this.f10488OooOOOo = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.f10489OooOOo = new int[]{calendar.get(1), calendar.get(2), calendar.get(5)};
        OooO0oo();
        OooOO0O(WindowAnim.BottomWithAlpha);
        OooOOO().f38497OooO0oO.setText("");
        OooOOO().f38492OooO0O0.setText(cancelString);
        OooOOO().f38493OooO0OO.setText(confirmString);
        ConstraintLayout constraintLayout = OooOOO().f38491OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.root");
        this.f10486OooOOO0 = o000OO00.OooO0Oo(constraintLayout);
        OooOOO().f38492OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o00OoOo0.o000000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooO0OO this$0 = this.f38502OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
            }
        });
        OooOOO().f38493OooO0OO.setOnClickListener(new o000000O(this, 0));
        OooOOO().f38494OooO0Oo.setOnItemSelectListener(this);
        OooOOO().f38496OooO0o0.setOnItemSelectListener(this);
        OooOOO().f38495OooO0o.setOnItemSelectListener(this);
    }

    @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
    @NotNull
    public final String OooO00o(int i, int i2) {
        if (i2 != 2) {
            String strValueOf = String.valueOf(i);
            return strValueOf.length() <= 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf) : strValueOf;
        }
        o00000O0 o00000o1 = this.f10488OooOOOo.get(i);
        Intrinsics.checkNotNullExpressionValue(o00000o1, "mYearMonthDayList[date]");
        o00000O0 o00000o2 = o00000o1;
        int[] iArr = this.f10489OooOOo;
        int i3 = iArr[0];
        int i4 = o00000o2.f38505OooO00o;
        int i5 = o00000o2.f38507OooO0OO;
        int i6 = o00000o2.f38506OooO0O0;
        if (i3 == i4 && iArr[1] == i6 && iArr[2] == i5) {
            return this.f10481OooO0oo;
        }
        ArrayList<String> monthList = this.f10480OooO0oO;
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        if (this.f10486OooOOO0) {
            return ((Object) monthList.get(i6)) + ZegoConstants.ZegoVideoDataAuxPublishingStream + i5;
        }
        return i5 + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) monthList.get(i6));
    }

    @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
    public final void OooO0O0(int i, int i2, int i3) {
        int[] iArr = this.f10485OooOOO;
        if (i3 == 2) {
            ArrayList<o00000O0> arrayList = this.f10488OooOOOo;
            iArr[0] = arrayList.get(i2).f38505OooO00o;
            iArr[1] = arrayList.get(i2).f38506OooO0O0;
            iArr[2] = arrayList.get(i2).f38507OooO0OO;
        } else if (i3 == 3) {
            iArr[3] = i;
        } else if (i3 == 4) {
            iArr[4] = i;
        }
        if (!this.f10479OooO) {
            Lazy lazy = o000OOo.f38508OooO00o;
            long j = 1000;
            long jOooO0O0 = o000OOo.OooO0O0(iArr) / j;
            long j2 = this.f10483OooOO0O;
            if (jOooO0O0 - (j2 / j) < 0) {
                int[] iArrOooO00o = o000OOo.OooO00o(j2);
                OooOOO0(iArrOooO00o[2], iArrOooO00o[3], iArrOooO00o[4]);
                return;
            }
            long j3 = this.f10484OooOO0o;
            if (jOooO0O0 - (j3 / j) > 0) {
                int[] iArrOooO00o2 = o000OOo.OooO00o(j3);
                OooOOO0(iArrOooO00o2[2], iArrOooO00o2[3], iArrOooO00o2[4]);
                return;
            }
            return;
        }
        Lazy lazy2 = o000OOo.f38508OooO00o;
        long jOooO0O1 = o000OOo.OooO0O0(iArr);
        long j4 = this.f10483OooOO0O;
        long j5 = (jOooO0O1 - j4) / ((long) 1000);
        int i4 = this.f10487OooOOOO;
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

    public final oo0o0Oo OooOOO() {
        return (oo0o0Oo) this.f10482OooOO0.getValue();
    }

    public final void OooOOO0(int i, int i2, int i3) {
        ArrayList<o00000O0> arrayList = this.f10488OooOOOo;
        Iterator<o00000O0> it = arrayList.iterator();
        int i4 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            int[] iArr = this.f10485OooOOO;
            if (!zHasNext) {
                OooOOO().f38496OooO0o0.OooO0o0(i2);
                iArr[3] = i2;
                OooOOO().f38495OooO0o.OooO0o0(i3 / 5);
                iArr[4] = i3;
                return;
            }
            o00000O0 next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (next.f38507OooO0OO == i) {
                OooOOO().f38494OooO0Oo.OooO0o0(i4);
                iArr[0] = arrayList.get(i4).f38505OooO00o;
                iArr[1] = arrayList.get(i4).f38506OooO0O0;
                iArr[2] = arrayList.get(i4).f38507OooO0OO;
            }
            i4 = i5;
        }
    }

    public final void OooOOOO() {
        ArrayList arrayList = new ArrayList(24);
        for (int iOooO00o = 0; iOooO00o < 24; iOooO00o = o0O0O00.OooO00o(iOooO00o, arrayList, iOooO00o, 1)) {
        }
        DateScrollView dateScrollView = OooOOO().f38496OooO0o0;
        Intrinsics.checkNotNullExpressionValue(dateScrollView, "mBinding.dateHour");
        DateScrollView.OooO0Oo(dateScrollView, arrayList);
    }

    public final void OooOOOo() {
        ArrayList arrayList = new ArrayList(12);
        for (int i = 0; i < 12; i++) {
            arrayList.add(Integer.valueOf(i * 5));
        }
        DateScrollView dateScrollView = OooOOO().f38495OooO0o;
        Intrinsics.checkNotNullExpressionValue(dateScrollView, "mBinding.dateMin");
        DateScrollView.OooO0Oo(dateScrollView, arrayList);
    }

    public final void OooOOo0(@NotNull Calendar calendar, @Nullable Calendar calendar2) {
        int i;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        ArrayList<o00000O0> arrayList = this.f10488OooOOOo;
        boolean z = this.f10479OooO;
        int[] iArr = this.f10485OooOOO;
        int i2 = 6;
        int i3 = 2;
        int i4 = 1;
        if (z) {
            Calendar calendar3 = Calendar.getInstance();
            this.f10483OooOO0O = calendar3.getTimeInMillis();
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
                arrayList.add(new o00000O0(calendar3.get(i4), calendar3.get(i3), calendar3.get(5)));
                arrayList2.add(Integer.valueOf(i6));
                i6++;
                i3 = 2;
                i4 = 1;
            }
            DateScrollView dateScrollView = OooOOO().f38494OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(dateScrollView, "mBinding.dateDay");
            DateScrollView.OooO0Oo(dateScrollView, arrayList2);
            OooOOOO();
            OooOOOo();
        } else {
            if (calendar2 != null) {
                Lazy lazy = o000OOo.f38508OooO00o;
                long timeInMillis = calendar2.getTimeInMillis();
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTimeInMillis(timeInMillis);
                calendar4.add(11, 0);
                calendar4.add(12, 5);
                this.f10483OooOO0O = calendar4.getTimeInMillis();
                long timeInMillis2 = calendar2.getTimeInMillis();
                Calendar calendar5 = Calendar.getInstance();
                calendar5.setTimeInMillis(timeInMillis2);
                calendar5.add(11, 24);
                calendar5.add(12, 0);
                this.f10484OooOO0o = calendar5.getTimeInMillis();
            }
            ArrayList arrayList3 = new ArrayList();
            Lazy lazy2 = o000OOo.f38508OooO00o;
            long j = this.f10483OooOO0O;
            Calendar calendar6 = Calendar.getInstance();
            calendar6.setTimeInMillis(j);
            Pair pair = new Pair(calendar6, new int[]{calendar6.get(1), calendar6.get(2), calendar6.get(5), calendar6.get(11), calendar6.get(12), calendar6.get(13)});
            int i7 = ((int[]) pair.getSecond())[3];
            int i8 = ((int[]) pair.getSecond())[4];
            if (i7 == 0 && i8 == 0) {
                arrayList.add(new o00000O0(((Calendar) pair.getFirst()).get(1), ((Calendar) pair.getFirst()).get(2), ((Calendar) pair.getFirst()).get(5)));
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
                    arrayList.add(new o00000O0(((Calendar) pair.getFirst()).get(i), ((Calendar) pair.getFirst()).get(2), ((Calendar) pair.getFirst()).get(5)));
                    arrayList3.add(Integer.valueOf(i10));
                    i10++;
                    i9++;
                    i2 = 6;
                }
            }
            DateScrollView dateScrollView2 = OooOOO().f38494OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(dateScrollView2, "mBinding.dateDay");
            DateScrollView.OooO0Oo(dateScrollView2, arrayList3);
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
