package p258o00ooOOo;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.easydialog.WindowAnim;
import com.code.android.yldialog.timechoose.DateScrollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.o00O00OO;
import p256o00ooOO.o00OOOOo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class d extends o00O00OO<d> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Integer f34622OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O000o f34623OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Integer f34624OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34625OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f34626OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f34627OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> f34628OooOOO0;

    public static final class OooO00o implements DateScrollView.OooO0OO {
        public OooO00o() {
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
        @NotNull
        public final String OooO00o(int i, int i2) {
            return String.valueOf(i);
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
        public final void OooO0O0(int i, int i2, int i3) {
            d dVar = d.this;
            dVar.f34625OooOO0 = i;
            d.OooOOO(dVar, dVar.OooOOOO());
        }
    }

    public static final class OooO0O0 implements DateScrollView.OooO0OO {
        public OooO0O0() {
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
        @NotNull
        public final String OooO00o(int i, int i2) {
            return String.valueOf(i);
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
        public final void OooO0O0(int i, int i2, int i3) {
            d dVar = d.this;
            dVar.f34626OooOO0O = i;
            d.OooOOO(dVar, dVar.OooOOOO());
        }
    }

    public static final class OooO0OO implements DateScrollView.OooO0OO {
        public OooO0OO() {
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
        @NotNull
        public final String OooO00o(int i, int i2) {
            return String.valueOf(i);
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0OO
        public final void OooO0O0(int i, int i2, int i3) {
            d dVar = d.this;
            dVar.f34627OooOO0o = i;
            d.OooOOO(dVar, dVar.OooOOOO());
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ViewGroup> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return d.this.f34201OooO0OO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull AppCompatActivity activity, @NotNull String cancelString, @NotNull String confirmString) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cancelString, "cancelString");
        Intrinsics.checkNotNullParameter(confirmString, "confirmString");
        this.f34623OooO0oO = new o00O000o(Reflection.getOrCreateKotlinClass(o00OOOOo.class), this.f34199OooO00o, new OooO0o());
        OooOO0o(WindowAnim.BottomWithAlpha);
        OooO();
        OooOOOO().f34381OooO0O0.setText(cancelString);
        OooOOOO().f34382OooO0OO.setText(confirmString);
        OooOOOO().f34381OooO0O0.setOnClickListener(new c(this, 0));
        OooOOOO().f34382OooO0OO.setOnClickListener(new p143o00OOooo.o00O00OO(this, 1));
        OooOOOO().f34383OooO0Oo.setOnItemSelectListener(new OooO00o());
        OooOOOO().f34385OooO0o0.setOnItemSelectListener(new OooO0O0());
        OooOOOO().f34384OooO0o.setOnItemSelectListener(new OooO0OO());
    }

    public static final void OooOOO(d dVar, o00OOOOo o00ooooo2) {
        Integer num = dVar.f34624OooO0oo;
        if (num == null || dVar.f34622OooO == null) {
            return;
        }
        if (dVar.f34625OooOO0 <= 0 && dVar.f34626OooOO0O <= 0) {
            int i = dVar.f34627OooOO0o;
            Intrinsics.checkNotNull(num);
            if (i <= num.intValue()) {
                DateScrollView dateScrollView = o00ooooo2.f34384OooO0o;
                Integer num2 = dVar.f34624OooO0oo;
                Intrinsics.checkNotNull(num2);
                dateScrollView.OooO0o0(num2.intValue());
            }
        }
        int i2 = dVar.f34625OooOO0;
        Integer num3 = dVar.f34622OooO;
        Intrinsics.checkNotNull(num3);
        if (i2 >= num3.intValue()) {
            if (dVar.f34626OooOO0O > 0) {
                o00ooooo2.f34385OooO0o0.OooO0o0(0);
                dVar.f34626OooOO0O = 0;
            }
            if (dVar.f34627OooOO0o > 0) {
                o00ooooo2.f34384OooO0o.OooO0o0(0);
                dVar.f34627OooOO0o = 0;
            }
        }
    }

    public final o00OOOOo OooOOOO() {
        return (o00OOOOo) this.f34623OooO0oO.getValue();
    }
}
