package com.google.android.material.datepicker;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.text.Typography;
import o000O00O.o00;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO0o extends com.google.android.material.internal.oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0OO f16413OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16414OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CalendarConstraints f16415OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DateFormat f16416OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f16417OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00 f16418OooO0oo;

    public OooO0o(String str, SimpleDateFormat simpleDateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f16416OooO0o0 = simpleDateFormat;
        this.f16414OooO0Oo = textInputLayout;
        this.f16415OooO0o = calendarConstraints;
        this.f16417OooO0oO = textInputLayout.getContext().getString(o0000O0.mtrl_picker_out_of_range);
        this.f16418OooO0oo = new o00(1, this, str);
    }

    public abstract void OooO00o();

    public abstract void OooO0O0(@Nullable Long l);

    /* JADX WARN: Code duplicated, block: B:13:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.material.datepicker.OooO0OO, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.internal.oo000o, android.text.TextWatcher
    public final void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.f16415OooO0o;
        TextInputLayout textInputLayout = this.f16414OooO0Oo;
        o00 o00Var = this.f16418OooO0oo;
        textInputLayout.removeCallbacks(o00Var);
        textInputLayout.removeCallbacks(this.f16413OooO);
        textInputLayout.setError(null);
        OooO0O0(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.f16416OooO0o0.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (calendarConstraints.f16333OooO0o.OoooO00(time)) {
                Calendar calendarOooO0Oo = o0000.OooO0Oo(calendarConstraints.f16332OooO0Oo.f16385OooO0Oo);
                boolean z = true;
                calendarOooO0Oo.set(5, 1);
                if (calendarOooO0Oo.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f16334OooO0o0;
                    int i4 = month.f16389OooO0oo;
                    Calendar calendarOooO0Oo2 = o0000.OooO0Oo(month.f16385OooO0Oo);
                    calendarOooO0Oo2.set(5, i4);
                    if (time > calendarOooO0Oo2.getTimeInMillis()) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    OooO0O0(Long.valueOf(date.getTime()));
                    return;
                }
            }
            ?? r10 = new Runnable() { // from class: com.google.android.material.datepicker.OooO0OO
                @Override // java.lang.Runnable
                public final void run() {
                    OooO0o oooO0o = this.f16411OooO0Oo;
                    oooO0o.getClass();
                    oooO0o.f16414OooO0Oo.setError(String.format(oooO0o.f16417OooO0oO, OooOO0O.OooO0O0(time).replace(' ', Typography.nbsp)));
                    oooO0o.OooO00o();
                }
            };
            this.f16413OooO = r10;
            textInputLayout.postDelayed(r10, 1000L);
        } catch (ParseException unused) {
            textInputLayout.postDelayed(o00Var, 1000L);
        }
    }
}
