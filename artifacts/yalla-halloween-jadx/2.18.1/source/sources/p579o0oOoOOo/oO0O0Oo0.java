package p579o0oOoOOo;

import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p463o0Ooo0o0.o000OO;
import p502o0o00o0.o00000O;
import p544o0o0OoOO.u3;
import p544o0o0OoOO.v3;
import p649o0ooOOoo.r7;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0Oo0 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final long f46058OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final r7 f46059OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0Oo0(@NotNull Context context, long j, long j2) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46058OoooO = j2;
        int i = 1;
        r7 r7VarInflate = r7.inflate(LayoutInflater.from(context), this.f41545Oooo0oo, true);
        Intrinsics.checkNotNullExpressionValue(r7VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f46059OoooOO0 = r7VarInflate;
        r7VarInflate.f50428OooO0o0.setText(String.valueOf(j));
        r7VarInflate.f50425OooO0OO.setFilters(new InputFilter[]{new o000OO(), new InputFilter.LengthFilter(150)});
        r7VarInflate.f50427OooO0o.setText(r7VarInflate.f50425OooO0OO.getText().length() + "/150");
        EditText editText = r7VarInflate.f50425OooO0OO;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etReason");
        editText.addTextChangedListener(new oO0O0O00(this));
        r7VarInflate.f50424OooO0O0.setOnClickListener(new v3(this, i));
        OooO(new oOo0oooO(this));
        r7VarInflate.f50426OooO0Oo.setOnClickListener(new u3(this, i));
    }
}
