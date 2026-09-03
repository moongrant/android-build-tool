package com.code.android.yldialog.timechoose;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.easydialog.WindowAnim;
import com.code.android.util.o000O0Oo;
import com.code.android.yldialog.timechoose.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.Oooo0;
import p159o00OoOOo.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nChooseIntervalTimeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseIntervalTimeDialog.kt\ncom/code/android/yldialog/timechoose/ChooseIntervalTimeDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,142:1\n23#2:143\n*S KotlinDebug\n*F\n+ 1 ChooseIntervalTimeDialog.kt\ncom/code/android/yldialog/timechoose/ChooseIntervalTimeDialog\n*L\n19#1:143\n*E\n"})
public final class OooO00o extends Oooo0<OooO00o> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Integer f10466OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f10467OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Integer f10468OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f10469OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f10470OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f10471OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> f10472OooOOO0;

    /* JADX INFO: renamed from: com.code.android.yldialog.timechoose.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0183OooO00o implements DateScrollView.OooO0O0 {
        public C0183OooO00o() {
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
        @NotNull
        public final String OooO00o(int i, int i2) {
            return String.valueOf(i);
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
        public final void OooO0O0(int i, int i2, int i3) {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f10469OooOO0 = i;
            OooO00o.OooOOO0(oooO00o, oooO00o.OooOOO());
        }
    }

    public static final class OooO0O0 implements DateScrollView.OooO0O0 {
        public OooO0O0() {
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
        @NotNull
        public final String OooO00o(int i, int i2) {
            return String.valueOf(i);
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
        public final void OooO0O0(int i, int i2, int i3) {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f10470OooOO0O = i;
            OooO00o.OooOOO0(oooO00o, oooO00o.OooOOO());
        }
    }

    public static final class OooO0OO implements DateScrollView.OooO0O0 {
        public OooO0OO() {
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
        @NotNull
        public final String OooO00o(int i, int i2) {
            return String.valueOf(i);
        }

        @Override // com.code.android.yldialog.timechoose.DateScrollView.OooO0O0
        public final void OooO0O0(int i, int i2, int i3) {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f10471OooOO0o = i;
            OooO00o.OooOOO0(oooO00o, oooO00o.OooOOO());
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ViewGroup> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return OooO00o.this.f10135OooO0OO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(@NotNull AppCompatActivity activity, @NotNull String cancelString, @NotNull String confirmString) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cancelString, "cancelString");
        Intrinsics.checkNotNullParameter(confirmString, "confirmString");
        this.f10467OooO0oO = new o000O0Oo(Reflection.getOrCreateKotlinClass(o0OO00O.class), this.f10133OooO00o, new OooO0o());
        OooOO0O(WindowAnim.BottomWithAlpha);
        OooO0oo();
        OooOOO().f38485OooO0O0.setText(cancelString);
        OooOOO().f38486OooO0OO.setText(confirmString);
        OooOOO().f38485OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o00OoOo0.oo0o0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooO00o this$0 = this.f38513OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
            }
        });
        OooOOO().f38486OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o00OoOo0.o0O0O00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooO00o this$0 = this.f38512OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
                Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3 = this$0.f10472OooOOO0;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(this$0.f10469OooOO0), Integer.valueOf(this$0.f10470OooOO0O), Integer.valueOf(this$0.f10471OooOO0o));
                }
            }
        });
        OooOOO().f38487OooO0Oo.setOnItemSelectListener(new C0183OooO00o());
        OooOOO().f38489OooO0o0.setOnItemSelectListener(new OooO0O0());
        OooOOO().f38488OooO0o.setOnItemSelectListener(new OooO0OO());
    }

    public static final void OooOOO0(OooO00o oooO00o, o0OO00O o0oo00o2) {
        Integer num = oooO00o.f10468OooO0oo;
        if (num == null || oooO00o.f10466OooO == null) {
            return;
        }
        if (oooO00o.f10469OooOO0 <= 0 && oooO00o.f10470OooOO0O <= 0) {
            int i = oooO00o.f10471OooOO0o;
            Intrinsics.checkNotNull(num);
            if (i <= num.intValue()) {
                DateScrollView dateScrollView = o0oo00o2.f38488OooO0o;
                Integer num2 = oooO00o.f10468OooO0oo;
                Intrinsics.checkNotNull(num2);
                dateScrollView.OooO0o0(num2.intValue());
            }
        }
        int i2 = oooO00o.f10469OooOO0;
        Integer num3 = oooO00o.f10466OooO;
        Intrinsics.checkNotNull(num3);
        if (i2 >= num3.intValue()) {
            if (oooO00o.f10470OooOO0O > 0) {
                o0oo00o2.f38489OooO0o0.OooO0o0(0);
                oooO00o.f10470OooOO0O = 0;
            }
            if (oooO00o.f10471OooOO0o > 0) {
                o0oo00o2.f38488OooO0o.OooO0o0(0);
                oooO00o.f10471OooOO0o = 0;
            }
        }
    }

    public final o0OO00O OooOOO() {
        return (o0OO00O) this.f10467OooO0oO.getValue();
    }
}
