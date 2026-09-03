package p258o00ooOOo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.easydialog.WindowAnim;
import com.code.android.yldialog.timechoose.DateScrollView;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p250o00oo0oO.o000O000;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p256o00ooOO.o00Oo00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class j extends o000O000<j> implements DateScrollView.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f34645OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f34646OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final String f34647OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f34648OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f34649OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f34650OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public int[] f34651OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f34652OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f34653OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList<k> f34654OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final int[] f34655OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Function1<? super Long, Unit> f34656OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull AppCompatActivity activity, @NotNull String cancelString, @NotNull String confirmString, @NotNull ArrayList monthList, @NotNull String todayString, boolean z) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cancelString, "cancelString");
        Intrinsics.checkNotNullParameter(confirmString, "confirmString");
        Intrinsics.checkNotNullParameter("", "titleString");
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        Intrinsics.checkNotNullParameter(todayString, "todayString");
        this.f34646OooO0oO = monthList;
        this.f34647OooO0oo = todayString;
        this.f34645OooO = z;
        this.f34648OooOO0 = new o00O000o(Reflection.getOrCreateKotlinClass(o00Oo00.class), this.f34199OooO00o, new i(this));
        this.f34650OooOO0o = Long.MAX_VALUE;
        this.f34651OooOOO = new int[6];
        this.f34653OooOOOO = 3600000;
        this.f34654OooOOOo = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        this.f34655OooOOo = new int[]{calendar.get(1), calendar.get(2), calendar.get(5)};
        OooO();
        OooOO0o(WindowAnim.BottomWithAlpha);
        OooOOOO().f34393OooO0oO.setText("");
        OooOOOO().f34388OooO0O0.setText(cancelString);
        OooOOOO().f34389OooO0OO.setText(confirmString);
        ConstraintLayout constraintLayout = OooOOOO().f34387OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.root");
        this.f34652OooOOO0 = oOO00O.OooO0OO(constraintLayout);
        OooOOOO().f34388OooO0O0.setOnClickListener(new g(this, 0));
        OooOOOO().f34389OooO0OO.setOnClickListener(new h(this, 0));
        OooOOOO().f34390OooO0Oo.setOnItemSelectListener(this);
        OooOOOO().f34392OooO0o0.setOnItemSelectListener(this);
        OooOOOO().f34391OooO0o.setOnItemSelectListener(this);
    }

    @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
    @NotNull
    public final String OooO00o(int i, int i2) {
        if (i2 != 2) {
            String strValueOf = String.valueOf(i);
            if (strValueOf.length() > 1) {
                return strValueOf;
            }
            return '0' + strValueOf;
        }
        k kVar = this.f34654OooOOOo.get(i);
        Intrinsics.checkNotNullExpressionValue(kVar, "mYearMonthDayList[date]");
        k kVar2 = kVar;
        int[] iArr = this.f34655OooOOo;
        if (iArr[0] == kVar2.f34657OooO00o && iArr[1] == kVar2.f34658OooO0O0 && iArr[2] == kVar2.f34659OooO0OO) {
            return this.f34647OooO0oo;
        }
        ArrayList<String> monthList = this.f34646OooO0oO;
        boolean z = this.f34652OooOOO0;
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        if (z) {
            return monthList.get(kVar2.f34658OooO0O0) + ' ' + kVar2.f34659OooO0OO;
        }
        return kVar2.f34659OooO0OO + ' ' + monthList.get(kVar2.f34658OooO0O0);
    }

    @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
    public final void OooO0O0(int i, int i2, int i3) {
        if (i3 == 2) {
            this.f34651OooOOO[0] = this.f34654OooOOOo.get(i2).f34657OooO00o;
            this.f34651OooOOO[1] = this.f34654OooOOOo.get(i2).f34658OooO0O0;
            this.f34651OooOOO[2] = this.f34654OooOOOo.get(i2).f34659OooO0OO;
        } else if (i3 == 3) {
            this.f34651OooOOO[3] = i;
        } else if (i3 == 4) {
            this.f34651OooOOO[4] = i;
        }
        if (!this.f34645OooO) {
            f fVar = f.f34635OooO00o;
            long j = 1000;
            long jOooO0O0 = f.OooO0O0(this.f34651OooOOO) / j;
            long j2 = this.f34649OooOO0O;
            if (jOooO0O0 - (j2 / j) < 0) {
                int[] iArrOooO00o = f.OooO00o(j2);
                OooOOO(iArrOooO00o[2], iArrOooO00o[3], iArrOooO00o[4]);
                return;
            }
            long j3 = this.f34650OooOO0o;
            if (jOooO0O0 - (j3 / j) > 0) {
                int[] iArrOooO00o2 = f.OooO00o(j3);
                OooOOO(iArrOooO00o2[2], iArrOooO00o2[3], iArrOooO00o2[4]);
                return;
            }
            return;
        }
        f fVar2 = f.f34635OooO00o;
        long jOooO0O1 = f.OooO0O0(this.f34651OooOOO);
        long j4 = this.f34649OooOO0O;
        long j5 = (jOooO0O1 - j4) / ((long) 1000);
        int i4 = this.f34653OooOOOO;
        if (j5 <= i4 / 1000) {
            long j6 = j4 + ((long) i4);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j6);
            calendar.add(12, 5 - (calendar.get(12) % 5));
            calendar.set(13, 0);
            int[] iArr = new int[3];
            for (int i5 = 0; i5 < 3; i5++) {
                iArr[i5] = 0;
            }
            iArr[0] = calendar.get(5);
            iArr[1] = calendar.get(11);
            iArr[2] = calendar.get(12);
            OooOOO(iArr[0], iArr[1], iArr[2]);
        }
    }

    public final void OooOOO(int i, int i2, int i3) {
        int i4 = 0;
        for (k kVar : this.f34654OooOOOo) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (kVar.f34659OooO0OO == i) {
                OooOOOO().f34390OooO0Oo.OooO0o0(i4);
                this.f34651OooOOO[0] = this.f34654OooOOOo.get(i4).f34657OooO00o;
                this.f34651OooOOO[1] = this.f34654OooOOOo.get(i4).f34658OooO0O0;
                this.f34651OooOOO[2] = this.f34654OooOOOo.get(i4).f34659OooO0OO;
            }
            i4 = i5;
        }
        OooOOOO().f34392OooO0o0.OooO0o0(i2);
        this.f34651OooOOO[3] = i2;
        OooOOOO().f34391OooO0o.OooO0o0(i3 / 5);
        this.f34651OooOOO[4] = i3;
    }

    public final o00Oo00 OooOOOO() {
        return (o00Oo00) this.f34648OooOO0.getValue();
    }

    public final void OooOOOo() {
        ArrayList arrayList = new ArrayList(24);
        for (int i = 0; i < 24; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        DateScrollView dateScrollView = OooOOOO().f34392OooO0o0;
        Intrinsics.checkNotNullExpressionValue(dateScrollView, "mBinding.dateHour");
        DateScrollView.OooO0Oo(dateScrollView, arrayList);
    }

    public final void OooOOo(@NotNull Calendar calendar, @Nullable Calendar calendar2) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        int i = 6;
        if (this.f34645OooO) {
            Calendar calendar3 = Calendar.getInstance();
            this.f34649OooOO0O = calendar3.getTimeInMillis();
            ArrayList arrayList = new ArrayList();
            int[] iArr = this.f34651OooOOO;
            if (iArr[3] > 22 || (iArr[3] == 22 && iArr[4] >= 55)) {
                calendar3.add(6, 1);
            }
            for (int i2 = 0; i2 < 7; i2++) {
                if (i2 != 0) {
                    calendar3.add(6, 1);
                }
                this.f34654OooOOOo.add(new k(calendar3.get(1), calendar3.get(2), calendar3.get(5)));
                arrayList.add(Integer.valueOf(i2));
            }
            DateScrollView dateScrollView = OooOOOO().f34390OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(dateScrollView, "mBinding.dateDay");
            DateScrollView.OooO0Oo(dateScrollView, arrayList);
            OooOOOo();
            OooOOo0();
        } else {
            if (calendar2 != null) {
                f fVar = f.f34635OooO00o;
                this.f34649OooOO0O = f.OooO0OO(calendar2.getTimeInMillis(), 0, 5);
                this.f34650OooOO0o = f.OooO0OO(calendar2.getTimeInMillis(), 24, 0);
            }
            ArrayList arrayList2 = new ArrayList();
            f fVar2 = f.f34635OooO00o;
            long j = this.f34649OooOO0O;
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTimeInMillis(j);
            Pair pair = new Pair(calendar4, new int[]{calendar4.get(1), calendar4.get(2), calendar4.get(5), calendar4.get(11), calendar4.get(12), calendar4.get(13)});
            int i3 = ((int[]) pair.getSecond())[3];
            int i4 = ((int[]) pair.getSecond())[4];
            if (i3 == 0 && i4 == 0) {
                this.f34654OooOOOo.add(new k(((Calendar) pair.getFirst()).get(1), ((Calendar) pair.getFirst()).get(2), ((Calendar) pair.getFirst()).get(5)));
                arrayList2.add(0);
            } else {
                int i5 = 0;
                int i6 = 0;
                while (i5 < 2) {
                    if (i6 != 0) {
                        ((Calendar) pair.getFirst()).add(i, 1);
                    }
                    this.f34654OooOOOo.add(new k(((Calendar) pair.getFirst()).get(1), ((Calendar) pair.getFirst()).get(2), ((Calendar) pair.getFirst()).get(5)));
                    arrayList2.add(Integer.valueOf(i6));
                    i6++;
                    i5++;
                    i = 6;
                }
            }
            DateScrollView dateScrollView2 = OooOOOO().f34390OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(dateScrollView2, "mBinding.dateDay");
            DateScrollView.OooO0Oo(dateScrollView2, arrayList2);
            OooOOOo();
            OooOOo0();
        }
        int i7 = calendar.get(1);
        int i8 = calendar.get(2);
        int i9 = calendar.get(5);
        int i10 = calendar.get(11);
        int i11 = calendar.get(12);
        int i12 = calendar.get(13);
        int[] iArr2 = this.f34651OooOOO;
        iArr2[0] = i7;
        iArr2[1] = i8;
        iArr2[2] = i9;
        iArr2[3] = i10;
        iArr2[4] = i11;
        iArr2[5] = i12;
        OooOOO(i9, i10, i11);
    }

    public final void OooOOo0() {
        ArrayList arrayList = new ArrayList(12);
        for (int i = 0; i < 12; i++) {
            arrayList.add(Integer.valueOf(i * 5));
        }
        DateScrollView dateScrollView = OooOOOO().f34391OooO0o;
        Intrinsics.checkNotNullExpressionValue(dateScrollView, "mBinding.dateMin");
        DateScrollView.OooO0Oo(dateScrollView, arrayList);
    }
}
