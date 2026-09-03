package p049Ooooooo;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000 f4211OooO00o = new o0O000();

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final CharSequence OooO(@NotNull AutofillValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        CharSequence textValue = value.getTextValue();
        Intrinsics.checkNotNullExpressionValue(textValue, "value.textValue");
        return textValue;
    }

    @DoNotInline
    @RequiresApi(26)
    @Nullable
    public final AutofillId OooO00o(@NotNull ViewStructure structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.getAutofillId();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean OooO0O0(@NotNull AutofillValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.isDate();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean OooO0OO(@NotNull AutofillValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.isList();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean OooO0Oo(@NotNull AutofillValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.isText();
    }

    @DoNotInline
    @RequiresApi(26)
    public final void OooO0o(@NotNull ViewStructure structure, @NotNull String[] hints) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        Intrinsics.checkNotNullParameter(hints, "hints");
        structure.setAutofillHints(hints);
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean OooO0o0(@NotNull AutofillValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.isToggle();
    }

    @DoNotInline
    @RequiresApi(26)
    public final void OooO0oO(@NotNull ViewStructure structure, @NotNull AutofillId parent, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        Intrinsics.checkNotNullParameter(parent, "parent");
        structure.setAutofillId(parent, i);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void OooO0oo(@NotNull ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setAutofillType(i);
    }
}
