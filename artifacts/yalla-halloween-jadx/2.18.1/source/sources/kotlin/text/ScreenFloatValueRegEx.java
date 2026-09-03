package kotlin.text;

import OooO0o.OooO0OO;
import Oooo000.o00oO0o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class ScreenFloatValueRegEx {

    @NotNull
    public static final ScreenFloatValueRegEx INSTANCE = new ScreenFloatValueRegEx();

    @JvmField
    @NotNull
    public static final Regex value;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        OooO0O0.OooO0O0.OooO00o(sb, "[eE][+-]?(\\p{Digit}+)", ")?)|(\\.(", "(\\p{Digit}+)", ")(");
        OooO0O0.OooO0O0.OooO00o(sb, "[eE][+-]?(\\p{Digit}+)", ")?)|((", "(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))", ")[pP][+-]?");
        value = new Regex(OooO0OO.OooO00o("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", o00oO0o.OooO0O0(sb, "(\\p{Digit}+)", ')'), ")[fFdD]?))[\\x00-\\x20]*"));
    }

    private ScreenFloatValueRegEx() {
    }
}
